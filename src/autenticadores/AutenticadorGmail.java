package autenticadores;

import db.GmailDatabase;
import db.Usuario;
import exception.AutenticadorException;
import interfaces.Autenticador;
import service.Credenciais;

import java.util.List;

public class AutenticadorGmail implements Autenticador {

    @Override
    public void autenticar(Credenciais credenciais) {
        /**
         * 1. Validar se o login possui @gmail, senão possuir lançar
         * AutenticadorException 2. Validar se composição da senha está correta, senão
         * estiver, lançar AutenticadorException 3. Validar se login existe no sistema,
         * senão, lançar AutenticadorException 4. Validar se a senha passada é igual a
         * senha armazenada, senão, lançar AutenticadorException
         */

        Usuario usuarioEncontrado = validarUsuario(credenciais.usuario());
        validarSenha(usuarioEncontrado, credenciais.senha());

    }

    private Usuario validarUsuario(String login) {
        if (!login.contains("@gmail"))
            throw new AutenticadorException("Usuário ou senha inválidos");

        List<Usuario> usuarios = GmailDatabase.getUsuarios();
        return usuarios.stream().filter(usuario -> usuario.login().equals(login)).findFirst()
                .orElseThrow(() -> new AutenticadorException("Usuário ou senha inválidos"));
    }

    private void validarSenha(Usuario usuario, String senha) {
        if (senha.length() < 8)
            throw new AutenticadorException("Usuário ou senha inválidos");

        if (!usuario.senha().equals(senha)) {
            throw new AutenticadorException("Usuário ou senha inválidos");
        }
    }
}

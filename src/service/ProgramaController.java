package service;

import autenticadores.AutenticadorGmail;
import interfaces.Autenticador;

public class ProgramaController {
    Autenticador autenticador = new AutenticadorGmail();

    public void autenticar(Credenciais credenciais) {
	autenticador.autenticar(credenciais);
    }

}

package gui;

import service.Credenciais;
import service.ProgramaController;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        ProgramaController controller = new ProgramaController();

        Scanner input = new Scanner(System.in);

        System.out.println("Login: ");
        String usuario = input.next();

        System.out.println("Senha: ");
        String senha = input.next();

        controller.autenticar(new Credenciais(usuario, senha));

        input.close();
    }
}

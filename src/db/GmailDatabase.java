package db;

import java.util.ArrayList;
import java.util.List;

public class GmailDatabase {

    private static List<Usuario> usuarios = new ArrayList<>();

    static {
        usuarios.add(new Usuario("Edson", "edson@gmail.com", "12345678"));
    }

    public static List<Usuario> getUsuarios() {
        return usuarios;
    }
}

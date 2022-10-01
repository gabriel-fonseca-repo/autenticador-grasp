package db;

import java.util.ArrayList;
import java.util.List;

public class HotmailDatabase {

    private static List<Usuario> usuarios = new ArrayList<>();

    static {
        usuarios.add(new Usuario("Gabriel", "gabriel@hotmail.com", "123456789"));
    }

    public static List<Usuario> getUsuarios() {
        return usuarios;
    }
}

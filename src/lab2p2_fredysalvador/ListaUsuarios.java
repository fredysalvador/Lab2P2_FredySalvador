/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_fredysalvador;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fredy Salvador
 */
public class ListaUsuarios {
     private static List<Usuario> usuarios = new ArrayList<>();

    static {
        usuarios.add(new Usuario("usuario1", "123456", false));
        usuarios.add(new Usuario("usuario2", "abcdef", false));
        usuarios.add(new Usuario("admin", "admin", true));
    }

    public static List<Usuario> getUsuarios() {
        return usuarios;
    }
}

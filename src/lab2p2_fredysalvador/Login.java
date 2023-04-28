/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_fredysalvador;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Fredy Salvador
 */
public class Login {
    private static Scanner scanner = new Scanner(System.in);

    public static Usuario iniciarSesion() {
        System.out.println("1-usuario:admin,contraseña:admin");
        System.out.println("2-usuario:usuario1,contraseña:123456");
        System.out.println("Ingrese su nombre de usuario:");
        String nombreUsuario = scanner.nextLine();
        System.out.println("Ingrese su contraseña:");
        String contrasena = scanner.nextLine();

        List<Usuario> usuarios = ListaUsuarios.getUsuarios();
        for (Usuario usuario : usuarios) {
            if (usuario.getNombreUsuario().equals(nombreUsuario) && usuario.getContrasena().equals(contrasena)) {
                return usuario;
            }
        }

        return null;
    }
}

        
    



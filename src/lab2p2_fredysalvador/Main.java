/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p2_fredysalvador;

import java.util.Scanner;

/**
 *
 * @author Fredy Salvador
 */
public class Main {

    /**
      @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        Usuario usuario = Login.iniciarSesion();

        if (usuario == null) {
            System.out.println("Nombre de usuario o contraseña incorrectos");
        } else {
            System.out.println("Bienvenido, " + usuario.getNombreUsuario());

            if (usuario.isEsAdmin()) {
            int opcion = 0;    
            
            while (opcion !=  5){    
                System.out.println("1-Escrito\n2-Pintura\n3-Escultura\n4-Fotografia\n5-Salir");
                opcion = leer.nextInt();
                
            if (opcion == 1){
            System.out.println("Escrito");
            
            
            }else if (opcion == 2){
            System.out.println("Pintura");
            
            
            }else if(opcion == 3){
            System.out.println("Escultura");
            
            
            }else if (opcion == 4){
            System.out.println("Fotografias");
            
            
            }else if (opcion == 5){
            System.out.println("Gracias por usar el Sistema!");
            
            }
            
            }
            
            
            } else {
                // Aquí solamente se permite listar los elementos del CRUD
                 System.out.println("Es el Pero usuario");
            }

        
        
    }
    }
}

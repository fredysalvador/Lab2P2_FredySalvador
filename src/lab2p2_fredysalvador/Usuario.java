/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_fredysalvador;

/**
 *
 * @author Fredy Salvador
 */
public class Usuario {
      private String nombreUsuario;
    private String contrasena;
    private boolean esAdmin;

    public Usuario(String nombreUsuario, String contrasena, boolean esAdmin) {
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
        this.esAdmin = esAdmin;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public boolean isEsAdmin() {
        return esAdmin;
    }

    public void setEsAdmin(boolean esAdmin) {
        this.esAdmin = esAdmin;
    } 
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_fredysalvador;

/**
 *
 * @author Fredy Salvador
 */
public class Escrito {
    private int totalPalabras;
    private String epoca;
    private String generoLiterario;

    public int getTotalPalabras() {
        return totalPalabras;
    }

    public void setTotalPalabras(int totalPalabras) {
        this.totalPalabras = totalPalabras;
    }

    public String getEpoca() {
        return epoca;
    }

    public void setEpoca(String epoca) {
        this.epoca = epoca;
    }

    public String getGeneroLiterario() {
        return generoLiterario;
    }

    public void setGeneroLiterario(String generoLiterario) {
        this.generoLiterario = generoLiterario;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    private String autor;

    public Escrito(int totalPalabras, String epoca, String generoLiterario, String autor) {
        this.totalPalabras = totalPalabras;
        this.epoca = epoca;
        this.generoLiterario = generoLiterario;
        this.autor = autor;
    }

}

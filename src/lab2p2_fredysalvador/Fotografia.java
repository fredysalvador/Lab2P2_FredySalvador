/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_fredysalvador;

/**
 *
 * @author Fredy Salvador
 */
public class Fotografia {
    private int dimensionAncho;
    private int dimensionAlto;

    public int getDimensionAncho() {
        return dimensionAncho;
    }

    public void setDimensionAncho(int dimensionAncho) {
        this.dimensionAncho = dimensionAncho;
    }

    public int getDimensionAlto() {
        return dimensionAlto;
    }

    public void setDimensionAlto(int dimensionAlto) {
        this.dimensionAlto = dimensionAlto;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isEnColor() {
        return enColor;
    }

    public void setEnColor(boolean enColor) {
        this.enColor = enColor;
    }
    private int resolucion;
    private boolean enColor;

    public Fotografia(int dimensionAncho, int dimensionAlto, int resolucion, boolean enColor) {
        this.dimensionAncho = dimensionAncho;
        this.dimensionAlto = dimensionAlto;
        this.resolucion = resolucion;
        this.enColor = enColor;
    }

}

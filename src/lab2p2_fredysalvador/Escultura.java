/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_fredysalvador;

/**
 *
 * @author Fredy Salvador
 */
public class Escultura {
    private String escultor;
    private String material;
    private int anoEscultura;
    private String departamento;

    public Escultura(String escultor, String material, int anoEscultura, String departamento) {
        this.escultor = escultor;
        this.material = material;
        this.anoEscultura = anoEscultura;
        this.departamento = departamento;
    }

    public String getEscultor() {
        return escultor;
    }

    public void setEscultor(String escultor) {
        this.escultor = escultor;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getAnoEscultura() {
        return anoEscultura;
    }

    public void setAnoEscultura(int anoEscultura) {
        this.anoEscultura = anoEscultura;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}

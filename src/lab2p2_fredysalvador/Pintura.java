/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_fredysalvador;

import java.time.LocalDate;

/**
 *
 * @author Fredy Salvador
 */
public class Pintura {
    private String nombre;
    private String autor;
    private LocalDate fechaPresentacion;
    private LocalDate fechaAdquisicion;
    private boolean enExposicion;

    public Pintura(String nombre, String autor, LocalDate fechaPresentacion,
                   LocalDate fechaAdquisicion, boolean enExposicion) {
        this.nombre = nombre;
        this.autor = autor;
        this.fechaPresentacion = fechaPresentacion;
        this.fechaAdquisicion = fechaAdquisicion;
        this.enExposicion = enExposicion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public LocalDate getFechaPresentacion() {
        return fechaPresentacion;
    }

    public void setFechaPresentacion(LocalDate fechaPresentacion) {
        this.fechaPresentacion = fechaPresentacion;
    }

    public LocalDate getFechaAdquisicion() {
        return fechaAdquisicion;
    }

    public void setFechaAdquisicion(LocalDate fechaAdquisicion) {
        this.fechaAdquisicion = fechaAdquisicion;
    }

    public boolean isEnExposicion() {
        return enExposicion;
    }

    public void setEnExposicion(boolean enExposicion) {
        this.enExposicion = enExposicion;
    }
}

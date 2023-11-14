package org.example.Entidad;

import org.example.Enums.Area;

public class Operador {
    private long id;
    private String nombre;
    private String apellido;
    private Area area;

    public Operador() {
    }

    public Operador(String nombre, String apellido, Area area) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.area = area;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }
}

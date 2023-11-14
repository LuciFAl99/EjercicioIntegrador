package org.example.Entidad;

import org.example.Enums.Area;

public class Tecnico {
    private long id;
    private String nombre;
    private String apellido;
    private Area area;
    private boolean disponible;

    public Tecnico(){}
    public Tecnico(String nombre, String apellido, Area area, boolean disponible){
        this.nombre = nombre;
        this.apellido = apellido;
        this.area = area;
        this.disponible = disponible;
    }
    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido(){
        return this.apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public Area getArea(){
        return this.area;
    }
    public void setArea(Area area){
        this.area = area;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}


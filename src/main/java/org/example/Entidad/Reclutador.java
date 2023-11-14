package org.example.Entidad;

import org.example.Enums.Area;

public class Reclutador {
    private long id;
    private String nombre;
    private String apellido;
    private Area area;
    private String reportes;
    public Reclutador(){}
    public Reclutador(String nombre, String apellido, Area area, String reportes){
        this.nombre = nombre;
        this.apellido = apellido;
        this.area = area;
        this.reportes = reportes;
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

    public String getReportes() {
        return reportes;
    }

    public void setReportes(String reportes) {
        this.reportes = reportes;
    }
}

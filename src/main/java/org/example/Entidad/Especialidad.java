package org.example.Entidad;

public class Especialidad {
    String nombreEspecialidad;

    public Especialidad(){}
    public Especialidad(String nombreEspecialidad){
        this.nombreEspecialidad = nombreEspecialidad;
    }
    public String getNombreEspecialidad(){
        return nombreEspecialidad;
    }
    public void setNombreEspecialidad(String nombreEspecialidad){
        this.nombreEspecialidad = nombreEspecialidad;
    }
}

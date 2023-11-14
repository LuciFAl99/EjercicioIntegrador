package org.example.Entidad;

import org.example.Enums.Estado;
import org.example.Enums.TipoProblema;

import java.sql.Time;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Incidente {
    private String nombreIncidente;
    private List<Time> tiempoResolucion;
    private LocalDate fechaPosibleResolucion;
    private String descripcionProblema;
    private TipoProblema tipoProblema;
    private Estado estado;
    private boolean complejo;

    public Incidente() {
        this.tiempoResolucion = new ArrayList<>();
    }

    public Incidente(String nombreIncidente, List<Time> tiempoResolucion, LocalDate fechaPosibleResolucion, String descripcionProblema, TipoProblema tipoProblema, Estado estado, boolean complejo) {
        this.nombreIncidente = nombreIncidente;
        this.tiempoResolucion = tiempoResolucion;
        this.fechaPosibleResolucion = fechaPosibleResolucion;
        this.descripcionProblema = descripcionProblema;
        this.tipoProblema = tipoProblema;
        this.estado = estado;
        this.complejo = complejo;
    }

    public String getNombreIncidente() {
        return nombreIncidente;
    }

    public void setNombreIncidente(String nombreIncidente) {
        this.nombreIncidente = nombreIncidente;
    }

    public List<Time> getTiempoResolucion() {
        return tiempoResolucion;
    }

    public void setTiempoResolucion(List<Time> tiempoResolucion) {
        this.tiempoResolucion = tiempoResolucion;
    }

    public LocalDate getFechaPosibleResolucion() {
        return fechaPosibleResolucion;
    }

    public void setFechaPosibleResolucion(LocalDate fechaPosibleResolucion) {
        this.fechaPosibleResolucion = fechaPosibleResolucion;
    }

    public String getDescripcionProblema() {
        return descripcionProblema;
    }

    public void setDescripcionProblema(String descripcionProblema) {
        this.descripcionProblema = descripcionProblema;
    }

    public TipoProblema getTipoProblema() {
        return tipoProblema;
    }

    public void setTipoProblema(TipoProblema tipoProblema) {
        this.tipoProblema = tipoProblema;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public boolean isComplejo() {
        return complejo;
    }

    public void setComplejo(boolean complejo) {
        this.complejo = complejo;
    }
}

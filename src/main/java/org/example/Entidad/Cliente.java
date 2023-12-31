package org.example.Entidad;

public class Cliente {
    private long id;
    private String nombre;
    private String apellido;
    private String email;
    private long cuit;
    private long dni;

    public Cliente() {
    }

    public Cliente(String nombre, String apellido, String email, long cuit, long dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.cuit = cuit;
        this.dni = dni;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getCuit() {
        return cuit;
    }

    public void setCuid(long cuit) {
        this.cuit = cuit;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }
}

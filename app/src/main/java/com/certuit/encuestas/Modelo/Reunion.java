package com.certuit.encuestas.Modelo;

/**
 * Created by ivane on 11/03/16.
 */
public class Reunion {

    private int id;
    private String nombre;
    private String lugar;
    private String inicio;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getInicio() {
        return inicio;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    public Reunion(int id, String nombre, String lugar, String inicio) {
        this.id = id;
        this.nombre = nombre;
        this.lugar = lugar;
        this.inicio = inicio;
    }
}

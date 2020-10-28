package com.example.reciclerview;

public class equipoFutbol {
    private String nombre_equipo;
    private String estadio;
    private String entrenador;

    public equipoFutbol(String nombre, String estadio, String entrenador) {
        this.setNombre_equipo(nombre);
        this.setEstadio(estadio);
        this.setEntrenador(entrenador);
    }


    public String getNombre_equipo() {
        return nombre_equipo;
    }

    public void setNombre_equipo(String nombre_equipo) {
        this.nombre_equipo = nombre_equipo;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public String getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(String entrenador) {
        this.entrenador = entrenador;
    }
}


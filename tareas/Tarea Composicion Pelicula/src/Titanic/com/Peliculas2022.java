/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Titanic.com;

import tarea.composicion.pelicula.Actor;
import tarea.composicion.pelicula.Director;
import tarea.composicion.pelicula.Productora;

/**
 *
 * @author davideliseo
 */
public class Peliculas2022 {
    private String genero;
    private String clasificacion;
    private Actor Nombre;
    private Director Apodo;
    private Productora Genero;

    public Peliculas2022() {
    }

    public Peliculas2022(String genero, String clasificacion, Actor Nombre, Director Apodo, Productora Genero) {
        this.genero = genero;
        this.clasificacion = clasificacion;
        this.Nombre = Nombre;
        this.Apodo = Apodo;
        this.Genero = Genero;
    }

    public Productora getGenero() {
        return Genero;
    }

    public void setGenero(Productora Genero) {
        this.Genero = Genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public Actor getNombre() {
        return Nombre;
    }

    public void setNombre(Actor Nombre) {
        this.Nombre = Nombre;
    }

    public Director getApodo() {
        return Apodo;
    }

    public void setApodo(Director Apodo) {
        this.Apodo = Apodo;
    }

    @Override
    public String toString() {
        return "Peliculas2022{" + "genero=" + genero + ", clasificacion=" + clasificacion + ", Nombre=" + Nombre + ", Apodo=" + Apodo + ", Genero=" + Genero + '}';
    }
    
    
    
    
}

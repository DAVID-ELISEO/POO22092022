/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea.composicion.pelicula;

/**
 *
 * @author davideliseo
 */
public class Director {
    private String nombre;
    private String apodo;

    public Director() {
    }

    public Director(String nombre, String apodo) {
        this.nombre = nombre;
        this.apodo = apodo;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Director{" + "nombre=" + nombre + ", apodo=" + apodo + '}';
    }
    
    
    
}

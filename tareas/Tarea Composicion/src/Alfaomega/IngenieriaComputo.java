/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Alfaomega;

import ico.fes.atributos.Autor;
import ico.fes.atributos.Editorial;

/**
 *
 * @author davideliseo
 */
public class IngenieriaComputo {
    private String Libros;
    private String Editorial;
    private Autor nombre;
    private Editorial numero;

    public IngenieriaComputo() {
    }

    public IngenieriaComputo(String Libros, String Editorial, Autor nombre, Editorial numero) {
        this.Libros = Libros;
        this.Editorial = Editorial;
        this.nombre = nombre;
        this.numero = numero;
    }

    public Editorial getNumero() {
        return numero;
    }

    public void setNumero(Editorial numero) {
        this.numero = numero;
    }

    public String getLibros() {
        return Libros;
    }

    public void setLibros(String Libros) {
        this.Libros = Libros;
    }

    public String getEditorial() {
        return Editorial;
    }

    public void setEditorial(String Editorial) {
        this.Editorial = Editorial;
    }

    public Autor getNombre() {
        return nombre;
    }

    public void setNombre(Autor nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "IngenieriaComputo{" + "Libros=" + Libros + ", Editorial=" + Editorial + ", nombre=" + nombre + ", numero=" + numero + '}';
    }
    
    
    
}

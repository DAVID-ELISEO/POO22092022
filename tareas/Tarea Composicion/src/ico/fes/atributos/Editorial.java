/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.atributos;

/**
 *
 * @author davideliseo
 */
public class Editorial {
    
  private String Nombre;
  private int Numero;

    public Editorial() {
    }

    public Editorial(String Nombre, int Numero) {
        this.Nombre = Nombre;
        this.Numero = Numero;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    @Override
    public String toString() {
        return "Editorial{" + "Nombre=" + Nombre + ", Numero=" + Numero + '}';
    }
  
  
    
}

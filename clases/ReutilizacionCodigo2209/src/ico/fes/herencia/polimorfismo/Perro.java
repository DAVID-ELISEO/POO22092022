/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.herencia.polimorfismo;

/**
 *
 * @author davideliseo
 */
public class Perro extends Animal{
    private String raza;
    private String Pedigree;

    public Perro() {
    }

    public Perro(String raza, String Pedigree) {
        this.raza = raza;
        this.Pedigree = Pedigree;
    }

    public Perro(String raza, String Pedigree, int numeroPatas) {
        super(numeroPatas);
        this.raza = raza;
        this.Pedigree = Pedigree;
    }

    public String getPedigree() {
        return Pedigree;
    }

    public void setPedigree(String Pedigree) {
        this.Pedigree = Pedigree;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Perro{" + "raza=" + raza + ", Pedigree=" + Pedigree + '}';
    }
    
    @Override
    public void emitirSonido(){
        System.out.println("El perro esta ladrando...Guau!!Guau!!!");
        
        
    }
    
    
}

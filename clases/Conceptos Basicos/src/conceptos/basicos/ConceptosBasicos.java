/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conceptos.basicos;

import ico.fes.Automovil;
import ico.fes.Silla;
import java.awt.Color;

/**
 *
 * @author davideliseo
 */
public class ConceptosBasicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola de nuevo"); 
        Silla s1=new Silla();
        System.out.println("s1");//por defecto se invoca tostring()
        System.out.println("s1,tostring");
        
        
        Automovil miBocho=new Automovil();
        System.out.println("miBocho");
        miBocho.setMarca("VW");
        miBocho.setMarca("Sedan");
        miBocho.setModelo(1970);
        miBocho.setColor(Color.BLUE);
        System.out.println("miBocho");
        
        Automovil miMustang=new Automovil("ford", "Mustang", 2010, Color.yellow);
        System.out.println("miMustang");
        
        Automovil miAkura=new Automovil("Akura", "NSX", 2013, Color.gray);
        
    }
    
}

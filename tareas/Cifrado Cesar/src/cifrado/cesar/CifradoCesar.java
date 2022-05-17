/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cifrado.cesar;

/**
 *
 * @author davideliseo
 */
public class CifradoCesar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String lMayus="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lMInus= "abcdefghijklmnopqrstuvwxyz";
        Cifrado obj= new Cifrado(lMayus, lMInus);
               
        
        System.out.println (Obj.cifrar("TAREA",1));
    }
    
}

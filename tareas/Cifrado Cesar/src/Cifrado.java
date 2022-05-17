
/**
 *
 * @author davideliseo
 */
public class Cifrado {
    private String lMayus;
    private String lMinus;

    public Cifrado(String lMayus, String lMinus) {
        this.lMayus = lMayus;
        this.lMinus = lMinus;
    }
    
    public String cifrar (String texto, int desplazamiento){
        String salida="";
        
        
        for (int i = 0; i < texto.length(); i++) {
            if ((this.lMayus.indexOf(texto.charAt(i)) !=-1) || (this.lMinus.indexOf(texto.charAt(i)) {
             
             salida +=-1 !=this.lMayus.indexOf(texto.charAt(i)) ? :this.lMinus.charAt(this.lMinus.indexOf(texto.charAt(i)) + desplazamiento)%this.lMinus.length());
                
            }else{
                salida +=texto.charAt(i);
                
            }
            
            
        }
        
        return salida;
        
        
        
        
    }
    
    
     public String Descifrar (String texto, int desplazamiento){
        String salida="";
        
        
        for (int i = 0; i < texto.length(); i++) {
            if ((this.lMayus.indexOf(texto.charAt(i)) !=-1) || (this.lMinus.indexOf(texto.charAt(i)) {
                  if (this.lMayus.indexOf(texto.charAt(i)) !=-1)
                           if (this.lMayus.indexOf(texto.charAt(i)<0){
                               salida +=this.lMayus.charAt((this.lMayus.length())+((this.lMayus.indexOf(texto.charAt(i))- desplazamiento) % (this.lMayus.length()));
                               {else{
                                       
                                       
                                       }
                               if (this.lMinus.indexOf(texto.charAt(i)) !=-1)
                           if (this.lMinus.indexOf(texto.charAt(i)<0){
                               salida +=this.lMinus.charAt((this.lMinus.length())+((this.lMinus.indexOf(texto.charAt(i))- desplazamiento) % (this.lMinus.length()));
                               {else{
                               
                           }
                
            }else{
                salida +=texto.charAt(i);
                
            }
            
            
        }
        
        return salida;
    
    
    
    
    
    
    
}

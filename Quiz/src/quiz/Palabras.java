/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package quiz;

/**
 *
 * @author Nerea
 */
public class Palabras {
    
     private String Palabra;

    public Palabras(String Palabra) {
        this.Palabra = Palabra;
    }
    
   //Método que convierte en mayusculas
        public String toUpperCase()
        {
          String salida = "";
        char caracter;
        int numero;

        for (int i = 0; i < this.Valor.length(); i++) {

            caracter = this.Valor.charAt(i);

            if ((caracter >= 97) && (caracter <= 122)) {
                numero = caracter - 32;
                salida += (char) numero;
            } else {
                salida += caracter;
            }
        }
        return salida;
        
        
        }
   
        
    
    
    
    }
    
    
    
    
    



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarealistas;

/**
 *
 * @author Nerea
 */
public class Ejercicio2 {
    private NodoNumeros3 raiz;
    
   public void Insertar(NodoNumeros3 elemento){
        
        NodoNumeros3 nuevo;
        nuevo= new NodoNumeros3();
        nuevo.setRandom(elemento.getRandom());
       
        
        if (raiz==null){
            raiz=nuevo;
        }
        else
        {
            NodoNumeros3 auxiliar=raiz;
            while (auxiliar.getSiguiente()!=null){
                auxiliar=auxiliar.getSiguiente();
            }
            auxiliar.setSiguiente(nuevo);
        }
        
    }
   
   public String Impresion()
   {
       String Impresion=" ";
       
       NodoNumeros3 auxiliar=raiz;
       while(auxiliar!=null){
       Impresion+=auxiliar.getRandom()+" ";
       auxiliar=auxiliar.getSiguiente();
        
   }
       return Impresion;
   }   
   public String Rcuadrado (){
        String cuadrado=" ";
       
       NodoNumeros3 auxiliar=raiz;
       while(auxiliar!=null){
       cuadrado+=auxiliar.getRandom()*auxiliar.getRandom()+" ";
       auxiliar=auxiliar.getSiguiente();
        
   }
       return cuadrado;
   }
}

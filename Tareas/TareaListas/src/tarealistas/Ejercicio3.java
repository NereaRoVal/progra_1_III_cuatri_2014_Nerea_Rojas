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
public class Ejercicio3 {
     private NodoNumeros3 raiz;
    
   public void Insertar(NodoNumeros3 elemento){
        
        NodoNumeros3 nuevo;
        nuevo= new NodoNumeros3();
        nuevo.setNumero3(elemento.getNumero3());
       
        
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
   
   public String Imprimir(){
        String Impresion=" ";
       
       NodoNumeros3 auxiliar=raiz;
       while(auxiliar!=null){
       Impresion+=auxiliar.numero+" ";
       auxiliar=auxiliar.getSiguiente();
        
   }
       return Impresion;
   }
   
   public String negativo(){
       String acum2=" ";
       String acum=" ";
       NodoNumeros3 auxiliar=raiz;
            while(auxiliar!=null){
                if(auxiliar.numero<0){
                    acum+="0"+" ";
                    
                }else{
                    acum+=auxiliar.numero+" ";
                }
                auxiliar=auxiliar.getSiguiente();
                
            }
        return acum;
                
   }
   
}

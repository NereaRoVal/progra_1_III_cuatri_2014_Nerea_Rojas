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
public class Ejercicio1 {
     private NodoNumeros raiz;
    
   public void Insertar(NodoNumeros elemento){
        
        NodoNumeros nuevo;
        nuevo= new NodoNumeros();
        nuevo.setNumero(elemento.getNumero());
       
        
        if (raiz==null){
            raiz=nuevo;
        }
        else
        {
            NodoNumeros auxiliar=raiz;
            while (auxiliar.getSiguiente()!=null){
                auxiliar=auxiliar.getSiguiente();
            }
            auxiliar.setSiguiente(nuevo);
        }
        
    }
   
   public String Imprimir (){
       String Impresion=" ";
       
       NodoNumeros auxiliar=raiz;
       while(auxiliar!=null){
       Impresion+=auxiliar.numero+" ";
       auxiliar=auxiliar.getSiguiente();
        
   }
       return Impresion;
   }
   
   public String Par(){
       String Par=" ", Impar=" ";
      NodoNumeros auxiliar=raiz;
            while(auxiliar!=null){
       if(auxiliar.numero%2==0){
           Par+=auxiliar.numero+" , ";
           auxiliar=auxiliar.getSiguiente();
            }else{
           Impar+=auxiliar.numero+" , ";
           auxiliar=auxiliar.getSiguiente();
       }
   
        
   }
            return "Los numeros pares de la lista son"+Par+"los numeros impares de la lista son"+Impar;
   }
}

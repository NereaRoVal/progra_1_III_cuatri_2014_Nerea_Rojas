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
public class NodoNumeros3 {
    int numero=0;

    public int getNumero3() {
        return numero;
    }

    public void setNumero3(int numero) {
        this.numero = numero;
    }

    public NodoNumeros3 getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoNumeros3 siguiente) {
        this.siguiente = siguiente;
    }
    NodoNumeros3 siguiente;
    
    
    public NodoNumeros3() {
        numero=0;
        siguiente=null;
    }
    public int getRandom() {
        return numero;
    }

    public void setRandom(int numero) {
        this.numero = numero;
    }
}

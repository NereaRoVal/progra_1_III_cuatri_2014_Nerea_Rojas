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
public class NodoNumeros {
    
    int numero=0;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public NodoNumeros getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoNumeros siguiente) {
        this.siguiente = siguiente;
    }
    NodoNumeros siguiente;
    
    
    public NodoNumeros() {
        numero=0;
        siguiente=null;
    }
    
}

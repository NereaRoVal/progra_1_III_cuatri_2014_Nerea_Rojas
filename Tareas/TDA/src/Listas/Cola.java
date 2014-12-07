/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

import Nodos.NodoCola;
import Nodos.NodoPila;

/**
 *
 * @author Nerea
 */
public class Cola {

    private Cola raiz;
    private Cola ultimo;
    private Object nuevo;

    public Cola() {
        raiz = null;
    }

    public void Encolar(NodoCola tiquete) {
        NodoCola NodoCola = new NodoCola();
        nuevo.setCliente(tiquete.getCliente());
        nuevo.settiquete(tiquete.gettiquete());
        nuevo.setsiguiente(null);

        if (raiz == null) {
            raiz = nuevo;
            ultimo = nuevo;

        } else {
            ultimo.setsiguiente(nuevo);
            ultimo = nuevo;

        }
    }

    public NodoCola Desencolar() {
        if (raiz != null) {
            NodoCola tiquete = raiz;
            if (raiz == ultimo) {
                raiz = null;
                ultimo = null;

            } else {
                raiz = raiz.getSiguiente();

            }
            return tiquete;

        }
        return null;

    }
    public String Imprimir(){
    NodoCola recorrido=raiz;
    String impre="";
    while(recorrido!=null){
    impre+="Cliente: "+recorrido.getCliente() + "Cuenta "+recorrido.gettiquete();
    impre+="\n";
    recorrido=recorrido.getSiguiente();
    }
    return impre;
    }
}



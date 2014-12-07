package Listas;

import Nodos.NodoJugador;

public class ListasJugadores {

    NodoJugador raiz;

    public void Insertar(NodoJugador numero) {
        NodoJugador nuevo = new NodoJugador();
        nuevo.setEdad(numero.getEdad());
        nuevo.setNombre(numero.getNombre());
        nuevo.setSiguiente(numero.getSiguiente());

        if (raiz == null) {
            raiz = nuevo;

        } else {
            NodoJugador aux;
            aux = raiz;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
    }
    
    public boolean delete(String nombre){
        NodoJugador nodo = raiz;
        NodoJugador anterior = nodo;
        if (raiz == null) {
            System.out.println("La lista está vacía");
            return true;
        }
        while (nodo != null) {
            if (nodo.getNombre().equals(nombre)) {
                if (raiz == nodo) {
                    raiz = nodo.getSiguiente();
                }
                anterior.setSiguiente((nodo.getSiguiente()));
                return false;
            }
            anterior = nodo;
            nodo = nodo.getSiguiente();
        }
        return true;
    }
    
    public String print(){
        NodoJugador aux;
        aux = raiz;
        String print = "";
        while (aux != null) {            
            print += "Nombre " + aux.getNombre() + ".\n" + "Edad " + aux.getEdad();
            print += "\n";
            aux = aux.getSiguiente();
        }
        return print;
    }
}

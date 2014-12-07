package Listas;

import Nodos.NodoPeliJuego;
import Nodos.NodoInventario;

public class ListaInventario {

    private NodoInventario raiz;

    // Método que inserta un nodo inventario al final de la lista con todos sus atributos
    public void InsertarInventario(NodoPeliJuego elemento) {
        NodoInventario nuevo;
        nuevo = new NodoInventario();
        nuevo.setPeliJuego(elemento);
        nuevo.setCostoCompra(elemento.getCosto() - 1000);
        
        // Condicional que nos dice si no hay ningún nodo inventario.
        if (getRaiz() == null) {
            setRaiz(nuevo);
            
        }else{
            NodoInventario auxiliar = getRaiz();
            // Ciclo que nos recorre toda la lista hasta el último elemento.
            while (auxiliar.getSiguiente() != null) {
            // Condicional que nos dice si la película ya existe en inventario. 
            if (auxiliar.getPeliJuego().getNombre().equals(elemento.getNombre())) {
                auxiliar.setCantidad();
                break;
            }else{
                auxiliar = auxiliar.getSiguiente();
            }   
            }
            // Esto nos coloca el nodo al final de la lista.
            if (auxiliar.getSiguiente() == null) {
                auxiliar.setSiguiente(nuevo);
            }
            }
        }

    /**
     * @return the raiz
     */
    public NodoInventario getRaiz() {
        return raiz;
    }

    /**
     * @param raiz the raiz to set
     */
    public void setRaiz(NodoInventario raiz) {
        this.raiz = raiz;
    }
}
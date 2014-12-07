package Nodos;

public class NodoInventario {

    
    private int cantidad;
    private NodoPeliJuego peliJuego;
    private int costoCompra;
    private NodoInventario siguiente;

    public NodoInventario() {
        cantidad = 1;
        costoCompra = 0;
        peliJuego = null;
        siguiente = null;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad() {
        this.cantidad++;
    }

    /**
     * @return the siguiente
     */
    public NodoInventario getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoInventario siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * @return the peliJuego
     */
    public NodoPeliJuego getPeliJuego() {
        return peliJuego;
    }

    /**
     * @param peliJuego the peliJuego to set
     */
    public void setPeliJuego(NodoPeliJuego peliJuego) {
        this.peliJuego = peliJuego;
    }

    /**
     * @return the costoCompra
     */
    public int getCostoCompra() {
        return costoCompra;
    }

    /**
     * @param costoCompra the costoCompra to set
     */
    public void setCostoCompra(int costoCompra) {
        this.costoCompra = costoCompra;
    }
}

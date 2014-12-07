package Nodos;

import java.util.Date;

public class NodoRenta {

    private int ID;
    private int fechaEntrega;
    private int fechaRecepcion;
    private NodoUsuario socios;
    private NodoPeliJuego peliJuegos;
    private NodoRenta siguiente;
    

    public NodoRenta() {
        ID = 0;
        fechaEntrega = 0;
        fechaRecepcion = 0;
        siguiente = null;
        socios = null;
        peliJuegos = null;
    }

    /**
     * @return the siguiente
     */
    public NodoRenta getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoRenta siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * @return the peliJuegos
     */
    public NodoPeliJuego getPeliJuegos() {
        return peliJuegos;
    }

    /**
     * @param peliJuegos the peliJuegos to set
     */
    public void setPeliJuegos(NodoPeliJuego peliJuegos) {
        this.peliJuegos = peliJuegos;
    }

    /**
     * @return the socios
     */
    public NodoUsuario getSocios() {
        return socios;
    }

    /**
     * @param socios the socios to set
     */
    public void setSocios(NodoUsuario socios) {
        this.socios = socios;
    }

    /**
     * @return the ID
     */
    public int getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     * @return the fechaEntrega
     */
    public int getFechaEntrega() {
        return fechaEntrega;
    }

    /**
     * @param fechaEntrega the fechaEntrega to set
     */
    public void setFechaEntrega(int fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    /**
     * @return the fechaRecepcion
     */
    public int getFechaRecepcion() {
        return fechaRecepcion;
    }

    /**
     * @param fechaRecepcion the fechaRecepcion to set
     */
    public void setFechaRecepcion(int fechaRecepcion) {
        this.fechaRecepcion = fechaRecepcion;
    }

}

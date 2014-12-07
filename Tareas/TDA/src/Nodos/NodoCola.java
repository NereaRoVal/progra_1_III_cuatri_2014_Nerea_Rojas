/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nodos;

/**
 *
 * @author Narea
 */
public class NodoCola {
    private String tiquete;
    private String cliente;
    private NodoCola siguiente;

    /**
     * @return the tiquete
     */
    public String getTiquete() {
        return tiquete;
    }

    /**
     * @param tiquete the tiquete to set
     */
    public void setTiquete(String tiquete) {
        this.tiquete = tiquete;
    }

    /**
     * @return the cliente
     */
    public String getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the siguiente
     */
    public NodoCola getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoCola siguiente) {
        this.siguiente = siguiente;
    }
    
    
    
    
}

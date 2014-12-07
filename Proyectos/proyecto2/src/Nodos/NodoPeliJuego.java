package Nodos;

public class NodoPeliJuego {
    
    private int ID;
    private String nombre;
    private String tipo;
    private boolean disponible;
    private int costo;
    private String genero;
    private int cantidadRentadas;
    private NodoPeliJuego siguiente;

    public NodoPeliJuego() {
        this.ID = 0;
        this.nombre = "";
        this.tipo = "";
        this.costo = 0;
        this.genero = "";
        this.disponible = true;
        this.siguiente = null;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the costo
     */
    public int getCosto() {
        return costo;
    }

    /**
     * @param costo the costo to set
     */
    public void setCosto(int costo) {
        this.costo = costo;
    }

    /**
     * @return the genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * @return the siguiente
     */
    public NodoPeliJuego getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoPeliJuego siguiente) {
        this.siguiente = siguiente;
    }


    /**
     * @return the alquiRentada
     */
    public int getAlquiRentada() {
        return cantidadRentadas;
    }

    /**
     * @param alquiRentada the alquiRentada to set
     */
    public void setAlquiRentada() {
        this.cantidadRentadas++;
    }

    /**
     * @return the disponible
     */
    public boolean isDisponible() {
        return disponible;
    }

    /**
     * @param disponible the disponible to set
     */
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
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

}

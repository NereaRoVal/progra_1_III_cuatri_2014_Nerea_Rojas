package Nodos;

public class NodoVenta {
    
    private String usuario;
    private int total;
    private NodoPeliJuego peliJuegos;
    private NodoVenta siguiente;

    public NodoVenta() {
        total = 0;
        usuario = "";
        peliJuegos = null;
        siguiente = null;
    }


    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
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
     * @return the total
     */
    public int getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(int total) {
        this.total = total;
    }

    /**
     * @return the siguiente
     */
    public NodoVenta getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoVenta siguiente) {
        this.siguiente = siguiente;
    }

}

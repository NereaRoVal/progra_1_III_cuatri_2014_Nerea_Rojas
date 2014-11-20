 package proyecto_2;

public class nodoVenta{

    private int numeroSocio;
    private int total;
    private int ID;
    private String comprador;
    private nodoVenta siguiente;

    public nodoVenta getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(nodoVenta siguiente) {
        this.siguiente = siguiente;
    }

    public int getNumeroSocio() {
        return numeroSocio;
    }

    public void setNumeroSocio(int numeroSocio) {
        this.numeroSocio = numeroSocio;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getComprador() {
        return comprador;
    }

    public void setComprador(String comprador) {
        this.comprador = comprador;
    }
    
    
}
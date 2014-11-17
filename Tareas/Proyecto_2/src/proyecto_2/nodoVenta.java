 package proyecto_2;

public class nodoVenta{

    private int ID;
    private String comprador;
    private nodoVenta siguiente;

    public nodoVenta getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(nodoVenta siguiente) {
        this.siguiente = siguiente;
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
package proyecto_2;

public class nodoInventario{
    
    private String nombre;
    private int costoCompra;
    private int cantidad;
    private nodoInventario siguiente;
    
    public nodoInventario() {
        costoCompra = 0;
        cantidad = 0;
        nombre = "";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public nodoInventario getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(nodoInventario siguiente) {
        this.siguiente = siguiente;
    }

    
    public int getCostoCompra() {
        return costoCompra;
    }

    public void setCostoCompra(int costoCompra) {
        this.costoCompra = costoCompra;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    } 
    
}
package proyecto_2;

public class nodoInventario{

    private int costoCompra;
    private int cantidad;
    NodoPelicula juegosPeliculas;

    public nodoInventario() {
        costoCompra = 0;
        cantidad = 0;
        juegosPeliculas = null;
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

    public NodoPelicula getJuegosPeliculas() {
        return juegosPeliculas;
    }

    public void setJuegosPeliculas(NodoPelicula juegosPeliculas) {
        this.juegosPeliculas = juegosPeliculas;
    }
    
    
    
    
}
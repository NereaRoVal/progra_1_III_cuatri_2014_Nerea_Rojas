package proyecto_2;

public class NodoPelicula {

    private String generoPelicula;
    private String nombre;
    private int ID;
    private int costo;
    private String tipo;
    private String genero;
    private String catalago;
    private int fechaRenta;
    private int fechaRecepcion;
    private NodoPelicula siguiente;

    public NodoPelicula() {
        generoPelicula = "";
        nombre = "";
        ID = 0;
        costo = 0;
        tipo = "";
        genero = "";
        catalago = "";
        fechaRenta = 0;
        fechaRecepcion = 0;
        siguiente = null;
    }

    public String getGeneroPelicula() {
        return generoPelicula;
    }

    public void setGeneroPelicula(String generoPelicula) {
        this.generoPelicula = generoPelicula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCatalago() {
        return catalago;
    }

    public void setCatalago(String catalago) {
        this.catalago = catalago;
    }

    public int getFechaRenta() {
        return fechaRenta;
    }

    public void setFechaRenta(int fechaRenta) {
        this.fechaRenta = fechaRenta;
    }

    public int getFechaRecepcion() {
        return fechaRecepcion;
    }

    public void setFechaRecepcion(int fechaRecepcion) {
        this.fechaRecepcion = fechaRecepcion;
    }

    public NodoPelicula getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoPelicula siguiente) {
        this.siguiente = siguiente;
    }
}

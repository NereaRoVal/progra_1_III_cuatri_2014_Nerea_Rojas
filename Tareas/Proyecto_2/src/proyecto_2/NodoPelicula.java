package proyecto_2;

public class NodoPelicula {
    
    private boolean disponible;
    private String genero;
    private String nombre;
    private int ID;
    private int costo;
    private String tipo;
    private String catalago;
    private NodoPelicula siguiente;

    public NodoPelicula() {
        genero = "";
        nombre = "";
        ID = 0;
        costo = 0;
        tipo = "";
        catalago = "";
        siguiente = null;
        disponible = false;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    
    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
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

    public String getCatalago() {
        return catalago;
    }

    public void setCatalago(String catalago) {
        this.catalago = catalago;
    }

    public NodoPelicula getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoPelicula siguiente) {
        this.siguiente = siguiente;
    }
}

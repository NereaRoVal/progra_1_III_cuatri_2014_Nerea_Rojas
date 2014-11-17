package proyecto_2;

public class nodoUsuario{

    private String direccion;
    private String nombre;
    private int ID;
    private int telefono;
    private int morosidad;
    private nodoUsuario siguiente;

    public nodoUsuario() {
        direccion = "";
        nombre = "";
        ID = 0;
        telefono = 0;
        morosidad = 0;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
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

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getMorosidad() {
        return morosidad;
    }

    public void setMorosidad(int morosidad) {
        this.morosidad = morosidad;
    }

    public nodoUsuario getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(nodoUsuario siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
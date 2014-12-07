package Nodos;

public class NodoUsuario {

    private int ID;
    private String nombre;
    private String direccion;
    private int telefono;
    private boolean morosidad;
    private NodoUsuario siguiente;

    public NodoUsuario() {
        this.ID = 0;
        this.nombre = "";
        this.direccion = "";
        this.telefono = 0;
        this.morosidad = false;
        this.siguiente = null;
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
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the telefono
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the morosidad
     */
    public boolean isMorosidad() {
        return morosidad;
    }

    /**
     * @param morosidad the morosidad to set
     */
    public void setMorosidad(boolean morosidad) {
        this.morosidad = morosidad;
    }

    /**
     * @return the siguiente
     */
    public NodoUsuario getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoUsuario siguiente) {
        this.siguiente = siguiente;
    }

}

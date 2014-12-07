/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase12;

/**
 *
 * @author Nerea
 */
public class Ejercicio_1 {

    private String matricula;
    private String dueno;
    private String marca;
    private Ejercicio_1 siguiente;

    public Ejercicio_1() {
        matricula = "";
        dueno = "";
        marca = "";
        siguiente = null;
    }

    /**
     * @return the matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the dueno
     */
    public String getDueno() {
        return dueno;
    }

    /**
     * @param dueno the dueno to set
     */
    public void setDueno(String dueno) {
        this.dueno = dueno;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the siguiente
     */
    public Ejercicio_1 getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(Ejercicio_1 siguiente) {
        this.siguiente = siguiente;
    }
}

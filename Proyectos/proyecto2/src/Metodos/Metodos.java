package Metodos;

import Nodos.NodoPeliJuego;
import Nodos.NodoInventario;
import Nodos.NodoRenta;
import Nodos.NodoVenta;

public class Metodos{
    
    // Método que nos imprime todas las películas de un mismo género.
    public String printMovie(NodoPeliJuego peliJuego,String genero){
        String print = "";
        while (peliJuego != null) {            
            if (peliJuego.getGenero().equals(genero)) {
                print += peliJuego.getNombre() + "\n";
            }
            peliJuego = peliJuego.getSiguiente();
        }
        return print;
    }
    
    // Método que nos imprime todas las peliculas que se encuentran actualmente en renta.
    public String pelisRentaActiva(NodoPeliJuego peliJuego){
        String print = "";
        while (peliJuego != null) {            
            if (!peliJuego.isDisponible()) {
                print += peliJuego.getNombre() + "\n";
            }
            peliJuego = peliJuego.getSiguiente();
        }
        return print;
    }
    
    // Método que nos imprime todo el inventario de películas y juegos.
    public String printInventario(NodoInventario inventario){
        String print = "";
        while (inventario != null) {
            print += inventario.getPeliJuego().getNombre() + "\n";
            inventario = inventario.getSiguiente();
        }
        return print;
    }
    
    // Método que nos imprime todas las rentas de un socio.
    public String rentasClientes(NodoRenta rentas, String usuario){
        String print = usuario + ":\n";
        while (rentas != null) {            
            if (rentas.getSocios().getNombre().equals(usuario)) {
                print+= rentas.getPeliJuegos().getNombre();
            }
            rentas = rentas.getSiguiente();
        }
        return print;
    }
    
    // Método que nos imprime la película más rentada / comprada.
    public String masRentaCompra(NodoPeliJuego elemento){
    String print = "";
    NodoPeliJuego auxiliar = elemento;
    int mayor = 0;
    int supp = 0;
    int aux = 0;
    // Ciclo que nos recorre toda la lista.
        while (auxiliar != null) {
            aux = auxiliar.getAlquiRentada();
            auxiliar = auxiliar.getSiguiente();
            if (auxiliar == null) {
                break;
            } else {
                supp = auxiliar.getAlquiRentada();
            }
            // Condicional que nos dice cuál es la mayor cantidad de rentas y compras de una película.
            if (supp > aux) {
                mayor = supp;
            }
            
        }
        NodoPeliJuego support = elemento;
        while (support != null) {        
            // Condicional que nos ayuda saber a cuál película pertenece la cantidad mayor de rentas / compras.
            if (support.getAlquiRentada() == mayor) {
                print = support.getNombre();
                break;
            }
            support = support.getSiguiente();
        }
        return print;
    }
    
    // Método que nos imprime la película menos comprada / rentada.
    public String menosRentaCompra(NodoPeliJuego elemento){
    String print = "";
    NodoPeliJuego auxiliar = elemento;
    int menor = 0;
    int supp = 0;
    int aux = 0;
    // Ciclo que nos recorre toda la lista.
        while (auxiliar != null) {
            aux = auxiliar.getAlquiRentada();
            auxiliar = auxiliar.getSiguiente();
            if (auxiliar == null) {
                break;
            } else {
                supp = auxiliar.getAlquiRentada();
            }
            // Condicional que nos dice cuál es la mayor cantidad de rentas y compras de una película.
            if (supp < aux) {
                menor = supp;
            }
            
        }
        NodoPeliJuego support = elemento;
        while (support != null) {     
            // Condicional que nos ayuda saber a cuál película pertenece la cantidad mayor de rentas / compras
            if (support.getAlquiRentada() == menor) {
                print = support.getNombre();
                break;
            }
            support = support.getSiguiente();
        }
        return print;
    }
    
    // Método que nos imprime las compras de un cliente.
    public String ventasClientes(NodoVenta ventas, String usuario){
        String print = usuario + ":\n";
        while (ventas != null) {            
            if (ventas.getUsuario().equals(usuario)) {
                print+= ventas.getPeliJuegos().getNombre();
            }
            ventas = ventas.getSiguiente();
        }
        return print;
    }
}

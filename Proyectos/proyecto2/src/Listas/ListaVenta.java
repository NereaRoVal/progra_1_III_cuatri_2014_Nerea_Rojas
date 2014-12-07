package Listas;
import Nodos.NodoVenta;
import Nodos.NodoPeliJuego;

public class ListaVenta{
    
        private NodoVenta raiz;

        // Método que nos permite agregar una venta.
    public void agregarVenta(String usuario, String pelis, NodoPeliJuego peliJuego) {
        NodoVenta nuevo;
        nuevo = new NodoVenta();
        NodoPeliJuego peliJuegos = peliJuego;
        nuevo.setUsuario(usuario);
        
        if (getRaiz() == null) {
            // Ciclo que nos permite determinar cual película se desea vender.
            while (!peliJuegos.getNombre().equals(pelis)) {
                peliJuegos = peliJuegos.getSiguiente();
                // Condicional que nos dice si la película deseada no está registrada.
                if (peliJuegos == null) {
                    System.out.println("Pelìcula no registrada");
                    break;
                }
            }
            
            if (peliJuegos == null) {
                System.out.println("No se ha podido efectuar la renta");
            } else {
                // Condicional que nos permite saber si la renta se encuentra disponible.
                if (peliJuegos.isDisponible()) {
                    nuevo.setPeliJuegos(peliJuegos);
                    nuevo.setTotal(peliJuego.getCosto());
                    setRaiz(nuevo);
                    peliJuegos.setAlquiRentada();
                    peliJuegos.setDisponible(false);
                } else {
                    System.out.println("Película no disponible");
                }

            }

        } else {
            NodoVenta auxiliar = raiz;
            // Ciclo que nos permite recorrer toda la lista.
            while (auxiliar != null) {
                auxiliar = auxiliar.getSiguiente();
            }
            // Ciclo que nos permite determinar cual película se desea vender.
            while (!peliJuegos.getNombre().equals(pelis)) {
                peliJuegos = peliJuegos.getSiguiente();
                // Condicional que nos permite saber si la película no está registrada.
                if (peliJuegos == null) {
                    System.out.println("Pelìcula no registrada");
                    break;
                }
            }

            if (peliJuegos == null) {
                System.out.println("No se ha podido efectuar la renta");
            } else {
                // Condicional que nos permite saber si la renta se encuentra disponible.
                if (peliJuegos.isDisponible()) {
                    nuevo.setPeliJuegos(peliJuegos);
                    nuevo.setTotal(peliJuego.getCosto());
                    auxiliar.setSiguiente(nuevo);
                    peliJuegos.setAlquiRentada();
                    peliJuegos.setDisponible(false);
                } else {
                    System.out.println("Película con renta activa");
                }
            }
        }
    }

    /**
     * @return the raiz
     */
    public NodoVenta getRaiz() {
        return raiz;
    }

    /**
     * @param raiz the raiz to set
     */
    public void setRaiz(NodoVenta raiz) {
        this.raiz = raiz;
    }

}
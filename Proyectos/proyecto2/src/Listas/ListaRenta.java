package Listas;

import Nodos.NodoUsuario;
import Nodos.NodoRenta;
import Nodos.NodoPeliJuego;

public class ListaRenta {

    private NodoRenta listaRenta;

    // Método que nos permite agregar una renta
    public void agregarRenta(String usuario, String pelis, NodoPeliJuego peliculas, NodoUsuario socios, int mes) {
        NodoRenta nuevo;
        nuevo = new NodoRenta();
        NodoPeliJuego peliJuegos = peliculas;
        NodoUsuario usuarios = socios;
        if (getListaRenta() == null) {
            // Ciclo que nos recorre la lista de películas hasta encontrar la que queremos rentar.
            while (!peliJuegos.getNombre().equals(pelis)) {
                peliJuegos = peliJuegos.getSiguiente();
                // Condicional que nos dice si la película no está registrada en el inventario.
                if (peliJuegos == null) {
                    System.out.println("Pelìcula no registrada");
                    break;
                }
            }
            // Condicional que nos dice si el socio no está registrado en la empresa.
            if (usuarios == null) {
                System.out.println("No hay usuarios registrados");
            } else {
                // Ciclo que nos recorre la lista de socios hasta encontrar el socio deseado.
                while (!usuarios.getNombre().equals(usuario)) {
                    usuarios = usuarios.getSiguiente();
                    // Condicional que nos dice si el usuario no está registrado.
                    if (usuarios == null) {
                        break;
                    }
                }
            }
            if (peliJuegos == null || usuarios == null) {
                System.out.println("No se ha podido efectuar la renta");
            } else {
                // Condicional que nos dice si contamos actualmente con la película o ésta se encuentra rentada.
                if (peliJuegos.isDisponible()) {
                    nuevo.setPeliJuegos(peliJuegos);
                    nuevo.setSocios(socios);
                    nuevo.setID(1);
                    nuevo.setFechaEntrega(mes);
                    setListaRenta(nuevo);
                    peliJuegos.setAlquiRentada();
                    peliJuegos.setDisponible(false);
                } else {
                    System.out.println("Película con renta activa");
                }

            }

        } else {
            NodoRenta auxiliar = getListaRenta();
            // Variable que nos permite asignar un ID automáticamente
            int ID = 2;
            // Ciclo que nos permite recorrer toda la lista.
            while (auxiliar != null) {
                ID++;
                auxiliar = auxiliar.getSiguiente();
            }
            while (!peliJuegos.getNombre().equals(pelis)) {
                peliJuegos = peliJuegos.getSiguiente();
                if (peliJuegos == null) {
                    System.out.println("Pelìcula no registrada");
                    break;
                }
            }
            while (!usuarios.getNombre().equals(usuario)) {
                usuarios = usuarios.getSiguiente();
                if (usuarios == null) {
                    System.out.println("Socio no registrado");
                    break;
                }
            }

            if (peliJuegos == null || usuarios == null) {
                System.out.println("No se ha podido efectuar la renta");
            } else {
                if (peliJuegos.isDisponible()) {
                    nuevo.setPeliJuegos(peliJuegos);
                    nuevo.setSocios(socios);
                    nuevo.setID(ID);
                    nuevo.setFechaEntrega(mes);
                    auxiliar.setSiguiente(nuevo);
                    peliJuegos.setAlquiRentada();
                    peliJuegos.setDisponible(false);
                } else {
                    System.out.println("Película con renta activa");
                }
            }
        }
    }
    
    // Método que nos permite eliminar una renta de la lista.
    public void BorrarRenta(int ID, int recepcion) {
        NodoRenta nombre1 = getListaRenta();
        NodoRenta aux = nombre1.getSiguiente();
        // Condicional que nos permite identificar la renta a eliminar.
        if (nombre1.getID() == ID) {
            // Condicional que nos dice si el usuario está moroso o no. 
            if (nombre1.getFechaEntrega() < recepcion) {
                nombre1.getSocios().setMorosidad(true);
            }
            setListaRenta(aux);
            // Nos permite volver a poner disponible la película cuando esta ha sido devuelta por el socio.
            nombre1.getPeliJuegos().setDisponible(true);
        } else {
            // Ciclo que nos permite buscar la renta deseada en toda la lista.
            while (aux.getID() != ID) {
                nombre1 = nombre1.getSiguiente();
                aux = aux.getSiguiente();
                // Condicional que nos permite saber si la renta no se ha encontrado. 
                if (aux == null) {
                    System.out.println("No se ha podido encontrar el ID deseado");
                    break;
                }
            }
            // Condicional que nos dice si el usuario está moroso o no.
            if (nombre1.getFechaEntrega() > recepcion) {
                nombre1.getSocios().setMorosidad(true);
            }
            
            if (aux == null) {
                System.out.println("No se ha deshacer la renta");
            } else {
                nombre1.setSiguiente(aux.getSiguiente());
            }
        }
    }

    /**
     * @return the listaRenta
     */
    public NodoRenta getListaRenta() {
        return listaRenta;
    }

    /**
     * @param listaRenta the listaRenta to set
     */
    public void setListaRenta(NodoRenta listaRenta) {
        this.listaRenta = listaRenta;
    }
}

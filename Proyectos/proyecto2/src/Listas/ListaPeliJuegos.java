package Listas;

import Nodos.NodoPeliJuego;

public class ListaPeliJuegos {

    private NodoPeliJuego raiz;

    // Método que nos agrega un nodo película al final de la lista.
    public NodoPeliJuego AgregarPeliJuego(NodoPeliJuego elemento) {
        NodoPeliJuego nuevo;
        nuevo = new NodoPeliJuego();
        nuevo.setCosto(elemento.getCosto());
        nuevo.setGenero(elemento.getGenero());
        nuevo.setNombre(elemento.getNombre());
        nuevo.setTipo(elemento.getTipo());

        if (getRaiz() == null) {
            nuevo.setSiguiente(null);
            setRaiz(nuevo);
            raiz.setID(1);
        } else {
            NodoPeliJuego auxiliar = getRaiz();
            // Variable que nos permite asignar un ID automaticamente.
            int ID = 2;
            // Ciclo que nos recorre toda la lista hasta encontrar el nodo deseado.
            while (auxiliar.getSiguiente() != null) {
                // Variable que nos permite determinar si la película a insertar ya existe en el inventario.
                if (auxiliar.getNombre().equals(elemento.getNombre())) {
                    System.out.println("Pelìcula ya registrada");
                    break;
                } else {
                    ID++;
                    auxiliar = auxiliar.getSiguiente();
                }

            }
            if (auxiliar.getSiguiente() == null) {
                nuevo.setID(ID);
                auxiliar.setSiguiente(nuevo);
            }

        }
        return nuevo;
    }

    // Método que nos permite buscar un nodo por medio del nombre y modificar ese nodo. 
    public void modificarPeliJuego(String nombre, NodoPeliJuego peli) {
        NodoPeliJuego peliJuego = peli;
        // Variable que nos permite asignar un ID automaticamente.
        int ID = 1;
        // Ciclo que nos recorre toda la lista hasta encontrar el nodo deseado.
        while (!peliJuego.getNombre().equals(nombre)) {
            ID++;
            peliJuego = peliJuego.getSiguiente();
            if (peliJuego == null) {
                break;
            }
        }

        if (peliJuego == null) {
            System.out.println("Película no encontrada");
        } else {
            peliJuego.setCosto(peli.getCosto());
            peliJuego.setGenero(peli.getGenero());
            peliJuego.setNombre(peli.getNombre());
            peliJuego.setTipo(peli.getTipo());
            peliJuego.setID(ID);
        }
    }

    // Método que nos elimina el nodo deseado por medio de un identificador.
    public void BorrarPelicula(String actualNombre) {
        NodoPeliJuego nombre1 = getRaiz();
        NodoPeliJuego aux = nombre1.getSiguiente();
        if (nombre1.getNombre().equals(actualNombre)) {
            setRaiz(aux);
        } else {
            // Ciclo que nos recorre toda la lista hasta el último elemento.
            while (!aux.getNombre().equals(actualNombre)) {
                nombre1 = nombre1.getSiguiente();
                aux = aux.getSiguiente();
                if (aux == null) {
                    break;
                }
            }

            // Condicional que nos dice si no se pudo encontrar la película a eliminar
            if (aux == null) {
                System.out.println("No se ha podido encontrar el usuario");
            } else {
                // Coloca la referencia del nodo anterior al nodo a eliminar al siguiente nodo del nodo a eliminar.
                nombre1.setSiguiente(aux.getSiguiente());
            }
        }
    }

    /**
     * @return the raiz
     */
    public NodoPeliJuego getRaiz() {
        return raiz;
    }

    /**
     * @param raiz the raiz to set
     */
    public void setRaiz(NodoPeliJuego raiz) {
        this.raiz = raiz;
    }

    // Nodos predeterminado.
    public NodoPeliJuego nodo1() {
        NodoPeliJuego nodo = new NodoPeliJuego();
        nodo.setCosto(4000);
        nodo.setGenero("Horror");
        nodo.setTipo("Pelicula");
        nodo.setNombre("El conjuro");
        return nodo;
    }

    // Nodos predeterminado.
    public NodoPeliJuego nodo2() {
        NodoPeliJuego nodo = new NodoPeliJuego();
        nodo.setCosto(4500);
        nodo.setGenero("Accion");
        nodo.setTipo("Pelicula");
        nodo.setNombre("Fast and Furious");
        return nodo;
    }

    // Nodos predeterminado.
    public NodoPeliJuego nodo3() {
        NodoPeliJuego nodo = new NodoPeliJuego();
        nodo.setCosto(4675);
        nodo.setGenero("Horror");
        nodo.setTipo("Pelicula");
        nodo.setNombre("Anabelle");
        return nodo;
    }

    // Nodos predeterminado.
    public NodoPeliJuego nodo4() {
        NodoPeliJuego nodo = new NodoPeliJuego();
        nodo.setCosto(5650);
        nodo.setGenero("Animada");
        nodo.setTipo("Pelicula");
        nodo.setNombre("Toy Story");
        return nodo;
    }

    // Nodos predeterminado.
    public NodoPeliJuego nodo5() {
        NodoPeliJuego nodo = new NodoPeliJuego();
        nodo.setCosto(3250);
        nodo.setGenero("Accion");
        nodo.setTipo("Pelicula");
        nodo.setNombre("Transportador");
        return nodo;
    }

    // Nodos predeterminado.
    public NodoPeliJuego nodo6() {
        NodoPeliJuego nodo = new NodoPeliJuego();
        nodo.setCosto(3650);
        nodo.setGenero("Animada");
        nodo.setTipo("Pelicula");
        nodo.setNombre("Los simpson");
        return nodo;
    }

    // Nodos predeterminado.
    public NodoPeliJuego nodo7() {
        NodoPeliJuego nodo = new NodoPeliJuego();
        nodo.setCosto(6250);
        nodo.setGenero("Accion");
        nodo.setTipo("Juego");
        nodo.setNombre("Assasin Creed");
        return nodo;
    }

    // Nodos predeterminado.
    public NodoPeliJuego nodo8() {
        NodoPeliJuego nodo = new NodoPeliJuego();
        nodo.setCosto(3975);
        nodo.setGenero("Deportes");
        nodo.setTipo("Juego");
        nodo.setNombre("FIFA 15");
        return nodo;
    }

    // Nodos predeterminado.
    public NodoPeliJuego nodo9() {
        NodoPeliJuego nodo = new NodoPeliJuego();
        nodo.setCosto(4000);
        nodo.setGenero("Accion");
        nodo.setTipo("Juego");
        nodo.setNombre("Call of Duty");
        return nodo;
    }

    // Nodos predeterminado.
    public NodoPeliJuego nodo10() {
        NodoPeliJuego nodo = new NodoPeliJuego();
        nodo.setCosto(4000);
        nodo.setGenero("Accion");
        nodo.setTipo("Juego");
        nodo.setNombre("GTA: San Andreas");
        return nodo;
    }
}

package Listas;

import Nodos.NodoUsuario;

public class ListaUsuario {

    private NodoUsuario raiz;

    // Método que nos permite agregar un socio.
    public void agregarUsuario(NodoUsuario elemento) {
        NodoUsuario nuevo;
        nuevo = new NodoUsuario();
        nuevo.setDireccion(elemento.getDireccion());
        nuevo.setNombre(elemento.getNombre());
        nuevo.setTelefono(elemento.getTelefono());

        if (getRaiz() == null) {
            nuevo.setSiguiente(null);
            setRaiz(nuevo);
            raiz.setID(1);
        } else {
            NodoUsuario auxiliar = getRaiz();
            // Variable que nos ayuda a asignar un ID automáticamente.
            int ID = 2;
            // Ciclo que nos permite recorrer toda la lista
            while (auxiliar.getSiguiente() != null) {
                ID++;
                auxiliar = auxiliar.getSiguiente();
            }
            nuevo.setID(ID);
            auxiliar.setSiguiente(nuevo);
        }
    }

    // Método que nos permite buscar un nodo por medio del nombre y modificar ese nodo. 
    public void modificarUsuario(NodoUsuario nodo, String nombre) {
        NodoUsuario usuario = getRaiz();
        // Variable que nos ayuda a asignar un ID automáticamente.
        int ID = 1;
        // Ciclo que nos permite recorrer toda la lista hasta encontrar el nodo deseado.
        while (!usuario.getNombre().equals(nombre)) {
            ID++;
            usuario = usuario.getSiguiente();
            // Condicional que nos dice si el usuario deseado no se encuentra registrado
            if (usuario == null) {
                break;
            }
        }

        if (usuario == null) {
            System.out.println("No se ha podido encontrar el usuario");
        } else {
            usuario.setDireccion(nodo.getDireccion());
            usuario.setID(nodo.getID());
            usuario.setNombre(nodo.getNombre());
            usuario.setTelefono(nodo.getTelefono());
            usuario.setID(ID);
        }
    }

    // Método que nos permite eliminar un usuario.
    public void BorrarUsuario(String actualNombre) {
        NodoUsuario nombre1 = getRaiz();
        NodoUsuario aux = nombre1.getSiguiente();
        if (nombre1.getNombre().equals(actualNombre)) {
            setRaiz(aux);
            raiz.setID(1);
        } else {
            // Ciclo que nos permite recorrer toda la lista hasta encontrar el nodo deseado.
            while (!aux.getNombre().equals(actualNombre)) {
                nombre1 = nombre1.getSiguiente();
                aux = aux.getSiguiente();
                // Condicional que nos dice si el usuario deseado no se ha encontrado.
                if (aux == null) {
                    break;
                }
            }
            if (aux == null) {
                System.out.println("No se ha podido encontrar el usuario");
            } else {
                if (aux.getSiguiente() != null) {
                    aux.getSiguiente().setID(aux.getID());
                }
                nombre1.setSiguiente(aux.getSiguiente());
            }
        }

    }

    /**
     * @return the raiz
     */
    public NodoUsuario getRaiz() {
        return raiz;
    }

    /**
     * @param raiz the raiz to set
     */
    public void setRaiz(NodoUsuario raiz) {
        this.raiz = raiz;
    }
}

package proyecto_2;

public class Peliculas {

    private NodoPelicula raiz;

    public void Insertar(boolean disponible,String genero, String nombre,int ID, int costo,String tipo) {
        NodoPelicula nuevo;
        nuevo = new NodoPelicula();
//        nuevo.setCatalago(elemento.getCatalago());
        nuevo.setCosto(costo);
        nuevo.setGenero(genero);
        nuevo.setID(ID);
        nuevo.setNombre(nombre);
        nuevo.setTipo(tipo);
        nuevo.setDisponible(disponible);

        if (getRaiz() == null) {
            nuevo.setSiguiente(null);
            setRaiz(nuevo);
        } else {
            NodoPelicula auxiliar = getRaiz();
            while (auxiliar.getSiguiente() != null) {
                auxiliar = auxiliar.getSiguiente();
            }
            auxiliar.setSiguiente(nuevo);
        }
    }

    public void modificarJuego(String genero, String nombre, int ID, int costo, String tipo) {
        NodoPelicula nombre1 = getRaiz();

        while (!nombre1.getNombre().equals(nombre)) {
            nombre1 = nombre1.getSiguiente();
            if (nombre1 == null) {
                break;
            }
        }

        if (nombre1 == null) {
            System.out.println("No existe la película");
        } else {
            nombre1.setCosto(costo);
            nombre1.setGenero(genero);
            nombre1.setID(ID);
            nombre1.setNombre(nombre);
            nombre1.setTipo(tipo);

        }

    }

    public void BorrarUsuario(String actualNombre) {
        NodoPelicula nombre1 = getRaiz();
        NodoPelicula aux = null;
        if (nombre1.getNombre().equals(actualNombre)) {
            setRaiz(nombre1.getSiguiente());
        } else {
            aux = nombre1;
            while (!nombre1.getNombre().equals(actualNombre)) {
                nombre1 = nombre1.getSiguiente();
                if (nombre1 == null) {
                    break;
                }
            }

            if (nombre1 == null) {
                System.out.println("No existe esa película");
            } else {
                while (!aux.getSiguiente().getNombre().equals(actualNombre)) {
                    aux = aux.getSiguiente();
                }
                aux.setSiguiente(aux.getSiguiente().getSiguiente());
            }
        }

    }

    public void BuscarPelicula(String nombre) {
        NodoPelicula siguienteJugador = getRaiz();
        NodoPelicula Anterior = getRaiz();
        while (siguienteJugador != null) {
            if (siguienteJugador.getNombre().equals(nombre)) {
                System.out.println("Nombre Buscado: " + siguienteJugador.getNombre() + "\n");
                Anterior = siguienteJugador;
            }
            siguienteJugador = siguienteJugador.getSiguiente();
        }

        if (!Anterior.getNombre().equals(nombre)) {
            System.out.println("No existe la película");
        }
    }

    public NodoPelicula getRaiz() {
        return raiz;
    }

    public void setRaiz(NodoPelicula raiz) {
        this.raiz = raiz;
    }


}

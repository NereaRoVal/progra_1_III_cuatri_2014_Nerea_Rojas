package proyecto_2;

public class Peliculas {

    private NodoPelicula raiz;

    public void Insertar(NodoPelicula elemento) {
        NodoPelicula nuevo;
        nuevo = new NodoPelicula();
        nuevo.setCatalago(elemento.getCatalago());
        nuevo.setCosto(elemento.getCosto());
        nuevo.setFechaRecepcion(elemento.getFechaRecepcion());
        nuevo.setFechaRenta(elemento.getFechaRenta());
        nuevo.setGenero(elemento.getGenero());
        nuevo.setGeneroPelicula(elemento.getGeneroPelicula());
        nuevo.setID(elemento.getID());
        nuevo.setNombre(elemento.getNombre());
        nuevo.setTipo(elemento.getTipo());
        nuevo.setSiguiente(elemento.getSiguiente());

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

    public void modificarUsuario(String generoPelicula, String nombre, int ID, int costo, String tipo, String genero, String catalago, int fechaRenta, int fechaRecepcion) {
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
            nombre1.setCatalago(catalago);
            nombre1.setCosto(costo);
            nombre1.setFechaRecepcion(fechaRecepcion);
            nombre1.setFechaRenta(fechaRenta);
            nombre1.setGenero(genero);
            nombre1.setGeneroPelicula(generoPelicula);
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

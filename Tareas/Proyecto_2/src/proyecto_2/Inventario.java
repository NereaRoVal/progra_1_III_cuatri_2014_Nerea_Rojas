package proyecto_2;

public class Inventario {

    private nodoInventario raiz;

    public void Insertar(nodoInventario elemento, Peliculas peliculas) {
        NodoPelicula peliJuegos = peliculas.getRaiz();
        nodoInventario nuevo;
        nuevo = new nodoInventario();
        nuevo.setCantidad(elemento.getCantidad());
        nuevo.setCostoCompra(elemento.getCostoCompra());

        if (raiz == null) {
            nuevo.setSiguiente(null);
            raiz = nuevo;
        } else {
            nodoInventario auxiliar = raiz;
            while (auxiliar.getSiguiente() != null) {
                auxiliar = auxiliar.getSiguiente();
            }
            auxiliar.setSiguiente(nuevo);
        }
    }

    public void BorrarElemento(String actualNombre, Peliculas elementos) {
        NodoPelicula peliJuegos = elementos.getRaiz();
        nodoInventario nombre1 = raiz;
        nodoInventario aux = null;
        while (nombre1.getNombre() != actualNombre) {
            raiz = nombre1.getSiguiente();
            if (raiz == null) {
                break;
            }
        }

        if(raiz == null)  {
            System.out.println("No existe la película");
        } else {
            aux = nombre1;
            while (!nombre1.getNombre().equals(actualNombre)) {
                nombre1 = nombre1.getSiguiente();
                if (nombre1 == null) {
                    break;
                }
            }

            if (nombre1 == null) {
                System.out.println("No existe ese usuario");
            } else {
                while (!aux.getSiguiente().getNombre().equals(actualNombre)) {
                    aux = aux.getSiguiente();

                }
                aux.setSiguiente(aux.getSiguiente().getSiguiente());
            }
        }

    }

}

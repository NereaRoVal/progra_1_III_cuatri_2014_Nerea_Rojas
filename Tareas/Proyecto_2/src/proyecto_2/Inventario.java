package proyecto_2;

public class Inventario {

    private nodoInventario raiz;

    public void Insertar(nodoInventario elemento, Peliculas peliculas) {
        NodoPelicula peliJuegos = peliculas.getRaiz();
//        peliculas inventario;
        nodoInventario nuevo;
        nuevo = new nodoInventario();
        nuevo.setCantidad(elemento.getCantidad());
        nuevo.setCostoCompra(elemento.getCostoCompra());

        if (raiz == null) {
            nuevo.setSiguiente(null);
            raiz = nuevo;
        } else {
            nodoUsuario auxiliar = raiz;
            while (auxiliar.getSiguiente() != null) {
                auxiliar = auxiliar.getSiguiente();
            }
            auxiliar.setSiguiente(nuevo);
        }
    }

}

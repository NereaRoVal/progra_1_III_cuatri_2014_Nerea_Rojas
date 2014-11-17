package proyecto_2;

public class Usuario {

    private nodoUsuario raiz;

    public void Insertar(nodoUsuario elemento) {
        nodoUsuario nuevo;
        nuevo = new nodoUsuario();
        nuevo.setDireccion(elemento.getDireccion());
        nuevo.setID(elemento.getID());
        nuevo.setMorosidad(elemento.getMorosidad());
        nuevo.setNombre(elemento.getNombre());
        nuevo.setTelefono(elemento.getTelefono());
        nuevo.setSiguiente(elemento.getSiguiente());

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

    public void modificarUsuario(String nombre, int telefono, String direccion, int morosidad) {
        nodoUsuario nombre1 = raiz;

        while (!nombre1.getNombre().equals(nombre)) {
            nombre1 = nombre1.getSiguiente();
            if (nombre1 == null) {
                break;
            }
        }

        if (nombre1 == null) {
            System.out.println("No existe el Jugador");
        } else {
            nombre1.setDireccion(direccion);
            nombre1.setNombre(nombre);
            nombre1.setTelefono(telefono);
            nombre1.setMorosidad(morosidad);
        }

    }
    
    public void BorrarUsuario(String actualNombre) {
       nodoUsuario nombre1 = raiz;
       nodoUsuario aux=null;
        if (nombre1.getNombre().equals(actualNombre)) {
            raiz = nombre1.getSiguiente();
        } else {
          aux = nombre1;
          while (!nombre1.getNombre().equals(actualNombre)) {
            nombre1 = nombre1.getSiguiente();
            if (nombre1 == null) {
                break;
            }
        }        
          
           if(nombre1==null)
           {
               System.out.println("No existe ese usuario");
           }else
           {
            while (!aux.getSiguiente().getNombre().equals(actualNombre)) {
                aux = aux.getSiguiente();

            }
            aux.setSiguiente(aux.getSiguiente().getSiguiente());
        }
        }

    }
    
     public void BuscarUsuario(String nombre) {
        nodoUsuario siguienteJugador = raiz;
        nodoUsuario Anterior = raiz;
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

}

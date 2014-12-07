package Main;

import java.util.Scanner;
import Listas.ListaInventario;
import Listas.ListaPeliJuegos;
import Listas.ListaRenta;
import Listas.ListaVenta;
import Listas.ListaUsuario;
import Nodos.NodoPeliJuego;
import Nodos.NodoUsuario;
import Metodos.Metodos;
import java.util.Calendar;

public class Main {

    public static void main(String[] args) {
        // Variable que nos permite manipular la lista de peliculas y juegos.
        ListaPeliJuegos peliJuegos = new ListaPeliJuegos();
        // Variable que nos permite manipular la lista de usuarios.
        ListaUsuario usuarios = new ListaUsuario();
        // Variable que nos permite manipular la lista de inventario.
        ListaInventario inventario = new ListaInventario();
        // Variable que nos permite manipular la lista de rentas.
        ListaRenta rentas = new ListaRenta();
        // Variable que nos permite manipular la lista de ventas.
        ListaVenta ventas = new ListaVenta();
        // Variable que nos provee de ciertos métodos necesarios.
        Metodos metodos = new Metodos();
        // Variable que nos ayuda a llevar el control de las fechas. 
        Calendar fecha = Calendar.getInstance();

        // Acá insertamos las películas predeterminadas a la lista de peliculas y juegos y a la lista del inventario.
        NodoPeliJuego nodo1 = peliJuegos.AgregarPeliJuego(peliJuegos.nodo1());
        inventario.InsertarInventario(nodo1);
        NodoPeliJuego nodo2 = peliJuegos.AgregarPeliJuego(peliJuegos.nodo2());
        inventario.InsertarInventario(nodo2);
        NodoPeliJuego nodo3 = peliJuegos.AgregarPeliJuego(peliJuegos.nodo3());
        inventario.InsertarInventario(nodo3);
        NodoPeliJuego nodo4 = peliJuegos.AgregarPeliJuego(peliJuegos.nodo4());
        inventario.InsertarInventario(nodo4);
        NodoPeliJuego nodo5 = peliJuegos.AgregarPeliJuego(peliJuegos.nodo5());
        inventario.InsertarInventario(nodo5);
        NodoPeliJuego nodo6 = peliJuegos.AgregarPeliJuego(peliJuegos.nodo6());
        inventario.InsertarInventario(nodo6);
        NodoPeliJuego nodo7 = peliJuegos.AgregarPeliJuego(peliJuegos.nodo7());
        inventario.InsertarInventario(nodo7);
        NodoPeliJuego nodo8 = peliJuegos.AgregarPeliJuego(peliJuegos.nodo8());
        inventario.InsertarInventario(nodo8);
        NodoPeliJuego nodo9 = peliJuegos.AgregarPeliJuego(peliJuegos.nodo9());
        inventario.InsertarInventario(nodo9);
        NodoPeliJuego nodo10 = peliJuegos.AgregarPeliJuego(peliJuegos.nodo10());
        inventario.InsertarInventario(nodo10);
        int opt = 0;

        do {
            try {
             
            Scanner teclado = new Scanner(System.in);
            System.out.println("Menú\n"
                    + "1. Insertar y modificar inventario \n"
                    + "2. Buscar pelìculas por genero\n"
                    + "3. Venta\n"
                    + "4. Renta\n"
                    + "5. Mostrar inventario\n"
                    + "6. Usuarios\n"
                    + "7. Pelìculas con renta activa \n"
                    + "8. Pelicula más rentada/comprada\n"
                    + "9. Pelicula menos rentada/comprada\n"
                    + "10. Salir");
            opt = teclado.nextInt();
            switch (opt) {

                case 1:
                    // Variables que nos permiten definir el nodo a insertar.
                    NodoPeliJuego nodos = new NodoPeliJuego();
                    String nombre;
                    String tipo = "";
                    int costo;
                    String genero;

                    System.out.println("1. Insertar\n"
                            + "2. Modificar\n"
                            + "3. Eliminar");
                    opt = teclado.nextInt();
                    switch (opt) {
                        case 1:
                            teclado = new Scanner(System.in);
                            int opcion;
                            System.out.println("Nombre de película o juego:");
                            nombre = teclado.nextLine();
                            System.out.println("Tipo:\n"
                                    + "1. Película\n"
                                    + "2. Juego");
                            opcion = teclado.nextInt();
                            switch (opcion) {
                                case 1:
                                    tipo = "Pelicula";
                                    break;
                                case 2:
                                    tipo = "Juego";
                                    break;
                            }
                            System.out.println("Costo por unidad:");
                            costo = teclado.nextInt();

                            System.out.println("Género");
                            genero = teclado.next();
                            nodos.setNombre(nombre);
                            nodos.setCosto(costo);
                            nodos.setGenero(genero);
                            nodos.setTipo(tipo);

                            nodos = peliJuegos.AgregarPeliJuego(nodos);
                            inventario.InsertarInventario(nodos);
                            break;

                        case 2:
                            // Variables que nos permiten buscar y modificar el nodo deseado.
                            int option;
                            teclado = new Scanner(System.in);

                            System.out.println("Nombre de la película a modificar");
                            String buscarNombre = teclado.nextLine();

                            System.out.println("Nombre nuevo de película o juego:");
                            nombre = teclado.nextLine();

                            System.out.println("Tipo:\n"
                                    + "1. Película\n"
                                    + "2. Juego");
                            option = teclado.nextInt();

                            switch (option) {
                                case 1:
                                    tipo = "Pelicula";
                                    break;
                                case 2:
                                    tipo = "Juego";
                                    break;
                            }
                            System.out.println("Costo por unidad:");
                            costo = teclado.nextInt();

                            System.out.println("Género");
                            genero = teclado.next();

                            nodos.setNombre(nombre);
                            nodos.setCosto(costo);
                            nodos.setGenero(genero);
                            nodos.setTipo(tipo);
                            peliJuegos.modificarPeliJuego(buscarNombre, nodos);
                            break;

                        case 3:
                            // Variable que nos permite buscar la película que se desea eliminar.
                            teclado = new Scanner(System.in);
                            String delPeli;
                            System.out.println("Nombre de la pelìcula");
                            delPeli = teclado.nextLine();
                            peliJuegos.BorrarPelicula(delPeli);
                            break;
                    }
                    break;

                case 2:
                    // Variables que nos permiten buscar todas las películas con el genero deseado.
                    teclado = new Scanner(System.in);
                    String buscarGenero;
                    System.out.println("Digite el genero deseado");
                    buscarGenero = teclado.nextLine();
                    System.out.println(metodos.printMovie(peliJuegos.getRaiz(), buscarGenero));
                    break;

                case 3:
                    
                    teclado = new Scanner(System.in);
                    String usuario;
                    String movie;
                    System.out.println("1. Efectuar venta\n"
                            + "2. Compras clientes");
                    int opti = teclado.nextInt();
                    switch (opti) {
                        case 1:
                            // Variables que nos permiten registrar el comprador y buscar la película a vender.
                            teclado = new Scanner(System.in);
                            System.out.println("Nombre de comprador:");
                            usuario = teclado.nextLine();
                            System.out.println("Nombre de pelicula");
                            movie = teclado.nextLine();
                            ventas.agregarVenta(usuario, movie, peliJuegos.getRaiz());
                            break;

                        case 2:
                            // Variable que nos permite listar todas las compras del usuario deseado.
                            teclado = new Scanner(System.in);
                            String seekUser;
                            System.out.println("Nombre del usuario");
                            seekUser = teclado.nextLine();
                            metodos.ventasClientes(ventas.getRaiz(), seekUser);
                            break;

                    }
                    break;
                case 4:
                    teclado = new Scanner(System.in);
                    String socio;
                    String peli;

                    System.out.println("1. Efectuar renta\n"
                            + "2. Deshacer renta");
                    opt = teclado.nextInt();

                    switch (opt) {
                        case 1:
                            // Variables que nos permiten identificar al socio y película deseada.
                            teclado = new Scanner(System.in);
                            int mes;
                            System.out.println("Digite el nombre del socio");
                            socio = teclado.nextLine();

                            System.out.println("Pelìcula a rentar");
                            peli = teclado.nextLine();

                            mes = Calendar.MONTH;

                            rentas.agregarRenta(socio, peli, peliJuegos.getRaiz(), usuarios.getRaiz(), mes);
                            break;
                            
                        case 2:
                            /* Variables que nos permiten eliminar la renta deseada por medio de su ID y
                            lleva el control de cuando el socio devolvio la película rentada.
                            */
                            teclado = new Scanner(System.in);
                            int ID;
                            int recepcion;
                            System.out.println("ID de renta:");
                            ID = teclado.nextInt();
                            
                            System.out.println("Mes de recepcion");
                            recepcion = teclado.nextInt();
                            
                            rentas.BorrarRenta(ID, recepcion);
                            break;
                            
                    }
                break;
                        
                    
                case 5:
                    // Método que nos imprime todo el inventario con el que se cuenta.
                    System.out.println(metodos.printInventario(inventario.getRaiz()));
                    break;

                case 6:

                    teclado = new Scanner(System.in);
                    NodoUsuario nuevoUsuario = new NodoUsuario();
                    System.out.println("1. Insertar\n"
                            + "2. Modificar\n"
                            + "3. Eliminar\n"
                            + "4. Listar rentas\n");
                    opt = teclado.nextInt();
                    switch (opt) {
                        case 1:
                            // Variables que identificaran al socio.
                            String nombreSocio = "";
                            System.out.println("Nombre del socio:");
                            nombreSocio = teclado.next();

                            String direccion = "";
                            System.out.println("Dirección del socio:");
                            direccion = teclado.next();

                            int telefono = 0;
                            System.out.println("Número teléfonico del socio:");
                            telefono = teclado.nextInt();

                            nuevoUsuario.setDireccion(direccion);
                            nuevoUsuario.setNombre(nombreSocio);
                            nuevoUsuario.setTelefono(telefono);
                            usuarios.agregarUsuario(nuevoUsuario);
                            break;

                        case 2:
                            
                            /* Variables que nos permiten determinar cuál socio se desea modificar
                                y darle sus atributos.
                            */ 
                            teclado = new Scanner(System.in);
                            String nombreUsu = "";
                            System.out.println("Nombre del usuario a modificar");
                            nombreUsu = teclado.nextLine();

                            String nuevoNombre = "";
                            System.out.println("Nombre del usuario:");
                            nuevoNombre = teclado.next();

                            System.out.println("Dirección del usuario:");
                            direccion = teclado.next();

                            System.out.println("Teléfono del usuario:");
                            telefono = teclado.nextInt();

                            nuevoUsuario.setDireccion(direccion);
                            nuevoUsuario.setNombre(nuevoNombre);
                            nuevoUsuario.setTelefono(telefono);

                            usuarios.modificarUsuario(nuevoUsuario, nombreUsu);
                            break;

                        case 3:
                            
                            // Variable que nos permite determinar cuál socio se desea eliminar.
                            String nombreEliminar = "";
                            System.out.println("Nombre de usuario: ");
                            nombreEliminar = teclado.next();
                            usuarios.BorrarUsuario(nombreEliminar);
                            break;

                        case 4:
                            // Método que nos lista todas las rentas activas de un socio.
                            teclado = new Scanner(System.in);
                            String user;
                            System.out.println("Nombre del usuario:");
                            user = teclado.nextLine();
                            System.out.println(metodos.rentasClientes(rentas.getListaRenta(), user));
                            break;

                    }
                    break;

                case 7:
                    // Método que nos imprime todas las películas que actualmente se encuentran rentadas-
                    System.out.println(metodos.pelisRentaActiva(peliJuegos.getRaiz()));
                    break;

                case 8:
                    // Método que nos imprime la película más rentada / comprada.
                    System.out.println(metodos.masRentaCompra(peliJuegos.getRaiz()));
                    break;

                case 9:
                    // Método que nos imprime la película menos rentada / comprada.
                    System.out.println(metodos.menosRentaCompra(peliJuegos.getRaiz()));
                    break;
            }
               
            } catch (RuntimeException e) {
                System.out.println("Opción incorrecta");
            }
        } while (opt != 10);
    }
}

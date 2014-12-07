/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Listas.ListasJugadores;
import Nodos.NodoJugador;
import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here}
        Scanner teclado = new Scanner(System.in);
        ListasJugadores lista = new ListasJugadores();
        
        NodoJugador nodo1 = new NodoJugador();
        nodo1.setNombre("Armando Alonso");
        nodo1.setEdad(39);
        lista.Insertar(nodo1);
        
        NodoJugador nodo2 = new NodoJugador();
        nodo2.setNombre("Alvaro Sanchéz");
        nodo2.setEdad(30);
        lista.Insertar(nodo2);
        
        NodoJugador nodo3 = new NodoJugador();
        nodo3.setNombre("Alvaro Sanchéz");
        nodo3.setEdad(30);
        lista.Insertar(nodo3);
        
        NodoJugador nodo4 = new NodoJugador();
        nodo4.setNombre("Patrick Pemberton");
        nodo4.setEdad(36);
        lista.Insertar(nodo4);
        
        System.out.println(lista.print());
        
        lista.delete("Patrick Pemberton");
        
        System.out.println(lista.print());
    }
}

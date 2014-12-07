/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarealistas;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Nerea
 */
public class TareaListas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ejercicio1 oLista1Ejercicio1=new Ejercicio1();
        
        NodoNumeros nodoNumero;
        Scanner oScanner=new Scanner(System.in);
        for (int i = 0; i < 7; i++) {
            nodoNumero=new NodoNumeros();
            System.out.println("Digite los numeros");

        nodoNumero.setNumero(oScanner.nextInt());
            oLista1Ejercicio1.Insertar(nodoNumero);
           
        }
        System.out.println("Los numeros de la lista son"+"\n"+ oLista1Ejercicio1.Imprimir());
        System.out.println(oLista1Ejercicio1.Par());
        
        Ejercicio2 oEjercicio2=new Ejercicio2();
        int R=0;
        NodoNumeros3 nodoNumero2;
        for (int i = 0; i < 7; i++) {
        Random oRandom=new Random ();
        R=oRandom.nextInt(10)+1;
        nodoNumero2=new NodoNumeros3();
        nodoNumero2.setRandom(R);
        oEjercicio2.Insertar(nodoNumero2);
        }
        System.out.println("Los numeros creados son"+"\n"+oEjercicio2.Impresion());
        System.out.println("Los numeros al cuadrado son"+"\n"+oEjercicio2.Rcuadrado());
        
        Ejercicio3 oEjercicio3=new Ejercicio3();
        NodoNumeros3 nodoNumero3;
        for (int i = 0; i < 7; i++) {
        nodoNumero3=new NodoNumeros3();
        System.out.println("Digite los numeros");
        nodoNumero3.setNumero3(oScanner.nextInt());
        oEjercicio3.Insertar(nodoNumero3);
        }
        System.out.println("Los numeros de la lista son"+"\n"+ oEjercicio3.Imprimir());
        System.out.println("Los numeros en el cambio son"+"\n"+ oEjercicio3.negativo());
        
        
    }
        
        
    }


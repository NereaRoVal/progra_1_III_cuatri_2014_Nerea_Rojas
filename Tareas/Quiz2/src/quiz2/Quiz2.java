/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package quiz2;

import java.util.Scanner;

/**
 *
 * @author Nerea
 */
public class Quiz2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ejercicio1 oEjercicio1=new Ejercicio1();
        NodoNumeros nodoNumero;
        Scanner oScanner=new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            nodoNumero=new NodoNumeros();
            System.out.println("Digite un numero del 1 al 10");
            nodoNumero.setNumero(oScanner.nextInt());
            oEjercicio1.Insertar(nodoNumero);
        }
        System.out.println(oEjercicio1.ContadorNumeros());
        
    }
    
    }
    

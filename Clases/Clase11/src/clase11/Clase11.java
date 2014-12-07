/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase11;

import java.util.Scanner;

/**
 *
 * @author Nerea
 */
public class Clase11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

     Lineal oLineal = new Lineal();
    Scanner teclado = new Scanner(System.in);
    int [] arreglo = {1,2,3,4,5,6,7,8,9};
    int elemento=teclado.nextInt();
    oLineal.BusquedaLineal(arreglo, elemento);
    System.out.println("El index es :" + oLineal.BusquedaLineal(arreglo, elemento));
    }
    

}

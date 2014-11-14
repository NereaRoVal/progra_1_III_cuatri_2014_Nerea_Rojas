/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicematriz;

import java.util.Scanner;

/**
 *
 * @author Nerea
 */
public class PracticeMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /*Ejercicio1 oEjercicio1=new Ejercicio1();
        Scanner oScanner=new Scanner(System.in);
        System.out.println("Digite el largo de las filas");
        int filas=oScanner.nextInt();
        System.out.println("Digite el largo de las columnas");
        int columnas=oScanner.nextInt();
       oEjercicio1.IniciarMatriz(filas, columnas);
        oEjercicio1.LLenar();
        System.out.print(oEjercicio1.ImpresionPorFila());
        System.out.print(oEjercicio1.ImpresionTriangularSuperior());
        System.out.print(oEjercicio1.ImpresionTriangularInferior());*/
        
        /*Ejercicio2 oEjercicio2=new Ejercicio2();
        Scanner oScanner=new Scanner(System.in);
        System.out.println("Digite el largo de las filas");
        int filas=oScanner.nextInt();
        System.out.println("Digite el largo de las columnas");
        int columnas=oScanner.nextInt();
        oEjercicio2.IniciarMatriz(filas, columnas);
        oEjercicio2.LLenar();
        System.out.print(oEjercicio2.ImpresionPorFila());
        System.out.print(oEjercicio2.DiagonalSuperior());*/
        
        Ejercicio_3 oEjercicio3=new Ejercicio_3();
        Scanner oScanner=new Scanner(System.in);
        System.out.println("Digite el largo de las filas");
        int filas=oScanner.nextInt();
        System.out.println("Digite el largo de las columnas");
        int columnas=oScanner.nextInt();
        oEjercicio3.IniciarMatriz(filas, columnas);
        oEjercicio3.LLenar();
        System.out.print(oEjercicio3.ImpresionPorFila());
        
        
    }
    
}
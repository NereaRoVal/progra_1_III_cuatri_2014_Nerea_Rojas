/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareamatriz;

import java.util.Scanner;

/**
 *
 * @author Nerea
 */
public class TareaMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Ejercicio1
        //______________________________________________________________________

    public void cargar1() {
        teclado = new Scanner(System.in);
        mat = new int[2][5];
        System.out.println("Carga de la matriz por columna:");
        for (int c = 0; c < 5; c++) {
            for (int f = 0; f < 2; f++) {
                System.out.print("Ingrese componente " + " de la fila " + f + " y la columna " + c + " :");
                mat[f][c] = teclado.nextInt();
            }
        }
    }

    public void imprimir1() {
        for (int f = 0; f < 2; f++) {
            for (int c = 0; c < 5; c++) {
                System.out.print(mat[f][c] + " ");
            }
            System.out.println();

        }
    }
    //Ejercicio2
    //__________________________________________________________________________

    public void cargar2() {
        teclado = new Scanner(System.in);
        System.out.print("Cuantas fila tiene la matriz:");
        int filas = teclado.nextInt();
        System.out.print("Cuantas columnas tiene la matriz:");
        int columnas = teclado.nextInt();
        mat = new int[filas][columnas];
        for (int f = 0; f < mat.length; f++) {
            for (int c = 0; c < mat[f].length; c++) {
                System.out.print("Ingrese componente:");
                mat[f][c] = teclado.nextInt();
            }
        }
    }

    public void intercambiar() {
        for (int c = 0; c < mat[0].length; c++) {
            int aux = mat[0][c];
            mat[0][c] = mat[1][c];
            mat[1][c] = aux;
        }
    }

    public void imprimir2() {
        for (int f = 0; f < mat.length; f++) {
            for (int c = 0; c < mat[f].length; c++) {
                System.out.print(mat[f][c] + " ");
            }
            System.out.println();
        }
    }
    //Ejercicio3
    //_________________________________________________________________________

    public void cargar3() {
        teclado = new Scanner(System.in);
        System.out.print("Cuantas fila tiene la matriz:");
        int filas = teclado.nextInt();
        System.out.print("Cuantas columnas tiene la matriz:");
        int columnas = teclado.nextInt();
        mat = new int[filas][columnas];
        for (int f = 0; f < mat.length; f++) {
            for (int c = 0; c < mat[f].length; c++) {
                System.out.print("Ingrese componente:");
                mat[f][c] = teclado.nextInt();
            }
        }
    }

    public void imprimirVertices() {
        System.out.println("Vértice superior izquierdo:");
        System.out.println(mat[0][0]);
        System.out.println("Vértice superior derecho:");
        System.out.println(mat[0][mat[0].length - 1]);
        System.out.println("Vértice inferior izquierdo:");
        System.out.println(mat[mat.length - 1][0]);
        System.out.println("Vértice inferior derecho:");
        System.out.println(mat[mat.length - 1][mat[mat.length - 1].length - 1]);
    }
    //Ejercicio4
    //__________________________________________________________________________

    public void cargar4() {
        teclado = new Scanner(System.in);
        System.out.print("Cuantas fila tiene la matriz:");
        int filas = teclado.nextInt();
        System.out.print("Cuantas columnas tiene la matriz:");
        int columnas = teclado.nextInt();
        mat = new int[filas][columnas];
        for (int f = 0; f < mat.length; f++) {
            for (int c = 0; c < mat[f].length; c++) {
                System.out.print("Ingrese componente:");
                mat[f][c] = teclado.nextInt();
            }
        }
    }

    public void imprimirMayor() {
        int mayor = mat[0][0];
        int filamay = 0;
        int columnamay = 0;
        for (int f = 0; f < mat.length; f++) {
            for (int c = 0; c < mat[f].length; c++) {
                if (mat[f][c] > mayor) {
                    mayor = mat[f][c];
                    filamay = f;
                    columnamay = c;
                }
            }
        }
        System.out.println("El elemento mayor es:" + mayor);
        System.out.println("Se encuentra en la fila:" + filamay + " y en la columna: " + columnamay);
    }

}

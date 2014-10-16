/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaarreglos;

import java.util.Scanner;

/**
 *
 * @author Nerea
 */
public class Arreglo2 {

     private Scanner teclado;
        private int[] vec1;
        private int[] vec2;
        private int[] vecSuma;

        public void cargar() {
            teclado = new Scanner(System.in);
            vec1 = new int[4];
            vec2 = new int[4];
            System.out.println("Carga del primer vector.");
            for (int i = 0; vec1.length < 4; i++) {
                System.out.print("Ingrese elemento:");
                vec1[i] = teclado.nextInt();
            }
            System.out.println("Carga del segundo vector.");
            for (int i = 0; i < 4; i++) {
                System.out.print("Ingrese elemento:");
                vec2[i] = teclado.nextInt();
            }
        }

        public int[] sumarizarVectores() {
            vecSuma = new int[4];
            for (int i = 0; vecSuma.length < 4; i++) {
                vecSuma[i] = vec1[i] + vec2[i];
            }
           return vecSuma;
        }
    }




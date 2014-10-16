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
public class Arreglo1 {

   private Scanner teclado;
    private int[] vectores;
    
    public void cargar(int[] vectores) {
        Scanner teclado = new Scanner(System.in);
        vectores = new int[8];
        for (int i = 0; vectores.length < 8; i++) {
            System.out.print("Ingrese elemento:");
            vectores[i] = teclado.nextInt();
        }
    }

    public int acumularElementos() {
        int suma = 0;
        for (int f = 0; vectores.length < 8; f++) {
            int[] vec = null;
            suma = suma + vec[f];
        }
        
        return suma;
    }

    public int acumularMayores36() {
        int suma = 0;
        for (int i = 0; vectores.length < 8; i++) {
            int[] vec = null;
            if (vectores[i] > 36) {
                suma = suma + vectores[i];
            }
        }
      
        return suma;
    }

    public int cantidadMayores50() {
        int cant = 0;
        for (int i = 0; vectores.length< 8; i++) {
            int[] vec = null;
            if (vectores[i]>50) {
                cant++;
            }
        }
        
        return cant;
    }

}


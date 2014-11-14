/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practicematriz;

import java.util.Random;

/**
 *
 * @author Nerea
 */
public class Ejercicio_2 {
    
     int[][] matrixA=new int[0][0];
    
     
     public void IniciarMatriz(int filas, int columnas)
     {
         matrixA=new int[filas][columnas];
     }
     
     public void LLenar()
     {
         Random oRandom=new Random();
        for (int i = 0; i < matrixA.length; i++) {
             for (int j = 0; j < matrixA[0].length; j++) {
                 matrixA[i][j]=oRandom.nextInt(2) + 0;
             }
         }
    }
     
     public String ImpresionPorFila()
     {
         String temporal="";
         for (int i = 0; i < matrixA.length; i++) {
             for (int j = 0; j < matrixA[0].length; j++) {
                 temporal+= String.valueOf(matrixA[i][j]) +"-";             }             
            temporal+="\n";
         }
         return temporal;     }
     
     public boolean DiagonalSuperior()
     {
         boolean validar=false;
         for (int i = 1; i < matrixA.length; i++) {
             for (int j = 0; j < i; j++) {
                 if(matrixA[i][j]==0)
                 {
                     validar=true;
                 }
                 else
                 {
                     validar=false;
                     break;
                 }
             }
         }
         return validar;
     }
}


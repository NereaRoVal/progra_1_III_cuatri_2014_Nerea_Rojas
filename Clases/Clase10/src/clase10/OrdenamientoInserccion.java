/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase10;

/**
 *
 * @author Nerea
 */
public class OrdenamientoInserccion {

    
    public int[] ordenarInsercion(int[] array){
        int aux;
        for (int i = 1; i < array.length; i++) {
            aux = array[i];
            for (int j = i-1; j >=0 && array[j]>aux; j--) {
                array[j+1]=array[j];
                array[j]=aux;
            }
        }
        return array;
    }
    
}







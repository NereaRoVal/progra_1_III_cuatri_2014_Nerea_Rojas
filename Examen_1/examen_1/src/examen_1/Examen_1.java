/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_1;

/**
 *
 * @author Nerea
 */
public class Examen_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Ejercicio1
        //_________________________________________________________________________


        String abecedario = " <çéáíúóãõABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz>";

        char[] t = texto.toCharArray();

        String palabra = "";

        for (int i = 0; i < t.length; i++) {

            int posicion = abecedario.indexOf(t[i]) + 2;

            if (abecedario.length() <= posicion) {

                posicion = posicion - abecedario.length();

            } //Criando um método de Criptografia  

            palabra = palabra + abecedario.charAt(posicion);

        }

        return palabra;

    }
//Ejercicio2
    //__________________________________________________________________________

}

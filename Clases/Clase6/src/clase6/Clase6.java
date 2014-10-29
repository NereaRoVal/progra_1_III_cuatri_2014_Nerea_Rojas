/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase6;

import java.util.Scanner;

/**
 *
 * @author Nerea
 */
public class Clase6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion = 0;
        Scanner oScanner = new Scanner(System.in);

        do {
            System.out.println("Digite la opcion que desee");
            System.out.println("1: Ejercicio 1");
            System.out.println("2: Ejercicio 2");
            opcion = oScanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Digite el correo a evaluar");
                    oScanner = new Scanner(System.in);
                    Ejercicio1 oEjercicio1 = new Ejercicio1((oScanner.nextLine()));
                    System.out.println(oEjercicio1.Validarcorreo());
                    break;
                case 2:
                    System.out.println("Digite la cadena a evaluar");
                    Ejercicio2 oEjercicio2 = new Ejercicio2();
                    oScanner = new Scanner(System.in);
                    oEjercicio2.setCadena(oScanner.nextLine());
                    System.out.println(oEjercicio2.Medicadena());
                    System.out.println(oEjercicio2.UltimoValor());
                    System.out.println(oEjercicio2.Alrevez());
                    System.out.println(oEjercicio2.Guion());
                    System.out.println(oEjercicio2.Vocales());
                    System.out.println(oEjercicio2.Palindromo());
                    break;
            }
        } while (opcion <= 7);

    }

}

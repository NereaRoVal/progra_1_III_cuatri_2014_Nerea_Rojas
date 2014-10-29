/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase7;

import java.util.Scanner;

/**
 *
 * @author Nerea
 */
public class Clase7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion = 0;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Digite la opcion del ejercicio a evaluar");
            System.out.println("1. Ejercicio 1");
            System.out.println("2. Ejercicio 2");
            System.out.println("3. Ejercicio 3");
            System.out.println("4. Salir");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    Ejercicio1 oEjercicio1 = new Ejercicio1();

                    for (int i = 0; i < 5; i++) {
                        teclado = new Scanner(System.in);
                        System.out.println("Digite el salario del trabajador # " + (i + 1));
                        oEjercicio1.AgregarSalario(teclado.nextDouble());
                    }
                    System.out.println(oEjercicio1.ImprimirSueldos());
                    break;

                case 2:
                    Ejercicio2 oEjercicio2 = new Ejercicio2();
                    for (int i = 0; i < 5; i++) {
                        teclado = new Scanner(System.in);
                        System.out.println("Digite la altura de la persona #" + (i + 1));
                        oEjercicio2.AgregarAltura(teclado.nextFloat());

                    }
                    System.out.println("El promedio es: " + oEjercicio2.Promedio());
                    System.out.println(oEjercicio2.ContarPersonas());
                    break;

                case 3:
                    Ejercicio3 oEjercicio3 = new Ejercicio3();
                    for (int i = 0; i < 4; i++) {
                        teclado = new Scanner(System.in);
                        System.out.println("Digite el salrio del empleado de la manana #" + (i + 1));
                        oEjercicio3.AgregarSalarioManana(teclado.nextFloat());
                    }
                    for (int i = 0; i < 4; i++) {
                        teclado = new Scanner(System.in);
                        System.out.println("Digite el salrio del empleado de la tarde #" + (i + 1));
                        oEjercicio3.AgregarSalarioTarde(teclado.nextFloat());
                    }

                    oEjercicio3.ImprimirGastos();

            }

        } while (opcion < 5);
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

import java.util.Scanner;

/**
 *
 * @author Nerea
 */
public class PrActica2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){

    System.out.println("**Ejercicio 1**");

        //Declaració{
        // TODO code application logic here


        //Declaración de las variables
        int num1;
     int opcion=0;
    Scanner teclado = new Scanner(System.in);

      do
        {
             System.out.println("1.Ejercicio"
                               + "2.Ejercicio"
                               + "3.Ejecicio");
             opcion=teclado.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Digite el mes entre 1 y 12");
                num1 = Integer.parseInt(teclado.nextLine());

                //Creacion del switch
                switch (num1) {

                    case 1:
                        System.out.println("Enero");
                        break;
                    case 2:
                        System.out.println("Febrero");
                        break;
                    case 3:
                        System.out.println("Marzo");
                        break;
                    case 4:
                        System.out.println("Abril");
                        break;
                    case 5:
                        System.out.println("Mayo");
                        break;
                    case 6:
                        System.out.println("Junio");
                        break;
                    case 7:
                        System.out.println("Julio");
                        break;

                    case 8:
                        System.out.println("Agosto");
                        break;
                    case 9:
                        System.out.println("Septiembre");
                        break;
                    case 10:
                        System.out.println("Octubre");
                        break;
                    case 11:
                        System.out.println("Noviembre");
                        break;
                    case 12:
                        System.out.println("Diciembre");
                        break;
                    default:
                        System.out.println("No existe");
                        break;
                }
            case 2:
                int num2;
                System.out.println("Digite el numero");
                num2 = Integer.parseInt(teclado.nextLine());
                switch (num2 % 10) {
                    case 1:
                        System.out.println("El cuadrado del numero es" + num2 * num2);
                        break;

                    case 2:
                        System.out.println("El numero multiplicado por 5 es" + num2 * 5);
                        break;
                    default:
                        System.out.println("El numero dado es+ num2");
                        break;
                }
            case 3:
                char letra;
                String cadena;

                System.out.println("Digite letra (a-e)");
                letra = teclado.next().charAt(0);
                
                //Creacion del switch
                switch (letra) {
                    case 'a':
                    case 'A':
                        System.out.println("Excelente");
                        break;

                    case 'b':
                    case 'B':
                        System.out.println("Bueno");

                        break;
                    case 'c':
                    case 'C':
                        System.out.println("Regular");
                        break;
                    case 'd':
                    case 'D':
                        System.out.println("Malo");
                        break;
                    case 'e':
                    case 'E':
                        System.out.println("Pésimo");
                        break;
                    default :
                        System.out.println("No existe");
                        break;
                        
                }

        }

    
} while(opcion<=3);
}

}
    

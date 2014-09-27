/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1;

import java.util.Scanner;

/**
 *
 * @author Luis B
 */
public class Clase1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double horasTrabajadas=0,costoHora=0,salario=0;//Atributos de la clase main
       
        Scanner teclado= new Scanner(System.in);//Es para leer el teclado
        System.out.print("Digite las horas laboradas por el trabajador"+"\n");
        horasTrabajadas=Double.parseDouble(teclado.nextLine());
        System.out.print("Digite el costo por hora"+"\n");
        costoHora=Double.parseDouble(teclado.nextLine());
        salario=horasTrabajadas*costoHora;
        System.out.print("El salario final es"+" "+salario);
        
    }
    
}

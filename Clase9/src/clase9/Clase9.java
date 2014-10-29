/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase9;

/**
 *
 * @author Nerea
 */
public class Clase9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Ejercicio1 oEjercicio1=new Ejercicio1();
        oEjercicio1.CrearMatriz(3, 5);
        oEjercicio1.CargarMatriz();
        System.out.print(oEjercicio1.Imprimir());
        
        Ejercicio2 oEjercicio2=new Ejercicio2();
        oEjercicio2.CrearMatriz(4, 4);
        oEjercicio2.CargarMatriz();
       System.out.print(oEjercicio2.Imprimir());
   }
   
}
        
    
    


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tda;

import Listas.Pila;
import Nodos.NodoPila;

/**
 *
 * @author Nerea
 */
public class TDA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Pila oPila=new Pila();       
      NodoPila cuenta1=new NodoPila();
        cuenta1.setCliente("Mario Mortadela");
        cuenta1.setCuenta("2-066696-2252-5524");
        oPila.Push(cuenta1);
        
        NodoPila cuenta2=new NodoPila();
        cuenta2.setCliente("Chepe Figures");
        cuenta2.setCuenta("2-66666-555-5524");
        oPila.Push(cuenta2);
        
        NodoPila cuenta3=new NodoPila();
        cuenta3.setCliente("Guille Solis");
        cuenta3.setCuenta("2-77777-2252-888888");
        oPila.Push(cuenta3);
        
        NodoPila cuenta4=new NodoPila();
        cuenta4.setCliente("Carlos Alvarez");
        cuenta4.setCuenta("2-747444-2252-5524");
        oPila.Push(cuenta4);
        
       /* System.out.println( oPila.Imprimir());
        oPila.Pop();
        System.out.println( oPila.Imprimir());
        oPila.Pop();
        System.out.println( oPila.Imprimir());
        oPila.Pop();
        System.out.println( oPila.Imprimir());
        oPila.Pop();
       System.out.println(  oPila.Imprimir());*/
       
       
        Cola oCola=new Cola();
        
        NodoCola tiquete1=new NodoCola();
        tiquete1.setCliente("Mario Mortadela");
        tiquete1.setTiquete("2-066696-2252-5524");
        oCola.Encolar(tiquete1);
        
        NodoCola tiquete2=new NodoCola();
        tiquete2.setCliente("Chepe Figures");
        tiquete2.setTiquete("2-66666-555-5524");
        oCola.Encolar(tiquete2);
        
        NodoCola tiquete3=new NodoCola();
        tiquete3.setCliente("Guille Solis");
        tiquete3.setTiquete("2-77777-2252-888888");
        oCola.Encolar(tiquete3);
        
        NodoCola tiquete4=new NodoCola();
        tiquete4.setCliente("Carlos Alvarez");
        tiquete4.setTiquete("2-747444-2252-5524");
        oCola.Encolar(tiquete4);
        
        System.out.println( oCola.Imprimir());
        oCola.Desencolar();
        System.out.println( oCola.Imprimir());
        oCola.Desencolar();
        System.out.println( oCola.Imprimir());
        oCola.Desencolar();
        
       System.out.println( oCola.Imprimir());
  oCola.Desencolar();
       System.out.println(  oCola.Imprimir());
    }
}  
}

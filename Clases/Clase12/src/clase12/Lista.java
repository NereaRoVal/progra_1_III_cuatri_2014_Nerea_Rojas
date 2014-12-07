/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase12;

/**
 *
 * @author Nerea
 */
public class Lista {
   
   private Ejercicio_1 raiz;
    
    public void Insertar(Ejercicio_1 elemento)
    {
       Ejercicio_1 nuevo;
       nuevo=new Ejercicio_1();
        nuevo.setMatricula(elemento.getMatricula());
        nuevo.setDueno(elemento.getDueno());
        nuevo.setMarca(elemento.getMarca());
       
       if(raiz==null)
       {
           nuevo.setSiguiente(null);
           raiz=nuevo;
        }
       else
        {
            Ejercicio_1 auxiliar=raiz;
            while (auxiliar.getSiguiente()!=null) {
                auxiliar=auxiliar.getSiguiente();
            }
            auxiliar.setSiguiente(nuevo);
        }        
    } 
    
    public void Imprimir()
    {
        Ejercicio_1 recorrido=raiz;
        System.out.println("Listado de todos los elementos de la lista");
        while(recorrido!=null)
        {
           System.out.println("La marca es: "+recorrido.getMarca()+ ",el dueño es: "+recorrido.getDueno()
                    + " , la matricula es: "+recorrido.getMatricula() );
            recorrido=recorrido.getSiguiente();
        }
        System.out.println();
    }
}
    
    
    


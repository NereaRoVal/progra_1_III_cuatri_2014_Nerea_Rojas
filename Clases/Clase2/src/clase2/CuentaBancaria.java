/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase2;
/**
 *
 * @author Nerea
 */
public class CuentaBancaria {
    //Declaracion de variables
    
private double Saldoinicial;
private boolean hayError;
//Metodo constructor
public CuentaBancaria(){
    Saldoinicial=0;
    hayError=false;
} //Para aumentar la cuenta del banco
    public  void Deposito(double  monto) {
        setSaldoinicial(getSaldoinicial()+monto);
        }
    //para retirar el dinero
    public void retiro(double  monto){
        if(getSaldoinicial()>=monto)
            setSaldoinicial(getSaldoinicial()-monto);
        else
            setHayError(true);
    }
//Metodos get y set

public double getSaldoinicial() {
        return Saldoinicial;
    }

    public void setSaldoinicial(double Saldoinicial) {
        this.Saldoinicial = Saldoinicial;
    }

    public boolean isHayError() {
        return hayError;
    }

    public void setHayError(boolean hayError) {
        this.hayError = hayError;
        
        
        
        
        
    }
    
}

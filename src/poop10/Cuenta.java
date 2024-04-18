/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop10;

/**
 * Clase Cuenta que cuenta con su atributo saldo.
 * @author Silvia Jamile Rojas Nava 
 */
public class Cuenta {
   private float saldo;
   
/**
 * Constructor vacìo. 
 */
   public Cuenta(){
       
   }

/**
 * Constructor lleno.
 * @param Saldo el saldo de la cuenta.
 */
    public Cuenta(float Saldo) {
        this.saldo = Saldo;
    }

/**
 * Mètodos de servicio get y set. Se regresa el saldo de una cuenta.
 * @return regresa una variable saldo.
 */
    public float getSaldo() {
        return saldo;
    }

/**
 * Se accede al valor del saldo y se modifica asignando un saldo al objeto. 
 * @param Saldo asigna el nuevo valor al atributo saldo del objeto.
 */
    public void setSaldo(float Saldo) {
        this.saldo = Saldo;
    }
   
/**
 * Mètodo de acciòn depositar para depositar un monto en la cuenta.
 * @param monto se asigna el monto a depositar en la cuenta.
 */
   public void depositar(float monto){
       System.out.println("Se esta depositando: "+monto+"pesos");
       saldo+=monto;
       consultar();
   }
   
/**
 * Mètodo de acciòn retirar para retirar un monto en la cuenta.
 * @param monto se asigna el monto a retirar en la cuenta.
 * @throws SaldoInsuficienteException una excepciòn para cuando el saldo en la
 * cuenta es insfuciente para realizar la retiraciòn de un monto.
 */
   public void retirar(float monto) throws SaldoInsuficienteException{
       System.out.println("Se estan retirando "+monto+"pesos");
       if(monto>saldo){
           throw new SaldoInsuficienteException();
       }
       saldo -=monto;
       consultar();
   }
    
/**
 * Mètodo de acciòn. Imprime un mensaje que simula que se està consultando el saldo. 
 */
   public void consultar(){
       System.out.println("Consultando saldo");
   }

/**
 * Mètodo de sobreescritura toString. Devuelve una cadena con el saldo.
 * @return regresa una cadena de caracteres que representa el objeto Saldo.
 */
    @Override
    public String toString() {
        return "Cuenta{" + "saldo=" + saldo + '}';
    }
   
   
}
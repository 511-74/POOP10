/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop10;

/**
 * Importaciones de las utilidades.
 */
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase main (poop10).
 * @author Silvia Jamile Rojas Nava 
 */
public class POOP10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arr1 =new int[2];
        try{
        for(int i=0; i< 2;i++){
            arr1[i]=i;
        }
        for(int i=0; i<=2; i++){
            System.out.println(arr1[i]);
        }
    
}catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
           // e.printStackTrace();
}
        System.out.println(arr1[0]);
        System.out.println("Hola mundo");
        
        int a,b,c=0;
        try{
        a=10;
        //b=2;
        b=0;
        c=a/b;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
           // e.printStackTrace();
            System.out.println("Codigo del AIOOBE");
    
}catch(ArithmeticException e){
            System.out.println(e.getMessage());
            System.out.println("Codigo de ArithmeticException");
        }
        System.out.println(c);
        System.out.println("#######################################");
        
        System.out.println("El resultado es "+division(1,2));
      //  System.out.println("El resultado de la segunda division es"+division(100,0));
        try{
            division(5,2);
            System.out.println("El resultado de la segunda division es"+division(100,0));
        }catch(ArithmeticException e){
            System.out.println(e.getMessage()); 
        }
       Cuenta cuenta = new Cuenta(100);
       cuenta.consultar();
        try {
            cuenta.retirar(50);
            cuenta.retirar(100);
            cuenta.retirar(500);
        } catch (SaldoInsuficienteException ex) {
            //De la clase POOP obtenemos el nombre y en el nivel si es severo lo marcara en rojo , y despues mostrara un mensaje si no , es null por defecto 
           // Logger.getLogger(POOP10.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }
   
        
   }

/**
 * Realiza la división de dos números enteros y devuelve el resultado en formato flotante.
 * Este método arroja una excepción de tipo ArithmeticException en caso de que el divisor sea cero.
 * @param a el dividendo de la operación de división. Es un entero.
 * @param b el divisor de la operación de división. Es un entero.
 * @return El resultado de la división como un número de punto flotante.
 * @throws ArithmeticException es una excepción por si el divisor es cero evitar la división entre cero.
 */
    private static float division(int a, int b) throws ArithmeticException {
      //  throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
       if(b==0){
           throw new ArithmeticException("Division entre Cero");
       }else{
           return (float)a/b;
       }
       
    }
    
    
}

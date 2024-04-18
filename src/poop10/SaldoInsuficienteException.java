/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop10;

/**
 * Clase SaldoInsuficienteException.
 * @author Silvia Jamile Rojas Nava 
 */
public class SaldoInsuficienteException extends Exception {
    
/**
 *  Constructor para una exception, lo que hace es mandar un mensaje al 
 *  momento de hacer una excepciòn para indicar que hay saldo insuficiente.
 */
    public SaldoInsuficienteException(){
        super("Saldo Insuficiente.....");
    }
    
    
}


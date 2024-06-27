/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

/**
 *
 * @author diana
 */
public class BOException extends Exception{
    
    
    public BOException() {
    }

     // Constructor que acepta un mensaje de error
    public BOException(String message) {
        super(message);
    }

    // Constructor que acepta un mensaje de error y una causa
    public BOException(String message, Throwable cause) {
        super(message, cause);
    }

     // Constructor que acepta una causa
    public BOException(Throwable cause) {
        super(cause);
    }

    // Constructor que acepta un mensaje de error, una causa, y permite la
    // supresión habilitada y el rastreo de la pila escribible
    public BOException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

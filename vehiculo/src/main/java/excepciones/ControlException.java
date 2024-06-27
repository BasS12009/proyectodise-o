/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 * Clase ControlException que extiende de Exception.
 * Representa una excepción personalizada para manejar errores en la capa de control.
 * 
 * Autor: skevi
 */
public class ControlException extends Exception {

    /**
     * Constructor por defecto de ControlException.
     */
    public ControlException() {
        super();
    }

    /**
     * Constructor de ControlException con un mensaje de error.
     * 
     * @param message El mensaje de error.
     */
    public ControlException(String message) {
        super(message);
    }

    /**
     * Constructor de ControlException con un mensaje de error y una causa.
     * 
     * @param message El mensaje de error.
     * @param cause La causa de la excepción.
     */
    public ControlException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Constructor de ControlException con una causa.
     * 
     * @param cause La causa de la excepción.
     */
    public ControlException(Throwable cause) {
        super(cause);
    }

    /**
     * Constructor de ControlException con un mensaje de error, una causa, 
     * la opción de habilitar supresión y la opción de hacer el stacktrace escribible.
     * 
     * @param message El mensaje de error.
     * @param cause La causa de la excepción.
     * @param enableSuppression Si se debe habilitar la supresión.
     * @param writableStackTrace Si el stacktrace es escribible.
     */
    public ControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}


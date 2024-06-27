/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 *
 * @author diana
 */
public class fachadaException extends Exception {

    public fachadaException() {
    }

    public fachadaException(String message) {
        super(message);
    }

    public fachadaException(String message, Throwable cause) {
        super(message, cause);
    }

    public fachadaException(Throwable cause) {
        super(cause);
    }

    public fachadaException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}

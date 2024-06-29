/**
 * FachadaException.java
 * 
* Excepción personalizada para errores en la fachada de la aplicación.
 */
package exception;

/**
 * @author/(s):
 * Diana Sofia Bastidas Osuna - 245804,
 * Carlos Damian Garcia Bernal - 247614,
 * Kevin Jared Sánchez Figueroa - 240798,
 * Daniel Alejandro Castro Félix - 235294.
 */
public class FachadaException extends Exception{

   /**
     * Constructor sin parámetros de FachadaException.
     */
    public FachadaException() {
    }

    /**
     * Constructor de FachadaException que recibe un mensaje de error.
     * 
     * @param message El mensaje de error.
     */
    public FachadaException(String message) {
        super(message);
    }

    /**
     * Constructor de FachadaException que recibe un mensaje de error y una causa.
     * 
     * @param message El mensaje de error.
     * @param cause La causa del error.
     */
    public FachadaException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Constructor de FachadaException que recibe una causa del error.
     * 
     * @param cause La causa del error.
     */
    public FachadaException(Throwable cause) {
        super(cause);
    }

    /**
     * Constructor de FachadaException que recibe un mensaje de error, una causa, 
     * y configuraciones para habilitar supresión y rastreo de pila.
     * 
     * @param message El mensaje de error.
     * @param cause La causa del error.
     * @param enableSuppression Habilitar supresión.
     * @param writableStackTrace Habilitar rastreo de pila.
     */
    public FachadaException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
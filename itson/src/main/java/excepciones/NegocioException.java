/**
 * NegocioException.java
 * 
 * Clase de excepción personalizada para manejar errores de negocio en la aplicación;
 * Brinda múltiples constructores para diferentes escenarios de error.
 */
package excepciones;

/**
 * @author/(s):
 * Diana Sofia Bastidas Osuna - 245804,
 * Carlos Damian Garcia Bernal - 247614,
 * Kevin Jared Sánchez Figueroa - 240798,
 * Daniel Alejandro Castro Félix - 235294.
 */
public class NegocioException extends Exception {

    /**
     * Constructor por omisión de la excepción NegocioException.
     */
    public NegocioException() {
    }

    /**
     * Constructor de la excepción NegocioException que recibe un mensaje de error
     * como parámetro;
     * 
     * @param message El mensaje de error que describe la excepción.
     */
    public NegocioException(String message) {
        super(message);
    }

    /**
     * Constructor de la excepción NegocioException que recibe un mensaje de error y una causa
     * como parámetros.
     *
     * @param message El mensaje de error que describe la excepción.
     * @param cause   La causa original de la excepción.
     */
    public NegocioException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Constructor de la excepción NegocioException que recibe una causa como parámetro.
     *
     * @param cause La causa original de la excepción.
     */
    public NegocioException(Throwable cause) {
        super(cause);
    }

    /**
     * Constructor de la excepción NegocioException que recibe un mensaje de error, una causa,
     * una indicación para la supresión y una indicación para la pila.
     *
     * @param message            El mensaje de error que describe la excepción.
     * @param cause              La causa original de la excepción.
     * @param enableSuppression  Si la supresión está habilitada o deshabilitada.
     * @param writableStackTrace Si la traza de la pila debe ser escrita.
     */
    public NegocioException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}

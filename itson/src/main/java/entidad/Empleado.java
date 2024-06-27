/**
 * Empleado.java
 * 
 * Clase Empleado que representa a un empleado con sus respectivos atributos y
 * proporciona métodos para acceder y modificar los datos del empleado.
 */
package entidad;

/**
 * @author/(s):
 * Diana Sofia Bastidas Osuna - 245804,
 * Carlos Damian Garcia Bernal - 247614,
 * Kevin Jared Sánchez Figueroa - 240798,
 * Daniel Alejandro Castro Félix - 235294.
 */
public class Empleado {
    private int id;
    private String correo;
    private String contraseña;
    private String tipo;

     /**
     * Constructor por omisión.
     */
    public Empleado() {
    }

    /**
     * Constructor que inicializa los atributos correo y contraseña del empleado.
     * 
     * @param correo El correo electrónico del empleado.
     * @param contraseña La contraseña del empleado.
     */
    public Empleado(String correo, String contraseña) {
        this.correo = correo;
        this.contraseña = contraseña;
    }

    /**
     * Constructor que inicializa los atributos id, correo y contraseña del empleado.
     * 
     * @param id El ID del empleado.
     * @param correo El correo electrónico del empleado.
     * @param contraseña La contraseña del empleado.
     */
    public Empleado(int id, String correo, String contraseña) {
        this.id = id;
        this.correo = correo;
        this.contraseña = contraseña;
    }

    /**
     * Constructor que inicializa los atributos correo, contraseña y tipo del empleado.
     * 
     * @param correo El correo electrónico del empleado.
     * @param contraseña La contraseña del empleado.
     * @param tipo El tipo de empleado.
     */
    public Empleado(String correo, String contraseña, String tipo) {
        this.correo = correo;
        this.contraseña = contraseña;
        this.tipo = tipo;
    }

    /**
     * Constructor que inicializa todos los atributos del empleado.
     * 
     * @param id El ID del empleado.
     * @param correo El correo electrónico del empleado.
     * @param contraseña La contraseña del empleado.
     * @param tipo El tipo de empleado.
     */
    public Empleado(int id, String correo, String contraseña, String tipo) {
        this.id = id;
        this.correo = correo;
        this.contraseña = contraseña;
        this.tipo = tipo;
    }

    /**
     * Obtiene el ID del empleado.
     * 
     * @return El ID del empleado.
     */
    public int getId() {
        return id;
    }

    /**
     * Establece el ID del empleado.
     * 
     * @param id El ID del empleado.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtiene el correo electrónico del empleado.
     * 
     * @return El correo electrónico del empleado.
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Establece el correo electrónico del empleado.
     * 
     * @param correo El correo electrónico del empleado.
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * Obtiene la contraseña del empleado.
     * 
     * @return La contraseña del empleado.
     */
    public String getContraseña() {
        return contraseña;
    }

    /**
     * Establece la contraseña del empleado.
     * 
     * @param contraseña La contraseña del empleado.
     */
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    /**
     * Obtiene el tipo de empleado.
     * 
     * @return El tipo de empleado.
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Establece el tipo de empleado.
     * 
     * @param tipo El tipo de empleado.
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", correo=" + correo + ", contrase\u00f1a=" + contraseña + ", tipo=" + tipo + '}';
    }
    
    
}
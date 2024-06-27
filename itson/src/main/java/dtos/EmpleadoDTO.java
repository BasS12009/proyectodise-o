/**
 * EmpleadoDTO.java
 * 
 * Clase que representa el Data Transfer Object (DTO) para la entidad Empleado;
 * 
 * Clase EmpleadoDTO que encapsula los datos de un empleado y
 * proporciona métodos para acceder y modificar dichos datos.
 */
package dtos;

/**
 * @author/(s):
 * Diana Sofia Bastidas Osuna - 245804,
 * Carlos Damian Garcia Bernal - 247614,
 * Kevin Jared Sánchez Figueroa - 240798,
 * Daniel Alejandro Castro Félix - 235294.
 */
public class EmpleadoDTO {
    
    private int id;
    private String correo;
    private String contraseña;
    private String tipo;

    /**
     * Constructor por omisión.
     */
    public EmpleadoDTO() {
    }

    /**
     * Constructor que inicializa los atributos id, correo y contraseña del empleado.
     * 
     * @param id El ID del empleado.
     * @param correo El correo electrónico del empleado.
     * @param contraseña La contraseña del empleado.
     */
    public EmpleadoDTO(int id, String correo, String contraseña) {
        this.id = id;
        this.correo = correo;
        this.contraseña = contraseña;
    }

    /**
     * Constructor que inicializa los atributos correo y contraseña del empleado.
     * 
     * @param correo El correo electrónico del empleado.
     * @param contraseña La contraseña del empleado.
     */
    public EmpleadoDTO(String correo, String contraseña) {
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
    public EmpleadoDTO(String correo, String contraseña, String tipo) {
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
    public EmpleadoDTO(int id, String correo, String contraseña, String tipo) {
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
}

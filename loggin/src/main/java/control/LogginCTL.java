/**
 * LogginCTL.java
 * 
 * Controlador para el proceso de inicio de sesión.
 */
package control;

import dtos.EmpleadoDTO;
import excepciones.ControlException;
import exception.CtlException;
import interfaces.IEmpleadoCTL;

/**
 * @author/(s):
 * Diana Sofia Bastidas Osuna - 245804,
 * Carlos Damian Garcia Bernal - 247614,
 * Kevin Jared Sánchez Figueroa - 240798,
 * Daniel Alejandro Castro Félix - 235294.
 */
public class LogginCTL {
    
    private IEmpleadoCTL empleadoBO;

    /**
     * Constructor de la clase LogginCTL que inicializa el objeto empleadoBO.
     */
    public LogginCTL() {
       this.empleadoBO = new EmpleadoCTL();
    }
    
    /**
     * Verifica si un empleado existe en el sistema.
     * 
     * @param empleadoDTO El DTO del empleado a verificar.
     * @return true si el empleado existe, false en caso contrario.
     * @throws CtlException Si ocurre un error de control durante la verificación.
     */
    public boolean existe(EmpleadoDTO empleadoDTO) throws CtlException {
        try{
            return this.empleadoBO.existenciaAdmin(empleadoDTO);
        }
        catch(ControlException ex){
                throw new CtlException(ex.getMessage());
        }
    }
    
    
    /**
     * Valida si los campos de correo y contraseña no están vacíos.
     * 
     * @param correo El correo a validar.
     * @param contraseña La contraseña a validar.
     * @return true si ambos campos no están vacíos, false en caso contrario.
     * @throws CtlException Si alguno de los campos está vacío.
     */
    public boolean validar(String correo, String contraseña) throws CtlException{
        if (correo.isEmpty()) {
            throw new CtlException("Por favor, llene el campo de correo");
        }
        else if (contraseña.isEmpty()) {
            throw new CtlException("Por favor, llene el campo de contraseña");
        }
        else{
            return true;
        }
    }
    
}
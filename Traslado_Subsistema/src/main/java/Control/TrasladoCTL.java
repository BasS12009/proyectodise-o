/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import BO.TrasladoBO;
import DTOs.TrasladoDTO;
import excepciones.fachadaException;
import interfaces.ITrasladoBO;
import javax.mail.PasswordAuthentication;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


/**
 *
 * @author diana
 */
public class TrasladoCTL { 
    
//     private IEmpleadoCTL empleado = new EmpleadoCTL();
//     
////    public TrasladoCTL(EmpleadoCTL empleado) {
////        this.empleado = empleado;
////    }

    
    
    private final ITrasladoBO traslado;

    public TrasladoCTL() {
       this.traslado = new TrasladoBO();
    }
    
    
    
    
    
    public void solicitarTraslado(TrasladoDTO trasladoDTO) throws fachadaException {
      try {
            traslado.agregar(trasladoDTO);
        } catch (Exception e) {
            // Manejar cualquier excepción que pueda ocurrir y envolverla en una FachadaException
            throw new fachadaException("Error al solicitar el traslado: " + e.getMessage(), e);
        }
}

    public boolean validarTrasladoDTO(TrasladoDTO trasladoDTO) throws fachadaException {
    if (trasladoDTO.getMotivo() == null || trasladoDTO.getMotivo().isEmpty()) {
        throw new fachadaException("El motivo del traslado no puede estar vacío.");
    }

    if (trasladoDTO.getPersonas() <= 0) {
        throw new fachadaException("El número de personas debe ser mutiplo de 5.");
    }

    if (trasladoDTO.getFechaHoraSalida() == null) {
        throw new fachadaException("La fecha y hora de salida no pueden ser nulas.");
    }

    if (trasladoDTO.getFechaHoraRegreso() == null) {
        throw new fachadaException("La fecha y hora de regreso no pueden ser nulas.");
    }

    if (trasladoDTO.getFechaHoraSalida().isAfter(trasladoDTO.getFechaHoraRegreso())) {
        throw new fachadaException("La fecha y hora de salida debe ser anterior a la fecha y hora de regreso.");
    }
    
    return true;
}

  public void enviarCorreo(TrasladoDTO original, TrasladoDTO devolucion) throws fachadaException {
        // Configurar propiedades del correo
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        String username = System.getenv("diana.bastidas245804@potros.itson.edu.mx"); 
        String password = System.getenv(""); 

        // Crear sesión de correo
        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
           @Override
           protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
           }
           });

        try {
            // Crear mensaje de correo
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress("skevinjaredfigueroa@gmail.com"));
            message.setSubject("Comparación de Traslados");
            message.setText("probando probando 123 123");

            // Enviar mensaje de correo
            Transport.send(message);
            System.out.println("Correo enviado exitosamente.");
    } catch (MessagingException e) {
            throw new fachadaException("Error al enviar el correo");
    }
    

}
   private String contenido(TrasladoDTO original, TrasladoDTO devolucion) {
    // Generar el contenido del correo comparando los campos de los dos traslados
    StringBuilder contenido = new StringBuilder();
    contenido.append("Comparación de Traslados:\n\n");

    contenido.append("Folio: ").append(original.getFolio()).append("\n");
 
    contenido.append("Motivo:").append(original.getMotivo()).append("\n");
 
    contenido.append("Personas: ").append(original.getPersonas()).append("\n");
    
    contenido.append("Fecha y Hora de Salida: ").append(original.getFechaHoraSalida()).append("\n");

    contenido.append("Fecha y Hora de Regreso: ").append(original.getFechaHoraRegreso()).append("\n");
    
    contenido.append("Disponibilidad: ").append(original.isDisponibilidad()).append("\n");
   
    contenido.append("Vehículo: ").append(original.getVehiculo()).append("\n");
    
    contenido.append("Estado del Vehículo: ").append(original.getEstadoVehiculo()).append("\n");
  
    contenido.append("Llantas: ").append(original.getLlantas()).append("\n");
   
    contenido.append("Carrocería: ").append(original.getCarroceria()).append("\n");
    
    contenido.append("Combustible: ").append(original.getCombustible()).append("\n");

    return contenido.toString();
}
}
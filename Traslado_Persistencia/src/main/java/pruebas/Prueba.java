/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebas;

import DAOs.TrasladoDAO;
import DAOs.VehiculoDAO;
import Entidades.Traslado;
import Entidades.Vehiculo;
import excepciones.DAOException;
import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author diana
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            VehiculoDAO vehiculoDAO = new VehiculoDAO();
            TrasladoDAO trasladoDAO = new TrasladoDAO();
            
            // Crear 15 instancias de Vehiculo con diferentes datos
            Vehiculo vehiculo1 = new Vehiculo(1,"Toyota", "Corolla", 2020, "Sedan", "ABC123", "5");
            Vehiculo vehiculo2 = new Vehiculo(2, "Honda", "Civic", 2019, "Sedan", "DEF456", "10");
            Vehiculo vehiculo3 = new Vehiculo(3, "Ford", "Focus", 2018, "Hatchback", "GHI789", "25");
            Vehiculo vehiculo4 = new Vehiculo(4, "Chevrolet", "Malibu", 2021, "Sedan", "JKL012", "25");
            Vehiculo vehiculo5 = new Vehiculo(5, "Nissan", "Altima", 2020, "Sedan", "MNO345", "15");
            Vehiculo vehiculo6 = new Vehiculo(6, "BMW", "X5", 2019, "SUV", "PQR678", "10");
            Vehiculo vehiculo7 = new Vehiculo(7, "Audi", "A4", 2021, "Sedan", "STU901", "10");
            Vehiculo vehiculo8 = new Vehiculo(8, "Mercedes-Benz", "C-Class", 2020, "Sedan", "VWX234", "15");
            Vehiculo vehiculo9 = new Vehiculo(9, "Volkswagen", "Golf", 2019, "Hatchback", "YZA567", "15");
            Vehiculo vehiculo10 = new Vehiculo(10, "Hyundai", "Elantra", 2018, "Sedan", "BCD890", "25");
            Vehiculo vehiculo11 = new Vehiculo(11, "Kia", "Sorento", 2021, "SUV", "EFG123", "10");
            Vehiculo vehiculo12 = new Vehiculo(12, "Subaru", "Outback", 2020, "Wagon", "HIJ456", "10");
            Vehiculo vehiculo13 = new Vehiculo(13, "Mazda", "CX-5", 2019, "SUV", "KLM789", "10");
            Vehiculo vehiculo14 = new Vehiculo(14, "Jeep", "Cherokee", 2018, "SUV", "NOP012", "5");
            Vehiculo vehiculo15 = new Vehiculo(15, "Tesla", "Model 3", 2021, "Sedan", "QRS345", "5");
            
            // Agregar los vehículos a la base de datos
            vehiculoDAO.agregar(vehiculo1);
            vehiculoDAO.agregar(vehiculo2);
            vehiculoDAO.agregar(vehiculo3);
            vehiculoDAO.agregar(vehiculo4);
            vehiculoDAO.agregar(vehiculo5);
            vehiculoDAO.agregar(vehiculo6);
            vehiculoDAO.agregar(vehiculo7);
            vehiculoDAO.agregar(vehiculo8);
            vehiculoDAO.agregar(vehiculo9);
            vehiculoDAO.agregar(vehiculo10);
            vehiculoDAO.agregar(vehiculo11);
            vehiculoDAO.agregar(vehiculo12);
            vehiculoDAO.agregar(vehiculo13);
            vehiculoDAO.agregar(vehiculo14);
            vehiculoDAO.agregar(vehiculo15);
            
//          Traslado traslado1 = new Traslado("FOL123", "Conferencia", 3, LocalDateTime.now().minusDays(1), LocalDateTime.now(), true, vehiculo1, "Sin daños", "Excelente", "100%", "Buen estado");
//          Traslado traslado2 = new Traslado("FOL124", "Visita empresa", 2, LocalDateTime.now().minusHours(3), LocalDateTime.now().plusHours(2), true, vehiculo2, "Sin combustible", "Regular", "50%", "Desgastado");
//          Traslado traslado3 = new Traslado("FOL125", "Conference", 4, LocalDateTime.now().minusDays(2), LocalDateTime.now().plusDays(2), true, vehiculo3, "Dañado", "Dañada", "25%", "Aire bajo");
//          Traslado traslado4 = new Traslado("FOL126", "City Tour", 5, LocalDateTime.now().minusWeeks(1), LocalDateTime.now().plusWeeks(1), true, vehiculo4, "Sin daños", "Excelente", "75%", "Buen estado");
//          Traslado traslado5 = new Traslado("FOL127", "Wedding", 7, LocalDateTime.now().minusMonths(1), LocalDateTime.now().plusMonths(1), true, vehiculo5, "Sin daños", "Regular", "50%", "Buen estado");
           
          
//
//          // Agregar traslados a la base de datos
//            trasladoDAO.agregar(traslado1);
//            trasladoDAO.agregar(traslado2);
//            trasladoDAO.agregar(traslado3);
//            trasladoDAO.agregar(traslado4);
//            trasladoDAO.agregar(traslado5);
            
            System.out.println("15 vehiculos agregados correctamente.");
        } catch (DAOException ex) {
            Logger.getLogger(Prueba.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

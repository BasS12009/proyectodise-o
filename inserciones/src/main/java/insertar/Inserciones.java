/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package insertar;

import dtos.VehiculoDTO;
import bo.PrestamoBO;
import bo.VehiculoBO;
import java.time.LocalDate;

/**
 *
 * @author skevi
 */
public class Inserciones {
    
    public void insertar() throws Exception {
    // Vehículos para 25 personas (GMC)
    VehiculoDTO vehiculo1 = new VehiculoDTO(1, "GMC", "MODEL1", 2015, "GRANDE", "ABC-123");
    VehiculoDTO vehiculo2 = new VehiculoDTO(1, "GMC", "MODEL2", 2016, "GRANDE", "DEF-456");
    VehiculoDTO vehiculo3 = new VehiculoDTO(1, "GMC", "MODEL3", 2017, "GRANDE", "GHI-789");
    VehiculoDTO vehiculo4 = new VehiculoDTO(1, "GMC", "MODEL4", 2018, "GRANDE", "JKL-012");
    VehiculoDTO vehiculo5 = new VehiculoDTO(1, "GMC", "MODEL5", 2019, "GRANDE", "MNO-345");

    // Vehículos para 20 personas (Toyota)
    VehiculoDTO vehiculo6 = new VehiculoDTO(1, "TOYOTA", "MODEL1", 2016, "MEDIANO", "PQR-678");
    VehiculoDTO vehiculo7 = new VehiculoDTO(1, "TOYOTA", "MODEL2", 2017, "MEDIANO", "STU-901");
    VehiculoDTO vehiculo8 = new VehiculoDTO(1, "TOYOTA", "MODEL3", 2018, "MEDIANO", "VWX-234");
    VehiculoDTO vehiculo9 = new VehiculoDTO(1, "TOYOTA", "MODEL4", 2019, "MEDIANO", "YZA-567");
    VehiculoDTO vehiculo10 = new VehiculoDTO(1, "TOYOTA", "MODEL5", 2020, "MEDIANO", "BCD-890");

    // Vehículos para 15 personas (Mazda)
    VehiculoDTO vehiculo11 = new VehiculoDTO(1, "MAZDA", "MODEL1", 2017, "PEQUEÑO", "EFG-123");
    VehiculoDTO vehiculo12 = new VehiculoDTO(1, "MAZDA", "MODEL2", 2018, "PEQUEÑO", "HIJ-456");
    VehiculoDTO vehiculo13 = new VehiculoDTO(1, "MAZDA", "MODEL3", 2019, "PEQUEÑO", "KLM-789");
    VehiculoDTO vehiculo14 = new VehiculoDTO(1, "MAZDA", "MODEL4", 2020, "PEQUEÑO", "NOP-012");
    VehiculoDTO vehiculo15 = new VehiculoDTO(1, "MAZDA", "MODEL5", 2021, "PEQUEÑO", "QRS-345");

    // Vehículos para 10 personas (Ford)
    VehiculoDTO vehiculo16 = new VehiculoDTO(1, "FORD", "MODEL1", 2018, "PEQUEÑO", "TUV-678");
    VehiculoDTO vehiculo17 = new VehiculoDTO(1, "FORD", "MODEL2", 2019, "PEQUEÑO", "WXY-901");
    VehiculoDTO vehiculo18 = new VehiculoDTO(1, "FORD", "MODEL3", 2020, "PEQUEÑO", "ZAB-234");
    VehiculoDTO vehiculo19 = new VehiculoDTO(1, "FORD", "MODEL4", 2021, "PEQUEÑO", "CDE-567");
    VehiculoDTO vehiculo20 = new VehiculoDTO(1, "FORD", "MODEL5", 2022, "PEQUEÑO", "FGH-890");

    // Vehículos para 5 personas (Nissan)
    VehiculoDTO vehiculo21 = new VehiculoDTO(1, "NISSAN", "MODEL1", 2019, "PEQUEÑO", "IJK-123");
    VehiculoDTO vehiculo22 = new VehiculoDTO(1, "NISSAN", "MODEL2", 2020, "PEQUEÑO", "LMN-456");
    VehiculoDTO vehiculo23 = new VehiculoDTO(1, "NISSAN", "MODEL3", 2021, "PEQUEÑO", "OPQ-789");
    VehiculoDTO vehiculo24 = new VehiculoDTO(1, "NISSAN", "MODEL4", 2022, "PEQUEÑO", "RST-012");
    VehiculoDTO vehiculo25 = new VehiculoDTO(1, "NISSAN", "MODEL5", 2023, "PEQUEÑO", "UVW-345");

    LocalDate inicio = LocalDate.now();
    LocalDate fin = LocalDate.now().plusDays(5);


    VehiculoBO vehiculoBO = new VehiculoBO();
    PrestamoBO prestamoBO = new PrestamoBO();

    // Agregamos todos los vehículos
    vehiculoBO.agregar(vehiculo1);
    vehiculoBO.agregar(vehiculo2);
    vehiculoBO.agregar(vehiculo3);
    vehiculoBO.agregar(vehiculo4);
    vehiculoBO.agregar(vehiculo5);
    vehiculoBO.agregar(vehiculo6);
    vehiculoBO.agregar(vehiculo7);
    vehiculoBO.agregar(vehiculo8);
    vehiculoBO.agregar(vehiculo9);
    vehiculoBO.agregar(vehiculo10);
    vehiculoBO.agregar(vehiculo11);
    vehiculoBO.agregar(vehiculo12);
    vehiculoBO.agregar(vehiculo13);
    vehiculoBO.agregar(vehiculo14);
    vehiculoBO.agregar(vehiculo15);
    vehiculoBO.agregar(vehiculo16);
    vehiculoBO.agregar(vehiculo17);
    vehiculoBO.agregar(vehiculo18);
    vehiculoBO.agregar(vehiculo19);
    vehiculoBO.agregar(vehiculo20);
    vehiculoBO.agregar(vehiculo21);
    vehiculoBO.agregar(vehiculo22);
    vehiculoBO.agregar(vehiculo23);
    vehiculoBO.agregar(vehiculo24);
    vehiculoBO.agregar(vehiculo25);

}
}

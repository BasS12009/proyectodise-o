/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOs;

import Conexion.ConexionBD;
import Entidades.Traslado;
import com.mongodb.client.MongoCollection;

import excepciones.DAOException;
import interfaces.ITrasladoDAO;


/**
 *
 * @author diana
 */
public class TrasladoDAO implements ITrasladoDAO {

    private final MongoCollection<Traslado> trasladoCollection;

    public TrasladoDAO() {
        this.trasladoCollection = ConexionBD.getInstance().getDatabase().getCollection("Traslado", Traslado.class);
    }

    @Override
    public void agregar(Traslado Traslado) throws DAOException {
        try {
            trasladoCollection.insertOne(Traslado);
        } catch (Exception e) {
            throw new DAOException("Error al generar traslado" + e);
        }
    }
   
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.vinni.dao;

import co.vinni.config.Conexion;
import co.vinni.dto.Datos;
import co.vinni.dto.DatosFisicos;
import co.vinni.dto.DatosRendimiento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Sala_704
 */
public class Consultas {
    private PreparedStatement objPreparedStatement;
    private ResultSet objResultSet;
    private Connection objConexion;
    /*public Datos consulta (Datos d){
        if (d != null){
            if (d.getUsuario().toUpperCase().equals("JULIAN")){
                d.setDireccion("elcorreo.com.co");
                return d;
            }
        }
        return null;
    }¨*/
    
    public Datos registroDatosBasicos (Datos obj) throws SQLException {	
        objPreparedStatement = null;
        objResultSet = null;
        objConexion = null;
        int resInsert = 0;

        String sqlInsert = "INSERT INTO datosbasicos (nombre, apellido, correo, direccion, telefono, id) VALUES(?,?,?,?,?,?)";

        try {
                objConexion = Conexion.conectarse();
                objPreparedStatement = objConexion.prepareStatement(sqlInsert);
                
                objPreparedStatement.setString(1, obj.getNombre());
                objPreparedStatement.setString(2, obj.getApellido());
                objPreparedStatement.setString(3, obj.getCorreo());
                objPreparedStatement.setString(4, obj.getDireccion());
                objPreparedStatement.setInt(5, obj.getTelefono());
                objPreparedStatement.setInt(6, obj.getId());
                
                resInsert = objPreparedStatement.executeUpdate();
                
                objPreparedStatement.close();
                objConexion.close();
        }
        catch(Exception e)
                {
                e.printStackTrace();
                }
        if(resInsert>0){
            return obj;
        }
        else {
            return null;
        }       
    }   

    public boolean registroDatosFisicos (DatosFisicos obj) throws SQLException {	
        objPreparedStatement = null;
        objResultSet = null;
        objConexion = null;
        int resInsert = 0;

        String sqlInsert = "INSERT INTO datosfisicos (peso, estatura, comentario) VALUES(?,?,?)";

        try {
                objConexion = Conexion.conectarse();
                objPreparedStatement = objConexion.prepareStatement(sqlInsert);
                
                objPreparedStatement.setString(1, obj.getPeso());
                objPreparedStatement.setString(2, obj.getEstatura());
                objPreparedStatement.setString(3, obj.getComentario());
                
                resInsert = objPreparedStatement.executeUpdate();
                
                objPreparedStatement.close();
                objConexion.close();
        }
        catch(Exception e)
                {
                e.printStackTrace();
                }
        if(resInsert>0){
            return true;
        }
        else {
            return false;
        }       
    }
    
    public boolean registroDatosRendimiento (DatosRendimiento obj) throws SQLException {	
        objPreparedStatement = null;
        objResultSet = null;
        objConexion = null;
        int resInsert = 0;

        String sqlInsert = "INSERT INTO datosrendimiento (rebotes, asistencias, pases, robos, paradas, libresanotados, tiroscampoanotados, triplesanotados, puntospartido) VALUES(?,?,?,?,?,?,?,?,?)";

        try {
                objConexion = Conexion.conectarse();
                objPreparedStatement = objConexion.prepareStatement(sqlInsert);
                
                objPreparedStatement.setInt(1, obj.getRebotes());
                objPreparedStatement.setInt(2, obj.getAsistencias());
                objPreparedStatement.setInt(3, obj.getPases());
                objPreparedStatement.setInt(4, obj.getRobos());
                objPreparedStatement.setInt(5, obj.getParadas());
                objPreparedStatement.setInt(6, obj.getLibresAnotados());
                objPreparedStatement.setInt(7, obj.getTirosCampoAnotados());
                objPreparedStatement.setInt(8, obj.getTriplesAnotados());
                objPreparedStatement.setInt(9, obj.getPuntosPartido());
                
                resInsert = objPreparedStatement.executeUpdate();
                
                objPreparedStatement.close();
                objConexion.close();
        }
        catch(Exception e)
                {
                e.printStackTrace();
                }
        if(resInsert>0){
            return true;
        }
        else {
            return false;
        }       
    } 
    
    /*public ArrayList<Datos> consultar() throws SQLException{
        objPreparedStatement = null;
        objResultSet = null;
        objConexion = null;
        ArrayList <Datos> lista = new ArrayList<>();

        String sqlQuery = "SELECT \"IDJug\", \"Pass\", \"Direccion\"\n" +
"	FROM public.\"Jugadores\"";
        try {
			
            objConexion = Conexion.conectarse();
            objPreparedStatement = objConexion.prepareStatement(sqlQuery);
            objResultSet = objPreparedStatement.executeQuery();

            while (objResultSet.next()) {

                Datos nuevo = new Datos();
                nuevo.setImei(objResultSet.getInt(1));
                nuevo.setMarca(objResultSet.getString(2));
                nuevo.setReferencia(objResultSet.getString(3));
                lista.add(nuevo);

            }
            objPreparedStatement.close();
            objConexion.close();

        } catch (SQLException e) {
                e.getMessage();

        }finally {

            if (objConexion != null)
                    objConexion.close();

            if (objPreparedStatement != null)
                    objPreparedStatement.close();

        }
        return lista;
        
    }*/
    
    public boolean ActualizarDatosFisicos (DatosFisicos obj) throws SQLException {	
        objPreparedStatement = null;
        objResultSet = null;
        objConexion = null;
        int resInsert = 0;

        String sqlInsert = "INSERT INTO public.\"DatosFisicos\"(\n" +
        " \"Peso\", \"Estatura\", \"Comentario\", \"IDUsuario\")\n" +
        " VALUES (?, ?, ?, ?)";

        try {
                if(true){
                    objConexion = Conexion.conectarse();
                    objPreparedStatement = objConexion.prepareStatement(sqlInsert);

                    objPreparedStatement.setString(1, obj.getPeso());
                    objPreparedStatement.setString(2, obj.getEstatura());
                    objPreparedStatement.setString(3, obj.getComentario());
                    objPreparedStatement.setInt(4, obj.getIdJugador());

                    resInsert = objPreparedStatement.executeUpdate();

                    objPreparedStatement.close();
                    objConexion.close();
                    if (resInsert > 0) 
                        return true;
                    else 
                        return false;
                }else{
                    return false;
                }
                
        } catch (SQLException e) {
            return false;
        }finally {
            if (objConexion != null)
                objConexion.close();
            if (objPreparedStatement != null)
                objPreparedStatement.close();
        }
    } 
    public boolean buscarUsuario(int idUsuario) throws SQLException {
		
        objPreparedStatement = null;
        objResultSet = null;
        objConexion = null;

        int resInsert = 0;
        String sqlQuery = "SELECT \"IDUsuario\", \"Clave\"\n" +
"	FROM public.\"Usuario\" WHERE \"IDUsuario\"=?";
        try {
            System.out.println("1");
            objConexion = Conexion.conectarse();
            System.out.println("2");
            objPreparedStatement = objConexion.prepareStatement(sqlQuery);
            System.out.println("3");

            objPreparedStatement.setInt(1, idUsuario);
            System.out.println("4");
            resInsert = objPreparedStatement.executeUpdate();
            System.out.println("5");
            objPreparedStatement.close();
            objConexion.close();

            if (resInsert > 0) 
                return true;			
            else
                return false;			

        } catch (SQLException e) {
            return false;
        }finally {
            if (objConexion != null)
                objConexion.close();
            if (objPreparedStatement != null)
                objPreparedStatement.close();
        }
    }
    
}

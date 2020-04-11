package co.vinni.servicios;

import co.vinni.dao.Consultas;
import co.vinni.dto.Datos;
import co.vinni.dto.DatosFisicos;
import co.vinni.dto.DatosRendimiento;
import co.vinni.dto.Respuesta;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Vinni
 */
@Path("operacion")
public class Operaciones {
    
    @Path("version")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String version(){
        return "version 1.0";
    }
    
    /*@Path("autenticar")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    
    public Respuesta autenticar(Datos datos){
        Respuesta r = new Respuesta();
        r.setCodigo(1);
        r.setMensajeE("Existe");
        
        Consultas cons = new Consultas();
        Datos d = cons.consulta(datos);
        
        if (d == null){
            r.setCodigo(0);
            r.setMensajeE("No Existe");
        }
        
        r.setInfo(d);
        return r;
    }*/
    
    /*@Path("consultar")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<Datos> consultar(){
        try {
            Consultas cons = new Consultas();
            return cons.consultar();
        } catch (SQLException e) {
            return null;
        }  
    }*/
    
    @Path("agregarB")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Respuesta agregarDatosBasicos(Datos obj) throws SQLException{
        Respuesta r = new Respuesta();
        r.setCodigo(1);
        r.setMensajeE("Existe");
        
        Consultas cons = new Consultas();
        Datos d= cons.registroDatosBasicos(obj);
        
        if (d == null){
            r.setCodigo(0);
            r.setMensajeE("No Existe");
        }
        r.setInfo(d);
        return r;
    }
    
    @Path("agregarR")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Respuesta agregarDatosRendimiento(DatosRendimiento obj){
        Respuesta res=new Respuesta();
        res.setCodigo(1);
        res.setMensajeE("Registro fallido");
        try {
            Consultas cons = new Consultas();
            if(cons.registroDatosRendimiento(obj)){
                res.setCodigo(0);
                res.setMensajeE("Registro exitoso");
            }
            return res;
        } catch (SQLException e) {
            return res;
        }  
    }
    @Path("agregarF")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Respuesta agregarDatosFisicos(DatosFisicos obj){
        Respuesta res=new Respuesta();
        res.setCodigo(1);
        res.setMensajeE("Registro fallido");
        try {
            Consultas cons = new Consultas();
            if(cons.registroDatosFisicos(obj)){
                res.setCodigo(0);
                res.setMensajeE("Registro exitoso");
            }
            return res;
        } catch (SQLException e) {
            return res;
        }  
    }
    
    @Path("datosFisicos")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Respuesta actualizarDatosFisicos(DatosFisicos datos){
        Respuesta res=new Respuesta();
        res.setCodigo(1);
        res.setMensajeE("Registro fallido");
        try {
            Consultas cons = new Consultas();
            if(cons.ActualizarDatosFisicos(datos)){
                res.setCodigo(0);
                res.setMensajeE("Registro exitoso");
            }
            return res;
        } catch (SQLException e) {
            return res;
        }  
    }
}

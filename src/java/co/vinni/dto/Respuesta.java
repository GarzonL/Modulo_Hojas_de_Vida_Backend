/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.vinni.dto;

/**
 *
 * @author Sala_704
 */
public class Respuesta {
    private int codigo;
    private String mensajeE;
    
    private Datos info;

    public Respuesta() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getMensajeE() {
        return mensajeE;
    }

    public void setMensajeE(String mensajeE) {
        this.mensajeE = mensajeE;
    }

    public Datos getInfo() {
        return info;
    }

    public void setInfo(Datos info) {
        this.info = info;
    }
    
    
    
}

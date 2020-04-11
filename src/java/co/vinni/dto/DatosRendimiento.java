/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.vinni.dto;

/**
 *
 * @author Daniel Camilo
 */
public class DatosRendimiento {
    
    private int rebotes;
    private int asistencias;
    private int pases;
    private int robos;
    private int paradas;
    private int libresAnotados;
    private int tirosCampoAnotados;
    private int triplesAnotados;
    private int puntosPartido;
    private int id;
    
    public DatosRendimiento(){
        
    }

    public int getRebotes() {
        return rebotes;
    }

    public void setRebotes(int rebotes) {
        this.rebotes = rebotes;
    }

    public int getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(int asistencias) {
        this.asistencias = asistencias;
    }

    public int getPases() {
        return pases;
    }

    public void setPases(int pases) {
        this.pases = pases;
    }

    public int getRobos() {
        return robos;
    }

    public void setRobos(int robos) {
        this.robos = robos;
    }

    public int getParadas() {
        return paradas;
    }

    public void setParadas(int paradas) {
        this.paradas = paradas;
    }

    public int getLibresAnotados() {
        return libresAnotados;
    }

    public void setLibresAnotados(int libresAnotados) {
        this.libresAnotados = libresAnotados;
    }

    public int getTirosCampoAnotados() {
        return tirosCampoAnotados;
    }

    public void setTirosCampoAnotados(int tirosCampoAnotados) {
        this.tirosCampoAnotados = tirosCampoAnotados;
    }

    public int getTriplesAnotados() {
        return triplesAnotados;
    }

    public void setTriplesAnotados(int triplesAnotados) {
        this.triplesAnotados = triplesAnotados;
    }

    public int getPuntosPartido() {
        return puntosPartido;
    }

    public void setPuntosPartido(int puntosPartido) {
        this.puntosPartido = puntosPartido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

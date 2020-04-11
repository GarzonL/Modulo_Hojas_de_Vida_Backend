/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.vinni.dto;

/**
 *
 * @author William
 */
public class DatosFisicos {
    private int idJugador;
    private String peso;
    private String estatura;
    private String comentario;

    public String getEstatura() {
        return estatura;
    }

    public void setEstatura(String estatura) {
        this.estatura = estatura;
    }
    
    public int getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(int idJugador) {
        this.idJugador = idJugador;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    
    
}

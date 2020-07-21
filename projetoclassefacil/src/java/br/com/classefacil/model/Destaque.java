/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.classefacil.model;

/**
 *
 * @author Eric
 */
public class Destaque {
    private int idDestaque;
    private String dataInicio;
    private String dataFim;

    public Destaque() {
    }

    public Destaque(int idDestaque, String dataInicio, String dataFim) {
        this.idDestaque = idDestaque;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    /**
     * @return the idDestaque
     */
    public int getIdDestaque() {
        return idDestaque;
    }

    /**
     * @param idDestaque the idDestaque to set
     */
    public void setIdDestaque(int idDestaque) {
        this.idDestaque = idDestaque;
    }

    /**
     * @return the dataInicio
     */
    public String getDataInicio() {
        return dataInicio;
    }

    /**
     * @param dataInicio the dataInicio to set
     */
    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    /**
     * @return the dataFim
     */
    public String getDataFim() {
        return dataFim;
    }

    /**
     * @param dataFim the dataFim to set
     */
    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }
    
    
}

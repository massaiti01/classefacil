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
public class Pacote {
    private int idPacote;
    private String informacoesPacote;
    private Double valorPacote;

    public Pacote() {
    }

    public Pacote(int idPacote, String informacoesPacote, Double valorPacote) {
        this.idPacote = idPacote;
        this.informacoesPacote = informacoesPacote;
        this.valorPacote = valorPacote;
    }

    /**
     * @return the idPacote
     */
    public int getIdPacote() {
        return idPacote;
    }

    /**
     * @param idPacote the idPacote to set
     */
    public void setIdPacote(int idPacote) {
        this.idPacote = idPacote;
    }

    /**
     * @return the informacoesPacote
     */
    public String getInformacoesPacote() {
        return informacoesPacote;
    }

    /**
     * @param informacoesPacote the informacoesPacote to set
     */
    public void setInformacoesPacote(String informacoesPacote) {
        this.informacoesPacote = informacoesPacote;
    }

    /**
     * @return the valorPacote
     */
    public Double getValorPacote() {
        return valorPacote;
    }

    /**
     * @param valorPacote the valorPacote to set
     */
    public void setValorPacote(Double valorPacote) {
        this.valorPacote = valorPacote;
    }
    
    
}

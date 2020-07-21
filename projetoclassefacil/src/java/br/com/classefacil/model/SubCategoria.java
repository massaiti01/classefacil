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
public class SubCategoria {
    private int idSubCategoria;
    private String nomeSubCategoria;
    private String descricaoSubCategoria;
    private Categoria idCategoria;

    public SubCategoria(int idSubCategoria, String nomeSubCategoria, String descricaoSubCategoria, Categoria idCategoria) {
        this.idSubCategoria = idSubCategoria;
        this.nomeSubCategoria = nomeSubCategoria;
        this.descricaoSubCategoria = descricaoSubCategoria;
        this.idCategoria = idCategoria;
    }

    /**
     * @return the idSubCategoria
     */
    public int getIdSubCategoria() {
        return idSubCategoria;
    }

    /**
     * @param idSubCategoria the idSubCategoria to set
     */
    public void setIdSubCategoria(int idSubCategoria) {
        this.idSubCategoria = idSubCategoria;
    }

    /**
     * @return the nomeSubCategoria
     */
    public String getNomeSubCategoria() {
        return nomeSubCategoria;
    }

    /**
     * @param nomeSubCategoria the nomeSubCategoria to set
     */
    public void setNomeSubCategoria(String nomeSubCategoria) {
        this.nomeSubCategoria = nomeSubCategoria;
    }

    /**
     * @return the descricaoSubCategoria
     */
    public String getDescricaoSubCategoria() {
        return descricaoSubCategoria;
    }

    /**
     * @param descricaoSubCategoria the descricaoSubCategoria to set
     */
    public void setDescricaoSubCategoria(String descricaoSubCategoria) {
        this.descricaoSubCategoria = descricaoSubCategoria;
    }

    /**
     * @return the idCategoria
     */
    public Categoria getIdCategoria() {
        return idCategoria;
    }

    /**
     * @param idCategoria the idCategoria to set
     */
    public void setIdCategoria(Categoria idCategoria) {
        this.idCategoria = idCategoria;
    }
    
    
}

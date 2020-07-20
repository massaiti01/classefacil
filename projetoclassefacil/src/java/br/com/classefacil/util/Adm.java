/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.classefacil.util;

/**
 *
 * @author Eric
 */
public class Adm extends Usuario{
    private int idAdm;
    private int codigoAdm;

    public Adm(int idAdm, int codigoAdm, int idUsuario, String loginUsuario, String tipoUsuario, String emailUsuario, String telefoneUsuario) {
        super(idUsuario, loginUsuario, tipoUsuario, emailUsuario, telefoneUsuario);
        this.idAdm = idAdm;
        this.codigoAdm = codigoAdm;
    }

    /**
     * @return the idAdm
     */
    public int getIdAdm() {
        return idAdm;
    }

    /**
     * @param idAdm the idAdm to set
     */
    public void setIdAdm(int idAdm) {
        this.idAdm = idAdm;
    }

    /**
     * @return the codigoAdm
     */
    public int getCodigoAdm() {
        return codigoAdm;
    }

    /**
     * @param codigoAdm the codigoAdm to set
     */
    public void setCodigoAdm(int codigoAdm) {
        this.codigoAdm = codigoAdm;
    }
    
    
}

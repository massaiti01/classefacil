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
public class Usuario {
    private int idUsuario;
    private String loginUsuario;
    private String tipoUsuario;
    private String emailUsuario;
    private String telefoneUsuario;

    public Usuario(int idUsuario, String loginUsuario, String tipoUsuario, String emailUsuario, String telefoneUsuario) {
        this.idUsuario = idUsuario;
        this.loginUsuario = loginUsuario;
        this.tipoUsuario = tipoUsuario;
        this.emailUsuario = emailUsuario;
        this.telefoneUsuario = telefoneUsuario;
    }

    /**
     * @return the idUsuario
     */
    public int getIdUsuario() {
        return idUsuario;
    }

    /**
     * @param idUsuario the idUsuario to set
     */
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    /**
     * @return the loginUsuario
     */
    public String getLoginUsuario() {
        return loginUsuario;
    }

    /**
     * @param loginUsuario the loginUsuario to set
     */
    public void setLoginUsuario(String loginUsuario) {
        this.loginUsuario = loginUsuario;
    }

    /**
     * @return the tipoUsuario
     */
    public String getTipoUsuario() {
        return tipoUsuario;
    }

    /**
     * @param tipoUsuario the tipoUsuario to set
     */
    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    /**
     * @return the emailUsuario
     */
    public String getEmailUsuario() {
        return emailUsuario;
    }

    /**
     * @param emailUsuario the emailUsuario to set
     */
    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    /**
     * @return the telefoneUsuario
     */
    public String getTelefoneUsuario() {
        return telefoneUsuario;
    }

    /**
     * @param telefoneUsuario the telefoneUsuario to set
     */
    public void setTelefoneUsuario(String telefoneUsuario) {
        this.telefoneUsuario = telefoneUsuario;
    }
    
    
}

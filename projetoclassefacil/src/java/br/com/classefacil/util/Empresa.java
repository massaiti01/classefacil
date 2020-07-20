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
public class Empresa extends Usuario{
    private int idEmpresa;
    private String tipoEmpresa;
    private String cnpjEmpresa;
    private String statusEmpresa;
    private String informacoesEmpresa;
    private SubCategoria idSubCategoria;

    public Empresa(int idEmpresa, String tipoEmpresa, String cnpjEmpresa, String statusEmpresa, String informacoesEmpresa, SubCategoria idSubCategoria, int idUsuario, String loginUsuario, String tipoUsuario, String emailUsuario, String telefoneUsuario) {
        super(idUsuario, loginUsuario, tipoUsuario, emailUsuario, telefoneUsuario);
        this.idEmpresa = idEmpresa;
        this.tipoEmpresa = tipoEmpresa;
        this.cnpjEmpresa = cnpjEmpresa;
        this.statusEmpresa = statusEmpresa;
        this.informacoesEmpresa = informacoesEmpresa;
        this.idSubCategoria = idSubCategoria;
    }

    /**
     * @return the idEmpresa
     */
    public int getIdEmpresa() {
        return idEmpresa;
    }

    /**
     * @param idEmpresa the idEmpresa to set
     */
    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    /**
     * @return the tipoEmpresa
     */
    public String getTipoEmpresa() {
        return tipoEmpresa;
    }

    /**
     * @param tipoEmpresa the tipoEmpresa to set
     */
    public void setTipoEmpresa(String tipoEmpresa) {
        this.tipoEmpresa = tipoEmpresa;
    }

    /**
     * @return the cnpjEmpresa
     */
    public String getCnpjEmpresa() {
        return cnpjEmpresa;
    }

    /**
     * @param cnpjEmpresa the cnpjEmpresa to set
     */
    public void setCnpjEmpresa(String cnpjEmpresa) {
        this.cnpjEmpresa = cnpjEmpresa;
    }

    /**
     * @return the statusEmpresa
     */
    public String getStatusEmpresa() {
        return statusEmpresa;
    }

    /**
     * @param statusEmpresa the statusEmpresa to set
     */
    public void setStatusEmpresa(String statusEmpresa) {
        this.statusEmpresa = statusEmpresa;
    }

    /**
     * @return the informacoesEmpresa
     */
    public String getInformacoesEmpresa() {
        return informacoesEmpresa;
    }

    /**
     * @param informacoesEmpresa the informacoesEmpresa to set
     */
    public void setInformacoesEmpresa(String informacoesEmpresa) {
        this.informacoesEmpresa = informacoesEmpresa;
    }

    /**
     * @return the idSubCategoria
     */
    public SubCategoria getIdSubCategoria() {
        return idSubCategoria;
    }

    /**
     * @param idSubCategoria the idSubCategoria to set
     */
    public void setIdSubCategoria(SubCategoria idSubCategoria) {
        this.idSubCategoria = idSubCategoria;
    }
    
}

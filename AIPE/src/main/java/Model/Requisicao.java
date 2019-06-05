/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Guilherme Feitosa
 */
public class Requisicao {
    
    private int id;
    private String fornecedor;
    private String valor;
    private String detrequisicao;
    private String projeto;
    private String status;
    private String motivo;

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getDetrequisicao() {
        return detrequisicao;
    }

    public void setDetrequisicao(String detrequisicao) {
        this.detrequisicao = detrequisicao;
    }

    public String getProjeto() {
        return projeto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProjeto(String projeto) {
        this.projeto = projeto;
    }
    
    
    
}

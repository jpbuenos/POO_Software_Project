
package SubmissaoDeArtigos.model;

import  java.util.Date;

public class Pessoa {
    private String nome;
    private Date dataDeNasc;
    private String enderecoEmail;

    public Pessoa(String nome, Date dataDeNasc, String enderecoEmail) {
        this.nome = nome;
        this.dataDeNasc = dataDeNasc;
        this.enderecoEmail = enderecoEmail;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataDeNasc() {
        return dataDeNasc;
    }

    public void setDataDeNasc(Date dataDeNasc) {
        this.dataDeNasc = dataDeNasc;
    }

    public String getEnderecoEmail() {
        return enderecoEmail;
    }

    public void setEnderecoEmail(String enderecoEmail) {
        this.enderecoEmail = enderecoEmail;
    }
}

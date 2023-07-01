
package SubmissaoDeArtigos.model;


public class Pessoa {
    private String senha;
    private String nome;
    private String enderecoEmail;
    
    public Pessoa(){}
    
    public Pessoa(String senha, String nome, String enderecoEmail) {
        this.senha = senha;
        this.nome = nome;
        this.enderecoEmail = enderecoEmail;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String id) {
        this.senha = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEnderecoEmail() {
        return enderecoEmail;
    }

    public void setEnderecoEmail(String enderecoEmail) {
        this.enderecoEmail = enderecoEmail;
    }

    
}


package SubmissaoDeArtigos.model;


public class Pessoa {
    private int id;
    private String nome;
    private String enderecoEmail;
    private String senha;
    

    public Pessoa(int id, String nome, String enderecoEmail, String senha) {
        this.nome = nome;
        this.enderecoEmail = enderecoEmail;
        this.senha = senha;
    }

    // Getters e Setters
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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
    
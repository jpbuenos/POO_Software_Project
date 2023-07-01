package SubmissaoDeArtigos.model;

import java.util.ArrayList;
import java.util.List;

public class Revista {
    private int id;
    private String nome;
    private Pessoa editorChefe;
    private int ISSN;
    private List<String> trilha;

    // Construtor
    public Revista(int id, String nome, Pessoa editorChefe, int ISSN) {
        this.id = id;
        this.nome = nome;
        this.editorChefe = editorChefe;
        this.ISSN = ISSN;
        this.trilha = new ArrayList<>();
    }

    // Getter e Setter para id, nome, editorChefe e ISSN

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pessoa getEditorChefe() {
        return editorChefe;
    }

    public void setEditorChefe(Pessoa editorChefe) {
        this.editorChefe = editorChefe;
    }

    public int getISSN() {
        return ISSN;
    }

    public void setISSN(int ISSN) {
        this.ISSN = ISSN;
    }

    // Funções adicionais

    public void publicarArtigo(String artigo) {
        System.out.println("Artigo \"" + artigo + "\" publicado na revista \"" + nome + "\".");
        trilha.add("Publicação do artigo: " + artigo);
    }

    public void resgatarTrilha() {
        System.out.println("Trilha da revista \"" + nome + "\":");
        for (String evento : trilha) {
            System.out.println(evento);
        }
    }

    public void processarTrilha() {
        System.out.println("Processando trilha da revista \"" + nome + "\"...");
        // Lógica de processamento da trilha aqui
        System.out.println("Trilha processada com sucesso!");
    }
}

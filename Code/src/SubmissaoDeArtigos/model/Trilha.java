package model;

import java.util.ArrayList;

public class Trilha {
    private String tema;
    private int numeroDeArtigos;
    private int numeroDeQuestoes;
    private ArrayList<String> questoes;
    private ArrayList<Object[]> matriz2xN; // Artigo/nota ; dps por em ordem as notas

    public Trilha(String tema, int numeroDeArtigos, int numeroDeQuestoes) {
        this.tema = tema;
        this.numeroDeArtigos = numeroDeArtigos;
        this.numeroDeQuestoes = numeroDeQuestoes;
        this.questoes = new ArrayList<>();
        this.matriz2xN = new ArrayList<>();
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public int getNumeroDeArtigos() {
        return numeroDeArtigos;
    }

    public void setNumeroDeArtigos(int numeroDeArtigos) {
        this.numeroDeArtigos = numeroDeArtigos;
    }

    public int getNumeroDeQuestoes() {
        return numeroDeQuestoes;
    }

    public void setNumeroDeQuestoes(int numeroDeQuestoes) {
        this.numeroDeQuestoes = numeroDeQuestoes;
    }

    public ArrayList<String> getQuestoes() {
        return questoes;
    }

    public void adicionarQuestao(String questao) {
        questoes.add(questao);
    }

    public ArrayList<Object[]> getMatriz2PorN() {
        return matriz2xN;
    }

    public void adicionarElementoMatriz(Artigo artigo, int valor) {
        Object[] elemento = new Object[]{artigo, valor};
        matriz2xN.add(elemento);
    }
}


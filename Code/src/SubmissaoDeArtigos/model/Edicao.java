package SubmissaoDeArtigos.model;

public class Edicao {
    private int id;
    private Revista local;
    private String numEdicao;

    // Construtor
    public Edicao(int id, Revista local, String numEdicao) {
        this.id = id;
        this.local = local;
        this.numEdicao = numEdicao;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Revista getLocal() {
        return local;
    }

    public void setLocal(Revista local) {
        this.local = local;
    }

    public String getNumEdicao() {
        return numEdicao;
    }

    public void setNumEdicao(String numEdicao) {
        this.numEdicao = numEdicao;
    }
}

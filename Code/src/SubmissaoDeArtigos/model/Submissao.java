
package SubmissaoDeArtigos.model;

public class Submissao {
    private Artigo artigo;
    private Autor[] autor;
    private Revista instituicao;
    private Revisor[] revisor;
    private String status;

    public Submissao(Artigo artigo, Autor[] autor, Revista instituicao, Revisor[] revisor) {
        this.artigo = artigo;
        this.autor = autor;
        this.instituicao = instituicao;
        this.revisor = revisor;
    }

    public Artigo getArtigo() {
        return artigo;
    }

    public void setArtigo(Artigo artigo) {
        this.artigo = artigo;
    }

    public Autor[] getAutor() {
        return autor;
    }

    public void setAutor(Autor[] autor) {
        this.autor = autor;
    }

    public Revista getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(Revista instituicao) {
        this.instituicao = instituicao;
    }

    public Revisor[] getRevisor() {
        return revisor;
    }

    public void setRevisor(Revisor[] revisor) {
        this.revisor = revisor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

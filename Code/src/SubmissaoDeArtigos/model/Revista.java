package SubmissaoDeArtigos.model;

public class Revista {
    private int id;
    private String nome;
    private Pessoa editorChefe;
    private int ISSN;

    // Construtor
    public Revista(int id, String nome, Pessoa editorChefe, int ISSN) {
        this.id = id;
        this.nome = nome;
        this.editorChefe = editorChefe;
        this.ISSN = ISSN;
    }

    // Getters e Setters
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
}

Pessoa editorChefe = new Pessoa("Nome do Editor Chefe");
Revista revista = new Revista(1, "Nome da Revista", editorChefe, 123456789);

System.out.println(revista.getNome());
System.out.println(revista.getEditorChefe().getNome()); 
System.out.println(revista.getISSN());

revista.setId(2);
System.out.println(revista.getId()); 


package SubmissaoDeArtigos.bd;
import SubmissaoDeArtigos.model.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DAO {
    private static DAO instance;
    Datadelete ext = new Datadelete("jdbc:derby:banco"); //cria o objeto delete
    


    //SÓ PODE GERAR UM OBJETO DO "DAO"
    private DAO() {
    }
    public static DAO getInstance() {
            if ( instance == null) {
                instance = new DAO();
            }
        return instance;
        }
    
    
    //CRIA TODOS OS ARQUIVOS DO BANCO
    public void DatabaseInitializer(){
    DatabaseInitializer.initializeDatabase(); }
    
    public void databaseInsert(Pessoa pessoa){
        DataInserter add = new DataInserter(); // cria o objeto insert
        
        add.insertPessoa(pessoa); // adiciona no banco
        
    }
    
    
    
    
    //APAGA TODOS OS DADOS DA TABELA
    public void DatabaseDelete(String tabela, int id){
    ext.excluirRegistro(tabela, id);
    }
    
    public void DatabaseDelete(String tabela){
        ext.excluirTodosRegistros(tabela);
    }
    
    
    
    
    
    
    
    
    
    //PRINTA TODAS AS PESSOAS
    public void printPessoas(){
        List<Pessoa> pessoas = this.obterTodasAsPessoas(); //passa para uma lista de pessoas

        for (Pessoa pessoa : pessoas) { //Printa todas as pessoas
            System.out.println("ID: " + pessoa.getId());
            System.out.println("Nome: " + pessoa.getNome());
            System.out.println("Data de Nascimento: " + pessoa.getDataDeNasc());
            System.out.println("Endereço de Email: " + pessoa.getEnderecoEmail());
            System.out.println("--------------------");
        }
    }
    
    
    
    
    //RETURN
    //RETORNA UMA LISTA DE PESSOAS
    public List<Pessoa> obterTodasAsPessoas() {
        List<Pessoa> pessoas = new ArrayList<>();

        try (Connection conn = DriverManager.getConnection("jdbc:derby:banco");
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM Pessoa")) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                java.sql.Date dataDeNasc = rs.getDate("dataDeNasc");
                String enderecoEmail = rs.getString("enderecoEmail");

                Pessoa pessoa = new Pessoa(id, nome, dataDeNasc, enderecoEmail);
                pessoas.add(pessoa);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return pessoas;
    }
    
    
// Só essa classe vai ser executada,     
}

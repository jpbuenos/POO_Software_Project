/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SubmissaoDeArtigos.bd;
import SubmissaoDeArtigos.model.*;
import java.sql.*;

public class DataInserter {
    private Connection conn;

    public DataInserter() {
        try {
            conn = DriverManager.getConnection("jdbc:derby:banco");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void insertPessoa(Pessoa pessoa) {

        String sql = "INSERT INTO Pessoa (nome, dataDeNasc, enderecoEmail) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, pessoa.getNome());
            stmt.setDate(2, pessoa.getDataDeNasc());
            stmt.setString(3, pessoa.getEnderecoEmail());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void insertArtigo(String titulo, String resumo, byte[] conteudo, int statusDeRevisao, Date dataDeSubmissao, Date dataDePublicacao) {
        String sql = "INSERT INTO Artigo (titulo, resumo, conteudo, statusDeRevisao, dataDeSubmissao, dataDePublicacao) " +
                     "VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, titulo);
            stmt.setString(2, resumo);
            stmt.setBytes(3, conteudo);
            stmt.setInt(4, statusDeRevisao);
            stmt.setDate(5, dataDeSubmissao);
            stmt.setDate(6, dataDePublicacao);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Métodos para inserir dados nas outras tabelas

    public void closeConnection() {
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

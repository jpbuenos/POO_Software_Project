
package SubmissaoDeArtigos.bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseGetter {
    public static void getDataFromDatabase() {
        Connection conn = null;
        try {
            // Estabelecer a conexão com o banco de dados
            conn = DriverManager.getConnection("jdbc:derby:banco");

            // Executar a consulta SQL
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Pessoa");

            // Processar os resultados
            while (rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                java.sql.Date dataDeNasc = rs.getDate("dataDeNasc");
                String enderecoEmail = rs.getString("enderecoEmail");

                // Faça algo com os dados recuperados
                System.out.println("ID: " + id);
                System.out.println("Nome: " + nome);
                System.out.println("Data de Nascimento: " + dataDeNasc);
                System.out.println("Endereço de Email: " + enderecoEmail);
                System.out.println();
            }

            // Fechar recursos
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

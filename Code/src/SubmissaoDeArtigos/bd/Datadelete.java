
package SubmissaoDeArtigos.bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Datadelete {
    private String connectionString;

    public Datadelete(String connectionString) {
        this.connectionString = connectionString;
    }

    public void excluirTodosRegistros(String tabela) {
        try (Connection conn = DriverManager.getConnection(connectionString);
             PreparedStatement stmt = conn.prepareStatement("DELETE FROM " + tabela)) {

            int rowsAffected = stmt.executeUpdate();

            System.out.println(rowsAffected + " registros removidos com sucesso!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void excluirRegistro(String tabela, int id) {
        try (Connection conn = DriverManager.getConnection(connectionString);
             PreparedStatement stmt = conn.prepareStatement("DELETE FROM " + tabela + " WHERE id = ?")) {

            stmt.setInt(1, id);

            int rowsAffected = stmt.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Registro removido com sucesso!");
            } else {
                System.out.println("Nenhum registro encontrado com o ID informado.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


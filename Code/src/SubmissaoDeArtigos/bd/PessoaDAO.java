package banco;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
import model.Pessoa;

public class PessoaDAO {
    private String connectionString;

    public PessoaDAO(String connectionString) {
        this.connectionString = connectionString;
    }

    public List<Pessoa> obterTodasAsPessoas() {
        List<Pessoa> pessoas = new ArrayList<>();

        try (Connection conn = DriverManager.getConnection(connectionString);
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
}

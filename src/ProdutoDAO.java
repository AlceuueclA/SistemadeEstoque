
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class ProdutoDAO {

        public void insertProduct(String nome, double preco, int qtd) throws SQLException {
                    String sql = "INSERT INTO produtos(nome, preco, qtd) VALUES(?, ? , ?)";
                try(Connection conn = Conexao.conectar();
                    PreparedStatement stmt = conn.prepareStatement(sql)){
                    stmt.setString(1, nome);
                    stmt.setDouble(2, preco);
                    stmt.setInt(3, qtd);
                    stmt.executeUpdate();
                    System.out.println("Produto inserido no banco!");
                } catch(Exception e) {
                    e.printStackTrace();
                }
                }
                }



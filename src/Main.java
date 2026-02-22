import java.sql.Connection;
import java.sql.SQLException;

public class Main{
    public static void main(String[] args) throws SQLException {
        ProdutoDAO dao = new ProdutoDAO();
                dao.insertProduct("Xiaomi 2", 1500, 10);

    }
}
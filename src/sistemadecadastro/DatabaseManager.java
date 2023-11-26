package sistemadecadastro;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseManager {
    private static final String SUrl = "jdbc:MySQL://localhost:3306/uservault";
    private static final String SUser = "uservault";
    private static final String SPass = "Uservault#2468";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(SUrl, SUser, SPass);
    }
}
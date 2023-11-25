package sistemadecadastro;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseManager {
    private static final String SUrl = "jdbc:MySQL://localhost:3306/uservault";
    private static final String SUser = "root";
    private static final String SPass = "Data@Fit";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(SUrl, SUser, SPass);
    }
}
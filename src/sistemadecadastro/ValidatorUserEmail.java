package sistemadecadastro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ValidatorUserEmail {
    public static boolean userOrEmailExists(Connection con, String username, String email) throws SQLException {
        String query = "SELECT COUNT(*) FROM user WHERE username = ? OR email = ?";

        try (PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, username);
            ps.setString(2, email);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt(1) > 0; 
                }
            }
        }

        return false;
    }
}
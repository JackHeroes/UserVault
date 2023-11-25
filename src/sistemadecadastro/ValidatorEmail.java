package sistemadecadastro;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatorEmail {
    public static boolean isValidEmail(String email) {
        Pattern pattern = Pattern.compile("^\\S+@\\S+\\.\\S+$");
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
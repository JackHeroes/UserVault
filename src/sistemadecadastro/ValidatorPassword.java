package sistemadecadastro;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatorPassword {
    public static boolean isStrongPassword(char[] password) {
        String passwordStr = new String(password);

        Pattern pattern = Pattern.compile("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$");
        Matcher matcher = pattern.matcher(passwordStr);

        return matcher.find();
    }
}
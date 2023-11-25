package sistemadecadastro;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashUtil {
    public static String hashPassword(char[] password) {
       try {
           MessageDigest md = MessageDigest.getInstance("SHA-256");
           md.update(new String(password).getBytes());

           byte[] digest = md.digest();

           StringBuilder hexString = new StringBuilder();
           for (byte b : digest) {
               hexString.append(String.format("%02x", b));
           }

           return hexString.toString();
       } catch (NoSuchAlgorithmException e) {
           throw new RuntimeException("Erro ao criptografar a senha", e);
       }
    }
}
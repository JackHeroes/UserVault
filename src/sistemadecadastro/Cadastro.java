package sistemadecadastro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.DriverManager;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Cadastro extends javax.swing.JFrame {
    
    public Cadastro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        registerName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        registerEmail = new javax.swing.JTextField();
        registerPassword = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        SignUpBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        registerUsername = new javax.swing.JTextField();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CADASTRO");

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel3.setText("NOME COMPLETO");

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel4.setText("SENHA");

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel5.setText("EMAIL");

        registerPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerPasswordActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setText("LOGIN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        SignUpBtn.setBackground(new java.awt.Color(255, 51, 51));
        SignUpBtn.setLabel("CADASTRAR");
        SignUpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUpBtnActionPerformed(evt);
            }
        });

        jLabel6.setText("Ja possui uma conta?");

        jPanel3.setBackground(new java.awt.Color(255, 51, 51));
        jPanel3.setPreferredSize(new java.awt.Dimension(400, 500));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo.png"))); // NOI18N
        jLabel7.setText("jLabel4");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112))
        );

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel8.setText("USUARIO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(SignUpBtn)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(registerName)
                            .addComponent(registerPassword)
                            .addComponent(registerEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                            .addComponent(jLabel8)
                            .addComponent(registerUsername))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(registerName, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(registerUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registerEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registerPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SignUpBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel6))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 587, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("CADASTRO");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Login LOGIN = new Login(); 
        LOGIN.setVisible(true);
        LOGIN.pack();
        LOGIN.setLocationRelativeTo(null);
        this.dispose(); 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void registerPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registerPasswordActionPerformed

    public class DatabaseManager {
        private static final String SUrl = "jdbc:MySQL://localhost:3306/uservault";
        private static final String SUser = "root";
        private static final String SPass = "Data@Fit";
        
        public static Connection getConnection() throws SQLException {
            return DriverManager.getConnection(SUrl, SUser, SPass);
        }
    }
    
    private boolean userOrEmailExists(Connection con, String username, String email) throws SQLException {
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
     
    private boolean isValidEmail(String email) {
        
        Pattern pattern = Pattern.compile("^\\S+@\\S+\\.\\S+$");
        Matcher matcher = pattern.matcher(email);

        return matcher.matches();
    }
        
    private boolean isStrongPassword(char[] password) {
        String passwordStr = new String(password);

        Pattern pattern = Pattern.compile("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$");
        Matcher matcher = pattern.matcher(passwordStr);

        return matcher.find();
    }
       
    private void SignUpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUpBtnActionPerformed

        String name = registerName.getText();
        String username = registerUsername.getText();
        String email = registerEmail.getText();
        char[] password = registerPassword.getPassword();

        if (name.isEmpty() || username.isEmpty() || email.isEmpty() || password.length == 0) {
            JOptionPane.showMessageDialog(new JFrame(), "Todos os campos são obrigatórios", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
                  
        if (!isValidEmail(email)) {
            showMessageDialog(null, "O formato do email é inválido.");
            return;
        }
                     
        if (!isStrongPassword(password)) {
            showMessageDialog(null, "A senha não atende aos critérios de segurança. "
                    + "A senha precisa ter no mínimo 8 caracteres, sendo pelo menos um maiúsculo, um minusculo, um número e um caractere especial.");
            return;
        }

        try (Connection con = DatabaseManager.getConnection()) {
     
            if (userOrEmailExists(con, username, email)) {
                showMessageDialog(null, "Usuário ou email já existem. Escolha outro.");
                return;
            }
            
            String hashedPassword = HashUtil.hashPassword(password);
            
            String query = "INSERT INTO user(username, full_name, email, password, is_staff) VALUES (?, ?, ?, ?, 0)";
            try (PreparedStatement ps = con.prepareStatement(query)) {
                ps.setString(1, username);
                ps.setString(2, name);
                ps.setString(3, email);
                ps.setString(4, hashedPassword);
                
                ps.executeUpdate();
            }
            
            registerName.setText("");
            registerUsername.setText("");
            registerEmail.setText("");
            registerPassword.setText("");
            showMessageDialog(null, "Conta criada com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao acessar o banco de dados: " + e.getMessage());
        }
    }//GEN-LAST:event_SignUpBtnActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> {
            new Cadastro().setVisible(true);
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SignUpBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField registerEmail;
    private javax.swing.JTextField registerName;
    private javax.swing.JPasswordField registerPassword;
    private javax.swing.JTextField registerUsername;
    // End of variables declaration//GEN-END:variables
}
package sistemadecadastro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.DriverManager;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Login extends javax.swing.JFrame {
    
    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        banner = new javax.swing.JPanel();
        formLogin = new javax.swing.JPanel();
        login = new javax.swing.JLabel();
        usuario = new javax.swing.JLabel();
        loginUsername = new javax.swing.JTextField();
        senha = new javax.swing.JLabel();
        loginPassword = new javax.swing.JPasswordField();
        loginBtn = new javax.swing.JButton();
        naoTemUmaConta = new javax.swing.JLabel();
        signupBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(830, 500));
        setResizable(false);
        setSize(new java.awt.Dimension(830, 500));

        banner.setBackground(new java.awt.Color(0, 71, 171));
        banner.setPreferredSize(new java.awt.Dimension(400, 500));

        javax.swing.GroupLayout bannerLayout = new javax.swing.GroupLayout(banner);
        banner.setLayout(bannerLayout);
        bannerLayout.setHorizontalGroup(
            bannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        bannerLayout.setVerticalGroup(
            bannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        login.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        login.setForeground(new java.awt.Color(0, 71, 171));
        login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        login.setText("LOGIN");

        usuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usuario.setText("Usuário");

        loginUsername.setMinimumSize(new java.awt.Dimension(330, 40));
        loginUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginUsernameActionPerformed(evt);
            }
        });

        senha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        senha.setText("Senha");

        loginPassword.setPreferredSize(new java.awt.Dimension(330, 40));

        loginBtn.setBackground(new java.awt.Color(0, 71, 171));
        loginBtn.setForeground(new java.awt.Color(255, 255, 255));
        loginBtn.setText("ENTRAR");
        loginBtn.setPreferredSize(new java.awt.Dimension(330, 40));
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        naoTemUmaConta.setText("Não tem uma conta?");

        signupBtn.setBackground(new java.awt.Color(0, 71, 171));
        signupBtn.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        signupBtn.setForeground(new java.awt.Color(255, 255, 255));
        signupBtn.setText("CADASTRAR-SE");
        signupBtn.setPreferredSize(new java.awt.Dimension(120, 20));
        signupBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout formLoginLayout = new javax.swing.GroupLayout(formLogin);
        formLogin.setLayout(formLoginLayout);
        formLoginLayout.setHorizontalGroup(
            formLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(formLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(formLoginLayout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addGroup(formLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(usuario)
                        .addComponent(senha)
                        .addGroup(formLoginLayout.createSequentialGroup()
                            .addComponent(naoTemUmaConta)
                            .addGap(18, 18, 18)
                            .addComponent(signupBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(loginPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(loginUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(0, 0, 0)))
        );
        formLoginLayout.setVerticalGroup(
            formLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 284, Short.MAX_VALUE)
            .addGroup(formLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(formLoginLayout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(usuario)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(loginUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(senha)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(loginPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(formLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(naoTemUmaConta)
                        .addComponent(signupBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, 0)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(banner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(formLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(banner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(formLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed

        String username = loginUsername.getText();
        char[] password = loginPassword.getPassword();
        String name = null, passwordDB = null;
        int isStaff = 0;
        int notFound = 0;

        try (Connection con = DatabaseManager.getConnection()) {

            if ("".equals(username) || password.length == 0) {
                JOptionPane.showMessageDialog(new JFrame(), "Credenciais necessárias", "Erro", JOptionPane.ERROR_MESSAGE);
            } else {
                String hashedPassword = HashUtil.hashPassword(password);

                String query = "SELECT * FROM user WHERE username=?";
                try (PreparedStatement ps = con.prepareStatement(query)) {
                    ps.setString(1, username);
                    try (ResultSet rs = ps.executeQuery()) {
                        while (rs.next()) {
                            name = rs.getString("full_name");
                            passwordDB = rs.getString("password");
                            isStaff = rs.getInt("is_staff");
                            notFound = 1;
                        }
                    }
                }

                if (notFound == 1 && hashedPassword.equals(passwordDB)) {
                    if (isStaff == 0) {
                        Home HOME = new Home();
                        HOME.setUser(name);
                        HOME.setVisible(true);
                        HOME.pack();
                        HOME.setLocationRelativeTo(null);
                        this.dispose();
                    } else {
                        Staff STAFF = new Staff();
                        STAFF.setUser(name);
                        STAFF.setVisible(true);
                        STAFF.pack();
                        STAFF.setLocationRelativeTo(null);
                        this.dispose();
                    }
                } else {
                    JOptionPane.showMessageDialog(new JFrame(), "Credenciais incorretas", "Erro", JOptionPane.ERROR_MESSAGE);
                }

                loginPassword.setText("");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao acessar o banco de dados: " + e.getMessage());
        }
    }//GEN-LAST:event_loginBtnActionPerformed

    private void signupBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupBtnActionPerformed
        Cadastro CADASTRO = new Cadastro();
        CADASTRO.setVisible(true);
        CADASTRO.pack();
        CADASTRO.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_signupBtnActionPerformed

    private void loginUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginUsernameActionPerformed
    
    public class DatabaseManager {
        private static final String SUrl = "jdbc:MySQL://localhost:3306/uservault";
        private static final String SUser = "root";
        private static final String SPass = "Data@Fit";
        
        public static Connection getConnection() throws SQLException {
            return DriverManager.getConnection(SUrl, SUser, SPass);
        }
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
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel banner;
    private javax.swing.JPanel formLogin;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel login;
    private javax.swing.JButton loginBtn;
    private javax.swing.JPasswordField loginPassword;
    private javax.swing.JTextField loginUsername;
    private javax.swing.JLabel naoTemUmaConta;
    private javax.swing.JLabel senha;
    private javax.swing.JButton signupBtn;
    private javax.swing.JLabel usuario;
    // End of variables declaration//GEN-END:variables
}
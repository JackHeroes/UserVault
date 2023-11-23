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

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        loginUsername = new javax.swing.JTextField();
        loginPassword = new javax.swing.JPasswordField();
        jButtonEntrar = new javax.swing.JButton();
        loginBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel2.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(255, 51, 51));
        jPanel3.setPreferredSize(new java.awt.Dimension(400, 500));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo.png"))); // NOI18N
        jLabel4.setText("jLabel4");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(126, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119))
        );

        jPanel2.add(jPanel3);
        jPanel3.setBounds(0, 0, 340, 500);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LOGIN");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(340, 10, 420, 40);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("SENHA");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(410, 260, 60, 50);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("USUARIO");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(410, 110, 60, 50);
        jPanel2.add(loginUsername);
        loginUsername.setBounds(410, 150, 330, 40);
        jPanel2.add(loginPassword);
        loginPassword.setBounds(410, 300, 330, 40);

        jButtonEntrar.setBackground(new java.awt.Color(255, 51, 51));
        jButtonEntrar.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jButtonEntrar.setText("CADASTRAR-SE");
        jButtonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEntrarActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonEntrar);
        jButtonEntrar.setBounds(530, 440, 100, 20);

        loginBtn.setBackground(new java.awt.Color(255, 51, 51));
        loginBtn.setText("ENTRAR");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });
        jPanel2.add(loginBtn);
        loginBtn.setBounds(410, 370, 80, 40);

        jLabel5.setText("Não tem uma conta?");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(410, 440, 130, 16);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEntrarActionPerformed
        Cadastro CADASTRO = new Cadastro(); 
        CADASTRO.setVisible(true);
        CADASTRO.pack();
        CADASTRO.setLocationRelativeTo(null);
        this.dispose(); 
    }//GEN-LAST:event_jButtonEntrarActionPerformed
    
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEntrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton loginBtn;
    private javax.swing.JPasswordField loginPassword;
    private javax.swing.JTextField loginUsername;
    // End of variables declaration//GEN-END:variables
}
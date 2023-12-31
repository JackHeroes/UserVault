package sistemadecadastro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import java.util.Arrays;

public class Cadastro extends javax.swing.JFrame {
    
    public Cadastro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        banner = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        formRegister = new javax.swing.JPanel();
        cadastrese = new javax.swing.JLabel();
        labelNome = new javax.swing.JLabel();
        registerName = new javax.swing.JTextField();
        labelUsuario = new javax.swing.JLabel();
        registerUsername = new javax.swing.JTextField();
        labelEmail = new javax.swing.JLabel();
        registerEmail = new javax.swing.JTextField();
        labelSenha = new javax.swing.JLabel();
        registerPassword = new javax.swing.JPasswordField();
        labelConfirmarSenha = new javax.swing.JLabel();
        registerConfirmPassword = new javax.swing.JPasswordField();
        SignUpBtn = new javax.swing.JButton();
        jaPossuiUmaConta = new javax.swing.JLabel();
        loginBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));

        banner.setBackground(new java.awt.Color(0, 71, 171));
        banner.setPreferredSize(new java.awt.Dimension(400, 600));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/uservault.png"))); // NOI18N

        javax.swing.GroupLayout bannerLayout = new javax.swing.GroupLayout(banner);
        banner.setLayout(bannerLayout);
        bannerLayout.setHorizontalGroup(
            bannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(bannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(bannerLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logo)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        bannerLayout.setVerticalGroup(
            bannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(bannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(bannerLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logo)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        formRegister.setPreferredSize(new java.awt.Dimension(300, 507));

        cadastrese.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        cadastrese.setForeground(new java.awt.Color(0, 71, 171));
        cadastrese.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cadastrese.setText("CADASTRE-SE");

        labelNome.setText("Nome");

        labelUsuario.setText("Usuário");

        labelEmail.setText("Email");

        labelSenha.setText("Senha");

        labelConfirmarSenha.setText("Confirme a sua senha");

        SignUpBtn.setBackground(new java.awt.Color(0, 71, 171));
        SignUpBtn.setForeground(new java.awt.Color(255, 255, 255));
        SignUpBtn.setFocusPainted(false);
        SignUpBtn.setLabel("CADASTRAR");
        SignUpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUpBtnActionPerformed(evt);
            }
        });

        jaPossuiUmaConta.setText("Ja possui uma conta?");

        loginBtn.setBackground(new java.awt.Color(0, 71, 171));
        loginBtn.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        loginBtn.setForeground(new java.awt.Color(255, 255, 255));
        loginBtn.setText("LOGIN");
        loginBtn.setFocusPainted(false);
        loginBtn.setPreferredSize(new java.awt.Dimension(120, 20));
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout formRegisterLayout = new javax.swing.GroupLayout(formRegister);
        formRegister.setLayout(formRegisterLayout);
        formRegisterLayout.setHorizontalGroup(
            formRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formRegisterLayout.createSequentialGroup()
                .addGroup(formRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelEmail)
                    .addComponent(labelSenha)
                    .addGroup(formRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(labelNome)
                        .addComponent(registerPassword)
                        .addComponent(registerEmail)
                        .addComponent(registerUsername)
                        .addComponent(registerName)
                        .addComponent(labelUsuario)
                        .addComponent(cadastrese, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(formRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(SignUpBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(formRegisterLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jaPossuiUmaConta)
                            .addGap(18, 18, 18)
                            .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(labelConfirmarSenha)
                    .addComponent(registerConfirmPassword))
                .addContainerGap())
        );
        formRegisterLayout.setVerticalGroup(
            formRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formRegisterLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(cadastrese)
                .addGap(18, 18, 18)
                .addComponent(labelNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registerName, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registerUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registerEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registerPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelConfirmarSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registerConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SignUpBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(formRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jaPossuiUmaConta)
                    .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(banner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(formRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(banner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(formRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("CADASTRO");

        pack();
    }// </editor-fold>//GEN-END:initComponents
       
    private void SignUpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUpBtnActionPerformed

        String name = registerName.getText();
        String username = registerUsername.getText();
        String email = registerEmail.getText();
        char[] password = registerPassword.getPassword();
        char[] confirmPassword = registerConfirmPassword.getPassword();

        if (name.isEmpty() || username.isEmpty() || email.isEmpty() || password.length == 0 || confirmPassword.length == 0) {
            JOptionPane.showMessageDialog(new JFrame(), "Todos os campos são obrigatórios", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
                  
        if (!ValidatorEmail.isValidEmail(email)) {
            showMessageDialog(null, "O formato do email é inválido.");
            return;
        }
                     
        if (!ValidatorPassword.isStrongPassword(password)) {
            showMessageDialog(null, "A senha não atende aos critérios de segurança. "
                    + "A senha precisa ter no mínimo 8 caracteres, sendo pelo menos um maiúsculo, um minusculo, um número e um caractere especial.");
            return;
        }
        
        if (!Arrays.equals(password, confirmPassword)) {
            showMessageDialog(null, "As senhas não coincidem. Por favor, confirme a senha corretamente.");
            return;
        }

        try (Connection con = DatabaseManager.getConnection()) {
     
            if (ValidatorUserEmail.userOrEmailExists(con, username, email)) {
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
            registerConfirmPassword.setText("");
            showMessageDialog(null, "Conta criada com sucesso!");
            
            Login LOGIN = new Login();
            LOGIN.setVisible(true);
            LOGIN.pack();
            LOGIN.setLocationRelativeTo(null);
        this.dispose();
        } catch (SQLException e) {
            System.out.println("Erro ao acessar o banco de dados: " + e.getMessage());
        }
    }//GEN-LAST:event_SignUpBtnActionPerformed

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        Login LOGIN = new Login();
        LOGIN.setVisible(true);
        LOGIN.pack();
        LOGIN.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_loginBtnActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> {
            new Cadastro().setVisible(true);
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SignUpBtn;
    private javax.swing.JPanel banner;
    private javax.swing.JLabel cadastrese;
    private javax.swing.JPanel formRegister;
    private javax.swing.JLabel jaPossuiUmaConta;
    private javax.swing.JLabel labelConfirmarSenha;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelSenha;
    private javax.swing.JLabel labelUsuario;
    private javax.swing.JButton loginBtn;
    private javax.swing.JLabel logo;
    private javax.swing.JPasswordField registerConfirmPassword;
    private javax.swing.JTextField registerEmail;
    private javax.swing.JTextField registerName;
    private javax.swing.JPasswordField registerPassword;
    private javax.swing.JTextField registerUsername;
    // End of variables declaration//GEN-END:variables
}
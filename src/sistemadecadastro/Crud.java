package sistemadecadastro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static javax.swing.JOptionPane.showMessageDialog;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Crud extends javax.swing.JFrame {
    
    private String staffName = "";
    
    public Crud() {
        initComponents();
        populateTable();
    }
    
    public Crud(String staffName) {
        this.staffName = staffName;
        initComponents();
        populateTable();
    }
    
    public String getStaffName() {
        return staffName;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        gerenciamentoDeUsuario = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        updateBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        create = new javax.swing.JPanel();
        labelNome = new javax.swing.JLabel();
        createName = new javax.swing.JTextField();
        labelUsuario = new javax.swing.JLabel();
        createUsername = new javax.swing.JTextField();
        labelEmail = new javax.swing.JLabel();
        createEmail = new javax.swing.JTextField();
        labelSenha = new javax.swing.JLabel();
        createPassword = new javax.swing.JPasswordField();
        labelConfirmarSenha = new javax.swing.JLabel();
        createConfirmPassword = new javax.swing.JPasswordField();
        labelStaff = new javax.swing.JLabel();
        createSimStaff = new javax.swing.JRadioButton();
        createNaoStaff = new javax.swing.JRadioButton();
        createBtn = new javax.swing.JButton();
        table = new javax.swing.JScrollPane();
        usuarios = new javax.swing.JTable();
        backBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1020, 700));
        setResizable(false);
        setSize(new java.awt.Dimension(1020, 700));

        jPanel1.setBackground(new java.awt.Color(0, 71, 171));
        jPanel1.setPreferredSize(new java.awt.Dimension(1020, 100));

        gerenciamentoDeUsuario.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        gerenciamentoDeUsuario.setForeground(new java.awt.Color(255, 255, 255));
        gerenciamentoDeUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gerenciamentoDeUsuario.setText("Gerenciamento de usuário");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(gerenciamentoDeUsuario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(gerenciamentoDeUsuario)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(1020, 600));

        updateBtn.setBackground(new java.awt.Color(0, 71, 171));
        updateBtn.setForeground(new java.awt.Color(255, 255, 255));
        updateBtn.setText("ATUALIZAR");
        updateBtn.setFocusPainted(false);
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        deleteBtn.setBackground(new java.awt.Color(0, 71, 171));
        deleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        deleteBtn.setText("EXCLUIR");
        deleteBtn.setFocusPainted(false);
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        create.setBackground(new java.awt.Color(102, 102, 102));

        labelNome.setForeground(new java.awt.Color(255, 255, 255));
        labelNome.setText("Nome");

        labelUsuario.setForeground(new java.awt.Color(255, 255, 255));
        labelUsuario.setText("Usuário");

        labelEmail.setForeground(new java.awt.Color(255, 255, 255));
        labelEmail.setText("Email");

        labelSenha.setForeground(new java.awt.Color(255, 255, 255));
        labelSenha.setText("Senha");

        labelConfirmarSenha.setForeground(new java.awt.Color(255, 255, 255));
        labelConfirmarSenha.setText("Confirme a senha");

        labelStaff.setForeground(new java.awt.Color(255, 255, 255));
        labelStaff.setText("O usuário é um administrador?");

        createSimStaff.setBackground(new java.awt.Color(102, 102, 102));
        buttonGroup1.add(createSimStaff);
        createSimStaff.setForeground(new java.awt.Color(255, 255, 255));
        createSimStaff.setText("Sim");
        createSimStaff.setContentAreaFilled(false);
        createSimStaff.setFocusPainted(false);

        createNaoStaff.setBackground(new java.awt.Color(102, 102, 102));
        buttonGroup1.add(createNaoStaff);
        createNaoStaff.setForeground(new java.awt.Color(255, 255, 255));
        createNaoStaff.setSelected(true);
        createNaoStaff.setText("Não");
        createNaoStaff.setContentAreaFilled(false);
        createNaoStaff.setFocusPainted(false);

        createBtn.setBackground(new java.awt.Color(0, 71, 171));
        createBtn.setForeground(new java.awt.Color(255, 255, 255));
        createBtn.setFocusPainted(false);
        createBtn.setLabel("CADASTRAR");
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout createLayout = new javax.swing.GroupLayout(create);
        create.setLayout(createLayout);
        createLayout.setHorizontalGroup(
            createLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(createBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(createConfirmPassword)
            .addComponent(createPassword)
            .addComponent(createEmail)
            .addComponent(createUsername)
            .addComponent(createName)
            .addGroup(createLayout.createSequentialGroup()
                .addGroup(createLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelConfirmarSenha)
                    .addComponent(labelUsuario)
                    .addComponent(labelNome)
                    .addComponent(labelSenha)
                    .addComponent(labelEmail)
                    .addComponent(labelStaff))
                .addContainerGap(148, Short.MAX_VALUE))
            .addGroup(createLayout.createSequentialGroup()
                .addComponent(createSimStaff)
                .addGap(18, 18, 18)
                .addComponent(createNaoStaff)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        createLayout.setVerticalGroup(
            createLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(labelNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(createName, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(createUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(createEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(createPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelConfirmarSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(createConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelStaff)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(createLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createNaoStaff)
                    .addComponent(createSimStaff))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(createBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        usuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOME", "USUÁRIO", "EMAIL", "SENHA", "STAFF"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setViewportView(usuarios);
        usuarios.getAccessibleContext().setAccessibleName("");

        backBtn.setBackground(new java.awt.Color(102, 102, 102));
        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/arrow.png"))); // NOI18N
        backBtn.setBorderPainted(false);
        backBtn.setFocusPainted(false);
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(create, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(table, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(backBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(create, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(table))
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        getAccessibleContext().setAccessibleName("CRUDCREATE");

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void populateTable() {
        try (Connection con = DatabaseManager.getConnection()) {
            String query = "SELECT * FROM user";
                try (PreparedStatement ps = con.prepareStatement(query)) {
                    try (ResultSet rs = ps.executeQuery()) {
                        DefaultTableModel model = (DefaultTableModel) usuarios.getModel();
                        model.setRowCount(0); 

                        while (rs.next()) {
                            int userId = rs.getInt("id_user"); 
                            String name = rs.getString("full_name");
                            String username = rs.getString("username");
                            String email = rs.getString("email");
                            String hashedPassword = rs.getString("password");
                            boolean isStaff = rs.getBoolean("is_staff");

                            model.addRow(new Object[]{userId, name, username, email, hashedPassword, isStaff});
                        }
                    }
                }
            } catch (SQLException e) {
                System.out.println("Erro ao acessar o banco de dados: " + e.getMessage());
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
    
    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        String name = createName.getText();
        String username = createUsername.getText();
        String email = createEmail.getText();
        char[] password = createPassword.getPassword();
        char[] confirmPassword = createConfirmPassword.getPassword();
        boolean isStaff = createSimStaff.isSelected();

        if (name.isEmpty() || username.isEmpty() || email.isEmpty() || password.length == 0 || confirmPassword.length == 0) {
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

        if (!Arrays.equals(password, confirmPassword)) {
            showMessageDialog(null, "As senhas não coincidem. Por favor, confirme a senha corretamente.");
            return;
        }

        try (Connection con = DatabaseManager.getConnection()) {
            
            if (userOrEmailExists(con, username, email)) {
                showMessageDialog(null, "Usuário ou email já existem. Escolha outro.");
                return;
            }

            String hashedPassword = HashUtil.hashPassword(password);

            String query = "INSERT INTO user(username, full_name, email, password, is_staff) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement ps = con.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS)) {
                ps.setString(1, username);
                ps.setString(2, name);
                ps.setString(3, email);
                ps.setString(4, hashedPassword);
                ps.setBoolean(5, isStaff);

                int affectedRows = ps.executeUpdate();

                if (affectedRows > 0) {
                    try (ResultSet generatedKeys = ps.getGeneratedKeys()) {
                        if (generatedKeys.next()) {
                            int userId = generatedKeys.getInt(1);
                            
                            DefaultTableModel model = (DefaultTableModel) usuarios.getModel();
                            model.addRow(new Object[]{userId, name, username, email, hashedPassword, isStaff});
                        }
                    }
                }
            }

            createName.setText("");
            createUsername.setText("");
            createEmail.setText("");
            createPassword.setText("");
            createConfirmPassword.setText("");
            createSimStaff.setSelected(false); 
            createNaoStaff.setSelected(true);  
            showMessageDialog(null, "Usuário criado com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao acessar o banco de dados: " + e.getMessage());
        }
    }//GEN-LAST:event_createBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        int selectedRow = usuarios.getSelectedRow();

        if (selectedRow == -1) {
            showMessageDialog(null, "Selecione uma linha para atualizar.");
            return;
        }

        int userId = (int) usuarios.getValueAt(selectedRow, 0);

        String name = createName.getText();
        String username = createUsername.getText();
        String email = createEmail.getText();
        char[] password = createPassword.getPassword();
        char[] confirmPassword = createConfirmPassword.getPassword();
        boolean isStaff = createSimStaff.isSelected();

        if (!Arrays.equals(password, confirmPassword)) {
            showMessageDialog(null, "As senhas não coincidem. Por favor, confirme a senha corretamente.");
            return;
        }

        try (Connection con = DatabaseManager.getConnection()) {

            String query = "SELECT COUNT(*) FROM user WHERE (username = ? OR email = ?) AND id_user <> ?";
            try (PreparedStatement ps = con.prepareStatement(query)) {
                ps.setString(1, username);
                ps.setString(2, email);
                ps.setInt(3, userId);

                try (ResultSet rs = ps.executeQuery()) {
                    if (rs.next() && rs.getInt(1) > 0) {
                        showMessageDialog(null, "Nome de usuário ou e-mail já existem. Escolha outro.");
                        return;
                    }
                }
            }

            StringBuilder sqlBuilder = new StringBuilder("UPDATE user SET");

            if (!name.isEmpty()) {
                sqlBuilder.append(" full_name = ?,");
            }
            if (!username.isEmpty()) {
                sqlBuilder.append(" username = ?,");
            }
            if (!email.isEmpty()) {
                if (!isValidEmail(email)) {
                    showMessageDialog(null, "O formato do e-mail é inválido.");
                    return;
                }
                sqlBuilder.append(" email = ?,");
            }
            if (password.length > 0) {
                if (!isStrongPassword(password)) {
                    showMessageDialog(null, "A senha não atende aos critérios de segurança. "
                            + "A senha precisa ter no mínimo 8 caracteres, sendo pelo menos um maiúsculo, um minúsculo, um número e um caractere especial.");
                    return;
                }
                sqlBuilder.append(" password = ?,");
            }
            sqlBuilder.append(" is_staff = ?");

            if (sqlBuilder.charAt(sqlBuilder.length() - 1) == ',') {
                sqlBuilder.deleteCharAt(sqlBuilder.length() - 1);
            }

            sqlBuilder.append(" WHERE id_user = ?");

            try (PreparedStatement ps = con.prepareStatement(sqlBuilder.toString())) {
                int paramIndex = 1;

                if (!name.isEmpty()) {
                    ps.setString(paramIndex++, name);
                }
                if (!username.isEmpty()) {
                    ps.setString(paramIndex++, username);
                }
                if (!email.isEmpty()) {
                    ps.setString(paramIndex++, email);
                }
                if (password.length > 0) {
                    ps.setString(paramIndex++, HashUtil.hashPassword(password));
                }
                ps.setBoolean(paramIndex++, isStaff);
                ps.setInt(paramIndex, userId);

                int affectedRows = ps.executeUpdate();

                if (affectedRows > 0) {
                    DefaultTableModel model = (DefaultTableModel) usuarios.getModel();

                    if (!name.isEmpty()) {
                        model.setValueAt(name, selectedRow, 1);
                    }
                    if (!username.isEmpty()) {
                        model.setValueAt(username, selectedRow, 2);
                    }
                    if (!email.isEmpty()) {
                        model.setValueAt(email, selectedRow, 3);
                    }
                    if (password.length > 0) {
                        model.setValueAt(HashUtil.hashPassword(password), selectedRow, 4);
                    }
                    model.setValueAt(isStaff, selectedRow, 5);
                    
                    createName.setText("");
                    createUsername.setText("");
                    createEmail.setText("");
                    createPassword.setText("");
                    createConfirmPassword.setText("");
                    createSimStaff.setSelected(false); 
                    createNaoStaff.setSelected(true);  
                    showMessageDialog(null, "Usuário atualizado com sucesso!");
                } else {
                    showMessageDialog(null, "Falha ao atualizar usuário. Verifique os dados e tente novamente.");
                }
            }
        } catch (SQLException e) {
            System.out.println("Erro ao acessar o banco de dados: " + e.getMessage());
        }
    }//GEN-LAST:event_updateBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        int selectedRow = usuarios.getSelectedRow();

        if (selectedRow == -1) {
            showMessageDialog(null, "Selecione uma linha para excluir.");
            return;
        }

        int userId = (int) usuarios.getValueAt(selectedRow, 0);

        try (Connection con = DatabaseManager.getConnection()) {
            
            String query = "DELETE FROM user WHERE id_user = ?";
            try (PreparedStatement ps = con.prepareStatement(query)) {
                ps.setInt(1, userId);
                ps.executeUpdate();
            }

            DefaultTableModel model = (DefaultTableModel) usuarios.getModel();
            model.removeRow(selectedRow);

            showMessageDialog(null, "Usuário excluído com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao acessar o banco de dados: " + e.getMessage());
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        Staff STAFF = new Staff();
        STAFF.setUser(staffName);
        STAFF.setVisible(true);
        STAFF.pack();
        STAFF.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Crud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Crud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Crud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Crud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(() -> {
            new Crud().setVisible(true);
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel create;
    private javax.swing.JButton createBtn;
    private javax.swing.JPasswordField createConfirmPassword;
    private javax.swing.JTextField createEmail;
    private javax.swing.JTextField createName;
    private javax.swing.JRadioButton createNaoStaff;
    private javax.swing.JPasswordField createPassword;
    private javax.swing.JRadioButton createSimStaff;
    private javax.swing.JTextField createUsername;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel gerenciamentoDeUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelConfirmarSenha;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelSenha;
    private javax.swing.JLabel labelStaff;
    private javax.swing.JLabel labelUsuario;
    private javax.swing.JScrollPane table;
    private javax.swing.JButton updateBtn;
    private javax.swing.JTable usuarios;
    // End of variables declaration//GEN-END:variables
}
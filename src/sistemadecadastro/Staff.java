package sistemadecadastro;

public class Staff extends javax.swing.JFrame {
    
    private String name;
    
    public Staff() {
        initComponents();
    }
    
    public void setUser(String name){
        this.name = name;
        staffUsername.setText(name);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        LogoutBtn = new javax.swing.JButton();
        mensagem = new javax.swing.JPanel();
        bemvindo = new javax.swing.JLabel();
        staffUsername = new javax.swing.JLabel();
        crudBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Staff");
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));

        menu.setBackground(new java.awt.Color(0, 71, 171));
        menu.setPreferredSize(new java.awt.Dimension(800, 80));

        logo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        logo.setForeground(new java.awt.Color(255, 255, 255));
        logo.setText("UserVault");

        LogoutBtn.setBackground(new java.awt.Color(0, 71, 171));
        LogoutBtn.setForeground(new java.awt.Color(0, 71, 171));
        LogoutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logout.png"))); // NOI18N
        LogoutBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        LogoutBtn.setBorderPainted(false);
        LogoutBtn.setFocusPainted(false);
        LogoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(logo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LogoutBtn)
                .addGap(24, 24, 24))
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LogoutBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );

        bemvindo.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        bemvindo.setText("Bem-vindo!");

        staffUsername.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        staffUsername.setText("Jack");

        javax.swing.GroupLayout mensagemLayout = new javax.swing.GroupLayout(mensagem);
        mensagem.setLayout(mensagemLayout);
        mensagemLayout.setHorizontalGroup(
            mensagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mensagemLayout.createSequentialGroup()
                .addComponent(bemvindo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(staffUsername)
                .addGap(0, 0, 0))
        );
        mensagemLayout.setVerticalGroup(
            mensagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mensagemLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(mensagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bemvindo)
                    .addComponent(staffUsername))
                .addGap(0, 0, 0))
        );

        crudBtn.setBackground(new java.awt.Color(0, 71, 171));
        crudBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        crudBtn.setForeground(new java.awt.Color(255, 255, 255));
        crudBtn.setText("Gerenciamento de usuário");
        crudBtn.setFocusPainted(false);
        crudBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crudBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(mensagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(crudBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(mensagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(crudBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crudBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crudBtnActionPerformed
        Crud CRUD = new Crud(name);
        CRUD.setVisible(true);
        CRUD.pack();
        CRUD.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_crudBtnActionPerformed

    private void LogoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutBtnActionPerformed
        Login LOGIN = new Login();
        LOGIN.setVisible(true);
        LOGIN.pack();
        LOGIN.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_LogoutBtnActionPerformed
    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(() -> {
            new Home().setVisible(true);
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LogoutBtn;
    private javax.swing.JLabel bemvindo;
    private javax.swing.JButton crudBtn;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel mensagem;
    private javax.swing.JPanel menu;
    private javax.swing.JLabel staffUsername;
    // End of variables declaration//GEN-END:variables
}
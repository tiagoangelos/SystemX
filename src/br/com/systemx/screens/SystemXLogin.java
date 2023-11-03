package br.com.systemx.screens;

import java.sql.*;
import br.com.systemx.dal.ModuleConnection;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class SystemXLogin extends javax.swing.JFrame {

    Connection connect = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public void login() {
        String sql = "select * from tbusuarios where login = ? and senha = ?";

        try {
            pst = connect.prepareStatement(sql);
            pst.setString(1, textUser.getText());
            pst.setString(2, textPass.getText());

            rs = pst.executeQuery();

            if (rs.next()) {
                SystemXHome home = new SystemXHome();
                home.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null,
                        "Login Inválido!\n\n"
                        + "Usuário e/ou Senha Inválido! \n"
                        + "Verifique o Usuário e Senha\n"
                        + "Ou Fale Com o Administrador Do Sistema.",
                        "Login Inválido!", JOptionPane.ERROR_MESSAGE
                );
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,
                    "Sistema Indiponível \n\n"
                    + "Verifique Sua Conexão Com a Internet \n"
                    + "Ou Entre em Contato com o Desenvolvedor \n"
                    + "Do Sistema!",
                    "Sistema Indiponível", JOptionPane.ERROR_MESSAGE
            );
        }
    }

    public SystemXLogin() {
        initComponents();

        connect = ModuleConnection.conector();

        if (connect != null) {
            dbStatus.setIcon(new ImageIcon(getClass().getResource("/br/com/systemx/icons/dbok.png")));
        } else {
        }
    }

    public void verifyEmptyFields() {
        if (textUser.getText().equals("") || textPass.getText().equals("")) {
            JOptionPane.showMessageDialog(null,
                    "Campos Vazio! \n\n"
                    + "Informe o Usuario e Senha \n"
                    + "Corretamente! \n"
                    , "Campos Vazio!", JOptionPane.INFORMATION_MESSAGE
            );
        } else {
            login();
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textInstruction = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        textUser = new javax.swing.JTextField();
        lblPass = new javax.swing.JLabel();
        textPass = new javax.swing.JPasswordField();
        dbStatus = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SystemX - (V 1.0) - Login");
        setIconImage(new ImageIcon(getClass().getResource("/br/com/systemx/icons/logo.png")).getImage());
        setResizable(false);

        textInstruction.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        textInstruction.setText("Entre com seus dados corretamente para acessar o sistema");

        lblUser.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 22)); // NOI18N
        lblUser.setText("Usuario:");

        textUser.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 22)); // NOI18N

        lblPass.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 22)); // NOI18N
        lblPass.setText("Senha:");

        textPass.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 22)); // NOI18N

        dbStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/systemx/icons/dberror.png"))); // NOI18N

        btnLogin.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 22)); // NOI18N
        btnLogin.setText(" Entrar");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/systemx/icons/logo.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblUser)
                        .addComponent(lblPass)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(dbStatus)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLogin))
                        .addComponent(textPass, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(textUser, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
                        .addComponent(textInstruction, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(textInstruction)
                .addGap(26, 26, 26)
                .addComponent(lblUser, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblPass, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnLogin)
                    .addComponent(dbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        verifyEmptyFields();
    }//GEN-LAST:event_btnLoginActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SystemXLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel dbStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblUser;
    private javax.swing.JLabel textInstruction;
    private javax.swing.JPasswordField textPass;
    private javax.swing.JTextField textUser;
    // End of variables declaration//GEN-END:variables
}

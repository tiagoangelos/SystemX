package br.com.systemx.screens;

import java.sql.*;
import br.com.systemx.dal.ModuleConnection;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class SystemXLogin extends javax.swing.JFrame {
    
    SystemXHome systemXHome = new SystemXHome();
    
    Connection connect = null;
    PreparedStatement pst = null;
    ResultSet resultSet = null;
    
    public SystemXLogin() {
        initComponents();
        connectDataBase();
    }
    
    public void connectDataBase(){
        connect = ModuleConnection.conector();

        if (connect != null) {
            dbStatus.setIcon(new ImageIcon(getClass().getResource("/br/com/systemx/icons/dbok.png")));
        } else {
            dbStatus.setIcon(new ImageIcon(getClass().getResource("/br/com/systemx/icons/dberror.png")));
        }
    }
    
    public void login() {
        String user = new String(textUser.getText());
        String pass = new String(textPass.getPassword());
        String sql = "select * from tbusuarios where login = ? and senha = ?";
        
        try {
            pst = connect.prepareStatement(sql);
            pst.setString(1, user);
            pst.setString(2, pass);

            resultSet = pst.executeQuery();

            if (resultSet.next()) {
                String profile = resultSet.getString(6);
                
                if(profile.equals("admin")){
                    systemXHome.menuUser.setEnabled(true);
                    systemXHome.menuReport.setEnabled(true);
                    systemXHome.lblUser.setForeground(Color.RED);
                }else{
                    systemXHome.menuUser.setEnabled(false);
                    systemXHome.menuReport.setEnabled(false);
                    systemXHome.lblUser.setForeground(Color.BLACK);
                }
                                
                systemXHome.lblUser.setText(resultSet.getString(2));
                
                this.dispose();
                connect.close();
                systemXHome.setVisible(true);
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
            
            connectDataBase();
        }
    }

    public void verifyEmptyFields() {
        if (textUser.getText().equals("") || textPass.getPassword().equals("")) {
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

        mainPanel = new javax.swing.JPanel();
        headerPanel = new javax.swing.JPanel();
        textInstruction = new javax.swing.JLabel();
        logoSystemX = new javax.swing.JLabel();
        loginPanel = new javax.swing.JPanel();
        lblUser = new javax.swing.JLabel();
        textUser = new javax.swing.JTextField();
        lblPass = new javax.swing.JLabel();
        textPass = new javax.swing.JPasswordField();
        dbStatus = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SystemX - (V 1.0) - Login");
        setIconImage(new ImageIcon(getClass().getResource("/br/com/systemx/icons/logo.png")).getImage());
        setResizable(false);

        textInstruction.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        textInstruction.setText("Entre Com Seus Dados Corretamente Para Acessar o Sistema.");

        logoSystemX.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/systemx/icons/logo-login.png"))); // NOI18N

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logoSystemX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(headerPanelLayout.createSequentialGroup()
                        .addComponent(textInstruction, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoSystemX)
                .addGap(12, 12, 12)
                .addComponent(textInstruction)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        lblUser.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 22)); // NOI18N
        lblUser.setText("Usuario:");

        textUser.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 22)); // NOI18N

        lblPass.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 22)); // NOI18N
        lblPass.setText("Senha:");

        textPass.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 22)); // NOI18N

        dbStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/systemx/icons/dberror.png"))); // NOI18N

        btnLogin.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 22)); // NOI18N
        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/systemx/icons/user-login.png"))); // NOI18N
        btnLogin.setText(" Entrar");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textUser)
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addComponent(dbStatus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLogin))
                    .addComponent(textPass)
                    .addComponent(lblUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblPass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblUser, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblPass, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLogin))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(loginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblUser;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JLabel logoSystemX;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel textInstruction;
    private javax.swing.JPasswordField textPass;
    private javax.swing.JTextField textUser;
    // End of variables declaration//GEN-END:variables
}
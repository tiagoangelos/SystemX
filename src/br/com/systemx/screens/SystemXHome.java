package br.com.systemx.screens;

import java.text.DateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class SystemXHome extends javax.swing.JFrame {

    public SystemXHome() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPanel = new javax.swing.JDesktopPane();
        iconsPanel = new javax.swing.JPanel();
        logoSystemx = new javax.swing.JLabel();
        logoComputer = new javax.swing.JLabel();
        userPanel = new javax.swing.JPanel();
        lbltextUser = new javax.swing.JLabel();
        lbltextDate = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        menuRegister = new javax.swing.JMenu();
        menuClient = new javax.swing.JMenuItem();
        menuOs = new javax.swing.JMenuItem();
        menuUser = new javax.swing.JMenuItem();
        menuReport = new javax.swing.JMenu();
        menuServices = new javax.swing.JMenuItem();
        menuHelp = new javax.swing.JMenu();
        menuAbout = new javax.swing.JMenuItem();
        menuOption = new javax.swing.JMenu();
        menuExit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SystemX - Sistema para OS - (V 1.0) - Inicio");
        setIconImage(new ImageIcon(getClass().getResource("/br/com/systemx/icons/logo.png")).getImage());
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        desktopPanel.setBackground(new java.awt.Color(0, 160, 200));
        desktopPanel.setPreferredSize(new java.awt.Dimension(650, 580));

        javax.swing.GroupLayout desktopPanelLayout = new javax.swing.GroupLayout(desktopPanel);
        desktopPanel.setLayout(desktopPanelLayout);
        desktopPanelLayout.setHorizontalGroup(
            desktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 682, Short.MAX_VALUE)
        );
        desktopPanelLayout.setVerticalGroup(
            desktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 582, Short.MAX_VALUE)
        );

        logoSystemx.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoSystemx.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/systemx/icons/logo.png"))); // NOI18N

        logoComputer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoComputer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/systemx/icons/computer.png"))); // NOI18N

        javax.swing.GroupLayout iconsPanelLayout = new javax.swing.GroupLayout(iconsPanel);
        iconsPanel.setLayout(iconsPanelLayout);
        iconsPanelLayout.setHorizontalGroup(
            iconsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(iconsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(iconsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logoSystemx, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logoComputer, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE))
                .addContainerGap())
        );
        iconsPanelLayout.setVerticalGroup(
            iconsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(iconsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoSystemx, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logoComputer, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        userPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));
        userPanel.setForeground(new java.awt.Color(255, 255, 255));

        lbltextUser.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 22)); // NOI18N
        lbltextUser.setText("Usuario");

        lbltextDate.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 22)); // NOI18N
        lbltextDate.setText("Data");

        lblUser.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        lblUser.setForeground(new java.awt.Color(255, 0, 0));
        lblUser.setText("Name");

        lblDate.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        lblDate.setText("00/00/0000");

        javax.swing.GroupLayout userPanelLayout = new javax.swing.GroupLayout(userPanel);
        userPanel.setLayout(userPanelLayout);
        userPanelLayout.setHorizontalGroup(
            userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(userPanelLayout.createSequentialGroup()
                        .addGroup(userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbltextDate)
                            .addComponent(lbltextUser))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        userPanelLayout.setVerticalGroup(
            userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lbltextUser)
                .addGap(5, 5, 5)
                .addComponent(lblUser)
                .addGap(18, 18, 18)
                .addComponent(lbltextDate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDate)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        menuRegister.setText("Cadastro");

        menuClient.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_DOWN_MASK));
        menuClient.setText("Cliente");
        menuRegister.add(menuClient);

        menuOs.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.ALT_DOWN_MASK));
        menuOs.setText("OS");
        menuRegister.add(menuOs);

        menuUser.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_DOWN_MASK));
        menuUser.setText("Usuário");
        menuUser.setEnabled(false);
        menuUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuUserActionPerformed(evt);
            }
        });
        menuRegister.add(menuUser);

        menuBar.add(menuRegister);

        menuReport.setText("Relatório");
        menuReport.setEnabled(false);

        menuServices.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_DOWN_MASK));
        menuServices.setText("Serviço");
        menuReport.add(menuServices);

        menuBar.add(menuReport);

        menuHelp.setText("Ajuda");

        menuAbout.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.ALT_DOWN_MASK));
        menuAbout.setText("Sobre");
        menuAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAboutActionPerformed(evt);
            }
        });
        menuHelp.add(menuAbout);

        menuBar.add(menuHelp);

        menuOption.setText("Opções");

        menuExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_DOWN_MASK));
        menuExit.setText("Sair");
        menuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExitActionPerformed(evt);
            }
        });
        menuOption.add(menuExit);

        menuBar.add(menuOption);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktopPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 682, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(iconsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(userPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(iconsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(userPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4))
            .addComponent(desktopPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.SHORT);

        lblDate.setText(dateFormat.format(date));
    }//GEN-LAST:event_formWindowActivated

    private void menuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExitActionPerformed
        int exit = JOptionPane.showConfirmDialog(null,"Tem certeza quê deseja sair? ","Sair Do Sistema", JOptionPane.WARNING_MESSAGE);

        if (exit == JOptionPane.YES_OPTION) {
            System.exit(0);
        } else {}
    }//GEN-LAST:event_menuExitActionPerformed

    private void menuAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAboutActionPerformed
        SystemXAbout about = new SystemXAbout();
        about.setVisible(true);
    }//GEN-LAST:event_menuAboutActionPerformed

    private void menuUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuUserActionPerformed
        SystemXUsers systemXUsers = new SystemXUsers();
        systemXUsers.setVisible(true);
        desktopPanel.add(systemXUsers);
    }//GEN-LAST:event_menuUserActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SystemXHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPanel;
    private javax.swing.JPanel iconsPanel;
    public javax.swing.JLabel lblDate;
    public javax.swing.JLabel lblUser;
    private javax.swing.JLabel lbltextDate;
    private javax.swing.JLabel lbltextUser;
    private javax.swing.JLabel logoComputer;
    private javax.swing.JLabel logoSystemx;
    private javax.swing.JMenuItem menuAbout;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem menuClient;
    private javax.swing.JMenuItem menuExit;
    private javax.swing.JMenu menuHelp;
    private javax.swing.JMenu menuOption;
    private javax.swing.JMenuItem menuOs;
    private javax.swing.JMenu menuRegister;
    public javax.swing.JMenu menuReport;
    private javax.swing.JMenuItem menuServices;
    public javax.swing.JMenuItem menuUser;
    private javax.swing.JPanel userPanel;
    // End of variables declaration//GEN-END:variables
}
package br.com.systemx.screens;

public class SystemXHome extends javax.swing.JFrame {
    
    public SystemXHome() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPanel = new javax.swing.JDesktopPane();
        redLightIcon = new javax.swing.JLabel();
        penalUser = new javax.swing.JPanel();
        lbltextUser = new javax.swing.JLabel();
        lbltextDate = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        menuRegister = new javax.swing.JMenu();
        menuClient = new javax.swing.JMenuItem();
        menuOs = new javax.swing.JMenuItem();
        menuUser = new javax.swing.JMenuItem();
        menuReport = new javax.swing.JMenu();
        menuService = new javax.swing.JMenuItem();
        menuHelp = new javax.swing.JMenu();
        menuAbout = new javax.swing.JMenuItem();
        menuOption = new javax.swing.JMenu();
        menuExit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SystemX - Sistema para OS - (V 1.0) - Inicio");
        setResizable(false);

        desktopPanel.setBackground(new java.awt.Color(61, 101, 132));

        javax.swing.GroupLayout desktopPanelLayout = new javax.swing.GroupLayout(desktopPanel);
        desktopPanel.setLayout(desktopPanelLayout);
        desktopPanelLayout.setHorizontalGroup(
            desktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 636, Short.MAX_VALUE)
        );
        desktopPanelLayout.setVerticalGroup(
            desktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        redLightIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        redLightIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/systemx/icons/XLight.png"))); // NOI18N

        penalUser.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));
        penalUser.setForeground(new java.awt.Color(255, 255, 255));

        lbltextUser.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 22)); // NOI18N
        lbltextUser.setText("Usuario");

        lbltextDate.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 22)); // NOI18N
        lbltextDate.setText("Data");

        lblUser.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        lblUser.setForeground(new java.awt.Color(255, 0, 0));
        lblUser.setText("Name");

        lblDate.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        lblDate.setText("00/00/0000");

        javax.swing.GroupLayout penalUserLayout = new javax.swing.GroupLayout(penalUser);
        penalUser.setLayout(penalUserLayout);
        penalUserLayout.setHorizontalGroup(
            penalUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(penalUserLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(penalUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbltextUser)
                    .addComponent(lbltextDate)
                    .addComponent(lblUser)
                    .addComponent(lblDate))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        penalUserLayout.setVerticalGroup(
            penalUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(penalUserLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbltextUser)
                .addGap(11, 11, 11)
                .addComponent(lblUser)
                .addGap(18, 18, 18)
                .addComponent(lbltextDate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDate)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/systemx/icons/computer.png"))); // NOI18N

        menuRegister.setText("Cadastro");

        menuClient.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        menuClient.setText("Cliente");
        menuRegister.add(menuClient);

        menuOs.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.ALT_MASK));
        menuOs.setText("OS");
        menuRegister.add(menuOs);

        menuUser.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_MASK));
        menuUser.setText("Usuário");
        menuRegister.add(menuUser);

        menuBar.add(menuRegister);

        menuReport.setText("Relatório");

        menuService.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        menuService.setText("Serviço");
        menuReport.add(menuService);

        menuBar.add(menuReport);

        menuHelp.setText("Ajuda");

        menuAbout.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.ALT_MASK));
        menuAbout.setText("Sobre");
        menuHelp.add(menuAbout);

        menuBar.add(menuHelp);

        menuOption.setText("Opções");

        menuExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        menuExit.setText("Sair");
        menuOption.add(menuExit);

        menuBar.add(menuOption);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktopPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(penalUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(redLightIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPanel)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(redLightIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(penalUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SystemXHome().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblUser;
    private javax.swing.JLabel lbltextDate;
    private javax.swing.JLabel lbltextUser;
    private javax.swing.JMenuItem menuAbout;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem menuClient;
    private javax.swing.JMenuItem menuExit;
    private javax.swing.JMenu menuHelp;
    private javax.swing.JMenu menuOption;
    private javax.swing.JMenuItem menuOs;
    private javax.swing.JMenu menuRegister;
    private javax.swing.JMenu menuReport;
    private javax.swing.JMenuItem menuService;
    private javax.swing.JMenuItem menuUser;
    private javax.swing.JPanel penalUser;
    private javax.swing.JLabel redLightIcon;
    // End of variables declaration//GEN-END:variables
}
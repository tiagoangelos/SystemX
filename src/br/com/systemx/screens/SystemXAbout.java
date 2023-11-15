package br.com.systemx.screens;

import javax.swing.ImageIcon;

public class SystemXAbout extends javax.swing.JFrame {
    
    public SystemXAbout() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        aboutPanel = new javax.swing.JPanel();
        lblDescription = new javax.swing.JLabel();
        lblDeveloper = new javax.swing.JLabel();
        lblTypeLicence = new javax.swing.JLabel();
        lblYear = new javax.swing.JLabel();
        lblIconLicence = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sobre");
        setIconImage(new ImageIcon(getClass().getResource("/br/com/systemx/icons/logo.png")).getImage());
        setResizable(false);

        lblDescription.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 20)); // NOI18N
        lblDescription.setText("Sistema para controle de ordem de serviço");

        lblDeveloper.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 20)); // NOI18N
        lblDeveloper.setText("Desenvolvido por Tiago A.Soares");

        lblTypeLicence.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 20)); // NOI18N
        lblTypeLicence.setText("Sob a Licença GPL");

        lblYear.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        lblYear.setText("© 2023");

        lblIconLicence.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIconLicence.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/systemx/icons/Gnu-Licence.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 20)); // NOI18N
        jLabel1.setText("System X");

        javax.swing.GroupLayout aboutPanelLayout = new javax.swing.GroupLayout(aboutPanel);
        aboutPanel.setLayout(aboutPanelLayout);
        aboutPanelLayout.setHorizontalGroup(
            aboutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aboutPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblIconLicence)
                .addGap(18, 18, 18)
                .addGroup(aboutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDescription)
                    .addComponent(lblDeveloper)
                    .addComponent(lblTypeLicence)
                    .addComponent(lblYear)
                    .addComponent(jLabel1))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        aboutPanelLayout.setVerticalGroup(
            aboutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aboutPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(lblDescription)
                .addGap(18, 18, 18)
                .addComponent(lblDeveloper)
                .addGap(28, 28, 28)
                .addComponent(lblTypeLicence)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblYear, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(aboutPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblIconLicence, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(aboutPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(aboutPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SystemXAbout().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel aboutPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblDeveloper;
    private javax.swing.JLabel lblIconLicence;
    private javax.swing.JLabel lblTypeLicence;
    private javax.swing.JLabel lblYear;
    private javax.swing.JPanel mainPanel;
    // End of variables declaration//GEN-END:variables
}
package br.com.systemx.screens;

public class SystemXOs extends javax.swing.JInternalFrame {

    public SystemXOs() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        OsPanel = new javax.swing.JPanel();
        lblOs = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        osNumber = new javax.swing.JTextField();
        osDate = new javax.swing.JTextField();
        budget = new javax.swing.JRadioButton();
        orderOfService = new javax.swing.JRadioButton();
        lblSituation = new javax.swing.JLabel();
        comboSituation = new javax.swing.JComboBox<>();
        clientPanel = new javax.swing.JPanel();
        client = new javax.swing.JTextField();
        clienteId = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        tableClients = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblEquipment = new javax.swing.JLabel();
        equipament = new javax.swing.JTextField();
        lblDefect = new javax.swing.JLabel();
        defect = new javax.swing.JTextField();
        lblService = new javax.swing.JLabel();
        service = new javax.swing.JTextField();
        lblTechnician = new javax.swing.JLabel();
        technican = new javax.swing.JTextField();
        lblTotalValue = new javax.swing.JLabel();
        totalValue = new javax.swing.JTextField();
        btnCreate = new javax.swing.JButton();
        btnRead = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnPrinter = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Os - Ordem de Serviço");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/systemx/icons/os-logo.png"))); // NOI18N
        setPreferredSize(new java.awt.Dimension(682, 582));

        OsPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblOs.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        lblOs.setText("N° OS");

        lblDate.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        lblDate.setText("Data");

        osNumber.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N

        osDate.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N

        buttonGroup1.add(budget);
        budget.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        budget.setText("Orçamento");

        buttonGroup1.add(orderOfService);
        orderOfService.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        orderOfService.setText("Ordem de Serviço");

        javax.swing.GroupLayout OsPanelLayout = new javax.swing.GroupLayout(OsPanel);
        OsPanel.setLayout(OsPanelLayout);
        OsPanelLayout.setHorizontalGroup(
            OsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(OsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblOs)
                    .addComponent(osNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(budget))
                .addGap(30, 30, 30)
                .addGroup(OsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(orderOfService)
                    .addComponent(lblDate)
                    .addComponent(osDate, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        OsPanelLayout.setVerticalGroup(
            OsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OsPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(OsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOs)
                    .addComponent(lblDate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(OsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(osNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(osDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(OsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(budget)
                    .addComponent(orderOfService))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        lblSituation.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        lblSituation.setText("Situação");

        comboSituation.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        comboSituation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Entrega Ok", "Orçamento REPROVADO", "Aguardando Aprovação", "Aguardando Peças", "Abandonado pelo cliente", "Na bancada", "Retornou" }));

        clientPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT Condensed", 0, 18))); // NOI18N

        client.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N

        clienteId.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/systemx/icons/search-os.png"))); // NOI18N

        lblId.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        lblId.setText("*Id");

        id.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N

        jTable1.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id", "Nome", "Fone"
            }
        ));
        tableClients.setViewportView(jTable1);

        javax.swing.GroupLayout clientPanelLayout = new javax.swing.GroupLayout(clientPanel);
        clientPanel.setLayout(clientPanelLayout);
        clientPanelLayout.setHorizontalGroup(
            clientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clientPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(clientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tableClients, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(clientPanelLayout.createSequentialGroup()
                        .addComponent(client, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clienteId, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblId)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        clientPanelLayout.setVerticalGroup(
            clientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clientPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(clientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(clienteId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(client)
                    .addGroup(clientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(id)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tableClients, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        lblEquipment.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        lblEquipment.setText("*Equipamento");

        equipament.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N

        lblDefect.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        lblDefect.setText("*Defeito");

        defect.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N

        lblService.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        lblService.setText("Serviço");

        service.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N

        lblTechnician.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        lblTechnician.setText("Técnico");

        technican.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N

        lblTotalValue.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        lblTotalValue.setText("Valor Total");

        totalValue.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N

        btnCreate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/systemx/icons/create.png"))); // NOI18N
        btnCreate.setToolTipText("Cadastrar");
        btnCreate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnRead.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/systemx/icons/read.png"))); // NOI18N
        btnRead.setToolTipText("Pesquisar");
        btnRead.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/systemx/icons/update.png"))); // NOI18N
        btnUpdate.setToolTipText("Atualizar");
        btnUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/systemx/icons/delete.png"))); // NOI18N
        btnDelete.setToolTipText("Apagar");
        btnDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnPrinter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/systemx/icons/printer.png"))); // NOI18N
        btnPrinter.setToolTipText("Imprimir Os");
        btnPrinter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblEquipment)
                                    .addComponent(lblDefect)
                                    .addComponent(lblService)
                                    .addComponent(lblTechnician))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(technican, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblTotalValue)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(totalValue, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE))
                                    .addComponent(defect)
                                    .addComponent(equipament)
                                    .addComponent(service)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(OsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblSituation)
                                        .addGap(18, 18, 18)
                                        .addComponent(comboSituation, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(clientPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRead, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPrinter, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(OsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboSituation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSituation)))
                    .addComponent(clientPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(equipament, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEquipment))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDefect)
                    .addComponent(defect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblService)
                    .addComponent(service, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTechnician)
                    .addComponent(technican, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTotalValue, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPrinter)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnRead)
                        .addComponent(btnCreate)
                        .addComponent(btnUpdate)
                        .addComponent(btnDelete)))
                .addGap(21, 21, 21))
        );

        setBounds(0, 0, 682, 582);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel OsPanel;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnPrinter;
    private javax.swing.JButton btnRead;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JRadioButton budget;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField client;
    private javax.swing.JPanel clientPanel;
    private javax.swing.JLabel clienteId;
    private javax.swing.JComboBox<String> comboSituation;
    private javax.swing.JTextField defect;
    private javax.swing.JTextField equipament;
    private javax.swing.JTextField id;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblDefect;
    private javax.swing.JLabel lblEquipment;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblOs;
    private javax.swing.JLabel lblService;
    private javax.swing.JLabel lblSituation;
    private javax.swing.JLabel lblTechnician;
    private javax.swing.JLabel lblTotalValue;
    private javax.swing.JRadioButton orderOfService;
    private javax.swing.JTextField osDate;
    private javax.swing.JTextField osNumber;
    private javax.swing.JTextField service;
    private javax.swing.JScrollPane tableClients;
    private javax.swing.JTextField technican;
    private javax.swing.JTextField totalValue;
    // End of variables declaration//GEN-END:variables
}
package br.com.systemx.screens;

import java.sql.*;
import br.com.systemx.dal.ModuleConnection;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class SystemXClient extends javax.swing.JInternalFrame {
    
    Connection connect = null;
    PreparedStatement pst = null;
    ResultSet resultSet = null;
    
    public SystemXClient() {
        initComponents();
        connectDataBase();
    }
    
    private void connectDataBase(){
        connect = ModuleConnection.conector();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblName = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblTelephone = new javax.swing.JLabel();
        lblMail = new javax.swing.JLabel();
        nameUser = new javax.swing.JTextField();
        addressUser = new javax.swing.JTextField();
        phoneUser = new javax.swing.JTextField();
        emailUser = new javax.swing.JTextField();
        btnCreate = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        searchUser = new javax.swing.JTextField();
        btnSearch = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableUsers = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Clientes");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/systemx/icons/clients.png"))); // NOI18N
        setPreferredSize(new java.awt.Dimension(682, 582));

        lblName.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 22)); // NOI18N
        lblName.setText("Nome*");

        lblAddress.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 22)); // NOI18N
        lblAddress.setText("Endereço");

        lblTelephone.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 22)); // NOI18N
        lblTelephone.setText("Telefone*");

        lblMail.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 22)); // NOI18N
        lblMail.setText("Email");

        nameUser.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 22)); // NOI18N

        addressUser.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 22)); // NOI18N

        phoneUser.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 22)); // NOI18N

        emailUser.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 22)); // NOI18N

        btnCreate.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        btnCreate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/systemx/icons/create.png"))); // NOI18N
        btnCreate.setText(" Cadastrar");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/systemx/icons/update.png"))); // NOI18N
        btnUpdate.setText(" Atualizar");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/systemx/icons/delete.png"))); // NOI18N
        btnDelete.setText(" Apagar");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        searchUser.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 22)); // NOI18N
        searchUser.setToolTipText("Pesquisar");
        searchUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchUserKeyReleased(evt);
            }
        });

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/systemx/icons/search.png"))); // NOI18N
        btnSearch.setToolTipText("");

        tableUsers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Endereço", "Telefone", "Email"
            }
        ));
        tableUsers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableUsersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableUsers);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTelephone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                            .addComponent(lblMail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblAddress, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(addressUser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
                            .addComponent(nameUser, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(phoneUser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                .addComponent(emailUser, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(searchUser, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnSearch))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnCreate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete)
                        .addGap(55, 55, 55)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(nameUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddress)
                    .addComponent(addressUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelephone)
                    .addComponent(phoneUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMail)
                    .addComponent(emailUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreate)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete))
                .addGap(36, 36, 36))
        );

        setBounds(0, 0, 682, 582);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        create();
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        update();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        delete();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void searchUserKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchUserKeyReleased
        searchClient();
    }//GEN-LAST:event_searchUserKeyReleased

    private void tableUsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableUsersMouseClicked
        setFieldsClient();
    }//GEN-LAST:event_tableUsersMouseClicked
    
    private void clearFields(){
        nameUser.setText(null);
        addressUser.setText(null);
        phoneUser.setText(null);
        emailUser.setText(null);
    }
        
    private void setFieldsClient(){
        int setFields = tableUsers.getSelectedRow();
        
        String name = tableUsers.getModel().getValueAt(setFields, 1).toString();
        String address = tableUsers.getModel().getValueAt(setFields, 2).toString();
        String phone = tableUsers.getModel().getValueAt(setFields, 3).toString();
        String email = tableUsers.getModel().getValueAt(setFields, 4).toString();
        
        nameUser.setText(name);
        addressUser.setText(address);
        phoneUser.setText(phone);
        emailUser.setText(email);
    }
    
    private void searchClient(){
        String sql = "select * from dbsystemx.tbclientes where nomecli like ?";        
        String client = searchUser.getText();
        
        try {
            pst = connect.prepareStatement(sql);
            pst.setString(1, client + "%");
            resultSet = pst.executeQuery();
            
            tableUsers.setModel(DbUtils.resultSetToTableModel(resultSet));
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null,
                    "Erro Ao Pesquisar\n\n"
                    + "Ocorreu um erro inesperado ao\n"
                    + "tentar Pesquisar, Reinicie o sistema\n"
                    + "e tente novamente!",
                    "Erro Ao Pesquisar", JOptionPane.ERROR_MESSAGE
            ); 
        }
    }
        
    private void create(){
        String sql = "insert into tbclientes (nomecli, endcli, fonecli, emailcli) values (?, ?, ?, ?)";
        String name = nameUser.getText();
        String address = addressUser.getText();
        String phone = phoneUser.getText();
        String email = emailUser.getText();

        if(nameUser.getText().isEmpty() || phoneUser.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,
                    "Campos Vazio\n\n"
                    + "Preencha todos os campos obrigatórios (*)\n"
                    ,"Campos Vazio", JOptionPane.ERROR_MESSAGE
            );
            return;
        }
        
        try{
            pst = connect.prepareStatement(sql);
            pst.setString(1, name);
            pst.setString(2, address);
            pst.setString(3, phone);
            pst.setString(4, email);
            
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null,
                "Cliente Cadastrado \n\n"
              + "O cliente foi cadastrado com sucesso! \n"
              ,"Cliente Cadastrado", JOptionPane.INFORMATION_MESSAGE
            );
                
            clearFields();            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,
                    "Erro ao Cadastrar\n\n"
                    + "Ocorreu um erro inesperado ao\n"
                    + "tentar cadastrar, Reinicie o sistema\n"
                    + "e tente novamente!",
                    "Erro ao Cadastrar", JOptionPane.ERROR_MESSAGE
            );     
        }
    }
    
    private void update(){
        int setFields = tableUsers.getSelectedRow();
        String sql = "update tbclientes set nomecli = ?, endcli = ?, fonecli = ?, emailcli = ? where idcli = ?";    
        
        String idCli = tableUsers.getModel().getValueAt(setFields, 0).toString();
        String name = nameUser.getText();
        String address = addressUser.getText();
        String phone = phoneUser.getText();
        String email = emailUser.getText();
        
        if(nameUser.getText().isEmpty() || phoneUser.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,
                    "Campos Vazio\n\n"
                    + "Preencha todos os campos obrigatórios (*)\n"
                    ,"Campos Vazio", JOptionPane.ERROR_MESSAGE
            );
            return;
        }
        
        try {        
            pst = connect.prepareStatement(sql);
            pst.setString(1, name);
            pst.setString(2, address);
            pst.setString(3, phone);
            pst.setString(4, email);
            pst.setString(5, idCli);
            
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null,
                "Dados Atualizados \n\n"
              + "Dados atualizados com sucesso! \n"
              ,"Dados Atualizados", JOptionPane.INFORMATION_MESSAGE
            );
            
            searchClient();
            clearFields();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,
                    "Erro ao Atualizar\n\n"
                    + "Ocorreu um erro inesperado ao\n"
                    + "tentar Atualizar, Reinicie o sistema\n"
                    + "e tente novamente!",
                    "Erro ao Atualizar", JOptionPane.ERROR_MESSAGE
            );      
            connectDataBase();
        }
    }
    
    private void delete(){
        int setFields = tableUsers.getSelectedRow();
        String idCli = tableUsers.getModel().getValueAt(setFields, 0).toString();
        
        String sql = "delete from tbclientes where idcli = ?";
        
        int response = JOptionPane.showConfirmDialog(null, 
                "Tem certeza que deseja apagar\n "
              + "este cliente?"
              , "Tem Certeza", JOptionPane.YES_NO_OPTION
        );
        
        if(response != JOptionPane.YES_OPTION){
            return;
        }
        
        try {        
            pst = connect.prepareStatement(sql);
            pst.setString(1, idCli);            
            pst.execute();
            
            JOptionPane.showMessageDialog(null,
                "Usúario Apagado \n\n"
              + "usúario apagado com sucesso! \n"
              ,"Usúario Apagado", JOptionPane.INFORMATION_MESSAGE
            );
            
            searchClient();
            clearFields();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,
                    "Erro ao Apagar\n\n"
                    + "Ocorreu um erro inesperado ao\n"
                    + "tentar Apagar, Reinicie o sistema\n"
                    + "e tente novamente!",
                    "Erro ao Apagar", JOptionPane.ERROR_MESSAGE
            );     
            connectDataBase();
        }
    }
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressUser;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JLabel btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JTextField emailUser;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblMail;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblTelephone;
    private javax.swing.JTextField nameUser;
    private javax.swing.JTextField phoneUser;
    private javax.swing.JTextField searchUser;
    private javax.swing.JTable tableUsers;
    // End of variables declaration//GEN-END:variables
}
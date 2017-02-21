/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jfldb;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Paul Holden
 */
public class Players extends javax.swing.JFrame {

    /**
     * Creates new form Players1
     */
        public Connection con;
    public Statement stmt;
    public ResultSet rs;
    
    public Players() {
        initComponents();
        DoConnect();
    }
    
    public void DoConnect(){
     try {
         
         DBConnect dbc = new DBConnect();
         
            rs = dbc.connect("SELECT * FROM PEOPLERECORDS");

                rs.next();
                
                String name = rs.getString("NAME");
                String team = rs.getString("TEAM");
                String role = rs.getString("ROLE");
                
                Boolean captin = rs.getBoolean("CAPTIN");
                if(captin == true){
                    CaptinCheckBox.setSelected(true);
                }
                else{
                    CaptinCheckBox.setSelected(false);
                }
            
                textName.setText(name);
                textRole.setText(role);
                textTeam.setText(team);

            
            
        }   
        catch(SQLException err){
           JOptionPane.showMessageDialog(this, err.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        textName = new javax.swing.JTextField();
        textTeam = new javax.swing.JTextField();
        textRole = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        CaptinCheckBox = new javax.swing.JCheckBox();
        PlayerID = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        BtnNext = new javax.swing.JButton();
        BtnPrevious = new javax.swing.JButton();
        BtnFirst = new javax.swing.JButton();
        BtnLast = new javax.swing.JButton();
        BtnNewRecord = new javax.swing.JButton();
        BtnSaveRecord = new javax.swing.JButton();
        BtnDeleteRecord = new javax.swing.JButton();
        BtnCancelNewRecord = new javax.swing.JButton();
        BtnUpdateRecord = new javax.swing.JButton();
        BtnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textTeam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textTeamActionPerformed(evt);
            }
        });

        textRole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textRoleActionPerformed(evt);
            }
        });

        jLabel1.setText("Name");

        jLabel2.setText("Role");

        jLabel3.setText("Team");

        jLabel4.setText("Captin");

        CaptinCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CaptinCheckBoxActionPerformed(evt);
            }
        });

        PlayerID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlayerIDActionPerformed(evt);
            }
        });

        jLabel5.setText("ID");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PlayerID, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textName, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                    .addComponent(textRole))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CaptinCheckBox)
                        .addGap(54, 54, 54))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(textTeam, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textTeam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(PlayerID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(textRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2)
                                .addComponent(jLabel4))
                            .addComponent(CaptinCheckBox, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(11, 11, 11))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        BtnNext.setText("Next");
        BtnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNextActionPerformed(evt);
            }
        });

        BtnPrevious.setText("Prev");
        BtnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPreviousActionPerformed(evt);
            }
        });

        BtnFirst.setText("First");
        BtnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnFirstActionPerformed(evt);
            }
        });

        BtnLast.setText("Last");
        BtnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLastActionPerformed(evt);
            }
        });

        BtnNewRecord.setText("New Record");
        BtnNewRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNewRecordActionPerformed(evt);
            }
        });

        BtnSaveRecord.setText("Save Record");
        BtnSaveRecord.setEnabled(false);
        BtnSaveRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSaveRecordActionPerformed(evt);
            }
        });

        BtnDeleteRecord.setText("Delete Record");
        BtnDeleteRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDeleteRecordActionPerformed(evt);
            }
        });

        BtnCancelNewRecord.setText("Cancel New Record");
        BtnCancelNewRecord.setEnabled(false);
        BtnCancelNewRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelNewRecordActionPerformed(evt);
            }
        });

        BtnUpdateRecord.setText("Update Record");
        BtnUpdateRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnUpdateRecordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BtnFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnPrevious, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtnLast, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnNext, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE))
                .addGap(35, 35, 35))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(BtnNewRecord, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnDeleteRecord))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BtnSaveRecord, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnCancelNewRecord)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(BtnUpdateRecord)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnPrevious, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnLast)
                    .addComponent(BtnFirst))
                .addGap(18, 18, 18)
                .addComponent(BtnUpdateRecord)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnSaveRecord)
                    .addComponent(BtnNewRecord))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnDeleteRecord)
                    .addComponent(BtnCancelNewRecord))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        BtnBack.setText("Back");
        BtnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(165, 165, 165)
                                .addComponent(BtnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 47, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(BtnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textTeamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textTeamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textTeamActionPerformed

    private void textRoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textRoleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textRoleActionPerformed

    private void BtnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPreviousActionPerformed
        // TODO add your handling code here:
        try {
         
                rs.previous();
                
                String name = rs.getString("NAME");
                String team = rs.getString("TEAM");
                String role = rs.getString("ROLE");
                Boolean captin = rs.getBoolean("CAPTIN");
                if(captin == true){
                    CaptinCheckBox.setSelected(true);
                }
                else{
                    CaptinCheckBox.setSelected(false);
                }
                
            
                 textName.setText(name);
                textRole.setText(role);
                textTeam.setText(team);

            
            
        }   
        catch(SQLException err){
           JOptionPane.showMessageDialog(this, err.getMessage());
        }
    }//GEN-LAST:event_BtnPreviousActionPerformed

    private void BtnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBackActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new MainMenu().setVisible(true);
        try{
        rs.close();
        }catch(SQLException err){
           JOptionPane.showMessageDialog(this, err.getMessage());
        }
    }//GEN-LAST:event_BtnBackActionPerformed

    private void BtnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNextActionPerformed
        // TODO add your handling code here:
        try {
         
                rs.next();
                
                String name = rs.getString("NAME");
                String team = rs.getString("TEAM");
                String role = rs.getString("ROLE");
                Boolean captin = rs.getBoolean("CAPTIN");
                if(captin == true){
                    CaptinCheckBox.setSelected(true);
                }
                else{
                    CaptinCheckBox.setSelected(false);
                }
            
                textName.setText(name);
                textRole.setText(role);
                textTeam.setText(team);

            
            
        }   
        catch(SQLException err){
           JOptionPane.showMessageDialog(this, err.getMessage());
        }
    }//GEN-LAST:event_BtnNextActionPerformed

    private void CaptinCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CaptinCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CaptinCheckBoxActionPerformed

    private void BtnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnFirstActionPerformed
        // TODO add your handling code here:
        try {
         
                rs.first();
                
                String name = rs.getString("NAME");
                String team = rs.getString("TEAM");
                String role = rs.getString("ROLE");
                Boolean captin = rs.getBoolean("CAPTIN");
                if(captin == true){
                    CaptinCheckBox.setSelected(true);
                }
                else{
                    CaptinCheckBox.setSelected(false);
                }
            
                textName.setText(name);
                textRole.setText(role);
                textTeam.setText(team);

            
            
        }   
        catch(SQLException err){
           JOptionPane.showMessageDialog(this, err.getMessage());
        }
    }//GEN-LAST:event_BtnFirstActionPerformed

    private void BtnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLastActionPerformed
        // TODO add your handling code here:
        try {
         
                rs.last();
                
                String name = rs.getString("NAME");
                String team = rs.getString("TEAM");
                String role = rs.getString("ROLE");
                Boolean captin = rs.getBoolean("CAPTIN");
                if(captin == true){
                    CaptinCheckBox.setSelected(true);
                }
                else{
                    CaptinCheckBox.setSelected(false);
                }
            
                textName.setText(name);
                textRole.setText(role);
                textTeam.setText(team);

            
            
        }   
        catch(SQLException err){
           JOptionPane.showMessageDialog(this, err.getMessage());
        }
    }//GEN-LAST:event_BtnLastActionPerformed

    private void BtnNewRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNewRecordActionPerformed
        // TODO add your handling code here:
        BtnFirst.setEnabled( false );
        BtnPrevious.setEnabled( false ) ;
        BtnNext.setEnabled( false );
        BtnLast.setEnabled( false );
        BtnUpdateRecord.setEnabled( false );
        BtnDeleteRecord.setEnabled( false );
        BtnNewRecord.setEnabled( false );

        BtnSaveRecord.setEnabled( true );
        BtnCancelNewRecord.setEnabled( true );

    }//GEN-LAST:event_BtnNewRecordActionPerformed

    private void BtnSaveRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSaveRecordActionPerformed
        // TODO add your handling code here:
        try{
            rs.moveToInsertRow();
            rs.updateString("ID", PlayerID.getText());
            rs.updateString("NAME", textName.getText());
            rs.updateString("TEAM", textTeam.getText());
            rs.updateString("ROLE", textRole.getText());


            rs.insertRow();

            rs.close();

            DBConnect db = new DBConnect();
            rs = db.connect("SELECT * FROM PEOPLERECORDS");
            rs.next();
            PlayerID.setText(rs.getString("ID"));
            textName.setText(rs.getString("NAME"));
            textTeam.setText(rs.getString("TEAM"));
            textRole.setText(rs.getString("ROLE"));

        }catch(SQLException err){
            JOptionPane.showMessageDialog(Players.this, err.getMessage());
        }
    }//GEN-LAST:event_BtnSaveRecordActionPerformed

    private void BtnDeleteRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDeleteRecordActionPerformed
        // TODO add your handling code here:
        try{
            rs.deleteRow();
            rs.next();

        }catch(SQLException err){

        }
    }//GEN-LAST:event_BtnDeleteRecordActionPerformed

    private void BtnCancelNewRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelNewRecordActionPerformed
        // TODO add your handling code here:
        BtnFirst.setEnabled( true );
        BtnPrevious.setEnabled( true ) ;
        BtnNext.setEnabled( true );
        BtnLast.setEnabled( true );
        BtnUpdateRecord.setEnabled( true );
        BtnDeleteRecord.setEnabled( true );
        BtnNewRecord.setEnabled( true );

        BtnSaveRecord.setEnabled( false );
        BtnCancelNewRecord.setEnabled( false );
    }//GEN-LAST:event_BtnCancelNewRecordActionPerformed

    private void BtnUpdateRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnUpdateRecordActionPerformed
        // TODO add your handling code here:
        String Name = textName.getText();
        String Team = textTeam.getText();
        String Role = textRole.getText();

        try{
            rs.updateString("NAME", Name);
            rs.updateString("TEAM", Team);
            rs.updateString("ROLE", Role);

            rs.updateRow();
            JOptionPane.showMessageDialog(Players.this, "Updated");

        }catch(Exception e){}
    }//GEN-LAST:event_BtnUpdateRecordActionPerformed

    private void PlayerIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlayerIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PlayerIDActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Players.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Players.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Players.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Players.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Players().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBack;
    private javax.swing.JButton BtnCancelNewRecord;
    private javax.swing.JButton BtnDeleteRecord;
    private javax.swing.JButton BtnFirst;
    private javax.swing.JButton BtnLast;
    private javax.swing.JButton BtnNewRecord;
    private javax.swing.JButton BtnNext;
    private javax.swing.JButton BtnPrevious;
    private javax.swing.JButton BtnSaveRecord;
    private javax.swing.JButton BtnUpdateRecord;
    private javax.swing.JCheckBox CaptinCheckBox;
    private javax.swing.JTextField PlayerID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField textName;
    private javax.swing.JTextField textRole;
    private javax.swing.JTextField textTeam;
    // End of variables declaration//GEN-END:variables
}
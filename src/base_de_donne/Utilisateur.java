
package base_de_donne;

import Application.BDD;
import Application.parameter;
import application.ResultSetTableModel;
import java.sql.*;
import javax.swing.JOptionPane;


public class Utilisateur extends javax.swing.JFrame {
ResultSet rs;
    BDD db;
    public Utilisateur() {
    db = new BDD(new parameter().HOST_DB, new parameter().USERNAME_DB,
            new parameter().PASSWORD_DB, new parameter().IPHOST, new parameter().PORT);

        initComponents();
        table();
        
    }
    public void table() {
        String a[] = {"id", "id_user", "username", "password", "type"};
        rs = db.querySelect(a, "utilisateur");
        table_user.setModel(new ResultSetTableModel(rs));
    }
     void actualiser() {
        txt_id.setText("");
        txt_us.setText("");
        txt_pa.setText("");
        comb_ty.setSelectedItem("tyyype");
     
     }
     
     
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table_user = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        txt_rech = new javax.swing.JTextField();
        txt_pa = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        txt_us = new javax.swing.JTextField();
        comb_rech = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        comb_ty = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        table_user.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "id", "id_user", "username", "password", "type"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_user.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                table_userAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        table_user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_userMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_user);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 100, 600, 90);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Utilisateur");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(229, 13, 169, 44);

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton1.setText("Recherche");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(350, 360, 110, 30);

        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton2.setText("Ajouter");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(110, 220, 110, 30);

        jButton3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton3.setText("Modifier");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(220, 220, 110, 30);

        jButton4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton4.setText("Supprimer");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(330, 220, 110, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("type");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 410, 70, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Recherche par catégorie :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(310, 310, 160, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("username");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 330, 70, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("password");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 370, 70, 30);

        txt_id.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txt_id);
        txt_id.setBounds(170, 290, 90, 30);

        txt_rech.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_rech.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_rechActionPerformed(evt);
            }
        });
        getContentPane().add(txt_rech);
        txt_rech.setBounds(490, 360, 140, 30);

        txt_pa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txt_pa);
        txt_pa.setBounds(170, 370, 90, 30);

        jButton5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton5.setText("Actualiser");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(440, 220, 110, 30);

        txt_us.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txt_us);
        txt_us.setBounds(170, 330, 90, 30);

        comb_rech.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "id_user", "username", "id_username", "type" }));
        comb_rech.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comb_rechActionPerformed(evt);
            }
        });
        getContentPane().add(comb_rech);
        comb_rech.setBounds(490, 310, 140, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("id_user");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(40, 293, 70, 30);

        comb_ty.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cachier", "directeur" }));
        comb_ty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comb_tyActionPerformed(evt);
            }
        });
        getContentPane().add(comb_ty);
        comb_ty.setBounds(170, 410, 90, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      if (txt_rech.getText().equals("")) // si le textfield de recherche est vide le programe il va affiche un message pour entrer.... 
      {
            JOptionPane.showMessageDialog(this, "SVP entrer quelque chose");
        } else {
            if (comb_rech.getSelectedItem().equals("id_user")) {
                rs = db.querySelectAll("utilisateur", "id_user LIKE '%" + txt_rech.getText() + "%' ");
                table_user.setModel(new ResultSetTableModel(rs));
            } else if (comb_rech.getSelectedItem().equals("username")) {
                rs = db.querySelectAll("utilisateur", "username LIKE '%" + txt_rech.getText() + "%' ");
                table_user.setModel(new ResultSetTableModel(rs));
            } else if (comb_rech.getSelectedItem().equals("password")) {
                rs = db.querySelectAll("utilisateur", "password LIKE '%" + txt_rech.getText() + "%' ");
                table_user.setModel(new ResultSetTableModel(rs));
            } else if (comb_rech.getSelectedItem().equals("type")) {
                rs = db.querySelectAll("utilisateur", "type LIKE '%" + txt_rech.getText() + "%' ");
                table_user.setModel(new ResultSetTableModel(rs));
            }
        }     }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       actualiser();
       table();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void comb_rechActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comb_rechActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comb_rechActionPerformed

    private void comb_tyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comb_tyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comb_tyActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (txt_id.getText().equals("") || txt_us.getText().equals("") || txt_pa.getText().equals("")
                || comb_ty.getSelectedItem().equals("tyyype")) {
                 JOptionPane.showMessageDialog(this, "SVP entrer les informations complete");
        } else {
            String[] colon = {"id_user", "username", "password", "type"};
            String[] inf = {txt_id.getText(), txt_us.getText(), txt_pa.getText(), comb_ty.getSelectedItem().toString()};
            System.out.println(db.queryInsert("utilisateur", colon, inf));
            table();
            actualiser();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    
    if (txt_id.getText().equals("") || txt_us.getText().equals("") || txt_pa.getText().equals("")
                || comb_ty.getSelectedItem().equals("Type")) {
            JOptionPane.showMessageDialog(this, "SVP entrer les informations complete");
        } else {
                String[] colon = {"id_user", "username", "password", "type"};
            String[] inf = {txt_id.getText(), txt_us.getText(), txt_pa.getText(), comb_ty.getSelectedItem().toString()};
            String id = String.valueOf(table_user.getValueAt(table_user.getSelectedRow(), 0));
            System.out.println(db.queryUpdate("utilisateur", colon, inf, "id='" + id + "'"));
            table();
            actualiser();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String id = String.valueOf(table_user.getValueAt(table_user.getSelectedRow(), 0));
    if (JOptionPane.showConfirmDialog(this, "est ce que tu es sure que tu veux suuprimer", "attention!!!", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            db.queryDelete("utilisateur", "id=" + id);
        } else {
            return;
        }
        table();

    }//GEN-LAST:event_jButton4ActionPerformed

    private void txt_rechActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_rechActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_rechActionPerformed

    private void table_userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_userMouseClicked
        txt_id.setText(String.valueOf(table_user.getValueAt(table_user.getSelectedRow(), 1)));
        txt_us.setText(String.valueOf(table_user.getValueAt(table_user.getSelectedRow(), 2)));
        txt_pa.setText(String.valueOf(table_user.getValueAt(table_user.getSelectedRow(), 3)));
        comb_ty.setSelectedItem(String.valueOf(table_user.getValueAt(table_user.getSelectedRow(), 4)));
    }//GEN-LAST:event_table_userMouseClicked

    private void table_userAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_table_userAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_table_userAncestorAdded

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
            java.util.logging.Logger.getLogger(Utilisateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Utilisateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Utilisateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Utilisateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Utilisateur().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comb_rech;
    private javax.swing.JComboBox<String> comb_ty;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable table_user;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_pa;
    private javax.swing.JTextField txt_rech;
    private javax.swing.JTextField txt_us;
    // End of variables declaration//GEN-END:variables
}

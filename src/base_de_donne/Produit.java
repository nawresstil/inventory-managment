
package base_de_donne;
import Application.BDD;
import Application.parameter;
import application.ResultSetTableModel;
import java.sql.*;
import javax.swing.JOptionPane;
public class Produit extends javax.swing.JFrame {

    ResultSet rs ;
    BDD db ;

    public Produit(){
        
     db = new BDD(new parameter().HOST_DB, new parameter().USERNAME_DB,
            new parameter().PASSWORD_DB, new parameter().IPHOST, new parameter().PORT);

        initComponents();
        table();
    }
public void table() {
        String a[] = {"id", "code_produit", "reference", "desegnation", "rangemant", "fournisseur", "remise","prix","stock"};
        rs = db.querySelect(a, "produit");
        table_prod.setModel(new ResultSetTableModel(rs));
    }
     void actualiser() {
        txt_co.setText("");
        txt_re.setText("");
        txt_de.setText("");
        txt_ra.setText("");
        txt_fo.setText("");
        txt_st.setText("");
        txt_rem.setText("");
        txt_pr.setText("");
      
      
     }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_prod = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_pr = new javax.swing.JTextField();
        txt_rech = new javax.swing.JTextField();
        txt_de = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        txt_re = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_co = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_fo = new javax.swing.JTextField();
        txt_rem = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_ra = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_st = new javax.swing.JTextField();
        comb_rech = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel1.setText("    Gestion de produit");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(240, 60, 355, 44);

        table_prod.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "code_produit", "reference", "deseignation", "rangement", "fournisseur", "remise", "prix", "stock"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_prod.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                table_prodAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        table_prod.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_prodMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_prod);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(60, 130, 740, 90);

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton1.setText("Recherche");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(550, 420, 100, 30);

        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton2.setText("Ajouter");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(190, 250, 110, 30);

        jButton3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton3.setText("Modifier");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(300, 250, 110, 30);

        jButton4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton4.setText("Supprimer");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(410, 250, 110, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("prix :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(330, 410, 60, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Recherche par catégorie :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(580, 340, 160, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("reference :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(100, 370, 80, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("deseignation :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(100, 410, 100, 30);

        txt_pr.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_pr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_prActionPerformed(evt);
            }
        });
        getContentPane().add(txt_pr);
        txt_pr.setBounds(410, 410, 90, 30);

        txt_rech.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_rech.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_rechActionPerformed(evt);
            }
        });
        getContentPane().add(txt_rech);
        txt_rech.setBounds(660, 420, 120, 30);

        txt_de.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txt_de);
        txt_de.setBounds(200, 410, 90, 30);

        jButton5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton5.setText("Actualiser");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(520, 250, 110, 30);

        txt_re.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txt_re);
        txt_re.setBounds(200, 370, 90, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("code produit :");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(100, 330, 90, 30);

        txt_co.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txt_co);
        txt_co.setBounds(200, 330, 90, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("fournisseur :");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(320, 330, 90, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("remise %:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(330, 370, 70, 30);

        txt_fo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txt_fo);
        txt_fo.setBounds(410, 330, 90, 30);

        txt_rem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txt_rem);
        txt_rem.setBounds(410, 370, 90, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("rangement :");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(100, 450, 80, 30);

        txt_ra.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_ra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_raActionPerformed(evt);
            }
        });
        getContentPane().add(txt_ra);
        txt_ra.setBounds(200, 450, 90, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("stock :");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(330, 450, 60, 30);

        txt_st.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_st.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_stActionPerformed(evt);
            }
        });
        getContentPane().add(txt_st);
        txt_st.setBounds(410, 450, 90, 30);

        comb_rech.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "id", "code_produit", "reference", "designation", "rangemant", "fournisseur", "remise", "prix", "stock" }));
        comb_rech.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comb_rechActionPerformed(evt);
            }
        });
        getContentPane().add(comb_rech);
        comb_rech.setBounds(590, 370, 90, 21);

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\GIS\\Desktop\\hand.png.jpg")); // NOI18N
        jLabel11.setText("jLabel11");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(0, 0, 870, 560);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (txt_rech.getText().equals("")) // si le textfield de recherche est vide le programe il va affiche un message pour entrer....
        {
            JOptionPane.showMessageDialog(this, "SVP entrer quelque chose");
        } else {
            if (comb_rech.getSelectedItem().equals("id")) {
                rs = db.querySelectAll("produit", "id LIKE '%" + txt_rech.getText() + "%' ");
                table_prod.setModel(new ResultSetTableModel(rs));
            } else if (comb_rech.getSelectedItem().equals("code_produit")) {
                rs = db.querySelectAll("produit", "code_produit LIKE '%" + txt_rech.getText() + "%' ");
                table_prod.setModel(new ResultSetTableModel(rs));
            } else if (comb_rech.getSelectedItem().equals("reference")) {
                rs = db.querySelectAll("produit", "reference LIKE '%" + txt_rech.getText() + "%' ");
                table_prod.setModel(new ResultSetTableModel(rs));
            } else if (comb_rech.getSelectedItem().equals("desegnation")) {
                rs = db.querySelectAll("produit", "desegnation LIKE '%" + txt_rech.getText() + "%' ");
                table_prod.setModel(new ResultSetTableModel(rs));
            }else if (comb_rech.getSelectedItem().equals("rangemant")) {
                rs = db.querySelectAll("produit", "rangemant LIKE '%" + txt_rech.getText() + "%' ");
                table_prod.setModel(new ResultSetTableModel(rs));
            }else if (comb_rech.getSelectedItem().equals("fournisseur")) {
                rs = db.querySelectAll("produit", "fournisseur LIKE '%" + txt_rech.getText() + "%' ");
                table_prod.setModel(new ResultSetTableModel(rs));
            }else if (comb_rech.getSelectedItem().equals("remise")) {
                rs = db.querySelectAll("produit", "remise LIKE '%" + txt_rech.getText() + "%' ");
                table_prod.setModel(new ResultSetTableModel(rs));
            }else if (comb_rech.getSelectedItem().equals("prix")) {
                rs = db.querySelectAll("produit", "prix LIKE '%" + txt_rech.getText() + "%' ");
                table_prod.setModel(new ResultSetTableModel(rs));
                }else if (comb_rech.getSelectedItem().equals("stock")) {
                rs = db.querySelectAll("produit", "stock LIKE '%" + txt_rech.getText() + "%' ");
                table_prod.setModel(new ResultSetTableModel(rs));
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         if (txt_co.getText().equals("") || txt_re.getText().equals("")
                || txt_de.getText().equals("")|| txt_fo.getText().equals("") || txt_re.getText().equals("")|| txt_rem.getText().equals("") || txt_pr.getText().equals("")|| txt_st.getText().equals("")) {
                 JOptionPane.showMessageDialog(this, "SVP entrer les informations complete");
        } else {
            String[] colon = { "code_produit", "reference","desegnation", "rangemant", "fournisseur", "remise","prix","stock"};
            String[] inf = {txt_co.getText(), txt_re.getText(),txt_de.getText(),txt_ra.getText(),
                txt_fo.getText(),txt_rem.getText(),txt_pr.getText(), txt_st.getText()};
            System.out.println(db.queryInsert("produit", colon, inf));
            actualiser();
            table();
           
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    if (txt_co.getText().equals("") || txt_re.getText().equals("") || txt_de.getText().equals("")
                || txt_fo.getText().equals("")|| txt_re.getText().equals("") || txt_rem.getText().equals("")|| txt_pr.getText().equals("") || txt_st.getText().equals("")|| txt_ra.getText().equals(""))  {
            JOptionPane.showMessageDialog(this, "SVP entrer les informations complete");
        } else {
            String[] colon = { "code_produit", "reference","desegnation", "rangemant", "fournisseur", "remise","prix","stock"};
            String[] inf = {txt_co.getText(), txt_re.getText(),txt_de.getText(),txt_ra.getText(),
                txt_fo.getText(),txt_rem.getText(),txt_pr.getText(), txt_st.getText()};
            String id = String.valueOf(table_prod.getValueAt(table_prod.getSelectedRow(), 0));
            System.out.println(db.queryUpdate("produit", colon, inf, "id='" + id + "'"));
            table();
            actualiser();
        }
       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String id = String.valueOf(table_prod.getValueAt(table_prod.getSelectedRow(), 0));
        if (JOptionPane.showConfirmDialog(this, "est ce que tu es sure que tu veux suuprimer", "attention!!!", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            db.queryDelete("produit", "id='" + id + "'");
        } else {
            return;
        }
        table();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txt_rechActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_rechActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_rechActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        actualiser();
        table();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void txt_prActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_prActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_prActionPerformed

    private void txt_raActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_raActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_raActionPerformed

    private void txt_stActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_stActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_stActionPerformed

    private void table_prodMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_prodMouseClicked

                txt_co.setText(String.valueOf(table_prod.getValueAt(table_prod.getSelectedRow(), 1)));
                txt_re.setText(String.valueOf(table_prod.getValueAt(table_prod.getSelectedRow(), 2)));
                txt_de.setText(String.valueOf(table_prod.getValueAt(table_prod.getSelectedRow(), 3)));
                txt_ra.setText(String.valueOf(table_prod.getValueAt(table_prod.getSelectedRow(), 4)));
                txt_fo.setText(String.valueOf(table_prod.getValueAt(table_prod.getSelectedRow(), 5)));
                txt_rem.setText(String.valueOf(table_prod.getValueAt(table_prod.getSelectedRow(), 6)));
                txt_pr.setText(String.valueOf(table_prod.getValueAt(table_prod.getSelectedRow(), 7)));
                txt_st.setText(String.valueOf(table_prod.getValueAt(table_prod.getSelectedRow(), 8)));

    }//GEN-LAST:event_table_prodMouseClicked

    private void comb_rechActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comb_rechActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comb_rechActionPerformed

    private void table_prodAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_table_prodAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_table_prodAncestorAdded
 
    
  
    
    
    
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
            java.util.logging.Logger.getLogger(Produit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Produit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Produit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Produit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Produit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comb_rech;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_prod;
    private javax.swing.JTextField txt_co;
    private javax.swing.JTextField txt_de;
    private javax.swing.JTextField txt_fo;
    private javax.swing.JTextField txt_pr;
    private javax.swing.JTextField txt_ra;
    private javax.swing.JTextField txt_re;
    private javax.swing.JTextField txt_rech;
    private javax.swing.JTextField txt_rem;
    private javax.swing.JTextField txt_st;
    // End of variables declaration//GEN-END:variables
}

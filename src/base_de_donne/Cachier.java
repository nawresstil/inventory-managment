
package base_de_donne;
import java.lang.Double;
import java.lang.String;
import Application.parameter;
import application.ResultSetTableModel;
import Application.BDD;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class Cachier extends javax.swing.JFrame {

    ResultSet rs;
    BDD db;
    int old, dec, now;
    public Cachier() {
        db = new BDD(new parameter().HOST_DB, new parameter().USERNAME_DB,
            new parameter().PASSWORD_DB, new parameter().IPHOST, new parameter().PORT);
        initComponents();
        table();
        jam();
    }

    public void table() {
        String colon[] = {"code_produit","reference","desegnation","rangemant","fournisseur","remise","prix","stock"};
        rs = db.querySelect(colon, "produit");
        table_prod.setModel(new ResultSetTableModel(rs));
    }
    
    public void importer() {
        String colon[] = {"num_facture","code_produit","reference","prix_vente","stock_sortie","subtotal"};
        rs = db.fcSelectCommand(colon, "vente", "num_facture='" + txt_fac.getText() + "'");
        table_ven.setModel(new ResultSetTableModel(rs));
    }   
    
    
     public void jam() {
        Date s = new Date();
        SimpleDateFormat tgl = new SimpleDateFormat("EEEE-dd-MMM-yyyy");
        SimpleDateFormat jam = new SimpleDateFormat("HH:mm");
        lbl1.setText(jam.format(s));
        lbl2.setText(tgl.format(s));}
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_prod = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        comb_rech = new javax.swing.JComboBox<>();
        txt_rech = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txt_fou = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_re = new javax.swing.JTextField();
        txt_ra = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_pr = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_rem = new javax.swing.JTextField();
        txtnou = new javax.swing.JTextField();
        txt_sto = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_co1 = new javax.swing.JTextField();
        lbltot2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        txt_fac = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_ven = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        lbltot1 = new javax.swing.JLabel();
        lbltot4 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txt_co2 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txt_co3 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        lbltot5 = new javax.swing.JLabel();

        jPanel3.setLayout(null);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setForeground(new java.awt.Color(255, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(850, 750));
        jPanel1.setLayout(null);

        table_prod.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "code_produit", "reference", "desegnation", "rangemant", "fournisseur", "remise", "prix", "stock"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table_prod.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_prodMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_prod);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 70, 750, 90);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("     cachier");
        jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel3);
        jLabel3.setBounds(320, 20, 120, 33);

        lbl1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jPanel1.add(lbl1);
        lbl1.setBounds(90, 30, 120, 20);

        lbl2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jPanel1.add(lbl2);
        lbl2.setBounds(460, 20, 310, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 790, 180);

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("  recherche par catégorie : ");
        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel2);
        jLabel2.setBounds(20, 10, 230, 20);

        comb_rech.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "id", "code_produit", "reference", "designation", "rangemant", "fournisseur", "remise", "prix", "stock" }));
        comb_rech.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comb_rechActionPerformed(evt);
            }
        });
        jPanel2.add(comb_rech);
        comb_rech.setBounds(30, 40, 210, 30);

        txt_rech.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_rech.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_rechActionPerformed(evt);
            }
        });
        jPanel2.add(txt_rech);
        txt_rech.setBounds(120, 80, 120, 30);

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton1.setText("Recherche");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(10, 80, 100, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("nouveau Prix :");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(20, 360, 100, 30);

        txt_fou.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_fou.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_fouActionPerformed(evt);
            }
        });
        jPanel2.add(txt_fou);
        txt_fou.setBounds(120, 240, 120, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("rangement :");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(20, 200, 80, 30);

        txt_re.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel2.add(txt_re);
        txt_re.setBounds(120, 160, 120, 30);

        txt_ra.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel2.add(txt_ra);
        txt_ra.setBounds(120, 200, 120, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("reference :");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(20, 160, 80, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("remise %:");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(20, 320, 70, 30);

        txt_pr.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_pr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_prActionPerformed(evt);
            }
        });
        txt_pr.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_prKeyReleased(evt);
            }
        });
        jPanel2.add(txt_pr);
        txt_pr.setBounds(120, 280, 120, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("fournisseur :");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(20, 240, 90, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("prix :");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(20, 280, 60, 30);

        txt_rem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel2.add(txt_rem);
        txt_rem.setBounds(120, 320, 120, 30);

        txtnou.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtnou.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnouActionPerformed(evt);
            }
        });
        txtnou.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtnouKeyReleased(evt);
            }
        });
        jPanel2.add(txtnou);
        txtnou.setBounds(120, 360, 120, 30);

        txt_sto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_sto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_stoActionPerformed(evt);
            }
        });
        txt_sto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_stoKeyReleased(evt);
            }
        });
        jPanel2.add(txt_sto);
        txt_sto.setBounds(120, 400, 120, 30);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("stock sortie :");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(20, 400, 90, 30);

        jLabel13.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel13.setText("RP :");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(40, 450, 50, 22);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("code produit :");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(20, 120, 90, 30);

        txt_co1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel2.add(txt_co1);
        txt_co1.setBounds(120, 120, 120, 30);

        lbltot2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        lbltot2.setText("0");
        lbltot2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lbltot2AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel2.add(lbltot2);
        lbltot2.setBounds(120, 450, 120, 22);

        jButton3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton3.setText("ajouter au produit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);
        jButton3.setBounds(30, 490, 210, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 180, 260, 540);

        jPanel4.setBackground(new java.awt.Color(204, 255, 204));
        jPanel4.setLayout(null);

        txt_fac.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel4.add(txt_fac);
        txt_fac.setBounds(120, 20, 110, 30);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("num facture :");
        jPanel4.add(jLabel6);
        jLabel6.setBounds(10, 20, 120, 30);

        table_ven.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "num_facture", "code_produit", "reference", "prix_vente", "stock_sortie", "subtotal"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_ven.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_venMouseClicked(evt);
            }
        });
        table_ven.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                table_venKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(table_ven);

        jPanel4.add(jScrollPane2);
        jScrollPane2.setBounds(0, 80, 510, 90);

        jButton4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton4.setText("recherche");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton4);
        jButton4.setBounds(240, 20, 110, 30);

        jButton5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton5.setText("supprimer");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton5);
        jButton5.setBounds(356, 20, 110, 30);

        lbltot1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        lbltot1.setText("0");
        jPanel4.add(lbltot1);
        lbltot1.setBounds(300, 210, 110, 30);

        lbltot4.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        lbltot4.setText("Total");
        jPanel4.add(lbltot4);
        lbltot4.setBounds(110, 220, 70, 20);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel14.setText("cash :");
        jPanel4.add(jLabel14);
        jLabel14.setBounds(20, 280, 80, 30);

        txt_co2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_co2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_co2ActionPerformed(evt);
            }
        });
        jPanel4.add(txt_co2);
        txt_co2.setBounds(100, 280, 110, 30);

        jLabel15.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel15.setText("payé apres :");
        jPanel4.add(jLabel15);
        jLabel15.setBounds(230, 280, 130, 30);

        txt_co3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_co3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_co3ActionPerformed(evt);
            }
        });
        jPanel4.add(txt_co3);
        txt_co3.setBounds(370, 280, 90, 30);

        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton2.setText("annuler");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2);
        jButton2.setBounds(130, 370, 210, 30);

        jButton6.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton6.setText("Imprimer");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton6);
        jButton6.setBounds(130, 340, 210, 30);

        lbltot5.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        lbltot5.setText("RP :");
        jPanel4.add(lbltot5);
        lbltot5.setBounds(200, 220, 70, 20);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(260, 180, 530, 540);

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

    private void txt_rechActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_rechActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_rechActionPerformed

    private void comb_rechActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comb_rechActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comb_rechActionPerformed

    private void txt_fouActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_fouActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_fouActionPerformed

    private void txtnouActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnouActionPerformed
        
    }//GEN-LAST:event_txtnouActionPerformed

    private void txt_stoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_stoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_stoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
               String invoice = txt_fac.getText();
        if (JOptionPane.showConfirmDialog(this,"est ce que tu es sure que tu veux supprimer ","attention", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            db.queryDelete("vente", "num_facture=" + invoice);
        } else {
            return;
        }
        importer();
        total();
    
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    importer();
    total();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       String id = String.valueOf(table_ven.getValueAt(table_ven.getSelectedRow(), 0));
        if (JOptionPane.showConfirmDialog(this, "est ce que tu es sure que tu veux supprimer ", "Attention", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            db.queryDelete("vente", "id=" + id);
        } else {
            return;
        }
        importer();
        total();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void txt_co2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_co2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_co2ActionPerformed

    private void txt_co3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_co3ActionPerformed
    payapres();       
    }//GEN-LAST:event_txt_co3ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       if (txt_co1.getText().equals("") || txt_re.getText().equals("") || txt_ra.getText().equals("")
                || txt_fou.getText().equals("") || txt_rem.getText().equals("") || txt_pr.getText().equals("") || txtnou.getText().equals("")|| txt_sto.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "SVP entrer vos donneé");
        } else if (txt_fac.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "SVP entrer le num de facture");
        } else {
            String[] colon = {"num_facture","code_produit", "reference", "prix_vente", "stock_sortie", "subtotal"};
            String[] isi = {txt_fac.getText(), txt_co1.getText(), txt_re.getText(), txtnou.getText(), txt_sto.getText(), lbltot1.getText()};
            System.out.println(db.queryInsert("vente", colon, isi));
            try {
                if (!test_stock()) { 
                    JOptionPane.showMessageDialog(this, "le stock est Limiter");
                } else {
                    def(); //true
                    table(); //true
                }
            } catch (SQLException ex) {
                Logger.getLogger(Cachier.class.getName()).log(Level.SEVERE, null, ex);
                System.err.println("\n"+ex);
            }
            subtotal();
            importer();
            total();
        }

    
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
recu d= new recu();
d.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void txt_stoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_stoKeyReleased
      subtotal();
    }//GEN-LAST:event_txt_stoKeyReleased

    private void table_venKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_table_venKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_table_venKeyPressed

    
    private void table_venMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_venMouseClicked

    
    }//GEN-LAST:event_table_venMouseClicked

    private void table_prodMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_prodMouseClicked
                txt_co1.setText(String.valueOf(table_prod.getValueAt(table_prod.getSelectedRow(), 0)));
                txt_re.setText(String.valueOf(table_prod.getValueAt(table_prod.getSelectedRow(), 1)));
                txt_ra.setText(String.valueOf(table_prod.getValueAt(table_prod.getSelectedRow(), 3)));
                txt_fou.setText(String.valueOf(table_prod.getValueAt(table_prod.getSelectedRow(), 4)));
                txt_rem.setText(String.valueOf(table_prod.getValueAt(table_prod.getSelectedRow(), 5)));
                txt_pr.setText(String.valueOf(table_prod.getValueAt(table_prod.getSelectedRow(), 6)));
    }//GEN-LAST:event_table_prodMouseClicked

    private void lbltot2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lbltot2AncestorAdded
 
    }//GEN-LAST:event_lbltot2AncestorAdded

    private void txt_prActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_prActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_prActionPerformed

    private void txtnouKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnouKeyReleased
       
    }//GEN-LAST:event_txtnouKeyReleased

    private void txt_prKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_prKeyReleased
      cout();
    }//GEN-LAST:event_txt_prKeyReleased

    public void subtotal() {
        double a = Double.parseDouble(txtnou.getText());
        System.out.println("base_de_donne.Cachier.subtotal()"+a);
        double b = Double.parseDouble(txt_sto.getText());
        System.out.println("base_de_donne.Cachier.subtotal(2)"+b);
        double c = a * b;
        System.out.println("base_de_donne.Cachier.subtotal(3)"+c);
        lbltot2.setText(String.valueOf(c));}
     
     public boolean test_stock() throws SQLException {
        boolean teststock;
        rs = db.querySelectAll("produit","code_produit='" + txt_co1.getText() + "'");
        while (rs.next()) {
            old = rs.getInt("stock");
        }
        dec = Integer.parseInt(txt_sto.getText());
        if (old < dec) {
            teststock = false;
        } else {
            teststock = true;
        }
        return teststock;
    }
     
     public void def() throws SQLException {
        rs = db.querySelectAll("produit", "code_produit='" + txt_co1.getText() + "'");
        while (rs.next()) {
            old = rs.getInt("stock");
        }
        dec = Integer.parseInt(txt_sto.getText());
        now = old - dec;
         String nvstock = Integer.toString(now);

        String a = String.valueOf(nvstock);
        String[] colon = {"stock"};
        String[] isi = {a};
        System.out.println(db.queryUpdate("produit", colon, isi, "code_produit='" + txt_co1.getText() + "'"));
    }
     
           public void total() {
        rs = db.exécutionQuery("SELECT SUM(subtotal) as subtotal FROM vente WHERE num_facture = '" + txt_fac.getText() + "'");
        try {
            rs.next();
            lbltot1.setText(rs.getString("subtotal"));
        } catch (SQLException ex) {
            Logger.getLogger(Cachier.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
           
           
       public void payapres() {
        int a = Integer.parseInt(lbltot2.getText());
        int b = Integer.parseInt(txt_co2.getText());
        int c = b - a;
        txt_co3.setText(Integer.toString(c));
    }
       
       
    public void cout() {
        double a = Double.parseDouble(txt_pr.getText());
        double b = Double.parseDouble(txt_rem.getText());
        double c = a - a * (b / 100);
        txtnou.setText(String.valueOf(c));
    }
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
            java.util.logging.Logger.getLogger(Cachier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cachier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cachier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cachier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cachier().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comb_rech;
    private javax.swing.JButton jButton1;
    public javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    public javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    public javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public static javax.swing.JPanel jPanel1;
    public static javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public static javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JLabel lbl1;
    public javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbltot1;
    private javax.swing.JLabel lbltot2;
    private javax.swing.JLabel lbltot4;
    private javax.swing.JLabel lbltot5;
    public javax.swing.JTable table_prod;
    private javax.swing.JTable table_ven;
    private javax.swing.JTextField txt_co1;
    public javax.swing.JTextField txt_co2;
    public javax.swing.JTextField txt_co3;
    private javax.swing.JTextField txt_fac;
    private javax.swing.JTextField txt_fou;
    private javax.swing.JTextField txt_pr;
    private javax.swing.JTextField txt_ra;
    private javax.swing.JTextField txt_re;
    private javax.swing.JTextField txt_rech;
    private javax.swing.JTextField txt_rem;
    private javax.swing.JTextField txt_sto;
    private javax.swing.JTextField txtnou;
    // End of variables declaration//GEN-END:variables
}

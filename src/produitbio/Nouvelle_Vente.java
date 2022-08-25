/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package produitbio;

import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author AISSAN Francois
 */
public class Nouvelle_Vente extends javax.swing.JPanel {

    /**
     * Creates new form Nouvelle_Vente
     */
    public Nouvelle_Vente() {
        initComponents();
        String annee_courante_deux_bit = new SimpleDateFormat("yy").format(new Date());        
        //System.out.println(annee_courante_deux_bit);   
        Font myFont2 = new Font("Yu Gothic UI Semilight", Font.BOLD, 16);
        produit_ajoutes.getTableHeader().setFont(myFont2);
        montant_total.setText("0.0");
        
        Singleton user = Singleton.getInstance();
        String userLogin =user.getUserLogin();
        
        //Charge les clients
        try {
                //connexion à la base de données
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                co = DriverManager.getConnection("jdbc:mysql://localhost/biomarket?characterEncoding=utf-8","root","");
                st = co.createStatement();
                
                //Recuprération du profil de connexion
                rs = st.executeQuery("SELECT profil_utilisateur FROM utilisateur WHERE login_utilisateur ='"+userLogin+"'");
                while(rs.next())
                {
                   int profil_user = rs.getInt("profil_utilisateur");
                   if (profil_user == 3)
                   {
                       ajouter_new_produit.setVisible(false);
                   }
                }                
               //fin du traitement de l'affichage du bouton d'ajoute de produit par le vendeur
                
                //Traitement automatique de la référence de la facture
                rs = st.executeQuery("SELECT count(id_vente) as dernier_id_v FROM vente");
                while(rs.next()){
                    int dernier_id_vente = rs.getInt("dernier_id_v");
                    int id_vente_suivant = dernier_id_vente +1;
                    reference_auto = "BK-000"+id_vente_suivant+"-"+annee_courante_deux_bit;
                    ref_vente_auto.setText(reference_auto);
                    //System.out.println(reference_auto);
                }
                //Recuperation des resultats 
                rs = st.executeQuery("SELECT point_client,nom_prenoms_client FROM client");
                
                while(rs.next()){
                   String client_l = rs.getString("nom_prenoms_client");
                   String point_client = rs.getString("point_client");
                   reduction.setText(point_client);
                   liste_client.addItem(client_l);
                }
                
                //La date de l'opération
                String date_vente = new SimpleDateFormat().format(new Date());            
                //Recuperation des produits 
                rs = st.executeQuery("SELECT lib_produit FROM produit");               
                while(rs.next()){
                   String produit_l = rs.getString("lib_produit");                  
                   produit_choisi.addItem(produit_l);
                }
                
        } catch (Exception e) {
           //message_error_cat.setText("Problème de connexion !!");
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

        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        ref_vente_auto = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        liste_client = new javax.swing.JComboBox();
        ajouter_client = new produitbio.Button_perso();
        jPanel5 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        quantite_prod = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        supprimer_produit = new produitbio.Button_perso();
        ajouter_produit = new produitbio.Button_perso();
        modifier_produit = new produitbio.Button_perso();
        produit_choisi = new javax.swing.JComboBox();
        message_qte_error = new javax.swing.JLabel();
        ajouter_new_produit = new produitbio.Button_perso();
        jPanel7 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        valider_vente = new produitbio.Button_perso();
        imprimer_facture = new produitbio.Button_perso();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        produit_ajoutes = new javax.swing.JTable();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        reduction = new javax.swing.JLabel();
        montant_total = new javax.swing.JLabel();
        net_a_payer = new javax.swing.JLabel();

        setBackground(new java.awt.Color(217, 217, 217));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(null);

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setText("Entete facture de vente");
        jPanel6.add(jLabel16);
        jLabel16.setBounds(100, 20, 200, 25);

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 51));
        jLabel17.setText("Client");
        jPanel6.add(jLabel17);
        jLabel17.setBounds(10, 150, 37, 20);

        ref_vente_auto.setBackground(new java.awt.Color(235, 235, 235));
        ref_vente_auto.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        ref_vente_auto.setForeground(new java.awt.Color(51, 51, 51));
        ref_vente_auto.setText("Bk-00000001-22");
        ref_vente_auto.setBorder(javax.swing.BorderFactory.createEmptyBorder(4, 2, 2, 2));
        ref_vente_auto.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        ref_vente_auto.setEnabled(false);
        ref_vente_auto.setName(""); // NOI18N
        ref_vente_auto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ref_vente_autoActionPerformed(evt);
            }
        });
        jPanel6.add(ref_vente_auto);
        ref_vente_auto.setBounds(111, 70, 260, 40);

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 51, 51));
        jLabel19.setText("Ref. vente");
        jPanel6.add(jLabel19);
        jLabel19.setBounds(10, 80, 62, 20);

        liste_client.setBackground(new java.awt.Color(235, 235, 235));
        liste_client.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jPanel6.add(liste_client);
        liste_client.setBounds(110, 140, 260, 40);

        ajouter_client.setBackground(new java.awt.Color(217, 217, 217));
        ajouter_client.setForeground(new java.awt.Color(255, 255, 255));
        ajouter_client.setIcon(new javax.swing.ImageIcon(getClass().getResource("/produitbio/icons8-dashboard-colours/icons8-plus-50.png"))); // NOI18N
        ajouter_client.setBorderColor(new java.awt.Color(217, 217, 217));
        ajouter_client.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        ajouter_client.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ajouter_client.setRadius(50);
        ajouter_client.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ajouter_clientMouseClicked(evt);
            }
        });
        ajouter_client.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajouter_clientActionPerformed(evt);
            }
        });
        jPanel6.add(ajouter_client);
        ajouter_client.setBounds(390, 140, 40, 40);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(null);

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("Ref. produit");
        jPanel5.add(jLabel13);
        jLabel13.setBounds(20, 90, 90, 20);

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("Quantité");
        jPanel5.add(jLabel14);
        jLabel14.setBounds(20, 160, 70, 20);

        quantite_prod.setBackground(new java.awt.Color(235, 235, 235));
        quantite_prod.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        quantite_prod.setForeground(new java.awt.Color(51, 51, 51));
        quantite_prod.setBorder(javax.swing.BorderFactory.createEmptyBorder(4, 2, 2, 2));
        quantite_prod.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        quantite_prod.setName(""); // NOI18N
        quantite_prod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantite_prodActionPerformed(evt);
            }
        });
        jPanel5.add(quantite_prod);
        quantite_prod.setBounds(120, 150, 260, 40);

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setText("Ajout des produits");
        jPanel5.add(jLabel15);
        jLabel15.setBounds(110, 20, 170, 25);

        supprimer_produit.setBackground(new java.awt.Color(0, 169, 54));
        supprimer_produit.setForeground(new java.awt.Color(255, 255, 255));
        supprimer_produit.setText("Supprimer");
        supprimer_produit.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        supprimer_produit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        supprimer_produit.setRadius(40);
        supprimer_produit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                supprimer_produitMouseClicked(evt);
            }
        });
        supprimer_produit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supprimer_produitActionPerformed(evt);
            }
        });
        jPanel5.add(supprimer_produit);
        supprimer_produit.setBounds(280, 220, 120, 33);

        ajouter_produit.setBackground(new java.awt.Color(0, 169, 54));
        ajouter_produit.setForeground(new java.awt.Color(255, 255, 255));
        ajouter_produit.setText("Ajouter");
        ajouter_produit.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        ajouter_produit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ajouter_produit.setRadius(40);
        ajouter_produit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ajouter_produitMouseClicked(evt);
            }
        });
        jPanel5.add(ajouter_produit);
        ajouter_produit.setBounds(10, 220, 110, 33);

        modifier_produit.setBackground(new java.awt.Color(0, 169, 54));
        modifier_produit.setForeground(new java.awt.Color(255, 255, 255));
        modifier_produit.setText("Modifier");
        modifier_produit.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        modifier_produit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        modifier_produit.setRadius(40);
        modifier_produit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modifier_produitMouseClicked(evt);
            }
        });
        modifier_produit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifier_produitActionPerformed(evt);
            }
        });
        jPanel5.add(modifier_produit);
        modifier_produit.setBounds(140, 220, 120, 33);

        produit_choisi.setBackground(new java.awt.Color(235, 235, 235));
        produit_choisi.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jPanel5.add(produit_choisi);
        produit_choisi.setBounds(120, 80, 260, 40);

        message_qte_error.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel5.add(message_qte_error);
        message_qte_error.setBounds(120, 190, 260, 20);

        ajouter_new_produit.setBackground(new java.awt.Color(217, 217, 217));
        ajouter_new_produit.setForeground(new java.awt.Color(255, 255, 255));
        ajouter_new_produit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/produitbio/icons8-dashboard-colours/icons8-plus-50.png"))); // NOI18N
        ajouter_new_produit.setBorderColor(new java.awt.Color(217, 217, 217));
        ajouter_new_produit.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        ajouter_new_produit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ajouter_new_produit.setRadius(50);
        ajouter_new_produit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ajouter_new_produitMouseClicked(evt);
            }
        });
        ajouter_new_produit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajouter_new_produitActionPerformed(evt);
            }
        });
        jPanel5.add(ajouter_new_produit);
        ajouter_new_produit.setBounds(390, 80, 40, 40);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(null);

        jLabel23.setBackground(new java.awt.Color(255, 255, 255));
        jLabel23.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(51, 51, 51));
        jLabel23.setText("Validation Vente");
        jPanel7.add(jLabel23);
        jLabel23.setBounds(100, 10, 140, 25);

        valider_vente.setBackground(new java.awt.Color(0, 169, 54));
        valider_vente.setForeground(new java.awt.Color(255, 255, 255));
        valider_vente.setText("Valider vente");
        valider_vente.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        valider_vente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        valider_vente.setRadius(40);
        valider_vente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                valider_venteMouseClicked(evt);
            }
        });
        valider_vente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valider_venteActionPerformed(evt);
            }
        });
        jPanel7.add(valider_vente);
        valider_vente.setBounds(10, 70, 170, 40);

        imprimer_facture.setBackground(new java.awt.Color(0, 169, 54));
        imprimer_facture.setForeground(new java.awt.Color(255, 255, 255));
        imprimer_facture.setText("Imprimer facture");
        imprimer_facture.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        imprimer_facture.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        imprimer_facture.setRadius(40);
        imprimer_facture.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imprimer_factureMouseClicked(evt);
            }
        });
        imprimer_facture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimer_factureActionPerformed(evt);
            }
        });
        jPanel7.add(imprimer_facture);
        imprimer_facture.setBounds(190, 70, 200, 40);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 690));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(null);

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Produits ajoutés");
        jPanel4.add(jLabel8);
        jLabel8.setBounds(290, 20, 140, 25);

        produit_ajoutes.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        produit_ajoutes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N°", "Désignation", "Quantité", "Prix unitaire", "Montant"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
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
        jScrollPane1.setViewportView(produit_ajoutes);
        if (produit_ajoutes.getColumnModel().getColumnCount() > 0) {
            produit_ajoutes.getColumnModel().getColumn(0).setResizable(false);
        }

        jPanel4.add(jScrollPane1);
        jScrollPane1.setBounds(20, 50, 730, 520);

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 51, 51));
        jLabel20.setText("Montant total");
        jPanel4.add(jLabel20);
        jLabel20.setBounds(20, 590, 90, 20);

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(51, 51, 51));
        jLabel21.setText("Reduction");
        jPanel4.add(jLabel21);
        jLabel21.setBounds(280, 590, 80, 20);

        jLabel22.setBackground(new java.awt.Color(255, 255, 255));
        jLabel22.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(51, 51, 51));
        jLabel22.setText("Total net à payer");
        jPanel4.add(jLabel22);
        jLabel22.setBounds(550, 590, 110, 20);

        reduction.setBackground(new java.awt.Color(217, 217, 217));
        reduction.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jPanel4.add(reduction);
        reduction.setBounds(280, 620, 210, 40);

        montant_total.setBackground(new java.awt.Color(217, 217, 217));
        montant_total.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jPanel4.add(montant_total);
        montant_total.setBounds(20, 620, 210, 40);

        net_a_payer.setBackground(new java.awt.Color(217, 217, 217));
        net_a_payer.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jPanel4.add(net_a_payer);
        net_a_payer.setBounds(560, 620, 190, 40);

        add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 770, 690));
    }// </editor-fold>//GEN-END:initComponents

    private void quantite_prodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantite_prodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantite_prodActionPerformed

    private void supprimer_produitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supprimer_produitMouseClicked
        if(JOptionPane.showConfirmDialog(null, "Voulez-vous supprimer?", "SUPPRESSION",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
            DefaultTableModel model = (DefaultTableModel)produit_ajoutes.getModel();
            //Ligne sélectionnée
            int rowindex = produit_ajoutes.getSelectedRow();

            System.out.println("Index: "+rowindex);
            String montant_total_string =  reduction.getText();
            Double montant_total_double = new Double(montant_total_string);
            
            System.out.println("Montant actuel double: "+montant_total_double);
            
            double montant_a_supprimer = (double) produit_ajoutes.getValueAt(rowindex,4);  
            
            double nouveau_montant = montant_total_double - montant_a_supprimer;
            System.out.println(nouveau_montant);                                         
            reduction.setText(""+nouveau_montant);            
            model.removeRow(rowindex);
        }
    }//GEN-LAST:event_supprimer_produitMouseClicked

    private void supprimer_produitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supprimer_produitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_supprimer_produitActionPerformed

    private void ajouter_produitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ajouter_produitMouseClicked
        dtm.addColumn("N°");
        dtm.addColumn("Désignation");
        dtm.addColumn("Quantité");
        dtm.addColumn("Prix unitaire");
        dtm.addColumn("Montant");
        
        java.util.List<Double> list = new ArrayList<Double>(); 

        String designation_prod = (String) produit_choisi.getSelectedItem();
        //Conversion et gestion de l'exception de conversion du double
        message_qte_error.setText("");
        //montant_total.setText("0.0");
        try {
            
            Double qte  = new Double(quantite_prod.getText());
            DefaultTableModel model = (DefaultTableModel)produit_ajoutes.getModel();
            //Récupération du prix unitaire du produit sélectionné
            
            try {
                //connexion à la base de données
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                co = DriverManager.getConnection("jdbc:mysql://localhost/biomarket?characterEncoding=utf-8","root","");
                st = co.createStatement();

                //Traitement automatique de la référence de la facture
                rs = st.executeQuery("SELECT prix_vente FROM produit WHERE lib_produit = '"+designation_prod+"'");
                while(rs.next())
                {
                    double prix_vente = rs.getDouble("prix_vente");
                    double montant = prix_vente*qte;
                    model.addRow(new Object[]{produit_ajoutes.getRowCount()+1, designation_prod,qte,prix_vente,montant});

                    
                    //Somme des montants
                    //List<Double> numdata = new ArrayList<>();
                    //list.add(montant);
                    
                    for (int count = 0; count < model.getRowCount(); count++){
                          list.add((Double) model.getValueAt(count, 4));
                    }
                    double somme = list.stream().mapToDouble(Double::doubleValue).sum();
                    String somme_convertie = ""+somme;
                    montant_total.setText(somme_convertie);
                    //Réinitialisation du champ
                    quantite_prod.setText("");

                }
                } catch (Exception e) 
                {
                    message_qte_error.setText("Problème de connexion !!");
                }
         
        } catch (Exception e) 
        {
            //Message d'erreur si l'utilisateur entre une texte au lieu d'un nombre
            message_qte_error.setForeground(Color.red);
            message_qte_error.setText("Entrer une valeur numérique");
        }
        

    }//GEN-LAST:event_ajouter_produitMouseClicked

    private void modifier_produitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modifier_produitMouseClicked
        
        
        DefaultTableModel dt = (DefaultTableModel)produit_ajoutes.getModel();
        int index = produit_ajoutes.getSelectedRow();
        
        String design_produit = (String) produit_ajoutes.getValueAt(index,1);
        produit_choisi.setSelectedItem(design_produit);
        
        String qte_produit_string = (String) produit_ajoutes.getValueAt(index,2);
        

/*
        String designation_prod = (String) produit_choisi.getSelectedItem();
        Double qte  = new Double(quantite_prod.getText());       
        
        dt.setValueAt(designation_prod, index, 1);
        dt.setValueAt(qte, index, 2);

        quantite_prod.setText("");*/
    }//GEN-LAST:event_modifier_produitMouseClicked

    private void modifier_produitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifier_produitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modifier_produitActionPerformed

    private void ref_vente_autoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ref_vente_autoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ref_vente_autoActionPerformed

    private void valider_venteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_valider_venteMouseClicked
        DefaultTableModel model = (DefaultTableModel)produit_ajoutes.getModel();
        if (model.getRowCount() == 0)
        {
            JOptionPane.showMessageDialog(this, "Panier vide");
        }
        else
        {
            String ref_vente = ref_vente_auto.getText();
            String designation_prod= "";
            Double qte_ajoute,montant_total_net;
            try {
                //connexion à la base de données
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                co = DriverManager.getConnection("jdbc:mysql://localhost/biomarket?characterEncoding=utf-8","root","");
                st = co.createStatement();
                
                //Enregistrement des produits dans la bd
                for(int i = 0; i< model.getRowCount(); i++)
                {
                    designation_prod = produit_ajoutes.getValueAt(i, 1).toString();
                    qte_ajoute = new Double( produit_ajoutes.getValueAt(i, 2).toString());
                    //Enregistrement des produits
                    String sql_query ="INSERT INTO produits_vendus(ref_vente,ref_prod,qte) values(?,?,?)";                  
                    prepstmt = co.prepareStatement(sql_query);
                    prepstmt.setString(1, ref_vente);
                    prepstmt.setString(2, designation_prod);
                    prepstmt.setDouble(3, qte_ajoute);
                    prepstmt.execute();                                   
                }
                // Variables pour l'enregistrement de la vente
                montant_total_net = new Double(montant_total.getText());//a revoir
                String date_vente = new SimpleDateFormat().format(new Date());
                String nom_prenom_client = liste_client.getSelectedItem().toString();
                int ref_client_int = 0;
                double point_cli = 0;

                //st.executeUpdate("INSERT INTO produit_vendu(ref_vente,ref_prod,qte_prod) values('"+ref_vente+"','"+designation_prod+"','"+qte_ajoute+"')");
                
                //Recupération du point du client et de sa ref
                rs = st.executeQuery("SELECT ref_client,point_client FROM client WHERE nom_prenoms_client = '"+nom_prenom_client+"'");
                if(rs.next())
                {
                    //System.out.println("dedant:"+rs);
                    ref_client_int = (int) rs.getObject(1);
                    point_cli = (double)rs.getObject(2);
                }

                //Enregistrement de la vente proprement dite
                st.executeUpdate("INSERT INTO vente(ref_vente,ref_client,date_vente,montant_net) values('"+ref_vente+"','"+ref_client_int+"','"+date_vente+"','"+montant_total_net+"')");
                
                //Mise à jour du point du client
                //Calcul du point du client
                double point_calcule = montant_total_net*0.0005 +point_cli; 
                st.executeUpdate("UPDATE client SET point_client= "+point_calcule+" where ref_client ="+ref_client_int+"");                
                co.close();                           
                //Notification
                JOptionPane.showMessageDialog(this, "Vente enregistrée...");
                model.setRowCount(0); 
                
                ref_vente_auto.setText(reference_auto);

             } catch (Exception e) {
                System.out.println("Probleme");
        }  
        }
    }//GEN-LAST:event_valider_venteMouseClicked

    private void valider_venteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valider_venteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valider_venteActionPerformed

    private void imprimer_factureMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imprimer_factureMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_imprimer_factureMouseClicked

    private void imprimer_factureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimer_factureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imprimer_factureActionPerformed

    private void ajouter_new_produitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ajouter_new_produitMouseClicked
        new Nouveau_produit().setVisible(true);
    }//GEN-LAST:event_ajouter_new_produitMouseClicked

    private void ajouter_new_produitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouter_new_produitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ajouter_new_produitActionPerformed

    private void ajouter_clientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ajouter_clientMouseClicked
        new Nouveau_Client().setVisible(true);
    }//GEN-LAST:event_ajouter_clientMouseClicked

    private void ajouter_clientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouter_clientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ajouter_clientActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private produitbio.Button_perso ajouter_client;
    private produitbio.Button_perso ajouter_new_produit;
    private produitbio.Button_perso ajouter_produit;
    private produitbio.Button_perso imprimer_facture;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox liste_client;
    private javax.swing.JLabel message_qte_error;
    private produitbio.Button_perso modifier_produit;
    private javax.swing.JLabel montant_total;
    private javax.swing.JLabel net_a_payer;
    private javax.swing.JTable produit_ajoutes;
    private javax.swing.JComboBox produit_choisi;
    private javax.swing.JTextField quantite_prod;
    private javax.swing.JLabel reduction;
    private javax.swing.JTextField ref_vente_auto;
    private produitbio.Button_perso supprimer_produit;
    private produitbio.Button_perso valider_vente;
    // End of variables declaration//GEN-END:variables
    DefaultTableModel dtm = new DefaultTableModel();
    String reference_auto ="";    
    ResultSet rs = null;
    Statement st = null;
    PreparedStatement prepstmt= null;
    PreparedStatement prepstmt1= null;

    Connection co = null;
}

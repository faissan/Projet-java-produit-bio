/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package produitbio;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author AISSAN Francois
 */
public class Liste_produit extends javax.swing.JPanel {

    /**
     * Creates new form Liste_utilisateurs
     */
    public Liste_produit() {
        initComponents();
        dtm.addColumn("Nom");
        dtm.addColumn("Prenom");
        dtm.addColumn("Login");
        //dtm.addColumn("Pwd");
        //dtm.addColumn("Profil");
        
        System.out.println("OK  gggg");
        try {
                //connexion à la base de données
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                    co = DriverManager.getConnection("jdbc:mysql://localhost/biomarket?characterEncoding=latin1","root","");
                    st = co.createStatement();    
                    resultat = st.executeQuery("SELECT nom_utilisateur,prenom_utilisateur,login_utilisateur FROM utilisateur");
                    
                    while(resultat.next())
                    {
                        System.out.print(resultat.getObject(1).toString() +"-"+resultat.getObject(2)+"-"+resultat.getObject(3));
                        System.out.println("");
                        dtm.addRow(new Object[]{resultat.getObject(1),resultat.getObject(2),resultat.getObject(3)});
                    }
                    
                    System.out.println(dtm.getRowCount());
                    liste_user_table.setModel(dtm);
        } catch (Exception e) {
            System.out.println("ERROR");
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

        jScrollPane2 = new javax.swing.JScrollPane();
        liste_user_table = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        ajout_produit = new produitbio.Button_perso();
        supprimer_produit = new produitbio.Button_perso();
        jPanel4 = new javax.swing.JPanel();
        modifier_produit = new produitbio.Button_perso();
        ajout_categorie = new produitbio.Button_perso();
        jScrollPane1 = new javax.swing.JScrollPane();
        liste_produit = new javax.swing.JTable();

        liste_user_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(liste_user_table);

        setBackground(new java.awt.Color(217, 217, 217));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(217, 217, 217));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel5.setBackground(new java.awt.Color(217, 217, 217));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Liste des produits");

        ajout_produit.setBackground(new java.awt.Color(0, 169, 54));
        ajout_produit.setForeground(new java.awt.Color(51, 51, 51));
        ajout_produit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/produitbio/icons8-dashboard-colours/icons8-plus-25.png"))); // NOI18N
        ajout_produit.setText("Ajouter un produit");
        ajout_produit.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        ajout_produit.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ajout_produit.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        ajout_produit.setIconTextGap(5);
        ajout_produit.setRadius(18);
        ajout_produit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ajout_produitMouseClicked(evt);
            }
        });

        supprimer_produit.setBackground(new java.awt.Color(255, 51, 51));
        supprimer_produit.setForeground(new java.awt.Color(51, 51, 51));
        supprimer_produit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/produitbio/icons8-dashboard-colours/icons8-supprimer-pour-toujours-25.png"))); // NOI18N
        supprimer_produit.setText("Supprimer un produit");
        supprimer_produit.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        supprimer_produit.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        supprimer_produit.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        supprimer_produit.setIconTextGap(5);
        supprimer_produit.setRadius(18);
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

        jPanel4.setBackground(new java.awt.Color(217, 217, 217));
        jPanel4.setLayout(new java.awt.GridBagLayout());

        modifier_produit.setBackground(new java.awt.Color(255, 153, 51));
        modifier_produit.setForeground(new java.awt.Color(51, 51, 51));
        modifier_produit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/produitbio/icons8-dashboard-colours/icons8-modifier-25.png"))); // NOI18N
        modifier_produit.setText("Modifier un produit");
        modifier_produit.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        modifier_produit.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        modifier_produit.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        modifier_produit.setIconTextGap(5);
        modifier_produit.setRadius(18);
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

        ajout_categorie.setBackground(new java.awt.Color(0, 169, 54));
        ajout_categorie.setForeground(new java.awt.Color(51, 51, 51));
        ajout_categorie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/produitbio/icons8-dashboard-colours/icons8-plus-25.png"))); // NOI18N
        ajout_categorie.setText("Ajouter une catégorie");
        ajout_categorie.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        ajout_categorie.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ajout_categorie.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        ajout_categorie.setIconTextGap(5);
        ajout_categorie.setRadius(18);
        ajout_categorie.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ajout_categorieMouseClicked(evt);
            }
        });
        ajout_categorie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajout_categorieActionPerformed(evt);
            }
        });

        liste_produit.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(liste_produit);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(ajout_produit, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(supprimer_produit, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(modifier_produit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(112, 112, 112)
                        .addComponent(ajout_categorie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1065, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 984, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(322, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(supprimer_produit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ajout_produit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modifier_produit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ajout_categorie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))))
        );

        jPanel2.add(jPanel5, java.awt.BorderLayout.PAGE_START);

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void supprimer_produitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supprimer_produitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_supprimer_produitActionPerformed

    private void supprimer_produitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supprimer_produitMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_supprimer_produitMouseClicked

    private void ajout_produitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ajout_produitMouseClicked
        new Nouveau_produit().setVisible(true);
    }//GEN-LAST:event_ajout_produitMouseClicked

    private void modifier_produitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modifier_produitMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_modifier_produitMouseClicked

    private void modifier_produitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifier_produitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modifier_produitActionPerformed

    private void ajout_categorieMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ajout_categorieMouseClicked
        new Categorie_Produit().setVisible(true);
    }//GEN-LAST:event_ajout_categorieMouseClicked

    private void ajout_categorieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajout_categorieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ajout_categorieActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private produitbio.Button_perso ajout_categorie;
    private produitbio.Button_perso ajout_produit;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable liste_produit;
    private javax.swing.JTable liste_user_table;
    private produitbio.Button_perso modifier_produit;
    private produitbio.Button_perso supprimer_produit;
    // End of variables declaration//GEN-END:variables
    Connection co;
    Statement st;
    ResultSet resultat;
    DefaultTableModel dtm = new DefaultTableModel();

}

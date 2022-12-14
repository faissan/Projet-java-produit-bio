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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author AISSAN Francois
 */
public class Liste_Clients extends javax.swing.JPanel {

    /**
     * Creates new form Liste_utilisateurs
     */
    public Liste_Clients() throws SQLException {
        initComponents();
        Font police = new Font("Yu Gothic UI Semilight", Font.BOLD, 16);
        liste_client_table.getTableHeader().setFont(police);
        dtm.addColumn("Ref");
        dtm.addColumn("Nom et Prénom");
        dtm.addColumn("Email");
        dtm.addColumn("Téléphone");
        //dtm.addColumn("Profil");
        
        connexionDB();
        resultat = st.executeQuery("SELECT ref_client, nom_prenoms_client,email_client,telephone_client FROM client");
        while(resultat.next())
        {
            dtm.addRow(new Object[]{resultat.getObject(1),resultat.getObject(2),resultat.getObject(3),resultat.getObject(4)});
        }
        liste_client_table.setModel(dtm);        
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
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        essai = new javax.swing.JPanel();
        ajout_user = new produitbio.Button_perso();
        supprimer = new produitbio.Button_perso();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        liste_client_table = new javax.swing.JTable();

        setBackground(new java.awt.Color(217, 217, 217));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(217, 217, 217));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel5.setBackground(new java.awt.Color(217, 217, 217));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Liste des clients");

        essai.setBackground(new java.awt.Color(217, 217, 217));
        essai.setToolTipText("");

        javax.swing.GroupLayout essaiLayout = new javax.swing.GroupLayout(essai);
        essai.setLayout(essaiLayout);
        essaiLayout.setHorizontalGroup(
            essaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1010, Short.MAX_VALUE)
        );
        essaiLayout.setVerticalGroup(
            essaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        ajout_user.setBackground(new java.awt.Color(0, 169, 54));
        ajout_user.setForeground(new java.awt.Color(51, 51, 51));
        ajout_user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/produitbio/icons8-dashboard-colours/icons8-plus-25.png"))); // NOI18N
        ajout_user.setText("Ajouter");
        ajout_user.setBorderColor(new java.awt.Color(0, 169, 54));
        ajout_user.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        ajout_user.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ajout_user.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        ajout_user.setIconTextGap(5);
        ajout_user.setRadius(18);
        ajout_user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ajout_userMouseClicked(evt);
            }
        });
        ajout_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajout_userActionPerformed(evt);
            }
        });

        supprimer.setBackground(new java.awt.Color(255, 102, 102));
        supprimer.setForeground(new java.awt.Color(51, 51, 51));
        supprimer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/produitbio/icons8-dashboard-colours/icons8-supprimer-pour-toujours-25.png"))); // NOI18N
        supprimer.setText("Supprimer");
        supprimer.setBorderColor(new java.awt.Color(255, 102, 102));
        supprimer.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        supprimer.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        supprimer.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        supprimer.setIconTextGap(5);
        supprimer.setRadius(18);
        supprimer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                supprimerMouseClicked(evt);
            }
        });
        supprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supprimerActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(217, 217, 217));

        liste_client_table.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        liste_client_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(liste_client_table);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1090, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(ajout_user, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(supprimer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(130, 130, 130)
                                .addComponent(essai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1065, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 1092, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(essai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ajout_user, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(supprimer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)))
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        jPanel2.add(jPanel5, java.awt.BorderLayout.PAGE_START);

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void supprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supprimerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_supprimerActionPerformed

    private void supprimerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supprimerMouseClicked
        if(JOptionPane.showConfirmDialog(null, "Voulez-vous supprimer?", "SUPPRESSION",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
            try {
               Class.forName("com.mysql.jdbc.Driver").newInstance();
                Connection co = DriverManager.getConnection("jdbc:mysql://localhost/biomarket?characterEncoding=utf-8","root","");
                //Recupération de la référence du produit à supprimer dans la table
                DefaultTableModel dt = (DefaultTableModel)liste_client_table.getModel();
                //Ligne sélectionnée
                int rowindex = liste_client_table.getSelectedRow();
                //Référence se trouve sur la colonne 0, ligne selectionnée
                String login_a_supprimer =(String) liste_client_table.getValueAt(rowindex,0);  
                //Requete de suppression du produit
                String sql_req = "Delete from utilisateur where login_utilisateur='"+login_a_supprimer+"'";
                //Création de l'objet statement
                st = co.createStatement();
                //Exécution de la requête
                st.executeUpdate(sql_req);
                //fermeture de la connexion
                co.close();
                //Suppression de la ligne de la table
                dt.removeRow(rowindex);
                //Message de suppression
                JOptionPane.showMessageDialog(null, "Données supprimées");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Problème de suppression");
            }
        }
    }//GEN-LAST:event_supprimerMouseClicked

    private void ajout_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajout_userActionPerformed
        //this.dispose();
    }//GEN-LAST:event_ajout_userActionPerformed

    private void ajout_userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ajout_userMouseClicked
        new Nouveau_Client().setVisible(true);
    }//GEN-LAST:event_ajout_userMouseClicked
    private void connexionDB() {                                        
        try {
                //connexion à la base de données
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                    co = DriverManager.getConnection("jdbc:mysql://localhost/biomarket?characterEncoding=utf-8","root","");
                    st = co.createStatement();
                    } catch (Exception e) {
            System.out.println("ERROR");
        }
    } 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private produitbio.Button_perso ajout_user;
    private javax.swing.JPanel essai;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable liste_client_table;
    private produitbio.Button_perso supprimer;
    // End of variables declaration//GEN-END:variables
    Connection co;
    Statement st;
    ResultSet resultat;
    DefaultTableModel dtm = new DefaultTableModel();

}

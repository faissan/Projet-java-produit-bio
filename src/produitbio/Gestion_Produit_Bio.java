/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package produitbio;

import java.awt.Color;
import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author AISSAN Francois
 */
public class Gestion_Produit_Bio extends javax.swing.JFrame {

    /**
     * Creates new form gestion_produit_bio
     */
    public Gestion_Produit_Bio() {
        initComponents();
        Image img = new ImageIcon(this.getClass().getResource("logo_bket.png")).getImage();
        this.setIconImage(img);
        //Chargement du tableau de bord
        content_view_layout.removeAll();
        content_view_layout.add(new Tableau_de_bord());
        //Activation du bouton de tableau de bord
        
        tableau_de_bord.setBackground(colorbgnew);
        
        //Changement des autres boutons
        
        gestion_user.setBackground(colorbgold);       
        gestion_produit.setBackground(colorbgold);        
        gestion_client.setBackground(colorbgold);        
        gestion_ventes.setBackground(colorbgold);       
        gestion_fournisseurs.setBackground(colorbgold);
        parametre.setBackground(colorbgold);
        
        pack();
         
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
        Menu_layout = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        tableau_de_bord = new produitbio.Button_perso();
        gestion_user = new produitbio.Button_perso();
        gestion_produit = new produitbio.Button_perso();
        gestion_fournisseurs = new produitbio.Button_perso();
        gestion_ventes = new produitbio.Button_perso();
        gestion_client = new produitbio.Button_perso();
        jLabel4 = new javax.swing.JLabel();
        parametre = new produitbio.Button_perso();
        gestion_fournisseurs2 = new produitbio.Button_perso();
        jPanel3 = new javax.swing.JPanel();
        Menu_recherche_layout = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        content_dash_layout = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        footer_layout = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        content_view_layout = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(217, 217, 217));
        jPanel1.setLayout(new java.awt.BorderLayout());

        Menu_layout.setBackground(new java.awt.Color(217, 217, 217));
        Menu_layout.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        Menu_layout.setPreferredSize(new java.awt.Dimension(290, 821));

        jPanel5.setBackground(new java.awt.Color(217, 217, 217));

        tableau_de_bord.setBackground(new java.awt.Color(204, 204, 204));
        tableau_de_bord.setForeground(new java.awt.Color(51, 51, 51));
        tableau_de_bord.setIcon(new javax.swing.ImageIcon(getClass().getResource("/produitbio/icons8-dashboard-colours/icons8-dashboard-25.png"))); // NOI18N
        tableau_de_bord.setText("Tableau de bord");
        tableau_de_bord.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        tableau_de_bord.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tableau_de_bord.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        tableau_de_bord.setIconTextGap(5);
        tableau_de_bord.setRadius(18);
        tableau_de_bord.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableau_de_bordMouseClicked(evt);
            }
        });
        tableau_de_bord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tableau_de_bordActionPerformed(evt);
            }
        });

        gestion_user.setBackground(new java.awt.Color(204, 204, 204));
        gestion_user.setForeground(new java.awt.Color(51, 51, 51));
        gestion_user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/produitbio/icons8-dashboard-colours/icons8-users-25.png"))); // NOI18N
        gestion_user.setText("Gestion des utilisateurs");
        gestion_user.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        gestion_user.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        gestion_user.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        gestion_user.setIconTextGap(5);
        gestion_user.setRadius(18);
        gestion_user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gestion_userMouseClicked(evt);
            }
        });
        gestion_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gestion_userActionPerformed(evt);
            }
        });

        gestion_produit.setBackground(new java.awt.Color(204, 204, 204));
        gestion_produit.setForeground(new java.awt.Color(51, 51, 51));
        gestion_produit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/produitbio/icons8-dashboard-colours/iconsproduit-25.png"))); // NOI18N
        gestion_produit.setText("Gestion des produits");
        gestion_produit.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        gestion_produit.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        gestion_produit.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        gestion_produit.setIconTextGap(5);
        gestion_produit.setRadius(18);
        gestion_produit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gestion_produitMouseClicked(evt);
            }
        });
        gestion_produit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gestion_produitActionPerformed(evt);
            }
        });

        gestion_fournisseurs.setBackground(new java.awt.Color(204, 204, 204));
        gestion_fournisseurs.setForeground(new java.awt.Color(51, 51, 51));
        gestion_fournisseurs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/produitbio/icons8-dashboard-colours/icons8-fournisseur-de-données-25.png"))); // NOI18N
        gestion_fournisseurs.setText("Gestion des fournisseurs");
        gestion_fournisseurs.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        gestion_fournisseurs.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        gestion_fournisseurs.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        gestion_fournisseurs.setIconTextGap(5);
        gestion_fournisseurs.setRadius(18);
        gestion_fournisseurs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gestion_fournisseursMouseClicked(evt);
            }
        });
        gestion_fournisseurs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gestion_fournisseursActionPerformed(evt);
            }
        });

        gestion_ventes.setBackground(new java.awt.Color(204, 204, 204));
        gestion_ventes.setForeground(new java.awt.Color(51, 51, 51));
        gestion_ventes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/produitbio/icons8-dashboard-colours/icons8-ventes-totales-25.png"))); // NOI18N
        gestion_ventes.setText("Gestion des ventes");
        gestion_ventes.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        gestion_ventes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        gestion_ventes.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        gestion_ventes.setIconTextGap(5);
        gestion_ventes.setRadius(18);
        gestion_ventes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gestion_ventesMouseClicked(evt);
            }
        });
        gestion_ventes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gestion_ventesActionPerformed(evt);
            }
        });

        gestion_client.setBackground(new java.awt.Color(204, 204, 204));
        gestion_client.setForeground(new java.awt.Color(51, 51, 51));
        gestion_client.setIcon(new javax.swing.ImageIcon(getClass().getResource("/produitbio/icons8-dashboard-colours/icons8client25.png"))); // NOI18N
        gestion_client.setText("Gestion des clients");
        gestion_client.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        gestion_client.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        gestion_client.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        gestion_client.setIconTextGap(5);
        gestion_client.setRadius(18);
        gestion_client.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gestion_clientMouseClicked(evt);
            }
        });
        gestion_client.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gestion_clientActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(tableau_de_bord, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gestion_produit, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gestion_client, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gestion_user, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gestion_ventes, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gestion_fournisseurs, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {gestion_client, gestion_fournisseurs, gestion_produit, gestion_user, gestion_ventes, tableau_de_bord});

        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tableau_de_bord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(gestion_produit, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(gestion_client, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(gestion_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(gestion_ventes, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(gestion_fournisseurs, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel5Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {gestion_client, gestion_fournisseurs, gestion_produit, gestion_user, gestion_ventes, tableau_de_bord});

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 50)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 169, 54));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Bket.");
        jLabel4.setName(""); // NOI18N

        parametre.setBackground(new java.awt.Color(204, 204, 204));
        parametre.setForeground(new java.awt.Color(51, 51, 51));
        parametre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/produitbio/icons8-dashboard-colours/icons8-paramètres-25.png"))); // NOI18N
        parametre.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        parametre.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        parametre.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        parametre.setIconTextGap(0);
        parametre.setRadius(60);
        parametre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                parametreMouseClicked(evt);
            }
        });

        gestion_fournisseurs2.setBackground(new java.awt.Color(51, 204, 0));
        gestion_fournisseurs2.setForeground(new java.awt.Color(51, 51, 51));
        gestion_fournisseurs2.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        gestion_fournisseurs2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        gestion_fournisseurs2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        gestion_fournisseurs2.setIconTextGap(0);
        gestion_fournisseurs2.setRadius(60);

        javax.swing.GroupLayout Menu_layoutLayout = new javax.swing.GroupLayout(Menu_layout);
        Menu_layout.setLayout(Menu_layoutLayout);
        Menu_layoutLayout.setHorizontalGroup(
            Menu_layoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Menu_layoutLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Menu_layoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Menu_layoutLayout.createSequentialGroup()
                        .addComponent(gestion_fournisseurs2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
            .addGroup(Menu_layoutLayout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(parametre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Menu_layoutLayout.setVerticalGroup(
            Menu_layoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Menu_layoutLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(Menu_layoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gestion_fournisseurs2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(52, 52, 52)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 265, Short.MAX_VALUE)
                .addComponent(parametre, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(Menu_layout, java.awt.BorderLayout.LINE_START);

        jPanel3.setLayout(new java.awt.BorderLayout());

        Menu_recherche_layout.setBackground(new java.awt.Color(153, 153, 153));
        Menu_recherche_layout.setPreferredSize(new java.awt.Dimension(1040, 40));
        Menu_recherche_layout.setLayout(new java.awt.BorderLayout());

        jPanel6.setLayout(new java.awt.GridLayout(1, 0));
        Menu_recherche_layout.add(jPanel6, java.awt.BorderLayout.CENTER);

        jPanel7.setLayout(new java.awt.GridLayout(1, 0));
        Menu_recherche_layout.add(jPanel7, java.awt.BorderLayout.CENTER);

        jPanel8.setLayout(new java.awt.GridLayout(1, 0));
        Menu_recherche_layout.add(jPanel8, java.awt.BorderLayout.CENTER);

        jPanel11.setLayout(new java.awt.GridLayout(1, 0));
        Menu_recherche_layout.add(jPanel11, java.awt.BorderLayout.CENTER);

        jPanel9.setLayout(new java.awt.GridLayout(1, 0));
        Menu_recherche_layout.add(jPanel9, java.awt.BorderLayout.CENTER);

        jPanel15.setLayout(new java.awt.BorderLayout());

        jPanel12.setBackground(new java.awt.Color(217, 217, 217));
        jPanel12.setPreferredSize(new java.awt.Dimension(300, 22));
        jPanel12.setLayout(new java.awt.GridBagLayout());

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Bienvenue, ");
        jPanel12.add(jLabel2, new java.awt.GridBagConstraints());

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Francois AISSAN");
        jPanel12.add(jLabel3, new java.awt.GridBagConstraints());

        jPanel15.add(jPanel12, java.awt.BorderLayout.LINE_START);

        jPanel4.setLayout(new java.awt.BorderLayout());

        jPanel14.setPreferredSize(new java.awt.Dimension(400, 0));
        jPanel14.setLayout(new java.awt.BorderLayout());

        jTextField1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel14.add(jTextField1, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel14, java.awt.BorderLayout.LINE_START);

        jPanel13.setLayout(null);
        jPanel4.add(jPanel13, java.awt.BorderLayout.CENTER);

        jPanel15.add(jPanel4, java.awt.BorderLayout.CENTER);

        Menu_recherche_layout.add(jPanel15, java.awt.BorderLayout.CENTER);

        jPanel3.add(Menu_recherche_layout, java.awt.BorderLayout.PAGE_START);

        content_dash_layout.setLayout(new java.awt.BorderLayout());

        jPanel2.setLayout(new java.awt.BorderLayout());

        footer_layout.setBackground(new java.awt.Color(217, 217, 217));
        footer_layout.setPreferredSize(new java.awt.Dimension(1040, 25));
        footer_layout.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("@ Powered By Bio Market");
        footer_layout.add(jLabel1, new java.awt.GridBagConstraints());

        jPanel2.add(footer_layout, java.awt.BorderLayout.PAGE_END);

        content_view_layout.setBackground(new java.awt.Color(217, 217, 217));
        content_view_layout.setLayout(new java.awt.BorderLayout());
        jPanel2.add(content_view_layout, java.awt.BorderLayout.CENTER);

        content_dash_layout.add(jPanel2, java.awt.BorderLayout.CENTER);

        jPanel3.add(content_dash_layout, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel3, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tableau_de_bordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tableau_de_bordActionPerformed
       
    }//GEN-LAST:event_tableau_de_bordActionPerformed

    private void gestion_clientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gestion_clientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gestion_clientActionPerformed

    private void gestion_produitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gestion_produitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gestion_produitActionPerformed

    private void gestion_ventesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gestion_ventesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gestion_ventesActionPerformed

    private void gestion_fournisseursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gestion_fournisseursActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gestion_fournisseursActionPerformed

    private void gestion_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gestion_userActionPerformed
        
    }//GEN-LAST:event_gestion_userActionPerformed

    private void tableau_de_bordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableau_de_bordMouseClicked

        tableau_de_bord.setBackground(colorbgnew);
        
        //Changement des autres boutons
        
        gestion_user.setBackground(colorbgold);       
        gestion_produit.setBackground(colorbgold);        
        gestion_client.setBackground(colorbgold);        
        gestion_ventes.setBackground(colorbgold);       
        gestion_fournisseurs.setBackground(colorbgold);
        parametre.setBackground(colorbgold);
        
        //Chargement du tableau de bord
        content_view_layout.removeAll();
        content_view_layout.add(new Tableau_de_bord());
        pack();
    }//GEN-LAST:event_tableau_de_bordMouseClicked

    private void gestion_userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gestion_userMouseClicked
        gestion_user.setBackground(colorbgnew);
        
        //Changement des autres boutons
        tableau_de_bord.setBackground(colorbgold);        
        gestion_produit.setBackground(colorbgold);        
        gestion_client.setBackground(colorbgold);        
        gestion_ventes.setBackground(colorbgold);        
        gestion_fournisseurs.setBackground(colorbgold);        
        parametre.setBackground(colorbgold);
        
        //Enlever toutes les fenetres actives avant d'afficher la fenetres courante
        content_view_layout.removeAll();
        
        Liste_utilisateurs jpanel_liste_user = new Liste_utilisateurs();
        
        //Affichage du jpanel dans le content_view_layout
        content_view_layout.add(jpanel_liste_user);
        
        pack();
    }//GEN-LAST:event_gestion_userMouseClicked

    private void gestion_produitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gestion_produitMouseClicked
        gestion_produit.setBackground(colorbgnew);
        
        //Changement des autres boutons
        
        gestion_user.setBackground(colorbgold);       
        tableau_de_bord.setBackground(colorbgold);        
        gestion_client.setBackground(colorbgold);        
        gestion_ventes.setBackground(colorbgold);       
        gestion_fournisseurs.setBackground(colorbgold);
        parametre.setBackground(colorbgold);
        
        //Enlever toutes les fenetres actives avant d'afficher la fenetres courante
        content_view_layout.removeAll();
        content_view_layout.add(new Liste_produit());
        //Reactualiser l'affichage
        //revalidate();
        pack();

    }//GEN-LAST:event_gestion_produitMouseClicked

    private void gestion_clientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gestion_clientMouseClicked
        gestion_client.setBackground(colorbgnew);
        
        //Changement des autres boutons
        
        gestion_user.setBackground(colorbgold);       
        tableau_de_bord.setBackground(colorbgold);        
        gestion_produit.setBackground(colorbgold);        
        gestion_ventes.setBackground(colorbgold);       
        gestion_fournisseurs.setBackground(colorbgold);
        parametre.setBackground(colorbgold);
        
        //Enlever toutes les fenetres actives avant d'afficher la fenetres courante
        content_view_layout.removeAll();
        
        //Reactualiser l'affichage
        pack();
    }//GEN-LAST:event_gestion_clientMouseClicked

    private void gestion_ventesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gestion_ventesMouseClicked
        gestion_ventes.setBackground(colorbgnew);
        
        //Changement des autres boutons
        
        gestion_user.setBackground(colorbgold);       
        tableau_de_bord.setBackground(colorbgold);        
        gestion_produit.setBackground(colorbgold);        
        gestion_client.setBackground(colorbgold);       
        gestion_fournisseurs.setBackground(colorbgold);
        parametre.setBackground(colorbgold);
        
        //Enlever toutes les fenetres actives avant d'afficher la fenetres courante
        content_view_layout.removeAll();
        
        
        //Reactualiser l'affichage
        pack();
        
    }//GEN-LAST:event_gestion_ventesMouseClicked

    private void gestion_fournisseursMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gestion_fournisseursMouseClicked
        gestion_fournisseurs.setBackground(colorbgnew);
        
        //Changement des autres boutons
        
        gestion_user.setBackground(colorbgold);       
        tableau_de_bord.setBackground(colorbgold);        
        gestion_produit.setBackground(colorbgold);        
        gestion_client.setBackground(colorbgold);       
        gestion_ventes.setBackground(colorbgold);
        parametre.setBackground(colorbgold);
        
        //Enlever toutes les fenetres actives avant d'afficher la fenetres courante
        content_view_layout.removeAll();
        
        //Code de LIONNEL
        
        //Reactualiser l'affichage
        pack();        
    }//GEN-LAST:event_gestion_fournisseursMouseClicked

    private void parametreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_parametreMouseClicked
        parametre.setBackground(colorbgnew);
        
        //Changement des autres boutons
        
        gestion_user.setBackground(colorbgold);       
        tableau_de_bord.setBackground(colorbgold);        
        gestion_produit.setBackground(colorbgold);        
        gestion_client.setBackground(colorbgold);       
        gestion_ventes.setBackground(colorbgold);
        gestion_fournisseurs.setBackground(colorbgold);
        
        //Enlever toutes les fenetres actives avant d'afficher la fenetres courante
        content_view_layout.removeAll();
        
        
        //Reactualiser l'affichage
        pack();
    }//GEN-LAST:event_parametreMouseClicked

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
            java.util.logging.Logger.getLogger(Gestion_Produit_Bio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gestion_Produit_Bio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gestion_Produit_Bio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gestion_Produit_Bio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gestion_Produit_Bio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Menu_layout;
    private javax.swing.JPanel Menu_recherche_layout;
    private javax.swing.JPanel content_dash_layout;
    private javax.swing.JPanel content_view_layout;
    private javax.swing.JPanel footer_layout;
    private produitbio.Button_perso gestion_client;
    private produitbio.Button_perso gestion_fournisseurs;
    private produitbio.Button_perso gestion_fournisseurs2;
    private produitbio.Button_perso gestion_produit;
    private produitbio.Button_perso gestion_user;
    private produitbio.Button_perso gestion_ventes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField jTextField1;
    private produitbio.Button_perso parametre;
    private produitbio.Button_perso tableau_de_bord;
    // End of variables declaration//GEN-END:variables
    //Variables personnelles
    Color colorbgnew =new Color(0,169,54);
    Color colorbgold =new Color(217,217,217);
    
    // Liste_utilisateurs
    Connection co;
    Statement st;
    ResultSet rs;

}
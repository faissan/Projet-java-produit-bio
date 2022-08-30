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
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author AISSAN Francois
 */
public class Tableau_de_bord extends javax.swing.JPanel {

    /**
     * Creates new form Tableau_de_bord
     */
    public Tableau_de_bord() {
        initComponents();
        
        try {
                //connexion à la base de données
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                co = DriverManager.getConnection("jdbc:mysql://localhost/biomarket?characterEncoding=utf-8","root","");
                st = co.createStatement();

                //Affichage du total des recettes
                rs = st.executeQuery("SELECT SUM(montant_net)as somme FROM vente");
                while(rs.next())
                {
                    double somme_vente = rs.getDouble("somme");
                    vente_effectuees.setText(String.format("%,.2f", somme_vente));
                }
                
                //Affichage du total des clients
                rs = st.executeQuery("SELECT COUNT(*)as nombre FROM client");
                while(rs.next())
                {
                    int nombre_total_client = rs.getInt("nombre");
                    nombre_client.setText(""+nombre_total_client);
                }
                                
                //Affichage du total des ventes
                rs = st.executeQuery("SELECT COUNT(*)as nombre FROM vente");
                while(rs.next())
                {
                    int nombre_total_vente = rs.getInt("nombre");
                    nombre_vente.setText(""+nombre_total_vente);
                }
                
                //Produits en rupture de stock              
                Font myFont2 = new Font("Yu Gothic UI Semilight", Font.BOLD, 12);
                liste_produit_a_reapprovisionner.getTableHeader().setFont(myFont2);
                dtm.addColumn("N°");
                dtm.addColumn("Référence");
                dtm.addColumn("Designation");
                dtm.addColumn("Quantité restante");
                dtm.addColumn("Quantité alerte");

                rs = st.executeQuery("SELECT ref_produit,lib_produit,quantite,quantite_alerte FROM produit WHERE quantite_alerte > quantite");
                int compteur =1;
                while(rs.next())
                {
                    dtm.addRow(new Object[]{compteur,rs.getObject(1),rs.getObject(2),rs.getObject(3),rs.getObject(4)});
                    compteur ++;
                }
                liste_produit_a_reapprovisionner.setModel(dtm);
                // fin                                       
                //Produits mieux vendus              
                liste_produit_mieux_vendus.getTableHeader().setFont(myFont2);
                dtm1.addColumn("N° d'ordre");
                dtm1.addColumn("Désignation");
                dtm1.addColumn("Quantité vendues");
                rs = st.executeQuery("SELECT ref_prod,SUM(qte) AS somme FROM produits_vendus GROUP BY ref_prod ORDER BY somme DESC");
                int compteur1 =1;
                while(rs.next())
                {
                    dtm1.addRow(new Object[]{compteur1,rs.getObject(1),rs.getObject(2)});
                    compteur1++;
                }
                liste_produit_mieux_vendus.setModel(dtm1);
                // fin 
                
                //Liste des produits avariés/ requete sql select * FROM produit WHERE str_to_date(date_expiration,'%d/%m/%Y')<CURRENT_DATE;
                liste_produit_a_avaries.getTableHeader().setBackground(colorbgnew);
                liste_produit_a_avaries.getTableHeader().setFont(myFont2);
                dtm2.addColumn("N°");
                dtm2.addColumn("Désignation");
                dtm2.addColumn("Date de production");
                dtm2.addColumn("Date d'expiration");
                dtm2.addColumn("Quantité restante");
                rs = st.executeQuery("select * FROM produit WHERE str_to_date(date_expiration,'%d/%m/%Y')<CURRENT_DATE;");
                int compteur2 =1;
                while(rs.next())
                {
                    dtm2.addRow(new Object[]{compteur2,rs.getObject(1),rs.getObject(2),rs.getObject(3),rs.getObject(4),rs.getObject(5)});
                    compteur2++;
                }
                liste_produit_a_avaries.setModel(dtm2);     
            } catch (Exception e) 
            {

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
        recette_pan = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        vente_effectuees = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        vente_pan = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        nombre_vente = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        client_pan = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        nombre_client = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        liste_produit_a_reapprovisionner = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        liste_produit_mieux_vendus = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        liste_produit_a_avaries = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(217, 217, 217));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        recette_pan.setBackground(new java.awt.Color(255, 255, 255));
        recette_pan.setLayout(new javax.swing.BoxLayout(recette_pan, javax.swing.BoxLayout.LINE_AXIS));

        jPanel7.setBackground(new java.awt.Color(0, 204, 0));
        jPanel7.setPreferredSize(new java.awt.Dimension(94, 90));
        jPanel7.setLayout(null);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/produitbio/icons8-dashboard-colours/money.png"))); // NOI18N
        jPanel7.add(jLabel3);
        jLabel3.setBounds(40, 30, 80, 80);

        recette_pan.add(jPanel7);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setPreferredSize(new java.awt.Dimension(191, 160));

        vente_effectuees.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        vente_effectuees.setForeground(new java.awt.Color(0, 153, 51));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel2.setText("RECETTES");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 135, Short.MAX_VALUE))
                    .addComponent(vente_effectuees, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(vente_effectuees, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        recette_pan.add(jPanel8);
        jPanel8.getAccessibleContext().setAccessibleName("");

        jPanel1.add(recette_pan);

        vente_pan.setBackground(new java.awt.Color(255, 255, 255));
        vente_pan.setLayout(new javax.swing.BoxLayout(vente_pan, javax.swing.BoxLayout.LINE_AXIS));

        jPanel13.setBackground(new java.awt.Color(0, 204, 0));
        jPanel13.setPreferredSize(new java.awt.Dimension(94, 90));
        jPanel13.setLayout(null);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/produitbio/icons8-dashboard-colours/icons8-sell-60.png"))); // NOI18N
        jPanel13.add(jLabel6);
        jLabel6.setBounds(50, 30, 70, 70);

        vente_pan.add(jPanel13);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setPreferredSize(new java.awt.Dimension(191, 89));

        nombre_vente.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        nombre_vente.setForeground(new java.awt.Color(0, 153, 51));

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel7.setText("NOMBRE DE VENTES");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 42, Short.MAX_VALUE))
                    .addComponent(nombre_vente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nombre_vente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addContainerGap())
        );

        vente_pan.add(jPanel14);

        jPanel1.add(vente_pan);

        client_pan.setBackground(new java.awt.Color(255, 255, 255));
        client_pan.setLayout(new javax.swing.BoxLayout(client_pan, javax.swing.BoxLayout.LINE_AXIS));

        jPanel10.setBackground(new java.awt.Color(0, 204, 0));
        jPanel10.setPreferredSize(new java.awt.Dimension(94, 90));
        jPanel10.setLayout(null);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/produitbio/icons8-dashboard-colours/icons8-connaissance-client-60.png"))); // NOI18N
        jPanel10.add(jLabel4);
        jLabel4.setBounds(40, 30, 60, 60);

        client_pan.add(jPanel10);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setPreferredSize(new java.awt.Dimension(191, 89));
        jPanel11.setLayout(null);

        nombre_client.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        nombre_client.setForeground(new java.awt.Color(0, 153, 51));
        jPanel11.add(nombre_client);
        nombre_client.setBounds(20, 10, 160, 35);

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel5.setText("NOMBRE DE CLIENTS");
        jPanel11.add(jLabel5);
        jLabel5.setBounds(10, 80, 176, 25);

        client_pan.add(jPanel11);

        jPanel1.add(client_pan);

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 44, 1200, 120));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1210, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 530, 1210, 10));

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel8.setText("PRODUITS A REAPPROVISIONNER");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 320, -1));

        liste_produit_a_reapprovisionner.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        liste_produit_a_reapprovisionner.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(liste_produit_a_reapprovisionner);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 580, 230));

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel9.setText("PRODUITS MIEUX VENDUS");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 240, 250, -1));

        liste_produit_mieux_vendus.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        liste_produit_mieux_vendus.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(liste_produit_mieux_vendus);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 270, 580, 230));

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1210, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 1210, 10));

        liste_produit_a_avaries.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        liste_produit_a_avaries.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(liste_produit_a_avaries);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 590, 570, 170));

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel10.setText("PRODUITS AVARIES");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 550, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/produitbio/icons8-dashboard-colours/bioo.jpg"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 590, 570, 170));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel client_pan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable liste_produit_a_avaries;
    private javax.swing.JTable liste_produit_a_reapprovisionner;
    private javax.swing.JTable liste_produit_mieux_vendus;
    private javax.swing.JLabel nombre_client;
    private javax.swing.JLabel nombre_vente;
    private javax.swing.JPanel recette_pan;
    private javax.swing.JLabel vente_effectuees;
    private javax.swing.JPanel vente_pan;
    // End of variables declaration//GEN-END:variables
    ResultSet rs = null;
    Statement st = null;
    Connection co = null;
    DefaultTableModel dtm = new DefaultTableModel();
    DefaultTableModel dtm1 = new DefaultTableModel();
    DefaultTableModel dtm2 = new DefaultTableModel();
    Color colorbgnew =new Color(0,169,54);
}

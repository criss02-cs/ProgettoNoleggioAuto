package progettonoleggioauto;

import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.table.DefaultTableModel;
import model.*;

public class FrameAuto extends javax.swing.JFrame {
    SqlCommand sql;
    public FrameAuto() {
        initComponents();
        this.setTitle("Gestione auto");
    }
    private void caricaComboBox(){
        sql = new SqlCommand();
        ArrayList<Categoria> categorie;
        categorie = sql.selectCategorieComboBox();
        for (Categoria categoria : categorie) {
            cmbCategorie.addItem(categoria.getIdCategoria() + "-" + categoria.getDescrizione());
        }
    }
    private void caricaJTable(){
        sql = new SqlCommand();
        DefaultTableModel tbl = (DefaultTableModel) tblAuto.getModel();
        tbl.setRowCount(0);
        ArrayList<Auto> auto;
        DefaultTableModel dtm = (DefaultTableModel) tblAuto.getModel();
        Object riga[] = new Object[dtm.getColumnCount()];
        auto = sql.selectAuto();
        for (Auto object : auto) {
            riga[0] = object.getTarga();
            riga[1] = object.getMarca();
            riga[2] = object.getModello();
            riga[3] = object.getFkIdCategoria() + "-" + object.getNomeCategoria();
            dtm.addRow(riga);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAuto = new javax.swing.JTable();
        btnIndietro = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtTarga = new javax.swing.JTextField();
        lblTarga = new javax.swing.JLabel();
        lblTarga1 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        lblModello = new javax.swing.JLabel();
        txtModello = new javax.swing.JTextField();
        lblModello1 = new javax.swing.JLabel();
        cmbCategorie = new javax.swing.JComboBox<>();
        btnInserisci = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane1StateChanged(evt);
            }
        });

        tblAuto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Targa", "Marca", "Modello", "Categoria"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblAuto);

        btnIndietro.setText("Torna indietro");
        btnIndietro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIndietroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnIndietro)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(btnIndietro))
        );

        jTabbedPane1.addTab("Visualizza auto", jPanel1);

        lblTarga.setText("Targa");

        lblTarga1.setText("Marca");

        lblModello.setText("Modello");

        lblModello1.setText("Categoria");

        cmbCategorie.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        btnInserisci.setText("Inserisci");
        btnInserisci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserisciActionPerformed(evt);
            }
        });

        btnBack.setText("Torna indietro");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(127, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTarga1)
                            .addComponent(lblTarga))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMarca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTarga, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblModello)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtModello, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblModello1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbCategorie, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(117, 117, 117))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(btnInserisci))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTarga))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTarga1)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblModello)
                    .addComponent(txtModello, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblModello1)
                    .addComponent(cmbCategorie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnInserisci)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Inserisci auto", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnInserisciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserisciActionPerformed
        String targa = txtTarga.getText();
        String marca = txtMarca.getText();
        String modello = txtModello.getText();
        StringTokenizer st = new StringTokenizer(cmbCategorie.getSelectedItem().toString(), "-");
        Integer categoria = Integer.parseInt(st.nextToken());
        sql.inserisciAuto(targa, marca, modello, categoria);
    }//GEN-LAST:event_btnInserisciActionPerformed

    private void jTabbedPane1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane1StateChanged
        caricaJTable();
        caricaComboBox();
    }//GEN-LAST:event_jTabbedPane1StateChanged

    private void btnIndietroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIndietroActionPerformed
        FrameMenu fm = new FrameMenu();
        fm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnIndietroActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        FrameMenu fm = new FrameMenu();
        fm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnIndietro;
    private javax.swing.JButton btnInserisci;
    private javax.swing.JComboBox<String> cmbCategorie;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblModello;
    private javax.swing.JLabel lblModello1;
    private javax.swing.JLabel lblTarga;
    private javax.swing.JLabel lblTarga1;
    private javax.swing.JTable tblAuto;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModello;
    private javax.swing.JTextField txtTarga;
    // End of variables declaration//GEN-END:variables
}

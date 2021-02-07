package progettonoleggioauto;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class FrameCategorie extends javax.swing.JFrame {
    public FrameCategorie() {
        initComponents();
        this.setTitle("Gestione Categorie");
    }

    private void caricaJTable(){
        DefaultTableModel tbl = (DefaultTableModel) tblCategoria.getModel();
        tbl.setRowCount(0);
        Connection c = null;
        ResultSet rec;
        try {
            c = DriverManager.getConnection("jdbc:sqlite:./noleggioauto.db");
            String select = "SELECT * FROM categorie";
            PreparedStatement ps = c.prepareStatement(select);
            rec = ps.executeQuery();
            DefaultTableModel dtm = (DefaultTableModel) tblCategoria.getModel();
            Object riga[] = new Object[dtm.getColumnCount()];
            int i = 0;
            while (rec.next()) {
                riga[0] = rec.getInt(1);
                riga[1] = rec.getString(2);
                riga[2] = rec.getInt(3);
                riga[3] = rec.getInt(4);
                dtm.addRow(riga);
            }
            rec.close();
            ps.close();
            c.close();
        } catch (Exception e) {
            System.out.println("Problemi durante la select, " + e.getMessage());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCategoria = new javax.swing.JTable();
        btnIndietro = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblDescrizione = new javax.swing.JLabel();
        lblNoleggioAlGiorno = new javax.swing.JLabel();
        lblNoleggioAlKm = new javax.swing.JLabel();
        btnInserisci = new javax.swing.JButton();
        txtDescrizione = new javax.swing.JTextField();
        txtNoleggioAlGiorno = new javax.swing.JTextField();
        txtNoleggioAlKm = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane1StateChanged(evt);
            }
        });

        tblCategoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID_Categoria", "Descrizione", "Noleggio al giorno", "Noleggio al km"
            }
        ));
        jScrollPane1.setViewportView(tblCategoria);

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
                .addContainerGap()
                .addComponent(btnIndietro)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 596, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnIndietro)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Visualizza", jPanel1);

        lblDescrizione.setText("Descrizione");

        lblNoleggioAlGiorno.setText("Noleggio al giorno");

        lblNoleggioAlKm.setText("Noleggio al km");

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
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNoleggioAlGiorno)
                            .addComponent(lblDescrizione)
                            .addComponent(lblNoleggioAlKm))
                        .addGap(63, 63, 63)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNoleggioAlKm, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDescrizione, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNoleggioAlGiorno, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(btnInserisci))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack)))
                .addContainerGap(274, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDescrizione)
                    .addComponent(txtDescrizione, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNoleggioAlGiorno)
                    .addComponent(txtNoleggioAlGiorno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNoleggioAlKm)
                    .addComponent(txtNoleggioAlKm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addComponent(btnInserisci)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBack)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Inserisci", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnInserisciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserisciActionPerformed
        String descrizione = txtDescrizione.getText();
        Integer noleggioAlGiorno = Integer.parseInt(txtNoleggioAlGiorno.getText());
        Integer noleggioAlKm = Integer.parseInt(txtNoleggioAlKm.getText());
        Connection c = null;
        try {
            c = DriverManager.getConnection("jdbc:sqlite:./noleggioauto.db");
            String insert = "INSERT INTO categorie (descrizione, noleggioAlGiorno, noleggioAlChilometro) values (?,?,?)";
            PreparedStatement ps = c.prepareStatement(insert);
            ps.setString(1, descrizione);
            ps.setInt(2, noleggioAlGiorno);
            ps.setInt(3, noleggioAlKm);
            ps.executeUpdate();
            ps.close();
            c.close();
        } catch (Exception e) {
            System.out.println(e.getClass().getName() + ": " + e.getMessage());
        }
    }//GEN-LAST:event_btnInserisciActionPerformed

    private void jTabbedPane1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane1StateChanged
        caricaJTable();
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblDescrizione;
    private javax.swing.JLabel lblNoleggioAlGiorno;
    private javax.swing.JLabel lblNoleggioAlKm;
    private javax.swing.JTable tblCategoria;
    private javax.swing.JTextField txtDescrizione;
    private javax.swing.JTextField txtNoleggioAlGiorno;
    private javax.swing.JTextField txtNoleggioAlKm;
    // End of variables declaration//GEN-END:variables
}

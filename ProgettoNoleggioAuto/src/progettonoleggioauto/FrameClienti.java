package progettonoleggioauto;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.*;

public class FrameClienti extends javax.swing.JFrame {
    SqlCommand sql;
    public FrameClienti() {
        initComponents();
        this.setTitle("Gestione clienti");
    }
    private void caricaJTable(){
        sql = new SqlCommand();
        DefaultTableModel tbl = (DefaultTableModel) tblClienti.getModel();
        tbl.setRowCount(0);
        ArrayList<Cliente> clienti;
        DefaultTableModel dtm = (DefaultTableModel) tblClienti.getModel();
        Object riga[] = new Object[dtm.getColumnCount()];
        clienti = sql.selectClienti();
        for (Cliente object : clienti) {
            riga[0] = object.getIdCliente();
            riga[1] = object.getNome();
            riga[2] = object.getNome();
            riga[3] = object.getNoleggioAlKm();
            riga[4] = new SimpleDateFormat("dd-MM-yyy").format(object.getDataN());
            riga[5] = object.getnPatente();
            dtm.addRow(riga);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClienti = new javax.swing.JTable();
        btnIndietro = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtNome = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        lblCognome = new javax.swing.JLabel();
        txtCognome = new javax.swing.JTextField();
        lblNoleggioAlKm = new javax.swing.JLabel();
        lblModello1 = new javax.swing.JLabel();
        btnInserisci = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        spnNoleggio = new javax.swing.JSpinner();
        dcDataNascita = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        txtNumeroPatente = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane1StateChanged(evt);
            }
        });

        tblClienti.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Cliente", "Nome", "Cognome", "Noleggio Al Km", "Data Nascita", "Numero Patente"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
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
        tblClienti.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClientiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblClienti);

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
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 655, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(btnIndietro))
        );

        jTabbedPane1.addTab("Visualizza clienti", jPanel1);

        lblNome.setText("Nome");

        lblCognome.setText("Cognome");

        lblNoleggioAlKm.setText("Noleggio al Km");

        lblModello1.setText("Data Nascita");

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

        jLabel1.setText("Numero Patente");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNoleggioAlKm)
                            .addComponent(lblCognome)
                            .addComponent(lblNome)
                            .addComponent(jLabel1)
                            .addComponent(lblModello1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(spnNoleggio, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNumeroPatente, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dcDataNascita, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                            .addComponent(txtCognome)
                            .addComponent(txtNome))))
                .addGap(129, 129, 129))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(281, 281, 281)
                .addComponent(btnInserisci)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNome))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCognome)
                    .addComponent(txtCognome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNoleggioAlKm)
                    .addComponent(spnNoleggio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblModello1)
                    .addComponent(dcDataNascita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNumeroPatente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnInserisci)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Inserisci clienti", jPanel2);

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
        String nome = txtNome.getText();
        String cognome = txtCognome.getText();
        Integer noleggio = Integer.parseInt(spnNoleggio.getValue().toString());
        String dataNascita = new SimpleDateFormat("yyyy-MM-dd").format(dcDataNascita.getDate());
        //Date dataNascita = dcDataNascita.getDate();
        Integer nPatente = Integer.parseInt(txtNumeroPatente.getText());
        //Converto la data da stringa a oggetto sql.Date
        java.sql.Date dN = java.sql.Date.valueOf(dataNascita);
        sql.inserisciClienti(nome, cognome, noleggio, dN, nPatente);
        JOptionPane.showMessageDialog(null, "Inserimento avvenuto con successo");
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

    private void tblClientiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClientiMouseClicked
        int riga = tblClienti.getSelectedRow();
        Integer id = Integer.parseInt(tblClienti.getValueAt(riga, 0).toString());
        FrameDettaglioClienti fdc = new FrameDettaglioClienti(id);
        fdc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_tblClientiMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnIndietro;
    private javax.swing.JButton btnInserisci;
    private com.toedter.calendar.JDateChooser dcDataNascita;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblCognome;
    private javax.swing.JLabel lblModello1;
    private javax.swing.JLabel lblNoleggioAlKm;
    private javax.swing.JLabel lblNome;
    private javax.swing.JSpinner spnNoleggio;
    private javax.swing.JTable tblClienti;
    private javax.swing.JTextField txtCognome;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumeroPatente;
    // End of variables declaration//GEN-END:variables
}

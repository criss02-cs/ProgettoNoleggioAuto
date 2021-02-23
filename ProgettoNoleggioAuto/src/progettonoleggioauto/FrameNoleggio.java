package progettonoleggioauto;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.sql.Date;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
import model.Auto;
import model.Cliente;
import model.Sede;
import model.Noleggio;

public class FrameNoleggio extends javax.swing.JFrame {
    private SqlCommand sql;
    public FrameNoleggio() {
        initComponents();
        this.setTitle("Gestione noleggi");
        sql = new SqlCommand();
        CaricaComboAuto();
        CaricaComboClienti();
        CaricaComboSedi();
    }
    private void CaricaComboSedi(){
        cmbSedeDestinazione.removeAllItems();
        cmbSedePartenza.removeAllItems();
        ArrayList<Sede> sedi;
        sedi = sql.selectSedi();
        for (Sede sede : sedi) {
            cmbSedeDestinazione.addItem(sede.getIdSede() + "-" + sede.getIndirizzo());
            cmbSedePartenza.addItem(sede.getIdSede() + "-" + sede.getIndirizzo());
        }
    }
    private void CaricaComboAuto(){
        cmbAuto.removeAllItems();
        ArrayList<Auto> auto;
        auto = sql.selectAuto();
        for (Auto a : auto) {
            cmbAuto.addItem(a.getTarga()+ "-" + a.getMarca() + "-" + a.getModello());
        }
    }
    private void CaricaComboClienti(){
        cmbClienteEsistente.removeAllItems();
        ArrayList<Cliente> clienti;
        clienti = sql.selectClienti();
        for (Cliente cliente : clienti) {
            cmbClienteEsistente.addItem(cliente.getIdCliente() + "-" + cliente.getNome() + " " + cliente.getCognome());
        }
    }
    private void cambiaForm(){
        if(JOptionPane.showConfirmDialog(null, "Vuoi vedere tutti i noleggi?", "Conferma", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
            //Apri form noleggi
        }
        else{
            FrameMenu fm = new FrameMenu();
            fm.setVisible(true);
            this.dispose();
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAuto = new javax.swing.JLabel();
        cmbAuto = new javax.swing.JComboBox<>();
        lblInzioNoleggio = new javax.swing.JLabel();
        jdcDataInizio = new com.toedter.calendar.JDateChooser();
        jdcDataFine = new com.toedter.calendar.JDateChooser();
        lblFineNoleggio = new javax.swing.JLabel();
        rdbClienteEsistente = new javax.swing.JRadioButton();
        rdbNuovoCliente = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        cmbClienteEsistente = new javax.swing.JComboBox<>();
        lblClienteEsistente = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblCognome = new javax.swing.JLabel();
        txtCognome = new javax.swing.JTextField();
        lblModello1 = new javax.swing.JLabel();
        dcDataNascita = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        txtNumeroPatente = new javax.swing.JTextField();
        btnInserisciNuovo = new javax.swing.JButton();
        btnInserisciEsistente = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cmbSedePartenza = new javax.swing.JComboBox<>();
        cmbSedeDestinazione = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblAuto.setText("Auto:");

        lblInzioNoleggio.setText("Data di inizio noleggio:");

        lblFineNoleggio.setText("Data di fine noleggio:");

        rdbClienteEsistente.setText("Cliente esistente");
        rdbClienteEsistente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbClienteEsistenteActionPerformed(evt);
            }
        });

        rdbNuovoCliente.setText("Nuovo cliente");
        rdbNuovoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbNuovoClienteActionPerformed(evt);
            }
        });

        jLabel1.setText("Selezionare il cliente:");

        cmbClienteEsistente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblClienteEsistente.setText("Cliente:");

        lblNome.setText("Nome");

        lblCognome.setText("Cognome");

        lblModello1.setText("Data Nascita");

        jLabel2.setText("Numero Patente");

        btnInserisciNuovo.setText("Inserisci");
        btnInserisciNuovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserisciNuovoActionPerformed(evt);
            }
        });

        btnInserisciEsistente.setText("Inserisci");
        btnInserisciEsistente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserisciEsistenteActionPerformed(evt);
            }
        });

        jLabel3.setText("Sede di partenza:");

        cmbSedePartenza.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cmbSedeDestinazione.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setText("Sede di destinazione:");

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(rdbClienteEsistente))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(rdbNuovoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(btnInserisciEsistente))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblClienteEsistente, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(cmbClienteEsistente, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(62, 62, 62))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblAuto, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(151, 151, 151)
                                .addComponent(cmbAuto, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(69, 69, 69)
                                .addComponent(cmbSedeDestinazione, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbSedePartenza, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblInzioNoleggio)
                                        .addComponent(lblFineNoleggio))
                                    .addGap(63, 63, 63)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jdcDataFine, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jdcDataInizio, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lblNome)
                                .addGap(77, 77, 77)
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lblCognome)
                                .addGap(56, 56, 56)
                                .addComponent(txtCognome, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lblModello1)
                                .addGap(38, 38, 38)
                                .addComponent(dcDataNascita, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(28, 28, 28)
                                .addComponent(txtNumeroPatente, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(btnInserisciNuovo)))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(lblAuto))
                    .addComponent(cmbAuto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(lblInzioNoleggio))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jdcDataInizio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFineNoleggio)
                    .addComponent(jdcDataFine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmbSedePartenza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbSedeDestinazione, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnBack))
                .addGap(4, 4, 4)
                .addComponent(rdbClienteEsistente)
                .addGap(2, 2, 2)
                .addComponent(rdbNuovoCliente)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblClienteEsistente)
                    .addComponent(cmbClienteEsistente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(btnInserisciEsistente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCognome)
                    .addComponent(txtCognome, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblModello1)
                    .addComponent(dcDataNascita, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtNumeroPatente, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(btnInserisciNuovo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnInserisciNuovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserisciNuovoActionPerformed
        String nome = txtNome.getText();
        String cognome = txtCognome.getText();
        String dataNascita = new SimpleDateFormat("yyyy-MM-dd").format(dcDataNascita.getDate());
        //Date dataNascita = dcDataNascita.getDate();
        Integer nPatente = Integer.parseInt(txtNumeroPatente.getText());
        //Converto la data da stringa a oggetto sql.Date
        java.sql.Date dN = java.sql.Date.valueOf(dataNascita);
        sql.inserisciClienti(nome, cognome, dN, nPatente);
        String auto = cmbAuto.getSelectedItem().toString();
        String dataInizio = new SimpleDateFormat("yyyy-MM-dd").format(jdcDataInizio.getDate());
        String dataFine = new SimpleDateFormat("yyyy-MM-dd").format(jdcDataFine.getDate());
        Date dI = Date.valueOf(dataInizio);
        Date dF = Date.valueOf(dataFine);
        String sedePartenza = cmbSedePartenza.getSelectedItem().toString();
        String sedeDestinazione = cmbSedeDestinazione.getSelectedItem().toString();
        StringTokenizer st = new StringTokenizer(auto, "-");
        auto = st.nextToken();
        st = new StringTokenizer(sedePartenza, "-");
        Integer idSedeP = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(sedeDestinazione, "-");
        Integer idSedeD = Integer.parseInt(st.nextToken());
        Noleggio n = new Noleggio(dI, dF, sql.selectCliente(nome).getIdCliente(), idSedeP, idSedeD, auto);
        sql.inserisciNoleggio(n);
        cambiaForm();
    }//GEN-LAST:event_btnInserisciNuovoActionPerformed

    private void btnInserisciEsistenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserisciEsistenteActionPerformed
        String auto = cmbAuto.getSelectedItem().toString();
        String dataInizio = new SimpleDateFormat("yyyy-MM-dd").format(jdcDataInizio.getDate());
        String dataFine = new SimpleDateFormat("yyyy-MM-dd").format(jdcDataFine.getDate());
        Date dI = Date.valueOf(dataInizio);
        Date dF = Date.valueOf(dataFine);
        String cliente = cmbClienteEsistente.getSelectedItem().toString();
        String sedePartenza = cmbSedePartenza.getSelectedItem().toString();
        String sedeDestinazione = cmbSedeDestinazione.getSelectedItem().toString();
        StringTokenizer st = new StringTokenizer(auto, "-");
        auto = st.nextToken();
        st = new StringTokenizer(cliente, "-");
        Integer idCliente = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(sedePartenza, "-");
        Integer idSedeP = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(sedeDestinazione, "-");
        Integer idSedeD = Integer.parseInt(st.nextToken());
        Noleggio n = new Noleggio(dI, dF, idCliente, idSedeP, idSedeD, auto);
        sql.inserisciNoleggio(n);
        cambiaForm();
    }//GEN-LAST:event_btnInserisciEsistenteActionPerformed

    private void rdbClienteEsistenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbClienteEsistenteActionPerformed
        this.setSize(390, 380);
        cmbClienteEsistente.setVisible(true);
        btnInserisciEsistente.setVisible(true);
        lblClienteEsistente.setVisible(true);
        rdbNuovoCliente.setSelected(false);
    }//GEN-LAST:event_rdbClienteEsistenteActionPerformed

    private void rdbNuovoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbNuovoClienteActionPerformed
        cmbClienteEsistente.setVisible(false);
        rdbClienteEsistente.setSelected(false);
        btnInserisciEsistente.setVisible(false);
        lblClienteEsistente.setVisible(false);
        this.setSize(390, 525);
    }//GEN-LAST:event_rdbNuovoClienteActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        FrameMenu fm = new FrameMenu();
        fm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnInserisciEsistente;
    private javax.swing.JButton btnInserisciNuovo;
    private javax.swing.JComboBox<String> cmbAuto;
    private javax.swing.JComboBox<String> cmbClienteEsistente;
    private javax.swing.JComboBox<String> cmbSedeDestinazione;
    private javax.swing.JComboBox<String> cmbSedePartenza;
    private com.toedter.calendar.JDateChooser dcDataNascita;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private com.toedter.calendar.JDateChooser jdcDataFine;
    private com.toedter.calendar.JDateChooser jdcDataInizio;
    private javax.swing.JLabel lblAuto;
    private javax.swing.JLabel lblClienteEsistente;
    private javax.swing.JLabel lblCognome;
    private javax.swing.JLabel lblFineNoleggio;
    private javax.swing.JLabel lblInzioNoleggio;
    private javax.swing.JLabel lblModello1;
    private javax.swing.JLabel lblNome;
    private javax.swing.JRadioButton rdbClienteEsistente;
    private javax.swing.JRadioButton rdbNuovoCliente;
    private javax.swing.JTextField txtCognome;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumeroPatente;
    // End of variables declaration//GEN-END:variables
}

package progettonoleggioauto;

import model.Cliente;
import java.text.SimpleDateFormat;

public class FrameDettaglioClienti extends javax.swing.JFrame {
    private Integer id;
    private SqlCommand sql;
    private Cliente cliente;
    
    public FrameDettaglioClienti(Integer id) {
        initComponents();
        this.id = id;
        sql = new SqlCommand();
        cliente = sql.selectCliente(id);
        txtIdCliente.setText(cliente.getIdCliente().toString());
        txtNome.setText(cliente.getNome());
        txtCognome.setText(cliente.getCognome());
        txtNumeroPatente.setText(cliente.getnPatente().toString());
        jdcDataNascita.setDate(cliente.getDataN());
        this.setTitle("Dettaglio clienti");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtIdCliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCognome = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jdcDataNascita = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        txtNumeroPatente = new javax.swing.JTextField();
        btnModifica = new javax.swing.JButton();
        btnCancella = new javax.swing.JButton();
        btnIndietro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Id Cliente");

        txtIdCliente.setEnabled(false);

        jLabel2.setText("Nome");

        jLabel3.setText("Cognome");

        jLabel5.setText("Data Nascita");

        jLabel6.setText("Numero Patente");

        btnModifica.setText("Modifica");
        btnModifica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificaActionPerformed(evt);
            }
        });

        btnCancella.setText("Cancella");
        btnCancella.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancellaActionPerformed(evt);
            }
        });

        btnIndietro.setText("Torna indietro");
        btnIndietro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIndietroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnModifica)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancella)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnIndietro)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtIdCliente, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNome, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCognome, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jdcDataNascita, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                            .addComponent(txtNumeroPatente))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCognome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel5))
                    .addComponent(jdcDataNascita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtNumeroPatente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModifica)
                    .addComponent(btnCancella)
                    .addComponent(btnIndietro))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnIndietroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIndietroActionPerformed
        FrameClienti fc = new FrameClienti();
        fc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnIndietroActionPerformed

    private void btnModificaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificaActionPerformed
        cliente.setNome(txtNome.getText());
        cliente.setCognome(txtCognome.getText());
        cliente.setnPatente(Integer.parseInt(txtNumeroPatente.getText()));
        String dataNascita = new SimpleDateFormat("yyyy-MM-dd").format(jdcDataNascita.getDate());
        java.sql.Date dN = java.sql.Date.valueOf(dataNascita);
        cliente.setDataN(dN);
        sql.modificaCliente(cliente);
        FrameClienti fc = new FrameClienti();
        fc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnModificaActionPerformed

    private void btnCancellaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancellaActionPerformed
        sql.cancellaCliente(id);
        FrameClienti fc = new FrameClienti();
        fc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancellaActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancella;
    private javax.swing.JButton btnIndietro;
    private javax.swing.JButton btnModifica;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private com.toedter.calendar.JDateChooser jdcDataNascita;
    private javax.swing.JTextField txtCognome;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumeroPatente;
    // End of variables declaration//GEN-END:variables
}

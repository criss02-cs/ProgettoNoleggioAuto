package progettonoleggioauto;

import javax.swing.JOptionPane;
import model.Categoria;

public class FrameDettaglioCategorie extends javax.swing.JFrame {
    private Integer id;
    private SqlCommand sql;
    private Categoria categoria;
    public FrameDettaglioCategorie(Integer id) {
        initComponents();
        this.id = id;
        sql = new SqlCommand();
        categoria = sql.selectCategoria(id);
        this.setTitle("Dettaglio categoria");
        txtIdCategoria.setText(categoria.getIdCategoria().toString());
        txtDescrizione.setText(categoria.getDescrizione());
        spnNoleggioGiorno.setValue(categoria.getNoleggioAlGiorno());
        spnNoleggioKm.setValue(categoria.getNoleggioAlChilometro());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtIdCategoria = new javax.swing.JTextField();
        txtDescrizione = new javax.swing.JTextField();
        spnNoleggioGiorno = new javax.swing.JSpinner();
        spnNoleggioKm = new javax.swing.JSpinner();
        btnModifica = new javax.swing.JButton();
        btnCancella = new javax.swing.JButton();
        btnIndietro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Id Categoria");

        jLabel2.setText("Descrizione");

        jLabel3.setText("Noleggio al giorno");

        jLabel4.setText("Noleggio al chilometro");

        txtIdCategoria.setEnabled(false);

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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(spnNoleggioKm, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                            .addComponent(spnNoleggioGiorno)
                            .addComponent(txtDescrizione)
                            .addComponent(txtIdCategoria)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnModifica)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancella)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnIndietro)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIdCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDescrizione, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(spnNoleggioGiorno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(spnNoleggioKm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        FrameCategorie fc = new FrameCategorie();
        fc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnIndietroActionPerformed

    private void btnCancellaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancellaActionPerformed
        sql.cancellaCategoria(id);
        JOptionPane.showMessageDialog(null, "Cancellazione effettuata");
        FrameCategorie fc = new FrameCategorie();
        fc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancellaActionPerformed

    private void btnModificaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificaActionPerformed
        categoria.setDescrizione(txtDescrizione.getText());
        categoria.setNoleggioAlChilometro(Integer.parseInt(spnNoleggioKm.getValue().toString()));
        categoria.setNoleggioAlGiorno(Integer.parseInt(spnNoleggioGiorno.getValue().toString()));
        sql.modificaCategoria(categoria);
        JOptionPane.showMessageDialog(null, "Modifica effettuata");
        FrameCategorie fc = new FrameCategorie();
        fc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnModificaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancella;
    private javax.swing.JButton btnIndietro;
    private javax.swing.JButton btnModifica;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSpinner spnNoleggioGiorno;
    private javax.swing.JSpinner spnNoleggioKm;
    private javax.swing.JTextField txtDescrizione;
    private javax.swing.JTextField txtIdCategoria;
    // End of variables declaration//GEN-END:variables
}

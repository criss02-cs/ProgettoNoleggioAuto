package progettonoleggioauto;

import javax.swing.JOptionPane;


public class FrameMenu extends javax.swing.JFrame {
    public FrameMenu() {
        initComponents();
        this.setTitle("Menù Gestionale noleggi auto");
        btnNoleggio.setToolTipText("Aprirà un menù per la visualizzazione e l'inserimento dei noleggi.");
        btnAuto.setToolTipText("Aprirà un menù per la visualizzazione e l'inserimento delle auto.");
        btnSedi.setToolTipText("Aprirà un menù per la visualizzazione e l'inserimento delle sedi.");
        btnCategoria.setToolTipText("Aprirà un menù per la visualizzazione e l'inserimento delle categorie.");
        btnClienti.setToolTipText("Aprirà un menù per la visualizzazione e l'inserimento dei clienti.");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAuto = new javax.swing.JButton();
        btnSedi = new javax.swing.JButton();
        btnCategoria = new javax.swing.JButton();
        btnClienti = new javax.swing.JButton();
        lblNoleggioAuto = new javax.swing.JLabel();
        lblCopyright = new javax.swing.JLabel();
        btnNoleggio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAuto.setText("Auto");
        btnAuto.setBorder(btnClienti.getBorder());
        btnAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAutoActionPerformed(evt);
            }
        });

        btnSedi.setText("Sedi");
        btnSedi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSediActionPerformed(evt);
            }
        });

        btnCategoria.setText("Categoria");
        btnCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoriaActionPerformed(evt);
            }
        });

        btnClienti.setText("Clienti");
        btnClienti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientiActionPerformed(evt);
            }
        });

        lblNoleggioAuto.setFont(new java.awt.Font("Gabriola", 1, 36)); // NOI18N
        lblNoleggioAuto.setText("Gestionale Noleggio Auto");

        lblCopyright.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        lblCopyright.setText("By Kuci Rubin & Aloigi Cristiano");

        btnNoleggio.setText("Noleggio");
        btnNoleggio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNoleggioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblCopyright))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(lblNoleggioAuto, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnNoleggio, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAuto, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnClienti, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSedi, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCategoria)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblNoleggioAuto, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNoleggio, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSedi, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClienti, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAuto, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(lblCopyright)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAutoActionPerformed
        //Visualizza frame auto
        FrameAuto fa = new FrameAuto();
        fa.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAutoActionPerformed

    private void btnSediActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSediActionPerformed
        FrameSede fs = new FrameSede();
        fs.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSediActionPerformed

    private void btnCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoriaActionPerformed
        FrameCategorie fc = new FrameCategorie();
        fc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCategoriaActionPerformed

    private void btnClientiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientiActionPerformed
        FrameClienti fc = new FrameClienti();
        fc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnClientiActionPerformed

    private void btnNoleggioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNoleggioActionPerformed
        Object[] g = new Object[2];
        g[0] = "Inserisci noleggio";
        g[1] = "Visualizza noleggi";
        int conferma = JOptionPane.showOptionDialog(null, "Quale form vuoi aprire?", "Scelta forma", 0, 1, null, g, EXIT_ON_CLOSE);
        if(conferma == 0){
            FrameNoleggio fn = new FrameNoleggio();
            fn.setVisible(true);
            fn.setSize(395, 305);
            this.dispose();
        } else if (conferma == 1){
            FrameNoleggi fn = new FrameNoleggi();
            fn.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnNoleggioActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAuto;
    private javax.swing.JButton btnCategoria;
    private javax.swing.JButton btnClienti;
    private javax.swing.JButton btnNoleggio;
    private javax.swing.JButton btnSedi;
    private javax.swing.JLabel lblCopyright;
    private javax.swing.JLabel lblNoleggioAuto;
    // End of variables declaration//GEN-END:variables
}

package progettonoleggioauto;

public class FrameMenu extends javax.swing.JFrame {
    public FrameMenu() {
        initComponents();
        this.setTitle("Menù Gestionale noleggi auto");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAuto = new javax.swing.JButton();
        btnSedi = new javax.swing.JButton();
        btnCategoria = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAuto.setText("Auto");
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAuto)
                    .addComponent(btnSedi)
                    .addComponent(btnCategoria))
                .addContainerGap(309, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAuto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCategoria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSedi)
                .addContainerGap(186, Short.MAX_VALUE))
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAuto;
    private javax.swing.JButton btnCategoria;
    private javax.swing.JButton btnSedi;
    // End of variables declaration//GEN-END:variables
}

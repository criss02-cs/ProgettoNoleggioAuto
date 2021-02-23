package progettonoleggioauto;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.Noleggio;

public class FrameNoleggi extends javax.swing.JFrame {
    private SqlCommand sql;
    public FrameNoleggi() {
        initComponents();
        caricaJTable();
        this.setTitle("Visualizza noleggi");
    }
    private void caricaJTable(){
        sql = new SqlCommand();
        DefaultTableModel tbl = (DefaultTableModel) tblNoleggi.getModel();
        tbl.setRowCount(0);
        ArrayList<Noleggio> noleggi;
        DefaultTableModel dtm = (DefaultTableModel) tblNoleggi.getModel();
        Object riga[] = new Object[dtm.getColumnCount()];
        noleggi = sql.selectNoleggi();
        for (Noleggio noleggio : noleggi) {
            String auto = noleggio.getFkTarga() + "-" + sql.selectAuto(noleggio.getFkTarga()).getMarca();
            riga[0] = auto;
            String cliente = noleggio.getFkIdCliente() + "-" + sql.selectCliente(noleggio.getFkIdCliente()).getNome() + " " + sql.selectCliente(noleggio.getFkIdCliente()).getCognome();
            riga[1] = cliente;
            riga[2] = new SimpleDateFormat("dd-MM-yyy").format(noleggio.getGiornoNoleggio());
            riga[3] = new SimpleDateFormat("dd-MM-yyy").format(noleggio.getGiornoRiconsegna());
            riga[4] = noleggio.getFkIdSedePartenza() + " " + sql.selectSede(noleggio.getFkIdSedePartenza()).getIndirizzo();
            riga[5] = noleggio.getFkIdSedeDestinazione()+ " " + sql.selectSede(noleggio.getFkIdSedeDestinazione()).getIndirizzo();
            dtm.addRow(riga);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblNoleggi = new javax.swing.JTable();
        btnIndietro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblNoleggi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Auto", "Cliente", "Data Inizio", "Data Fine", "Sede partenza", "Sede destinazione"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblNoleggi);

        btnIndietro.setText("Back");
        btnIndietro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIndietroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 665, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnIndietro)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnIndietro))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnIndietroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIndietroActionPerformed
        FrameMenu fm = new FrameMenu();
        fm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnIndietroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIndietro;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblNoleggi;
    // End of variables declaration//GEN-END:variables
}

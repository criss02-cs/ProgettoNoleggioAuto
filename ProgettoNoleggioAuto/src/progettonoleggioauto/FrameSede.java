package progettonoleggioauto;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class FrameSede extends javax.swing.JFrame {
    public FrameSede() {
        initComponents();
        this.setTitle("Gestione auto");
        //caricaJTable();
    }
    
    private void caricaJTable(){
        DefaultTableModel tbl = (DefaultTableModel) tblSedi.getModel();
        tbl.setRowCount(0);
        Connection c = null;
        ResultSet rec;
        try {
            c = DriverManager.getConnection("jdbc:sqlite:./noleggioauto.db");
            String select = "SELECT * FROM sedi";
            PreparedStatement ps = c.prepareStatement(select);
            rec = ps.executeQuery();
            DefaultTableModel dtm = (DefaultTableModel) tblSedi.getModel();
            Object riga[] = new Object[3];
            int i = 0;
            while (rec.next()) {
                riga[0] = rec.getInt(1);
                riga[1] = rec.getString(2);
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
        tblSedi = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        txtIndirizzo = new javax.swing.JTextField();
        lblTarga = new javax.swing.JLabel();
        btnInserisci = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane1StateChanged(evt);
            }
        });

        tblSedi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Sede", "Indirizzo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblSedi);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Visualizza sedi", jPanel1);

        lblTarga.setText("Indirizzo");

        btnInserisci.setText("Inserisci");
        btnInserisci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserisciActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(125, Short.MAX_VALUE)
                .addComponent(lblTarga)
                .addGap(9, 9, 9)
                .addComponent(txtIndirizzo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(btnInserisci)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIndirizzo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTarga))
                .addGap(32, 32, 32)
                .addComponent(btnInserisci)
                .addContainerGap(101, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Inserisci sede", jPanel2);

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
        String indirizzo = txtIndirizzo.getText();
        Connection c = null;
        try {
            c = DriverManager.getConnection("jdbc:sqlite:./noleggioauto.db");
            String insert = "INSERT INTO sedi (indirizzo) values (?)";
            PreparedStatement ps = c.prepareStatement(insert);
            ps.setString(1, indirizzo);
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInserisci;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblTarga;
    private javax.swing.JTable tblSedi;
    private javax.swing.JTextField txtIndirizzo;
    // End of variables declaration//GEN-END:variables
}

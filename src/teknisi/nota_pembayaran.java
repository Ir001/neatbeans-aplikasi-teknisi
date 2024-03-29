/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teknisi;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author user
 */
public class nota_pembayaran extends javax.swing.JFrame {

    /**
     * Creates new form nota_pembayaran
     */
    public nota_pembayaran() {
        initComponents();
        String pelanggan = session.get_nama_pelanggan();
        String teknisi = session.get_nama_teknisi();
        String barang = session.get_nama_barang();
        String keluhan = session.get_keluhan();
        String kode = session.getKode();
        String nama_part = session.get_part();
        String nama_jasa = session.get_jasa();
        int harga_part = session.get_harga_part();
        int harga_jasa = session.get_harga_jasa();
        int bayar = session.get_bayar();
        int kembalian = session.get_kembalian();
        //
        txtpelanggan.setText(pelanggan);
        txtteknisi.setText(teknisi);
        txtkeluhan.setText(keluhan);
        txtnota.setText(kode);
        txtbarang.setText(barang);
        txtlayanan.setText(nama_jasa);
        txtpart.setText(nama_part);
        txtharga_part.setText(String.valueOf(harga_part));
        txtharga_layanan.setText(String.valueOf(harga_jasa));
        txttotal.setText(String.valueOf(harga_part+harga_jasa));
        txtkembalian.setText(String.valueOf(kembalian));
        txtbayar.setText(String.valueOf(bayar));
        txttotal.setText(String.valueOf(harga_part+harga_jasa));
       
        //
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtnama5 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtpelanggan = new javax.swing.JTextField();
        txtteknisi = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txttotal = new javax.swing.JTextField();
        txtlayanan = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtpart = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtharga_layanan = new javax.swing.JTextField();
        txtharga_part = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnhome = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtnota = new javax.swing.JTextField();
        txtbarang = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtkeluhan = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        txtbayar = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtkembalian = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Nota Pembayaran");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 375, 25));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Nama Pelanggan");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 89, 24));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Nama Teknisi");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 89, 30));

        txtpelanggan.setEditable(false);
        jPanel1.add(txtpelanggan, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 60, 222, 30));

        txtteknisi.setEditable(false);
        jPanel1.add(txtteknisi, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 220, 30));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Kode Nota");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 89, 30));

        txttotal.setEditable(false);
        jPanel1.add(txttotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 180, 222, 30));

        txtlayanan.setEditable(false);
        txtlayanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlayananActionPerformed(evt);
            }
        });
        jPanel1.add(txtlayanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, 136, 30));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Jasa/Layanan");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 89, 24));

        txtpart.setEditable(false);
        jPanel1.add(txtpart, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, 136, 30));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Sparepart");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 89, 24));

        txtharga_layanan.setEditable(false);
        jPanel1.add(txtharga_layanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 100, 80, 30));

        txtharga_part.setEditable(false);
        jPanel1.add(txtharga_part, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 140, 80, 30));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Keluhan");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 89, 24));

        btnhome.setText("Home");
        btnhome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhomeActionPerformed(evt);
            }
        });
        jPanel1.add(btnhome, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 320, 40));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Total");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, 89, 24));

        txtnota.setEditable(false);
        jPanel1.add(txtnota, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 222, 30));

        txtbarang.setEditable(false);
        jPanel1.add(txtbarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, 222, 30));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Nama Barang");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 89, 24));

        txtkeluhan.setEditable(false);
        txtkeluhan.setColumns(20);
        txtkeluhan.setRows(5);
        jScrollPane1.setViewportView(txtkeluhan);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 220, 110));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Kembalian");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, 90, 20));

        txtbayar.setEditable(false);
        txtbayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbayarActionPerformed(evt);
            }
        });
        jPanel1.add(txtbayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, 220, 30));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Bayar");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, 90, 20));

        txtkembalian.setEditable(false);
        txtkembalian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtkembalianActionPerformed(evt);
            }
        });
        jPanel1.add(txtkembalian, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 260, 220, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 717, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnhomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhomeActionPerformed
        
        home hm = new home();
        hm.setVisible(true); 
        this.setVisible(false);   
    
    }//GEN-LAST:event_btnhomeActionPerformed

    private void txtlayananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtlayananActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtlayananActionPerformed

    private void txtbayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbayarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbayarActionPerformed

    private void txtkembalianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtkembalianActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtkembalianActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(nota_pembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(nota_pembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(nota_pembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(nota_pembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new nota_pembayaran().setVisible(true);
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnhome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtbarang;
    private javax.swing.JTextField txtbayar;
    private javax.swing.JTextField txtharga_layanan;
    private javax.swing.JTextField txtharga_part;
    private javax.swing.JTextArea txtkeluhan;
    private javax.swing.JTextField txtkembalian;
    private javax.swing.JTextField txtlayanan;
    private javax.swing.JTextField txtnama5;
    private javax.swing.JTextField txtnota;
    private javax.swing.JTextField txtpart;
    private javax.swing.JTextField txtpelanggan;
    private javax.swing.JTextField txtteknisi;
    private javax.swing.JTextField txttotal;
    // End of variables declaration//GEN-END:variables
}

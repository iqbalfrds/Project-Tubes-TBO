/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eskrim;

/**
 *
 * @author User
 */
public class varian_eskrim extends javax.swing.JFrame {

    /**
     * Creates new form varian_eskrim
     */
    public varian_eskrim() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbxstrawberry = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        txtjumlah1 = new javax.swing.JTextField();
        cbxvanilla = new javax.swing.JCheckBox();
        cbxcoklat = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtjumlah3 = new javax.swing.JTextField();
        txtjumlah2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cbxkacang = new javax.swing.JCheckBox();
        jLabel11 = new javax.swing.JLabel();
        cbxoreo = new javax.swing.JCheckBox();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtpesan = new javax.swing.JTextArea();
        btnpesan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Varian Es Krim :");

        jLabel2.setText("Harga :");

        jLabel3.setText("Jumlah :");

        cbxstrawberry.setText("Strawberry");
        cbxstrawberry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxstrawberryActionPerformed(evt);
            }
        });

        jLabel4.setText("Rp. 10.000");

        txtjumlah1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtjumlah1ActionPerformed(evt);
            }
        });

        cbxvanilla.setText("Vanilla");
        cbxvanilla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxvanillaActionPerformed(evt);
            }
        });

        cbxcoklat.setText("Coklat");
        cbxcoklat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxcoklatActionPerformed(evt);
            }
        });

        jLabel5.setText("Rp. 12.000");

        jLabel6.setText("Rp. 10.000");

        txtjumlah3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtjumlah3ActionPerformed(evt);
            }
        });

        txtjumlah2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtjumlah2ActionPerformed(evt);
            }
        });

        jLabel7.setText("Tambah Toping :");

        jLabel8.setText("Harga :");

        jLabel10.setText("Rp. 5.000");

        cbxkacang.setText("Kacang");
        cbxkacang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxkacangActionPerformed(evt);
            }
        });

        jLabel11.setText("Rp. 5.000");

        cbxoreo.setText("Oreo");
        cbxoreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxoreoActionPerformed(evt);
            }
        });

        jLabel12.setText("Pesanan Anda");

        txtpesan.setColumns(20);
        txtpesan.setRows(5);
        jScrollPane1.setViewportView(txtpesan);

        btnpesan.setText("Buat");
        btnpesan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpesanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(cbxstrawberry)
                            .addComponent(cbxcoklat)
                            .addComponent(jLabel7)
                            .addComponent(cbxkacang)
                            .addComponent(cbxoreo))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtjumlah3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtjumlah2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtjumlah1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbxvanilla)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12)
                        .addGap(163, 163, 163))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnpesan)
                .addGap(161, 161, 161))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtjumlah1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxcoklat))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbxstrawberry)
                            .addComponent(jLabel5)
                            .addComponent(txtjumlah2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbxvanilla)
                            .addComponent(jLabel6)
                            .addComponent(txtjumlah3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbxkacang)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbxoreo)
                            .addComponent(jLabel11)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addComponent(btnpesan)
                .addContainerGap(113, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxstrawberryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxstrawberryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxstrawberryActionPerformed

    private void txtjumlah1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtjumlah1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtjumlah1ActionPerformed

    private void cbxvanillaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxvanillaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxvanillaActionPerformed

    private void cbxcoklatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxcoklatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxcoklatActionPerformed

    private void txtjumlah3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtjumlah3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtjumlah3ActionPerformed

    private void txtjumlah2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtjumlah2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtjumlah2ActionPerformed

    private void cbxkacangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxkacangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxkacangActionPerformed

    private void cbxoreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxoreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxoreoActionPerformed

    private void btnpesanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpesanActionPerformed
        // TODO add your handling code here:
        String tampil;
        tampil ="";
        int bayar= 0;
        if(cbxcoklat.isSelected()){
            int jumlah=Integer.parseInt(txtjumlah1.getText());
            int total;
            total = jumlah*10000;
            bayar=bayar+total;
            tampil +=cbxcoklat.getText()+"Rp.10000"+"x "+ jumlah+"="+total+"\n";
        } if(cbxstrawberry.isSelected()){
            int jumlah=Integer.parseInt(txtjumlah2.getText());
            int total;
            total = jumlah*12000;
            bayar=bayar+total;
            tampil +=cbxstrawberry.getText()+"Rp.12000"+"x "+ jumlah+"="+total+"\n";
        } if(cbxvanilla.isSelected()){
            int jumlah=Integer.parseInt(txtjumlah3.getText());
            int total;
            total = jumlah*10000;
            bayar=bayar+total;
            tampil +=cbxvanilla.getText()+"Rp.10000"+"x "+ jumlah+"="+total+"\n";
        }if(cbxkacang.isSelected()){
            
            int total;
            total = 5000;
            bayar=bayar+total;
            tampil +=cbxkacang.getText()+"Rp.5000="+total+"\n";
        }if(cbxoreo.isSelected()){
            
            int total;
            total = 5000;
            bayar=bayar+total;
            tampil +=cbxoreo.getText()+"Rp.5000="+total+"\n";
        }
        txtpesan.setText(tampil+"================="+"\n"+"Total Bayar = "+bayar);
    }//GEN-LAST:event_btnpesanActionPerformed

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
            java.util.logging.Logger.getLogger(varian_eskrim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(varian_eskrim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(varian_eskrim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(varian_eskrim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new varian_eskrim().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnpesan;
    private javax.swing.JCheckBox cbxcoklat;
    private javax.swing.JCheckBox cbxkacang;
    private javax.swing.JCheckBox cbxoreo;
    private javax.swing.JCheckBox cbxstrawberry;
    private javax.swing.JCheckBox cbxvanilla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtjumlah1;
    private javax.swing.JTextField txtjumlah2;
    private javax.swing.JTextField txtjumlah3;
    private javax.swing.JTextArea txtpesan;
    // End of variables declaration//GEN-END:variables
}

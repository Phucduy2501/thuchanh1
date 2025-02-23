package BaiTapTH1;

import javax.swing.JOptionPane;

public class FormChinh extends javax.swing.JFrame {

    /**
     * Creates new form FormChinh
     */
    public FormChinh() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuBar4 = new javax.swing.JMenuBar();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuBar5 = new javax.swing.JMenuBar();
        jMenu9 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        thoat = new javax.swing.JMenuItem();
        jMenu11 = new javax.swing.JMenu();
        PhepTinh = new javax.swing.JMenuItem();
        TheTich = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        ChieuDai = new javax.swing.JMenuItem();
        KhoiLuong = new javax.swing.JCheckBoxMenuItem();
        jMenu12 = new javax.swing.JMenu();

        jMenu1.setText("jMenu1");

        jMenu2.setText("File");
        jMenuBar2.add(jMenu2);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("File");
        jMenuBar3.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar3.add(jMenu6);

        jMenuItem3.setText("jMenuItem3");

        jMenu7.setText("File");
        jMenuBar4.add(jMenu7);

        jMenu8.setText("Edit");
        jMenuBar4.add(jMenu8);

        jMenuItem4.setText("jMenuItem4");

        jMenu9.setText("File");
        jMenuBar5.add(jMenu9);

        jMenu10.setText("Edit");
        jMenuBar5.add(jMenu10);

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu3.setText("Hệ thống");

        thoat.setText("Thoát");
        thoat.setAlignmentX(5.0F);
        thoat.setAlignmentY(5.0F);
        thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thoatActionPerformed(evt);
            }
        });
        jMenu3.add(thoat);

        jMenuBar1.add(jMenu3);

        jMenu11.setText("Chức năng");

        PhepTinh.setText("Phép tính");
        PhepTinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhepTinhActionPerformed(evt);
            }
        });
        jMenu11.add(PhepTinh);

        TheTich.setText("Đổi đơn vị thể tích");
        TheTich.setActionCommand("");
        TheTich.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TheTichActionPerformed(evt);
            }
        });
        jMenu11.add(TheTich);

        jMenuItem7.setText("Tích phân");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuItem7);

        ChieuDai.setText("Đổi đơn vị chiều dài");
        ChieuDai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChieuDaiActionPerformed(evt);
            }
        });
        jMenu11.add(ChieuDai);

        KhoiLuong.setSelected(true);
        KhoiLuong.setText("Đổi đơn vị khối lượng");
        KhoiLuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KhoiLuongActionPerformed(evt);
            }
        });
        jMenu11.add(KhoiLuong);

        jMenuBar1.add(jMenu11);

        jMenu12.setText("Trợ giúp");
        jMenuBar1.add(jMenu12);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 770, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 474, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PhepTinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhepTinhActionPerformed
        // TODO add your handling code here:
        PhepTinh frm = new PhepTinh();
        frm.setVisible(true);
    }//GEN-LAST:event_PhepTinhActionPerformed

    private void TheTichActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TheTichActionPerformed
        // TODO add your handling code here:
         TheTich frm = new TheTich();
         frm.setVisible(true);
         frm.setDefaultCloseOperation(FormChinh.EXIT_ON_CLOSE);
    }//GEN-LAST:event_TheTichActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void ChieuDaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChieuDaiActionPerformed
        // TODO add your handling code here:
         ChieuDai frm = new ChieuDai();
         frm.setVisible(true);
         frm.setDefaultCloseOperation(FormChinh.EXIT_ON_CLOSE);
    }//GEN-LAST:event_ChieuDaiActionPerformed

    private void thoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thoatActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_thoatActionPerformed

    private void KhoiLuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KhoiLuongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KhoiLuongActionPerformed

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
            java.util.logging.Logger.getLogger(FormChinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormChinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormChinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormChinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormChinh().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ChieuDai;
    private javax.swing.JCheckBoxMenuItem KhoiLuong;
    private javax.swing.JMenuItem PhepTinh;
    private javax.swing.JMenuItem TheTich;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JMenuBar jMenuBar5;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem thoat;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package thuchanh1;

/**
 *
 * @author ACER
 */
public class giaodien extends javax.swing.JFrame {

    
    /**
     * Creates new form giaodien
     */
    public giaodien() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtb = new javax.swing.JTextField();
        txta = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtKq = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtNhapLai = new javax.swing.JButton();
        txtSosanh = new javax.swing.JButton();
        txtHenhiphan = new javax.swing.JButton();
        txtHebatphan = new javax.swing.JButton();
        txtHethaplucphan = new javax.swing.JButton();

        jMenu3.setText("jMenu3");

        jMenu4.setText("jMenu4");

        jMenu5.setText("jMenu5");

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("CỘNG TRỪ NHÂN CHIA");

        jButton1.setBackground(new java.awt.Color(255, 102, 102));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Tính Tổng");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 102, 102));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Tính Hiệu");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 102, 102));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Tính Tích");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 102, 102));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Tính Thương");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jButton1)
                .addGap(53, 53, 53)
                .addComponent(jButton2)
                .addGap(33, 33, 33)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(153, 255, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Nhập số thứ nhất :");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Nhập số thứ hai :");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        txtKq.setBackground(new java.awt.Color(255, 255, 255));
        txtKq.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtKq.setForeground(new java.awt.Color(255, 51, 51));
        txtKq.setText(":");
        txtKq.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(), null));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Kết Quả :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txta, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtKq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtb, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtKq)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel7)))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        txtNhapLai.setBackground(new java.awt.Color(255, 102, 102));
        txtNhapLai.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtNhapLai.setForeground(new java.awt.Color(255, 255, 255));
        txtNhapLai.setText("Nhập lại");
        txtNhapLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNhapLaiActionPerformed(evt);
            }
        });

        txtSosanh.setBackground(new java.awt.Color(255, 102, 102));
        txtSosanh.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtSosanh.setForeground(new java.awt.Color(255, 255, 255));
        txtSosanh.setText("So sánh");
        txtSosanh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSosanhActionPerformed(evt);
            }
        });

        txtHenhiphan.setBackground(new java.awt.Color(255, 102, 102));
        txtHenhiphan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtHenhiphan.setForeground(new java.awt.Color(255, 255, 255));
        txtHenhiphan.setText("Hệ nhị phân");
        txtHenhiphan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHenhiphanActionPerformed(evt);
            }
        });

        txtHebatphan.setBackground(new java.awt.Color(255, 102, 102));
        txtHebatphan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtHebatphan.setForeground(new java.awt.Color(255, 255, 255));
        txtHebatphan.setText("Hệ bát phân");
        txtHebatphan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHebatphanActionPerformed(evt);
            }
        });

        txtHethaplucphan.setBackground(new java.awt.Color(255, 102, 102));
        txtHethaplucphan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtHethaplucphan.setForeground(new java.awt.Color(255, 255, 255));
        txtHethaplucphan.setText("Hệ thập lục phân");
        txtHethaplucphan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHethaplucphanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtHethaplucphan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNhapLai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addComponent(txtSosanh, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(txtHenhiphan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(txtHebatphan, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNhapLai)
                    .addComponent(txtSosanh)
                    .addComponent(txtHenhiphan)
                    .addComponent(txtHebatphan))
                .addGap(18, 18, 18)
                .addComponent(txtHethaplucphan)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            txtKq.setText(""); 
            double num1 = Double.parseDouble(txta.getText());
            double num2 = Double.parseDouble(txtb.getText());
            double cong = num1 + num2;
            txtKq.setText(String.valueOf(cong));
            } catch (NumberFormatException e) {
            txtKq.setText("Vui lòng nhập số hợp lệ!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try{
            txtKq.setText("");
            double num1 = Double.parseDouble(txta.getText());
            double num2 = Double.parseDouble(txtb.getText());
            double tru = 0;
            tru = num1 - num2;
            txtKq.setText(tru + "");}
        catch (NumberFormatException e) {
            txtKq.setText("Vui lòng nhập số hợp lệ!");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try{
            txtKq.setText("");
            double num1 = Double.parseDouble(txta.getText());
            double num2 = Double.parseDouble(txtb.getText());
            double nhan = 0;

            nhan = num1 * num2;

            txtKq.setText(nhan + "");}
        catch (NumberFormatException e) {
            txtKq.setText("Vui lòng nhập số hợp lệ!");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        try{
            txtKq.setText("");
            double num1 = Double.parseDouble(txta.getText());
            double num2 = Double.parseDouble(txtb.getText());
            double chia = 0;

            chia = num1 / num2;

            txtKq.setText(chia + "");
        }        
        catch (NumberFormatException e) {
            txtKq.setText("Vui lòng nhập số hợp lệ!");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtNhapLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNhapLaiActionPerformed
        // TODO add your handling code here:
        txta.setText("");
        txtb.setText("");
        txtKq.setText("");
    }//GEN-LAST:event_txtNhapLaiActionPerformed

    private void txtSosanhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSosanhActionPerformed
        // TODO add your handling code here:
        try{
            txtKq.setText("");
            double num1 = Double.parseDouble(txta.getText());
            double num2 = Double.parseDouble(txtb.getText());
            if(num1 > num2){
                txtKq.setText("số a lớn hơn số b");
            }else if(num1 < num2){
                txtKq.setText("số a nhỏ hơn số b");
            } else{
                txtKq.setText("hai số bằng nhau");
            }
        }      
        catch (NumberFormatException e) {
            txtKq.setText("Vui lòng nhập số hợp lệ!");
        }
    }//GEN-LAST:event_txtSosanhActionPerformed

    private void txtHenhiphanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHenhiphanActionPerformed
        // TODO add your handling code here:
        try{
            txtKq.setText("");
            double num1 = Double.parseDouble(txta.getText());
            double num2 = Double.parseDouble(txtb.getText());
            
            String so1 = Integer.toBinaryString((int)num1);
            String so2 = Integer.toBinaryString((int)num2);
        
            txtKq.setText(" sang he nhi phan : " + so1 + " va "+so2 );
        }   
        catch (NumberFormatException e) {
            txtKq.setText("Vui lòng nhập số hợp lệ!");
        }
    }//GEN-LAST:event_txtHenhiphanActionPerformed

    private void txtHebatphanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHebatphanActionPerformed
        // TODO add your handling code here:
        try{
            txtKq.setText("");
            double num1 = Double.parseDouble(txta.getText());
            double num2 = Double.parseDouble(txtb.getText());
            String so1Octal = Integer.toOctalString((int) num1);
            String so2Octal = Integer.toOctalString((int) num2);

            txtKq.setText("sang he bat phan: " + so1Octal + " và " + so2Octal);
        }
        catch (NumberFormatException e) {
            txtKq.setText("Vui lòng nhập số hợp lệ!");
        }
    }//GEN-LAST:event_txtHebatphanActionPerformed

    private void txtHethaplucphanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHethaplucphanActionPerformed
        // TODO add your handling code here:
        try{
            txtKq.setText("");
            double num1 = Double.parseDouble(txta.getText());
            double num2 = Double.parseDouble(txtb.getText());
            String so1Hex = Integer.toHexString((int) num1);
            String so2Hex = Integer.toHexString((int) num2);

            txtKq.setText("sang he thap luc phan: " + so1Hex.toUpperCase() + " và " + so2Hex.toUpperCase());
        }
        catch (NumberFormatException e) {
            txtKq.setText("Vui lòng nhập số hợp lệ!");
        }
    }//GEN-LAST:event_txtHethaplucphanActionPerformed

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
            java.util.logging.Logger.getLogger(giaodien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(giaodien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(giaodien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(giaodien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new giaodien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton txtHebatphan;
    private javax.swing.JButton txtHenhiphan;
    private javax.swing.JButton txtHethaplucphan;
    private javax.swing.JLabel txtKq;
    private javax.swing.JButton txtNhapLai;
    private javax.swing.JButton txtSosanh;
    private javax.swing.JTextField txta;
    private javax.swing.JTextField txtb;
    // End of variables declaration//GEN-END:variables
}

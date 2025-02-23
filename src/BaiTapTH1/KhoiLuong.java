package BaiTapTH1;
import java.awt.Color;
public class KhoiLuong extends javax.swing.JFrame {
    public KhoiLuong() {
        initComponents();
        setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtInput = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        btnDoi = new javax.swing.JButton();
        BtnNhapLai = new javax.swing.JButton();
        BtnQuayLai1 = new javax.swing.JButton();
        lblKQ = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel1.setText("Chuyển đổi đơn vị khối lượng");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Nhập số");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "kg", "g", "yến", "lạng", "tấn", "tạ" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "kg", "g", "yến", "lạng", "tấn", "tạ" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        btnDoi.setBackground(new java.awt.Color(255, 102, 102));
        btnDoi.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDoi.setForeground(new java.awt.Color(255, 255, 255));
        btnDoi.setText("Đổi đơn vị");
        btnDoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoiActionPerformed(evt);
            }
        });

        BtnNhapLai.setBackground(new java.awt.Color(255, 102, 102));
        BtnNhapLai.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnNhapLai.setForeground(new java.awt.Color(255, 255, 255));
        BtnNhapLai.setText("Nhập lại");
        BtnNhapLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNhapLaiActionPerformed(evt);
            }
        });

        BtnQuayLai1.setBackground(new java.awt.Color(255, 102, 102));
        BtnQuayLai1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnQuayLai1.setForeground(new java.awt.Color(255, 255, 255));
        BtnQuayLai1.setText("Quay lại");
        BtnQuayLai1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnQuayLai1ActionPerformed(evt);
            }
        });

        lblKQ.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Đơn vị muốn đổi ");

        jLabel4.setBackground(new java.awt.Color(255, 102, 102));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Đơn vị ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblKQ, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btnDoi)
                        .addGap(36, 36, 36)
                        .addComponent(BtnNhapLai)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addComponent(BtnQuayLai1)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtInput, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(91, 91, 91)
                .addComponent(jLabel3)
                .addGap(68, 68, 68))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDoi)
                    .addComponent(BtnNhapLai)
                    .addComponent(BtnQuayLai1))
                .addGap(18, 18, 18)
                .addComponent(lblKQ, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoiActionPerformed
         try {
            double value = Double.parseDouble(txtInput.getText());
            String fromUnit = jComboBox1.getSelectedItem().toString();
            String toUnit = jComboBox2.getSelectedItem().toString();
            double result = convertUnits(value, fromUnit, toUnit);
            lblKQ.setForeground(Color.BLACK);
           lblKQ.setText("Kết quả: " + String.format("%.2f", result));
        } catch (Exception e) {
            lblKQ.setForeground(Color.RED);
            lblKQ.setText("Giá trị nhập vào không hợp lệ! Hãy nhập một số");
        }
          
    }//GEN-LAST:event_btnDoiActionPerformed

    private void BtnNhapLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNhapLaiActionPerformed
        lblKQ.setForeground(Color.BLACK);
        txtInput.setText("");
        lblKQ.setText("");
    }//GEN-LAST:event_BtnNhapLaiActionPerformed

    private void BtnQuayLai1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnQuayLai1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        FormChinh formChinh = new FormChinh();
        formChinh.setVisible(true);  
    }//GEN-LAST:event_BtnQuayLai1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed
private double convertUnits(double value, String from, String to) {
    // Chuyển đổi đơn vị khối lượng
double[] conversionFactors = {1.0, 1000.0, 10.0, 0.1, 1000.0, 100.0};
String[] units = {"kg", "g", "yến", "lạng", "tấn", "tạ"};

int fromIndex = java.util.Arrays.asList(units).indexOf(from);
int toIndex = java.util.Arrays.asList(units).indexOf(to);

if (fromIndex == -1 || toIndex == -1) {
    throw new IllegalArgumentException("Đơn vị không hợp lệ");
}

double fromFactor = conversionFactors[fromIndex];
double toFactor = conversionFactors[toIndex];
return value * (fromFactor / toFactor);
}
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KhoiLuong().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnNhapLai;
    private javax.swing.JButton BtnQuayLai1;
    private javax.swing.JButton btnDoi;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblKQ;
    private javax.swing.JTextField txtInput;
    // End of variables declaration//GEN-END:variables
}

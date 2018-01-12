package UI;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ViewEditChuHoDialog extends javax.swing.JDialog {

    public ViewEditChuHoDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        Initialize();
    }
    
    public void Initialize(){
        ((JTextField)tfNgaySinh.getDateEditor()).setEditable(false);
        btnLuu.setEnabled(false);
        tfHoVaTen.setEditable(false);
        cbbGioiTinh.setEnabled(false);
        tfQueQuan.setEditable(false);
        tfDanToc.setEditable(false);
        tfTonGiao.setEditable(false);
        tfCMND.setEditable(false);
        tfEmail.setEditable(false);
        tfDiaChi.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTieuDe = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tfHoVaTen = new javax.swing.JTextField();
        tfQueQuan = new javax.swing.JTextField();
        tfDanToc = new javax.swing.JTextField();
        tfCMND = new javax.swing.JTextField();
        tfEmail = new javax.swing.JTextField();
        tfDiaChi = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tfTonGiao = new javax.swing.JTextField();
        cbbGioiTinh = new javax.swing.JComboBox<>();
        tfNgaySinh = new com.toedter.calendar.JDateChooser();
        btnLuu = new javax.swing.JButton();
        btnThayDoi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(49, 166, 72));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 650));
        jPanel1.setLayout(null);

        lblTieuDe.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        lblTieuDe.setForeground(new java.awt.Color(255, 255, 255));
        lblTieuDe.setText("CHỦ HỘ");
        jPanel1.add(lblTieuDe);
        lblTieuDe.setBounds(330, 10, 120, 34);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Họ và tên:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(82, 74, 83, 22);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ngày sinh:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(81, 143, 84, 22);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Quê quán:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(82, 214, 83, 22);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Dân tộc:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(98, 285, 67, 22);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Số CMND:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(84, 355, 81, 22);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Email:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(120, 430, 50, 22);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Địa chỉ:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(105, 507, 60, 22);

        tfHoVaTen.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tfHoVaTen.setMinimumSize(new java.awt.Dimension(6, 50));
        tfHoVaTen.setPreferredSize(new java.awt.Dimension(60, 40));
        tfHoVaTen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfHoVaTenKeyTyped(evt);
            }
        });
        jPanel1.add(tfHoVaTen);
        tfHoVaTen.setBounds(183, 65, 405, 40);

        tfQueQuan.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tfQueQuan.setMinimumSize(new java.awt.Dimension(6, 50));
        tfQueQuan.setPreferredSize(new java.awt.Dimension(60, 40));
        jPanel1.add(tfQueQuan);
        tfQueQuan.setBounds(183, 205, 405, 40);

        tfDanToc.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tfDanToc.setMinimumSize(new java.awt.Dimension(6, 50));
        tfDanToc.setPreferredSize(new java.awt.Dimension(60, 40));
        jPanel1.add(tfDanToc);
        tfDanToc.setBounds(183, 276, 145, 40);

        tfCMND.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tfCMND.setMinimumSize(new java.awt.Dimension(6, 50));
        tfCMND.setPreferredSize(new java.awt.Dimension(60, 40));
        tfCMND.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfCMNDKeyTyped(evt);
            }
        });
        jPanel1.add(tfCMND);
        tfCMND.setBounds(183, 346, 145, 40);

        tfEmail.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tfEmail.setMinimumSize(new java.awt.Dimension(6, 50));
        tfEmail.setPreferredSize(new java.awt.Dimension(60, 40));
        jPanel1.add(tfEmail);
        tfEmail.setBounds(183, 422, 405, 40);

        tfDiaChi.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tfDiaChi.setMinimumSize(new java.awt.Dimension(6, 50));
        tfDiaChi.setPreferredSize(new java.awt.Dimension(60, 40));
        jPanel1.add(tfDiaChi);
        tfDiaChi.setBounds(183, 498, 405, 40);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Giới tính:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(401, 140, 72, 22);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Tôn giáo:");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(346, 285, 76, 22);

        tfTonGiao.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tfTonGiao.setMinimumSize(new java.awt.Dimension(6, 50));
        tfTonGiao.setPreferredSize(new java.awt.Dimension(6, 40));
        jPanel1.add(tfTonGiao);
        tfTonGiao.setBounds(440, 276, 148, 40);

        cbbGioiTinh.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cbbGioiTinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));
        cbbGioiTinh.setPreferredSize(new java.awt.Dimension(53, 40));
        jPanel1.add(cbbGioiTinh);
        cbbGioiTinh.setBounds(491, 131, 97, 40);

        tfNgaySinh.setDateFormatString("dd/MM/yyyy");
        tfNgaySinh.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tfNgaySinh.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfNgaySinhKeyTyped(evt);
            }
        });
        jPanel1.add(tfNgaySinh);
        tfNgaySinh.setBounds(183, 131, 166, 40);

        btnLuu.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnLuu.setForeground(new java.awt.Color(49, 166, 72));
        btnLuu.setText("LƯU");
        btnLuu.setToolTipText("Lưu nhân khẩu");
        btnLuu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLuu.setName("btnLuu"); // NOI18N
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });
        jPanel1.add(btnLuu);
        btnLuu.setBounds(630, 382, 135, 41);

        btnThayDoi.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnThayDoi.setForeground(new java.awt.Color(49, 166, 72));
        btnThayDoi.setText("THAY ĐỔI");
        btnThayDoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThayDoiActionPerformed(evt);
            }
        });
        jPanel1.add(btnThayDoi);
        btnThayDoi.setBounds(630, 240, 135, 41);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfHoVaTenKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfHoVaTenKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_tfHoVaTenKeyTyped

    private void tfCMNDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCMNDKeyTyped
        // TODO add your handling code here:
        char checkChar = evt.getKeyChar();
        if(!Character.isDigit(checkChar))
        evt.consume();
        if(tfCMND.getText().length()>8)
        evt.consume();
    }//GEN-LAST:event_tfCMNDKeyTyped

    private void tfNgaySinhKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNgaySinhKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNgaySinhKeyTyped

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        // TODO add your handling code here:
        String strHoTen = tfHoVaTen.getText();
        String strNgaySinh = ((JTextField)tfNgaySinh.getDateEditor().getUiComponent()).getText();
        String strGioiTinh = cbbGioiTinh.getSelectedItem().toString();
        String strQueQuan = tfQueQuan.getText();
        String strDanToc = tfDanToc.getText();
        String strTonGiao = tfTonGiao.getText();
        String strCMND = tfCMND.getText();
        String strEmail = tfEmail.getText();
        String strDiaChi = tfDiaChi.getText();

        String pattern = "[a-zA-Zàáảãạâấầẩẫậăắằẳẵặéèẻẽẹêếềểễệýỳỷỹỵúùủũụưứừửữựíìỉĩịóòỏõọôốồổỗộơớờởỡợ\\s*]+";

        Date _today = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Calendar cal = Calendar.getInstance();
        cal.setTime(_today);
        int _namHienTai = cal.get(Calendar.YEAR);

        Date _ngaySinh = new Date();
        try {
            _ngaySinh = sdf.parse(strNgaySinh);
        } catch (ParseException ex) {
            Logger.getLogger(ViewEditChuHoDialog.class.getName()).log(Level.SEVERE, null, ex);
        }
        cal.setTime(_ngaySinh);
        int _namSinh = cal.get(Calendar.YEAR);

        int _tuoi = _namHienTai - _namSinh;

        int errorFlag = 0;
        if(    strHoTen.length()<1    || strDiaChi.length()<1
            || strNgaySinh.length()<1 || strQueQuan.length()<1
            || strDanToc.length()<1   || strTonGiao.length()<1
            || strCMND.length()<1     || strEmail.length()<1){
            errorFlag = 1;  // Lỗi nhập bỏ trống.
        }
        else{
            if(!strHoTen.matches(pattern))
                errorFlag = 2;  // Lỗi nhập sai định dạng họ tên
            else{
                if(_tuoi <18 )
                    errorFlag = 3;  // Lỗi nhập chưa đủ tuổi
                else{
                    if(strCMND.length()<9)
                        errorFlag = 4;  // CMND sai định dạng
                }
            }
        }
        switch(errorFlag){
            case 0:
                JOptionPane.showMessageDialog(rootPane, "Thêm thành công!");
                dispose();
                break;
            case 1:
                JOptionPane.showMessageDialog(rootPane, "Vui lòng nhập đủ dữ liệu!");
                break;
            case 2:
                JOptionPane.showMessageDialog(rootPane, "Họ tên sai định dạng!");
                break;
            case 3:
                JOptionPane.showMessageDialog(rootPane, "Chưa đủ tuổi!");
                break;
            case 4:
                JOptionPane.showMessageDialog(rootPane, "CMND chưa đủ 9 kí tự!");
                break;
            default:
            break;
        }
    }//GEN-LAST:event_btnLuuActionPerformed

    private void btnThayDoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThayDoiActionPerformed
        // TODO add your handling code here:
        btnLuu.setEnabled(true);
        tfHoVaTen.setEditable(true);
        cbbGioiTinh.setEnabled(true);
        tfQueQuan.setEditable(true);
        tfDanToc.setEditable(true);
        tfTonGiao.setEditable(true);
        //tfCMND.setEditable(true);
        tfEmail.setEditable(true);
        tfDiaChi.setEditable(true);
        btnThayDoi.setEnabled(false);
    }//GEN-LAST:event_btnThayDoiActionPerformed

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
            java.util.logging.Logger.getLogger(ViewEditChuHoDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewEditChuHoDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewEditChuHoDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewEditChuHoDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ViewEditChuHoDialog dialog = new ViewEditChuHoDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnThayDoi;
    private javax.swing.JComboBox<String> cbbGioiTinh;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblTieuDe;
    private javax.swing.JTextField tfCMND;
    private javax.swing.JTextField tfDanToc;
    private javax.swing.JTextField tfDiaChi;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfHoVaTen;
    private com.toedter.calendar.JDateChooser tfNgaySinh;
    private javax.swing.JTextField tfQueQuan;
    private javax.swing.JTextField tfTonGiao;
    // End of variables declaration//GEN-END:variables
}

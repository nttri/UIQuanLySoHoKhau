package UI;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ViewEditAdminDialog extends javax.swing.JDialog {

    public ViewEditAdminDialog(java.awt.Frame parent, boolean modal) {
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
        tfSDT.setEditable(false);
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
        jLabel8 = new javax.swing.JLabel();
        tfHoVaTen = new javax.swing.JTextField();
        tfQueQuan = new javax.swing.JTextField();
        tfDanToc = new javax.swing.JTextField();
        tfCMND = new javax.swing.JTextField();
        tfDiaChi = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tfTonGiao = new javax.swing.JTextField();
        tfSDT = new javax.swing.JTextField();
        cbbGioiTinh = new javax.swing.JComboBox<>();
        tfNgaySinh = new com.toedter.calendar.JDateChooser();
        btnLuu = new javax.swing.JButton();
        btnThayDoi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(49, 166, 72));

        lblTieuDe.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        lblTieuDe.setForeground(new java.awt.Color(255, 255, 255));
        lblTieuDe.setText("NGƯỜI QUẢN LÝ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Họ và tên:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ngày sinh:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Quê quán:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Dân tộc:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Số CMND:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Địa chỉ:");

        tfHoVaTen.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tfHoVaTen.setMinimumSize(new java.awt.Dimension(6, 50));
        tfHoVaTen.setPreferredSize(new java.awt.Dimension(60, 40));
        tfHoVaTen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfHoVaTenKeyTyped(evt);
            }
        });

        tfQueQuan.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tfQueQuan.setMinimumSize(new java.awt.Dimension(6, 50));
        tfQueQuan.setPreferredSize(new java.awt.Dimension(60, 40));

        tfDanToc.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tfDanToc.setMinimumSize(new java.awt.Dimension(6, 50));
        tfDanToc.setPreferredSize(new java.awt.Dimension(60, 40));

        tfCMND.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tfCMND.setMinimumSize(new java.awt.Dimension(6, 50));
        tfCMND.setPreferredSize(new java.awt.Dimension(60, 40));
        tfCMND.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfCMNDKeyTyped(evt);
            }
        });

        tfDiaChi.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tfDiaChi.setMinimumSize(new java.awt.Dimension(6, 50));
        tfDiaChi.setPreferredSize(new java.awt.Dimension(60, 40));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Giới tính:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Tôn giáo:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("SĐT:");

        tfTonGiao.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tfTonGiao.setMinimumSize(new java.awt.Dimension(6, 50));
        tfTonGiao.setPreferredSize(new java.awt.Dimension(6, 40));

        tfSDT.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tfSDT.setMinimumSize(new java.awt.Dimension(6, 50));
        tfSDT.setPreferredSize(new java.awt.Dimension(6, 40));
        tfSDT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfSDTKeyTyped(evt);
            }
        });

        cbbGioiTinh.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cbbGioiTinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));
        cbbGioiTinh.setPreferredSize(new java.awt.Dimension(53, 40));

        tfNgaySinh.setDateFormatString("dd/MM/yyyy");
        tfNgaySinh.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tfNgaySinh.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfNgaySinhKeyTyped(evt);
            }
        });

        btnLuu.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnLuu.setForeground(new java.awt.Color(49, 166, 72));
        btnLuu.setText("LƯU");
        btnLuu.setToolTipText("Lưu thông tin");
        btnLuu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLuu.setName("btnLuu"); // NOI18N
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });

        btnThayDoi.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnThayDoi.setForeground(new java.awt.Color(49, 166, 72));
        btnThayDoi.setText("THAY ĐỔI");
        btnThayDoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThayDoiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(tfHoVaTen, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(tfNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(cbbGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel5)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfQueQuan, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tfDanToc, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(tfTonGiao, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(40, 40, 40)
                        .addComponent(btnThayDoi, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tfCMND, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)
                                .addComponent(tfSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tfDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(lblTieuDe, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTieuDe)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel2))
                    .addComponent(tfHoVaTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel3))
                    .addComponent(tfNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel10))
                    .addComponent(cbbGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel4)
                        .addGap(49, 49, 49)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfQueQuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnThayDoi, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfDanToc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel11))
                            .addComponent(tfTonGiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfCMND, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel12))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tfSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void tfSDTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSDTKeyTyped
        // TODO add your handling code here:
        char checkChar = evt.getKeyChar();
        if(!Character.isDigit(checkChar))
        evt.consume();
        if(tfSDT.getText().length()>10)
        evt.consume();
    }//GEN-LAST:event_tfSDTKeyTyped

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
        String strSDT = tfSDT.getText();
        String strDiaChi = tfDiaChi.getText();

        String patternName = "[a-zA-Zàáảãạâấầẩẫậăắằẳẵặéèẻẽẹêếềểễệýỳỷỹỵúùủũụưứừửữựíìỉĩịóòỏõọôốồổỗộơớờởỡợ\\s*]+";
        String patternSDT = "0\\d{9,10}";

        Date _today = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Calendar cal = Calendar.getInstance();
        cal.setTime(_today);
        int _namHienTai = cal.get(Calendar.YEAR);

        Date _ngaySinh = new Date();
        try {
            _ngaySinh = sdf.parse(strNgaySinh);
        } catch (ParseException ex) {
            Logger.getLogger(ViewEditModDialog.class.getName()).log(Level.SEVERE, null, ex);
        }
        cal.setTime(_ngaySinh);
        int _namSinh = cal.get(Calendar.YEAR);

        int _tuoi = _namHienTai - _namSinh;

        int errorFlag = 0;
        if(    strHoTen.length()<1        || strNgaySinh.length()<1
            || strQueQuan.length()<1      || strDiaChi.length()<1
            || strDanToc.length()<1       || strTonGiao.length()<1
            || strCMND.length()<1         || strSDT.length()<1){
            errorFlag = 1;  // Lỗi nhập bỏ trống.
        }
        else{
            if(!strHoTen.matches(patternName))
                errorFlag = 2;  // Lỗi nhập sai định dạng họ tên
            else{
                if(_tuoi <18 )
                    errorFlag = 3;  // Lỗi nhập chưa đủ tuổi
                else{
                    if(strCMND.length()<9)
                        errorFlag = 4;  // CMND sai định dạng
                    else{
                        if(!strSDT.matches(patternSDT))
                            errorFlag = 5;  // Lỗi nhập sai định dạng Sđt
                    }
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
            case 5:
                JOptionPane.showMessageDialog(rootPane, "SĐT phải có dạng 0xxxxxxxxxx!");
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
        tfSDT.setEditable(true);
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
            java.util.logging.Logger.getLogger(ViewEditAdminDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewEditAdminDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewEditAdminDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewEditAdminDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ViewEditAdminDialog dialog = new ViewEditAdminDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblTieuDe;
    private javax.swing.JTextField tfCMND;
    private javax.swing.JTextField tfDanToc;
    private javax.swing.JTextField tfDiaChi;
    private javax.swing.JTextField tfHoVaTen;
    private com.toedter.calendar.JDateChooser tfNgaySinh;
    private javax.swing.JTextField tfQueQuan;
    private javax.swing.JTextField tfSDT;
    private javax.swing.JTextField tfTonGiao;
    // End of variables declaration//GEN-END:variables
}

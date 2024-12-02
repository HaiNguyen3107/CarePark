package UI;

import DAO.NhanVienDAO;
import DTO.NhanVienDTO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author quang
 */
public class TaiKhoan extends javax.swing.JFrame {

    private String ten;
    public TaiKhoan(String tenNhanVien) {
        initComponents();
        chaomungTxt.setText(tenNhanVien + " !");
        this.ten = tenNhanVien;
        loadUserData(ten); 
    }
    

    private void loadUserData(String s) {
        try {
            List<NhanVienDTO> lst = new ArrayList<>();
            lst = NhanVienDAO.findByFullName(s);
            for (NhanVienDTO x : lst) {
                canCuocTxt.setText(x.getCccd());
                tenTxt.setText(x.getTenNhanVien());
                sdtTxt.setText(x.getSoDienThoai());
                taiKhoanTxt.setText(x.getTaiKhoan());
                pwdTxt.setText(x.getMatKhau());
            }           
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Không thể tải thông tin người dùng!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        nhanXeBtn = new javax.swing.JButton();
        traxeBtn = new javax.swing.JButton();
        dangkyVTBtn = new javax.swing.JButton();
        taiKhoanBtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        dangXuatBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        chaomungTxt = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        taiKhoanTxt = new javax.swing.JTextField();
        luuBtn = new javax.swing.JButton();
        tenTxt = new javax.swing.JTextField();
        sdtTxt = new javax.swing.JTextField();
        canCuocTxt = new javax.swing.JTextField();
        pwdTxt = new javax.swing.JPasswordField();
        suaBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1686, 606));

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        nhanXeBtn.setBackground(new java.awt.Color(254, 183, 19));
        nhanXeBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        nhanXeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_sedan_32px.png"))); // NOI18N
        nhanXeBtn.setText("Nhận Xe");
        nhanXeBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        nhanXeBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        nhanXeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nhanXeBtnActionPerformed(evt);
            }
        });

        traxeBtn.setBackground(new java.awt.Color(254, 183, 19));
        traxeBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        traxeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_car_theft_32px.png"))); // NOI18N
        traxeBtn.setText("Trả Xe");
        traxeBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        traxeBtn.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        traxeBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        traxeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                traxeBtnActionPerformed(evt);
            }
        });

        dangkyVTBtn.setBackground(new java.awt.Color(254, 183, 19));
        dangkyVTBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        dangkyVTBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_membership_card_32px_1.png"))); // NOI18N
        dangkyVTBtn.setText("Đăng Kí Vé Tháng");
        dangkyVTBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        dangkyVTBtn.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        dangkyVTBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        dangkyVTBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dangkyVTBtnActionPerformed(evt);
            }
        });

        taiKhoanBtn.setBackground(new java.awt.Color(254, 183, 19));
        taiKhoanBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        taiKhoanBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_user_32px_1.png"))); // NOI18N
        taiKhoanBtn.setText("Tài Khoản");
        taiKhoanBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        taiKhoanBtn.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        taiKhoanBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        taiKhoanBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taiKhoanBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(191, Short.MAX_VALUE)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(19, 19, 19)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(dangkyVTBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(traxeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nhanXeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(taiKhoanBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap(20, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator3)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(177, 177, 177)
                    .addComponent(nhanXeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(traxeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(dangkyVTBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(taiKhoanBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(178, Short.MAX_VALUE)))
        );

        jPanel4.setBackground(new java.awt.Color(0, 153, 255));

        dangXuatBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        dangXuatBtn.setText("Đăng Xuất");
        dangXuatBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dangXuatBtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel2.setText("Chào mừng Nhân Viên:");

        chaomungTxt.setBackground(new java.awt.Color(0, 153, 255));
        chaomungTxt.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        chaomungTxt.setBorder(null);

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chaomungTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 358, Short.MAX_VALUE)
                .addComponent(dangXuatBtn)
                .addGap(27, 27, 27))
            .addComponent(jSeparator2)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dangXuatBtn)
                    .addComponent(jLabel2)
                    .addComponent(chaomungTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel5.setBackground(new java.awt.Color(0, 153, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Tài Khoản");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Họ và Tên :");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("Số Điện Thoại :");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setText("CCCD :");

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setText("Tài Khoản :");

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setText("Mật Khẩu :");

        taiKhoanTxt.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        taiKhoanTxt.setEnabled(false);
        taiKhoanTxt.setFocusable(false);

        luuBtn.setBackground(new java.awt.Color(254, 183, 19));
        luuBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        luuBtn.setText("Lưu");
        luuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                luuBtnActionPerformed(evt);
            }
        });

        tenTxt.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tenTxt.setEnabled(false);

        sdtTxt.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        sdtTxt.setEnabled(false);

        canCuocTxt.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        canCuocTxt.setEnabled(false);

        pwdTxt.setEnabled(false);

        suaBtn.setBackground(new java.awt.Color(254, 183, 19));
        suaBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        suaBtn.setText("Sửa");
        suaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suaBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(411, 411, 411)
                        .addComponent(jLabel1))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(canCuocTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                                    .addComponent(tenTxt)
                                    .addComponent(sdtTxt))
                                .addGap(90, 90, 90)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel10))
                                .addGap(22, 22, 22)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(taiKhoanTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                                    .addComponent(pwdTxt)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(luuBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(126, 126, 126)
                                .addComponent(suaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(canCuocTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(taiKhoanTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tenTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel11)
                    .addComponent(pwdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sdtTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(luuBtn)
                    .addComponent(suaBtn))
                .addGap(162, 162, 162))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 940, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void luuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_luuBtnActionPerformed
         try {
            String id = canCuocTxt.getText();
            String fullName = tenTxt.getText();
            String phoneNumber = sdtTxt.getText();
            String username = taiKhoanTxt.getText();
            String password = pwdTxt.getText();
            chaomungTxt.setText(fullName + " !");
            ten = fullName;
            
            NhanVienDTO employee = new NhanVienDTO(id, fullName, phoneNumber, username, password);

            
            NhanVienDAO.update(employee);

            
            JOptionPane.showMessageDialog(this, "Cập nhật thông tin thành công!", "Thành công", JOptionPane.INFORMATION_MESSAGE);

           
            tenTxt.setEnabled(false);
            canCuocTxt.setEnabled(false);
            sdtTxt.setEnabled(false);
            pwdTxt.setEnabled(false);
            luuBtn.setEnabled(false);
            suaBtn.setEnabled(true);

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Đã xảy ra lỗi: " + e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_luuBtnActionPerformed

    private void suaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suaBtnActionPerformed
        tenTxt.setEnabled(true);
        sdtTxt.setEnabled(true);
        canCuocTxt.setEnabled(true);
        pwdTxt.setEnabled(true);

        luuBtn.setEnabled(true);
        suaBtn.setEnabled(false);
    }//GEN-LAST:event_suaBtnActionPerformed

    private void dangXuatBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dangXuatBtnActionPerformed
        new DangKyVeThang(ten).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_dangXuatBtnActionPerformed

    private void nhanXeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nhanXeBtnActionPerformed
        new NhanXe(ten).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_nhanXeBtnActionPerformed

    private void traxeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_traxeBtnActionPerformed
        new TraXe(ten).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_traxeBtnActionPerformed

    private void dangkyVTBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dangkyVTBtnActionPerformed
        new DangKyVeThang(ten).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_dangkyVTBtnActionPerformed

    private void taiKhoanBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taiKhoanBtnActionPerformed
        new TaiKhoan(ten).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_taiKhoanBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField canCuocTxt;
    private javax.swing.JTextField chaomungTxt;
    private javax.swing.JButton dangXuatBtn;
    private javax.swing.JButton dangkyVTBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JButton luuBtn;
    private javax.swing.JButton nhanXeBtn;
    private javax.swing.JPasswordField pwdTxt;
    private javax.swing.JTextField sdtTxt;
    private javax.swing.JButton suaBtn;
    private javax.swing.JButton taiKhoanBtn;
    private javax.swing.JTextField taiKhoanTxt;
    private javax.swing.JTextField tenTxt;
    private javax.swing.JButton traxeBtn;
    // End of variables declaration//GEN-END:variables
}
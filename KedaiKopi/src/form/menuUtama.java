package form;

/*
---------------- Author ----------------
Nama    : Arya Dwi Putra
Website : https://aryadev.my.id/
*/

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import method.koneksi;
import method.entitas;
import java.awt.Dimension;
import java.awt.Toolkit;

public class menuUtama extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
    String username = entitas.getUsername();
    String level = entitas.getLevel();
    
    public menuUtama() {
        initComponents();
        conn = koneksi.koneksi();
        String query = "SELECT username, level, nama_lengkap, jenis_kelamin, alamat FROM user JOIN user_profile USING(id_profile) WHERE username=?";
        try{
            pst = conn.prepareStatement(query);
            pst.setString(1, username);
            rs = pst.executeQuery();
            while(rs.next()){
                loginUsername.setText(username);
                loginLevel.setText(level);
                txtNamaLengkap.setText(rs.getString("nama_lengkap"));
                txtJenisKelamin.setText(rs.getString("jenis_kelamin"));
                txtAlamat.setText(rs.getString("alamat"));
            }
        }
        
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        if(level.equals("kasir")){
            mnDataMenu.setEnabled(false);
            mnDataPenjualan.setEnabled(false);
            mnDataUser.setEnabled(false);
        }else{
        }
        Dimension layar = Toolkit.getDefaultToolkit().getScreenSize();

        // membuat titik x dan y
        int x = layar.width / 2  - this.getSize().width / 2;
        int y = layar.height / 2 - this.getSize().height / 2;

        this.setLocation(x, y);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Header = new javax.swing.JPanel();
        login = new javax.swing.JLabel();
        kopiKita = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        loginAS = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Username = new javax.swing.JLabel();
        Level = new javax.swing.JLabel();
        loginUsername = new javax.swing.JLabel();
        loginLevel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNamaLengkap = new javax.swing.JTextField();
        txtJenisKelamin = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Footer = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAlamat = new javax.swing.JTextArea();
        loginAS1 = new javax.swing.JLabel();
        mnKasir = new javax.swing.JMenuBar();
        mnUtama = new javax.swing.JMenu();
        mnTransaksi = new javax.swing.JMenuItem();
        mnDataMenu = new javax.swing.JMenuItem();
        mnDataPenjualan = new javax.swing.JMenuItem();
        mnDataUser = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mnLogout = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Header.setBackground(new java.awt.Color(0, 0, 0));

        login.setBackground(new java.awt.Color(255, 255, 255));
        login.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        login.setForeground(new java.awt.Color(255, 255, 255));
        login.setText("Menu Utama");

        kopiKita.setBackground(new java.awt.Color(255, 255, 255));
        kopiKita.setFont(new java.awt.Font("Lucida Handwriting", 0, 18)); // NOI18N
        kopiKita.setForeground(new java.awt.Color(255, 255, 255));
        kopiKita.setText("Kopi Kita");

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLayout.createSequentialGroup()
                .addContainerGap(239, Short.MAX_VALUE)
                .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HeaderLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(kopiKita))
                    .addComponent(login))
                .addGap(238, 238, 238))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(login)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(kopiKita)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        loginAS.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        loginAS.setText("Login sebagai");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText(":");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText(":");

        Username.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Username.setText("Username");

        Level.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Level.setText("Level");

        loginUsername.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        loginUsername.setText("Username");

        loginLevel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        loginLevel.setText("Level");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(loginAS))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Level)
                            .addComponent(Username))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(loginUsername)
                            .addComponent(loginLevel))))
                .addContainerGap(387, Short.MAX_VALUE))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(loginAS)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Username)
                    .addComponent(loginUsername))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Level)
                    .addComponent(loginLevel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Nama Lengkap");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Jenis Kelamin");

        txtNamaLengkap.setEditable(false);
        txtNamaLengkap.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtJenisKelamin.setEditable(false);
        txtJenisKelamin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Alamat");

        Footer.setBackground(new java.awt.Color(0, 0, 0));

        jLabel11.setFont(new java.awt.Font("Leelawadee UI Semilight", 2, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Created by Arya Dwi Putra");

        javax.swing.GroupLayout FooterLayout = new javax.swing.GroupLayout(Footer);
        Footer.setLayout(FooterLayout);
        FooterLayout.setHorizontalGroup(
            FooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FooterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        FooterLayout.setVerticalGroup(
            FooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FooterLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addContainerGap())
        );

        txtAlamat.setEditable(false);
        txtAlamat.setColumns(20);
        txtAlamat.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        txtAlamat.setRows(5);
        txtAlamat.setTabSize(5);
        txtAlamat.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(txtAlamat);

        loginAS1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        loginAS1.setText("Profile");

        mnUtama.setText("Menu");

        mnTransaksi.setText("Transaksi");
        mnTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnTransaksiActionPerformed(evt);
            }
        });
        mnUtama.add(mnTransaksi);

        mnDataMenu.setText("Data Menu");
        mnDataMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnDataMenuMouseClicked(evt);
            }
        });
        mnDataMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnDataMenuActionPerformed(evt);
            }
        });
        mnUtama.add(mnDataMenu);

        mnDataPenjualan.setText("Data Penjualan");
        mnDataPenjualan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnDataPenjualanActionPerformed(evt);
            }
        });
        mnUtama.add(mnDataPenjualan);

        mnDataUser.setText("Data User");
        mnDataUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnDataUserActionPerformed(evt);
            }
        });
        mnUtama.add(mnDataUser);
        mnUtama.add(jSeparator2);

        mnLogout.setText("Logout");
        mnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnLogoutActionPerformed(evt);
            }
        });
        mnUtama.add(mnLogout);

        mnKasir.add(mnUtama);

        jMenu2.setText("Help");
        mnKasir.add(jMenu2);

        setJMenuBar(mnKasir);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Footer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loginAS1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel10))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtJenisKelamin, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNamaLengkap, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(loginAS1)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNamaLengkap, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtJenisKelamin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(Footer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    private void mnDataMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnDataMenuMouseClicked
        
    }//GEN-LAST:event_mnDataMenuMouseClicked

    private void mnDataMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnDataMenuActionPerformed
        if(level.equals("kasir")){
            JOptionPane.showMessageDialog(null, "Hanya Admin yang dapat mengubah data menu!");
        }else{
            new dataMenu().setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_mnDataMenuActionPerformed

    private void mnDataPenjualanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnDataPenjualanActionPerformed
        if(level.equals("kasir")){
            JOptionPane.showMessageDialog(null, "Hanya Admin yang dapat membuka data penjualan!");
        }else{
            new dataPenjualan().setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_mnDataPenjualanActionPerformed

    private void mnDataUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnDataUserActionPerformed
        if(level.equals("kasir")){
            JOptionPane.showMessageDialog(null, "Hanya Admin yang dapat membuat user baru!");
        }else{
            new dataUser().setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_mnDataUserActionPerformed

    private void mnTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnTransaksiActionPerformed
        new transaksi().setVisible(true);
        dispose();
    }//GEN-LAST:event_mnTransaksiActionPerformed

    private void mnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnLogoutActionPerformed
        JOptionPane.showMessageDialog(null, "Anda berhasil logout");
        new login().setVisible(true);
        dispose();
    }//GEN-LAST:event_mnLogoutActionPerformed

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
            java.util.logging.Logger.getLogger(menuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Footer;
    private javax.swing.JPanel Header;
    private javax.swing.JLabel Level;
    private javax.swing.JLabel Username;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JLabel kopiKita;
    private javax.swing.JLabel login;
    private javax.swing.JLabel loginAS;
    private javax.swing.JLabel loginAS1;
    private javax.swing.JLabel loginLevel;
    private javax.swing.JLabel loginUsername;
    private javax.swing.JMenuItem mnDataMenu;
    private javax.swing.JMenuItem mnDataPenjualan;
    private javax.swing.JMenuItem mnDataUser;
    private javax.swing.JMenuBar mnKasir;
    private javax.swing.JMenuItem mnLogout;
    private javax.swing.JMenuItem mnTransaksi;
    private javax.swing.JMenu mnUtama;
    private javax.swing.JTextArea txtAlamat;
    private javax.swing.JTextField txtJenisKelamin;
    private javax.swing.JTextField txtNamaLengkap;
    // End of variables declaration//GEN-END:variables
}

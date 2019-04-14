/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookingfutsal;
import static bookingfutsal.Utama.status;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author xatalie
 */
public class Update extends javax.swing.JFrame {
    static Database database;
    Utama u;
    static String  rblapangan;
    Date date;
    /**
     * Creates new form Utama
     */
    public Update() {
        initComponents();
        database = new Database();
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        //get current date time with Date()
        date = new Date();
        tftanggal.setText(dateFormat.format(date));
        tfnama.setText(u.nama);
        tfbayar.setText(Integer.toString(u.bking));
        tfsisa.setText(Integer.toString(u.sisa));
        tftotal.setText(Integer.toString(u.tot));
        
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
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        lnama = new javax.swing.JLabel();
        tfnama = new javax.swing.JTextField();
        ltanggal = new javax.swing.JLabel();
        tftanggal = new javax.swing.JTextField();
        llapangan = new javax.swing.JLabel();
        rblapangan1 = new javax.swing.JRadioButton();
        rblapangan2 = new javax.swing.JRadioButton();
        lkategori = new javax.swing.JLabel();
        cbkategori1 = new javax.swing.JComboBox<>();
        cbkategori2 = new javax.swing.JComboBox<>();
        lbayar = new javax.swing.JLabel();
        tfbayar = new javax.swing.JTextField();
        lsisa = new javax.swing.JLabel();
        tfsisa = new javax.swing.JTextField();
        ltotal = new javax.swing.JLabel();
        tftotal = new javax.swing.JTextField();
        judul = new javax.swing.JLabel();
        lupdate = new javax.swing.JLabel();
        lkembali = new javax.swing.JLabel();
        backgrond1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vamos Futsal");

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(null);

        jPanel3.setLayout(null);

        lnama.setFont(new java.awt.Font("Century Schoolbook L", 1, 14)); // NOI18N
        lnama.setText("Nama");
        jPanel3.add(lnama);
        lnama.setBounds(350, 90, 41, 15);

        tfnama.setFont(new java.awt.Font("Century Schoolbook L", 0, 12)); // NOI18N
        jPanel3.add(tfnama);
        tfnama.setBounds(520, 80, 320, 30);

        ltanggal.setFont(new java.awt.Font("Century Schoolbook L", 1, 14)); // NOI18N
        ltanggal.setText("Tanggal");
        jPanel3.add(ltanggal);
        ltanggal.setBounds(350, 140, 70, 15);

        tftanggal.setFont(new java.awt.Font("Century Schoolbook L", 0, 12)); // NOI18N
        jPanel3.add(tftanggal);
        tftanggal.setBounds(520, 130, 320, 30);

        llapangan.setFont(new java.awt.Font("Century Schoolbook L", 1, 14)); // NOI18N
        llapangan.setText("Lapangan");
        jPanel3.add(llapangan);
        llapangan.setBounds(350, 190, 80, 15);

        rblapangan1.setFont(new java.awt.Font("Century Schoolbook L", 1, 12)); // NOI18N
        rblapangan1.setText("Lapangan 1");
        rblapangan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rblapangan1ActionPerformed(evt);
            }
        });
        jPanel3.add(rblapangan1);
        rblapangan1.setBounds(520, 180, 120, 21);

        rblapangan2.setFont(new java.awt.Font("Century Schoolbook L", 1, 12)); // NOI18N
        rblapangan2.setText("Lapangan 2");
        rblapangan2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rblapangan2ActionPerformed(evt);
            }
        });
        jPanel3.add(rblapangan2);
        rblapangan2.setBounds(710, 180, 130, 21);

        lkategori.setFont(new java.awt.Font("Century Schoolbook L", 1, 14)); // NOI18N
        lkategori.setText("Kategori");
        jPanel3.add(lkategori);
        lkategori.setBounds(350, 240, 70, 15);

        cbkategori1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pagi-Siang", "Sore-Malam" }));
        jPanel3.add(cbkategori1);
        cbkategori1.setBounds(520, 230, 120, 24);

        cbkategori2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Week Day", "Week End" }));
        jPanel3.add(cbkategori2);
        cbkategori2.setBounds(710, 230, 130, 24);

        lbayar.setFont(new java.awt.Font("Century Schoolbook L", 1, 14)); // NOI18N
        lbayar.setText("Bayar Booking");
        jPanel3.add(lbayar);
        lbayar.setBounds(350, 290, 110, 15);

        tfbayar.setFont(new java.awt.Font("Century Schoolbook L", 0, 12)); // NOI18N
        jPanel3.add(tfbayar);
        tfbayar.setBounds(520, 280, 320, 30);

        lsisa.setFont(new java.awt.Font("Century Schoolbook L", 1, 14)); // NOI18N
        lsisa.setText("Sisa");
        jPanel3.add(lsisa);
        lsisa.setBounds(350, 340, 40, 15);

        tfsisa.setFont(new java.awt.Font("Century Schoolbook L", 0, 12)); // NOI18N
        jPanel3.add(tfsisa);
        tfsisa.setBounds(520, 330, 320, 30);

        ltotal.setFont(new java.awt.Font("Century Schoolbook L", 1, 18)); // NOI18N
        ltotal.setText("Total");
        ltotal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ltotal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ltotalMouseClicked(evt);
            }
        });
        jPanel3.add(ltotal);
        ltotal.setBounds(350, 390, 60, 20);

        tftotal.setFont(new java.awt.Font("Century Schoolbook L", 0, 12)); // NOI18N
        jPanel3.add(tftotal);
        tftotal.setBounds(520, 380, 320, 30);

        judul.setFont(new java.awt.Font("Century Schoolbook L", 1, 18)); // NOI18N
        judul.setText("Booking Vamos Futsal");
        jPanel3.add(judul);
        judul.setBounds(350, 20, 220, 19);

        lupdate.setFont(new java.awt.Font("Century Schoolbook L", 1, 20)); // NOI18N
        lupdate.setText("Update");
        lupdate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lupdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lupdateMouseClicked(evt);
            }
        });
        jPanel3.add(lupdate);
        lupdate.setBounds(520, 430, 90, 30);

        lkembali.setFont(new java.awt.Font("Century Schoolbook L", 1, 14)); // NOI18N
        lkembali.setText("Back");
        lkembali.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lkembali.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lkembaliMouseClicked(evt);
            }
        });
        jPanel3.add(lkembali);
        lkembali.setBounds(30, 435, 50, 20);

        backgrond1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/background2.jpg"))); // NOI18N
        jPanel3.add(backgrond1);
        backgrond1.setBounds(0, 0, 860, 510);

        jTabbedPane2.addTab("Booking", jPanel3);

        jPanel1.add(jTabbedPane2);
        jTabbedPane2.setBounds(0, 0, 860, 510);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 860, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lupdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lupdateMouseClicked
        // TODO add your handling code here:
        try {
            String sql = "UPDATE tiket SET nama='"+tfnama.getText()+"',tanggal='"+tftanggal.getText()+"',lapangan='"+rblapangan+"',kategori1='"+cbkategori1.getModel().getSelectedItem().toString()+"',kategori2='"+cbkategori2.getModel().getSelectedItem().toString()+"',booking='"+Integer.parseInt(tfbayar.getText())+"',sisa='"+Integer.parseInt(tfsisa.getText())+"',total='"+Integer.parseInt(tftotal.getText())+"',status='"+u.status+"' WHERE id_t='"+u.id+"'";
            PreparedStatement pst;
            pst = database.conn.prepareStatement(sql);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Update Berhasil");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan");
        }
    }//GEN-LAST:event_lupdateMouseClicked

    private void ltotalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ltotalMouseClicked
        if("Pagi-Siang".equals(cbkategori1.getModel().getSelectedItem().toString())&&"Week Day".equals(cbkategori2.getModel().getSelectedItem().toString())){
            tftotal.setText("80000");
            Integer bayar = Integer.parseInt(tfbayar.getText());
            Integer sisa;
            Integer total = Integer.parseInt(tftotal.getText());
            sisa = total - bayar;
            tfsisa.setText(sisa.toString());
        }else if("Sore-Malam".equals(cbkategori1.getModel().getSelectedItem().toString())&&"Week Day".equals(cbkategori2.getModel().getSelectedItem().toString())){
            tftotal.setText("100000");
            Integer bayar = Integer.parseInt(tfbayar.getText());
            Integer sisa;
            Integer total = Integer.parseInt(tftotal.getText());
            sisa = total - bayar;
            tfsisa.setText(sisa.toString());
        }else if("Pagi-Siang".equals(cbkategori1.getModel().getSelectedItem().toString())&&"Week End".equals(cbkategori2.getModel().getSelectedItem().toString())){
            tftotal.setText("120000");
            Integer bayar = Integer.parseInt(tfbayar.getText());
            Integer sisa;
            Integer total = Integer.parseInt(tftotal.getText());
            sisa = total - bayar;
            tfsisa.setText(sisa.toString());
        }else if("Sore-Malam".equals(cbkategori1.getModel().getSelectedItem().toString())&&"Week End".equals(cbkategori2.getModel().getSelectedItem().toString())){
            tftotal.setText("140000");
            Integer bayar = Integer.parseInt(tfbayar.getText());
            Integer sisa;
            Integer total = Integer.parseInt(tftotal.getText());
            sisa = total - bayar;
            tfsisa.setText(sisa.toString());
        }
        if(tfbayar.getText().equals(tftotal.getText())){
            status = "Lunas";
        }else{
            status= "Belum Lunas";
        }
    }//GEN-LAST:event_ltotalMouseClicked

    private void rblapangan2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rblapangan2ActionPerformed
        // TODO add your handling code here:
        if(rblapangan2.isSelected()){
            rblapangan1.setEnabled(false);
            rblapangan = rblapangan2.getText();

        }else if(!rblapangan2.isSelected()){
            rblapangan1.setEnabled(true);
        }else if(rblapangan1.isSelected()&&rblapangan2.isSelected()){
            JOptionPane.showMessageDialog(null, "Pilih salah satu");
        }
    }//GEN-LAST:event_rblapangan2ActionPerformed

    private void rblapangan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rblapangan1ActionPerformed
        // TODO add your handling code here:
        if(rblapangan1.isSelected()){
            rblapangan2.setEnabled(false);
            rblapangan = rblapangan1.getText();
        }else if(!rblapangan1.isSelected()){
            rblapangan2.setEnabled(true);
        }else if(rblapangan1.isSelected()&&rblapangan2.isSelected()){
            JOptionPane.showMessageDialog(null, "Pilih salah satu");
        }
    }//GEN-LAST:event_rblapangan1ActionPerformed

    private void lkembaliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lkembaliMouseClicked
        // TODO add your handling code here:
        Utama u = new Utama();
        u.setVisible(true);
        u.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_lkembaliMouseClicked

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgrond1;
    private javax.swing.JComboBox<String> cbkategori1;
    private javax.swing.JComboBox<String> cbkategori2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JLabel judul;
    private javax.swing.JLabel lbayar;
    private javax.swing.JLabel lkategori;
    private javax.swing.JLabel lkembali;
    private javax.swing.JLabel llapangan;
    private javax.swing.JLabel lnama;
    private javax.swing.JLabel lsisa;
    private javax.swing.JLabel ltanggal;
    private javax.swing.JLabel ltotal;
    private javax.swing.JLabel lupdate;
    private javax.swing.JRadioButton rblapangan1;
    private javax.swing.JRadioButton rblapangan2;
    private javax.swing.JTextField tfbayar;
    private javax.swing.JTextField tfnama;
    private javax.swing.JTextField tfsisa;
    private javax.swing.JTextField tftanggal;
    private javax.swing.JTextField tftotal;
    // End of variables declaration//GEN-END:variables
}
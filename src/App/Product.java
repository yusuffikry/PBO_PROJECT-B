/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package App;

import com.config.MyConfig;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JTable;

public class Product extends javax.swing.JFrame {
    private Connection connection;
    private Statement statement;
    private ResultSet resultSet;
    
    private static final String DB_URL = "jdbc:mysql://localhost:3306/db_sisfo";
    private static final String DB_USER = "root";
    private static final String DB_PASS = "";
    
    public Product() {
        try {
            initComponents();
            connection = DriverManager.getConnection(DB_URL, DB_USER , DB_PASS);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Connection: Gagal");
        }
    }

    public void clear(){
        nama_Produk.setText("");
        harga_Produk.setText("");
        jumlah_produk.setText("");
        nama_Produk.requestFocus();
    }
    
    public void insertData(){
        int index = jTable1.getRowCount();
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{
            index += 1,
            nama_Produk.getText(),
            harga_Produk.getText(),
            jumlah_produk.getText()
    });
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nama_Produk = new javax.swing.JTextField();
        harga_Produk = new javax.swing.JTextField();
        jumlah_produk = new javax.swing.JTextField();
        addProduk = new javax.swing.JButton();
        editProduk = new javax.swing.JButton();
        deleteProduk = new javax.swing.JButton();
        clearProduk = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        hitungProduk = new javax.swing.JButton();
        saveProduk = new javax.swing.JButton();
        jTextField6 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(104, 110, 118));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(204, 0, 153));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 51));
        jLabel1.setText("Badminton Sports");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setText("Nama Produk");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setText("Harga Produk");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setText("Jumlah");

        harga_Produk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                harga_ProdukActionPerformed(evt);
            }
        });

        jumlah_produk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jumlah_produkActionPerformed(evt);
            }
        });

        addProduk.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        addProduk.setText("Tambah");
        addProduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProdukActionPerformed(evt);
            }
        });

        editProduk.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        editProduk.setText("Edit");
        editProduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editProdukActionPerformed(evt);
            }
        });

        deleteProduk.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        deleteProduk.setText("Delete");
        deleteProduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteProdukActionPerformed(evt);
            }
        });

        clearProduk.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        clearProduk.setText("Clear");
        clearProduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearProdukActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(0, 204, 255));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel5.setText("Total");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel6.setText("Tunai");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel7.setText("Kembali");

        hitungProduk.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        hitungProduk.setText("Hitung");
        hitungProduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hitungProdukActionPerformed(evt);
            }
        });

        saveProduk.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        saveProduk.setText("Simpan");
        saveProduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveProdukActionPerformed(evt);
            }
        });

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(72, 72, 72)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                                    .addComponent(jTextField5)
                                    .addComponent(jTextField6)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addComponent(saveProduk))))
                    .addComponent(hitungProduk))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hitungProduk)
                    .addComponent(saveProduk))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Nama", "Harga", "Jumlah"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nama_Produk)
                                    .addComponent(harga_Produk)
                                    .addComponent(jumlah_produk, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(addProduk)
                                .addGap(18, 18, 18)
                                .addComponent(editProduk)
                                .addGap(18, 18, 18)
                                .addComponent(deleteProduk)
                                .addGap(18, 18, 18)
                                .addComponent(clearProduk))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(nama_Produk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(harga_Produk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jumlah_produk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addProduk)
                            .addComponent(editProduk)
                            .addComponent(deleteProduk)
                            .addComponent(clearProduk))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void harga_ProdukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_harga_ProdukActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_harga_ProdukActionPerformed

    private void editProdukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editProdukActionPerformed
        // TODO add your handling code here:
        int jumlahRowData = jTable1.getRowCount();
        int indexDataSelect = jTable1.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        if (jumlahRowData == 0) {
            JOptionPane.showMessageDialog(null, "Belum ada data");
        } else {
            if (indexDataSelect != -1) {
                if (editProduk.getText() == "Edit"){
                addProduk.setEnabled(false);
                deleteProduk.setEnabled(false);
                editProduk.setText("Update");

                nama_Produk.setText(model.getValueAt(indexDataSelect, 1).toString());
                harga_Produk.setText(model.getValueAt(indexDataSelect, 2).toString());
                jumlah_produk.setText(model.getValueAt(indexDataSelect, 3).toString());
            } else {
                addProduk.setEnabled(true);
                deleteProduk.setEnabled(true);
                editProduk.setText("Edit");

                model.setValueAt(nama_Produk.getText().toString(), indexDataSelect, 1);
                model.setValueAt(harga_Produk.getText().toString(), indexDataSelect, 2);
                model.setValueAt(jumlah_produk.getText().toString(), indexDataSelect, 3);

                clear();           
                }
            } else {
                JOptionPane.showMessageDialog(null, "Silakan pilih data yang ingin di edit");
            }
        } 
    }//GEN-LAST:event_editProdukActionPerformed

    private void deleteProdukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteProdukActionPerformed
        // TODO add your handling code here:
        int jumlahRowData = jTable1.getRowCount();
        int indexDataSelect = jTable1.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        if (jumlahRowData == 0) {
            JOptionPane.showMessageDialog(null, "Belum ada data");
        } else {
            if (indexDataSelect != -1) {
                model.removeRow(indexDataSelect);
            } else {
                JOptionPane.showMessageDialog(null, "Silakan pilih data yang ingin di hapus");
            }
        }
    }//GEN-LAST:event_deleteProdukActionPerformed

    private void clearProdukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearProdukActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_clearProdukActionPerformed

    private void hitungProdukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hitungProdukActionPerformed
        // TODO add your handling code here:
        int jumlahRowData = jTable1.getRowCount();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        int totalHarga = 0;
        int inputTunai = 0;

        for (int i = 0; i < jumlahRowData; i++) {
            int hargaBarang = Integer.parseInt(model.getValueAt(i, 2).toString());
            int jumlahBarang = Integer.parseInt(model.getValueAt(i, 3).toString());

            int subTotal = hargaBarang * jumlahBarang;
            totalHarga += subTotal;
        }
        
        String tunai = jTextField5.getText();
        if (!tunai.isEmpty()) {
            try {
                inputTunai = Integer.parseInt(tunai);
            } catch (NumberFormatException e) {
                String total = String.valueOf(totalHarga);
                jTextField4.setText(total);
                JOptionPane.showMessageDialog(null, "Input tunai tidak valid. Harap masukkan angka");
                return; // Menghentikan eksekusi lebih lanjut jika input tidak valid
            }
        } else {
            String total = String.valueOf(totalHarga);
            jTextField4.setText(total);
            JOptionPane.showMessageDialog(null, "Input tunai kosong. Harap masukkan angka");
            return; // Menghentikan eksekusi lebih lanjut jika input kosong
        }

        String total = String.valueOf(totalHarga);
        jTextField4.setText(total);

        if (inputTunai < totalHarga) {
            JOptionPane.showMessageDialog(null, "Tunai harus lebih besar atau sama dengan total harga");
            jTextField6.setText("");
            return; // Menghentikan eksekusi lebih lanjut jika tunai kurang dari total harga
        } else {
            int kembalian = inputTunai - totalHarga;
            String kembali = String.valueOf(kembalian);
            jTextField6.setText(kembali);
            JOptionPane.showMessageDialog(null, "Berhasil menghitung");
        }
    }//GEN-LAST:event_hitungProdukActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
        String tunai = jTextField5.getText();
        jTextField5.setText(tunai);
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jumlah_produkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jumlah_produkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jumlah_produkActionPerformed

    private void saveProdukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveProdukActionPerformed
        // TODO add your handling code here:
        int jumlahRowData = jTable1.getRowCount();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        if (jumlahRowData == 0) {
            JOptionPane.showMessageDialog(null, "Belum ada data");
        } else {
            // Menghapus semua data dalam database sebelum menyimpan data baru
//            MyConfig.deleteAllData();

            for (int i = 0; i < jumlahRowData; i++) {
                String namaBarang = model.getValueAt(i, 1).toString();
                int hargaBarang = Integer.parseInt(model.getValueAt(i, 2).toString());
                int jumlahBarang = Integer.parseInt(model.getValueAt(i, 3).toString());

                MyConfig.insertData(namaBarang, hargaBarang, jumlahBarang);
            }
            model.setRowCount(0);
            jTextField4.setText("");
            jTextField5.setText("");
            jTextField6.setText("");
            JOptionPane.showMessageDialog(null, "Data berhasil disimpan ke dalam database");
        }
    }//GEN-LAST:event_saveProdukActionPerformed

    private void addProdukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProdukActionPerformed
        // TODO add your handling code here:
        if (addProduk.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Nama barang belum di input");
            nama_Produk.requestFocus();
        } else if (harga_Produk.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Harga barang belum di input");
            harga_Produk.requestFocus();
        } else if (jumlah_produk.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Jumlah barang belum di input");
            jumlah_produk.requestFocus();
        } else{
            insertData();
            JOptionPane.showMessageDialog(null, "Data berhasil ditambahkan");
            clear();
        }
    }//GEN-LAST:event_addProdukActionPerformed

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
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Product().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addProduk;
    private javax.swing.JButton clearProduk;
    private javax.swing.JButton deleteProduk;
    private javax.swing.JButton editProduk;
    private javax.swing.JTextField harga_Produk;
    private javax.swing.JButton hitungProduk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jumlah_produk;
    private javax.swing.JTextField nama_Produk;
    private javax.swing.JButton saveProduk;
    // End of variables declaration//GEN-END:variables
}

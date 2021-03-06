/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eandd.tungbt94.View;

import eandd.tungbt94.Control.DHMCtr;
import eandd.tungbt94.Model.DiemHienMau;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Bui Thanh Tung
 */
public class TableDiemHienMau extends javax.swing.JFrame {

    /**
     * Creates new form TableDiemHienMau
     */
    public TableDiemHienMau() {
        initComponents();
        loadTable();
    }
    
    private void loadTable(){
        TableModel tbDiemHienMau = new DefaultTableModel(getData(), getColumnName()){

            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tblDiemHienMau.setModel(tbDiemHienMau);
        tblDiemHienMau.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tblDiemHienMau.getColumnModel().getColumn(0).setPreferredWidth(150);
        tblDiemHienMau.getColumnModel().getColumn(1).setPreferredWidth(100);
        tblDiemHienMau.getColumnModel().getColumn(2).setPreferredWidth(300);
        tblDiemHienMau.getColumnModel().getColumn(3).setPreferredWidth(500);
        tblDiemHienMau.getColumnModel().getColumn(4).setPreferredWidth(140);
    }
    
    private Object[] getColumnName(){
        return new Object[]{"Ngày tổ chức","Thời gian","Tên điểm","Địa chỉ","Tỉnh thành"};
    }
    
    private Object[][] getData(){
        String url = "http://www.hienmau.vn/DonateBloodWeb/BloodBank/Event/ListPosWebsite.aspx";
        DHMCtr control = new DHMCtr(url);
        ArrayList<DiemHienMau> arrDHM = control.getArrDHM();
        int soDiemHienMau = arrDHM.size();
        Object[][] data = new Object[soDiemHienMau][5];
        for(int i = 0; i < soDiemHienMau;i++){
            data[i][0] = arrDHM.get(i).getNgayToChuc();
            data[i][1] = arrDHM.get(i).getThoiGian();
            data[i][2] = arrDHM.get(i).getTenDiem();
            data[i][3] = arrDHM.get(i).getDiaChi();
            data[i][4] = arrDHM.get(i).getTinhThanh();
            System.out.println(i);
        }
        return data;
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDiemHienMau = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Danh sách điểm hiến máu trong ngày");

        tblDiemHienMau.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Ngày tổ chức", "Thời gian", "Tên điểm", "Địa chỉ", "Tỉnh thành"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblDiemHienMau);
        if (tblDiemHienMau.getColumnModel().getColumnCount() > 0) {
            tblDiemHienMau.getColumnModel().getColumn(0).setResizable(false);
            tblDiemHienMau.getColumnModel().getColumn(0).setPreferredWidth(200);
            tblDiemHienMau.getColumnModel().getColumn(1).setResizable(false);
            tblDiemHienMau.getColumnModel().getColumn(1).setPreferredWidth(300);
            tblDiemHienMau.getColumnModel().getColumn(2).setResizable(false);
            tblDiemHienMau.getColumnModel().getColumn(2).setPreferredWidth(300);
            tblDiemHienMau.getColumnModel().getColumn(3).setResizable(false);
            tblDiemHienMau.getColumnModel().getColumn(3).setPreferredWidth(800);
            tblDiemHienMau.getColumnModel().getColumn(4).setResizable(false);
            tblDiemHienMau.getColumnModel().getColumn(4).setPreferredWidth(200);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(TableDiemHienMau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TableDiemHienMau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TableDiemHienMau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TableDiemHienMau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TableDiemHienMau().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDiemHienMau;
    // End of variables declaration//GEN-END:variables
}

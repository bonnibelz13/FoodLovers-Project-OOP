package code.homeform;

import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

public class MenuTable2 extends javax.swing.JFrame {
    private JTable jTable1;
    private JScrollPane jScrollPane1;

    public MenuTable2() {
        initComponents();
    }

    private void initComponents() {
        jScrollPane1 = new JScrollPane();
        jTable1 = new JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        // สร้างตารางและโมเดลของตาราง
        DefaultTableModel model = new DefaultTableModel(
            new Object[][] {},
            new String[] {"Name", "Type", "Ingredients", "Method", "Pic"}
        );
        jTable1.setModel(model);

        jScrollPane1.setViewportView(jTable1);

        // กำหนดขนาดของ JScrollPane
        jScrollPane1.setPreferredSize(new java.awt.Dimension(400, 300));

        // เพิ่ม JScrollPane เป็นองค์ประกอบใน JFrame
        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        pack();
    }
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
            java.util.logging.Logger.getLogger(MenuTable2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuTable2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuTable2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuTable2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuTable2().setVisible(true);
            }
        });
    }
    public JTable getTable() {
        return jTable1;
    }

    void setController(AddMenuController aThis) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


}
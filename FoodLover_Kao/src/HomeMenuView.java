import DataBase.*;
import java.util.*;

public class HomeMenuView extends javax.swing.JFrame {

    /**
     * Creates new form HomeMenuView2
     */
    private FoodDataBase foodDataBase;
    private String userName;
    
    public HomeMenuView(FoodDataBase fDB, String name) {
        initComponents();
        
        foodDataBase = fDB;
        userName = name;
        
        jScrollPane1.setViewportView(new InsideMenu_Home(foodDataBase, userName));
        this.revalidate();
        this.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel22 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        JLabel_UserName = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JLabel_MyRecipes = new javax.swing.JLabel();
        JLabel_MyFavorite = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        JLabel_MainCourse = new javax.swing.JLabel();
        JLabel_Dessert = new javax.swing.JLabel();
        JLabel_Drinks = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        JLabel_HomeMenu = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        JLabel_Measuring = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 720));

        jScrollPane1.setHorizontalScrollBar(null);
        jScrollPane1.setMaximumSize(new java.awt.Dimension(1042, 2103));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(1042, 720));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(1042, 2103));

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1042, Short.MAX_VALUE)
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2103, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jPanel22);

        jPanel21.setBackground(new java.awt.Color(204, 204, 204));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        JLabel_UserName.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        JLabel_UserName.setForeground(new java.awt.Color(255, 255, 255));
        JLabel_UserName.setText("Annonymous User");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Profile");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLabel_UserName, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLabel_UserName)
                .addGap(17, 17, 17))
        );

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Account");

        JLabel_MyRecipes.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        JLabel_MyRecipes.setText("My Recipes");
        JLabel_MyRecipes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JLabel_MyRecipesMouseClicked(evt);
            }
        });

        JLabel_MyFavorite.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        JLabel_MyFavorite.setText("My Favorite");
        JLabel_MyFavorite.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JLabel_MyFavoriteMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("Category");

        JLabel_MainCourse.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        JLabel_MainCourse.setText("Main Course");
        JLabel_MainCourse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JLabel_MainCourseMouseClicked(evt);
            }
        });

        JLabel_Dessert.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        JLabel_Dessert.setText("Dessert");
        JLabel_Dessert.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JLabel_DessertMouseClicked(evt);
            }
        });

        JLabel_Drinks.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        JLabel_Drinks.setText("Drinks");
        JLabel_Drinks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JLabel_DrinksMouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setText("Log out");

        JLabel_HomeMenu.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        JLabel_HomeMenu.setText("Home Menu");
        JLabel_HomeMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JLabel_HomeMenuMouseClicked(evt);
            }
        });

        JLabel_Measuring.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        JLabel_Measuring.setText("Measure Ingredients");
        JLabel_Measuring.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JLabel_MeasuringMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel21Layout.createSequentialGroup()
                            .addGap(47, 47, 47)
                            .addComponent(JLabel_MyRecipes, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel21Layout.createSequentialGroup()
                            .addGap(47, 47, 47)
                            .addComponent(JLabel_MyFavorite, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel21Layout.createSequentialGroup()
                            .addGap(23, 23, 23)
                            .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(JLabel_HomeMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                                .addComponent(jSeparator1))))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JLabel_Measuring, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLabel_MainCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLabel_Dessert, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel21Layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24))
                            .addComponent(JLabel_Drinks, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JLabel_HomeMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(12, 12, 12)
                .addComponent(JLabel_MyRecipes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLabel_MyFavorite)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(JLabel_MainCourse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLabel_Dessert)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLabel_Drinks)
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLabel_Measuring)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 248, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JLabel_HomeMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLabel_HomeMenuMouseClicked
        jScrollPane1.setViewportView(new InsideMenu_Home(foodDataBase, userName));
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_JLabel_HomeMenuMouseClicked

    private void JLabel_MyRecipesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLabel_MyRecipesMouseClicked
        jScrollPane1.setViewportView(new InsideMenu_MyRecipes(foodDataBase, userName));
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_JLabel_MyRecipesMouseClicked

    private void JLabel_MyFavoriteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLabel_MyFavoriteMouseClicked
        jScrollPane1.setViewportView(new InsideMenu_MyFavorite());
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_JLabel_MyFavoriteMouseClicked

    private void JLabel_MeasuringMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLabel_MeasuringMouseClicked
        jScrollPane1.setViewportView(new InsideMenu_MeasuringCalculator());
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_JLabel_MeasuringMouseClicked

    private void JLabel_MainCourseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLabel_MainCourseMouseClicked
        jScrollPane1.setViewportView(new InsideMenu_Category(foodDataBase, userName, "MainCourse"));
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_JLabel_MainCourseMouseClicked

    private void JLabel_DessertMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLabel_DessertMouseClicked
        jScrollPane1.setViewportView(new InsideMenu_Category(foodDataBase, userName, "Dessert"));
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_JLabel_DessertMouseClicked

    private void JLabel_DrinksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLabel_DrinksMouseClicked
        jScrollPane1.setViewportView(new InsideMenu_Category(foodDataBase, userName, "Drinks"));
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_JLabel_DrinksMouseClicked

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
            java.util.logging.Logger.getLogger(HomeMenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeMenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeMenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeMenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeMenuView(new FoodDataBase(), "").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabel_Dessert;
    private javax.swing.JLabel JLabel_Drinks;
    private javax.swing.JLabel JLabel_HomeMenu;
    private javax.swing.JLabel JLabel_MainCourse;
    private javax.swing.JLabel JLabel_Measuring;
    private javax.swing.JLabel JLabel_MyFavorite;
    private javax.swing.JLabel JLabel_MyRecipes;
    private javax.swing.JLabel JLabel_UserName;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}

package code.homenew;

import code.*;
import code.homeform.AddMenuController;
import code.homeform.AddMenuGUIForm;
import code.homeform.AddMenuModel;
import code.kao.database.FoodDataBase;
import code.kao.database.FoodRecipe;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.*;
import javax.swing.*;

public class InsideMenu_MyRecipes extends javax.swing.JPanel {

    private ArrayList allRecipe, myRecipe, mainCourse, dessert, drinks, detail;
    private int page = 1, endPage = 1;
    private FoodDataBase foodDataBase;
    private HomeMenuView home;
    private String userName;
    
    public InsideMenu_MyRecipes(FoodDataBase fDB, String name, HomeMenuView home) {
        initComponents();
        this.home = home;
        foodDataBase = fDB;
        myRecipe = fDB.getUserRecipe(name);
        detail = new ArrayList();
        setDetail();
        jLabelEndPage.setText("/ " + (int) ((myRecipe.size() / 8) + 1));
        userName = name;
        
    }
    
    public void setDetail(){
        
        detail.clear();
        
        if (myRecipe.size() != 0){
            endPage = (int) (myRecipe.size() / 8);
            if (myRecipe.size()%8 != 0){
                endPage++;
            }
        }
        jLabelEndPage.setText("/ " + endPage);
        
        JPanel panel[] = {jPanel1, jPanel2, jPanel3, jPanel4, jPanel5, jPanel6, jPanel7, jPanel8};
        JLabel picture[] = {pic1, pic2, pic3, pic4, pic5,  pic6, pic7, pic8};
        JLabel menuName[] = {jLabel1A, jLabel2A, jLabel3A, jLabel4A, jLabel5A, jLabel6A, jLabel7A, jLabel8A};
        JLabel category[] = {jLabel1B, jLabel2B, jLabel3B, jLabel4B, jLabel5B, jLabel6B, jLabel7B, jLabel8B};
        
        
        for (int i = (8 * page) - 8; i < 8 * page; i++){
            if (i < myRecipe.size()){
                
                FoodRecipe food = (FoodRecipe) myRecipe.get(i);
                
                picture[i%8].setIcon(new ImageIcon(food.getPicture().getImage().getScaledInstance(220, 165, Image.SCALE_SMOOTH)));
                menuName[i%8].setText(food.getName());
                category[i%8].setText(food.getCategory());
                
                detail.add(food);
                
            }
            else {
                panel[i%8].setBackground(null);
                picture[i%8].setIcon(null);
                menuName[i%8].setText(" ");
                category[i%8].setText(" ");
            }
        }
        
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

        InsideMenu_MyRecipes = new javax.swing.JPanel();
        jTextField_Search = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel1A = new javax.swing.JLabel();
        jLabel1B = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        pic1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        pic2 = new javax.swing.JLabel();
        jLabel2A = new javax.swing.JLabel();
        jLabel2B = new javax.swing.JLabel();
        jLabel3A = new javax.swing.JLabel();
        jLabel3B = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        pic3 = new javax.swing.JLabel();
        jLabel4B = new javax.swing.JLabel();
        jLabel4A = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        pic4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        pic5 = new javax.swing.JLabel();
        jLabel5A = new javax.swing.JLabel();
        jLabel5B = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        pic6 = new javax.swing.JLabel();
        jLabel6A = new javax.swing.JLabel();
        jLabel6B = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        pic7 = new javax.swing.JLabel();
        jLabel7A = new javax.swing.JLabel();
        jLabel7B = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        pic8 = new javax.swing.JLabel();
        jLabel8A = new javax.swing.JLabel();
        jLabel8B = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextFieldCurrentPage = new javax.swing.JTextField();
        jLabelEndPage = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        InsideMenu_MyRecipes.setBackground(new java.awt.Color(255, 255, 255));

        jTextField_Search.setEditable(false);
        jTextField_Search.setText("Search a Menu");
        jTextField_Search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField_SearchMouseClicked(evt);
            }
        });

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 51, 51));
        jLabel18.setText("My Recipes");

        jLabel1A.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1A.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1A.setText("Fried Rice");
        jLabel1A.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel1B.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1B.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1B.setText("#MainCourse");
        jLabel1B.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        pic1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pic1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pic1, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pic1, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
        );

        pic2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pic2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pic2, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pic2, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
        );

        jLabel2A.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2A.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2A.setText("Fried Rice");
        jLabel2A.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel2B.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2B.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2B.setText("#MainCourse");
        jLabel2B.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel3A.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3A.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3A.setText("Fried Rice");
        jLabel3A.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel3B.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3B.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3B.setText("#MainCourse");
        jLabel3B.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        pic3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pic3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pic3, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pic3, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
        );

        jLabel4B.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4B.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4B.setText("#MainCourse");
        jLabel4B.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel4A.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4A.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4A.setText("Fried Rice");
        jLabel4A.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        pic4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pic4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pic4, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pic4, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
        );

        pic5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pic5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pic5, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pic5, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
        );

        jLabel5A.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5A.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5A.setText("Fried Rice");
        jLabel5A.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel5B.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5B.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5B.setText("#MainCourse");
        jLabel5B.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        pic6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pic6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pic6, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pic6, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
        );

        jLabel6A.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6A.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6A.setText("Fried Rice");
        jLabel6A.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel6B.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6B.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6B.setText("#MainCourse");
        jLabel6B.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        pic7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pic7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pic7, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pic7, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
        );

        jLabel7A.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7A.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7A.setText("Fried Rice");
        jLabel7A.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel7B.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7B.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7B.setText("#MainCourse");
        jLabel7B.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        pic8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pic8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pic8, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pic8, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
        );

        jLabel8A.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8A.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8A.setText("Fried Rice");
        jLabel8A.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel8B.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel8B.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8B.setText("#MainCourse");
        jLabel8B.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jButton2.setText("<<<");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jButton3.setText(">>>");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTextFieldCurrentPage.setEditable(false);
        jTextFieldCurrentPage.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldCurrentPage.setText("1");
        jTextFieldCurrentPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCurrentPageActionPerformed(evt);
            }
        });

        jLabelEndPage.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabelEndPage.setText("/ 999");
        jLabelEndPage.setToolTipText("");
        jLabelEndPage.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Manage MyRecipes");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout InsideMenu_MyRecipesLayout = new javax.swing.GroupLayout(InsideMenu_MyRecipes);
        InsideMenu_MyRecipes.setLayout(InsideMenu_MyRecipesLayout);
        InsideMenu_MyRecipesLayout.setHorizontalGroup(
            InsideMenu_MyRecipesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InsideMenu_MyRecipesLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(InsideMenu_MyRecipesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InsideMenu_MyRecipesLayout.createSequentialGroup()
                        .addComponent(jTextField_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 880, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 41, Short.MAX_VALUE))
                    .addGroup(InsideMenu_MyRecipesLayout.createSequentialGroup()
                        .addGroup(InsideMenu_MyRecipesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, InsideMenu_MyRecipesLayout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(InsideMenu_MyRecipesLayout.createSequentialGroup()
                                .addGroup(InsideMenu_MyRecipesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1A, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1B, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5A, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5B, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(InsideMenu_MyRecipesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2A, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2B, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6A, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6B, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(InsideMenu_MyRecipesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3A, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3B, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7A, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7B, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(InsideMenu_MyRecipesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4B, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4A, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8A, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8B, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(InsideMenu_MyRecipesLayout.createSequentialGroup()
                                        .addComponent(jButton2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldCurrentPage, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabelEndPage, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton3)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        InsideMenu_MyRecipesLayout.setVerticalGroup(
            InsideMenu_MyRecipesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InsideMenu_MyRecipesLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(InsideMenu_MyRecipesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(51, 51, 51)
                .addGroup(InsideMenu_MyRecipesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jButton4))
                .addGap(37, 37, 37)
                .addGroup(InsideMenu_MyRecipesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InsideMenu_MyRecipesLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1A)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1B, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(InsideMenu_MyRecipesLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2A)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2B, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(InsideMenu_MyRecipesLayout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3A)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3B, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(InsideMenu_MyRecipesLayout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4A)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4B, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(InsideMenu_MyRecipesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InsideMenu_MyRecipesLayout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6A)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6B, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(InsideMenu_MyRecipesLayout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5A)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5B, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(InsideMenu_MyRecipesLayout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7A)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7B, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(InsideMenu_MyRecipesLayout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8A)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8B, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(InsideMenu_MyRecipesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jLabelEndPage, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCurrentPage)
                    .addComponent(jButton2))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1043, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(InsideMenu_MyRecipes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(InsideMenu_MyRecipes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String search_item = jTextField_Search.getText();
        ArrayList result = new Search().SearchMenuCategory(search_item, myRecipe);
        
        if (result.size() > 0){
            home.jScrollPane1.setViewportView(new InsideMenu_Category(result, search_item, foodDataBase, home));
        }else{
            JOptionPane.showMessageDialog(null, "Not found this Menu.");
            jTextField_Search.setText("");
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (page + 1 <= endPage){
            page++;
        }
        jTextFieldCurrentPage.setText(String.valueOf(page));
        setDetail();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextFieldCurrentPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCurrentPageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCurrentPageActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

         // สร้างอินสแตนซ์ของ AddMenuGUIForm2
        AddMenuGUIForm view = new AddMenuGUIForm(foodDataBase, userName);
        
        AddMenuModel addMenuModel = new AddMenuModel(userName, foodDataBase, view);

        // สร้างอินสแตนซ์ของ AddMenuController2 และส่ง AddMenuModel2 และ AddMenuGUIForm2 เป็นพารามิเตอร์
        AddMenuController controller = new AddMenuController(addMenuModel, view);

        // กำหนดให้ AddMenuGUIForm2 เป็นหน้าต่างที่แสดงผล
        view.setVisible(true);
        view.setSize(1135, 710);
        view.setLocationRelativeTo(null);
        view.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        
        view.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                setDetail();
                
            }
        });
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        if (page - 1 > 0){
            page--;
        }
        jTextFieldCurrentPage.setText(String.valueOf(page));
        setDetail();
    }//GEN-LAST:event_jButton2MouseClicked

    private void jTextField_SearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_SearchMouseClicked
        jTextField_Search.setText("");
        jTextField_Search.setEditable(true);
    }//GEN-LAST:event_jTextField_SearchMouseClicked

    private void pic1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pic1MouseClicked
        if (detail.size() - 1 >= 0){
            System.out.println("menu detail");
            new MenuDetail((FoodRecipe) detail.get(0)).setVisible(true);
        }
    }//GEN-LAST:event_pic1MouseClicked

    private void pic2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pic2MouseClicked
        if (detail.size() - 1 >= 1){
            System.out.println("menu detail");
            new MenuDetail((FoodRecipe) detail.get(1)).setVisible(true);
        }
    }//GEN-LAST:event_pic2MouseClicked

    private void pic3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pic3MouseClicked
        if (detail.size() - 1 >= 2){
            System.out.println("menu detail");
            new MenuDetail((FoodRecipe) detail.get(2)).setVisible(true);
        }
    }//GEN-LAST:event_pic3MouseClicked

    private void pic4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pic4MouseClicked
        if (detail.size() - 1 >= 3){
            System.out.println("menu detail");
            new MenuDetail((FoodRecipe) detail.get(3)).setVisible(true);
        }
    }//GEN-LAST:event_pic4MouseClicked

    private void pic5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pic5MouseClicked
        if (detail.size() - 1 >= 4){
            System.out.println("menu detail");
            new MenuDetail((FoodRecipe) detail.get(4)).setVisible(true);
        }
    }//GEN-LAST:event_pic5MouseClicked

    private void pic6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pic6MouseClicked
        if (detail.size() - 1 >= 5){
            System.out.println("menu detail");
            new MenuDetail((FoodRecipe) detail.get(5)).setVisible(true);
        }
    }//GEN-LAST:event_pic6MouseClicked

    private void pic7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pic7MouseClicked
        if (detail.size() - 1 >= 6){
            System.out.println("menu detail");
            new MenuDetail((FoodRecipe) detail.get(6)).setVisible(true);
        }
    }//GEN-LAST:event_pic7MouseClicked

    private void pic8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pic8MouseClicked
        if (detail.size() - 1 >= 7){
            System.out.println("menu detail");
            new MenuDetail((FoodRecipe) detail.get(7)).setVisible(true);
        }
    }//GEN-LAST:event_pic8MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel InsideMenu_MyRecipes;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel1A;
    private javax.swing.JLabel jLabel1B;
    private javax.swing.JLabel jLabel2A;
    private javax.swing.JLabel jLabel2B;
    private javax.swing.JLabel jLabel3A;
    private javax.swing.JLabel jLabel3B;
    private javax.swing.JLabel jLabel4A;
    private javax.swing.JLabel jLabel4B;
    private javax.swing.JLabel jLabel5A;
    private javax.swing.JLabel jLabel5B;
    private javax.swing.JLabel jLabel6A;
    private javax.swing.JLabel jLabel6B;
    private javax.swing.JLabel jLabel7A;
    private javax.swing.JLabel jLabel7B;
    private javax.swing.JLabel jLabel8A;
    private javax.swing.JLabel jLabel8B;
    private javax.swing.JLabel jLabelEndPage;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTextField jTextFieldCurrentPage;
    private javax.swing.JTextField jTextField_Search;
    private javax.swing.JLabel pic1;
    private javax.swing.JLabel pic2;
    private javax.swing.JLabel pic3;
    private javax.swing.JLabel pic4;
    private javax.swing.JLabel pic5;
    private javax.swing.JLabel pic6;
    private javax.swing.JLabel pic7;
    private javax.swing.JLabel pic8;
    // End of variables declaration//GEN-END:variables
}
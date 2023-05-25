package code.homenew;

/**
 *
 * @author Noppakorn
 */
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

public class InsideMenu_Home extends javax.swing.JPanel {

    private ArrayList allRecipe, myRecipe, mainCourse, dessert, drinks, lastest, recipe;
    private String userName;
    private FoodDataBase foodDataBase;
    private HomeMenuView home;
    
    
    
    public InsideMenu_Home(FoodDataBase foodDataBase, String name, HomeMenuView homeMenu) {
        
        System.out.println("setdetail");
        initComponents();
        
        
        lastest = new ArrayList();
        recipe = new ArrayList();
        home = homeMenu;
        userName = name;
        this.foodDataBase = foodDataBase;
        allRecipe = foodDataBase.getAllRecipe();
        myRecipe = foodDataBase.getUserRecipe(name);
        mainCourse = foodDataBase.getMainCourse();
        dessert = foodDataBase.getDessert();
        drinks = foodDataBase.getDrinks();
        
        setDetail(allRecipe, myRecipe, mainCourse, dessert, drinks);
    }
   
    public void setDetail(ArrayList allRecipe, ArrayList myRecipe, ArrayList mainCourse, ArrayList dessert, ArrayList drinks){

        lastest.clear();
        recipe.clear();
        JLabel picture[] = {pic11, pic12, pic13, pic14, pic15, pic16, pic17, pic20};
        JLabel menuName[] = {jLabel11A, jLabel12A, jLabel13A, jLabel14A, jLabel15A, jLabel16A, jLabel17A, jLabel20A};
        JLabel category[] = {jLabel11B, jLabel12B, jLabel13B, jLabel14B, jLabel15B, jLabel16B, jLabel17B, jLabel20B};
        
        JLabel picture2[] = {pic22, pic23, pic21};
        JLabel menuName2[] = {jLabel22A, jLabel23A, jLabel21A};
        JLabel category2[] = {jLabel22B, jLabel23B, jLabel21B};
        
        //Latest Zone
        for (int i = 0; i <= 7; i++){
            if (allRecipe.size() - (i + 1) >= 0){
                
                System.out.println(allRecipe.size() - i - 1);
                FoodRecipe eachFoodRecipe = (FoodRecipe) allRecipe.get(allRecipe.size() - (i + 1));
                
                ImageIcon img = new ImageIcon(eachFoodRecipe.getPicture().getImage().getScaledInstance(220, 165, Image.SCALE_SMOOTH));
                picture[i].setIcon(img);
                
                menuName[i].setText(eachFoodRecipe.getName());
                category[i].setText(eachFoodRecipe.getCategory());
                
                lastest.add(eachFoodRecipe);
            }
            else {
                picture[i].setBackground(null);
                picture[i].setOpaque(true);
                picture[i].setIcon(null);
                menuName[i].setText(" ");
                category[i].setText(" ");
            }
        }
        
        //Most MyRecipe Zone (MyRecipe)
        for (int i = 0; i <= 2; i++){
            if (myRecipe == null){
                picture2[i].setBackground(Color.white);
                picture2[i].setIcon(null);
                menuName2[i].setText(" ");
                category2[i].setText(" ");
            }
            else if (myRecipe.size() - i - 1  >= 0){
                System.out.println(myRecipe.size() - i - 1);
                FoodRecipe eachFoodRecipe = (FoodRecipe) myRecipe.get(myRecipe.size() - (i + 1));
                
                
                
                if (i == 0 | i == 1){
                    ImageIcon img = new ImageIcon(eachFoodRecipe.getPicture().getImage().getScaledInstance(220, 165, Image.SCALE_SMOOTH));
                    picture2[i].setIcon(img);
                    recipe.add(eachFoodRecipe);
                }
                else {
                    ImageIcon img = new ImageIcon(eachFoodRecipe.getPicture().getImage().getScaledInstance(440, 330, Image.SCALE_SMOOTH));
                    picture2[i].setIcon(img);
                    recipe.add(eachFoodRecipe);
                }
                
                
                menuName2[i].setText(eachFoodRecipe.getName());
                category2[i].setText(eachFoodRecipe.getCategory());
                
            } else {
                picture2[i].setBackground(Color.white);
                picture2[i].setIcon(null);
                menuName2[i].setText(" ");
                category2[i].setText(" ");
            }
        }
        
        //Category Zone
        if (mainCourse.size() > 0){
            FoodRecipe pictureA = (FoodRecipe) mainCourse.get(mainCourse.size() - 1);
            jButton_MainCourse.setIcon(new ImageIcon(pictureA.getPicture().getImage().getScaledInstance(545, 400, Image.SCALE_SMOOTH)));
        }
        else {
            FoodRecipe pictureA = null;
        }
        if (dessert.size() > 0){
            FoodRecipe pictureB = (FoodRecipe) dessert.get(dessert.size()- 1);
            jButton_Dessert.setIcon(new ImageIcon(pictureB.getPicture().getImage().getScaledInstance(379, 200, Image.SCALE_SMOOTH)));
        }
        else {
            FoodRecipe pictureB = null;
        }
        if (drinks.size() > 0){
            FoodRecipe pictureC = (FoodRecipe) drinks.get(drinks.size() - 1);
            jButton_Drinks.setIcon(new ImageIcon(pictureC.getPicture().getImage().getScaledInstance(379, 300, Image.SCALE_SMOOTH)));
        }
        else {
            FoodRecipe pictureC = null;
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

        InsideMenu_Home = new javax.swing.JPanel();
        jTextField_Search = new javax.swing.JTextField();
        jButton_Search = new javax.swing.JButton();
        jLabel_Latest = new javax.swing.JLabel();
        jButton_Create = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        pic11 = new javax.swing.JLabel();
        jLabel11A = new javax.swing.JLabel();
        jLabel11B = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        pic12 = new javax.swing.JLabel();
        jLabel12A = new javax.swing.JLabel();
        jLabel12B = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        pic13 = new javax.swing.JLabel();
        jLabel13A = new javax.swing.JLabel();
        jLabel13B = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        pic14 = new javax.swing.JLabel();
        jLabel14A = new javax.swing.JLabel();
        jLabel14B = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        pic15 = new javax.swing.JLabel();
        jLabel15A = new javax.swing.JLabel();
        jLabel15B = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        pic16 = new javax.swing.JLabel();
        jLabel16A = new javax.swing.JLabel();
        jLabel16B = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        pic17 = new javax.swing.JLabel();
        jLabel17A = new javax.swing.JLabel();
        jLabel17B = new javax.swing.JLabel();
        jLabel20B = new javax.swing.JLabel();
        JLabel_MostFavorite = new javax.swing.JLabel();
        jPanel_21 = new javax.swing.JPanel();
        pic21 = new javax.swing.JLabel();
        jLabel21A = new javax.swing.JLabel();
        jLabel21B = new javax.swing.JLabel();
        jPanel_22 = new javax.swing.JPanel();
        pic22 = new javax.swing.JLabel();
        jLabel22A = new javax.swing.JLabel();
        jLabel22B = new javax.swing.JLabel();
        jPanel_23 = new javax.swing.JPanel();
        pic23 = new javax.swing.JLabel();
        jLabel23A = new javax.swing.JLabel();
        jLabel23B = new javax.swing.JLabel();
        JLabel_LookByCategory = new javax.swing.JLabel();
        jButton_MainCourse = new javax.swing.JButton();
        jButton_Dessert = new javax.swing.JButton();
        jButton_Drinks = new javax.swing.JButton();
        jPanel20 = new javax.swing.JPanel();
        pic20 = new javax.swing.JLabel();
        jLabel20A = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1042, 2103));
        setMinimumSize(new java.awt.Dimension(1042, 2103));
        setName(""); // NOI18N

        InsideMenu_Home.setBackground(new java.awt.Color(255, 255, 255));
        InsideMenu_Home.setMaximumSize(new java.awt.Dimension(1042, 2103));
        InsideMenu_Home.setMinimumSize(new java.awt.Dimension(1042, 2103));

        jTextField_Search.setEditable(false);
        jTextField_Search.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTextField_Search.setText("Search a Menu");
        jTextField_Search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField_SearchMouseClicked(evt);
            }
        });

        jButton_Search.setBackground(new java.awt.Color(255, 255, 255));
        jButton_Search.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton_Search.setText("Search");
        jButton_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SearchActionPerformed(evt);
            }
        });

        jLabel_Latest.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel_Latest.setForeground(new java.awt.Color(51, 51, 51));
        jLabel_Latest.setText("Latest Recipes");

        jButton_Create.setBackground(new java.awt.Color(204, 204, 255));
        jButton_Create.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton_Create.setForeground(new java.awt.Color(51, 51, 51));
        jButton_Create.setText("Create your own menu!");
        jButton_Create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CreateActionPerformed(evt);
            }
        });

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setMaximumSize(new java.awt.Dimension(220, 165));
        jPanel11.setMinimumSize(new java.awt.Dimension(220, 165));
        jPanel11.setPreferredSize(new java.awt.Dimension(220, 165));

        pic11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pic11MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pic11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pic11, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
        );

        jLabel11A.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel11A.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11A.setText("Menu 1");
        jLabel11A.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel11B.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel11B.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11B.setText("#Category");
        jLabel11B.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setMaximumSize(new java.awt.Dimension(220, 165));
        jPanel12.setMinimumSize(new java.awt.Dimension(220, 165));
        jPanel12.setPreferredSize(new java.awt.Dimension(220, 165));

        pic12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pic12MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pic12, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pic12, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
        );

        jLabel12A.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel12A.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12A.setText("Menu 2");
        jLabel12A.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel12B.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel12B.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12B.setText("#Category");
        jLabel12B.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setPreferredSize(new java.awt.Dimension(220, 165));

        pic13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pic13MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addComponent(pic13, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pic13, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
        );

        jLabel13A.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel13A.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13A.setText("Menu 3");
        jLabel13A.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel13B.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel13B.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13B.setText("#Category");
        jLabel13B.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setPreferredSize(new java.awt.Dimension(220, 165));

        pic14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pic14MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pic14, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pic14, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
        );

        jLabel14A.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel14A.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14A.setText("Menu 4");
        jLabel14A.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel14B.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel14B.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14B.setText("#Category");
        jLabel14B.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setPreferredSize(new java.awt.Dimension(220, 165));

        pic15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pic15MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pic15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pic15, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
        );

        jLabel15A.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel15A.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15A.setText("Menu 5");
        jLabel15A.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel15B.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel15B.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15B.setText("#Category");
        jLabel15B.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setPreferredSize(new java.awt.Dimension(220, 165));

        pic16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pic16MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pic16, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pic16, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
        );

        jLabel16A.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel16A.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16A.setText("Menu 6");
        jLabel16A.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel16B.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel16B.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16B.setText("#Category");
        jLabel16B.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setPreferredSize(new java.awt.Dimension(220, 165));

        pic17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pic17MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pic17, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pic17, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
        );

        jLabel17A.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel17A.setForeground(new java.awt.Color(51, 51, 51));
        jLabel17A.setText("Menu 7");
        jLabel17A.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel17B.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel17B.setForeground(new java.awt.Color(51, 51, 51));
        jLabel17B.setText("#Category");
        jLabel17B.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel20B.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel20B.setForeground(new java.awt.Color(51, 51, 51));
        jLabel20B.setText("#Category");
        jLabel20B.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        JLabel_MostFavorite.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        JLabel_MostFavorite.setForeground(new java.awt.Color(51, 51, 51));
        JLabel_MostFavorite.setText("My Recipes");

        jPanel_21.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_21.setPreferredSize(new java.awt.Dimension(440, 330));

        pic21.setMaximumSize(new java.awt.Dimension(440, 330));
        pic21.setMinimumSize(new java.awt.Dimension(440, 330));
        pic21.setPreferredSize(new java.awt.Dimension(440, 330));
        pic21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pic21MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel_21Layout = new javax.swing.GroupLayout(jPanel_21);
        jPanel_21.setLayout(jPanel_21Layout);
        jPanel_21Layout.setHorizontalGroup(
            jPanel_21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pic21, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_21Layout.setVerticalGroup(
            jPanel_21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pic21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel21A.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel21A.setForeground(new java.awt.Color(51, 51, 51));
        jLabel21A.setText("#3 Menu");
        jLabel21A.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel21B.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel21B.setForeground(new java.awt.Color(51, 51, 51));
        jLabel21B.setText("#MainCourse");
        jLabel21B.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jPanel_22.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_22.setPreferredSize(new java.awt.Dimension(220, 165));

        pic22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pic22MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel_22Layout = new javax.swing.GroupLayout(jPanel_22);
        jPanel_22.setLayout(jPanel_22Layout);
        jPanel_22Layout.setHorizontalGroup(
            jPanel_22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pic22, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
        );
        jPanel_22Layout.setVerticalGroup(
            jPanel_22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pic22, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
        );

        jLabel22A.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel22A.setForeground(new java.awt.Color(51, 51, 51));
        jLabel22A.setText("#1 Menu");
        jLabel22A.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel22B.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel22B.setForeground(new java.awt.Color(51, 51, 51));
        jLabel22B.setText("#MainCourse");
        jLabel22B.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jPanel_23.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_23.setPreferredSize(new java.awt.Dimension(220, 165));

        pic23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pic23MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel_23Layout = new javax.swing.GroupLayout(jPanel_23);
        jPanel_23.setLayout(jPanel_23Layout);
        jPanel_23Layout.setHorizontalGroup(
            jPanel_23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pic23, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
        );
        jPanel_23Layout.setVerticalGroup(
            jPanel_23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pic23, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
        );

        jLabel23A.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel23A.setForeground(new java.awt.Color(51, 51, 51));
        jLabel23A.setText("#2 Menu");
        jLabel23A.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel23B.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel23B.setForeground(new java.awt.Color(51, 51, 51));
        jLabel23B.setText("#MainCourse");
        jLabel23B.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        JLabel_LookByCategory.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        JLabel_LookByCategory.setForeground(new java.awt.Color(51, 51, 51));
        JLabel_LookByCategory.setText("Look by Category");

        jButton_MainCourse.setBackground(new java.awt.Color(255, 255, 255));
        jButton_MainCourse.setText("Main Course");
        jButton_MainCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_MainCourseActionPerformed(evt);
            }
        });

        jButton_Dessert.setBackground(new java.awt.Color(255, 255, 255));
        jButton_Dessert.setText("Dessert");
        jButton_Dessert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DessertActionPerformed(evt);
            }
        });

        jButton_Drinks.setBackground(new java.awt.Color(255, 255, 255));
        jButton_Drinks.setText("Drinks");
        jButton_Drinks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DrinksActionPerformed(evt);
            }
        });

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));
        jPanel20.setPreferredSize(new java.awt.Dimension(220, 165));

        pic20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pic20MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pic20, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pic20, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
        );

        jLabel20A.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel20A.setForeground(new java.awt.Color(51, 51, 51));
        jLabel20A.setText("Menu 8");
        jLabel20A.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel1.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Dessert");

        jLabel2.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("MainCourse");

        jLabel3.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Drinks");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\baibu\\OneDrive\\เดสก์ท็อป\\logo_food_lover__purple_-removebg.png")); // NOI18N

        javax.swing.GroupLayout InsideMenu_HomeLayout = new javax.swing.GroupLayout(InsideMenu_Home);
        InsideMenu_Home.setLayout(InsideMenu_HomeLayout);
        InsideMenu_HomeLayout.setHorizontalGroup(
            InsideMenu_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InsideMenu_HomeLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(InsideMenu_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLabel_LookByCategory)
                    .addComponent(JLabel_MostFavorite)
                    .addComponent(jLabel_Latest)
                    .addGroup(InsideMenu_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(InsideMenu_HomeLayout.createSequentialGroup()
                            .addComponent(jTextField_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 880, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButton_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(InsideMenu_HomeLayout.createSequentialGroup()
                            .addGroup(InsideMenu_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(InsideMenu_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(InsideMenu_HomeLayout.createSequentialGroup()
                                        .addGroup(InsideMenu_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel11A, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                                            .addComponent(jLabel11B, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                                            .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(31, 31, 31)
                                        .addGroup(InsideMenu_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel12A, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel12B, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel16A, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel16B, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
                                    .addComponent(jLabel15A, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel15B, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InsideMenu_HomeLayout.createSequentialGroup()
                                        .addGroup(InsideMenu_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel22A, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel22B, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jPanel_22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                                        .addGroup(InsideMenu_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jPanel_23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel23A, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel23B, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addComponent(jButton_Create))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(InsideMenu_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(InsideMenu_HomeLayout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addGroup(InsideMenu_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(InsideMenu_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel13A, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel13B, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jPanel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(InsideMenu_HomeLayout.createSequentialGroup()
                                            .addGap(6, 6, 6)
                                            .addGroup(InsideMenu_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel17A, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel17B, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGap(27, 27, 27)
                                    .addGroup(InsideMenu_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel20A, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel20B, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel14A, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel14B, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(InsideMenu_HomeLayout.createSequentialGroup()
                                    .addComponent(jPanel_21, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE)))))
                    .addGroup(InsideMenu_HomeLayout.createSequentialGroup()
                        .addGroup(InsideMenu_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_MainCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(InsideMenu_HomeLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(InsideMenu_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_Dessert, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_Drinks, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 40, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InsideMenu_HomeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(InsideMenu_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel21B, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21A, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60))
            .addGroup(InsideMenu_HomeLayout.createSequentialGroup()
                .addGap(247, 247, 247)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        InsideMenu_HomeLayout.setVerticalGroup(
            InsideMenu_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InsideMenu_HomeLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(InsideMenu_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Search))
                .addGap(51, 51, 51)
                .addComponent(jLabel_Latest)
                .addGap(18, 18, 18)
                .addGroup(InsideMenu_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InsideMenu_HomeLayout.createSequentialGroup()
                        .addGroup(InsideMenu_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(InsideMenu_HomeLayout.createSequentialGroup()
                                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel12A)
                                .addGap(3, 3, 3)
                                .addComponent(jLabel12B, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(InsideMenu_HomeLayout.createSequentialGroup()
                                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel11A)
                                .addGap(3, 3, 3)
                                .addComponent(jLabel11B, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18))
                    .addGroup(InsideMenu_HomeLayout.createSequentialGroup()
                        .addGroup(InsideMenu_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(InsideMenu_HomeLayout.createSequentialGroup()
                                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel13A)
                                .addGap(3, 3, 3)
                                .addComponent(jLabel13B, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(InsideMenu_HomeLayout.createSequentialGroup()
                                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel14A)
                                .addGap(3, 3, 3)
                                .addComponent(jLabel14B, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20)))
                .addGroup(InsideMenu_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InsideMenu_HomeLayout.createSequentialGroup()
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel15A)
                        .addGap(3, 3, 3)
                        .addComponent(jLabel15B, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(InsideMenu_HomeLayout.createSequentialGroup()
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel16A)
                        .addGap(3, 3, 3)
                        .addGroup(InsideMenu_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16B, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17B, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20B, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(InsideMenu_HomeLayout.createSequentialGroup()
                        .addGroup(InsideMenu_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(InsideMenu_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17A, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20A))))
                .addGroup(InsideMenu_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InsideMenu_HomeLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(JLabel_MostFavorite)
                        .addGap(26, 26, 26)
                        .addComponent(jPanel_21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(InsideMenu_HomeLayout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addGroup(InsideMenu_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(InsideMenu_HomeLayout.createSequentialGroup()
                                .addComponent(jPanel_22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel22A)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel22B, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(InsideMenu_HomeLayout.createSequentialGroup()
                                .addComponent(jPanel_23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel23A)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel23B, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_Create, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addComponent(jLabel21A)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel21B, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addComponent(JLabel_LookByCategory)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(InsideMenu_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(InsideMenu_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InsideMenu_HomeLayout.createSequentialGroup()
                        .addComponent(jButton_Dessert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(15, 15, 15)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_Drinks, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton_MainCourse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(124, 124, 124)
                .addComponent(jLabel4)
                .addGap(228, 228, 228))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1042, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(InsideMenu_Home, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2309, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(InsideMenu_Home, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_SearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_SearchMouseClicked
        jTextField_Search.setEditable(true);
        jTextField_Search.setText("");
    }//GEN-LAST:event_jTextField_SearchMouseClicked

    private void jButton_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SearchActionPerformed
        String search_item = jTextField_Search.getText();
        ArrayList result = new Search().SearchMenu(search_item, foodDataBase);
        
        if (result.size() > 0){
            home.jScrollPane1.setViewportView(new InsideMenu_Category(result, search_item, foodDataBase, home));
        }else{
            JOptionPane.showMessageDialog(null, "Not found this Menu.");
            jTextField_Search.setText("");
        }
    }//GEN-LAST:event_jButton_SearchActionPerformed

    private void jButton_CreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CreateActionPerformed
        
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
                setDetail(allRecipe, myRecipe, mainCourse, dessert, drinks);
                
            }
        });
        
        
    }//GEN-LAST:event_jButton_CreateActionPerformed

    private void jButton_MainCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_MainCourseActionPerformed
       home.reHomeToMainCourse();
    }//GEN-LAST:event_jButton_MainCourseActionPerformed

    private void jButton_DessertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DessertActionPerformed
        home.reHomeToDessert();
    }//GEN-LAST:event_jButton_DessertActionPerformed

    private void jButton_DrinksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DrinksActionPerformed
        home.reHomeToDrinks();
    }//GEN-LAST:event_jButton_DrinksActionPerformed

    private void pic11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pic11MouseClicked
        if (lastest.size() - 1 >= 0){
            System.out.println("menu detail");
            new MenuDetail((FoodRecipe) lastest.get(0)).setVisible(true);
        }
    }//GEN-LAST:event_pic11MouseClicked

    private void pic12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pic12MouseClicked
        if (lastest.size() - 1 >= 1){
            System.out.println("menu detail");
            new MenuDetail((FoodRecipe) lastest.get(1)).setVisible(true);
        }
    }//GEN-LAST:event_pic12MouseClicked

    private void pic13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pic13MouseClicked
        if (lastest.size() - 1 >= 2){
            System.out.println("menu detail");
            new MenuDetail((FoodRecipe) lastest.get(2)).setVisible(true);
        }
    }//GEN-LAST:event_pic13MouseClicked

    private void pic14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pic14MouseClicked
        if (lastest.size() - 1 >= 3){
            System.out.println("menu detail");
            new MenuDetail((FoodRecipe) lastest.get(3)).setVisible(true);
        }
    }//GEN-LAST:event_pic14MouseClicked

    private void pic15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pic15MouseClicked
        if (lastest.size() - 1 >= 4){
            System.out.println("menu detail");
            new MenuDetail((FoodRecipe) lastest.get(4)).setVisible(true);
        }
    }//GEN-LAST:event_pic15MouseClicked

    private void pic16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pic16MouseClicked
        if (lastest.size() - 1 >= 5){
            System.out.println("menu detail");
            new MenuDetail((FoodRecipe) lastest.get(5)).setVisible(true);
        }
    }//GEN-LAST:event_pic16MouseClicked

    private void pic17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pic17MouseClicked
        if (lastest.size() - 1 >= 6){
            System.out.println("menu detail");
            new MenuDetail((FoodRecipe) lastest.get(6)).setVisible(true);
        }
    }//GEN-LAST:event_pic17MouseClicked

    private void pic20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pic20MouseClicked
        
        if (lastest.size() - 1 >= 7){
            System.out.println("menu detail");
            new MenuDetail((FoodRecipe) lastest.get(6)).setVisible(true);
        }
    }//GEN-LAST:event_pic20MouseClicked

    private void pic22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pic22MouseClicked
        if (recipe.size() - 1 >= 0){
            System.out.println("menu detail");
            new MenuDetail((FoodRecipe) recipe.get(0)).setVisible(true);
        }
    }//GEN-LAST:event_pic22MouseClicked

    private void pic23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pic23MouseClicked
        if (recipe.size() - 1 >= 1){
            System.out.println("menu detail");
            new MenuDetail((FoodRecipe) recipe.get(1)).setVisible(true);
        }
    }//GEN-LAST:event_pic23MouseClicked

    private void pic21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pic21MouseClicked
        if (recipe.size() - 1 >= 2){
            System.out.println("menu detail");
            new MenuDetail((FoodRecipe) recipe.get(2)).setVisible(true);
        }
    }//GEN-LAST:event_pic21MouseClicked



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel InsideMenu_Home;
    private javax.swing.JLabel JLabel_LookByCategory;
    private javax.swing.JLabel JLabel_MostFavorite;
    private javax.swing.JButton jButton_Create;
    private javax.swing.JButton jButton_Dessert;
    private javax.swing.JButton jButton_Drinks;
    public javax.swing.JButton jButton_MainCourse;
    private javax.swing.JButton jButton_Search;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11A;
    private javax.swing.JLabel jLabel11B;
    private javax.swing.JLabel jLabel12A;
    private javax.swing.JLabel jLabel12B;
    private javax.swing.JLabel jLabel13A;
    private javax.swing.JLabel jLabel13B;
    private javax.swing.JLabel jLabel14A;
    private javax.swing.JLabel jLabel14B;
    private javax.swing.JLabel jLabel15A;
    private javax.swing.JLabel jLabel15B;
    private javax.swing.JLabel jLabel16A;
    private javax.swing.JLabel jLabel16B;
    private javax.swing.JLabel jLabel17A;
    private javax.swing.JLabel jLabel17B;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20A;
    private javax.swing.JLabel jLabel20B;
    private javax.swing.JLabel jLabel21A;
    private javax.swing.JLabel jLabel21B;
    private javax.swing.JLabel jLabel22A;
    private javax.swing.JLabel jLabel22B;
    private javax.swing.JLabel jLabel23A;
    private javax.swing.JLabel jLabel23B;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel_Latest;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel_21;
    private javax.swing.JPanel jPanel_22;
    private javax.swing.JPanel jPanel_23;
    private javax.swing.JTextField jTextField_Search;
    private javax.swing.JLabel pic11;
    private javax.swing.JLabel pic12;
    private javax.swing.JLabel pic13;
    private javax.swing.JLabel pic14;
    private javax.swing.JLabel pic15;
    private javax.swing.JLabel pic16;
    private javax.swing.JLabel pic17;
    private javax.swing.JLabel pic20;
    private javax.swing.JLabel pic21;
    private javax.swing.JLabel pic22;
    private javax.swing.JLabel pic23;
    // End of variables declaration//GEN-END:variables
}

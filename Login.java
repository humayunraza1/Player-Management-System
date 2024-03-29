
import java.awt.Cursor;
import static java.lang.System.console;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.text.NumberFormatter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author humay
 */
public class Login extends javax.swing.JFrame {

   
    /**
     * Creates new form Login
     */
    private Account acc = new Account();
    private String userName;
    private String fpass;
    private Person a=null;
    private Manager mg=null;
    private Player p = null;
    private Position pos;
    private int sNum;
    private double price;
    private boolean m;
    private boolean f;
    private final static String pin = "6969";
    private String inputPin;
    private boolean isAdmin;
    private ArrayList<User> users = new ArrayList<>();
    private ArrayList<Person> person = new ArrayList<>();
    public Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Gender = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        Lname = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        log = new javax.swing.JButton();
        nextB = new javax.swing.JButton();
        setPin = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        sNo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        posBox = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        next2 = new javax.swing.JButton();
        pField = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        setUser = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        signup = new javax.swing.JButton();
        setPass = new javax.swing.JPasswordField();
        setPass1 = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        getUser = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        getPass = new javax.swing.JPasswordField();
        login = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setText("First Name");

        jLabel7.setText("Last Name");

        Gender.add(male);
        male.setText("Male");
        male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleActionPerformed(evt);
            }
        });

        Gender.add(female);
        female.setText("Female");
        female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleActionPerformed(evt);
            }
        });

        jLabel8.setText("Gender");

        log.setText("Already have an account: Sign In");
        log.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        log.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                logMouseMoved(evt);
            }
        });
        log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logActionPerformed(evt);
            }
        });

        nextB.setText("Next");
        nextB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBActionPerformed(evt);
            }
        });

        setPin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setPinActionPerformed(evt);
            }
        });

        jLabel9.setText("PIN (Optional)");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(350, 350, 350)
                        .addComponent(nextB))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(setPin, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                                .addComponent(jLabel9))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel8)
                                .addComponent(Lname, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                                .addComponent(jLabel7)
                                .addComponent(fname)
                                .addComponent(jLabel6)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(male)
                                    .addGap(18, 18, 18)
                                    .addComponent(female))
                                .addComponent(log, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(317, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Lname, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(setPin, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(male)
                    .addComponent(female))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nextB)
                .addGap(32, 32, 32)
                .addComponent(log)
                .addGap(47, 47, 47))
        );

        jTabbedPane1.addTab("tab3", jPanel3);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setText("PLAYER SIGNUP");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("Shirt No#");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("Position");

        posBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "S", "CF", "LW", "RW", "LM", "RM", "CM", "DM", "CB", "LB", "RB" }));
        posBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                posBoxActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setText("Price");

        next2.setText("Next");
        next2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                next2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(275, 275, 275)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(354, 354, 354)
                        .addComponent(next2))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(307, 307, 307)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel13)
                            .addComponent(jLabel11)
                            .addComponent(sNo)
                            .addComponent(jLabel12)
                            .addComponent(posBox, 0, 169, Short.MAX_VALUE)
                            .addComponent(pField))))
                .addContainerGap(280, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sNo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(posBox, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(next2)
                .addContainerGap(95, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab4", jPanel4);

        setUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setUserActionPerformed(evt);
            }
        });

        jLabel1.setText("Enter Password");

        jLabel2.setText("Username");

        signup.setText("Sign Up");
        signup.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        signup.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                signupMouseMoved(evt);
            }
        });
        signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupActionPerformed(evt);
            }
        });

        setPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setPassActionPerformed(evt);
            }
        });

        jLabel5.setText("Confirm Password");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(300, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(setPass1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(setPass, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(setUser, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(316, 316, 316))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(362, 362, 362)
                .addComponent(signup)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(119, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(setUser, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(setPass, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(setPass1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(signup)
                .addGap(147, 147, 147))
        );

        jTabbedPane1.addTab("tab1", jPanel1);

        jLabel3.setText("Password");

        jLabel4.setText("Username");

        login.setText("Login");
        login.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                loginMouseMoved(evt);
            }
        });
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(310, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(getPass)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(getUser, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE))
                        .addGap(292, 292, 292))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(login)
                        .addGap(370, 370, 370))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(166, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(getUser, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(getPass, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(login)
                .addGap(109, 109, 109))
        );

        jTabbedPane1.addTab("tab2", jPanel2);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -31, -1, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logActionPerformed
        // TODO add your handling code here:
         Cursor a = new Cursor(Cursor.HAND_CURSOR);
         log.setCursor(a);
        jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_logActionPerformed

    private void signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupActionPerformed

            // TODO add your handling code here:
                
            this.sNo.setText("0");
            this.pField.setText("0");
            Registration();
            JOptionPane.showMessageDialog(null, "Registration Complete!");
            jTabbedPane1.setSelectedIndex(3);
           
            
//        System.out.println(isAdmin);
    }//GEN-LAST:event_signupActionPerformed

    private void setUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setUserActionPerformed
        // TODO add your handling code here:
        userName = this.setUser.getText();
    }//GEN-LAST:event_setUserActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        // TODO add your handling code here:
        Home h = new Home();
        String x = this.getUser.getText();
        String y = this.getPass.getText();
        if(acc.login(x,y)){
            h.setLocationRelativeTo(null);
            h.setVisible(true);
            h.show();
            dispose();
        }else{
            JOptionPane.showMessageDialog(null, "Invalid account details");
        }
    }//GEN-LAST:event_loginActionPerformed

    private void loginMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseMoved
        // TODO add your handling code here:
        Cursor a = new Cursor(Cursor.HAND_CURSOR);
        login.setCursor(a);
    }//GEN-LAST:event_loginMouseMoved

    private void logMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logMouseMoved
        // TODO add your handling code here:
        Cursor a = new Cursor(Cursor.HAND_CURSOR);
        log.setCursor(a);
    }//GEN-LAST:event_logMouseMoved

    private void signupMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupMouseMoved
        // TODO add your handling code here:
        Cursor a = new Cursor(Cursor.HAND_CURSOR);
        signup.setCursor(a);
    }//GEN-LAST:event_signupMouseMoved

    private void femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleActionPerformed
        // TODO add your handling code here:
        f = true;
    }//GEN-LAST:event_femaleActionPerformed

    private void nextBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBActionPerformed
        // TODO add your handling code here:
        String fname = this.fname.getText();
        String Lname = this.Lname.getText();
        if((fname.equals("")||Lname.equals(""))||(m==false&&f==false)){
            JOptionPane.showMessageDialog(null,"Fields should not be empty");
        } else if(m==true&&!this.setPin.getText().equals("6969")){
             a = new Person(fname,Lname,'M');
            jTabbedPane1.setSelectedIndex(1);
        } else if(f==true&&!this.setPin.getText().equals("6969")){
            a = new Person(fname,Lname,'F');
            jTabbedPane1.setSelectedIndex(1);
        } else if(f==true||this.setPin.getText().equals(pin)){
             a = new Person(fname,Lname,'F');
            isAdmin=true;
           jTabbedPane1.setSelectedIndex(2);
        } else if(m==true||this.setPin.getText().equals(pin)){
            a = new Person(fname,Lname,'M');
            isAdmin=true;
            jTabbedPane1.setSelectedIndex(2);
        }
    }//GEN-LAST:event_nextBActionPerformed

    private void maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleActionPerformed
        // TODO add your handling code here:
           m = true;
    }//GEN-LAST:event_maleActionPerformed

    private void setPinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setPinActionPerformed
        inputPin = this.setPin.getText();
    }//GEN-LAST:event_setPinActionPerformed

    private void posBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_posBoxActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_posBoxActionPerformed

    private void next2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_next2ActionPerformed
        // TODO add your handling code here:
       try{
        Registration();
        jTabbedPane1.setSelectedIndex(2);
//        System.out.println(pos+"   "+price+"   "+sNum);
       }catch(NumberFormatException e){
           JOptionPane.showMessageDialog(null, "Enter numbers only");
       }
    }//GEN-LAST:event_next2ActionPerformed

    private void setPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_setPassActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        Login l = new Login();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                l.setLocationRelativeTo(null);
                l.setVisible(true);
            }
        });
    }
    public void Registration() throws NumberFormatException{
        
    userName = this.setUser.getText();
    String x = (String) this.posBox.getSelectedItem();
    pos = Position.valueOf(x);
    sNum =Integer.parseInt(this.sNo.getText());
    price = Double.parseDouble(this.pField.getText());
    String passWord = this.setPass.getText();
    String conPass = this.setPass1.getText();
    int length = userName.length();
    for(int i =0;i<users.size();i++){
        if(userName==users.get(i).getUsername()){
            JOptionPane.showMessageDialog(null, "Username already taken!");
//            return false;
        }
    }
        for(int i = 0;i<length;i++){
            if(userName.charAt(i)==' '){
                JOptionPane.showMessageDialog(null, "Username should not have spaces");
//                return false;
            }
        }
        if(conPass.matches(passWord)){
            fpass = this.setPass.getText();
            if(isAdmin==true){
                mg = new Manager(a);
                User u = new User(userName,fpass,mg);
                acc.SignUp(u);
                users =acc.getUsers();
            } else if(isAdmin == false){
                p = new Player(a,sNum,pos,price);
                User u = new User(userName,fpass,p);
                acc.SignUp(u);
               users=acc.getUsers();
            }
        } else {
            JOptionPane.showMessageDialog(null,"Password doesnot match");
//            return false;
        }
//        return true;
    }

//    public boolean loginAuthorization(){
//        userName = this.getUser.getText();
//        String p = this.getPass.getText();
////        
////       for(int i = 0; i<acc.size();i++){
////           if(acc.get(i).getUserName().compareTo(userName) == 0 && acc.get(i).getPass().compareTo(p)==0){
////               return true;
////           } else {
////               JOptionPane.showMessageDialog(null,"Invalid Account Details");
////       return false;
////           }
////       }
////       return false;
//    }
    
    public String getUserName(){
        return userName;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Gender;
    private javax.swing.JTextField Lname;
    private javax.swing.JRadioButton female;
    private javax.swing.JTextField fname;
    private javax.swing.JPasswordField getPass;
    private javax.swing.JTextField getUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton log;
    private javax.swing.JButton login;
    private javax.swing.JRadioButton male;
    private javax.swing.JButton next2;
    private javax.swing.JButton nextB;
    private javax.swing.JTextField pField;
    private javax.swing.JComboBox<String> posBox;
    private javax.swing.JTextField sNo;
    private javax.swing.JPasswordField setPass;
    private javax.swing.JPasswordField setPass1;
    private javax.swing.JTextField setPin;
    private javax.swing.JTextField setUser;
    private javax.swing.JButton signup;
    // End of variables declaration//GEN-END:variables
}

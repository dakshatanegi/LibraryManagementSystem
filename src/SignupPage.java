
package Jframe;

import javax.swing.JOptionPane;
import java.sql.*;


/**
 *
 * @author 91838
 */
public class SignupPage extends javax.swing.JFrame {

    /**
     * Creates new form SignupPage
     */
    public SignupPage() {
        initComponents();
    }
    public void insertSignupDetails(){
        String name=textuser.getText();
        String pwd=textpassword.getText();
       String email=textemail.getText() ;
        String contact=textcontact.getText();
        try{
            Connection con =DBConnection.getConnection();
            String sql="insert into users (name,password,email,contact) values(?,?,?,?)";
            PreparedStatement pst=con.prepareStatement(sql);
            
            pst.setString(1,name);
            pst.setString(2,pwd);
           pst.setString(3,email);
            pst.setString(4,contact);
            int updatedRowCount=pst.executeUpdate();
            
            if(updatedRowCount>0){
                JOptionPane.showMessageDialog(this,"Recorded Inserted successfully");
                LoginPage page=new LoginPage();
                page.setVisible(true);
                dispose();
            }else{
                JOptionPane.showMessageDialog(this,"Recorded Insertion Failed");
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public boolean validateSignup(){
            String name=textuser.getText();
        String pwd=textpassword.getText();
        String email=textemail.getText() ;
        String contact=textcontact.getText();
        
        if(name.equals("")){
            JOptionPane.showMessageDialog(this,"please enter username");
            return false;
        }
        
         if(name.equals("")){
            JOptionPane.showMessageDialog(this,"please enter username");
            return false;
        }
        
         if(pwd.equals("")){
            JOptionPane.showMessageDialog(this,"please enter password");
            return false;
        }
        
       if(email.equals("")|| !email.matches("^.+@.+\\..+$")){
          JOptionPane.showMessageDialog(this,"please enter username");
          return false;
       }
        
         if(contact.equals("")){
            JOptionPane.showMessageDialog(this,"please enter contact number");
            return false;
        }
        return true;
    }
    
   public boolean checkDuplicateUser(){
       String name=textuser.getText();
       boolean isExit=false;
       try{
           Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/library","root","dakshata09");
         
         PreparedStatement pst=con.prepareStatement("select * from users where name= ? ");
         pst.setString(1, name);
         ResultSet rs=pst.executeQuery();
         if(rs.next()){
             isExit=true;
         }else{
             isExit=false;
         }
       }catch(Exception e){
           e.printStackTrace();
       }
       return isExit;
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
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        textuser = new app.bolivia.swing.JCTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        textemail = new app.bolivia.swing.JCTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        textcontact = new app.bolivia.swing.JCTextField();
        jLabel16 = new javax.swing.JLabel();
        rSMaterialButtonCircle1 = new necesario.RSMaterialButtonCircle();
        rSMaterialButtonCircle2 = new necesario.RSMaterialButtonCircle();
        textpassword = new app.bolivia.swing.JCTextField();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Calibri Light", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 255));
        jLabel2.setText("Digital Library");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 270, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/signup-library-icon.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 820, 510));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Calibri Light", 1, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 51, 51));
        jLabel6.setText("WELCOME TO");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, 270, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 830));

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Calibri Light", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Account_50px.png"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 60, 50));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Cambria Math", 1, 25)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("X");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 30, -1));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Calibri Light", 0, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Create a new account");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 270, 20));

        textuser.setBackground(new java.awt.Color(102, 102, 255));
        textuser.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        textuser.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        textuser.setPlaceholder("Enter Username");
        textuser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                textuserFocusLost(evt);
            }
        });
        textuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textuserActionPerformed(evt);
            }
        });
        jPanel2.add(textuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, -1, -1));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Calibri Light", 0, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("UserName: ");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 270, 20));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Calibri Light", 0, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Secure_50px.png"))); // NOI18N
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 60, 50));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Calibri Light", 0, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Password:");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 270, 20));

        textemail.setBackground(new java.awt.Color(102, 102, 255));
        textemail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        textemail.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        textemail.setPlaceholder("Enter email id");
        textemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textemailActionPerformed(evt);
            }
        });
        jPanel2.add(textemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, -1, -1));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Calibri Light", 0, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Email:");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, 270, 20));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Calibri Light", 0, 20)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Secured_Letter_50px.png"))); // NOI18N
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 60, 50));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Calibri Light", 0, 20)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Google_Mobile_50px.png"))); // NOI18N
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 60, 50));

        textcontact.setBackground(new java.awt.Color(102, 102, 255));
        textcontact.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        textcontact.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        textcontact.setPlaceholder("Enter Contact");
        textcontact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textcontactActionPerformed(evt);
            }
        });
        jPanel2.add(textcontact, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 510, -1, -1));

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Calibri Light", 0, 20)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Contact:");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 480, 270, 20));

        rSMaterialButtonCircle1.setBackground(new java.awt.Color(51, 0, 204));
        rSMaterialButtonCircle1.setText("Login");
        rSMaterialButtonCircle1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonCircle1ActionPerformed(evt);
            }
        });
        jPanel2.add(rSMaterialButtonCircle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 690, 220, 70));

        rSMaterialButtonCircle2.setBackground(new java.awt.Color(255, 51, 51));
        rSMaterialButtonCircle2.setText("Submit");
        rSMaterialButtonCircle2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonCircle2ActionPerformed(evt);
            }
        });
        jPanel2.add(rSMaterialButtonCircle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 600, 220, 70));

        textpassword.setBackground(new java.awt.Color(102, 102, 255));
        textpassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        textpassword.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        textpassword.setPlaceholder("Enter Password");
        textpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textpasswordActionPerformed(evt);
            }
        });
        jPanel2.add(textpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, -1, -1));

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Calibri Light", 1, 25)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("SignUp");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 140, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 0, 530, 830));

        setSize(new java.awt.Dimension(1523, 828));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void textuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textuserActionPerformed

    }//GEN-LAST:event_textuserActionPerformed

    private void textcontactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textcontactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textcontactActionPerformed

    private void rSMaterialButtonCircle1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonCircle1ActionPerformed
        LoginPage page=new LoginPage();
         page.setVisible(true);
        dispose();
    }//GEN-LAST:event_rSMaterialButtonCircle1ActionPerformed

    private void rSMaterialButtonCircle2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonCircle2ActionPerformed
        
        if(validateSignup()==true ){
            if(checkDuplicateUser()==false){
                 insertSignupDetails();
            }else{
                if(checkDuplicateUser()== true){
            JOptionPane.showMessageDialog(this,"user already exist");
        } 
            }
           
        }
        
    }//GEN-LAST:event_rSMaterialButtonCircle2ActionPerformed

    private void textpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textpasswordActionPerformed

    private void textemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textemailActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void textuserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textuserFocusLost
        if(checkDuplicateUser()== true){
            JOptionPane.showMessageDialog(this,"user already exist");
        }
    }//GEN-LAST:event_textuserFocusLost

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
            java.util.logging.Logger.getLogger(SignupPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignupPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignupPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignupPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignupPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private necesario.RSMaterialButtonCircle rSMaterialButtonCircle1;
    private necesario.RSMaterialButtonCircle rSMaterialButtonCircle2;
    private app.bolivia.swing.JCTextField textcontact;
    private app.bolivia.swing.JCTextField textemail;
    private app.bolivia.swing.JCTextField textpassword;
    private app.bolivia.swing.JCTextField textuser;
    // End of variables declaration//GEN-END:variables
}
 
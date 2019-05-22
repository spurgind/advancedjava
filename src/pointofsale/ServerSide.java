/*
 * CTUOnline Educational Use Only
 */

package pointofsale;

/**
 *Dalton Spurgin 
 */

//Importing libraries

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.*;


public class ServerSide extends javax.swing.JFrame {
    
    
    /**
     * Creates new form ServerClient
     */
    public ServerSide() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        submitForm = new javax.swing.JButton();
        exitForm = new javax.swing.JButton();
        userNameForm = new javax.swing.JTextField();
        passForm = new javax.swing.JPasswordField();
        uNameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setName("loginFrame"); // NOI18N
        setResizable(false);

        submitForm.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        submitForm.setText("Submit");
        submitForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitFormActionPerformed(evt);
            }
        });

        exitForm.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        exitForm.setText("Exit");
        exitForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitFormActionPerformed(evt);
            }
        });

        userNameForm.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        userNameForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameFormActionPerformed(evt);
            }
        });

        passForm.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        uNameLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        uNameLabel.setText("Username:");

        passwordLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        passwordLabel.setText("Password:");

        titleLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        titleLabel.setText("Client Login");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(passwordLabel)
                            .addComponent(uNameLabel))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(userNameForm, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(passForm, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 45, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(submitForm)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exitForm)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(titleLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uNameLabel)
                    .addComponent(userNameForm))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(passForm))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitForm)
                    .addComponent(exitForm))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitFormActionPerformed
        SelectProcess processWindow = new SelectProcess();
        
        
        
        if(userNameForm.getText().length()==0)
        JOptionPane.showMessageDialog(null, "Please fill all required fields!");
        else if(passForm.getPassword().length==0)
        JOptionPane.showMessageDialog(null, "Please fill all required fields!");
        else {
            String user = userNameForm.getText();
            char[] pass = passForm.getPassword();
            String pwd = String.copyValueOf(pass);

            if(validate_login(user,pwd)) {
            
            //opens new JFrame - select process frame
            processWindow.setVisible(true);
            
            //closes login window
            this.dispose();
            
            }
            
            else
            JOptionPane.showMessageDialog(null, "Invalid username/password or you do not have access.");

        }
        

    }//GEN-LAST:event_submitFormActionPerformed

    private void exitFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitFormActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitFormActionPerformed

    private void userNameFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameFormActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameFormActionPerformed

    //Validate Login to ServerSide
        private boolean validate_login(String username,String password) {

            try {
                
                Connection con =(Connection) DriverManager.getConnection("jdbc:mysql://localhost/servermanager", "admin", "MTcZNQ4cmPr65G1q");
                PreparedStatement pst = con.prepareStatement("SELECT * FROM `login` WHERE `username`=? AND `password`=?");
                pst.setString(1, username); //look specifically for username in preparedstatement
                pst.setString(2, password); //look specifically for password in preparedstatement
                ResultSet rs = pst.executeQuery(); //execute the prepared statement which is the SQL statement above
                
                
                if(!rs.next()) //look by record
                    return false;
                else 
                    return true;
                
            } catch (Exception ex) {
                ex.printStackTrace();
                return false;
            }    
            
    }
    
    public static void createCustomerFile() {

        File customerFile = new File("customer.csv");
        
        try {
            BufferedWriter fwc = new BufferedWriter ( new FileWriter(customerFile, true));
            if(!customerFile.exists()) {
            customerFile.createNewFile();
            
            } 
            else {
            System.out.println("Customer File Already Created");
            }
        }
        catch (IOException e){
            System.out.println("Exception while writing to Customer Information csv file: " + e);
                            }

    }

    public static void server(){

                
        //create socket connection
        try{
            ServerSocket server = new ServerSocket(8080, 100); 
                Socket connection = server.accept();
                
            //creating customer file on server and preparing for read/write
            FileOutputStream customerFile = new FileOutputStream("customer.csv");
            ObjectOutputStream customerWrite = new ObjectOutputStream(customerFile);
            
            FileInputStream customerFileRead = new FileInputStream("customer.csv");
            ObjectInputStream customerRead = new ObjectInputStream(customerFileRead);
            
            //creating product file on server and preparing for read/write
            FileOutputStream productFile = new FileOutputStream("product.csv");
            ObjectOutputStream productFileWrite = new ObjectOutputStream(productFile);

            FileInputStream productFileRead = new FileInputStream("product.csv");
            ObjectInputStream productRead = new ObjectInputStream(productFileRead);            
                        
            
            System.out.println("Connected to Server");            
            } 
        catch (IOException e){
            System.out.println("Error connecting to server: " + e);
        }
    }
    
    public static void client(){
        try{
            Socket connection = new Socket("127.0.0.1", 8080); 
            
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
    
    
    public static void main(String args[]) {
        
        server();
        
        createCustomerFile();
        
        
        
        
        
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
            java.util.logging.Logger.getLogger(ServerSide.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ServerSide.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ServerSide.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ServerSide.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ServerSide().setVisible(true);
            }
        });
        
        
        
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitForm;
    private javax.swing.JPasswordField passForm;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JButton submitForm;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel uNameLabel;
    private javax.swing.JTextField userNameForm;
    // End of variables declaration//GEN-END:variables
}

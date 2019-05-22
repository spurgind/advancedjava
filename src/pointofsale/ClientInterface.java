/*
 * CTUOnline Educational Use Only
 */

package pointofsale;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *Dalton Spurgin 
 */

public class ClientInterface extends javax.swing.JFrame {

    /**
     * Creates new form ClientInterface
     */
    public ClientInterface() {
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

        submitInvoiceButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        clientFirstField = new javax.swing.JTextField();
        addClientLabel = new javax.swing.JLabel();
        firstNameLabel = new javax.swing.JLabel();
        lastNameLabel = new javax.swing.JLabel();
        clientLastField = new javax.swing.JTextField();
        scrollResults = new javax.swing.JScrollPane();
        invoiceResultsTextArea = new javax.swing.JTextArea();
        productIDLabel = new javax.swing.JLabel();
        productIDField = new javax.swing.JTextField();
        productNameLabel = new javax.swing.JLabel();
        productNameField = new javax.swing.JTextField();
        quantityLabel = new javax.swing.JLabel();
        quantityField = new javax.swing.JTextField();
        taxLabel = new javax.swing.JLabel();
        taxField = new javax.swing.JTextField();
        totalField = new javax.swing.JTextField();
        totalLabel = new javax.swing.JLabel();
        taxPercentLabel = new javax.swing.JLabel();
        totalUSDLabel = new javax.swing.JLabel();
        streetAddressLabel = new javax.swing.JLabel();
        streetAddressField = new javax.swing.JTextField();
        stateLabel = new javax.swing.JLabel();
        stateField = new javax.swing.JTextField();
        zipcodeLabel = new javax.swing.JLabel();
        zipcodeField = new javax.swing.JTextField();
        custIDLabel = new javax.swing.JLabel();
        custIDField = new javax.swing.JTextField();
        cityLabel = new javax.swing.JLabel();
        cityField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setName("invoiceFrame"); // NOI18N

        submitInvoiceButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        submitInvoiceButton.setText("Submit Invoice");
        submitInvoiceButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                submitInvoiceButtonMousePressed(evt);
            }
        });
        submitInvoiceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitInvoiceButtonActionPerformed(evt);
            }
        });

        backButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        clientFirstField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        clientFirstField.setToolTipText("First Name");
        clientFirstField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientFirstFieldActionPerformed(evt);
            }
        });

        addClientLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        addClientLabel.setText("Invoice");

        firstNameLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        firstNameLabel.setText("First Name : ");

        lastNameLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lastNameLabel.setText("Last Name : ");

        clientLastField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        clientLastField.setToolTipText("Last Name");
        clientLastField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientLastFieldActionPerformed(evt);
            }
        });

        invoiceResultsTextArea.setColumns(20);
        invoiceResultsTextArea.setRows(5);
        scrollResults.setViewportView(invoiceResultsTextArea);

        productIDLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        productIDLabel.setText("Product ID : ");

        productIDField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        productIDField.setToolTipText("Product ID - 6 Numbers or Letters");
        productIDField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productIDFieldActionPerformed(evt);
            }
        });

        productNameLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        productNameLabel.setText("Product Name : ");

        productNameField.setEditable(false);
        productNameField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        productNameField.setToolTipText("Product Name");
        productNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productNameFieldActionPerformed(evt);
            }
        });

        quantityLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        quantityLabel.setText("Quantity : ");

        quantityField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        quantityField.setToolTipText("Number of Product");
        quantityField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityFieldActionPerformed(evt);
            }
        });

        taxLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        taxLabel.setText("Taxes : ");

        taxField.setEditable(false);
        taxField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        taxField.setText("6.5");
        taxField.setToolTipText("Tax Rate");
        taxField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taxFieldActionPerformed(evt);
            }
        });

        totalField.setEditable(false);
        totalField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        totalField.setToolTipText("Total of Invoice");
        totalField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalFieldActionPerformed(evt);
            }
        });

        totalLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        totalLabel.setText("Total : ");

        taxPercentLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        taxPercentLabel.setText("%");

        totalUSDLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        totalUSDLabel.setText("$ USD");

        streetAddressLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        streetAddressLabel.setText("Street Address : ");

        streetAddressField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        streetAddressField.setToolTipText("Last Name");
        streetAddressField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                streetAddressFieldActionPerformed(evt);
            }
        });

        stateLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        stateLabel.setText("State : ");

        stateField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        stateField.setToolTipText("Last Name");
        stateField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stateFieldActionPerformed(evt);
            }
        });

        zipcodeLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        zipcodeLabel.setText("Zip Code : ");

        zipcodeField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        zipcodeField.setToolTipText("Last Name");
        zipcodeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zipcodeFieldActionPerformed(evt);
            }
        });

        custIDLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        custIDLabel.setText("Customer ID : ");

        custIDField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        custIDField.setToolTipText("First Name");
        custIDField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custIDFieldActionPerformed(evt);
            }
        });

        cityLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cityLabel.setText("City : ");

        cityField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cityField.setToolTipText("Last Name");
        cityField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollResults)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(163, 163, 163)
                                    .addComponent(addClientLabel))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lastNameLabel)
                                            .addComponent(firstNameLabel))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(clientLastField, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(clientFirstField, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(productNameLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(productNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(quantityLabel)
                                                    .addComponent(taxLabel))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(taxField)
                                                    .addComponent(quantityField)))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(productIDLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(productIDField))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(totalLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(totalField, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(taxPercentLabel)
                                            .addComponent(totalUSDLabel)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(cityLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cityField, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(stateLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(stateField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(zipcodeLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(zipcodeField, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(submitInvoiceButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(backButton))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(streetAddressLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(streetAddressField, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(custIDLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(custIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(212, 212, 212)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addClientLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(custIDLabel)
                    .addComponent(custIDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameLabel)
                    .addComponent(clientFirstField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastNameLabel)
                    .addComponent(clientLastField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(streetAddressLabel)
                    .addComponent(streetAddressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(zipcodeLabel)
                        .addComponent(zipcodeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cityLabel)
                        .addComponent(cityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(stateLabel)
                        .addComponent(stateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productIDLabel)
                    .addComponent(productIDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productNameLabel)
                    .addComponent(productNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quantityLabel)
                    .addComponent(quantityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(taxLabel)
                    .addComponent(taxField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(taxPercentLabel))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalLabel)
                    .addComponent(totalField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalUSDLabel))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitInvoiceButton)
                    .addComponent(backButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollResults, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitInvoiceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitInvoiceButtonActionPerformed
        //set and get customer information    
        String delimiter = ",";
        String newLine = "\r\n";
        CustomerVar customer = new CustomerVar();
        
            customer.setCustomerID(Integer.parseInt(custIDField.getText())); 
            customer.setFirstName(clientFirstField.getText());
            customer.setLastName(clientLastField.getText());
            customer.setAddressStreet(streetAddressField.getText());
            customer.setAddressCity(cityField.getText());
            customer.setAddressState(stateField.getText());
            customer.setAddressZip(Integer.parseInt(zipcodeField.getText()));
            
            
        
            try{ 
            FileOutputStream customerFile = new FileOutputStream("customer.csv");
            ObjectOutputStream customerWrite = new ObjectOutputStream(customerFile);
            
            //write to customer.csv
            customerWrite.writeObject(customer.getCustomerID());
                customerWrite.writeObject(delimiter);
            customerWrite.writeObject(customer.getFirstName());
                customerWrite.writeObject(delimiter);
            customerWrite.writeObject(customer.getLastName());
                customerWrite.writeObject(delimiter);
            customerWrite.writeObject(customer.getAddressStreet());
                customerWrite.writeObject(delimiter);
            customerWrite.writeObject(customer.getAddressCity());
                customerWrite.writeObject(delimiter);
            customerWrite.writeObject(customer.getAddressState());
                customerWrite.writeObject(delimiter);
            customerWrite.writeObject(customer.getAddressZip()); 
                customerWrite.writeObject(delimiter);
                
                customerWrite.writeObject(newLine);

            } catch (IOException ex) {
            Logger.getLogger(ClientInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            

    
    }//GEN-LAST:event_submitInvoiceButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        //opens new JFrame - select process frame
        SelectProcess processWindow = new SelectProcess();
        processWindow.setVisible(true);
        
        //closes login window - using dispose allows the memory to be freed from this jframe
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void clientFirstFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientFirstFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clientFirstFieldActionPerformed

    private void clientLastFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientLastFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clientLastFieldActionPerformed

    private void productIDFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productIDFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productIDFieldActionPerformed

    private void productNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productNameFieldActionPerformed

    private void quantityFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantityFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityFieldActionPerformed

    private void taxFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taxFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_taxFieldActionPerformed

    private void totalFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalFieldActionPerformed

    private void streetAddressFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_streetAddressFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_streetAddressFieldActionPerformed

    private void stateFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stateFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stateFieldActionPerformed

    private void zipcodeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zipcodeFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_zipcodeFieldActionPerformed

    private void custIDFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custIDFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_custIDFieldActionPerformed

    private void cityFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityFieldActionPerformed

    private void submitInvoiceButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitInvoiceButtonMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_submitInvoiceButtonMousePressed

    

    public static void main(String args[]) throws IOException {


        
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addClientLabel;
    private javax.swing.JButton backButton;
    private javax.swing.JTextField cityField;
    private javax.swing.JLabel cityLabel;
    private javax.swing.JTextField clientFirstField;
    private javax.swing.JTextField clientLastField;
    private javax.swing.JTextField custIDField;
    private javax.swing.JLabel custIDLabel;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JTextArea invoiceResultsTextArea;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JTextField productIDField;
    private javax.swing.JLabel productIDLabel;
    private javax.swing.JTextField productNameField;
    private javax.swing.JLabel productNameLabel;
    private javax.swing.JTextField quantityField;
    private javax.swing.JLabel quantityLabel;
    private javax.swing.JScrollPane scrollResults;
    private javax.swing.JTextField stateField;
    private javax.swing.JLabel stateLabel;
    private javax.swing.JTextField streetAddressField;
    private javax.swing.JLabel streetAddressLabel;
    private javax.swing.JButton submitInvoiceButton;
    private javax.swing.JTextField taxField;
    private javax.swing.JLabel taxLabel;
    private javax.swing.JLabel taxPercentLabel;
    private javax.swing.JTextField totalField;
    private javax.swing.JLabel totalLabel;
    private javax.swing.JLabel totalUSDLabel;
    private javax.swing.JTextField zipcodeField;
    private javax.swing.JLabel zipcodeLabel;
    // End of variables declaration//GEN-END:variables
}


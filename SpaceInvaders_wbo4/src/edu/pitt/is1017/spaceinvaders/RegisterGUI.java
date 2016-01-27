package edu.pitt.is1017.spaceinvaders;

import javax.swing.JOptionPane;

/**
 *
 * @author William O'Toole
 */
@SuppressWarnings("serial")
public class RegisterGUI extends javax.swing.JFrame {

    /**
     * Creates new form RegisterGUI
     */
    public RegisterGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        lblEmail = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        lblTitle = new javax.swing.JLabel();
        sepTitle = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        lblRegFirstName = new javax.swing.JLabel();
        txtRegFirstName = new javax.swing.JTextField();
        lblRegLastName = new javax.swing.JLabel();
        lblEmail2 = new javax.swing.JLabel();
        txtRegEmail = new javax.swing.JTextField();
        lblRegPassword = new javax.swing.JLabel();
        txtRegPassword = new javax.swing.JPasswordField();
        lblRegConfirm = new javax.swing.JLabel();
        txtRegLastName = new javax.swing.JTextField();
        txtRegConfirm = new javax.swing.JPasswordField();
        btnRegCancel = new javax.swing.JButton();
        btnRegRegister = new javax.swing.JButton();
        sepTitle1 = new javax.swing.JSeparator();

        lblEmail.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblEmail.setText("Email:");

        jTextField1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitle.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("SPACE INVADERS - Registration");

        lblRegFirstName.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblRegFirstName.setText("First Name:");

        txtRegFirstName.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtRegFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRegFirstNameActionPerformed(evt);
            }
        });

        lblRegLastName.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblRegLastName.setText("Last Name:");

        lblEmail2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblEmail2.setText("Email:");

        txtRegEmail.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtRegEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRegEmailActionPerformed(evt);
            }
        });

        lblRegPassword.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblRegPassword.setText("Password:");

        txtRegPassword.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtRegPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRegPasswordActionPerformed(evt);
            }
        });

        lblRegConfirm.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblRegConfirm.setText("Confirm Password:");

        txtRegLastName.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtRegLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRegLastNAmeActionPerformed(evt);
            }
        });

        txtRegConfirm.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtRegConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRegConfirmActionPerformed(evt);
            }
        });

        btnRegCancel.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnRegCancel.setText("Cancel");
        btnRegCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegCancelActionPerformed(evt);
            }
        });

        btnRegRegister.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnRegRegister.setText("Register");
        btnRegRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegRegisterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRegLastName)
                    .addComponent(lblRegFirstName))
                .addGap(71, 71, 71)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtRegLastName)
                    .addComponent(txtRegFirstName)))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRegPassword)
                    .addComponent(lblEmail2)
                    .addComponent(lblRegConfirm))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnRegRegister)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(btnRegCancel))
                    .addComponent(txtRegPassword, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtRegEmail)
                    .addComponent(txtRegConfirm, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRegFirstName)
                    .addComponent(txtRegFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRegLastName)
                    .addComponent(txtRegLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail2)
                    .addComponent(txtRegEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRegPassword)
                    .addComponent(txtRegPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRegConfirm)
                    .addComponent(txtRegConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegCancel)
                    .addComponent(btnRegRegister)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sepTitle)
            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(sepTitle1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sepTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 22, Short.MAX_VALUE)
                .addComponent(sepTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void txtRegFirstNameActionPerformed(java.awt.event.ActionEvent evt) {                                                
        
    }                                               

    private void txtRegLastNAmeActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

    private void txtRegEmailActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void txtRegPasswordActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

    private void txtRegConfirmActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void btnRegCancelActionPerformed(java.awt.event.ActionEvent evt) {                                             
    	System.exit(0);
    }                                            

    private void btnRegRegisterActionPerformed(java.awt.event.ActionEvent evt) { 
    	char[] pass = txtRegPassword.getPassword();   	
    	String password = pass.toString();
    	
    	User newUser = new User(txtRegLastName.getText(), txtRegFirstName.getText(), txtRegEmail.getText(), password);
    	newUser.saveUserInfo();
    } 
    
    /**
     *@param lastName
     *@param firstName
     *@param email
     *@param password
     *@return True of entered values are not null
     */
    public boolean checkForNull(String l, String f, String em, String ps){
    	if(l==null|| f==null||em==null||ps==null){
    		JOptionPane.showMessageDialog(null, "Please Make sure all fields are valid.");
    		return false;
    	}   	
		return true;    	
    }
    
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
            java.util.logging.Logger.getLogger(RegisterGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterGUI().setVisible(true);
            }
        });
    }
    // GUI Variables declaration                    
    private javax.swing.JButton btnRegCancel;
    private javax.swing.JButton btnRegRegister;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEmail2;
    private javax.swing.JLabel lblRegConfirm;
    private javax.swing.JLabel lblRegFirstName;
    private javax.swing.JLabel lblRegLastName;
    private javax.swing.JLabel lblRegPassword;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JSeparator sepTitle;
    private javax.swing.JSeparator sepTitle1;
    private javax.swing.JPasswordField txtRegConfirm;
    private javax.swing.JTextField txtRegEmail;
    private javax.swing.JTextField txtRegFirstName;
    private javax.swing.JTextField txtRegLastName;
    private javax.swing.JPasswordField txtRegPassword;
    // End of GUI variables declaration                   
}

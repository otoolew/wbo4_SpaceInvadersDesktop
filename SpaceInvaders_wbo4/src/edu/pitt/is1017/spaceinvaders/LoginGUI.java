package edu.pitt.is1017.spaceinvaders;

/**
 *
 * @author William O'Toole
 */
public class LoginGUI extends javax.swing.JFrame {

	/**
	 * Creates new form LoginGUI
	 */
	public LoginGUI() {
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		sepTitle = new javax.swing.JSeparator();
		lblTitle = new javax.swing.JLabel();
		pnlLogin = new javax.swing.JPanel();
		lblLogEmail = new javax.swing.JLabel();
		lblLogPassword = new javax.swing.JLabel();
		txtLogEmail = new javax.swing.JTextField();
		txtLogPassword = new javax.swing.JTextField();
		btnLogLogin = new javax.swing.JButton();
		btnLogRegister = new javax.swing.JButton();
		btnLogCancel = new javax.swing.JButton();
		lblLogRegistationInfo = new javax.swing.JLabel();
		sepBottom = new javax.swing.JSeparator();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		lblTitle.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
		lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		lblTitle.setText("SPACE INVADERS - Login");

		lblLogEmail.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
		lblLogEmail.setText("Email:");

		lblLogPassword.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
		lblLogPassword.setText("Password:");

		txtLogEmail.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
		txtLogEmail.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txtLogEmailActionPerformed(evt);
			}
		});

		txtLogPassword.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
		txtLogPassword.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txtLogPasswordActionPerformed(evt);
			}
		});

		btnLogLogin.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
		btnLogLogin.setText("Login");
		btnLogLogin.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnLogLoginActionPerformed(evt);
			}
		});

		btnLogRegister.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
		btnLogRegister.setText("Register");
		btnLogRegister.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnLogRegisterActionPerformed(evt);
			}
		});

		btnLogCancel.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
		btnLogCancel.setText("Cancel");
		btnLogCancel.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnLogCancelActionPerformed(evt);
			}
		});

		lblLogRegistationInfo.setText("Click to Register as a new User");

		javax.swing.GroupLayout pnlLoginLayout = new javax.swing.GroupLayout(pnlLogin);
		pnlLogin.setLayout(pnlLoginLayout);
		pnlLoginLayout
				.setHorizontalGroup(
						pnlLoginLayout
								.createParallelGroup(
										javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(pnlLoginLayout.createSequentialGroup()
										.addGroup(pnlLoginLayout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(lblLogPassword).addComponent(lblLogEmail))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(txtLogEmail).addComponent(txtLogPassword)))
				.addComponent(btnLogLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						Short.MAX_VALUE)
				.addGroup(pnlLoginLayout.createSequentialGroup()
						.addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
								.addComponent(btnLogRegister, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblLogRegistationInfo, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
						.addComponent(btnLogCancel)));
		pnlLoginLayout.setVerticalGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(pnlLoginLayout.createSequentialGroup()
						.addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(lblLogEmail).addComponent(txtLogEmail,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(lblLogPassword).addComponent(txtLogPassword,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18).addComponent(btnLogLogin).addGap(18, 18, Short.MAX_VALUE)
						.addComponent(lblLogRegistationInfo)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(btnLogRegister).addComponent(btnLogCancel))));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(sepTitle)
				.addGroup(layout.createSequentialGroup().addContainerGap()
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(layout.createSequentialGroup().addGap(12, 12, 12)
								.addComponent(pnlLogin, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(0, 15, Short.MAX_VALUE)))
						.addContainerGap())
				.addComponent(sepBottom));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGap(11, 11, 11).addComponent(lblTitle)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(sepTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 12,
								javax.swing.GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addComponent(pnlLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.PREFERRED_SIZE).addGap(18, 18, Short.MAX_VALUE)
				.addComponent(sepBottom, javax.swing.GroupLayout.PREFERRED_SIZE, 12,
						javax.swing.GroupLayout.PREFERRED_SIZE).addContainerGap()));

		pack();
	}// </editor-fold>

	private void txtLogEmailActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void txtLogPasswordActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void btnLogCancelActionPerformed(java.awt.event.ActionEvent evt) {
		System.exit(0);
	}

	private void btnLogLoginActionPerformed(java.awt.event.ActionEvent evt) {
		String email = txtLogEmail.getText();
		String password = txtLogPassword.getText();
		User user = new User(email, password);
		System.out.println("User Info:\n" + user.toString());
		clearForm();
	}

	private void btnLogRegisterActionPerformed(java.awt.event.ActionEvent evt) {
		clearForm();
		RegisterGUI register = new RegisterGUI();
		register.setVisible(true);
	}

	/**
	 * Clears Login TextFields
	 */
	public void clearForm() {
		txtLogEmail.setText("");
		txtLogPassword.setText("");
	}

	/**
	 * 
	 * @param input
	 * @return true if input has greater than 4 length, and no white space
	 */
	public String cleanInput(String input) {
		input.replaceAll(" ", "");
		input.replaceAll("SELECT", "");
		input.replaceAll("DELETE", "");
		return input;
	}

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting
		// code (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the
		 * default look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.
		 * html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new LoginGUI().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify
	private javax.swing.JButton btnLogCancel;
	private javax.swing.JButton btnLogLogin;
	private javax.swing.JButton btnLogRegister;
	private javax.swing.JLabel lblLogEmail;
	private javax.swing.JLabel lblLogPassword;
	private javax.swing.JLabel lblLogRegistationInfo;
	private javax.swing.JLabel lblTitle;
	private javax.swing.JPanel pnlLogin;
	private javax.swing.JSeparator sepBottom;
	private javax.swing.JSeparator sepTitle;
	private javax.swing.JTextField txtLogEmail;
	private javax.swing.JTextField txtLogPassword;
	// End of variables declaration
}

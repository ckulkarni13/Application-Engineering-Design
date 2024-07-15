/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import constants.Role;
import enterprise.auth.Auth;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.User;
import model.researcher.Researcher;

/**
 *
 * @author drag
 */
public class RegisterJPanel extends javax.swing.JPanel {

	MainJFrame ws;

	/**
	 * Creates new form RegisterJPanel
	 */
	public RegisterJPanel(MainJFrame ws) {
		this.ws = ws;

		initComponents();

		img.setIcon(new ImageIcon("resources/register.jpeg"));
		setBackground(Color.WHITE);

		this.ws.add(this);
		this.ws.pack();

		populateRoleCombo();
	}

	/**
	 * This method is called from within the constructor to initialize the
	 * form. WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jLabel3 = new javax.swing.JLabel();
                jLabel1 = new javax.swing.JLabel();
                txtEmail = new javax.swing.JTextField();
                jLabel2 = new javax.swing.JLabel();
                txtPassword = new javax.swing.JPasswordField();
                btnBack = new javax.swing.JButton();
                jLabel4 = new javax.swing.JLabel();
                txtLastName = new javax.swing.JTextField();
                jLabel5 = new javax.swing.JLabel();
                txtFirstName = new javax.swing.JTextField();
                jLabel6 = new javax.swing.JLabel();
                txtConfirmPassword = new javax.swing.JPasswordField();
                jLabel7 = new javax.swing.JLabel();
                comboRole = new javax.swing.JComboBox<>();
                btnRegister = new javax.swing.JButton();
                img = new javax.swing.JLabel();

                jLabel3.setFont(new java.awt.Font("Inter", 1, 24)); // NOI18N
                jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel3.setText("Register");

                jLabel1.setText("Email address*");

                txtEmail.setFont(new java.awt.Font("Hurmit Nerd Font Mono", 0, 15)); // NOI18N

                jLabel2.setText("Password*");

                txtPassword.setFont(new java.awt.Font("Hurmit Nerd Font Mono", 0, 15)); // NOI18N

                btnBack.setText("<< Back");
                btnBack.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnBackActionPerformed(evt);
                        }
                });

                jLabel4.setText("Last name*");

                txtLastName.setFont(new java.awt.Font("Hurmit Nerd Font Mono", 0, 15)); // NOI18N

                jLabel5.setText("First name*");

                txtFirstName.setFont(new java.awt.Font("Hurmit Nerd Font Mono", 0, 15)); // NOI18N

                jLabel6.setText("Select role*");

                txtConfirmPassword.setFont(new java.awt.Font("Hurmit Nerd Font Mono", 0, 15)); // NOI18N

                jLabel7.setText("Confirm Password*");

                comboRole.setFont(new java.awt.Font("Hurmit Nerd Font Mono", 0, 15)); // NOI18N
                comboRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

                btnRegister.setBackground(new java.awt.Color(0, 102, 0));
                btnRegister.setFont(new java.awt.Font("Inter", 1, 15)); // NOI18N
                btnRegister.setForeground(new java.awt.Color(255, 255, 255));
                btnRegister.setText("Register");
                btnRegister.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnRegisterActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                this.setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(img, javax.swing.GroupLayout.DEFAULT_SIZE, 676, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(txtEmail)
                                                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(txtFirstName)
                                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(comboRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btnBack))
                                                .addGap(38, 38, 38)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(txtConfirmPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(txtLastName)
                                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                                                        .addComponent(btnRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(30, 30, 30))
                );

                layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtEmail, txtFirstName, txtLastName, txtPassword});

                layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnRegister, comboRole, txtConfirmPassword});

                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(39, 39, 39)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(36, 36, 36)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(148, 148, 148)
                                                                .addComponent(btnBack)
                                                                .addGap(155, 155, 155))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(txtConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(comboRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(87, 87, 87)
                                                                .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(638, 638, 638))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(69, 69, 69))
                );

                layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnRegister, comboRole, txtConfirmPassword, txtEmail, txtFirstName, txtLastName, txtPassword});

        }// </editor-fold>//GEN-END:initComponents

        private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
		// TODO add your handling code here:
		this.setVisible(false);
		this.ws.getInitJPanel().setVisible(true);
        }//GEN-LAST:event_btnBackActionPerformed

        private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
		String firstName = txtFirstName.getText().trim();
		String lastName = txtLastName.getText().trim();
		String email = txtEmail.getText().trim();
		String password = txtPassword.getText().trim();
		String confirmPassword = txtConfirmPassword.getText().trim();
		String role = (String) comboRole.getSelectedItem();

		if (firstName.length() == 0
		    || lastName.length() == 0
		    || email.length() == 0
		    || password.length() == 0
		    || confirmPassword.length() == 0
		    || role.length() == 0) {
			JOptionPane.showMessageDialog(this, "Please enter all fields!");
			return;
		}

		if (!Auth.validateEmail(email)) {
			JOptionPane.showMessageDialog(this, "Ensure email is in correct format");
			return;
		}

		if (password.length() < 7) {
			JOptionPane.showMessageDialog(this, "Ensure password is atleast 7 characters long.");
			return;
		}

		if (!password.equals(confirmPassword)) {
			JOptionPane.showMessageDialog(this, "Please ensure passwords match!");
			return;
		}

		if (role.equals("RESEARCHER")) {
			User u = new User(firstName, lastName, email, password, "8572004661", Role.RESEARCHER);
			Researcher r = new Researcher();
			r.setUser(u);
			this.ws.getUserDir().addUser(u);
			this.ws.getResearcherDir().addResearcher(r);
			return;
		}

		Role userRole = Role.ADMIN;
		for (Role iteratorRole : Role.values()) {
			if (iteratorRole.toString().equalsIgnoreCase(role)) {
				userRole = iteratorRole;
			}
		}

		this.ws.getUserDir().addUser(new User(firstName, lastName, email, password, "8572004661", userRole));

		JOptionPane.showMessageDialog(this, "Account created as Role: " + userRole.toString() + " successfully. You may login now.");
		this.setVisible(false);
		this.ws.getInitJPanel().setVisible(true);
        }//GEN-LAST:event_btnRegisterActionPerformed

	public void populateRoleCombo() {
		comboRole.removeAllItems();

		for (Role r : Role.values()) {
			comboRole.addItem(r.toString());
		}
	}

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton btnBack;
        private javax.swing.JButton btnRegister;
        private javax.swing.JComboBox<String> comboRole;
        private javax.swing.JLabel img;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JLabel jLabel7;
        private javax.swing.JPasswordField txtConfirmPassword;
        private javax.swing.JTextField txtEmail;
        private javax.swing.JTextField txtFirstName;
        private javax.swing.JTextField txtLastName;
        private javax.swing.JPasswordField txtPassword;
        // End of variables declaration//GEN-END:variables
}

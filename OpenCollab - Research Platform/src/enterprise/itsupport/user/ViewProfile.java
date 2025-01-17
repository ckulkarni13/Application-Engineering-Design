/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package enterprise.itsupport.user;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.User;
import ui.MainJFrame;

/**
 *
 * @author drag
 */
public class ViewProfile extends javax.swing.JPanel {

	MainJFrame ws;
	JPanel csp;
	User user;

	/**
	 * Creates new form ViewProfile
	 */
	public ViewProfile(MainJFrame ws, JPanel csp) {
		this.ws = ws;
		this.csp = csp;
		this.user = this.ws.getLoggedUser();
		initComponents();
		setBackground(Color.WHITE);

		populateFields();
	}

	/**
	 * This method is called from within the constructor to initialize the
	 * form. WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                pageTitle = new javax.swing.JLabel();
                btnBack5 = new javax.swing.JButton();
                jLabel1 = new javax.swing.JLabel();
                txtFirstName = new javax.swing.JTextField();
                jLabel2 = new javax.swing.JLabel();
                txtLastName = new javax.swing.JTextField();
                txtRole = new javax.swing.JTextField();
                jLabel3 = new javax.swing.JLabel();
                txtEmail = new javax.swing.JTextField();
                jLabel4 = new javax.swing.JLabel();
                jLabel5 = new javax.swing.JLabel();
                txtPhone = new javax.swing.JTextField();
                btnSave = new javax.swing.JButton();

                pageTitle.setFont(new java.awt.Font("FreeSans", 1, 24)); // NOI18N
                pageTitle.setText("Your profile");

                btnBack5.setBackground(new java.awt.Color(255, 255, 255));
                btnBack5.setFont(new java.awt.Font("FreeSans", 1, 15)); // NOI18N
                btnBack5.setForeground(new java.awt.Color(51, 51, 51));
                btnBack5.setText("<< Back");
                btnBack5.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnBack5ActionPerformed(evt);
                        }
                });

                jLabel1.setText("First name");

                jLabel2.setText("Last name");

                txtRole.setEnabled(false);

                jLabel3.setText("Role");

                jLabel4.setText("Email");

                jLabel5.setText("Phone");

                btnSave.setBackground(new java.awt.Color(0, 102, 102));
                btnSave.setFont(new java.awt.Font("FreeSans", 1, 15)); // NOI18N
                btnSave.setText("Save changes");
                btnSave.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnSaveActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                this.setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(pageTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(txtFirstName)
                                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                                                        .addComponent(btnBack5, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(111, 111, 111)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(txtLastName)
                                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(txtPhone)
                                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(txtEmail)
                                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(111, 111, 111)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(txtRole)
                                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                                                        .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addContainerGap(435, Short.MAX_VALUE))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(pageTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(42, 42, 42)
                                                .addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtRole, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(63, 63, 63)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                                .addComponent(btnBack5)
                                .addGap(38, 38, 38))
                );
        }// </editor-fold>//GEN-END:initComponents

        private void btnBack5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack5ActionPerformed
		// TODO add your handling code here:
		csp.remove(this);
		((java.awt.CardLayout) csp.getLayout()).next(csp);
        }//GEN-LAST:event_btnBack5ActionPerformed

        private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
		if (txtEmail.getText().trim().length() == 0
		    || txtFirstName.getText().trim().length() == 0
		    || txtLastName.getText().trim().length() == 0
		    || txtPhone.getText().trim().length() == 0) {
			JOptionPane.showMessageDialog(this, "Please ensure no field is empty!");
			return;
		}

		user.setEmail(txtEmail.getText().trim());
		user.setFirstName(txtFirstName.getText().trim());
		user.setLastName(txtLastName.getText().trim());
		user.setPhone(txtPhone.getText().trim());

		JOptionPane.showMessageDialog(this, "Profile changes saved!");


        }//GEN-LAST:event_btnSaveActionPerformed


        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton btnBack5;
        private javax.swing.JButton btnSave;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel pageTitle;
        private javax.swing.JTextField txtEmail;
        private javax.swing.JTextField txtFirstName;
        private javax.swing.JTextField txtLastName;
        private javax.swing.JTextField txtPhone;
        private javax.swing.JTextField txtRole;
        // End of variables declaration//GEN-END:variables

	private void populateFields() {
		txtFirstName.setText(user.getFirstName());
		txtLastName.setText(user.getLastName());
		txtEmail.setText(user.getEmail());
		txtPhone.setText(user.getPhone());
		txtRole.setText(user.getRole().toString());
	}
}

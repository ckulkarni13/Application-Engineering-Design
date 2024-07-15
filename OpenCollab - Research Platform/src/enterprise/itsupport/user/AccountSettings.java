/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package enterprise.itsupport.user;

import java.awt.Color;
import javax.swing.JPanel;
import ui.MainJFrame;

/**
 *
 * @author drag
 */
public class AccountSettings extends javax.swing.JPanel {

	MainJFrame ws;
	JPanel csp;

	/**
	 * Creates new form AccountSettings
	 */
	public AccountSettings(MainJFrame ws, JPanel csp) {
		this.ws = ws;
		this.csp = csp;
		initComponents();

		setBackground(Color.WHITE);
	}

	/**
	 * This method is called from within the constructor to initialize the
	 * form. WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                btnComplaints = new javax.swing.JButton();
                pageTitle = new javax.swing.JLabel();
                btnViewProfile = new javax.swing.JButton();

                btnComplaints.setBackground(new java.awt.Color(51, 51, 51));
                btnComplaints.setFont(new java.awt.Font("FreeSans", 1, 15)); // NOI18N
                btnComplaints.setForeground(new java.awt.Color(255, 255, 255));
                btnComplaints.setText("My complaints");
                btnComplaints.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnComplaintsActionPerformed(evt);
                        }
                });

                pageTitle.setFont(new java.awt.Font("FreeSans", 1, 24)); // NOI18N
                pageTitle.setText("View your account settings");

                btnViewProfile.setBackground(new java.awt.Color(51, 51, 51));
                btnViewProfile.setFont(new java.awt.Font("FreeSans", 1, 15)); // NOI18N
                btnViewProfile.setForeground(new java.awt.Color(255, 255, 255));
                btnViewProfile.setText("Edit my profile");
                btnViewProfile.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnViewProfileActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                this.setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(pageTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 970, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnComplaints, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(84, 84, 84)
                                                .addComponent(btnViewProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(pageTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(88, 88, 88)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnComplaints, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnViewProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(476, Short.MAX_VALUE))
                );
        }// </editor-fold>//GEN-END:initComponents

        private void btnComplaintsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComplaintsActionPerformed
		AllComplaints panel = new AllComplaints(ws, csp);

		csp.add("AllComplaints", panel);
		((java.awt.CardLayout) csp.getLayout()).next(csp);
        }//GEN-LAST:event_btnComplaintsActionPerformed

        private void btnViewProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewProfileActionPerformed
		ViewProfile panel = new ViewProfile(ws, csp);

		csp.add("AllComplaints", panel);
		((java.awt.CardLayout) csp.getLayout()).next(csp);
        }//GEN-LAST:event_btnViewProfileActionPerformed


        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton btnComplaints;
        private javax.swing.JButton btnViewProfile;
        private javax.swing.JLabel pageTitle;
        // End of variables declaration//GEN-END:variables
}
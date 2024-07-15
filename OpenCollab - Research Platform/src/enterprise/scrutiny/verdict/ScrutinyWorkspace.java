/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package enterprise.scrutiny.verdict;

import enterprise.itsupport.user.AccountSettings;
import enterprise.scrutiny.grant.GrantJPanel;
import ui.MainJFrame;

/**
 *
 * @author drag
 */
public class ScrutinyWorkspace extends javax.swing.JPanel {

	MainJFrame ws;
	/**
	 * Creates new form ScrutinyLanding
	 */
	public ScrutinyWorkspace(MainJFrame ws) {
		this.ws=ws;
		initComponents();

		this.ws.add(this);
		this.ws.pack();
	}

	/**
	 * This method is called from within the constructor to initialize the
	 * form. WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                scrutinyPane = new javax.swing.JSplitPane();
                jPanel1 = new javax.swing.JPanel();
                btnLogout = new javax.swing.JButton();
                btnSettings = new javax.swing.JButton();
                btnWaitlist = new javax.swing.JButton();
                rightComponent = new javax.swing.JPanel();

                jPanel1.setBackground(new java.awt.Color(0, 51, 51));

                btnLogout.setBackground(new java.awt.Color(255, 255, 255));
                btnLogout.setFont(new java.awt.Font("FreeSans", 1, 15)); // NOI18N
                btnLogout.setForeground(new java.awt.Color(51, 51, 51));
                btnLogout.setText("Logout");
                btnLogout.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnLogoutActionPerformed(evt);
                        }
                });

                btnSettings.setBackground(new java.awt.Color(255, 255, 255));
                btnSettings.setFont(new java.awt.Font("FreeSans", 1, 15)); // NOI18N
                btnSettings.setForeground(new java.awt.Color(51, 51, 51));
                btnSettings.setText("Account settings");
                btnSettings.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnSettingsActionPerformed(evt);
                        }
                });

                btnWaitlist.setBackground(new java.awt.Color(255, 255, 255));
                btnWaitlist.setFont(new java.awt.Font("FreeSans", 1, 15)); // NOI18N
                btnWaitlist.setForeground(new java.awt.Color(51, 51, 51));
                btnWaitlist.setText("Publishing waitlist");
                btnWaitlist.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnWaitlistActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnWaitlist, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnSettings, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
                );
                jPanel1Layout.setVerticalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(166, 166, 166)
                                .addComponent(btnWaitlist)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 413, Short.MAX_VALUE)
                                .addComponent(btnSettings)
                                .addGap(36, 36, 36)
                                .addComponent(btnLogout)
                                .addGap(87, 87, 87))
                );

                scrutinyPane.setLeftComponent(jPanel1);

                rightComponent.setBackground(new java.awt.Color(0, 102, 102));
                rightComponent.setLayout(new java.awt.CardLayout());
                scrutinyPane.setRightComponent(rightComponent);

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                this.setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(scrutinyPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1387, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(scrutinyPane, javax.swing.GroupLayout.PREFERRED_SIZE, 771, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
        }// </editor-fold>//GEN-END:initComponents

        private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
                // TODO add your handling code here:
                this.ws.setLoggedUser(null);
                this.ws.getInitJPanel().setVisible(true);
                this.setVisible(false);
        }//GEN-LAST:event_btnLogoutActionPerformed

        private void btnWaitlistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWaitlistActionPerformed
		rightComponent.removeAll();
		WaitlistJPanel panel = new WaitlistJPanel(ws, rightComponent);
		rightComponent.add("WaitlistJPanel", panel);
		((java.awt.CardLayout) rightComponent.getLayout()).next(rightComponent);
        }//GEN-LAST:event_btnWaitlistActionPerformed

        private void btnSettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSettingsActionPerformed
		rightComponent.removeAll();
		AccountSettings panel = new AccountSettings(ws, rightComponent);
		rightComponent.add("ConferencesJPanel", panel);
		((java.awt.CardLayout) rightComponent.getLayout()).next(rightComponent);
        }//GEN-LAST:event_btnSettingsActionPerformed


        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton btnLogout;
        private javax.swing.JButton btnSettings;
        private javax.swing.JButton btnWaitlist;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JPanel rightComponent;
        private javax.swing.JSplitPane scrutinyPane;
        // End of variables declaration//GEN-END:variables
}
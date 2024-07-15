/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package enterprise.hiring;

import enterprise.itsupport.user.AccountSettings;
import ui.MainJFrame;

/**
 *
 * @author drag
 */
public class HiringWorkspace extends javax.swing.JPanel {

	MainJFrame ws;
	/**
	 * Creates new form ResearchJPanel
	 */
	public HiringWorkspace(MainJFrame ws) {
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

                jSplitPane1 = new javax.swing.JSplitPane();
                jPanel1 = new javax.swing.JPanel();
                btnLogout = new javax.swing.JButton();
                btnSettings = new javax.swing.JButton();
                btnCandidates = new javax.swing.JButton();
                btnShortlisted = new javax.swing.JButton();
                rightComponent = new javax.swing.JPanel();

                jPanel1.setBackground(new java.awt.Color(0, 102, 153));

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

                btnCandidates.setBackground(new java.awt.Color(255, 255, 255));
                btnCandidates.setFont(new java.awt.Font("FreeSans", 1, 15)); // NOI18N
                btnCandidates.setForeground(new java.awt.Color(51, 51, 51));
                btnCandidates.setText("Browse candidates");
                btnCandidates.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnCandidatesActionPerformed(evt);
                        }
                });

                btnShortlisted.setBackground(new java.awt.Color(255, 255, 255));
                btnShortlisted.setFont(new java.awt.Font("FreeSans", 1, 15)); // NOI18N
                btnShortlisted.setForeground(new java.awt.Color(51, 51, 51));
                btnShortlisted.setText("Shortlisted");
                btnShortlisted.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnShortlistedActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnCandidates, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnShortlisted, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnSettings, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
                );
                jPanel1Layout.setVerticalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(125, 125, 125)
                                .addComponent(btnCandidates)
                                .addGap(39, 39, 39)
                                .addComponent(btnShortlisted)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 387, Short.MAX_VALUE)
                                .addComponent(btnSettings)
                                .addGap(41, 41, 41)
                                .addComponent(btnLogout)
                                .addGap(87, 87, 87))
                );

                jSplitPane1.setLeftComponent(jPanel1);

                rightComponent.setBackground(new java.awt.Color(0, 204, 255));
                rightComponent.setLayout(new java.awt.CardLayout());
                jSplitPane1.setRightComponent(rightComponent);

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                this.setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1387, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 771, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
        }// </editor-fold>//GEN-END:initComponents

        private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
		this.ws.setLoggedUser(null);
		this.ws.getInitJPanel().setVisible(true);
		this.setVisible(false);
        }//GEN-LAST:event_btnLogoutActionPerformed

        private void btnSettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSettingsActionPerformed
		rightComponent.removeAll();
		AccountSettings panel = new AccountSettings(ws, rightComponent);
		rightComponent.add("AccountSettings", panel);
		((java.awt.CardLayout) rightComponent.getLayout()).next(rightComponent);
        }//GEN-LAST:event_btnSettingsActionPerformed

        private void btnCandidatesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCandidatesActionPerformed
		rightComponent.removeAll();
		BrowseCandidates panel = new BrowseCandidates(ws, rightComponent);
		rightComponent.add("BrowseCandidates", panel);
		((java.awt.CardLayout) rightComponent.getLayout()).next(rightComponent);
        }//GEN-LAST:event_btnCandidatesActionPerformed

        private void btnShortlistedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShortlistedActionPerformed
		rightComponent.removeAll();
		Shortlisted panel = new Shortlisted(ws, rightComponent);
		rightComponent.add("ShortlistedJPanel", panel);
		((java.awt.CardLayout) rightComponent.getLayout()).next(rightComponent);
        }//GEN-LAST:event_btnShortlistedActionPerformed


        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton btnCandidates;
        private javax.swing.JButton btnLogout;
        private javax.swing.JButton btnSettings;
        private javax.swing.JButton btnShortlisted;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JSplitPane jSplitPane1;
        private javax.swing.JPanel rightComponent;
        // End of variables declaration//GEN-END:variables
}

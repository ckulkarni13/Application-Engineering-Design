/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package enterprise.research.collaboration;

import enterprise.research.collaboration.MyResearch;
import enterprise.itsupport.user.AccountSettings;
import ui.MainJFrame;
import enterprise.research.database.BrowsePapers;
import enterprise.research.database.CreateGroup;

/**
 *
 * @author drag
 */
public class ResearchWorkspace extends javax.swing.JPanel {

	MainJFrame ws;

	/**
	 * Creates new form ResearchJPanel
	 */
	public ResearchWorkspace(MainJFrame ws) {
		this.ws = ws;
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

                researchPane = new javax.swing.JSplitPane();
                jPanel1 = new javax.swing.JPanel();
                btnLogout = new javax.swing.JButton();
                btnSettings = new javax.swing.JButton();
                btnBrowse = new javax.swing.JButton();
                btnMyResearch = new javax.swing.JButton();
                btnFormGroup = new javax.swing.JButton();
                btnConferences = new javax.swing.JButton();
                btnEmails = new javax.swing.JButton();
                btnGrant = new javax.swing.JButton();
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

                btnBrowse.setBackground(new java.awt.Color(255, 255, 255));
                btnBrowse.setFont(new java.awt.Font("FreeSans", 1, 15)); // NOI18N
                btnBrowse.setForeground(new java.awt.Color(51, 51, 51));
                btnBrowse.setText("Browse papers");
                btnBrowse.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnBrowseActionPerformed(evt);
                        }
                });

                btnMyResearch.setBackground(new java.awt.Color(255, 255, 255));
                btnMyResearch.setFont(new java.awt.Font("FreeSans", 1, 15)); // NOI18N
                btnMyResearch.setForeground(new java.awt.Color(51, 51, 51));
                btnMyResearch.setText("My research");
                btnMyResearch.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnMyResearchActionPerformed(evt);
                        }
                });

                btnFormGroup.setBackground(new java.awt.Color(255, 255, 255));
                btnFormGroup.setFont(new java.awt.Font("FreeSans", 1, 15)); // NOI18N
                btnFormGroup.setForeground(new java.awt.Color(51, 51, 51));
                btnFormGroup.setText("Create group");
                btnFormGroup.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnFormGroupActionPerformed(evt);
                        }
                });

                btnConferences.setBackground(new java.awt.Color(255, 255, 255));
                btnConferences.setFont(new java.awt.Font("FreeSans", 1, 15)); // NOI18N
                btnConferences.setForeground(new java.awt.Color(51, 51, 51));
                btnConferences.setText("Conferences");
                btnConferences.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnConferencesActionPerformed(evt);
                        }
                });

                btnEmails.setBackground(new java.awt.Color(255, 255, 255));
                btnEmails.setFont(new java.awt.Font("FreeSans", 1, 15)); // NOI18N
                btnEmails.setForeground(new java.awt.Color(51, 51, 51));
                btnEmails.setText("My emails");
                btnEmails.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnEmailsActionPerformed(evt);
                        }
                });

                btnGrant.setBackground(new java.awt.Color(255, 255, 255));
                btnGrant.setFont(new java.awt.Font("FreeSans", 1, 15)); // NOI18N
                btnGrant.setForeground(new java.awt.Color(51, 51, 51));
                btnGrant.setText("Apply grant");
                btnGrant.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnGrantActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnBrowse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnMyResearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnFormGroup, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnConferences, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(btnSettings))
                                        .addComponent(btnEmails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnGrant, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
                );
                jPanel1Layout.setVerticalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(125, 125, 125)
                                .addComponent(btnBrowse)
                                .addGap(39, 39, 39)
                                .addComponent(btnMyResearch)
                                .addGap(42, 42, 42)
                                .addComponent(btnFormGroup)
                                .addGap(35, 35, 35)
                                .addComponent(btnConferences)
                                .addGap(39, 39, 39)
                                .addComponent(btnGrant)
                                .addGap(38, 38, 38)
                                .addComponent(btnEmails)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
                                .addComponent(btnSettings)
                                .addGap(33, 33, 33)
                                .addComponent(btnLogout)
                                .addGap(87, 87, 87))
                );

                researchPane.setLeftComponent(jPanel1);

                rightComponent.setBackground(new java.awt.Color(0, 102, 102));
                rightComponent.setLayout(new java.awt.CardLayout());
                researchPane.setRightComponent(rightComponent);

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                this.setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(researchPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1387, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(researchPane, javax.swing.GroupLayout.PREFERRED_SIZE, 771, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
        }// </editor-fold>//GEN-END:initComponents

        private void btnMyResearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMyResearchActionPerformed
		// TODO add your handling code here:
//		EditingJPanel editing = new EditingJPanel(ws);
		rightComponent.removeAll();

		MyResearch myresearch = new MyResearch(ws, rightComponent);
		rightComponent.add("MyResearch", myresearch);
		((java.awt.CardLayout) rightComponent.getLayout()).next(rightComponent);

        }//GEN-LAST:event_btnMyResearchActionPerformed

        private void btnFormGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFormGroupActionPerformed
		rightComponent.removeAll();

		CreateGroup panel = new CreateGroup(ws,rightComponent);
		rightComponent.add("CreateGroup", panel);
		((java.awt.CardLayout) rightComponent.getLayout()).next(rightComponent);
        }//GEN-LAST:event_btnFormGroupActionPerformed

        private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
		// TODO add your handling code here:
		this.ws.setLoggedUser(null);
		this.ws.getInitJPanel().setVisible(true);
		this.setVisible(false);
        }//GEN-LAST:event_btnLogoutActionPerformed

        private void btnBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowseActionPerformed
		rightComponent.removeAll();
		BrowsePapers panel = new BrowsePapers(ws,rightComponent);
		rightComponent.add("BrowsePapers", panel);
		((java.awt.CardLayout) rightComponent.getLayout()).next(rightComponent);
        }//GEN-LAST:event_btnBrowseActionPerformed

        private void btnConferencesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConferencesActionPerformed
		rightComponent.removeAll();
		ConferencesJPanel panel = new ConferencesJPanel(ws, rightComponent);
		rightComponent.add("ConferencesJPanel", panel);
		((java.awt.CardLayout) rightComponent.getLayout()).next(rightComponent);
        }//GEN-LAST:event_btnConferencesActionPerformed

        private void btnSettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSettingsActionPerformed
		rightComponent.removeAll();
		AccountSettings panel = new AccountSettings(ws, rightComponent);
		rightComponent.add("ConferencesJPanel", panel);
		((java.awt.CardLayout) rightComponent.getLayout()).next(rightComponent);
        }//GEN-LAST:event_btnSettingsActionPerformed

        private void btnEmailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmailsActionPerformed
		rightComponent.removeAll();
		MyEmails panel = new MyEmails(ws, ws.getResearcherDir().fetchByUser(ws.getLoggedUser()) , rightComponent);
		rightComponent.add("ConferencesJPanel", panel);
		((java.awt.CardLayout) rightComponent.getLayout()).next(rightComponent);
        }//GEN-LAST:event_btnEmailsActionPerformed

        private void btnGrantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrantActionPerformed
		rightComponent.removeAll();
		ApplyGrant panel = new ApplyGrant(ws, rightComponent);
		rightComponent.add("ConferencesJPanel", panel);
		((java.awt.CardLayout) rightComponent.getLayout()).next(rightComponent);
        }//GEN-LAST:event_btnGrantActionPerformed

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton btnBrowse;
        private javax.swing.JButton btnConferences;
        private javax.swing.JButton btnEmails;
        private javax.swing.JButton btnFormGroup;
        private javax.swing.JButton btnGrant;
        private javax.swing.JButton btnLogout;
        private javax.swing.JButton btnMyResearch;
        private javax.swing.JButton btnSettings;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JSplitPane researchPane;
        private javax.swing.JPanel rightComponent;
        // End of variables declaration//GEN-END:variables
}

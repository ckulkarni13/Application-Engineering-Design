/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.professor;

import model.User;
import ui.MainJFrame;

/**
 *
 * @author Admin
 */
public class ProfessorWorkarea extends javax.swing.JPanel {

	private User user = null;
	private MainJFrame workSpace = null;
	private TermScheduleJPanel termSchedulePanel = null;
	private EnrolledStudentsJPanel enrolledPanel = null;
	private EditProfileJPanel editProfilePanel = null;
	/**
	 * Creates new form ProfessorManageJPanel
	 */
	public ProfessorWorkarea(MainJFrame workSpace, User user) {
		initComponents();

		this.workSpace = workSpace;
		this.user = user;

		this.workSpace.add(this);
		this.workSpace.pack();
	}

	/**
	 * This method is called from within the constructor to initialize the
	 * form. WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                splitPane = new javax.swing.JSplitPane();
                leftPane = new javax.swing.JPanel();
                btnTermSchedule = new javax.swing.JButton();
                btnEnrolledStudents = new javax.swing.JButton();
                btnLogout = new javax.swing.JButton();
                btnViewProfile = new javax.swing.JButton();
                rightPanel = new javax.swing.JPanel();

                leftPane.setBackground(new java.awt.Color(102, 204, 255));

                btnTermSchedule.setText("My term schedule");
                btnTermSchedule.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnTermScheduleActionPerformed(evt);
                        }
                });

                btnEnrolledStudents.setText("Enrolled students");
                btnEnrolledStudents.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnEnrolledStudentsActionPerformed(evt);
                        }
                });

                btnLogout.setText("<< Logout");
                btnLogout.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnLogoutActionPerformed(evt);
                        }
                });

                btnViewProfile.setText("View profile");
                btnViewProfile.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnViewProfileActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout leftPaneLayout = new javax.swing.GroupLayout(leftPane);
                leftPane.setLayout(leftPaneLayout);
                leftPaneLayout.setHorizontalGroup(
                        leftPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(leftPaneLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(leftPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnTermSchedule, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnEnrolledStudents, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnViewProfile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );

                leftPaneLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnEnrolledStudents, btnLogout, btnTermSchedule});

                leftPaneLayout.setVerticalGroup(
                        leftPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(leftPaneLayout.createSequentialGroup()
                                .addGap(121, 121, 121)
                                .addComponent(btnTermSchedule)
                                .addGap(39, 39, 39)
                                .addComponent(btnViewProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(btnEnrolledStudents, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 383, Short.MAX_VALUE)
                                .addComponent(btnLogout)
                                .addGap(71, 71, 71))
                );

                leftPaneLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnEnrolledStudents, btnLogout, btnTermSchedule, btnViewProfile});

                splitPane.setLeftComponent(leftPane);

                rightPanel.setBackground(new java.awt.Color(255, 204, 204));

                javax.swing.GroupLayout rightPanelLayout = new javax.swing.GroupLayout(rightPanel);
                rightPanel.setLayout(rightPanelLayout);
                rightPanelLayout.setHorizontalGroup(
                        rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 1240, Short.MAX_VALUE)
                );
                rightPanelLayout.setVerticalGroup(
                        rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 792, Short.MAX_VALUE)
                );

                splitPane.setRightComponent(rightPanel);

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                this.setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(splitPane)
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(splitPane)
                );
        }// </editor-fold>//GEN-END:initComponents

        private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
		this.workSpace.getInitJPanel().setVisible(true);
		this.setVisible(false);
        }//GEN-LAST:event_btnLogoutActionPerformed

        private void btnTermScheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTermScheduleActionPerformed
		this.termSchedulePanel = new TermScheduleJPanel(this.workSpace);
		this.splitPane.setRightComponent(this.termSchedulePanel);
        }//GEN-LAST:event_btnTermScheduleActionPerformed

        private void btnEnrolledStudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnrolledStudentsActionPerformed
		this.enrolledPanel = new EnrolledStudentsJPanel(this.workSpace);
		this.splitPane.setRightComponent(this.enrolledPanel);
        }//GEN-LAST:event_btnEnrolledStudentsActionPerformed

        private void btnViewProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewProfileActionPerformed
		this.editProfilePanel = new EditProfileJPanel(this.workSpace);
		this.splitPane.setRightComponent(this.editProfilePanel);
        }//GEN-LAST:event_btnViewProfileActionPerformed


        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton btnEnrolledStudents;
        private javax.swing.JButton btnLogout;
        private javax.swing.JButton btnTermSchedule;
        private javax.swing.JButton btnViewProfile;
        private javax.swing.JPanel leftPane;
        private javax.swing.JPanel rightPanel;
        private javax.swing.JSplitPane splitPane;
        // End of variables declaration//GEN-END:variables
}

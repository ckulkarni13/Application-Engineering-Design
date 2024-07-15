package ui.admin;

import ui.MainJFrame;
import ui.professor.ProfessorWorkarea;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
/**
 *
 * @author Admin
 */
public class AdminWorkarea extends javax.swing.JPanel {

	private MainJFrame workSpace;
	private ViewProfessorsJPanel professorPanel;
	private ViewStudentsJPanel studentPanel;
	private AdminProfileJPanel adminPanel;

	/**
	 * Creates new form head_prof_my_profile
	 */
	public AdminWorkarea(MainJFrame workSpace) {
		this.workSpace = workSpace;

		initComponents();

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
                leftPanel = new javax.swing.JPanel();
                btnManageStudents = new javax.swing.JButton();
                btnManageProfessors = new javax.swing.JButton();
                btnLogout = new javax.swing.JButton();
                rightPanel = new javax.swing.JPanel();

                btnManageStudents.setText("View all students");
                btnManageStudents.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnManageStudentsActionPerformed(evt);
                        }
                });

                btnManageProfessors.setText("View all professors");
                btnManageProfessors.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnManageProfessorsActionPerformed(evt);
                        }
                });

                btnLogout.setText("<< Logout");
                btnLogout.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnLogoutActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
                leftPanel.setLayout(leftPanelLayout);
                leftPanelLayout.setHorizontalGroup(
                        leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, leftPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnManageStudents, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnManageProfessors, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
                );
                leftPanelLayout.setVerticalGroup(
                        leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(leftPanelLayout.createSequentialGroup()
                                .addGap(144, 144, 144)
                                .addComponent(btnManageStudents, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(btnManageProfessors, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 447, Short.MAX_VALUE)
                                .addComponent(btnLogout)
                                .addGap(38, 38, 38))
                );

                leftPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnLogout, btnManageProfessors, btnManageStudents});

                splitPane.setLeftComponent(leftPanel);

                javax.swing.GroupLayout rightPanelLayout = new javax.swing.GroupLayout(rightPanel);
                rightPanel.setLayout(rightPanelLayout);
                rightPanelLayout.setHorizontalGroup(
                        rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 1178, Short.MAX_VALUE)
                );
                rightPanelLayout.setVerticalGroup(
                        rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 768, Short.MAX_VALUE)
                );

                splitPane.setRightComponent(rightPanel);

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                this.setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(splitPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1384, Short.MAX_VALUE)
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(splitPane)
                );
        }// </editor-fold>//GEN-END:initComponents

        private void btnManageStudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageStudentsActionPerformed
		this.studentPanel= new ViewStudentsJPanel(this.workSpace);
		splitPane.setRightComponent(this.studentPanel);
        }//GEN-LAST:event_btnManageStudentsActionPerformed

        private void btnManageProfessorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageProfessorsActionPerformed
		this.professorPanel = new ViewProfessorsJPanel(this.workSpace);
		splitPane.setRightComponent(this.professorPanel);
        }//GEN-LAST:event_btnManageProfessorsActionPerformed

        private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
		this.workSpace.getInitJPanel().setVisible(true);
		this.setVisible(false);
        }//GEN-LAST:event_btnLogoutActionPerformed


        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton btnLogout;
        private javax.swing.JButton btnManageProfessors;
        private javax.swing.JButton btnManageStudents;
        private javax.swing.JPanel leftPanel;
        private javax.swing.JPanel rightPanel;
        private javax.swing.JSplitPane splitPane;
        // End of variables declaration//GEN-END:variables
}
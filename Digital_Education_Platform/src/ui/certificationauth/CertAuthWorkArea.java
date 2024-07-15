/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.certificationauth;

import directory.StudentDirectory;
import java.awt.event.ActionEvent;
import java.util.List;
import java.util.Vector;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.student.Student;
import ui.ButtonCellRenderer;
import ui.MainJFrame;

/**
 *
 * @author drag
 */
public class CertAuthWorkArea extends javax.swing.JPanel {

	private MainJFrame workSpace;
	private StudentDirectory studentDir;

	/**
	 * Creates new form CertAuthWorkAreaJPanel
	 */
	public CertAuthWorkArea(MainJFrame workSpace) {
		this.workSpace = workSpace;
		this.studentDir = workSpace.getStudentDir();

		initComponents();

		this.workSpace.add(this);
		this.workSpace.pack();

		this.pageTitle.setText("Welcome, Certification Authority");
		table.setRowHeight(30);

		Action actionGraduate = new AbstractAction() {
			public void actionPerformed(ActionEvent e) {
				try {
					int selectedRowIndex = table.getSelectedRow();
					String studentId = (String) table.getValueAt(selectedRowIndex, 4);
					Student student = studentDir.getStudentById(studentId);

					student.setGraduated(true);

					populateTable(chkShowAll.isSelected());

				} catch (Exception exception) {
					exception.printStackTrace();
					JOptionPane.showMessageDialog(null, "There was an issue. Please try again.");
				}

			}
		};

		Action actionViewTranscript = new AbstractAction() {
			public void actionPerformed(ActionEvent e) {
				try {
					int selectedRowIndex = table.getSelectedRow();
					String studentId = (String) table.getValueAt(selectedRowIndex, 4);
					Student student = studentDir.getStudentById(studentId);
						
					System.out.println(student.getUserProfile().getPerson().getFullName());
					
					JFrame transcriptFrame = new JFrame("Transcript");
					TranscriptDisplay tPanel = new TranscriptDisplay(student, student.getTranscript());	
					transcriptFrame.add(tPanel);

					transcriptFrame.setSize(800, 600); // Set the size to your desired dimensions
					transcriptFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					transcriptFrame.setVisible(true);

				} catch (Exception exception) {
					exception.printStackTrace();
					JOptionPane.showMessageDialog(null, "There was an issue. Please try again.");
				}

			}
		};

		ButtonCellRenderer completeButton = new ButtonCellRenderer(table, actionGraduate, 3);
		ButtonCellRenderer viewTranscriptButton = new ButtonCellRenderer(table, actionViewTranscript, 5);

		this.populateTable(chkShowAll.isSelected());
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
                jScrollPane1 = new javax.swing.JScrollPane();
                table = new javax.swing.JTable();
                btnLogout = new javax.swing.JButton();
                chkShowAll = new javax.swing.JCheckBox();

                pageTitle.setFont(new java.awt.Font("Inter", 1, 24)); // NOI18N
                pageTitle.setText("Welcome,");

                table.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {
                                {null, null, null, null, null, null},
                                {null, null, null, null, null, null},
                                {null, null, null, null, null, null},
                                {null, null, null, null, null, null}
                        },
                        new String [] {
                                "Student name", "GPA", "Completed credits", "Graduate", "Student ID", "View transcript"
                        }
                ) {
                        boolean[] canEdit = new boolean [] {
                                false, false, false, true, false, true
                        };

                        public boolean isCellEditable(int rowIndex, int columnIndex) {
                                return canEdit [columnIndex];
                        }
                });
                table.setColumnSelectionAllowed(true);
                jScrollPane1.setViewportView(table);
                table.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

                btnLogout.setText("<< Logout");
                btnLogout.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnLogoutActionPerformed(evt);
                        }
                });

                chkShowAll.setText("Show all");
                chkShowAll.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                chkShowAllActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                this.setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(pageTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1076, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(chkShowAll)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(6, 6, 6)
                                                                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(pageTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)
                                .addComponent(chkShowAll)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                                .addContainerGap())
                );
        }// </editor-fold>//GEN-END:initComponents

        private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
		this.workSpace.getInitJPanel().setVisible(true);
		this.setVisible(false);
        }//GEN-LAST:event_btnLogoutActionPerformed

        private void chkShowAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkShowAllActionPerformed
		this.populateTable(chkShowAll.isSelected());
        }//GEN-LAST:event_chkShowAllActionPerformed


        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton btnLogout;
        private javax.swing.JCheckBox chkShowAll;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JLabel pageTitle;
        private javax.swing.JTable table;
        // End of variables declaration//GEN-END:variables

	private void populateTable(boolean showall) {

		List<Student> students = null;
		if (showall) {
			students = this.studentDir.getDirectory();
		} else {
			students = this.studentDir.getRequestedForGraduation();
		}
		int CREDITS_PER_COURSE = 4;

		DefaultTableModel tbl = (DefaultTableModel) table.getModel();

		int n = tbl.getRowCount();
		while (n-- > 0) {
			tbl.removeRow(n);
		}

		for (Student s : students) {

			Vector<String> row = new Vector<>();
			row.add(s.getUserProfile().getPerson().getFullName());
			row.add(String.valueOf(s.getTranscript().getGpa()));
			int semesterNum = s.getTranscript().getCurrentSemester().getSerialNum();
			int creditsCompleted = semesterNum == 1 ? 0 : semesterNum * CREDITS_PER_COURSE;
			row.add(String.valueOf(creditsCompleted));
			if (s.isGraduated()) {
				row.add("Graduated");

			} else {

				row.add("Graduate");
			}
			row.add(s.getUuid());
			row.add("View transcript");

			tbl.addRow(row);
		}

	}
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.professor;

import constants.Course;
import directory.UniClassDirectory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;
import model.ClassTiming;
import model.UniClass;
import model.professor.Professor;
import ui.MainJFrame;

/**
 *
 * @author drag
 */
public class TermScheduleJPanel extends javax.swing.JPanel {

	private MainJFrame workSpace = null;
	private UniClassDirectory uniClassDir = null;
	private List<String> courseList = null;
	private Course oldCourseOne = null;
	private Course oldCourseTwo = null;
	private UniClass currentClassOne = null;
	private UniClass currentClassTwo = null;
	private NotificationEditorJPanel editor = null;

	/**
	 * Creates new form TermScheduleJPanel
	 */
	public TermScheduleJPanel(MainJFrame workSpace) {
		this.workSpace = workSpace;
		this.uniClassDir = this.workSpace.getUniClassDir();

		initComponents();

		this.editor = new NotificationEditorJPanel(this.workSpace, this);
		this.editor.setVisible(false);
		this.pageTitle.setText("Hi " + this.workSpace.getUser().getPerson().getFirstName() + ", manage your term schedule here!");

		this.populateCourses();

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
                jPanel1 = new javax.swing.JPanel();
                comboCourseOne = new javax.swing.JComboBox<>();
                jLabel2 = new javax.swing.JLabel();
                btnPublishCourseOne = new javax.swing.JButton();
                txtStartCourseOne = new javax.swing.JTextField();
                txtEndCourseOne = new javax.swing.JTextField();
                jLabel5 = new javax.swing.JLabel();
                jLabel6 = new javax.swing.JLabel();
                btnNotificationCourseOne = new javax.swing.JButton();
                jLabel1 = new javax.swing.JLabel();
                jPanel2 = new javax.swing.JPanel();
                comboCourseTwo = new javax.swing.JComboBox<>();
                jLabel3 = new javax.swing.JLabel();
                btnPublishCourseTwo = new javax.swing.JButton();
                txtEndCourseTwo = new javax.swing.JTextField();
                txtStartCourseTwo = new javax.swing.JTextField();
                jLabel8 = new javax.swing.JLabel();
                jLabel7 = new javax.swing.JLabel();
                btnNotificationCourseTwo = new javax.swing.JButton();
                jLabel4 = new javax.swing.JLabel();

                pageTitle.setFont(new java.awt.Font("Inter", 1, 24)); // NOI18N
                pageTitle.setText("Hi , manage your term schedule here!");

                jPanel1.setBackground(new java.awt.Color(102, 102, 102));

                courseList = new ArrayList<>();
                courseList.add("Select a course");
                for (Course c : Course.values()) {
                        String course = c.getSpeciality() + " : " + c.getName();
                        courseList.add(course);
                }
                comboCourseOne.setModel(new javax.swing.DefaultComboBoxModel<>(courseList.toArray(new String[0])));
                comboCourseOne.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                comboCourseOneActionPerformed(evt);
                        }
                });

                jLabel2.setFont(new java.awt.Font("Inter", 1, 15)); // NOI18N
                jLabel2.setForeground(new java.awt.Color(255, 255, 255));
                jLabel2.setText("Select a course you want to teach");

                btnPublishCourseOne.setBackground(new java.awt.Color(0, 153, 51));
                btnPublishCourseOne.setFont(new java.awt.Font("Inter", 1, 15)); // NOI18N
                btnPublishCourseOne.setText("Publish");
                btnPublishCourseOne.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnPublishCourseOneActionPerformed(evt);
                        }
                });

                jLabel5.setForeground(new java.awt.Color(255, 255, 255));
                jLabel5.setText("Lecture starts at");

                jLabel6.setForeground(new java.awt.Color(255, 255, 255));
                jLabel6.setText("Lecture ends at");

                btnNotificationCourseOne.setBackground(new java.awt.Color(255, 204, 153));
                btnNotificationCourseOne.setText("Send a notification");
                btnNotificationCourseOne.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnNotificationCourseOneActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtStartCourseOne, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtEndCourseOne, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnPublishCourseOne, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(comboCourseOne, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnNotificationCourseOne, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())
                );
                jPanel1Layout.setVerticalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnNotificationCourseOne)
                                        .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboCourseOne, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnPublishCourseOne, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(txtStartCourseOne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtEndCourseOne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel5)
                                                .addComponent(jLabel6)))
                                .addGap(14, 14, 14))
                );

                jLabel1.setFont(new java.awt.Font("Inter", 1, 15)); // NOI18N
                jLabel1.setText("Course 1:");

                jPanel2.setBackground(new java.awt.Color(102, 102, 102));

                List<String> courseList = new ArrayList<>();
                courseList.add("Select a course");
                for (Course c : Course.values()) {
                        String course = c.getSpeciality() + " : " + c.getName();
                        courseList.add(course);
                }
                comboCourseTwo.setModel(new javax.swing.DefaultComboBoxModel<>(courseList.toArray(new String[0])));
                comboCourseTwo.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                comboCourseTwoActionPerformed(evt);
                        }
                });

                jLabel3.setFont(new java.awt.Font("Inter", 1, 15)); // NOI18N
                jLabel3.setForeground(new java.awt.Color(255, 255, 255));
                jLabel3.setText("Select a course you want to teach");

                btnPublishCourseTwo.setBackground(new java.awt.Color(0, 153, 51));
                btnPublishCourseTwo.setFont(new java.awt.Font("Inter", 1, 15)); // NOI18N
                btnPublishCourseTwo.setText("Publish");
                btnPublishCourseTwo.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnPublishCourseTwoActionPerformed(evt);
                        }
                });

                jLabel8.setForeground(new java.awt.Color(255, 255, 255));
                jLabel8.setText("Lecture ends at");

                jLabel7.setForeground(new java.awt.Color(255, 255, 255));
                jLabel7.setText("Lecture starts at");

                btnNotificationCourseTwo.setBackground(new java.awt.Color(255, 204, 153));
                btnNotificationCourseTwo.setText("Send a notification");
                btnNotificationCourseTwo.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnNotificationCourseTwoActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
                jPanel2.setLayout(jPanel2Layout);
                jPanel2Layout.setHorizontalGroup(
                        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtStartCourseTwo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtEndCourseTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 319, Short.MAX_VALUE)
                                                .addComponent(btnPublishCourseTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(comboCourseTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnNotificationCourseTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())
                );

                jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtEndCourseTwo, txtStartCourseTwo});

                jPanel2Layout.setVerticalGroup(
                        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnNotificationCourseTwo)
                                        .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboCourseTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnPublishCourseTwo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(txtStartCourseTwo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtEndCourseTwo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel7)
                                                .addComponent(jLabel8)))
                                .addGap(14, 14, 14))
                );

                jLabel4.setFont(new java.awt.Font("Inter", 1, 15)); // NOI18N
                jLabel4.setText("Course 2:");

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                this.setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(27, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 984, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(pageTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 978, Short.MAX_VALUE)
                                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 930, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(6, 6, 6)))
                                .addGap(9, 9, 9))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(pageTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40))
                );
        }// </editor-fold>//GEN-END:initComponents

        private void comboCourseOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCourseOneActionPerformed

        }//GEN-LAST:event_comboCourseOneActionPerformed

        private void comboCourseTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCourseTwoActionPerformed
        }//GEN-LAST:event_comboCourseTwoActionPerformed

        private void btnPublishCourseOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPublishCourseOneActionPerformed
		if (comboCourseOne.getSelectedItem().toString().equals("Select a course")) {
			JOptionPane.showMessageDialog(this, "Please select a course before publishing.");
			return;
		}

		Professor p = this.workSpace.getProfDir().getProfessor(this.workSpace.getUser());

		Course selectedCourse = null;
		for (Course c : Course.values()) {
			if (comboCourseOne.getSelectedItem().toString().split(":")[1].trim().equals(c.getName())) {
				selectedCourse = c;
			}
		}

		// remove the previous old course from professor's taught courses
		List<UniClass> _profClasses = this.uniClassDir.getProfClasses(p);
		for (var _class : _profClasses) {
			if (oldCourseOne.getName().equals(_class.getCourse().getName())) {
				UniClass _uc = this.uniClassDir.getUniClassByProf(p, _class.getCourse());
				this.uniClassDir.removeClass(_uc);
			}
		}

		UniClass uc = this.uniClassDir.addClass(new UniClass(selectedCourse, new ClassTiming(txtStartCourseOne.getText().trim() + "-" + txtEndCourseOne.getText().trim()), p, "first"));
//		currentClassOne = uc;

		populateCourses();

		JOptionPane.showMessageDialog(this, "Class " + uc.getFullCourseName() + " has been published!");


        }//GEN-LAST:event_btnPublishCourseOneActionPerformed

        private void btnPublishCourseTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPublishCourseTwoActionPerformed
		if (comboCourseOne.getSelectedItem().toString().equals("Select a course")) {
			JOptionPane.showMessageDialog(this, "Please select a course before publishing.");
			return;
		}

		Professor p = this.workSpace.getProfDir().getProfessor(this.workSpace.getUser());

		Course selectedCourse = null;
		for (Course c : Course.values()) {
			if (comboCourseTwo.getSelectedItem().toString().split(":")[1].trim().equals(c.getName())) {
				selectedCourse = c;
			}
		}

		// remove the previous old course from professor's taught courses
		List<UniClass> _profClasses = this.uniClassDir.getProfClasses(p);
		for (var _class : _profClasses) {
			if (oldCourseTwo.getName().equals(_class.getCourse().getName())) {
				UniClass _uc = this.uniClassDir.getUniClassByProf(p, _class.getCourse());
				this.uniClassDir.removeClass(_uc);
			}
		}

		UniClass uc = this.uniClassDir.addClass(new UniClass(selectedCourse, new ClassTiming(txtStartCourseTwo.getText().trim() + "-" + txtEndCourseTwo.getText().trim()), p, "second"));
//		currentClassTwo = uc;

		populateCourses();

		JOptionPane.showMessageDialog(this, "Class " + uc.getFullCourseName() + " has been published!");

        }//GEN-LAST:event_btnPublishCourseTwoActionPerformed

        private void btnNotificationCourseOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNotificationCourseOneActionPerformed
		if (!editor.isVisible()) {
			editor.setUniClass(currentClassOne);
			editor.setVisible(true);
		}
        }//GEN-LAST:event_btnNotificationCourseOneActionPerformed

        private void btnNotificationCourseTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNotificationCourseTwoActionPerformed
		if (!editor.isVisible()) {
			editor.setUniClass(currentClassTwo);
			editor.setVisible(true);
		}
        }//GEN-LAST:event_btnNotificationCourseTwoActionPerformed


        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton btnNotificationCourseOne;
        private javax.swing.JButton btnNotificationCourseTwo;
        private javax.swing.JButton btnPublishCourseOne;
        private javax.swing.JButton btnPublishCourseTwo;
        private javax.swing.JComboBox<String> comboCourseOne;
        private javax.swing.JComboBox<String> comboCourseTwo;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JLabel jLabel7;
        private javax.swing.JLabel jLabel8;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JPanel jPanel2;
        private javax.swing.JLabel pageTitle;
        private javax.swing.JTextField txtEndCourseOne;
        private javax.swing.JTextField txtEndCourseTwo;
        private javax.swing.JTextField txtStartCourseOne;
        private javax.swing.JTextField txtStartCourseTwo;
        // End of variables declaration//GEN-END:variables

	private void populateCourses() {
		Professor p = this.workSpace.getProfDir().getProfessor(this.workSpace.getUser());

		var classesList = this.uniClassDir.getProfClasses(p);
		Collections.reverse(classesList);
		UniClass[] classes = classesList.toArray(new UniClass[0]);
		UniClass first = null;
		UniClass second = null;

		if (classesList.size() == 0) {
			return;
		}

		for (UniClass _uc : classesList) {
			if (_uc.getSerial().equalsIgnoreCase("first")) {
				first = _uc;
				currentClassOne = _uc;
			} else {
				second = _uc;
				currentClassTwo = _uc;
			}
		}

		if (first == null || second == null) {
			return;
		}

		this.oldCourseOne = first.getCourse();
		comboCourseOne.setSelectedItem(first.getFullCourseName());
		txtStartCourseOne.setText(first.getTiming().getStart());
		txtEndCourseOne.setText(first.getTiming().getEnd());

		this.oldCourseTwo = second.getCourse();
		comboCourseTwo.setSelectedItem(second.getFullCourseName());
		txtStartCourseTwo.setText(second.getTiming().getStart());
		txtEndCourseTwo.setText(second.getTiming().getEnd());
	}
}

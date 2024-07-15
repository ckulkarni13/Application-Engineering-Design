/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.transcript;

import constants.Grade;
import helper.Helper;
import java.util.Map;
import model.UniClass;
import model.student.Student;
import model.transcript.Transcript;
import ui.MainJFrame;

/**
 *
 * @author drag
 */
public class TranscriptJPanel extends javax.swing.JPanel {

	private MainJFrame workSpace;
	private Student s;
	private Transcript t;
	/**
	 * Creates new form TranscriptJPanel
	 */
	public TranscriptJPanel(MainJFrame workSpace, Transcript t) {
		this.workSpace = workSpace;
		this.s = this.workSpace.getStudentDir().getStudent(this.workSpace.getUser());
		this.t = t;
		
		initComponents();

		this.pageTitle.setText("Your transcript - job well done " +this.workSpace.getUser().getPerson().getFullName() + "!");
		this.studentName.setText(this.workSpace.getUser().getPerson().getFullName());
		this.result.setText("Graduated");
		this.gpa.setText(String.valueOf(this.s.getTranscript().getGpa()));

		this.populateTranscript();
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
                semester1 = new javax.swing.JPanel();
                titleSem1 = new javax.swing.JLabel();
                subjectName1 = new javax.swing.JLabel();
                subjectName2 = new javax.swing.JLabel();
                lblGrade1 = new javax.swing.JLabel();
                lblGrade2 = new javax.swing.JLabel();
                grade1 = new javax.swing.JLabel();
                grade2 = new javax.swing.JLabel();
                semester2 = new javax.swing.JPanel();
                titleSem2 = new javax.swing.JLabel();
                lblGrade3 = new javax.swing.JLabel();
                subjectName3 = new javax.swing.JLabel();
                subjectName4 = new javax.swing.JLabel();
                lblGrade4 = new javax.swing.JLabel();
                grade3 = new javax.swing.JLabel();
                grade4 = new javax.swing.JLabel();
                semester3 = new javax.swing.JPanel();
                titleSem3 = new javax.swing.JLabel();
                subjectName5 = new javax.swing.JLabel();
                lblGrade6 = new javax.swing.JLabel();
                grade5 = new javax.swing.JLabel();
                lblGrade5 = new javax.swing.JLabel();
                subjectName6 = new javax.swing.JLabel();
                grade6 = new javax.swing.JLabel();
                semester4 = new javax.swing.JPanel();
                titleSem4 = new javax.swing.JLabel();
                grade8 = new javax.swing.JLabel();
                subjectName7 = new javax.swing.JLabel();
                grade7 = new javax.swing.JLabel();
                lblGrade7 = new javax.swing.JLabel();
                subjectName8 = new javax.swing.JLabel();
                lblGrade8 = new javax.swing.JLabel();
                lblStudentName = new javax.swing.JLabel();
                studentName = new javax.swing.JLabel();
                lblResult = new javax.swing.JLabel();
                result = new javax.swing.JLabel();
                lblGpa = new javax.swing.JLabel();
                gpa = new javax.swing.JLabel();
                btnPDF = new javax.swing.JButton();

                pageTitle.setFont(new java.awt.Font("Inter", 1, 24)); // NOI18N
                pageTitle.setText("Your transcript - job well done Student");

                semester1.setBackground(new java.awt.Color(153, 153, 153));

                titleSem1.setBackground(new java.awt.Color(255, 255, 255));
                titleSem1.setFont(new java.awt.Font("Cascadia Mono", 0, 18)); // NOI18N
                titleSem1.setText("Semester 1");

                subjectName1.setFont(new java.awt.Font("Cascadia Mono", 0, 15)); // NOI18N
                subjectName1.setText("jLabel1");

                subjectName2.setFont(new java.awt.Font("Cascadia Mono", 0, 15)); // NOI18N
                subjectName2.setText("jLabel1");

                lblGrade1.setFont(new java.awt.Font("Cascadia Mono", 0, 15)); // NOI18N
                lblGrade1.setText("Grade obtained:");

                lblGrade2.setFont(new java.awt.Font("Cascadia Mono", 0, 15)); // NOI18N
                lblGrade2.setText("Grade obtained:");

                grade1.setFont(new java.awt.Font("Cascadia Mono", 0, 15)); // NOI18N
                grade1.setText("jLabel1");

                grade2.setFont(new java.awt.Font("Cascadia Mono", 0, 15)); // NOI18N
                grade2.setText("jLabel1");

                javax.swing.GroupLayout semester1Layout = new javax.swing.GroupLayout(semester1);
                semester1.setLayout(semester1Layout);
                semester1Layout.setHorizontalGroup(
                        semester1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(semester1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(semester1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(semester1Layout.createSequentialGroup()
                                                .addComponent(titleSem1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addContainerGap())
                                        .addGroup(semester1Layout.createSequentialGroup()
                                                .addGap(24, 24, 24)
                                                .addGroup(semester1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(semester1Layout.createSequentialGroup()
                                                                .addComponent(lblGrade1)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(grade1))
                                                        .addComponent(subjectName1, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(semester1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(semester1Layout.createSequentialGroup()
                                                                .addComponent(lblGrade2)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(grade2))
                                                        .addComponent(subjectName2, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(34, 34, 34))))
                );
                semester1Layout.setVerticalGroup(
                        semester1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(semester1Layout.createSequentialGroup()
                                .addComponent(titleSem1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(semester1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(subjectName1)
                                        .addComponent(subjectName2))
                                .addGap(32, 32, 32)
                                .addGroup(semester1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblGrade1)
                                        .addComponent(lblGrade2)
                                        .addComponent(grade1)
                                        .addComponent(grade2))
                                .addContainerGap(17, Short.MAX_VALUE))
                );

                semester2.setBackground(new java.awt.Color(153, 153, 153));

                titleSem2.setBackground(new java.awt.Color(255, 255, 255));
                titleSem2.setFont(new java.awt.Font("Cascadia Mono", 0, 18)); // NOI18N
                titleSem2.setText("Semester 2");

                lblGrade3.setFont(new java.awt.Font("Cascadia Mono", 0, 15)); // NOI18N
                lblGrade3.setText("Grade obtained:");

                subjectName3.setFont(new java.awt.Font("Cascadia Mono", 0, 15)); // NOI18N
                subjectName3.setText("jLabel1");

                subjectName4.setFont(new java.awt.Font("Cascadia Mono", 0, 15)); // NOI18N
                subjectName4.setText("jLabel1");

                lblGrade4.setFont(new java.awt.Font("Cascadia Mono", 0, 15)); // NOI18N
                lblGrade4.setText("Grade obtained:");

                grade3.setFont(new java.awt.Font("Cascadia Mono", 0, 15)); // NOI18N
                grade3.setText("jLabel1");

                grade4.setFont(new java.awt.Font("Cascadia Mono", 0, 15)); // NOI18N
                grade4.setText("jLabel1");

                javax.swing.GroupLayout semester2Layout = new javax.swing.GroupLayout(semester2);
                semester2.setLayout(semester2Layout);
                semester2Layout.setHorizontalGroup(
                        semester2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(semester2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(titleSem2, javax.swing.GroupLayout.PREFERRED_SIZE, 853, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(semester2Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(semester2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(semester2Layout.createSequentialGroup()
                                                .addComponent(lblGrade3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(grade3))
                                        .addComponent(subjectName3, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(semester2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(semester2Layout.createSequentialGroup()
                                                .addComponent(lblGrade4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(grade4))
                                        .addComponent(subjectName4, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(41, 41, 41))
                );
                semester2Layout.setVerticalGroup(
                        semester2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(semester2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(titleSem2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(semester2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(subjectName3)
                                        .addComponent(subjectName4))
                                .addGap(32, 32, 32)
                                .addGroup(semester2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblGrade3)
                                        .addComponent(lblGrade4)
                                        .addComponent(grade3)
                                        .addComponent(grade4))
                                .addContainerGap(11, Short.MAX_VALUE))
                );

                semester3.setBackground(new java.awt.Color(153, 153, 153));

                titleSem3.setBackground(new java.awt.Color(255, 255, 255));
                titleSem3.setFont(new java.awt.Font("Cascadia Mono", 0, 18)); // NOI18N
                titleSem3.setText("Semester 3");

                subjectName5.setFont(new java.awt.Font("Cascadia Mono", 0, 15)); // NOI18N
                subjectName5.setText("jLabel1");

                lblGrade6.setFont(new java.awt.Font("Cascadia Mono", 0, 15)); // NOI18N
                lblGrade6.setText("Grade obtained:");

                grade5.setFont(new java.awt.Font("Cascadia Mono", 0, 15)); // NOI18N
                grade5.setText("jLabel1");

                lblGrade5.setFont(new java.awt.Font("Cascadia Mono", 0, 15)); // NOI18N
                lblGrade5.setText("Grade obtained:");

                subjectName6.setFont(new java.awt.Font("Cascadia Mono", 0, 15)); // NOI18N
                subjectName6.setText("jLabel1");

                grade6.setFont(new java.awt.Font("Cascadia Mono", 0, 15)); // NOI18N
                grade6.setText("jLabel1");

                javax.swing.GroupLayout semester3Layout = new javax.swing.GroupLayout(semester3);
                semester3.setLayout(semester3Layout);
                semester3Layout.setHorizontalGroup(
                        semester3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(semester3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(titleSem3, javax.swing.GroupLayout.DEFAULT_SIZE, 1100, Short.MAX_VALUE)
                                .addGap(12, 12, 12))
                        .addGroup(semester3Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(semester3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(semester3Layout.createSequentialGroup()
                                                .addComponent(lblGrade5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(grade5))
                                        .addComponent(subjectName5, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(semester3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(semester3Layout.createSequentialGroup()
                                                .addComponent(lblGrade6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(grade6))
                                        .addComponent(subjectName6, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(39, 39, 39))
                );
                semester3Layout.setVerticalGroup(
                        semester3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(semester3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(titleSem3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(semester3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(subjectName5)
                                        .addComponent(subjectName6))
                                .addGap(32, 32, 32)
                                .addGroup(semester3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblGrade5)
                                        .addComponent(lblGrade6)
                                        .addComponent(grade5)
                                        .addComponent(grade6))
                                .addContainerGap(15, Short.MAX_VALUE))
                );

                semester4.setBackground(new java.awt.Color(153, 153, 153));

                titleSem4.setBackground(new java.awt.Color(255, 255, 255));
                titleSem4.setFont(new java.awt.Font("Cascadia Mono", 0, 18)); // NOI18N
                titleSem4.setText("Semester 4");

                grade8.setFont(new java.awt.Font("Cascadia Mono", 0, 15)); // NOI18N
                grade8.setText("jLabel1");

                subjectName7.setFont(new java.awt.Font("Cascadia Mono", 0, 15)); // NOI18N
                subjectName7.setText("jLabel1");

                grade7.setFont(new java.awt.Font("Cascadia Mono", 0, 15)); // NOI18N
                grade7.setText("jLabel1");

                lblGrade7.setFont(new java.awt.Font("Cascadia Mono", 0, 15)); // NOI18N
                lblGrade7.setText("Grade obtained:");

                subjectName8.setFont(new java.awt.Font("Cascadia Mono", 0, 15)); // NOI18N
                subjectName8.setText("jLabel1");

                lblGrade8.setFont(new java.awt.Font("Cascadia Mono", 0, 15)); // NOI18N
                lblGrade8.setText("Grade obtained:");

                javax.swing.GroupLayout semester4Layout = new javax.swing.GroupLayout(semester4);
                semester4.setLayout(semester4Layout);
                semester4Layout.setHorizontalGroup(
                        semester4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(semester4Layout.createSequentialGroup()
                                .addGroup(semester4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(semester4Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(titleSem4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(semester4Layout.createSequentialGroup()
                                                .addGap(29, 29, 29)
                                                .addGroup(semester4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(subjectName7, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(semester4Layout.createSequentialGroup()
                                                                .addComponent(lblGrade7)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(grade7)))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(semester4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(semester4Layout.createSequentialGroup()
                                                .addComponent(lblGrade8)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(grade8))
                                        .addComponent(subjectName8, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30))
                );
                semester4Layout.setVerticalGroup(
                        semester4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(semester4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(titleSem4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(subjectName7)
                                .addGap(32, 32, 32)
                                .addGroup(semester4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblGrade7)
                                        .addComponent(grade7))
                                .addContainerGap(15, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, semester4Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(subjectName8)
                                .addGap(32, 32, 32)
                                .addGroup(semester4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblGrade8)
                                        .addComponent(grade8))
                                .addGap(29, 29, 29))
                );

                lblStudentName.setText("Student name: ");

                studentName.setText("jLabel1");

                lblResult.setText("Result:");

                result.setText("jLabel1");

                lblGpa.setText("GPA obtained:");

                gpa.setText("jLabel1");

                btnPDF.setText("Save as PNG");
                btnPDF.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnPDFActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                this.setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(semester1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(semester2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(semester3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(semester4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(pageTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 853, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnPDF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(16, 16, 16))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(lblStudentName)
                                                                .addGap(41, 41, 41)
                                                                .addComponent(studentName, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(lblResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(lblGpa, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))
                                                                .addGap(41, 41, 41)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(gpa, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(pageTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnPDF))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblStudentName)
                                        .addComponent(studentName))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblResult)
                                        .addComponent(result))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblGpa)
                                        .addComponent(gpa))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                                .addComponent(semester1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(semester2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(semester3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(semester4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(85, 85, 85))
                );

                layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {semester1, semester2});

                layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {semester3, semester4});

                layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnPDF, pageTitle});

        }// </editor-fold>//GEN-END:initComponents

        private void btnPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPDFActionPerformed
		Helper.captureScreenshot(this);
        }//GEN-LAST:event_btnPDFActionPerformed


        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton btnPDF;
        private javax.swing.JLabel gpa;
        private javax.swing.JLabel grade1;
        private javax.swing.JLabel grade2;
        private javax.swing.JLabel grade3;
        private javax.swing.JLabel grade4;
        private javax.swing.JLabel grade5;
        private javax.swing.JLabel grade6;
        private javax.swing.JLabel grade7;
        private javax.swing.JLabel grade8;
        private javax.swing.JLabel lblGpa;
        private javax.swing.JLabel lblGrade1;
        private javax.swing.JLabel lblGrade2;
        private javax.swing.JLabel lblGrade3;
        private javax.swing.JLabel lblGrade4;
        private javax.swing.JLabel lblGrade5;
        private javax.swing.JLabel lblGrade6;
        private javax.swing.JLabel lblGrade7;
        private javax.swing.JLabel lblGrade8;
        private javax.swing.JLabel lblResult;
        private javax.swing.JLabel lblStudentName;
        private javax.swing.JLabel pageTitle;
        private javax.swing.JLabel result;
        private javax.swing.JPanel semester1;
        private javax.swing.JPanel semester2;
        private javax.swing.JPanel semester3;
        private javax.swing.JPanel semester4;
        private javax.swing.JLabel studentName;
        private javax.swing.JLabel subjectName1;
        private javax.swing.JLabel subjectName2;
        private javax.swing.JLabel subjectName3;
        private javax.swing.JLabel subjectName4;
        private javax.swing.JLabel subjectName5;
        private javax.swing.JLabel subjectName6;
        private javax.swing.JLabel subjectName7;
        private javax.swing.JLabel subjectName8;
        private javax.swing.JLabel titleSem1;
        private javax.swing.JLabel titleSem2;
        private javax.swing.JLabel titleSem3;
        private javax.swing.JLabel titleSem4;
        // End of variables declaration//GEN-END:variables

	private void populateTranscript() {
		Transcript transcript = t;
		UniClass[] classesArr = new UniClass[8];
		Grade[] gradesArr = new Grade[8];

		int i = 0, j = 0;
		Map<UniClass, Grade> classes = t.getAllClasses();
		for (Map.Entry<UniClass, Grade> entry: classes.entrySet()) {
			UniClass uc = entry.getKey();
			Grade g = entry.getValue();
			
			classesArr[i++] = uc;
			gradesArr[j++] = g;
		}
		subjectName1.setText(classesArr[0] != null ? classesArr[0].getFullCourseName() : "Subject 1 (Pending)");
		subjectName2.setText(classesArr[1] != null ? classesArr[1].getFullCourseName() : "Subject 2 (Pending)");
		subjectName3.setText(classesArr[2] != null ? classesArr[2].getFullCourseName() : "Subject 3 (Pending)");
		subjectName4.setText(classesArr[3] != null ? classesArr[3].getFullCourseName() : "Subject 4 (Pending)");
		subjectName5.setText(classesArr[4] != null ? classesArr[4].getFullCourseName() : "Subject 5 (Pending)");
		subjectName6.setText(classesArr[5] != null ? classesArr[5].getFullCourseName() : "Subject 6 (Pending)");
		subjectName7.setText(classesArr[6] != null ? classesArr[6].getFullCourseName() : "Subject 7 (Pending)");
		subjectName8.setText(classesArr[7] != null ? classesArr[7].getFullCourseName() : "Subject 8 (Pending)");

		grade1.setText(gradesArr[0] != null ? gradesArr[0].toString() : "Grade for subject 1 (Pending)");
		grade2.setText(gradesArr[1] != null ? gradesArr[1].toString() : "Grade for subject 2 (Pending)");
		grade3.setText(gradesArr[2] != null ? gradesArr[2].toString() : "Grade for subject 3 (Pending)");
		grade4.setText(gradesArr[3] != null ? gradesArr[3].toString() : "Grade for subject 4 (Pending)");
		grade5.setText(gradesArr[4] != null ? gradesArr[4].toString() : "Grade for subject 5 (Pending)");
		grade6.setText(gradesArr[5] != null ? gradesArr[5].toString() : "Grade for subject 6 (Pending)");
		grade7.setText(gradesArr[6] != null ? gradesArr[6].toString() : "Grade for subject 7 (Pending)");
		grade8.setText(gradesArr[7] != null ? gradesArr[7].toString() : "Grade for subject 8 (Pending)");

	}
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.admin;

import java.awt.Color;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.User;
import ui.MainJFrame;

/**
 *
 * @author drag
 */
public class UserActivity extends javax.swing.JPanel {

	MainJFrame ws;
	JPanel csp;
	/**
	 * Creates new form UserActivity
	 */
	public UserActivity(MainJFrame ws, JPanel csp) {
		this.ws = ws;
		this.csp = csp;
		initComponents();
		setBackground(Color.WHITE);

		tbl.setRowHeight(30);

		populateTbl();
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
                jLabel2 = new javax.swing.JLabel();
                lblUsers = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                lblRecruiters = new javax.swing.JLabel();
                jLabel4 = new javax.swing.JLabel();
                lblFeedbackUsers = new javax.swing.JLabel();
                jLabel5 = new javax.swing.JLabel();
                lblResearchers = new javax.swing.JLabel();
                jScrollPane1 = new javax.swing.JScrollPane();
                tbl = new javax.swing.JTable();
                btnSave = new javax.swing.JButton();

                pageTitle.setFont(new java.awt.Font("FreeSans", 1, 24)); // NOI18N
                pageTitle.setText("User activity");

                jLabel2.setText("Total users");

                lblUsers.setFont(new java.awt.Font("FreeSans", 1, 48)); // NOI18N

                jLabel3.setText("Total recruiters");

                lblRecruiters.setFont(new java.awt.Font("FreeSans", 1, 48)); // NOI18N

                jLabel4.setText("Total feedback users");

                lblFeedbackUsers.setFont(new java.awt.Font("FreeSans", 1, 48)); // NOI18N

                jLabel5.setText("Total researchers");

                lblResearchers.setFont(new java.awt.Font("FreeSans", 1, 48)); // NOI18N

                tbl.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null}
                        },
                        new String [] {
                                "Name", "Email", "Role", "Status"
                        }
                ) {
                        boolean[] canEdit = new boolean [] {
                                false, false, false, true
                        };

                        public boolean isCellEditable(int rowIndex, int columnIndex) {
                                return canEdit [columnIndex];
                        }
                });
                tbl.setColumnSelectionAllowed(true);
                jScrollPane1.setViewportView(tbl);
                tbl.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

                btnSave.setText("Save user data");
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
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(pageTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 914, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(86, 86, 86)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(lblUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(52, 52, 52)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(lblRecruiters, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(60, 60, 60)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(lblFeedbackUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(51, 51, 51)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(lblResearchers, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(21, 21, 21)
                                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(0, 22, Short.MAX_VALUE)))
                                .addContainerGap())
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(pageTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblRecruiters, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblFeedbackUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblResearchers, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(18, Short.MAX_VALUE))
                );
        }// </editor-fold>//GEN-END:initComponents

        private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
		int R = tbl.getRowCount();
		int C = tbl.getColumnCount();

		// NUID header is at index 0
		for (int i = 0; i < R; ++i) {
			for (int j = 0; j < C; ++j) {
				String updatedStatus = (String) tbl.getValueAt(i, 3);
				String emailId = (String) tbl.getValueAt(i, 1);

				User u = this.ws.getUserDir().fetchByEmail(emailId);

				if (updatedStatus.equalsIgnoreCase("enabled")) {
					u.setEnabled(true);
				}
				else u.setEnabled(false);

			}
		}
		populateTbl();
		JOptionPane.showMessageDialog(this, "User data saved!");
        }//GEN-LAST:event_btnSaveActionPerformed


        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton btnSave;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JLabel lblFeedbackUsers;
        private javax.swing.JLabel lblRecruiters;
        private javax.swing.JLabel lblResearchers;
        private javax.swing.JLabel lblUsers;
        private javax.swing.JLabel pageTitle;
        private javax.swing.JTable tbl;
        // End of variables declaration//GEN-END:variables

	private void populateTbl() {
		int feedbackUsers = this.ws.getUserDir().getTotalFeedbackUsers();
		int recruiters = this.ws.getUserDir().getRecruiters().size();
		int researchers = this.ws.getUserDir().getTotalResearchers();

		lblFeedbackUsers.setText(String.valueOf(feedbackUsers));
		lblRecruiters.setText(String.valueOf(recruiters));
		lblResearchers.setText(String.valueOf(researchers));
		lblUsers.setText(String.valueOf(this.ws.getUserDir().getUserDir().size()));

		DefaultTableModel table = (DefaultTableModel) tbl.getModel();

		int n = table.getRowCount();
		while (n-- > 0) {
			table.removeRow(n);
		}

		int i = 1;
		for (var r: this.ws.getUserDir().getUserDir()) {
			Vector<String> row = new Vector<>();
			row.add(r.getFullName());
			row.add(r.getEmail());
			row.add(r.getRole().toString());
			row.add(r.isEnabled() ? "Enabled" : "Disabled");

			table.addRow(row);
		}
	}
}
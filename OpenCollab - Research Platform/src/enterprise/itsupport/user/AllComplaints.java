/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package enterprise.itsupport.user;

import java.awt.Color;
import java.util.List;
import java.util.Vector;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Complaint;
import ui.MainJFrame;

/**
 *
 * @author drag
 */
public class AllComplaints extends javax.swing.JPanel {

	MainJFrame ws;
	JPanel csp;

	/**
	 * Creates new form AllComplaints
	 */
	public AllComplaints(MainJFrame ws, JPanel csp) {
		this.ws = ws;
		this.csp = csp;
		initComponents();

		setBackground(Color.WHITE);
		tbl.setRowHeight(30);

		populateTable();
	}

	/**
	 * This method is called from within the constructor to initialize the
	 * form. WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jScrollPane1 = new javax.swing.JScrollPane();
                tbl = new javax.swing.JTable();
                jLabel1 = new javax.swing.JLabel();
                btnNew = new javax.swing.JButton();
                jLabel2 = new javax.swing.JLabel();
                btnBack = new javax.swing.JButton();

                tbl.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {
                                {null, null, null},
                                {null, null, null},
                                {null, null, null},
                                {null, null, null}
                        },
                        new String [] {
                                "Name", "Date", "Response from admin"
                        }
                ) {
                        boolean[] canEdit = new boolean [] {
                                false, false, false
                        };

                        public boolean isCellEditable(int rowIndex, int columnIndex) {
                                return canEdit [columnIndex];
                        }
                });
                jScrollPane1.setViewportView(tbl);

                jLabel1.setFont(new java.awt.Font("FreeSans", 1, 24)); // NOI18N
                jLabel1.setText("All complaints");

                btnNew.setBackground(new java.awt.Color(51, 51, 51));
                btnNew.setFont(new java.awt.Font("FreeSans", 1, 15)); // NOI18N
                btnNew.setForeground(new java.awt.Color(255, 255, 255));
                btnNew.setText("New complaint >>");
                btnNew.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnNewActionPerformed(evt);
                        }
                });

                jLabel2.setFont(new java.awt.Font("FreeSans", 1, 15)); // NOI18N
                jLabel2.setText("Experiencing any issues?");

                btnBack.setBackground(new java.awt.Color(255, 255, 255));
                btnBack.setFont(new java.awt.Font("FreeSans", 1, 15)); // NOI18N
                btnBack.setForeground(new java.awt.Color(51, 51, 51));
                btnBack.setText("<< Back");
                btnBack.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnBackActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                this.setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(0, 18, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 805, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(22, 22, 22)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(btnNew, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE))))
                                                .addGap(0, 43, Short.MAX_VALUE)))
                                .addContainerGap())
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(187, 187, 187)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(67, 67, 67)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(69, 69, 69)
                                .addComponent(btnBack)
                                .addContainerGap(110, Short.MAX_VALUE))
                );
        }// </editor-fold>//GEN-END:initComponents

        private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
		RaiseComplaint editing = new RaiseComplaint(ws, csp);

		csp.add("Editing", editing);
		((java.awt.CardLayout) csp.getLayout()).next(csp);
        }//GEN-LAST:event_btnNewActionPerformed

        private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
		// TODO add your handling code here:
		csp.remove(this);
		((java.awt.CardLayout) csp.getLayout()).next(csp);
        }//GEN-LAST:event_btnBackActionPerformed


        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton btnBack;
        private javax.swing.JButton btnNew;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JTable tbl;
        // End of variables declaration//GEN-END:variables

	private void populateTable() {

		DefaultTableModel table = (DefaultTableModel) tbl.getModel();

		int n = table.getRowCount();
		while (n-- > 0) {
			table.removeRow(n);
		}

//		List<ResearchGroup> groups = this.ws.getResearchGroups().getDir();
		List<Complaint> complaints = this.ws.getComplaintDir().getDirByUser(ws.getLoggedUser());

		int i = 1;
		for (Complaint c : complaints) {
			Vector<String> row = new Vector<>();
			row.add(c.getTitle());
			row.add(c.getDate());
			row.add(c.getAdminResponse() == "NOT_YET_REPLIED" ? "Pending" : c.getAdminResponse());
			row.add("Edit paper");

			table.addRow(row);
		}
	}
}

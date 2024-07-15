/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package enterprise.scrutiny.verdict;

import constants.PaperStatus;
import java.awt.event.ActionEvent;
import java.util.List;
import java.util.StringJoiner;
import java.util.Vector;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.researcher.ResearchGroup;
import model.researcher.ResearchPaper;
import model.researcher.Researcher;
import ui.ButtonCellRenderer;
import ui.MainJFrame;

/**
 *
 * @author drag
 */
public class WaitlistJPanel extends javax.swing.JPanel {

	MainJFrame ws;
	JPanel csp;

	/**
	 * Creates new form WaitlistJPanel
	 */
	public WaitlistJPanel(MainJFrame ws, JPanel csp) {
		this.ws = ws;
		this.csp = csp;
		initComponents();
		tbl.setRowHeight(30);
		tbl.getColumnModel().getColumn(4).setMaxWidth(0);

		Action actionRead = new AbstractAction() {
			public void actionPerformed(ActionEvent e) {
				try {
					int selectedRowIndex = tbl.getSelectedRow();
					String groupId = (String) tbl.getValueAt(selectedRowIndex, 4);
					ResearchPaper paper = ws.getResearchGroups().getById(groupId).getPaper();

					ReadJPanel editing = new ReadJPanel(ws, paper, csp);

					csp.add("Editing", editing);
					((java.awt.CardLayout) csp.getLayout()).next(csp);

				} catch (Exception exception) {
					exception.printStackTrace();
					JOptionPane.showMessageDialog(null, "There was an issue. Please try again.");
				}
			}
		};

		ButtonCellRenderer completeButton = new ButtonCellRenderer(tbl, actionRead, 2);

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

                jScrollPane1 = new javax.swing.JScrollPane();
                tbl = new javax.swing.JTable();
                jLabel1 = new javax.swing.JLabel();
                btnSave = new javax.swing.JButton();

                tbl.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {
                                {null, null, null, null, null},
                                {null, null, null, null, null},
                                {null, null, null, null, null},
                                {null, null, null, null, null}
                        },
                        new String [] {
                                "Paper name", "Collaborators", "Read", "Status", ""
                        }
                ) {
                        boolean[] canEdit = new boolean [] {
                                true, false, true, true, false
                        };

                        public boolean isCellEditable(int rowIndex, int columnIndex) {
                                return canEdit [columnIndex];
                        }
                });
                tbl.setColumnSelectionAllowed(true);
                jScrollPane1.setViewportView(tbl);
                tbl.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
                if (tbl.getColumnModel().getColumnCount() > 0) {
                        tbl.getColumnModel().getColumn(4).setResizable(false);
                }

                jLabel1.setFont(new java.awt.Font("Inter", 1, 24)); // NOI18N
                jLabel1.setText("Papers waiting to be published");

                btnSave.setBackground(new java.awt.Color(0, 102, 0));
                btnSave.setFont(new java.awt.Font("Inter", 1, 15)); // NOI18N
                btnSave.setForeground(new java.awt.Color(255, 255, 255));
                btnSave.setText("Save changes");
                btnSave.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnSaveActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                this.setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1023, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)))
                                .addContainerGap())
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                                        .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(88, Short.MAX_VALUE))
                );
        }// </editor-fold>//GEN-END:initComponents

        private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
		int R = tbl.getRowCount();
		int C = tbl.getColumnCount();

		// NUID header is at index 0
		for (int i = 0; i < R; ++i) {
			for (int j = 0; j < C; ++j) {
				String updatedStatus = (String) tbl.getValueAt(i, 3);
				String groupId = (String) tbl.getValueAt(i, 4);

				PaperStatus g = null;
				for (var v : PaperStatus.values()) {
					if (v.toString().equalsIgnoreCase(updatedStatus)) {
						g = v;
					}
				}

				ResearchPaper paper = ws.getResearchGroups().getById(groupId).getPaper();
				paper.setStatus(g);

			}
		}
		this.populateTbl();
		JOptionPane.showMessageDialog(this, "All changes saved!");

        }//GEN-LAST:event_btnSaveActionPerformed


        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton btnSave;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JTable tbl;
        // End of variables declaration//GEN-END:variables

	private void populateTbl() {

		DefaultTableModel table = (DefaultTableModel) tbl.getModel();

		int n = table.getRowCount();
		while (n-- > 0) {
			table.removeRow(n);
		}

//		List<ResearchPaper> papers= this.ws.getPaperDir().getDir();
		List<ResearchGroup> groups = this.ws.getResearchGroups().getDir(PaperStatus.UNDER_REVIEW);

		int i = 1;
		for (ResearchGroup g : groups) {
			Vector<String> row = new Vector<>();
			row.add(g.getPaper().getTitle());
			row.add(listToString(g.getGroup()));
			row.add("Read");
			row.add(g.getPaper().getStatus().toString());
			row.add(g.getUuid());

			table.addRow(row);
		}
	}

	public static String listToString(List<Researcher> list) {
		StringJoiner joiner = new StringJoiner(", ");
		for (Researcher r : list) {
			joiner.add(r.getUser().getFirstName() + " " + r.getUser().getLastName());

		}
		return joiner.toString();
	}
}
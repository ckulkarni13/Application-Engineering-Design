/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package enterprise.hiring;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Email;
import model.ShortlistContainer;
import model.researcher.Researcher;
import ui.MainJFrame;

/**
 *
 * @author drag
 */
public class ViewCandidate extends javax.swing.JPanel {

	MainJFrame ws;
	JPanel csp;
	Researcher r;

	/**
	 * Creates new form ViewCandidate
	 */
	public ViewCandidate(MainJFrame ws, Researcher r, JPanel csp) {
		this.ws = ws;
		this.csp = csp;
		this.r = r;
		initComponents();

		setBackground(Color.WHITE);
		img.setIcon(new ImageIcon("resources/interview.png"));
		txtMessage.setLineWrap(true);

		pageTitle.setText("Profile summary - " + this.r.getUser().getFullName());

		if (this.ws.getLoggedUser().isShortlisted(r)) {
			btnShortlist.setText("Shortlisted");
			btnShortlist.setBackground(new Color(0, 102, 0));
		}

		populateStats();
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
                btnBack1 = new javax.swing.JButton();
                jLabel1 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                jLabel4 = new javax.swing.JLabel();
                jLabel5 = new javax.swing.JLabel();
                lblPublished = new javax.swing.JLabel();
                lblOngoing = new javax.swing.JLabel();
                lblCitations = new javax.swing.JLabel();
                lblH = new javax.swing.JLabel();
                lblConferences = new javax.swing.JLabel();
                img = new javax.swing.JLabel();
                jLabel6 = new javax.swing.JLabel();
                txtSubject = new javax.swing.JTextField();
                lblMessage = new javax.swing.JLabel();
                jScrollPane1 = new javax.swing.JScrollPane();
                txtMessage = new javax.swing.JTextArea();
                btnSend = new javax.swing.JButton();
                btnShortlist = new javax.swing.JButton();

                pageTitle.setFont(new java.awt.Font("FreeSans", 1, 24)); // NOI18N
                pageTitle.setText("Profile - {{Candidate name}}");

                btnBack1.setBackground(new java.awt.Color(255, 255, 255));
                btnBack1.setFont(new java.awt.Font("FreeSans", 1, 15)); // NOI18N
                btnBack1.setForeground(new java.awt.Color(51, 51, 51));
                btnBack1.setText("<< Back");
                btnBack1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnBack1ActionPerformed(evt);
                        }
                });

                jLabel1.setText("Ongoing papers");

                jLabel2.setText("Citations");

                jLabel3.setText("h-Index");

                jLabel4.setText("Papers published");

                jLabel5.setText("Conferences attended");

                lblPublished.setFont(new java.awt.Font("DM Mono", 1, 48)); // NOI18N
                lblPublished.setText("6");

                lblOngoing.setFont(new java.awt.Font("DM Mono", 1, 48)); // NOI18N
                lblOngoing.setText("6");

                lblCitations.setFont(new java.awt.Font("DM Mono", 1, 48)); // NOI18N
                lblCitations.setText("6");

                lblH.setFont(new java.awt.Font("DM Mono", 1, 48)); // NOI18N
                lblH.setText("6");

                lblConferences.setFont(new java.awt.Font("DM Mono", 1, 48)); // NOI18N
                lblConferences.setText("6");

                jLabel6.setText("Subject");

                txtSubject.setFont(new java.awt.Font("DM Mono", 0, 15)); // NOI18N

                lblMessage.setText("Message");

                txtMessage.setColumns(20);
                txtMessage.setFont(new java.awt.Font("DM Mono", 0, 15)); // NOI18N
                txtMessage.setRows(5);
                jScrollPane1.setViewportView(txtMessage);

                btnSend.setBackground(new java.awt.Color(0, 0, 102));
                btnSend.setFont(new java.awt.Font("FreeSans", 1, 15)); // NOI18N
                btnSend.setForeground(new java.awt.Color(255, 255, 255));
                btnSend.setText("Send an email");
                btnSend.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnSendActionPerformed(evt);
                        }
                });

                btnShortlist.setBackground(new java.awt.Color(204, 153, 0));
                btnShortlist.setFont(new java.awt.Font("FreeSans", 1, 15)); // NOI18N
                btnShortlist.setForeground(new java.awt.Color(255, 255, 255));
                btnShortlist.setText("Shortlist candidate");
                btnShortlist.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnShortlistActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                this.setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(pageTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 767, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btnShortlist, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(btnBack1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addGap(8, 8, 8)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(lblPublished, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE))
                                                        .addGap(92, 92, 92)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                                                                .addComponent(lblOngoing, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addGap(80, 80, 80)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(lblCitations, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(85, 85, 85)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(lblH, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(52, 52, 52)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(lblConferences, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                .addGroup(layout.createSequentialGroup()
                                                        .addGap(47, 47, 47)
                                                        .addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addGap(99, 99, 99)
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(txtSubject)
                                                                                .addComponent(lblMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(jScrollPane1)))
                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(32, 32, 32))))))
                                .addContainerGap())
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(pageTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                                        .addComponent(btnShortlist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblPublished, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblOngoing, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblCitations, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblH, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblConferences, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtSubject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(27, 27, 27)
                                                .addComponent(lblMessage)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                .addComponent(btnBack1)
                                .addGap(34, 34, 34))
                );
        }// </editor-fold>//GEN-END:initComponents

        private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed
		// TODO add your handling code here:
		csp.remove(this);
		((java.awt.CardLayout) csp.getLayout()).next(csp);
        }//GEN-LAST:event_btnBack1ActionPerformed

        private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
		String subject = txtSubject.getText().trim();
		String message = txtMessage.getText().trim();

		if (subject.length() == 0 || message.length() == 0) {
			JOptionPane.showMessageDialog(this, "Please ensure subject and message are not empty!");
			return;
		}

		Email email = new Email(this.ws.getLoggedUser().getEmail());
		email.setSubject(subject);
		email.setMessage(message);
		this.r.addEmail(email);

		JOptionPane.showMessageDialog(this, "Intervierw invite sent successfully!");

		txtSubject.setText("");
		txtMessage.setText("");

        }//GEN-LAST:event_btnSendActionPerformed

        private void btnShortlistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShortlistActionPerformed
		String comments = JOptionPane.showInputDialog(this, "Any comments?");

		comments = comments.length() > 0 ? comments : "N/A";

		this.ws.getLoggedUser().addToShortlist(r, comments);

//		JOptionPane.showMessageDialog(this, "");
		btnShortlist.setText("Shortlisted");
		btnShortlist.setBackground(new Color(0, 102, 0));
        }//GEN-LAST:event_btnShortlistActionPerformed


        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton btnBack1;
        private javax.swing.JButton btnSend;
        private javax.swing.JButton btnShortlist;
        private javax.swing.JLabel img;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JLabel lblCitations;
        private javax.swing.JLabel lblConferences;
        private javax.swing.JLabel lblH;
        private javax.swing.JLabel lblMessage;
        private javax.swing.JLabel lblOngoing;
        private javax.swing.JLabel lblPublished;
        private javax.swing.JLabel pageTitle;
        private javax.swing.JTextArea txtMessage;
        private javax.swing.JTextField txtSubject;
        // End of variables declaration//GEN-END:variables

	private void populateStats() {
		this.lblCitations.setText(String.valueOf(r.getCitationCount()));
		this.lblConferences.setText(String.valueOf(r.getConfs().size()));
		this.lblPublished.setText(String.valueOf(this.ws.getResearchGroups().getPublishedPaperByResearcher(r).size()));
		this.lblOngoing.setText(String.valueOf(this.ws.getResearchGroups().getOngoingPaperByResearcher(r).size()));
		this.lblH.setText(String.valueOf(r.gethIndex()));
	}
}
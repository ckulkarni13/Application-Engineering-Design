/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package enterprise.research.database;

import enterprise.research.translator.Translator;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.researcher.ResearchPaper;
import model.researcher.Researcher;
//import org.apache.pdfbox.pdmodel.PDDocument;
import ui.MainJFrame;

/**
 *
 * @author drag
 */
public class ViewPaper extends javax.swing.JPanel {

	MainJFrame ws;
	ResearchPaper paper;
	JPanel csp;
	Researcher researcher;

	/**
	 * Creates new form ViewPaper
	 */
	public ViewPaper(MainJFrame ws, ResearchPaper r, JPanel csp) {
		this.ws = ws;
		this.paper = r;
		this.csp = csp;

		initComponents();

		txtAbstract.setLineWrap(true);
		txtResults.setLineWrap(true);
		txtConclusion.setLineWrap(true);
		txtIntro.setLineWrap(true);

		this.ws.add(this);
		this.ws.pack();

		researcher = this.ws.getResearcherDir().fetchByUser(this.ws.getLoggedUser());

		loadCiteButton();
		populatePaperFields();
	}

	/**
	 * This method is called from within the constructor to initialize the
	 * form. WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jPanel1 = new javax.swing.JPanel();
                pageTitle = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                jScrollPane2 = new javax.swing.JScrollPane();
                txtAbstract = new javax.swing.JTextArea();
                btnBack = new javax.swing.JButton();
                jLabel4 = new javax.swing.JLabel();
                jScrollPane3 = new javax.swing.JScrollPane();
                txtIntro = new javax.swing.JTextArea();
                lblResults = new javax.swing.JLabel();
                jScrollPane4 = new javax.swing.JScrollPane();
                txtResults = new javax.swing.JTextArea();
                lblResults1 = new javax.swing.JLabel();
                jScrollPane5 = new javax.swing.JScrollPane();
                txtConclusion = new javax.swing.JTextArea();
                txtTitle = new javax.swing.JTextField();
                btnPDF = new javax.swing.JButton();
                btnCite = new javax.swing.JButton();

                jPanel1.setBackground(new java.awt.Color(102, 51, 0));

                pageTitle.setFont(new java.awt.Font("FreeSans", 1, 24)); // NOI18N
                pageTitle.setForeground(new java.awt.Color(255, 255, 255));
                pageTitle.setText("{paper_title}");

                jLabel2.setFont(new java.awt.Font("FreeSans", 1, 15)); // NOI18N
                jLabel2.setForeground(new java.awt.Color(255, 255, 255));
                jLabel2.setText("Title");

                jLabel3.setFont(new java.awt.Font("FreeSans", 1, 15)); // NOI18N
                jLabel3.setForeground(new java.awt.Color(255, 255, 255));
                jLabel3.setText("Abstract");

                txtAbstract.setColumns(20);
                txtAbstract.setFont(new java.awt.Font("DM Mono", 0, 15)); // NOI18N
                txtAbstract.setRows(5);
                txtAbstract.setEnabled(false);
                jScrollPane2.setViewportView(txtAbstract);

                btnBack.setBackground(new java.awt.Color(255, 255, 255));
                btnBack.setFont(new java.awt.Font("FreeSans", 1, 15)); // NOI18N
                btnBack.setForeground(new java.awt.Color(51, 51, 51));
                btnBack.setText("<< Back");
                btnBack.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnBackActionPerformed(evt);
                        }
                });

                jLabel4.setFont(new java.awt.Font("FreeSans", 1, 15)); // NOI18N
                jLabel4.setForeground(new java.awt.Color(255, 255, 255));
                jLabel4.setText("Intro");

                txtIntro.setColumns(20);
                txtIntro.setFont(new java.awt.Font("DM Mono", 0, 15)); // NOI18N
                txtIntro.setRows(5);
                txtIntro.setEnabled(false);
                jScrollPane3.setViewportView(txtIntro);

                lblResults.setFont(new java.awt.Font("FreeSans", 1, 15)); // NOI18N
                lblResults.setForeground(new java.awt.Color(255, 255, 255));
                lblResults.setText("Results");

                txtResults.setColumns(20);
                txtResults.setFont(new java.awt.Font("DM Mono", 0, 15)); // NOI18N
                txtResults.setRows(5);
                txtResults.setEnabled(false);
                jScrollPane4.setViewportView(txtResults);

                lblResults1.setFont(new java.awt.Font("FreeSans", 1, 15)); // NOI18N
                lblResults1.setForeground(new java.awt.Color(255, 255, 255));
                lblResults1.setText("Conclusion");

                txtConclusion.setColumns(20);
                txtConclusion.setFont(new java.awt.Font("DM Mono", 0, 15)); // NOI18N
                txtConclusion.setRows(5);
                txtConclusion.setEnabled(false);
                jScrollPane5.setViewportView(txtConclusion);

                txtTitle.setFont(new java.awt.Font("DM Mono", 0, 15)); // NOI18N
                txtTitle.setEnabled(false);

                btnPDF.setBackground(new java.awt.Color(51, 0, 51));
                btnPDF.setFont(new java.awt.Font("Inter", 1, 15)); // NOI18N
                btnPDF.setForeground(new java.awt.Color(255, 255, 255));
                btnPDF.setText("Convert to Spanish");
                btnPDF.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnPDFActionPerformed(evt);
                        }
                });

                btnCite.setBackground(new java.awt.Color(255, 153, 0));
                btnCite.setFont(new java.awt.Font("FreeSans", 1, 15)); // NOI18N
                btnCite.setForeground(new java.awt.Color(255, 255, 255));
                btnCite.setText("Cite this paper");
                btnCite.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnCiteActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(txtTitle)
                                                .addContainerGap())
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 573, Short.MAX_VALUE)
                                                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(jScrollPane5)
                                                                        .addComponent(lblResults, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(jScrollPane4)
                                                                        .addComponent(lblResults1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(pageTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 959, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(btnPDF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                .addContainerGap())
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnCite, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(23, 23, 23))))
                );
                jPanel1Layout.setVerticalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnPDF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(pageTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE))
                                .addGap(37, 37, 37)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(lblResults, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(24, 24, 24)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(lblResults1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnBack)
                                        .addComponent(btnCite, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(41, 41, 41))
                );

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                this.setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 1174, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 10, Short.MAX_VALUE)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 11, Short.MAX_VALUE)))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 768, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                );
        }// </editor-fold>//GEN-END:initComponents

        private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
		// TODO add your handling code here:
		csp.remove(this);
		((java.awt.CardLayout) csp.getLayout()).next(csp);
        }//GEN-LAST:event_btnBackActionPerformed

        private void btnPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPDFActionPerformed

		String fromLang = "en";
		String toLang = "es";

		String title = txtTitle.getText().trim();
		String abstractData = txtTitle.getText().trim();
		String results = txtResults.getText().trim();
		String conclusion = txtConclusion.getText().trim();
		String intro = txtIntro.getText().trim();

		try {
			String[] output = Translator.translate(fromLang, toLang, title + "(-)" + abstractData + "(-)" + results + "(-)" + conclusion + "(-)" + intro).split("(-)");
			for (String yeeh : output) {
				System.out.println(yeeh);
			}
			title = output[0].replace("(","").replace(")", "");
			abstractData = output[1].replace("(","").replace(")", "");
			results = output[2].replace("(","").replace(")", "");
			conclusion = output[3].replace("(","").replace(")", "");
			intro = output[4].replace("(","").replace(")", "");

			pageTitle.setText(title);
			txtTitle.setText(title);
			txtAbstract.setText(abstractData);
			txtResults.setText(results);
			txtConclusion.setText(conclusion);
			txtIntro.setText(intro);
		} catch (Exception e) {
			e.printStackTrace();
		}
        }//GEN-LAST:event_btnPDFActionPerformed

        private void btnCiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCiteActionPerformed

		paper.addCiteByResearcher(researcher);
		JOptionPane.showMessageDialog(this, "You have cited '" + paper.getTitle() + "'. Thankyou for your contribution");
		loadCiteButton();


        }//GEN-LAST:event_btnCiteActionPerformed


        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton btnBack;
        private javax.swing.JButton btnCite;
        private javax.swing.JButton btnPDF;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JScrollPane jScrollPane2;
        private javax.swing.JScrollPane jScrollPane3;
        private javax.swing.JScrollPane jScrollPane4;
        private javax.swing.JScrollPane jScrollPane5;
        private javax.swing.JLabel lblResults;
        private javax.swing.JLabel lblResults1;
        private javax.swing.JLabel pageTitle;
        private javax.swing.JTextArea txtAbstract;
        private javax.swing.JTextArea txtConclusion;
        private javax.swing.JTextArea txtIntro;
        private javax.swing.JTextArea txtResults;
        private javax.swing.JTextField txtTitle;
        // End of variables declaration//GEN-END:variables

	private void loadCiteButton() {
		String citeBtnText = "Cite paper";

		if (paper.getCitations().contains(researcher)) {
			citeBtnText = "Already cited";
		}

		btnCite.setText(citeBtnText);
	}

	private void populatePaperFields() {
		pageTitle.setText(paper.getTitle());
		txtTitle.setText(paper.getTitle());
		txtIntro.setText(paper.getIntro());
		txtAbstract.setText(paper.getAbstractText());
		txtResults.setText(paper.getResults());
		txtConclusion.setText(paper.getConclusion());

	}
}

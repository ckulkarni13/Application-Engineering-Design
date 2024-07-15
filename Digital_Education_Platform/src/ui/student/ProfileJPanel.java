/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.student;

/**
 *
 * @author Admin
 */
public class ProfileJPanel extends javax.swing.JPanel {

    /**
     * Creates new form student_my_profileJPanel
     */
    public ProfileJPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jScrollPane1 = new javax.swing.JScrollPane();
                jPanel1 = new javax.swing.JPanel();
                txtAddress = new javax.swing.JTextField();
                lblNUID = new javax.swing.JLabel();
                txtFullName = new javax.swing.JTextField();
                lblFullName = new javax.swing.JLabel();
                lblContactDetails = new javax.swing.JLabel();
                txtContactDetails = new javax.swing.JTextField();
                lblProgram = new javax.swing.JLabel();
                lblAddress = new javax.swing.JLabel();
                btnSave = new javax.swing.JButton();
                lblGender = new javax.swing.JLabel();
                btnUpdate = new javax.swing.JButton();
                lblAge = new javax.swing.JLabel();
                txtNUID = new javax.swing.JTextField();
                jLabel1 = new javax.swing.JLabel();
                DropDownGender = new javax.swing.JComboBox<>();
                txtAge = new javax.swing.JTextField();
                DropDownProgram = new javax.swing.JComboBox<>();

                lblNUID.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblNUID.setText("NUID :");

                lblFullName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblFullName.setText("Full Name :");

                lblContactDetails.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblContactDetails.setText("Contact Details :");

                lblProgram.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblProgram.setText("Program :");

                lblAddress.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblAddress.setText("Address :");

                btnSave.setText("Save");

                lblGender.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblGender.setText("Gender :");

                btnUpdate.setText("Update");

                lblAge.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblAge.setText("Age :");

                jLabel1.setFont(new java.awt.Font("Constantia", 3, 24)); // NOI18N
                jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel1.setText("Hello Student, Welcome to your profile !!!");

                DropDownGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Any Other" }));

                DropDownProgram.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
                DropDownProgram.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                DropDownProgramActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(174, 174, 174)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(DropDownProgram, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(txtNUID)
                                        .addComponent(txtFullName)
                                        .addComponent(txtContactDetails)
                                        .addComponent(DropDownGender, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblNUID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblFullName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblContactDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblGender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblAge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblProgram, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtAge)
                                        .addComponent(txtAddress))
                                .addContainerGap(184, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                                .addContainerGap())
                );

                jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnSave, btnUpdate});

                jPanel1Layout.setVerticalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblNUID)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNUID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblFullName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtFullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(lblContactDetails)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtContactDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblGender)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DropDownGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblAge)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblAddress)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(lblProgram)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DropDownProgram, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnSave)
                                        .addComponent(btnUpdate))
                                .addContainerGap(24, Short.MAX_VALUE))
                );

                jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {DropDownProgram, txtAddress, txtAge});

                jScrollPane1.setViewportView(jPanel1);

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                this.setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 602, Short.MAX_VALUE)
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1)
                );
        }// </editor-fold>//GEN-END:initComponents

        private void DropDownProgramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DropDownProgramActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_DropDownProgramActionPerformed


        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JComboBox<String> DropDownGender;
        private javax.swing.JComboBox<String> DropDownProgram;
        private javax.swing.JButton btnSave;
        private javax.swing.JButton btnUpdate;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JLabel lblAddress;
        private javax.swing.JLabel lblAge;
        private javax.swing.JLabel lblContactDetails;
        private javax.swing.JLabel lblFullName;
        private javax.swing.JLabel lblGender;
        private javax.swing.JLabel lblNUID;
        private javax.swing.JLabel lblProgram;
        private javax.swing.JTextField txtAddress;
        private javax.swing.JTextField txtAge;
        private javax.swing.JTextField txtContactDetails;
        private javax.swing.JTextField txtFullName;
        private javax.swing.JTextField txtNUID;
        // End of variables declaration//GEN-END:variables
}
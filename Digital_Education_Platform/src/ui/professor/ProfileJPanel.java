/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.professor;

/**
 *
 * @author Admin
 */
public class ProfileJPanel extends javax.swing.JPanel {

    /**
     * Creates new form professor_my_profile
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
                btnUpdate = new javax.swing.JButton();
                txtFullName = new javax.swing.JTextField();
                txtSpeciality = new javax.swing.JTextField();
                lblFullName = new javax.swing.JLabel();
                lblAge = new javax.swing.JLabel();
                txtProfessorID = new javax.swing.JTextField();
                lblContactDetails = new javax.swing.JLabel();
                jLabel1 = new javax.swing.JLabel();
                txtContactDetails = new javax.swing.JTextField();
                DropDownGender = new javax.swing.JComboBox<>();
                lblSpeciality = new javax.swing.JLabel();
                lblLocation = new javax.swing.JLabel();
                btnSave = new javax.swing.JButton();
                txtLocation = new javax.swing.JTextField();
                lblGender = new javax.swing.JLabel();
                lblProfessorID = new javax.swing.JLabel();
                lblCourses = new javax.swing.JLabel();
                DropDownCourses = new javax.swing.JComboBox<>();
                btnBack = new javax.swing.JButton();
                txtAge = new javax.swing.JTextField();

                btnUpdate.setText("Update");

                lblFullName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblFullName.setText("Full Name :");

                lblAge.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblAge.setText("Age :");

                lblContactDetails.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
                lblContactDetails.setText("Contact Details :");

                jLabel1.setFont(new java.awt.Font("Constantia", 3, 24)); // NOI18N
                jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel1.setText("Hello Professor, Welcome to your profile !!!");

                DropDownGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Any Other" }));

                lblSpeciality.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblSpeciality.setText("Speciality :");

                lblLocation.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblLocation.setText("Location :");

                btnSave.setText("Save");

                lblGender.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblGender.setText("Gender :");

                lblProfessorID.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblProfessorID.setText("Professor ID :");

                lblCourses.setText("Courses :");

                DropDownCourses.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

                btnBack.setText("<< Back ");

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(203, 203, 203)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtAge)
                                        .addComponent(DropDownCourses, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblCourses)
                                        .addComponent(lblAge)
                                        .addComponent(lblGender)
                                        .addComponent(lblContactDetails)
                                        .addComponent(lblFullName)
                                        .addComponent(txtProfessorID, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                                        .addComponent(lblProfessorID)
                                        .addComponent(txtFullName)
                                        .addComponent(txtContactDetails)
                                        .addComponent(lblLocation)
                                        .addComponent(lblSpeciality)
                                        .addComponent(txtSpeciality)
                                        .addComponent(txtLocation)
                                        .addComponent(DropDownGender, 0, 238, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(btnSave)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnUpdate)))
                                .addGap(114, 114, 114)
                                .addComponent(btnBack)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 648, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 104, Short.MAX_VALUE))
                );
                jPanel1Layout.setVerticalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(lblProfessorID)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtProfessorID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(lblLocation)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblSpeciality)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSpeciality, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblCourses)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DropDownCourses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(12, 12, 12)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(btnSave)
                                                        .addComponent(btnUpdate))
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                                                .addComponent(btnBack)
                                                .addGap(32, 32, 32))))
                );

                jScrollPane1.setViewportView(jPanel1);

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                this.setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 661, Short.MAX_VALUE)
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 677, Short.MAX_VALUE)
                );
        }// </editor-fold>//GEN-END:initComponents


        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JComboBox<String> DropDownCourses;
        private javax.swing.JComboBox<String> DropDownGender;
        private javax.swing.JButton btnBack;
        private javax.swing.JButton btnSave;
        private javax.swing.JButton btnUpdate;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JLabel lblAge;
        private javax.swing.JLabel lblContactDetails;
        private javax.swing.JLabel lblCourses;
        private javax.swing.JLabel lblFullName;
        private javax.swing.JLabel lblGender;
        private javax.swing.JLabel lblLocation;
        private javax.swing.JLabel lblProfessorID;
        private javax.swing.JLabel lblSpeciality;
        private javax.swing.JTextField txtAge;
        private javax.swing.JTextField txtContactDetails;
        private javax.swing.JTextField txtFullName;
        private javax.swing.JTextField txtLocation;
        private javax.swing.JTextField txtProfessorID;
        private javax.swing.JTextField txtSpeciality;
        // End of variables declaration//GEN-END:variables
}

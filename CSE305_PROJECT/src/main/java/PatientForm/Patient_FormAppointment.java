/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package PatientForm;

/**
 *
 * @author My PC
 */
public class Patient_FormAppointment extends javax.swing.JPanel {

    /**
     * Creates new form Patient_FormAppointment
     */
    public Patient_FormAppointment() {
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

        pateintBorderPanel1 = new PateintSwing.PateintBorderPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPatient = new PateintModel.PatientTable();
        jPanel1 = new javax.swing.JPanel();
        pateintBorderPanel2 = new PateintSwing.PateintBorderPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cboPatientSearch = new javax.swing.JComboBox<>();
        txtPatientSearchText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 255));

        pateintBorderPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tblPatient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Troughton ", "Dentist", "Male", "01297376", "abc@gmail.com", "AVAILABLE"},
                {"Davison ", "Cardiovascular ", "Male", "01572527", "def@gmail.com", "NOT AVAILABLE"},
                {"Kamogawa ", "Pediatrics", "Female", "012653772", "ghi@gmail.com", "AVAILABLE"},
                {"Helden", "Dermatologists", "Male", "012543222", "jkl@gmail.com", "AVAILABLE"},
                {"Sophie", "Psychiatrists ", "Female", "01437277552", "mno@gmail.com", "NOT AVAILABLE"}
            },
            new String [] {
                "Name", "Major", "Gender", "Phone Number", "Email", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPatient);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pateintBorderPanel1Layout = new javax.swing.GroupLayout(pateintBorderPanel1);
        pateintBorderPanel1.setLayout(pateintBorderPanel1Layout);
        pateintBorderPanel1Layout.setHorizontalGroup(
            pateintBorderPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pateintBorderPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pateintBorderPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pateintBorderPanel1Layout.setVerticalGroup(
            pateintBorderPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pateintBorderPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        pateintBorderPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Vani", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 204));
        jLabel1.setText("ADD APPOITMENT");

        jLabel2.setFont(new java.awt.Font("Ravie", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 255));
        jLabel2.setText("______________________");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 153, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PateintIcon/icons8-filter-30.png"))); // NOI18N
        jLabel3.setText("Filters By");

        cboPatientSearch.setBackground(new java.awt.Color(198, 226, 255));
        cboPatientSearch.setForeground(new java.awt.Color(51, 51, 51));
        cboPatientSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Major", "Gender", "Status" }));

        txtPatientSearchText.setBackground(new java.awt.Color(255, 255, 255));
        txtPatientSearchText.setForeground(new java.awt.Color(102, 102, 102));
        txtPatientSearchText.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        txtPatientSearchText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientSearchTextActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PateintIcon/icons8-search-small-24.png"))); // NOI18N

        javax.swing.GroupLayout pateintBorderPanel2Layout = new javax.swing.GroupLayout(pateintBorderPanel2);
        pateintBorderPanel2.setLayout(pateintBorderPanel2Layout);
        pateintBorderPanel2Layout.setHorizontalGroup(
            pateintBorderPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pateintBorderPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(pateintBorderPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(71, 71, 71)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboPatientSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtPatientSearchText, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap(48, Short.MAX_VALUE))
        );
        pateintBorderPanel2Layout.setVerticalGroup(
            pateintBorderPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pateintBorderPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(62, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pateintBorderPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pateintBorderPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addGroup(pateintBorderPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(cboPatientSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtPatientSearchText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pateintBorderPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pateintBorderPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pateintBorderPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pateintBorderPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtPatientSearchTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientSearchTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientSearchTextActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboPatientSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private PateintSwing.PateintBorderPanel pateintBorderPanel1;
    private PateintSwing.PateintBorderPanel pateintBorderPanel2;
    private PateintModel.PatientTable tblPatient;
    private javax.swing.JTextField txtPatientSearchText;
    // End of variables declaration//GEN-END:variables
}

package ScreenStudent;

import ConnectionDB.ConnMySql;
import Table.Student;

public class ScreenPersonal extends javax.swing.JDialog {

    private final ConnMySql conn;
Student stu;
    public ScreenPersonal(java.awt.Frame parent, boolean modal,Student stu) {
        super(parent, modal);
        initComponents();
        conn = new ConnectionDB.ConnMySql();
        this.stu = stu;
        SetInformation();
        
        
    }
    //we take data from mysql and set each of them to textfields
    
    public void SetInformation(){
        jTextFieldNameSurname.setText(stu.name+" "+stu.surname);
        jTextFieldID.setText(""+stu.idStudent);
        jTextFieldBirth.setText(""+stu.birth);
        jTextFieldFaculty.setText(""+stu.idFaculty);
        jTextFieldMajor.setText(""+stu.idMajor);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextFieldBirth = new javax.swing.JTextField();
        jTextFieldNameSurname = new javax.swing.JTextField();
        jLabelNameSurname = new javax.swing.JLabel();
        jLabelBirth = new javax.swing.JLabel();
        jLabelFaculty = new javax.swing.JLabel();
        jLabelMajor = new javax.swing.JLabel();
        jTextFieldMajor = new javax.swing.JTextField();
        jTextFieldFaculty = new javax.swing.JTextField();
        jTextFieldID = new javax.swing.JTextField();
        jLabelID = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(230, 226, 226));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTextFieldBirth.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jTextFieldBirth.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextFieldBirth.setEnabled(false);
        jTextFieldBirth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBirthActionPerformed(evt);
            }
        });

        jTextFieldNameSurname.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jTextFieldNameSurname.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextFieldNameSurname.setEnabled(false);
        jTextFieldNameSurname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNameSurnameActionPerformed(evt);
            }
        });

        jLabelNameSurname.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelNameSurname.setForeground(new java.awt.Color(10, 10, 61));
        jLabelNameSurname.setText("Name Surname:");

        jLabelBirth.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelBirth.setForeground(new java.awt.Color(10, 10, 61));
        jLabelBirth.setText("Birth:");

        jLabelFaculty.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelFaculty.setForeground(new java.awt.Color(10, 10, 61));
        jLabelFaculty.setText("Faculty:");

        jLabelMajor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelMajor.setForeground(new java.awt.Color(10, 10, 61));
        jLabelMajor.setText("Major:");

        jTextFieldMajor.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jTextFieldMajor.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextFieldMajor.setEnabled(false);
        jTextFieldMajor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMajorActionPerformed(evt);
            }
        });

        jTextFieldFaculty.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jTextFieldFaculty.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextFieldFaculty.setEnabled(false);

        jTextFieldID.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jTextFieldID.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextFieldID.setEnabled(false);
        jTextFieldID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIDActionPerformed(evt);
            }
        });

        jLabelID.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelID.setForeground(new java.awt.Color(10, 10, 61));
        jLabelID.setText("Student ID:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabelMajor, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelFaculty, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelNameSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelID, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldNameSurname, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                    .addComponent(jTextFieldID)
                    .addComponent(jTextFieldBirth)
                    .addComponent(jTextFieldFaculty)
                    .addComponent(jTextFieldMajor))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNameSurname)
                    .addComponent(jTextFieldNameSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelID))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelBirth))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelFaculty)
                        .addGap(14, 14, 14)
                        .addComponent(jLabelMajor))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextFieldFaculty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(jTextFieldMajor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldBirthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBirthActionPerformed

    }//GEN-LAST:event_jTextFieldBirthActionPerformed

    private void jTextFieldMajorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMajorActionPerformed

    }//GEN-LAST:event_jTextFieldMajorActionPerformed

    private void jTextFieldIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIDActionPerformed

    }//GEN-LAST:event_jTextFieldIDActionPerformed

    private void jTextFieldNameSurnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNameSurnameActionPerformed

    }//GEN-LAST:event_jTextFieldNameSurnameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelBirth;
    private javax.swing.JLabel jLabelFaculty;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelMajor;
    private javax.swing.JLabel jLabelNameSurname;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldBirth;
    private javax.swing.JTextField jTextFieldFaculty;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldMajor;
    private javax.swing.JTextField jTextFieldNameSurname;
    // End of variables declaration//GEN-END:variables
}

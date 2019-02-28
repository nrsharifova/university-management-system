package ScreenAdmin;

import ConnectionDB.ConnMySql;
import Table.Faculty;
import Table.Major;
import Table.Teacher;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class addTeacher extends javax.swing.JDialog {

    private final ConnMySql conn;
    private List<Teacher> ListOfTeacher;
    private Teacher selectedTeacher;

    public addTeacher(java.awt.Frame parent, boolean modal) { 
        super(parent, modal);
        initComponents();
        conn = new ConnectionDB.ConnMySql();
        ListOfTeacher = conn.GetAllTeacher();
        FillTheTable(ListOfTeacher);

    }

    public void FillTheTable(List<Teacher> list) { //get information from mysql and fill the table
        DefaultTableModel tmodel = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };
        tmodel.addColumn("Name");
        tmodel.addColumn("Surname");
        tmodel.addColumn("Birth");
        tmodel.addColumn("Number");

        jTableTeacher.setModel(tmodel);

        for (Teacher teac : list) {
            tmodel.insertRow(jTableTeacher.getRowCount(), new Object[]{
                teac.name, teac.surname, teac.birth, teac.number
            });
        }
        jTableTeacher.setModel(tmodel);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelName = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jTextFieldBirth = new javax.swing.JTextField();
        jLabelBirth = new javax.swing.JLabel();
        jTextFieldSurname = new javax.swing.JTextField();
        jLabelSurname = new javax.swing.JLabel();
        jLabelMajor = new javax.swing.JLabel();
        jButtonNew = new javax.swing.JButton();
        jButtonEdit = new javax.swing.JButton();
        jButtonSave = new javax.swing.JButton();
        jTextFieldNumber = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTeacher = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(230, 226, 226));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelName.setForeground(new java.awt.Color(10, 10, 61));
        jLabelName.setText("Name:");

        jTextFieldName.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jTextFieldName.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextFieldName.setEnabled(false);

        jTextFieldBirth.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jTextFieldBirth.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextFieldBirth.setEnabled(false);
        jTextFieldBirth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBirthActionPerformed(evt);
            }
        });

        jLabelBirth.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelBirth.setForeground(new java.awt.Color(10, 10, 61));
        jLabelBirth.setText("Birth:");

        jTextFieldSurname.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jTextFieldSurname.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextFieldSurname.setEnabled(false);

        jLabelSurname.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelSurname.setForeground(new java.awt.Color(10, 10, 61));
        jLabelSurname.setText("Surname:");

        jLabelMajor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelMajor.setForeground(new java.awt.Color(10, 10, 61));
        jLabelMajor.setText("Number");

        jButtonNew.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonNew.setText("New");
        jButtonNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewActionPerformed(evt);
            }
        });

        jButtonEdit.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonEdit.setText("Edit");
        jButtonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditActionPerformed(evt);
            }
        });

        jButtonSave.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonSave.setText("Save");
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });

        jTextFieldNumber.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jTextFieldNumber.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextFieldNumber.setEnabled(false);
        jTextFieldNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNumberActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabelMajor, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextFieldNumber))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabelBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextFieldBirth))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabelSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextFieldSurname))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabelName, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonNew, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jButtonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelName)
                    .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSurname)
                    .addComponent(jTextFieldSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelBirth)
                    .addComponent(jTextFieldBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelMajor)
                    .addComponent(jTextFieldNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNew)
                    .addComponent(jButtonEdit)
                    .addComponent(jButtonSave))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(230, 226, 226));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTableTeacher.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jTableTeacher.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Surname", "Birth", "Number"
            }
        ));
        jScrollPane1.setViewportView(jTableTeacher);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldBirthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBirthActionPerformed

    }//GEN-LAST:event_jTextFieldBirthActionPerformed

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
            if (jTextFieldName.getText().trim().length() > 0 && jTextFieldSurname.getText().trim().length() > 0 && jTextFieldBirth.getText().trim().length() > 0 && jTextFieldNumber.getText().trim().length() > 0) {
            int id = 0;  //it determine insupteacher is for edit or save
            if (selectedTeacher != null) {
                id = selectedTeacher.idTeacher;
            }
            Teacher teac = new Teacher(id, jTextFieldName.getText(), jTextFieldSurname.getText(), jTextFieldBirth.getText(), jTextFieldNumber.getText());
            conn.InsUpTeacher(teac);
            clean();
            ListOfTeacher = conn.GetAllTeacher();
            selectedTeacher = null;
            FillTheTable(ListOfTeacher);
        }
    }//GEN-LAST:event_jButtonSaveActionPerformed
    public void clean() {  //clean textfield after save data
        jTextFieldName.setText(null);
        jTextFieldSurname.setText(null);
        jTextFieldBirth.setText(null);
        jTextFieldNumber.setText(null);
    }
    private void jButtonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditActionPerformed
        jTextFieldName.setEnabled(true);        
        jTextFieldSurname.setEnabled(true);
        jTextFieldBirth.setEnabled(true);  
        jTextFieldNumber.setEnabled(true);
        
        //we select row and information goes to textfields and we edit and save them, they go same row
        int selectedRow = jTableTeacher.getSelectedRow();
        selectedTeacher = ListOfTeacher.get(selectedRow);
        jTextFieldName.setText(selectedTeacher.name);
        jTextFieldSurname.setText(selectedTeacher.surname);
        jTextFieldBirth.setText(selectedTeacher.birth);
        jTextFieldNumber.setText(selectedTeacher.number);
    }//GEN-LAST:event_jButtonEditActionPerformed

    private void jTextFieldNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNumberActionPerformed

    }//GEN-LAST:event_jTextFieldNumberActionPerformed

    private void jButtonNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewActionPerformed
        jTextFieldName.setEnabled(true);        
        jTextFieldSurname.setEnabled(true);
        jTextFieldBirth.setEnabled(true);  
        jTextFieldNumber.setEnabled(true);
    }//GEN-LAST:event_jButtonNewActionPerformed
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(addStudent.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addStudent.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addStudent.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addStudent.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                addTeacher dialog = new addTeacher(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEdit;
    private javax.swing.JButton jButtonNew;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JLabel jLabelBirth;
    private javax.swing.JLabel jLabelMajor;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelSurname;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableTeacher;
    private javax.swing.JTextField jTextFieldBirth;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldNumber;
    private javax.swing.JTextField jTextFieldSurname;
    // End of variables declaration//GEN-END:variables
}

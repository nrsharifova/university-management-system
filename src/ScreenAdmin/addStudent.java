package ScreenAdmin;

import ConnectionDB.ConnMySql;
import Table.Faculty;
import Table.Major;
import Table.Student;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class addStudent extends javax.swing.JDialog {

    private final ConnMySql conn;
    private List<Student> ListOfStudent;
    private final List<Faculty> ListOfFaculty;
    private final List<Major> ListOfMajor;
    private Student selectedStudent;

    public addStudent(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        conn = new ConnectionDB.ConnMySql();
        ListOfStudent = conn.GetAllStudent();
        FillTheTable(ListOfStudent);
        ListOfFaculty = conn.GetAllFaculty();
        for (Faculty fac : ListOfFaculty) {
            jComboBoxFaculty.addItem(fac.name);
        }
        ListOfMajor = conn.GetAllMajor();
        for (Major maj : ListOfMajor) {
            jComboBoxMajor.addItem(maj.name);
        }
    }

    public void FillTheTable(List<Student> list) { //get information from mysql and fill the table
        DefaultTableModel tmodel = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };
        tmodel.addColumn("Name");
        tmodel.addColumn("Surname");
        tmodel.addColumn("Birth");
        tmodel.addColumn("Faculty");
        tmodel.addColumn("Major");
        tmodel.addColumn("Password");

        jTableStudent.setModel(tmodel);

        for (Student stu : list) {
            tmodel.insertRow(jTableStudent.getRowCount(), new Object[]{
                stu.name, stu.surname, stu.birth, conn.GetFacultyByidFaculty(stu.idFaculty).name, conn.GetMajorByidMajor(stu.idMajor).name, stu.Password
            });
        }
        jTableStudent.setModel(tmodel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelName = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jComboBoxFaculty = new javax.swing.JComboBox();
        jTextFieldBirth = new javax.swing.JTextField();
        jLabelBirth = new javax.swing.JLabel();
        jTextFieldSurname = new javax.swing.JTextField();
        jLabelSurname = new javax.swing.JLabel();
        jLabelFaculty = new javax.swing.JLabel();
        jLabelMajor = new javax.swing.JLabel();
        jComboBoxMajor = new javax.swing.JComboBox();
        jButtonNew = new javax.swing.JButton();
        jButtonEdit = new javax.swing.JButton();
        jButtonSave = new javax.swing.JButton();
        jLabelBirth1 = new javax.swing.JLabel();
        jTextFieldPassword = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableStudent = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(230, 226, 226));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelName.setForeground(new java.awt.Color(10, 10, 61));
        jLabelName.setText("Name:");

        jTextFieldName.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jTextFieldName.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextFieldName.setDisabledTextColor(new java.awt.Color(255, 0, 0));
        jTextFieldName.setEnabled(false);

        jComboBoxFaculty.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jComboBoxFaculty.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jComboBoxFaculty.setEnabled(false);
        jComboBoxFaculty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxFacultyActionPerformed(evt);
            }
        });

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

        jLabelFaculty.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelFaculty.setForeground(new java.awt.Color(10, 10, 61));
        jLabelFaculty.setText("Faculty:");

        jLabelMajor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelMajor.setForeground(new java.awt.Color(10, 10, 61));
        jLabelMajor.setText("Major:");

        jComboBoxMajor.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jComboBoxMajor.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jComboBoxMajor.setEnabled(false);

        jButtonNew.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonNew.setForeground(new java.awt.Color(10, 10, 61));
        jButtonNew.setText("New");
        jButtonNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewActionPerformed(evt);
            }
        });

        jButtonEdit.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonEdit.setForeground(new java.awt.Color(10, 10, 61));
        jButtonEdit.setText("Edit");
        jButtonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditActionPerformed(evt);
            }
        });

        jButtonSave.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonSave.setForeground(new java.awt.Color(10, 10, 61));
        jButtonSave.setText("Save");
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });

        jLabelBirth1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelBirth1.setForeground(new java.awt.Color(10, 10, 61));
        jLabelBirth1.setText("Password:");

        jTextFieldPassword.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jTextFieldPassword.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextFieldPassword.setEnabled(false);
        jTextFieldPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelBirth1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jTextFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabelBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextFieldBirth, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabelSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextFieldSurname))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabelName, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextFieldName)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelMajor, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelFaculty, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonNew, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(10, 10, 10)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jComboBoxMajor, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBoxFaculty, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(6, 6, 6)))))
                .addContainerGap(19, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFaculty)
                    .addComponent(jComboBoxFaculty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelMajor)
                    .addComponent(jComboBoxMajor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelBirth1)
                    .addComponent(jTextFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNew)
                    .addComponent(jButtonEdit)
                    .addComponent(jButtonSave))
                .addGap(34, 34, 34))
        );

        jPanel2.setBackground(new java.awt.Color(230, 226, 226));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTableStudent.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jTableStudent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Surname", "Birth", "Faculty", "Major", "Password"
            }
        ));
        jScrollPane1.setViewportView(jTableStudent);
        if (jTableStudent.getColumnModel().getColumnCount() > 0) {
            jTableStudent.getColumnModel().getColumn(3).setMinWidth(100);
            jTableStudent.getColumnModel().getColumn(3).setPreferredWidth(100);
            jTableStudent.getColumnModel().getColumn(3).setMaxWidth(100);
            jTableStudent.getColumnModel().getColumn(4).setMinWidth(100);
            jTableStudent.getColumnModel().getColumn(4).setMaxWidth(100);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 558, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        if (jTextFieldName.getText().trim().length() > 0 && jTextFieldSurname.getText().trim().length() > 0 && jTextFieldBirth.getText().trim().length() > 0 && jTextFieldPassword.getText().trim().length() > 0) {
            int id = 0;      //it determine insupstudent is for edit or save
            if (selectedStudent != null) {
                id = selectedStudent.idStudent;
            }
            Student stu = new Student(id, jTextFieldName.getText(), jTextFieldSurname.getText(), jTextFieldBirth.getText(), ListOfFaculty.get(jComboBoxFaculty.getSelectedIndex()).idFaculty, ListOfMajor.get(jComboBoxMajor.getSelectedIndex()).idMajor, jTextFieldPassword.getText());
            conn.InsUpStudent(stu);
            clean();
            ListOfStudent = conn.GetAllStudent();
            selectedStudent = null;
            FillTheTable(ListOfStudent);
        }
    }//GEN-LAST:event_jButtonSaveActionPerformed

    private void jButtonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditActionPerformed
        jTextFieldName.setEnabled(true);
        jTextFieldSurname.setEnabled(true);
        jTextFieldBirth.setEnabled(true);
        jComboBoxFaculty.setEnabled(true);
        jComboBoxMajor.setEnabled(true);
        jTextFieldPassword.setEnabled(true);
        
        //we select row and information goes to textfields and we edit and save them, they go same row
        int selectedRow = jTableStudent.getSelectedRow();
        selectedStudent = ListOfStudent.get(selectedRow);
        jTextFieldName.setText(selectedStudent.name);
        jTextFieldSurname.setText(selectedStudent.surname);
        jTextFieldBirth.setText(selectedStudent.birth);
        jTextFieldPassword.setText(selectedStudent.Password);
        for (Faculty fclty : ListOfFaculty) {
            if (fclty.idFaculty == selectedStudent.idFaculty) {
                int x = ListOfFaculty.indexOf(fclty);
                jComboBoxFaculty.setSelectedIndex(x);
            }
        }
    }//GEN-LAST:event_jButtonEditActionPerformed

    private void jButtonNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewActionPerformed
        jTextFieldName.setEnabled(true);    //when we use new button these buttons enabled
        jTextFieldSurname.setEnabled(true);
        jTextFieldBirth.setEnabled(true);
        jComboBoxFaculty.setEnabled(true);
        jComboBoxMajor.setEnabled(true);
        jTextFieldPassword.setEnabled(true);
    }//GEN-LAST:event_jButtonNewActionPerformed

    private void jTextFieldBirthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBirthActionPerformed

    }//GEN-LAST:event_jTextFieldBirthActionPerformed

    private void jComboBoxFacultyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxFacultyActionPerformed

    }//GEN-LAST:event_jComboBoxFacultyActionPerformed

    private void jTextFieldPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPasswordActionPerformed
    public void clean() {    //clean textfield after save data
        jTextFieldName.setText(null);
        jTextFieldSurname.setText(null);
        jTextFieldBirth.setText(null);
        jTextFieldPassword.setText(null);
    }    public static void main(String args[]) {
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
                addStudent dialog = new addStudent(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox jComboBoxFaculty;
    private javax.swing.JComboBox jComboBoxMajor;
    private javax.swing.JLabel jLabelBirth;
    private javax.swing.JLabel jLabelBirth1;
    private javax.swing.JLabel jLabelFaculty;
    private javax.swing.JLabel jLabelMajor;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelSurname;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableStudent;
    private javax.swing.JTextField jTextFieldBirth;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldPassword;
    private javax.swing.JTextField jTextFieldSurname;
    // End of variables declaration//GEN-END:variables
}

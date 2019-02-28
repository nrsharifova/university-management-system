package ScreenAdmin;

import ConnectionDB.ConnMySql;
import Table.Student;
import Table.StudentLesson;
import Table.Lesson;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class addStudentLesson extends javax.swing.JDialog {

    private final ConnMySql conn;
    private List<StudentLesson> ListOfStudentLesson;
    private List<Student> ListOfStudent;
    private List<Lesson> ListOfLesson;
    private StudentLesson selectedStudentLesson;
    private Student selectedStudent;
    private List<StudentLesson> ListOfStudentLessons;
    private boolean update = false;

    public addStudentLesson(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        conn = new ConnectionDB.ConnMySql();
        ListOfStudentLesson = conn.GetAllStudentLesson();
        FillTheTable(ListOfStudentLesson);

        ListOfStudent = conn.GetAllStudent();
        for (Student stu : ListOfStudent) {
            jComboBoxStudent.addItem(stu.name);
        }
        update = true;       //for make buttons enable or disable
        updatecomboLesson();
        ButtonProperties(true, false, false);
        ComboboxProperties(false);
    }

    public void FillTheTable(List<StudentLesson> list) { //get information from mysql and fill the table
        DefaultTableModel tmodel = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tmodel.addColumn("Student");
        tmodel.addColumn("Lesson");

        jTableStudentLesson.setModel(tmodel);

        for (StudentLesson stule : list) {
            tmodel.insertRow(jTableStudentLesson.getRowCount(), new Object[]{
                conn.GetStudentByidStudent(stule.idStudent).name, conn.GetLessonByidLesson(stule.idLesson).name
            });
        }
        jTableStudentLesson.setModel(tmodel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelStudent = new javax.swing.JLabel();
        jLabelLesson = new javax.swing.JLabel();
        jComboBoxStudent = new javax.swing.JComboBox<>();
        jComboBoxLesson = new javax.swing.JComboBox<>();
        jButtonSave = new javax.swing.JButton();
        jButtonNew = new javax.swing.JButton();
        jButtonEdit = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableStudentLesson = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(230, 226, 226));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setPreferredSize(new java.awt.Dimension(259, 362));

        jLabelStudent.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelStudent.setForeground(new java.awt.Color(10, 10, 61));
        jLabelStudent.setText("Student:");

        jLabelLesson.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelLesson.setForeground(new java.awt.Color(10, 10, 61));
        jLabelLesson.setText("Lesson:");

        jComboBoxStudent.setEnabled(false);
        jComboBoxStudent.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxStudentItemStateChanged(evt);
            }
        });
        jComboBoxStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxStudentActionPerformed(evt);
            }
        });

        jComboBoxLesson.setEnabled(false);
        jComboBoxLesson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxLessonActionPerformed(evt);
            }
        });

        jButtonSave.setForeground(new java.awt.Color(10, 10, 61));
        jButtonSave.setText("Save");
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });

        jButtonNew.setForeground(new java.awt.Color(10, 10, 61));
        jButtonNew.setText("New");
        jButtonNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewActionPerformed(evt);
            }
        });

        jButtonEdit.setForeground(new java.awt.Color(10, 10, 61));
        jButtonEdit.setText("Edit");
        jButtonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditActionPerformed(evt);
            }
        });

        jButtonDelete.setText("Delete");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelStudent)
                            .addComponent(jLabelLesson))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxLesson, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxStudent, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(20, 20, 20))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonNew, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonEdit, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelStudent)
                    .addComponent(jComboBoxStudent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLesson)
                    .addComponent(jComboBoxLesson, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNew)
                    .addComponent(jButtonEdit)
                    .addComponent(jButtonSave))
                .addGap(10, 10, 10)
                .addComponent(jButtonDelete)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(230, 226, 226));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTableStudentLesson.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student", "Lesson"
            }
        ));
        jTableStudentLesson.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableStudentLessonMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableStudentLesson);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditActionPerformed
        //we select row and information goes to textfields and we edit and save them, they go same row
        int selectedRow = jTableStudentLesson.getSelectedRow();
        selectedStudentLesson = ListOfStudentLesson.get(selectedRow);
        for (Student stu : ListOfStudent) {
            if (stu.idStudent == selectedStudentLesson.idStudent) {
                int x = ListOfStudent.indexOf(stu);
                jComboBoxStudent.setSelectedIndex(x);
            }
        }
        ComboboxProperties(true);
        ButtonProperties(false, false, true);
    }//GEN-LAST:event_jButtonEditActionPerformed

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        int id = 0;         //it determine insupstudentlesson is for edit or save
        if (selectedStudentLesson != null) {
            id = selectedStudentLesson.idStudentLesson;
        }
        StudentLesson stule = new StudentLesson(id, ListOfStudent.get(jComboBoxStudent.getSelectedIndex()).idStudent, ListOfLesson.get(jComboBoxLesson.getSelectedIndex()).idLesson, 1, 1);
        conn.InsUpStudentLesson(stule);
        ListOfStudentLesson = conn.GetAllStudentLesson();
        selectedStudentLesson = null;
        FillTheTable(ListOfStudentLesson);
        jComboBoxLesson.removeAllItems();
        jComboBoxStudent.setSelectedIndex(0);
        ComboboxProperties(true);
        ButtonProperties(true, false, false);
    }//GEN-LAST:event_jButtonSaveActionPerformed
    //for make editable or disable buttons
    private void ButtonProperties(boolean NEW, boolean EDIT, boolean SAVE) {
        jButtonNew.setEnabled(NEW);
        jButtonEdit.setEnabled(EDIT);
        jButtonSave.setEnabled(SAVE);
    }

    private void ComboboxProperties(boolean done) {
        jComboBoxLesson.setEnabled(done);
        jComboBoxStudent.setEnabled(done);
    }
    private void jButtonNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewActionPerformed
        ComboboxProperties(true);
        ButtonProperties(false, false, true);
        updatecomboLesson();
    }//GEN-LAST:event_jButtonNewActionPerformed

    private void jComboBoxStudentItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxStudentItemStateChanged
        updatecomboLesson();
    }//GEN-LAST:event_jComboBoxStudentItemStateChanged
    // it is for set lessons to student for combobox which items are suit
    private void updatecomboLesson() {
        if (update) {
            int indexOfStudent = jComboBoxStudent.getSelectedIndex();
            selectedStudent = ListOfStudent.get(indexOfStudent);
            jComboBoxLesson.removeAllItems();
            ListOfLesson = conn.getLessonsForStudent(selectedStudent.idStudent);
            for (Lesson lesson : ListOfLesson) {
                jComboBoxLesson.addItem(lesson.name);
            }
        }
    }
    private void jComboBoxStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxStudentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxStudentActionPerformed

    private void jComboBoxLessonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxLessonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxLessonActionPerformed

    private void jTableStudentLessonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableStudentLessonMouseClicked
        ComboboxProperties(false);
        ButtonProperties(true, true, false);
    }//GEN-LAST:event_jTableStudentLessonMouseClicked

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        int selectedRow = jTableStudentLesson.getSelectedRow(); //we select row and delete it
        selectedStudentLesson = ListOfStudentLesson.get(selectedRow);
        conn.DelStudentLesson(selectedStudentLesson.idStudentLesson);
        ListOfStudentLesson = conn.GetAllStudentLesson();
        FillTheTable(ListOfStudentLesson);
    }//GEN-LAST:event_jButtonDeleteActionPerformed

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
            java.util.logging.Logger.getLogger(addStudentLesson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addStudentLesson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addStudentLesson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addStudentLesson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                addStudentLesson dialog = new addStudentLesson(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonEdit;
    private javax.swing.JButton jButtonNew;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JComboBox<String> jComboBoxLesson;
    private javax.swing.JComboBox<String> jComboBoxStudent;
    private javax.swing.JLabel jLabelLesson;
    private javax.swing.JLabel jLabelStudent;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableStudentLesson;
    // End of variables declaration//GEN-END:variables
}

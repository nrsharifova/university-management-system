package ScreenAdmin;

import ConnectionDB.ConnMySql;
import Table.Lesson;
import Table.Student;
import Table.StudentLesson;
import Table.StudentPoints;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.table.DefaultTableModel;

public class addStudentPoints extends javax.swing.JDialog {

    private final ConnMySql conn;
    private List<StudentPoints> ListOfStudentPoints;
    private final List<StudentLesson> ListOfStudentLesson;
    private final List<Student> ListOfStudent;
    private Map<Integer, Lesson> mapLessons;
    private List<Lesson> ListOfLesson = new ArrayList<>();
    private StudentPoints selectedStudentPoints;

    public addStudentPoints(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        conn = new ConnectionDB.ConnMySql();
        ListOfStudentPoints = conn.GetAllStudentPoints();

        mapLessons = new HashMap<>();
        for (Lesson les : conn.GetAllLesson()) {
            mapLessons.put(les.idLesson, les);
        }
        initComponents();
        FillTheTable(ListOfStudentPoints);
        ListOfStudentLesson = conn.GetAllStudentLesson();
        ListOfStudent = conn.GetAllStudent();
        for (Student stu : ListOfStudent) {
            jComboBoxStudent.addItem(stu.GetFullName());
        }

    }

    public void FillTheTable(List<StudentPoints> list) { //get information from mysql and fill the table
        DefaultTableModel tmodel = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };
        tmodel.addColumn("Student");
        tmodel.addColumn("Lesson");
        tmodel.addColumn("Midterm");
        tmodel.addColumn("Quiz");
        tmodel.addColumn("Activity");
        tmodel.addColumn("Final");
        tmodel.addColumn("Total");

        jTableStudentPoints.setModel(tmodel);

        for (StudentPoints stupo : list) {
            tmodel.insertRow(jTableStudentPoints.getRowCount(), new Object[]{
                conn.GetStudentByidStudent(stupo.idStudent).name, conn.GetLessonByidLesson(stupo.idLesson).name, stupo.Mid, stupo.Quiz, stupo.Activity, stupo.Fin, stupo.GetTotal()
            });
        }
        jTableStudentPoints.setModel(tmodel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelMidterm = new javax.swing.JLabel();
        jButtonSave = new javax.swing.JButton();
        jButtonNew = new javax.swing.JButton();
        jButtonEdit = new javax.swing.JButton();
        jTextFieldMidterm = new javax.swing.JTextField();
        jTextFieldQuiz = new javax.swing.JTextField();
        jLabelQuiz = new javax.swing.JLabel();
        jTextFieldActivity = new javax.swing.JTextField();
        jLabelActivity = new javax.swing.JLabel();
        jTextFieldFinal = new javax.swing.JTextField();
        jLabelFinal = new javax.swing.JLabel();
        jComboBoxStudent = new javax.swing.JComboBox<>();
        jComboBoxLesson = new javax.swing.JComboBox<>();
        jLabelStudent = new javax.swing.JLabel();
        jLabelLesson = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableStudentPoints = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setPreferredSize(new java.awt.Dimension(259, 362));

        jLabelMidterm.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelMidterm.setForeground(new java.awt.Color(10, 10, 61));
        jLabelMidterm.setText("Midterm:");

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

        jTextFieldMidterm.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextFieldMidterm.setEnabled(false);

        jTextFieldQuiz.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextFieldQuiz.setEnabled(false);

        jLabelQuiz.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelQuiz.setForeground(new java.awt.Color(10, 10, 61));
        jLabelQuiz.setText("Quiz:");

        jTextFieldActivity.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextFieldActivity.setEnabled(false);

        jLabelActivity.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelActivity.setForeground(new java.awt.Color(10, 10, 61));
        jLabelActivity.setText("Activity:");

        jTextFieldFinal.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextFieldFinal.setEnabled(false);
        jTextFieldFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFinalActionPerformed(evt);
            }
        });

        jLabelFinal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelFinal.setForeground(new java.awt.Color(10, 10, 61));
        jLabelFinal.setText("Final:");

        jComboBoxStudent.setEnabled(false);
        jComboBoxStudent.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxStudentItemStateChanged(evt);
            }
        });

        jComboBoxLesson.setEnabled(false);

        jLabelStudent.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelStudent.setForeground(new java.awt.Color(10, 10, 61));
        jLabelStudent.setText("Student:");

        jLabelLesson.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelLesson.setForeground(new java.awt.Color(10, 10, 61));
        jLabelLesson.setText("Lesson:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonNew, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jButtonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jButtonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(32, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelQuiz, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelMidterm, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelActivity)
                                    .addComponent(jLabelFinal)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelLesson, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldQuiz, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldActivity, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldMidterm, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxLesson, 0, 171, Short.MAX_VALUE)
                                    .addComponent(jComboBoxStudent, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelStudent)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabelLesson))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jComboBoxStudent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxLesson, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelMidterm)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextFieldMidterm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldQuiz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelQuiz))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldActivity, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelActivity))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelFinal))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSave)
                    .addComponent(jButtonNew)
                    .addComponent(jButtonEdit))
                .addGap(71, 71, 71))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTableStudentPoints.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student", "Lesson", "Midterm", "Quiz", "Activity", "Finall", "Total"
            }
        ));
        jScrollPane1.setViewportView(jTableStudentPoints);
        if (jTableStudentPoints.getColumnModel().getColumnCount() > 0) {
            jTableStudentPoints.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTableStudentPoints.getColumnModel().getColumn(1).setPreferredWidth(100);
            jTableStudentPoints.getColumnModel().getColumn(2).setPreferredWidth(15);
            jTableStudentPoints.getColumnModel().getColumn(3).setPreferredWidth(15);
            jTableStudentPoints.getColumnModel().getColumn(4).setPreferredWidth(15);
            jTableStudentPoints.getColumnModel().getColumn(5).setPreferredWidth(15);
            jTableStudentPoints.getColumnModel().getColumn(6).setPreferredWidth(15);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFinalActionPerformed

    }//GEN-LAST:event_jTextFieldFinalActionPerformed

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        if (jTextFieldMidterm.getText().trim().length() > 0 && jTextFieldQuiz.getText().trim().length() > 0 && jTextFieldActivity.getText().trim().length() > 0 && jTextFieldFinal.getText().trim().length() > 0) {
            int id = 0;      //it determine insupstudentpoints is for edit or save
            if (selectedStudentPoints != null) {
                id = selectedStudentPoints.idStudentPoints;
            }

            StudentPoints stupo = new StudentPoints(id,
                    ListOfStudent.get(jComboBoxStudent.getSelectedIndex()).idStudent,
                    ListOfLesson.get(jComboBoxLesson.getSelectedIndex()).idLesson,
                    Integer.parseInt(jTextFieldMidterm.getText()),
                    Integer.parseInt(jTextFieldQuiz.getText()),
                    Integer.parseInt(jTextFieldActivity.getText()),
                    Integer.parseInt(jTextFieldFinal.getText()), 1);
            conn.InsUpStudentPoints(stupo);
            clean();
            ListOfStudentPoints = conn.GetAllStudentPoints();
            selectedStudentPoints = null;
            FillTheTable(ListOfStudentPoints);
        }
    }//GEN-LAST:event_jButtonSaveActionPerformed
    public void clean() {    //clean textfield after save data
        jTextFieldMidterm.setText(null);
        jTextFieldQuiz.setText(null);
        jTextFieldActivity.setText(null);
        jTextFieldFinal.setText(null);
    }
    private void jButtonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditActionPerformed
        jTextFieldMidterm.setEnabled(true);
        jTextFieldQuiz.setEnabled(true);
        jTextFieldActivity.setEnabled(true);
        jTextFieldFinal.setEnabled(true);
        jComboBoxStudent.setEnabled(true);
        jComboBoxLesson.setEnabled(true);

        //we select row and information goes to textfields and we edit and save them, they go same row
        int selectedRow = jTableStudentPoints.getSelectedRow();
        selectedStudentPoints = ListOfStudentPoints.get(selectedRow);
        jTextFieldMidterm.setText(selectedStudentPoints.Mid + "");
        jTextFieldQuiz.setText(selectedStudentPoints.Quiz + "");
        jTextFieldActivity.setText(selectedStudentPoints.Activity + "");
        jTextFieldFinal.setText(selectedStudentPoints.Fin + "");
        for (Student stu : ListOfStudent) {
            if (stu.idStudent == selectedStudentPoints.idStudent) {
                int x = ListOfStudent.indexOf(stu);
                jComboBoxStudent.setSelectedIndex(x);
            }
        }
    }//GEN-LAST:event_jButtonEditActionPerformed

    private void jComboBoxStudentItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxStudentItemStateChanged
        jComboBoxLesson.removeAllItems();   //set lesson for selected lesson, we use map here, map gives suitable lesson to student
        ListOfLesson.removeAll(ListOfLesson);
        for (StudentLesson stule : ListOfStudentLesson) {
            if (stule.idStudent == ListOfStudent.get(jComboBoxStudent.getSelectedIndex()).idStudent) {
                ListOfLesson.add(mapLessons.get(stule.idLesson));
                jComboBoxLesson.addItem(mapLessons.get(stule.idLesson).name);
            }
        }
    }//GEN-LAST:event_jComboBoxStudentItemStateChanged

    private void jButtonNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewActionPerformed
        jTextFieldMidterm.setEnabled(true); //when we use new button these buttons enabled
        jTextFieldQuiz.setEnabled(true);
        jTextFieldActivity.setEnabled(true);
        jTextFieldFinal.setEnabled(true);
        jComboBoxStudent.setEnabled(true);
        jComboBoxLesson.setEnabled(true);
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
            java.util.logging.Logger.getLogger(addStudentPoints.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addStudentPoints.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addStudentPoints.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addStudentPoints.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                addStudentPoints dialog = new addStudentPoints(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox<String> jComboBoxLesson;
    private javax.swing.JComboBox<String> jComboBoxStudent;
    private javax.swing.JLabel jLabelActivity;
    private javax.swing.JLabel jLabelFinal;
    private javax.swing.JLabel jLabelLesson;
    private javax.swing.JLabel jLabelMidterm;
    private javax.swing.JLabel jLabelQuiz;
    private javax.swing.JLabel jLabelStudent;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableStudentPoints;
    private javax.swing.JTextField jTextFieldActivity;
    private javax.swing.JTextField jTextFieldFinal;
    private javax.swing.JTextField jTextFieldMidterm;
    private javax.swing.JTextField jTextFieldQuiz;
    // End of variables declaration//GEN-END:variables
}

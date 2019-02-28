package ScreenAdmin;

import ConnectionDB.ConnMySql;
import Table.Teacher;
import Table.TeacherLesson;
import Table.Lesson;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class addTeacherLesson extends javax.swing.JDialog {

    private final ConnMySql conn;
    private List<TeacherLesson> ListOfTeacherLesson;
    private final List<Teacher> ListOfTeacher;
    private final List<Lesson> ListOfLesson;
    private TeacherLesson selectedTeacherLesson;

    public addTeacherLesson(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        conn = new ConnectionDB.ConnMySql();
        ListOfTeacherLesson = conn.GetAllTeacherLesson();
        FillTheTable(ListOfTeacherLesson);

        ListOfTeacher = conn.GetAllTeacher();
        for (Teacher teac : ListOfTeacher) {
            jComboBoxTeacher.addItem(teac.name);
        }
        ListOfLesson = conn.GetAllLesson();
        for (Lesson les : ListOfLesson) {
            jComboBoxLesson.addItem(les.name);
        }
    }

    public void FillTheTable(List<TeacherLesson> list) {    //get information from mysql and fill the table
        DefaultTableModel tmodel = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };
        tmodel.addColumn("Teacher");
        tmodel.addColumn("Lesson");

        jTableTeacherLesson.setModel(tmodel);

        for (TeacherLesson tele : list) {
            tmodel.insertRow(jTableTeacherLesson.getRowCount(), new Object[]{
                conn.GetTeacherbyidTeacher(tele.idTeacher).name, conn.GetLessonByidLesson(tele.idLesson).name
            });
        }
        jTableTeacherLesson.setModel(tmodel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelTeacher = new javax.swing.JLabel();
        jLabelLesson = new javax.swing.JLabel();
        jComboBoxTeacher = new javax.swing.JComboBox<>();
        jComboBoxLesson = new javax.swing.JComboBox<>();
        jButtonSave = new javax.swing.JButton();
        jButtonNew = new javax.swing.JButton();
        jButtonEdit = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTeacherLesson = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(230, 226, 226));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setPreferredSize(new java.awt.Dimension(259, 362));

        jLabelTeacher.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelTeacher.setForeground(new java.awt.Color(10, 10, 61));
        jLabelTeacher.setText("Teacher:");

        jLabelLesson.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelLesson.setForeground(new java.awt.Color(10, 10, 61));
        jLabelLesson.setText("Lesson:");

        jComboBoxTeacher.setEnabled(false);

        jComboBoxLesson.setEnabled(false);

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonNew, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTeacher)
                            .addComponent(jLabelLesson))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxTeacher, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxLesson, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(20, 20, 20))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTeacher)
                    .addComponent(jComboBoxTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLesson)
                    .addComponent(jComboBoxLesson, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNew)
                    .addComponent(jButtonEdit)
                    .addComponent(jButtonSave))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(230, 226, 226));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTableTeacherLesson.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Teacher", "Lesson"
            }
        ));
        jScrollPane1.setViewportView(jTableTeacherLesson);

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
        jComboBoxTeacher.setEnabled(true);
        jComboBoxLesson.setEnabled(true);

        //we select row and information goes to textfields and we edit and save them, they go same row
        int selectedRow = jTableTeacherLesson.getSelectedRow();
        selectedTeacherLesson = ListOfTeacherLesson.get(selectedRow);
        for (Teacher teac : ListOfTeacher) {
            if (teac.idTeacher == selectedTeacherLesson.idTeacher) {
                int x = ListOfTeacher.indexOf(teac);
                jComboBoxTeacher.setSelectedIndex(x);
            }
        }
    }//GEN-LAST:event_jButtonEditActionPerformed

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        int id = 0;     // //it determine insupteacherlesson is for edit or save
        if (selectedTeacherLesson != null) {
            id = selectedTeacherLesson.idTeacherLesson;
        }
        TeacherLesson tele = new TeacherLesson(id, ListOfTeacher.get(jComboBoxTeacher.getSelectedIndex()).idTeacher, ListOfLesson.get(jComboBoxLesson.getSelectedIndex()).idLesson);
        conn.InsUpTeacherLesson(tele);
        ListOfTeacherLesson = conn.GetAllTeacherLesson();
        selectedTeacherLesson = null;
        FillTheTable(ListOfTeacherLesson);

    }//GEN-LAST:event_jButtonSaveActionPerformed

    private void jButtonNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewActionPerformed
        jComboBoxTeacher.setEnabled(true);
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
            java.util.logging.Logger.getLogger(addTeacherLesson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addTeacherLesson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addTeacherLesson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addTeacherLesson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                addTeacherLesson dialog = new addTeacherLesson(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox<String> jComboBoxTeacher;
    private javax.swing.JLabel jLabelLesson;
    private javax.swing.JLabel jLabelTeacher;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableTeacherLesson;
    // End of variables declaration//GEN-END:variables
}

package ScreenAdmin;

import ConnectionDB.ConnMySql;
import Table.Faculty;
import Table.Lesson;
import Table.Teacher;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class addLesson extends javax.swing.JDialog {

    private final ConnMySql conn;
    private List<Lesson> ListOfLesson;
    private final List<Faculty> ListOfFaculty;
    private final List<Teacher> ListOfTeacher;
    private Lesson selectedLesson;

    public addLesson(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        conn = new ConnectionDB.ConnMySql();
        ListOfLesson = conn.GetAllLesson();
        FillTheTable(ListOfLesson);
        
        ListOfTeacher = conn.GetAllTeacher();
        for (Teacher teac : ListOfTeacher) {
            jComboBoxTeacher.addItem(teac.name);
        }
        ListOfFaculty = conn.GetAllFaculty();
        for (Faculty fac : ListOfFaculty) {
            jComboBoxFaculty.addItem(fac.name);
        }
    }

    public void FillTheTable(List<Lesson> list) {
        DefaultTableModel tmodel = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };
        tmodel.addColumn("Name");
        tmodel.addColumn("Code");
        tmodel.addColumn("Teacher");
        tmodel.addColumn("Faculty");
        tmodel.addColumn("Credit");
        jTableLesson.setModel(tmodel);

        for (Lesson les : list) {
            tmodel.insertRow(jTableLesson.getRowCount(), new Object[]{
                les.name, les.code, conn.GetTeacherbyidTeacher(les.idTeacher).name, conn.GetFacultyByidFaculty(les.idFaculty).name, les.credit
            });
        }
        jTableLesson.setModel(tmodel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelName = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jComboBoxTeacher = new javax.swing.JComboBox();
        jTextFieldCredit = new javax.swing.JTextField();
        jLabelCredit = new javax.swing.JLabel();
        jTextFieldCode = new javax.swing.JTextField();
        jLabelCode = new javax.swing.JLabel();
        jLabelTeacher = new javax.swing.JLabel();
        jLabelFaculty = new javax.swing.JLabel();
        jComboBoxFaculty = new javax.swing.JComboBox();
        jButtonNew = new javax.swing.JButton();
        jButtonEdit = new javax.swing.JButton();
        jButtonSave = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableLesson = new javax.swing.JTable();

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

        jComboBoxTeacher.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jComboBoxTeacher.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jComboBoxTeacher.setEnabled(false);

        jTextFieldCredit.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jTextFieldCredit.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextFieldCredit.setEnabled(false);
        jTextFieldCredit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCreditActionPerformed(evt);
            }
        });

        jLabelCredit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelCredit.setForeground(new java.awt.Color(10, 10, 61));
        jLabelCredit.setText("Credit:");

        jTextFieldCode.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jTextFieldCode.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextFieldCode.setEnabled(false);

        jLabelCode.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelCode.setForeground(new java.awt.Color(10, 10, 61));
        jLabelCode.setText("Code:");

        jLabelTeacher.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelTeacher.setForeground(new java.awt.Color(10, 10, 61));
        jLabelTeacher.setText("Teacher:");

        jLabelFaculty.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelFaculty.setForeground(new java.awt.Color(10, 10, 61));
        jLabelFaculty.setText("Faculty:");

        jComboBoxFaculty.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jComboBoxFaculty.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jComboBoxFaculty.setEnabled(false);
        jComboBoxFaculty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxFacultyActionPerformed(evt);
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

        jButtonSave.setForeground(new java.awt.Color(10, 10, 61));
        jButtonSave.setText("Save");
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
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
                        .addComponent(jButtonNew, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabelCode, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextFieldCode))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabelName, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelFaculty, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelCredit, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jComboBoxFaculty, javax.swing.GroupLayout.Alignment.LEADING, 0, 134, Short.MAX_VALUE)
                            .addComponent(jComboBoxTeacher, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldCredit, javax.swing.GroupLayout.Alignment.LEADING))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelName)
                    .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCode)
                    .addComponent(jTextFieldCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTeacher)
                    .addComponent(jComboBoxTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelFaculty)
                    .addComponent(jComboBoxFaculty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCredit)
                    .addComponent(jTextFieldCredit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNew)
                    .addComponent(jButtonEdit)
                    .addComponent(jButtonSave))
                .addGap(85, 85, 85))
        );

        jPanel2.setBackground(new java.awt.Color(230, 226, 226));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTableLesson.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jTableLesson.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Code", "Teacher", "Faculty", "credit"
            }
        ));
        jScrollPane1.setViewportView(jTableLesson);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
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
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldCreditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCreditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCreditActionPerformed

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        if (jTextFieldName.getText().trim().length() > 0 && jTextFieldCode.getText().trim().length() > 0 && jTextFieldCredit.getText().trim().length() > 0) {
            int id = 0;
            if (selectedLesson != null) {
                id = selectedLesson.idLesson;
            }
            Lesson les = new Lesson(id, jTextFieldName.getText(), jTextFieldCode.getText(), ListOfTeacher.get(jComboBoxTeacher.getSelectedIndex()).idTeacher, ListOfFaculty.get(jComboBoxFaculty.getSelectedIndex()).idFaculty, Integer.parseInt(jTextFieldCredit.getText()));
            conn.InsUpLesson(les);
            clean();
            ListOfLesson = conn.GetAllLesson();
            selectedLesson = null;
            FillTheTable(ListOfLesson);
        }
    }//GEN-LAST:event_jButtonSaveActionPerformed
    public void clean() {
        jTextFieldName.setText(null);
        jTextFieldCode.setText(null);
        jTextFieldCredit.setText(null);
    }
    private void jButtonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditActionPerformed
        jTextFieldName.setEnabled(true);
        jTextFieldCode.setEnabled(true);
        jTextFieldCredit.setEnabled(true);
        jComboBoxFaculty.setEnabled(true);
        jComboBoxTeacher.setEnabled(true);

        int selectedRow = jTableLesson.getSelectedRow();
        selectedLesson = ListOfLesson.get(selectedRow);
        jTextFieldName.setText(selectedLesson.name);
        jTextFieldCode.setText(selectedLesson.code);
        jTextFieldCredit.setText(selectedLesson.credit + "");
        for (Teacher teac : ListOfTeacher) {
            if (teac.idTeacher == selectedLesson.idTeacher) {
                int x = ListOfTeacher.indexOf(teac);
                jComboBoxTeacher.setSelectedIndex(x);
            }
        }
    }//GEN-LAST:event_jButtonEditActionPerformed

    private void jComboBoxFacultyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxFacultyActionPerformed

    }//GEN-LAST:event_jComboBoxFacultyActionPerformed

    private void jButtonNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewActionPerformed
        jTextFieldName.setEnabled(true);
        jTextFieldCode.setEnabled(true);
        jTextFieldCredit.setEnabled(true);
        jComboBoxFaculty.setEnabled(true);
        jComboBoxTeacher.setEnabled(true);
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
            java.util.logging.Logger.getLogger(addLesson.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addLesson.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addLesson.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addLesson.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                addLesson dialog = new addLesson(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox jComboBoxTeacher;
    private javax.swing.JLabel jLabelCode;
    private javax.swing.JLabel jLabelCredit;
    private javax.swing.JLabel jLabelFaculty;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelTeacher;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableLesson;
    private javax.swing.JTextField jTextFieldCode;
    private javax.swing.JTextField jTextFieldCredit;
    private javax.swing.JTextField jTextFieldName;
    // End of variables declaration//GEN-END:variables
}

package ScreenStudent;

import ConnectionDB.ConnMySql;
import Table.Student;
import Table.StudentPoints;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class ScreenTranscript extends javax.swing.JDialog {

    private final ConnMySql conn;
    private final List<StudentPoints> ListOfPoints;

    public ScreenTranscript(java.awt.Frame parent, boolean modal, int idStudent) {
        super(parent, modal);
        initComponents();
        conn = new ConnectionDB.ConnMySql();
        ListOfPoints = conn.GetStudentPointsByidStudent(idStudent);
        FillTheTable(ListOfPoints);
        GetCreditsAndGPA();
    }
    //we take data from mysql which are not active and passed, or couldnt passed 60
    //but we calculate gpa and total credit for which lesson >=60
    public void GetCreditsAndGPA() { //get gpa and credit and calculate total
        int Credit = 0;
        int Points = 0;
        int FinalGPA = 0;

        for (StudentPoints lsp : ListOfPoints) {
            if (lsp.GetTotal() >= 60) {
                Credit = Credit + conn.GetLessonByidLesson(lsp.idLesson).credit;
                Points = Points + conn.GetLessonByidLesson(lsp.idLesson).credit * lsp.GetTotal();
            }
        }
        if (Credit > 0 && Points > 0) {
            FinalGPA = Points / Credit;
        }
        jTextFieldTotalCredit.setText("" + Credit);
        jTextFieldGpa.setText("" + FinalGPA);
    }

    public void FillTheTable(List<StudentPoints> list) { //get information from database and fill it to table
        DefaultTableModel tmodel = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tmodel.addColumn("Lesson");
        tmodel.addColumn("Credit");
        tmodel.addColumn("Total");

        jTableStudentPoints.setModel(tmodel);

        for (StudentPoints stupo : list) {  // set data for each columns
            tmodel.insertRow(jTableStudentPoints.getRowCount(), new Object[]{
                conn.GetLessonByidLesson(stupo.idLesson).name,
                conn.GetLessonByidLesson(stupo.idLesson).credit,
                stupo.Total
            });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableStudentPoints = new javax.swing.JTable();
        jLabelTotalCredit = new javax.swing.JLabel();
        jLabelGpa = new javax.swing.JLabel();
        jTextFieldTotalCredit = new javax.swing.JTextField();
        jTextFieldGpa = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(230, 226, 226));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTableStudentPoints.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Lesson", "Credit", "Total"
            }
        ));
        jScrollPane1.setViewportView(jTableStudentPoints);
        if (jTableStudentPoints.getColumnModel().getColumnCount() > 0) {
            jTableStudentPoints.getColumnModel().getColumn(1).setMinWidth(70);
            jTableStudentPoints.getColumnModel().getColumn(1).setPreferredWidth(70);
            jTableStudentPoints.getColumnModel().getColumn(1).setMaxWidth(70);
            jTableStudentPoints.getColumnModel().getColumn(2).setMinWidth(70);
            jTableStudentPoints.getColumnModel().getColumn(2).setPreferredWidth(70);
            jTableStudentPoints.getColumnModel().getColumn(2).setMaxWidth(70);
        }

        jLabelTotalCredit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelTotalCredit.setForeground(new java.awt.Color(10, 10, 61));
        jLabelTotalCredit.setText("Total Credit:");

        jLabelGpa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelGpa.setForeground(new java.awt.Color(10, 10, 61));
        jLabelGpa.setText(" GPA:");

        jTextFieldTotalCredit.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextFieldTotalCredit.setEnabled(false);
        jTextFieldTotalCredit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTotalCreditActionPerformed(evt);
            }
        });

        jTextFieldGpa.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextFieldGpa.setEnabled(false);
        jTextFieldGpa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldGpaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTotalCredit)
                    .addComponent(jLabelGpa))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldTotalCredit)
                    .addComponent(jTextFieldGpa, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTotalCredit)
                    .addComponent(jTextFieldTotalCredit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelGpa)
                    .addComponent(jTextFieldGpa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldTotalCreditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTotalCreditActionPerformed

    }//GEN-LAST:event_jTextFieldTotalCreditActionPerformed

    private void jTextFieldGpaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldGpaActionPerformed

    }//GEN-LAST:event_jTextFieldGpaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelGpa;
    private javax.swing.JLabel jLabelTotalCredit;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableStudentPoints;
    private javax.swing.JTextField jTextFieldGpa;
    private javax.swing.JTextField jTextFieldTotalCredit;
    // End of variables declaration//GEN-END:variables
}

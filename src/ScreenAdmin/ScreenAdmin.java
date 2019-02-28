package ScreenAdmin;

public class ScreenAdmin extends javax.swing.JFrame {

    public ScreenAdmin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonAddStudent = new javax.swing.JButton();
        jButtonAddTeacher = new javax.swing.JButton();
        jButtonAddLesson = new javax.swing.JButton();
        jLabelChoose = new javax.swing.JLabel();
        jButtonAddStudentLesson = new javax.swing.JButton();
        jButtonStudentPoints = new javax.swing.JButton();
        jLabelIcon = new javax.swing.JLabel();
        jButtonAddTeacherLesson = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(230, 226, 226));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButtonAddStudent.setBackground(new java.awt.Color(197, 197, 197));
        jButtonAddStudent.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonAddStudent.setForeground(new java.awt.Color(10, 10, 61));
        jButtonAddStudent.setText("Add Student");
        jButtonAddStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddStudentActionPerformed(evt);
            }
        });

        jButtonAddTeacher.setBackground(new java.awt.Color(197, 197, 197));
        jButtonAddTeacher.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonAddTeacher.setForeground(new java.awt.Color(10, 10, 61));
        jButtonAddTeacher.setText("Add Teacher");
        jButtonAddTeacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddTeacherActionPerformed(evt);
            }
        });

        jButtonAddLesson.setBackground(new java.awt.Color(197, 197, 197));
        jButtonAddLesson.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonAddLesson.setForeground(new java.awt.Color(10, 10, 61));
        jButtonAddLesson.setText("Add Lesson");
        jButtonAddLesson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddLessonActionPerformed(evt);
            }
        });

        jLabelChoose.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelChoose.setForeground(new java.awt.Color(32, 15, 82));
        jLabelChoose.setText("Choose:");

        jButtonAddStudentLesson.setBackground(new java.awt.Color(197, 197, 197));
        jButtonAddStudentLesson.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonAddStudentLesson.setForeground(new java.awt.Color(10, 10, 61));
        jButtonAddStudentLesson.setText("Add Lesson to Student");
        jButtonAddStudentLesson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddStudentLessonActionPerformed(evt);
            }
        });

        jButtonStudentPoints.setBackground(new java.awt.Color(197, 197, 197));
        jButtonStudentPoints.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonStudentPoints.setForeground(new java.awt.Color(10, 10, 61));
        jButtonStudentPoints.setText("Student's Points");
        jButtonStudentPoints.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonStudentPointsActionPerformed(evt);
            }
        });

        jLabelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ScreenAdmin/user-admin.png"))); // NOI18N

        jButtonAddTeacherLesson.setBackground(new java.awt.Color(197, 197, 197));
        jButtonAddTeacherLesson.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonAddTeacherLesson.setForeground(new java.awt.Color(10, 10, 61));
        jButtonAddTeacherLesson.setText("Add Lesson to Teacher");
        jButtonAddTeacherLesson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddTeacherLessonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabelIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButtonAddStudent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonAddStudentLesson, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonAddLesson, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonStudentPoints, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonAddTeacher, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonAddTeacherLesson, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabelChoose)))
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelChoose)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonAddStudent)
                        .addGap(8, 8, 8)
                        .addComponent(jButtonAddTeacher)
                        .addGap(8, 8, 8)
                        .addComponent(jButtonAddLesson)
                        .addGap(8, 8, 8)
                        .addComponent(jButtonAddTeacherLesson)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addComponent(jButtonAddStudentLesson)
                        .addGap(8, 8, 8)
                        .addComponent(jButtonStudentPoints)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(21, 21, 21))
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
       
        //there are 6 button and here we have write codes for to open new jdialog

    private void jButtonAddStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddStudentActionPerformed
        addStudent dialoq = new addStudent(this, rootPaneCheckingEnabled);
        dialoq.setVisible(rootPaneCheckingEnabled);
        System.out.println("working");
    }//GEN-LAST:event_jButtonAddStudentActionPerformed

    private void jButtonAddTeacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddTeacherActionPerformed
        addTeacher dialoq = new addTeacher(this, rootPaneCheckingEnabled);
        dialoq.setVisible(rootPaneCheckingEnabled);
        System.out.println("working");
    }//GEN-LAST:event_jButtonAddTeacherActionPerformed

    private void jButtonAddLessonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddLessonActionPerformed
        addLesson dialoq = new addLesson(this, rootPaneCheckingEnabled);
        dialoq.setVisible(rootPaneCheckingEnabled);
        System.out.println("working");
    }//GEN-LAST:event_jButtonAddLessonActionPerformed

    private void jButtonAddStudentLessonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddStudentLessonActionPerformed
        addStudentLesson dialoq = new addStudentLesson(this, rootPaneCheckingEnabled);
        dialoq.setVisible(rootPaneCheckingEnabled);
        System.out.println("working");
    }//GEN-LAST:event_jButtonAddStudentLessonActionPerformed

    private void jButtonStudentPointsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStudentPointsActionPerformed
        addStudentPoints dialoq = new addStudentPoints(this, rootPaneCheckingEnabled);
        dialoq.setVisible(rootPaneCheckingEnabled);
        System.out.println("working");
    }//GEN-LAST:event_jButtonStudentPointsActionPerformed

    private void jButtonAddTeacherLessonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddTeacherLessonActionPerformed
        addTeacherLesson dialoq = new addTeacherLesson(this, rootPaneCheckingEnabled);
        dialoq.setVisible(rootPaneCheckingEnabled);
        System.out.println("working");
    }//GEN-LAST:event_jButtonAddTeacherLessonActionPerformed

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
            java.util.logging.Logger.getLogger(ScreenAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ScreenAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ScreenAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ScreenAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ScreenAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddLesson;
    private javax.swing.JButton jButtonAddStudent;
    private javax.swing.JButton jButtonAddStudentLesson;
    private javax.swing.JButton jButtonAddTeacher;
    private javax.swing.JButton jButtonAddTeacherLesson;
    private javax.swing.JButton jButtonStudentPoints;
    private javax.swing.JLabel jLabelChoose;
    private javax.swing.JLabel jLabelIcon;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

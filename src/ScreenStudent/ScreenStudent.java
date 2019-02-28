package ScreenStudent;

import Table.Student;

public class ScreenStudent extends javax.swing.JFrame {

    Student stu;

    public ScreenStudent(Student stu) {
        initComponents();
        this.stu = stu;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelIcon = new javax.swing.JLabel();
        jLabelChoose = new javax.swing.JLabel();
        jButtonPersonal = new javax.swing.JButton();
        jButtonOpened = new javax.swing.JButton();
        jButtonTranscript = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(230, 226, 226));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setForeground(new java.awt.Color(10, 10, 61));

        jLabelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ScreenStudent/1482857082_Studentz.png"))); // NOI18N

        jLabelChoose.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelChoose.setForeground(new java.awt.Color(10, 10, 61));
        jLabelChoose.setText("Choose:");

        jButtonPersonal.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButtonPersonal.setForeground(new java.awt.Color(10, 10, 61));
        jButtonPersonal.setText("Personal Information");
        jButtonPersonal.setMaximumSize(new java.awt.Dimension(103, 23));
        jButtonPersonal.setMinimumSize(new java.awt.Dimension(103, 23));
        jButtonPersonal.setPreferredSize(new java.awt.Dimension(161, 23));
        jButtonPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPersonalActionPerformed(evt);
            }
        });

        jButtonOpened.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButtonOpened.setForeground(new java.awt.Color(10, 10, 61));
        jButtonOpened.setText("Opened Lesson");
        jButtonOpened.setPreferredSize(new java.awt.Dimension(119, 23));
        jButtonOpened.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOpenedActionPerformed(evt);
            }
        });

        jButtonTranscript.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButtonTranscript.setForeground(new java.awt.Color(10, 10, 61));
        jButtonTranscript.setText("Transcript");
        jButtonTranscript.setPreferredSize(new java.awt.Dimension(161, 23));
        jButtonTranscript.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTranscriptActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabelIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButtonPersonal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonTranscript, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonOpened, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabelChoose)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabelIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabelChoose)
                        .addGap(26, 26, 26)
                        .addComponent(jButtonPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(jButtonOpened, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(jButtonTranscript, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
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
        //there are 3 button and here we have write codes for to open new jdialog

    private void jButtonPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPersonalActionPerformed
        ScreenPersonal dialoq = new ScreenPersonal(this, rootPaneCheckingEnabled, stu);
        dialoq.setVisible(rootPaneCheckingEnabled);
        System.out.println("working"); 
    }//GEN-LAST:event_jButtonPersonalActionPerformed

    private void jButtonOpenedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOpenedActionPerformed
        ScreenOpened dialoq = new ScreenOpened(this, rootPaneCheckingEnabled,stu.idStudent);
        dialoq.setVisible(rootPaneCheckingEnabled);
        System.out.println("working");
    }//GEN-LAST:event_jButtonOpenedActionPerformed

    private void jButtonTranscriptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTranscriptActionPerformed
        ScreenTranscript dialoq = new ScreenTranscript(this, rootPaneCheckingEnabled, stu.idStudent);
        dialoq.setVisible(rootPaneCheckingEnabled);
        System.out.println("working");
    }//GEN-LAST:event_jButtonTranscriptActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonOpened;
    private javax.swing.JButton jButtonPersonal;
    private javax.swing.JButton jButtonTranscript;
    private javax.swing.JLabel jLabelChoose;
    private javax.swing.JLabel jLabelIcon;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

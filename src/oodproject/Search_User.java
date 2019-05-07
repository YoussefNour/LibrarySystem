/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oodproject;

/**
 *
 * @author Ahmed Bahaa
 */
public class Search_User extends javax.swing.JFrame {

    /**
     * Creates new form Search_User
     */
    String UserID;
    private search_user_controller searchC2;
    private UserDB ub;
    private home myHome;
    public Search_User(UserDB ub, search_user_controller searchC2, home myHome) {
        this.ub = ub;
        this.searchC2 = searchC2;
        this.myHome = myHome;
        this.setBounds(350, 100, 641, 557);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        BookNamelabel = new javax.swing.JLabel();
        userIdText = new javax.swing.JTextField();
        searchBTN = new javax.swing.JButton();
        exitBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Bell MT", 1, 48)); // NOI18N
        jLabel1.setText("Search User");

        BookNamelabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        BookNamelabel.setText("User ID:");

        userIdText.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        searchBTN.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        searchBTN.setText("Search");
        searchBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBTNActionPerformed(evt);
            }
        });

        exitBTN.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        exitBTN.setText("EXIT");
        exitBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BookNamelabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(searchBTN)
                                .addGap(71, 71, 71)
                                .addComponent(exitBTN))
                            .addComponent(userIdText, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BookNamelabel)
                    .addComponent(userIdText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchBTN)
                    .addComponent(exitBTN))
                .addGap(50, 50, 50))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBTNActionPerformed
        UserID = userIdText.getText();
        this.setVisible(false);
        Search_User_Viewer sb = new Search_User_Viewer(ub, searchC2, myHome,UserID);
        sb.showFrame();
    }//GEN-LAST:event_searchBTNActionPerformed

    private void exitBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exitBTNActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BookNamelabel;
    private javax.swing.JButton exitBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton searchBTN;
    private javax.swing.JTextField userIdText;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import Model.Broker;
import Model.BrokerDirectory;
import Model.Student;
import Model.StudentDirectory;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import UI.ViewBrokers;
import java.awt.CardLayout;
import java.util.ArrayList;
import static java.util.Collections.list;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Evita Alice Paul
 */

  
public class StudentView extends javax.swing.JFrame {

    /**
     * Creates new form StudentView
     */

  
    public StudentView() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
        setTitle("Student Housing");
    
      
  
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SplitPane = new javax.swing.JSplitPane();
        jPanel3 = new javax.swing.JPanel();
        btnbrokers = new javax.swing.JButton();
        btnapartment = new javax.swing.JButton();
        btnroommate = new javax.swing.JButton();
        btnreportissue = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnlogout = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SplitPane.setBackground(new java.awt.Color(0, 204, 204));

        jPanel3.setBackground(new java.awt.Color(0, 204, 204));

        btnbrokers.setFont(new java.awt.Font("Segoe UI Black", 3, 12)); // NOI18N
        btnbrokers.setText("View Brokers");
        btnbrokers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbrokersActionPerformed(evt);
            }
        });

        btnapartment.setFont(new java.awt.Font("Segoe UI Black", 3, 12)); // NOI18N
        btnapartment.setText("Apartment Listings");
        btnapartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnapartmentActionPerformed(evt);
            }
        });

        btnroommate.setFont(new java.awt.Font("Segoe UI Black", 3, 12)); // NOI18N
        btnroommate.setText("Roommate Search");

        btnreportissue.setFont(new java.awt.Font("Segoe UI Black", 3, 12)); // NOI18N
        btnreportissue.setText("Report an Issue");
        btnreportissue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreportissueActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI Black", 3, 12)); // NOI18N
        jButton1.setText("Temporary Accomodation");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnlogout.setFont(new java.awt.Font("Segoe UI Black", 3, 12)); // NOI18N
        btnlogout.setText("Logout");
        btnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnroommate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnapartment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnreportissue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnbrokers, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(btnlogout)))
                .addGap(30, 30, 30))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(btnbrokers)
                .addGap(37, 37, 37)
                .addComponent(btnapartment)
                .addGap(36, 36, 36)
                .addComponent(btnroommate)
                .addGap(37, 37, 37)
                .addComponent(jButton1)
                .addGap(34, 34, 34)
                .addComponent(btnreportissue)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 314, Short.MAX_VALUE)
                .addComponent(btnlogout)
                .addGap(71, 71, 71))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnapartment, btnbrokers, btnreportissue, btnroommate});

        SplitPane.setLeftComponent(jPanel3);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Evita Alice Paul\\Downloads\\student veedu.gif")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(180, 120, 800, 600);

        SplitPane.setRightComponent(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnbrokersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbrokersActionPerformed
        
        ViewBrokers viewbrokers = new ViewBrokers();
        SplitPane.setRightComponent(viewbrokers);
     
       
    }//GEN-LAST:event_btnbrokersActionPerformed

    private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoutActionPerformed
        // TODO add your handling code here:
         setVisible(false);
    }//GEN-LAST:event_btnlogoutActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnreportissueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreportissueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnreportissueActionPerformed

    private void btnapartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnapartmentActionPerformed
        // TODO add your handling code here:
         ViewApartmentlistings viewapartmentlistings = new ViewApartmentlistings();
        SplitPane.setRightComponent(viewapartmentlistings);
        
    }//GEN-LAST:event_btnapartmentActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(StudentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentView().setVisible(true);
            }
            
           
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSplitPane SplitPane;
    private javax.swing.JButton btnapartment;
    private javax.swing.JButton btnbrokers;
    private javax.swing.JButton btnlogout;
    private javax.swing.JButton btnreportissue;
    private javax.swing.JButton btnroommate;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables

}

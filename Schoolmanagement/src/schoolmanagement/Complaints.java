/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolmanagement;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import static jdk.nashorn.internal.objects.NativeString.trim;
import static schoolmanagement.MainMenu.options1;

/**
 *
 * @author Craylest
 */
public class Complaints extends javax.swing.JFrame {

    /**
     * Creates new form Complaints
     */
    public Complaints() {
        initComponents();
        Update();
    }
    
    public void Update()
    {
        JL_Header.setVisible(options1.topic);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        JL_Header = new javax.swing.JLabel();
        Submit_button = new javax.swing.JButton();
        View_button = new javax.swing.JButton();
        TF_topic = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TA_body = new javax.swing.JTextArea();
        Write_button = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 520));

        jButton1.setText("Back");
        jButton1.setToolTipText("Back to Mainmenu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        JL_Header.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        JL_Header.setText("Complaints");

        Submit_button.setText("Submit");
        Submit_button.setToolTipText("Submit your complaint");
        Submit_button.setEnabled(false);
        Submit_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Submit_buttonActionPerformed(evt);
            }
        });

        View_button.setText("View");
        View_button.setToolTipText("View Complaints");
        View_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                View_buttonActionPerformed(evt);
            }
        });

        TF_topic.setEditable(false);
        TF_topic.setToolTipText("Write the topic of your complaint here");

        TA_body.setColumns(20);
        TA_body.setRows(5);
        TA_body.setToolTipText("Explain your problem briefly here");
        TA_body.setEnabled(false);
        jScrollPane1.setViewportView(TA_body);

        Write_button.setText("Write");
        Write_button.setToolTipText("Write a complaint");
        Write_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Write_buttonActionPerformed(evt);
            }
        });

        jLabel1.setText("Topic of complaint -");

        jLabel2.setText("Body of complaint -");

        jLabel3.setForeground(new java.awt.Color(0, 153, 0));
        jLabel3.setText("Hint : Please fill in the respective fields and submit, Your voice will be heard");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jButton1)
                .addGap(250, 250, 250)
                .addComponent(JL_Header, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 307, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Submit_button)
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TF_topic, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Write_button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(View_button)
                        .addGap(46, 46, 46))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(JL_Header)))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Write_button)
                    .addComponent(View_button))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TF_topic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(Submit_button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        TA_body.setText(" ");
        TF_topic.setText(" ");
        TA_body.setEnabled(false);
        TF_topic.setEnabled(false);
        this.setVisible(false);
        Schoolmanagement.main1.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Submit_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Submit_buttonActionPerformed
        // TODO add your handling code here:
        String a = trim(TF_topic.getText());
        String b = trim(TA_body.getText());
        if(a.isEmpty() && b.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Please Enter the Topic and Body of Your Complaint before Submitiing");
        }
        else if(a.isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Please Enter the topic before submiting");
        }
        else if(b.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Please Enter the Body of your complaint before submiting");
        }
        else
        {
            try
            {
                Class.forName("java.sql.DriverManager");    
                Connection con = (Connection)   
                     DriverManager.getConnection ("jdbc:mysql://localhost:3306/schoolmanagement","root","twist");
                Statement stmt = (Statement) con.createStatement();     
                String query="INSERT INTO complaints VALUES ('"+a+"','"+b+"');";     
                stmt.executeUpdate(query); 
            }
            catch(Exception e) //this block is executed in case of an exception 
            {   //Display an error message in the dialog box for an exception   
                JOptionPane.showMessageDialog (this, e.getMessage());  
            }            
            TF_topic.setEditable(false);
            TA_body.setEditable(false);
            TF_topic.setText(" ");
            TA_body.setText(" ");
            JOptionPane.showMessageDialog(this, "Thank you for bringing your problem to us. We will take action");
            Submit_button.setEnabled(false);
        }
    }//GEN-LAST:event_Submit_buttonActionPerformed

    private void Write_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Write_buttonActionPerformed
        // TODO add your handling code here:
        TA_body.setEditable(true);
        TF_topic.setEditable(true);
        Submit_button.setEnabled(true);
        TF_topic.setEnabled(true);
        TA_body.setEnabled(true);
        
    }//GEN-LAST:event_Write_buttonActionPerformed

    private void View_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_View_buttonActionPerformed
        // TODO add your handling code here:
        TF_topic.setText("");
        TA_body.setText("");
        TF_topic.setEditable(false);
        TA_body.setEditable(false);
    }//GEN-LAST:event_View_buttonActionPerformed

 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JL_Header;
    private javax.swing.JButton Submit_button;
    private javax.swing.JTextArea TA_body;
    private javax.swing.JTextField TF_topic;
    private javax.swing.JButton View_button;
    private javax.swing.JButton Write_button;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

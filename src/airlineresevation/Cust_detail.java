

package airlineresevation;

import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.filechooser.FileFilter;
public class Cust_detail extends javax.swing.JInternalFrame implements myvariables {
    JFileChooser fc;
    File myfile;
    String pic = "";
    
    public Cust_detail() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("CUSTOMER DETAILS");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Customer_ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 90, 28));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, 187, -1));

        jLabel2.setText("Customer_NAME");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, -1, -1));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, 187, -1));

        jLabel3.setText("Father_NAME");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, -1, -1));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, 187, -1));

        jLabel4.setText("Gender");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 66, -1));

        jLabel5.setText("D_O_B");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, -1, -1));

        jLabel6.setText("Address");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 330, 187, -1));

        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 460, -1, -1));

        buttonGroup4.add(jRadioButton3);
        jRadioButton3.setText("MALE");
        getContentPane().add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, -1, -1));

        buttonGroup4.add(jRadioButton4);
        jRadioButton4.setText("FEMALE");
        getContentPane().add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 230, -1, -1));
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 280, 143, -1));

        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 90, 120, 130));

        jButton2.setText("Choose Image");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 240, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/airlineresevation/images/No title(46).jpg"))); // NOI18N
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 240, 260));

        jLabel9.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        jLabel9.setText("ADD CUSTOMER DETAILS");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 300, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents
void generatecustid()
{
      try
            {
                 Connection myconnection;
               
                myconnection=DriverManager.getConnection(path+place, username, password);
                
                try
                {
                    String q="select max(custid) from custdetail";
                    PreparedStatement mystatement=myconnection.prepareStatement(q);
                    
                     ResultSet myresult=mystatement.executeQuery();
                
                      if(myresult.next())
                      {
                          int custid=myresult.getInt(1);
                          if(custid>0)
                          {
                          jTextField1.setText(String.valueOf(custid+1));
                          }
                         
                      
                       else
                         {
                          jTextField1.setText("100");
                         }
                            }
                   
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(rootPane, "Error in query due to"+e.getMessage(), "Error",JOptionPane.ERROR_MESSAGE);
                }
                finally
                {
                    myconnection.close();
                }
            }
        catch(Exception e)
        {
         e.printStackTrace();
         JOptionPane.showMessageDialog(rootPane, "Error in connection" +e.getMessage());
    }                          
}  
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
  String filename="";
                
        if(myfile!=null){
         filename = "images\\"+new Date().getTime() + "_" + myfile.getName();//Date.getTime() added for unique file name.
        int i;
        FileInputStream rd = null;
        FileOutputStream outs = null;
        try {

            rd = new FileInputStream(myfile);
            outs = new FileOutputStream(filename);//writing the new file in 'Images' folder, in the project

            byte[] b = new byte[2048];
            while ((i = rd.read(b)) > 0) {
                outs.write(b, 0, i);

            }
            JOptionPane.showMessageDialog(rootPane, "File saved");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "error" + e.getMessage());
        } finally {
            try {
                rd.close();
                outs.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "error in closing file" + e.getMessage());
            }
        }
        }else
        {
            filename="images\\default.JPG";
        
        }

        try
            {
                Connection myconnection;
                String path="jdbc:mysql://localhost/";
                String place="airlinedatabase";
                myconnection=DriverManager.getConnection(path+place, "root", "");
                
                try
                {
                    String q="insert into custdetail values(?,?,?,?,?,?,?)";
                    PreparedStatement mystatement=myconnection.prepareStatement(q);
                    mystatement.setString(1,jTextField1.getText());
                    mystatement.setString(2, jTextField2.getText());
                     mystatement.setString(3, jTextField3.getText());
                   if(jRadioButton3.isSelected())
                   {
                        mystatement.setString(4, "Male");
                   }
                   else if(jRadioButton4.isSelected())
                   {
                        mystatement.setString(4, "Female");
                   }
                   
                   SimpleDateFormat myformat=new SimpleDateFormat("yyyy-MM-dd");
                  String dob=myformat.format(jDateChooser1.getDate());
                   mystatement.setString(5,dob);
                   mystatement.setString(6, jTextArea1.getText());;
                     mystatement.setString(7, filename);;
                    mystatement.executeUpdate();
                    
                       jTextField2.setText("");
                          jTextField3.setText("");
                          buttonGroup4.clearSelection();
                          jDateChooser1.setDate(null);
                          jTextArea1.setText("");
                          generatecustid();
                    
                    
                    
                    JOptionPane.showMessageDialog(rootPane, "Customer details submitted", "Customer details", JOptionPane.INFORMATION_MESSAGE);
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(rootPane, "Error in query due to"+e.getMessage(), "Error",JOptionPane.ERROR_MESSAGE);
                }
                finally
                {
                    myconnection.close();
                }
            }
        catch(Exception e)
        {
         e.printStackTrace();
         JOptionPane.showMessageDialog(rootPane, "Error in connection" +e.getMessage());
    }                                      
           
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
    
               generatecustid();       
                    
    }//GEN-LAST:event_formInternalFrameActivated

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
        fc = new JFileChooser();

        fc.setFileFilter(new FileFilter() {

            @Override
            public boolean accept(File f) {
                if (f.isDirectory()) {
                    return true;
                }
                int pos = f.getName().lastIndexOf('.');
                if (pos == -1) {
                    return false;
                } else {
                    String extention = f.getName().substring(pos + 1);//saving the extension
                    String str[] = {"gif", "png", "jpg", "jpeg"};//allowed extentions
                    for (String allwd : str) {

                        if (extention.equalsIgnoreCase(allwd)) {
                            return true;
                        }
                    }
                    return false;
                }

            }

            @Override
            public String getDescription() {

                return "";
            }
        });
        int result = fc.showOpenDialog(null);

        if (result == JFileChooser.APPROVE_OPTION) {
            myfile = fc.getSelectedFile();

            try {
                jLabel7.setIcon(new ImageIcon(ImageIO.read(myfile)));
            } catch (IOException e) {
                JOptionPane.showMessageDialog(rootPane, "Error");
                e.printStackTrace();
            }
        }
                                  
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package airlineresevation;

import static airlineresevation.myvariables.password;
import static airlineresevation.myvariables.path;
import static airlineresevation.myvariables.place;
import static airlineresevation.myvariables.username;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HARMEET ARORA
 */
public class Ticket_Reser extends javax.swing.JInternalFrame implements myvariables {

    /**
     * Creates new form Ticket_Reser
     */
    public Ticket_Reser() {
        initComponents();
    }
      void generateticketno()
{
      try
            {
                 Connection myconnection;
               
                myconnection=DriverManager.getConnection(path+place, username, password);
                
                try
                {
                    String q="select max(tno) from treser";
                    PreparedStatement mystatement=myconnection.prepareStatement(q);
                    
                     ResultSet myresult=mystatement.executeQuery();
                
                      if(myresult.next())
                      {
                          int tno=myresult.getInt(1);
                          if(tno>0)
                          {
                          jTextField1.setText(String.valueOf(tno+1));
                          }
                         
                      
                       else
                         {
                          jTextField1.setText("10000");
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel20 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("TICKET RESERVATION");
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

        jLabel1.setText("SOURCE");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 32, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "select" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 29, 120, -1));

        jLabel2.setText("DESTINATION");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, -1, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "select" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 120, -1));

        jButton1.setText("SHOW");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, -1, -1));

        jLabel3.setText("Ticket_NUMBER");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 47, -1, -1));

        jLabel4.setText("Customer_ID");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 82, -1, -1));

        jLabel5.setText("Customer_NAME");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 131, -1, -1));

        jLabel6.setText("Father_NAME");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 169, -1, 22));

        jLabel7.setText("Gender");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 214, -1, -1));

        jLabel8.setText("D_O_B");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(762, 251, -1, -1));

        jLabel10.setText("ADDRESS");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 300, -1, -1));

        jLabel11.setText("Date_of_JOURNEY");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 510, -1, -1));

        jLabel12.setText("Flight_ID");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 390, -1, -1));

        jLabel13.setText("Seats");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 470, -1, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(909, 41, 154, -1));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(909, 79, 154, -1));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(909, 128, 154, -1));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(907, 170, 154, -1));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("MALE");
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(907, 210, -1, -1));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("FEMALE");
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(987, 210, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 300, 160, 80));
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 390, 164, -1));

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 490, 164, -1));

        jButton2.setText("BOOK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 610, 119, 36));

        jButton3.setText("SEARCH");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 80, -1, -1));
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 530, 166, -1));
        getContentPane().add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(907, 251, 156, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "FlightId", "FlightName", "Departure", "Date of Departure", "Flight Charges"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 659, 230));

        jLabel9.setText("Flight_Name");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 470, -1, -1));

        jLabel14.setText("Flight_Class");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 600, -1, -1));
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 490, 170, -1));
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 620, 170, -1));

        jLabel15.setText("Departure Time");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 430, -1, -1));
        getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 440, 170, 30));

        jLabel16.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N
        jLabel16.setText("            Select Flight from List Given Below");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 400, 50));

        jLabel17.setText("Flight Charges");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 560, 90, 20));
        getContentPane().add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 580, 170, -1));

        jButton4.setText("SEARCH BY NAME");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 130, -1, -1));

        jLabel18.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        jLabel18.setText("SEARCH BY NAME LIST");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, -1, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CUSTOMER ID", "NAME", "FATHER'S NAME", "GENDER", "DOB", "ADDRESS"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable2);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 650, 290));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/airlineresevation/images/No title(51).jpg"))); // NOI18N
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 650, 260, 40));

        jLabel19.setText("Amount");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 550, -1, -1));
        getContentPane().add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 570, 150, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try
            {
                Connection myconnection;
            
                myconnection=DriverManager.getConnection(path+place,username, password);
                
                try
                {
                    String q="select * from flightdetail where source=? and dest=?";
                    PreparedStatement mystatement=myconnection.prepareStatement(q);
                    mystatement.setString(1,jComboBox1.getSelectedItem().toString());
                    mystatement.setString(2,jComboBox2.getSelectedItem().toString());
                    ResultSet myresult=mystatement.executeQuery();
                     DefaultTableModel mymodel=(DefaultTableModel) jTable1.getModel();
                     mymodel.setNumRows(0);
                     if(myresult.next())
                    {
                     jScrollPane2.setVisible(true);
                     getContentPane().validate();
                       do
                       {
                        String flightid=myresult.getString("flighid");
                        String flightname=myresult.getString("flightname");
                        String departure=myresult.getString("dept");
                        String dod=myresult.getString("dod");
                        String flightcharges=myresult.getString("fligchrges");
                        
                        mymodel.addRow(new Object[]{flightid,flightname,departure,dod,flightcharges});
                    }
                       while(myresult.next());
                    }
                  else
                     {
                           jScrollPane2.setVisible(false);
                     getContentPane().validate();
                        JOptionPane.showMessageDialog(rootPane, "No Records ", "Error",JOptionPane.ERROR_MESSAGE); 
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
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
         try
            
            {
                Connection myconnection;
               
                myconnection=DriverManager.getConnection(path+place,username,password);
                
                try
                {
                    String q="insert into treser values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                    PreparedStatement mystatement=myconnection.prepareStatement(q);
                    mystatement.setString(1,jComboBox1.getSelectedItem().toString());
                    mystatement.setString(2,jComboBox2.getSelectedItem().toString());
                    mystatement.setString(3, jTextField1.getText());
                       mystatement.setString(4, jTextField2.getText());
                          mystatement.setString(5, jTextField3.getText());
                     mystatement.setString(6, jTextField4.getText());
                   if(jRadioButton1.isSelected())
                   {
                        mystatement.setString(7, "Male");
                   }
                   else if(jRadioButton2.isSelected())
                   {
                        mystatement.setString(7, "Female");
                   }
                   
                   SimpleDateFormat myformat=new SimpleDateFormat("yyyy-MM-dd");
                  String dob=myformat.format(jDateChooser2.getDate());
                   mystatement.setString(8,dob);
                   mystatement.setString(9, jTextArea1.getText());
                   mystatement.setString(10,jTextField6.getText());
                    mystatement.setString(11,jTextField9.getText());
                     mystatement.setString(12,jTextField5.getText());
                    
                      
                  
                  String dod=myformat.format(jDateChooser1.getDate());
                   mystatement.setString(13,dod);
                   mystatement.setString(14,jTextField10.getText());
                   mystatement.setString(15,jTextField8.getText());
                     mystatement.setString(16,jTextField7.getText());
                    mystatement.executeUpdate();
                    
                      JOptionPane.showMessageDialog(rootPane, "Data Registered....Now Pay for Reservation", "Pay",JOptionPane.INFORMATION_MESSAGE);
                         jComboBox1.setSelectedIndex(0);
                    jComboBox2.setSelectedIndex(0);
                    jTextField1.setText("");
                   jTextField2.setText("");
                    jTextField3.setText("");
                      jTextField4.setText("");
                     jTextField5.setText("");
                  jTextField6.setText("");
                    jTextField7.setText("");
                   jTextField8.setText("");
                 
                   jTextField9.setText("");
                     jTextField10.setText("");
                    
                     
                          buttonGroup1.clearSelection();
                          jDateChooser1.setDate(null);
                           jDateChooser2.setDate(null);
                          jTextArea1.setText("");
                          generateticketno();
               
                  Payment_Detadmin obj=new Payment_Detadmin();
                  parentframe.jDesktopPane1.add(obj);
                  obj.setVisible(true);
                  
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(rootPane, "Error in query due to" + e.getMessage(), "Error",JOptionPane.ERROR_MESSAGE);
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
            
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
    try
        {
              Connection myconnection;
               
                myconnection=DriverManager.getConnection(path+place, username, password);
                generateticketno();

            try
            {
                String q="select * from sourcetable";
                PreparedStatement mystatement=myconnection.prepareStatement(q);
                ResultSet myresult=mystatement.executeQuery();
                
                if(myresult.next())
                {
                    do
                    {
                        jComboBox1.addItem(myresult.getString("source"));
                    }
                    while(myresult.next());
                }
                 String p="select * from destination";
                PreparedStatement mystatement1=myconnection.prepareStatement(p);
                ResultSet myresult1=mystatement1.executeQuery();
                
                if(myresult1.next())
                {
                    do
                    {
                        jComboBox2.addItem(myresult1.getString("destination"));
                    }
                    while(myresult1.next());
                }
            
                  jScrollPane2.setVisible(false);
                  getContentPane().validate();
                  jScrollPane3.setVisible(false);
                  getContentPane().validate();
                       
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
    }//GEN-LAST:event_formInternalFrameActivated

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       try
            {
                Connection myconnection;
            
                myconnection=DriverManager.getConnection(path+place,username, password);
                
                try
                {
                    if(!jTextField2.getText().equals(""))
                    {   
                        
                           String q="select * from custdetail where custid=?";
                    PreparedStatement mystatement=myconnection.prepareStatement(q);
                    mystatement.setString(1,jTextField2.getText());
                    ResultSet myresult=mystatement.executeQuery();
                     if(myresult.next())
                    {
                     
                       jTextField3.setText(myresult.getString("custname"));
                         jTextField4.setText(myresult.getString("fname"));
                       
                          jDateChooser2.setDate(myresult.getDate("dob"));
                          jTextArea1.setText(myresult.getString("address"));
                    }
                   if(myresult.getString("gender").equals("Male"))
                   {
                      jRadioButton1.setSelected(true);
                   }
                   else 
                   {
                      jRadioButton2.setSelected(true);
                   }
                    }
                    else
                    {
                          JOptionPane.showMessageDialog(rootPane, "No Records", "Error",JOptionPane.ERROR_MESSAGE);
                    }
                     jScrollPane3.setVisible(false);
                     getContentPane().validate();
                  
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
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       int column=0;
       int row=jTable1.getSelectedRow();
       
       String flightid=jTable1.getValueAt(row, column).toString();
        try
            {
                Connection myconnection;
            
                myconnection=DriverManager.getConnection(path+place,username, password);
                
                try
                {
                    String q="select * from flightdetail where flighid=?";
                    PreparedStatement mystatement=myconnection.prepareStatement(q);
                    mystatement.setString(1,flightid);
                    ResultSet myresult=mystatement.executeQuery();
                     if(myresult.next())
                    {
                     
                       jTextField6.setText(myresult.getString("flighid"));
                         jTextField5.setText(myresult.getString("flightname"));
                       
                          jDateChooser1.setDate(myresult.getDate("dod"));
                          jTextField9.setText(myresult.getString("dept"));
                          jTextField10.setText(myresult.getString("fligchrges"));
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
       
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try
        {
            Connection myconnection;

            myconnection=DriverManager.getConnection(path+place,username, password);

            try
            {
                if(!jTextField3.getText().equals(""))
                {
                    String q="select * from custdetail where custname like ?";
                    PreparedStatement mystatement=myconnection.prepareStatement(q);
                    mystatement.setString(1,jTextField3.getText()+ "%");
                    ResultSet myresult=mystatement.executeQuery();
                    DefaultTableModel mymodel=(DefaultTableModel) jTable2.getModel();
                    mymodel.setNumRows(0);
                    if(myresult.next())
                    {

                        jScrollPane3.setVisible(true);
                        getContentPane().validate();
                        do
                        {
                            String custid=myresult.getString("custid");
                            String custname=myresult.getString("custname");
                            String address=myresult.getString("address");
                            String dob=myresult.getString("dob");
                            String fname=myresult.getString("fname");
                            String gender=myresult.getString("gender");
                            mymodel.addRow(new Object[]{custid,custname,fname,gender,dob,address});

                        }
                        while(myresult.next());

                    }
                }
                else
                {
                    jScrollPane3.setVisible(false);
                    getContentPane().validate();
                    JOptionPane.showMessageDialog(rootPane, "Wrong Customer ID/No Records", "Error",JOptionPane.ERROR_MESSAGE);
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
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        int column=0;
        int row=jTable2.getSelectedRow();

        String custid=jTable2.getValueAt(row, column).toString();
        try
        {
            Connection myconnection;

            myconnection=DriverManager.getConnection(path+place,username, password);

            try
            {
                String q="select * from custdetail where custid=?";
                PreparedStatement mystatement=myconnection.prepareStatement(q);
                mystatement.setString(1,custid);
                ResultSet myresult=mystatement.executeQuery();
                if(myresult.next())
                {
                    jTextField2.setText(myresult.getString("custid"));
                    jTextField3.setText(myresult.getString("custname"));
                    jTextField4.setText(myresult.getString("fname"));
                    if(myresult.getString("gender").equals("Male"))
                    {
                        jRadioButton1.setSelected(true);
                    }
                    else
                    {
                        jRadioButton2.setSelected(true);
                    }

                    jDateChooser2.setDate(myresult.getDate("dob"));
                    jTextArea1.setText(myresult.getString("address"));
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
    }//GEN-LAST:event_jTable2MouseClicked

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
           try
        {
            Connection myconnection;

            myconnection=DriverManager.getConnection(path+place,username, password);

            try
            {
                 int a=Integer.parseInt(jTextField7.getText());
        
        int b=Integer.parseInt(jTextField10.getText());
        int amount;
        amount=a*b;
        jTextField11.setText(String.valueOf(amount));
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
      

       
    }//GEN-LAST:event_jTextField7ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
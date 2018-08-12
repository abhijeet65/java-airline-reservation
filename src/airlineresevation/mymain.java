
package airlineresevation;

import static airlineresevation.myvariables.password;
import static airlineresevation.myvariables.path;
import static airlineresevation.myvariables.place;
import static airlineresevation.myvariables.username;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class mymain implements myvariables {

    
    public static void main(String[] args) 
    {
         try
            {
                 try 
                 {
                        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                        if ("Nimbus".equals(info.getName()))
                        {
                             javax.swing.UIManager.setLookAndFeel(info.getClassName());
                             break;
                         }
                }
             } 
                 catch (ClassNotFoundException ex) 
                 {
                     JOptionPane.showMessageDialog(null,"ERROR");
                 }
                Connection myconnection;
               
                myconnection=DriverManager.getConnection(path+place, username, password);
                try
                {
                    String q="select * from newuser";
                    PreparedStatement mystatement=myconnection.prepareStatement(q);
                    ResultSet myresult=mystatement.executeQuery();
                    if(myresult.next())
                    {
                        LOGIN obj=new LOGIN();
                        obj.setVisible(true);
                    }
                    else
                    {
                        NEWUSER obj=new NEWUSER();
                        obj.setVisible(true);
                    }
                   
                   
                  
                }
                catch(Exception e)
                {
                  System.out.print("Error occured due to"+e.getMessage());
                  e.printStackTrace();
                }
                finally
                {
                    myconnection.close();
                }
            }
        catch(Exception e)
        {
         e.printStackTrace();
         System.out.print("Error occured in connection due to"+e.getMessage());
    }
    
}
}

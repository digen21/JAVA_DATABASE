
//NOTE: ALL THE ABOVE METHOD CREATED ON PARTICLUAR BUTTON. IN OUR CASE THERE IS ("INSERT"--"UPDATE"--"DELETE"--"NEXT"--"PREVIOUS"--"FIRST"--"LAST")

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import sqlconnection.Sqlconnection;
import static javax.swing.JOptionPane.showMessageDialog;




public class entry extends javax.swing.JFrame {
            String uname = "root";
            String pwd = "Digenmore421";
            String url = "jdbc:mysql://localhost:3306/std";
           
           
    public entry() {
        initComponents();
        connect();     		//the name of the method "connect() created below" ... This is mandetory to intialize the components of the same method...
    }
    Connection c;
    PreparedStatement pat;
    Statement st = null;
    ResultSet rs;

    @SuppressWarnings("unchecked")
	
	
	
    //create method for the connection
      public void connect()
    {
        try
        {
           Class.forName("com.mysql.cj.jdbc.Driver");
           c = DriverManager.getConnection(url, uname, pwd);
           
		   
//..............................................................Mandetory Things..............................................................
           st = c.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
           rs = st.executeQuery("SELECT id, name FROM std1");
           
        } 
        catch (Exception e)
        {
            System.out.println(e);
        }
        }


//..............................................................FOR INSERTION OF DATA..............................................................
//..............................................................PERFORMED ON INSERT BUTTON.........................................................
 
  private void INSERTActionPerformed(java.awt.event.ActionEvent evt) {                                       
        
			try {
					//create statement...
                    Statement st = c.createStatement();
                    
					//write query...
					String que2 = "INSERT INTO std1 VALUES('"+id.getText()+"','"+name.getText()+"')"; 
                    
					//execute query...
					st.execute(que2);
                    
                    //to show message box...
                    showMessageDialog(null,"Inserted Record Successfull");
                    System.out.println("Record Updated");			//this will appear in netbeans's output...
                    
                }
				catch (SQLException ex)
				{
                    Logger.getLogger(entry.class.getName()).log(Level.SEVERE, null, ex);
                }
    }                               
	


	
//..............................................................FOR UPDATE DATA..............................................................	
//..............................................................PERFORMED ON UPDATE BUTTON...................................................
	
	
	  private void updateActionPerformed(java.awt.event.ActionEvent evt) {                                       
         
                try {
                   
                    Statement st = c.createStatement();
                    String que2 = "UPDATE  std1 SET name = ('"+name.getText()+"') WHERE id = ('"+id.getText()+"')"; 
                    st.execute(que2);
                    
                    
                    showMessageDialog(null,"Updated Record Successfull");
                    System.out.println("Record Updated");
                    
                } 
				catch (SQLException ex)
				{
                    Logger.getLogger(entry.class.getName()).log(Level.SEVERE, null, ex);
                }
    }                                      




//..............................................................FOR DELETION OF DATA..............................................................
//..............................................................PERFORMED ON DELETE BUTTON........................................................



 private void deleteActionPerformed(java.awt.event.ActionEvent evt) {                                       
       
                try {
                    
                    
                    Statement st = c.createStatement();
                    String que1 = "DELETE FROM std1 WHERE id = '"+id.getText()+"'"; 
                    st.execute(que1);
                    
                    
                    
                    showMessageDialog(null,"Deleted Record Successfull");
                    System.out.println("Record Deleted");
                    
                } 
				catch (SQLException ex)
				{
                    Logger.getLogger(entry.class.getName()).log(Level.SEVERE, null, ex);
                }
    }                       
	
	
	
	
//..............................................................TO SHOW FIRST COLUMN / DATABASE ENTERNED...............................................
//..............................................................PERFORMED ON FIRST BUTTON..............................................................


 private void firstActionPerformed(java.awt.event.ActionEvent evt) {                                      
         try 
                {
                    rs.first();						  //keyword / function
                    id.setText(rs.getString(1));     //first column
                    name.setText(rs.getString(2));	//second column
                } 
                catch (SQLException ex)
                {
                    Logger.getLogger(entry.class.getName()).log(Level.SEVERE, null, ex);
                }
    }                                     
	
	
	
	
//..............................................................TO SHOW THE RECORD OF NEXT COLUMN / DATABASE ENTERNED.................................
//..............................................................PERFORMED ON NEXT BUTTON..............................................................


private void nextActionPerformed(java.awt.event.ActionEvent evt) {                                     
        try 
                {
                    if(!rs.isLast())
                {
                        
                    
                    rs.next();
                    id.setText(rs.getString(1));
                    name.setText(rs.getString(2));
                } 
                }
                catch (SQLException ex)
                {
                    Logger.getLogger(entry.class.getName()).log(Level.SEVERE, null, ex);
                }
    }             



//..............................................................TO SHOW THE RECORD OF PREVIOUS COLUMN / DATABASE ENTERNED.................................
//..............................................................PERFORMED ON PREVIOUS BUTTON..............................................................	


  private void previousActionPerformed(java.awt.event.ActionEvent evt) {                                         
          try 
                {
                    if(!rs.isFirst())
                {
                        
                    
                    rs.previous();
                    id.setText(rs.getString(1));
                    name.setText(rs.getString(2));
                } 
                }
                catch (SQLException ex)
                {
                    Logger.getLogger(entry.class.getName()).log(Level.SEVERE, null, ex);
                }
    } 


//..............................................................TO SHOW THE RECORD OF LAST COLUMN / DATABASE ENTERNED.................................
//..............................................................PERFORMED ON LAST BUTTON..............................................................	


    private void lastActionPerformed(java.awt.event.ActionEvent evt) {                                     
        try 
                {
                    rs.last();
                    id.setText(rs.getString(1));
                    name.setText(rs.getString(2));
                } 
                catch (SQLException ex)
                {
                    Logger.getLogger(entry.class.getName()).log(Level.SEVERE, null, ex);
                }
    }              
	

	
//..............................................................TO SHOW ONLY SELECTED FIELD..............................................................	



//..............................................................PERFORMED ON INSERT RADIO BUTTON.................................................

	
	
  private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                              
       if(jRadioButton1.isSelected())
       {
           id.setEnabled(true);
           name.setEnabled(true);
           
       }
    }                                             


//..............................................................PERFORMED ON UPDATE RADIO BUTTON...........................................


	
    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                              
        if(jRadioButton2.isSelected())
       {
           id.setEnabled(true); 
           name.setEnabled(false);
       }
    } 

	

//..............................................................PERFORMED ON DELETE RADIO BUTTON........................................  
	

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                              
        if(jRadioButton3.isSelected())
       {
           id.setEnabled(true); 
           name.setEnabled(true);
       }
    }                      
	
	

//NOTE: ALL THE ABOVE METHOD CREATED ON PARTICLUAR BUTTON. IN OUR CASE THERE IS ("INSERT"--"UPDATE"--"DELETE"--"NEXT"--"PREVIOUS"--"FIRST"--"LAST")

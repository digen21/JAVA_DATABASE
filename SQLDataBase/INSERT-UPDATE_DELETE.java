
 //..............................................TO INSERT DATA..............................................
 
 private void INSERTActionPerformed(java.awt.event.ActionEvent evt) {                                       
         try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    c = DriverManager.getConnection(url, uname,pwd);
                   
                    Statement st = c.createStatement();
                    String que2 = "INSERT INTO std1 VALUES('"+id.getText()+"','"+name.getText()+"')"; 
                    st.execute(que2);
                    
                    
                    JOptionPane.showMessageDialog(this, que2);
                    System.out.println("Record Updated");
                    
                } catch (SQLException | ClassNotFoundException ex) {
                    Logger.getLogger(entry.class.getName()).log(Level.SEVERE, null, ex);
                }
    }      

//..............................................TO UPDATE DATA..............................................
 
	
	 private void updateActionPerformed(java.awt.event.ActionEvent evt) {                                       
         
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    c = DriverManager.getConnection(url, uname,pwd);
                   
                    Statement st = c.createStatement();
                    String que2 = "UPDATE SET std1 name = ('"+name.getText()+"') WHERE id = ('"+id.getText()+"')"; 
                    st.execute(que2);
                    
                    
                    JOptionPane.showMessageDialog(this, que2);
                    
                    System.out.println("Record Updated");
                    
                } catch (SQLException | ClassNotFoundException ex) {
                    Logger.getLogger(entry.class.getName()).log(Level.SEVERE, null, ex);
                }
    }                        
	


//..............................................TO DELETE DATA..............................................
 
 
 private void deleteActionPerformed(java.awt.event.ActionEvent evt) {                                       
       
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    c = DriverManager.getConnection(url, uname,pwd);
                    
                    
                    Statement st = c.createStatement();
                    String que1 = "DELETE FROM std1 WHERE id = '"+id.getText()+"'"; 
                    st.execute(que1);
                    
                    
                    
                    JOptionPane.showMessageDialog(this, que1);
                    System.out.println("Record Deleted");
                    
                } catch (SQLException | ClassNotFoundException ex) {
                    Logger.getLogger(entry.class.getName()).log(Level.SEVERE, null, ex);
                }
    }                                      
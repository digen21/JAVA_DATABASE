
package sqlconnection;
//.........................................Insert, Update, Delete...................................
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
public class Sqlconnection {

    public static void main(String[] args) throws SQLException {
       String uname = "root";
       String pwd = "Digenmore421";
       String url = "jdbc:mysql://localhost:3306/std";
       

       //create connection 
       Connection c = DriverManager.getConnection(url, uname,pwd);
        if(c != null)
        {
            System.out.println("Connected");
        }
        else
        {
            System.out.println("Not Connected");
        }
        
//---------------------------------------------------------------------------------        
        try     
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
           
         catch (ClassNotFoundException ex) {
            Logger.getLogger(Sqlconnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
//---------------------------------------------------------------------------------
        //create statement query
    
        Statement st = c.createStatement();
        
        String s = "INSERT INTO std VALUES(21, 'Digen')";
        //execute Statement
        st.execute(s);
        
        
        
    }
    
}

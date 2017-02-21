package jfldb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author Paul Holden
 */
public class DBConnect {

    /**
     * @param args the command line arguments
     */
    
    ResultSet rs;
    
    public ResultSet connect(String statment){
   // public static void main(String[] args) {
        // TODO code application logic here
        try{rs.close();}
        catch(Exception e){}
        
        try {
            String host = "jdbc:derby://localhost:1527/CW1";
            String username = "paul";
            String password = "admin";
            Connection con = DriverManager.getConnection(host, username, password );
            
            Statement stmt = con.createStatement( ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            
            String SQL = statment;
            rs = stmt.executeQuery( SQL );
                        
        }   
        catch(SQLException err){
            System.out.println(err.getMessage());
        }
        return rs;
    }
    
}

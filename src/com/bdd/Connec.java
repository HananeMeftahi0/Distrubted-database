
package com.bdd;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author hanane
 */

    public class Connec {
    public static Connection connectionDB(){
        try {
           Class.forName("org.postgresql.Driver");
              
            
            Connection conn2=DriverManager.getConnection("jdbc:postgresql://192.168.1.5:5432/postgres","postgres","123456789");
              
            System.out.println("Connected to distant database");
            return conn2;
            
        } catch (Exception ex) {
                  System.out.println("Not Connected");
            return null;
        }
            
        
    }
    
       public static Connection connectionDB2(){
        try {
           Class.forName("org.postgresql.Driver");
              Connection conn=DriverManager.getConnection("jdbc:postgresql://localhost:5432/factures_commandes","postgres","123456789"); 
            
       
              
            System.out.println("Connected to local database");
            return conn;
            
        } catch (Exception ex) {
                  System.out.println("Not Connected");
            return null;
        }
            
        
    }
  
    
}
    


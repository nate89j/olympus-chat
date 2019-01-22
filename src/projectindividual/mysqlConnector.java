/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectindividual;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Nat;
 */
public class mysqlConnector {
    
    public static Connection connect() throws SQLException {
        String urlIndivid = "jdbc:mysql://localhost:3306/ind_db";
        String user = "root";
        String password = "6789";
        
        return DriverManager.getConnection(urlIndivid, user, password);
    }
    
    
    
}

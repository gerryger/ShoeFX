/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoefx.db;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author user
 */
public class DBConnection {
    private Connection conn;

    public DBConnection() {
    }
    
    public Connection connect(){
        if(conn == null){
            try{
                Class.forName("com.mysql.jdbc.Driver");
            
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb2", "root", "");
                
                
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        return conn;
    }
}

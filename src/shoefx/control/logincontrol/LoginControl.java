/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoefx.control.logincontrol;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import shoefx.db.DBConnection;

/**
 *
 * @author user
 */
public class LoginControl {
    private DBConnection conn;
    
    public void dbLogin(String username, String password){
        conn = new DBConnection();
        
        String sql = "SELECT * FROM USER WHERE USERNAME  = ? AND PASSWORD = ? ";
        PreparedStatement ps;
        
        try{
            ps = conn.connect().prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);
            
            ResultSet rs = ps.executeQuery();
            
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

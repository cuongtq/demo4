/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CuongTQ
 */
public class DBProcess {
    public Connection getConnection(){
        Connection conn= null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String user = "sa";
            String pass = "123456";
            String url = "jdbc:sqlserver://127.0.0.1:1433;databaseName=ser";
            conn = DriverManager.getConnection(url,user,pass);
        }
        catch (SQLException ex)
        {
            Logger.getLogger(DBProcess.class.getName()).log(Level.SEVERE, null,ex);
        }
        catch (ClassNotFoundException ex) {
            Logger.getLogger(DBProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }
    public  List<String> getNames(){
        List<String> names = new ArrayList<>();
        String sql="select _name from tblCom";
        try {
            ResultSet rs = getConnection().createStatement().executeQuery(sql);
            while(rs.next()){
                names.add(rs.getString(1));
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(DBProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return names;
                
    }
    

}

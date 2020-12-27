/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package signinform;
import java.sql.*;

/**
 *
 * @author Administrator
 */
public class main {
    static String url="jdbc:mysql://localhost:3306/sakila";
    static String user="root";
    static String pass="aman";
    public static Connection connectDB(){
        Connection conn=null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn=DriverManager.getConnection(url,user,pass);
            return conn;
        }catch(Exception ex){
            System.out.println("there were errors while connecting to db.");
            return null;
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodinventory;

/**
 *
 * @author 91912
 */
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class FoodInventory {
    public static Connection con;
    public static Statement st;
    /**
     * @param args the command line arguments
     */
    public FoodInventory()
    {
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        String user="root";
        String passwd="aman";
        String url="jdbc:mysql://localhost:3306/sakila";
        String q1="create table if not exists categTable(Category VARCHAR(20),Items varchar(20))";
        
         con=DriverManager.getConnection(url,user,"aman");
    st=con.createStatement();
   st.executeUpdate(q1);
   Invenotory inv=new Invenotory();
   inv.setTitle("The Central Inventory");
   inv.setVisible(true);}
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        Class.forName("com.mysql.cj.jdbc.Driver");
        String user="root";
        String passwd="aman";
        String url="jdbc:mysql://localhost:3306/sakila";
        String q1="create table if not exists categTable(Category VARCHAR(20),Items varchar(20))";
        
         con=DriverManager.getConnection(url,user,"aman");
    st=con.createStatement();
   st.executeUpdate(q1);
   Invenotory inv=new Invenotory();
   inv.setVisible(true);
   
   
   
   
        
        
    }
    
}

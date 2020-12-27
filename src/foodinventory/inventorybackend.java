/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodinventory;


/**
 *
 * @author 91912
 */import java.sql.*;
public class inventorybackend {
    Connection con;
 Statement st;
    ResultSet rs;
    String cat[];
    String items[];
    String mod[];
    String price[];
    String quan[];
    int k;
    public inventorybackend()
    {k=0;
    cat=new String[90];
    items=new String[90];
    mod=new String[90];
    price=new String[90];
    quan=new String[90];
    try{
    Class.forName("com.mysql.cj.jdbc.Driver");
        String user="root";
        String passwd="aman";
        String url="jdbc:mysql://localhost:3306/sakila";
        
        con=DriverManager.getConnection(url,user,"aman");
    }
    catch(Exception e)
    {System.out.println("Failed to Connect");
    }
    }

    public void table_update1(String table_name)
    {
        try{
            String q1="select * from "+table_name;
            PreparedStatement st=con.prepareStatement(q1);
            rs=st.executeQuery();
            k=0;
            while(rs.next())
            {
                mod[k]=rs.getString("Model");
                quan[k]=rs.getString("Quantity");
                price[k]=rs.getString("Price");
                k++;
            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
        
    public void table_update(String table_name)    {
        try{
            System.out.println(table_name);
         String q1="select * from "+table_name;
         
  PreparedStatement st=con.prepareStatement(q1.trim());
 System.out.println(st);
   rs=st.executeQuery();
   k=0;
   while(rs.next())
   {
    cat[k]=rs.getString("Category");
    items[k]=rs.getString("Items");
    k++;
       
   }
   
        }
        catch(Exception e)
        {System.out.println(e.getMessage()+"hello");
        }
    
         
   }
    public void delete_category(String Cat1)

    {
        try{
        String q1="delete  from categTable where Category = ?";
       PreparedStatement st1=con.prepareStatement(q1);
       st1.setString(1,Cat1);
        st1.execute();
        
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    public void delete_category1(String table_name,String model,String quant,String price)
    {
         try{
        String q1="delete  from "+table_name+" where Model = ?,Quantity,Price=?";
       PreparedStatement st1=con.prepareStatement(q1);
       st1.setString(1,model);
       st1.setString(2,quant);
       st1.setString(3,price);
        st1.execute();
        
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
            
        
    }


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
import foodinventory.inventorybackend.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Invenotory extends javax.swing.JFrame {
static inventorybackend inv;
Connection con;

 DefaultTableModel dm;
    /**
     * Creates new form Invenotory
     */
    public Invenotory() {
        initComponents();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        String user="root";
        String passwd="aman";
        String url="jdbc:mysql://localhost:3306/sakila";
        
        con=DriverManager.getConnection(url,user,"aman");
       inv=new inventorybackend();
       String s="categtable";
       inv.table_update(s);
       System.out.println(inv.k);
                for(int i=0;i<inv.k;i++)
                {
                    String set[]={inv.cat[i],inv.items[i]};
                     dm=(DefaultTableModel)Category_table.getModel();
                    dm.addRow(set);
                }
        
        
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Category_table = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        update_entry = new javax.swing.JButton();
        Add_category = new javax.swing.JButton();
        Categoryfield = new javax.swing.JTextField();
        itemfield = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Model = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        search = new javax.swing.JButton();
        Load = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Category_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CATEGORY", "ITEMS"
            }
        ));
        Category_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Category_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Category_table);

        jButton2.setText("DELETE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        update_entry.setText("UPDATE");
        update_entry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_entryActionPerformed(evt);
            }
        });

        Add_category.setText("ADD CATEGORY");
        Add_category.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_categoryActionPerformed(evt);
            }
        });

        Categoryfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoryfieldActionPerformed(evt);
            }
        });

        itemfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemfieldActionPerformed(evt);
            }
        });

        jLabel1.setText("Category:");

        jLabel2.setText("Items");

        Model.setText("SHOW MODELS");
        Model.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModelActionPerformed(evt);
            }
        });

        jButton1.setText("CHART ANALYSIS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        search.setText("SEARCH");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        Load.setText("LOAD");
        Load.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Categoryfield, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Load, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(itemfield, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE))))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(update_entry, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Model, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Add_category, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Add_category)
                            .addComponent(Categoryfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(itemfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(update_entry)
                            .addComponent(search))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Model)
                            .addComponent(Load))
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void update_entryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_entryActionPerformed
        // TODO add your handling code here:
        int c=Category_table.getSelectedRow();
        String upd_s1=Categoryfield.getText().toString();
           String upd_s2=itemfield.getText().toString();
        try{
        if(c>-1&&(!upd_s1.isEmpty())&&(!upd_s2.isEmpty()))
        {
            dm=(DefaultTableModel)Category_table.getModel();
            String s1=dm.getValueAt(c, 0).toString();
            String s2=dm.getValueAt(c, 1).toString();
           
           
           
            dm.setValueAt(upd_s1, c, 0);
            dm.setValueAt(upd_s2, c, 1);
            Class.forName("com.mysql.cj.jdbc.Driver");
        String user="root";
        String passwd="aman";
        String url="jdbc:mysql://localhost:3306/sakila";
        String q1="Update categtable set Category=?,Items=? where Category=?";
        
        Connection con=DriverManager.getConnection(url,user,"aman");
   PreparedStatement st=con.prepareStatement(q1);
   st.setString(1,upd_s1);
   st.setString(2,upd_s2);
    st.setString(3,s1);

  
   
   st.executeUpdate();
            JOptionPane.showMessageDialog(this, "Updated the field");
            
           
            
            
        }
        
        else
        {
            System.out.println("Updated");
        }}
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_update_entryActionPerformed

    private void Add_categoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_categoryActionPerformed

        String cat=Categoryfield.getText().toString();
         String item=itemfield.getText().toString();
         
         try{if((!cat.isEmpty())&&(!item.isEmpty()))
         {
             String q1="insert into categtable (Category,Items) values(?,?)";
             PreparedStatement st=con.prepareStatement(q1);
             st.setString(1,cat);
             st.setString(2,item);
             st.executeUpdate();
             JOptionPane.showMessageDialog(this, "Inserted Successfully");
         }
         else 
         {
              JOptionPane.showMessageDialog(this, "Fill the fields");
         }
         dm.setRowCount(0);
         inv.table_update("Categtable");
         for(int i=0;i<inv.k;i++)
                {
                    String set[]={inv.cat[i],inv.items[i]};
                     dm=(DefaultTableModel)Category_table.getModel();
                    dm.addRow(set);
                }
         }
         catch(Exception e)
         {
             System.out.println(e.getMessage());
         }
         
    }//GEN-LAST:event_Add_categoryActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        // TODO add your handling code here:
 dm=(DefaultTableModel)Category_table.getModel();
int c=Category_table.getSelectedRow();
 System.out.println(c);
if(c>-1)
{
    System.out.println(c);
    try{
        String q1="delete  from categTable where Category = ?";
       PreparedStatement st1=con.prepareStatement(q1);
       st1.setString(1,Categoryfield.getText().toString());
        st1.execute();
        
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
      dm.removeRow(c);
    JOptionPane.showConfirmDialog(this, "Deleted Successfully!!!");
}
else {
  
     JOptionPane.showMessageDialog(this, "Select a row first");
}

    }//GEN-LAST:event_jButton2ActionPerformed

    private void ModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModelActionPerformed
        // TODO add your handling code here:
        
        String cat=Categoryfield.getText().toString().trim();
        if(!cat.isEmpty())
        {
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
        String user="root";
        String passwd="aman";
        String url="jdbc:mysql://localhost:3306/sakila";
        
        con=DriverManager.getConnection(url,user,"aman");
                
                
       
                String q1="create table if not exists "+cat+"(Model varchar(20),Quantity varchar(20),Price varchar(20),PRIMARY KEY(Model))";
               
            
           PreparedStatement st=con.prepareStatement(q1.trim());
         
         
          
            st.executeUpdate();
            new ADD_WINDOW(cat).setVisible(true);
            
            
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
        }
        else {
            JOptionPane.showMessageDialog(this, "Select a field");
        }
    }//GEN-LAST:event_ModelActionPerformed

    private void itemfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemfieldActionPerformed
        // TODO add your handling code here:
        int c=Category_table.getSelectedRow();
        if(c>-1)
        {
            DefaultTableModel dm=(DefaultTableModel)Category_table.getModel();
         String s=(String) dm.getValueAt(c, 1).toString();
         itemfield.setText(s);
         
         
        }
    }//GEN-LAST:event_itemfieldActionPerformed

    private void CategoryfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoryfieldActionPerformed
        // TODO add your handling code here:
        int c=Category_table.getSelectedRow();
        if(c>-1)
        {
            DefaultTableModel dm=(DefaultTableModel)Category_table.getModel();
         String s=(String) dm.getValueAt(c, 0).toString();
         Categoryfield.setText(s);
         
         
        }
        
    }//GEN-LAST:event_CategoryfieldActionPerformed

    private void Category_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Category_tableMouseClicked
        // TODO add your handling code here:
         int c=Category_table.getSelectedRow();
        if(c>-1)
        {
            DefaultTableModel dm=(DefaultTableModel)Category_table.getModel();
         String s=(String) dm.getValueAt(c, 0).toString();
         Categoryfield.setText(s);
         
         
        }
         
        if(c>-1)
        {
            DefaultTableModel dm=(DefaultTableModel)Category_table.getModel();
         String s=(String) dm.getValueAt(c, 1).toString();
         itemfield.setText(s);
         
         
        }
    }//GEN-LAST:event_Category_tableMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel dm1=(DefaultTableModel)Category_table.getModel();
        String cat1[]=new String[25];
        int num[]=new int[25];
        int c=dm1.getRowCount();
        
        for(int i=0;i<c;i++)
        {
            cat1[i]=dm1.getValueAt(i,0).toString();
            num[i]=Integer.parseInt(dm1.getValueAt(i, 1).toString());
        }
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
        String cat=Categoryfield.getText().toString().trim();
        try{
        if(!cat.isEmpty())
        {
            String q1="Select * from categTable where Category=?";
            PreparedStatement ps=con.prepareStatement(q1);
            ps.setString(1,cat);
            ResultSet rs=ps.executeQuery();
DefaultTableModel dm1=(DefaultTableModel)Category_table.getModel();

dm1.setRowCount(0);
if(rs.next())
{String entry[]={rs.getString("Category"),rs.getString("Items")};
    dm1.addRow(entry);}}
else 
{
        JOptionPane.showMessageDialog(this, "fill the category field");
        
        }
        }
        catch(Exception exp)
        {
        System.out.println(exp.getMessage());}
        
        
    }//GEN-LAST:event_searchActionPerformed

    private void LoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoadActionPerformed
        // TODO add your handling code here:
        String s="categtable";
       inv.table_update(s);
       System.out.println(inv.k);
       dm.setRowCount(0);
                for(int i=0;i<inv.k;i++)
                {
                    String set[]={inv.cat[i],inv.items[i]};
                     dm=(DefaultTableModel)Category_table.getModel();
                    dm.addRow(set);
                }
        
        
    }//GEN-LAST:event_LoadActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Invenotory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Invenotory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Invenotory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Invenotory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Invenotory().setVisible(true);
                
                
            }
            
        });
         
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add_category;
    private javax.swing.JTable Category_table;
    private javax.swing.JTextField Categoryfield;
    private javax.swing.JButton Load;
    private javax.swing.JButton Model;
    private javax.swing.JTextField itemfield;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton search;
    private javax.swing.JButton update_entry;
    // End of variables declaration//GEN-END:variables
}

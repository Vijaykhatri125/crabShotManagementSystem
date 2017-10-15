/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crabshot.management.system.DBA;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Vijay P Khatri
 */
public class DBManager {
    static Connection con = DBConnection.makeConnection();
    
    public static Boolean login(String user, String pass)
    {
       boolean login=false;
       try {
           String query="Select * from employee where emp_username =? AND emp_password =? AND emp_active = ?";
           PreparedStatement prepStatement = con.prepareStatement(query);
           prepStatement.setString(1, user);
           prepStatement.setString(2, pass);
           prepStatement.setInt(3, 1);
           ResultSet result=prepStatement.executeQuery();
           while(result.next()){
               login=true;
           }
       }catch (SQLException ex) {
           Logger.getLogger(DBManager.class.getName()).log(Level.SEVERE, null, ex);
       }
       return login;      
   }
    
   //Customer
  public static int getCustomerId(String number){
      int id=0;
      try{
          String query="select * from customer where contactno='"+number+"'";
          System.out.println("Id Query is : "+query);
          Statement st=con.createStatement();
          ResultSet result=st.executeQuery(query);
          while(result.next()){
              id=result.getInt("id");
          }
      }catch(Exception e){
          e.printStackTrace();
      }
      return id;
  }
  public static int getCustomersId(String name){
      int id=0;
      try{
          String query="select * from customer where name='"+name+"'";
          System.out.println("Id Query is : "+query);
          Statement st=con.createStatement();
          ResultSet result=st.executeQuery(query);
          while(result.next()){
              id=result.getInt("id");
          }
      }catch(Exception e){
          e.printStackTrace();
      }
      return id;
  }
  public static String getCustomersName(int id){
      String name="";
      try{
          String query="select * from customer where id='"+id+"'";
          System.out.println("Id Query is : "+query);
          Statement st=con.createStatement();
          ResultSet result=st.executeQuery(query);
          while(result.next()){
              name=result.getString("name");
          }
      }catch(Exception e){
          e.printStackTrace();
      }
      return name;
  }
  public static String getCustomerNumber(int id){
      String name="";
      try{
          String query="select * from customer where id='"+id+"'";
          Statement st=con.createStatement();
          ResultSet result=st.executeQuery(query);
          while(result.next()){
              name=result.getString("contactno");
          }
      }catch(Exception e){
          e.printStackTrace();
      }
      return name;
  }
  
   public static ResultSet fatchAllCustomer(){
       ResultSet result=null;
       try{
           String query="select id,name,contactno,address from customer where active=1";
           Statement st=con.createStatement();
           result=st.executeQuery(query);
            
       }catch(Exception e){
           e.printStackTrace();
       }
       return result;
   }
   public static ResultSet getSearchedRecord(String number){
       ResultSet result=null;
       try{
           String query="select id,name,contactno,address from customer where contactno like '%"+number+"%' and active=1";
           Statement st=con.createStatement();
           result=st.executeQuery(query);
       }catch(Exception e){
           e.printStackTrace();
       }
       return result;
   }
   public static ResultSet getCustomerType(String name){
       ResultSet result=null;
       try{
           String query="select * from customer where name like '%"+name+"%' and active=1";
           Statement st=con.createStatement();
           result=st.executeQuery(query);
       }catch(Exception e){
           e.printStackTrace();
       }
       return result;
   }
   public static ResultSet getCustomerTypeByCell(String cell){
       ResultSet result=null;
       try{
           String query="select * from customer where contactno like '%"+cell+"%' and active=1";
           Statement st=con.createStatement();
           result=st.executeQuery(query);
       }catch(Exception e){
           e.printStackTrace();
       }
       return result;
   }
   public static boolean addCustomer(String name,String contactNo,String address){
       boolean status=false;
       try{
           String query="insert into customer(name,contactno,address,active)values('"+name+"','"+contactNo+"','"+address+"',"+1+")";
           Statement st=con.createStatement();
           int row=st.executeUpdate(query);
           if(row==1){
                JOptionPane.showMessageDialog(null, "Record Added Succefully.!");
                status=true;
            }
           else{
                JOptionPane.showMessageDialog(null, "Record is not Added Succefully.!");
           }
       }catch(Exception e){
           e.printStackTrace();
       }
       return status;
   }
   public static boolean updateCustomer(String name,String contactNo,String address,int id){
       boolean status=false;
       try{
           String query="update customer set name='"+name+"',contactno='"+contactNo+"',address='"+address+"' where id="+id+"";
           Statement st=con.createStatement();
           int row=st.executeUpdate(query);
           if(row==1){
                JOptionPane.showMessageDialog(null, "Record Updated Succefully.!");
                status=true;
            }
           else{
                JOptionPane.showMessageDialog(null, "Record is not Updated Succefully.!");
           }
       }catch(Exception e){
           e.printStackTrace();
       }
       return status;
   }
   
   public static void deleteCustomer(String cellno){
       try{
           String query="update customer set active=0 where contactno='"+cellno+"'";
           Statement st=con.createStatement();
           int row=st.executeUpdate(query);
           if(row==1){
               JOptionPane.showMessageDialog(null, "Record Deleted Successfully.!");
           }
           else{
               JOptionPane.showMessageDialog(null, "Record is not Deleted Successfully.!");
           }
               
       }catch(Exception e){
           e.printStackTrace();
       }
   }
   //Product
   
   public static int getProductId(String name){
      int id=0;
      try{
          String query="select * from product where name='"+name+"'";
          Statement st=con.createStatement();
          ResultSet result=st.executeQuery(query);
          while(result.next()){
              id=result.getInt("id");
          }
      }catch(Exception e){
          e.printStackTrace();
      }
      return id;
  }
   
   public static ResultSet fatchAllProducts(){
       ResultSet result=null;
       try{
           String query="select id,name,price,cost,quantity,unit from product where active=1";
           Statement st=con.createStatement();
           result=st.executeQuery(query);
            
       }catch(Exception e){
           e.printStackTrace();
       }
       return result;
   }
   
    public static ResultSet getSearchedProductRecord(String name){
       ResultSet result=null;
       try{
           String query="select id,name,cost,price,quantity,unit from product where name like '%"+name+"%' and active=1";
           Statement st=con.createStatement();
           result=st.executeQuery(query);
       }catch(Exception e){
           e.printStackTrace();
       }
       return result;
    }
    
    public static double getProductQuantity(String name){
      double quantity=0;
      try{
          String query="select * from product where name='"+name+"'";
          Statement st=con.createStatement();
          ResultSet result=st.executeQuery(query);
          while(result.next()){
              quantity=result.getDouble("quantity");
          }
      }catch(Exception e){
          e.printStackTrace();
      }
      return quantity;
   }
    
    public static ResultSet getProductCostByName(String name){
       ResultSet result=null;
       try{
           String query="select cost from product where name = '"+name+"' and active=1";
           Statement st=con.createStatement();
           result=st.executeQuery(query);
       }catch(Exception e){
           e.printStackTrace();
       }
       return result;
    }
 
    public static double getProductPrice(String name){
      double price=0;
      try{
          String query="select * from product where name='"+name+"'";
          Statement st=con.createStatement();
          ResultSet result=st.executeQuery(query);
          while(result.next()){
              price=result.getInt("price");
          }
      }catch(Exception e){
          e.printStackTrace();
      }
      return price;
    }
     
    public static String getProductUnit(String name){
      String unit = "";
      try{
          String query="select * from product where name='"+name+"'";
          Statement st=con.createStatement();
          ResultSet result=st.executeQuery(query);
          while(result.next()){
              unit=result.getString("unit");
          }
      }catch(Exception e){
          e.printStackTrace();
      }
      return unit;
    }
    
      public static int getProductCost(String name){
      int price=0;
      try{
          String query="select * from product where name='"+name+"'";
          Statement st=con.createStatement();
          ResultSet result=st.executeQuery(query);
          while(result.next()){
              price=result.getInt("cost");
          }
      }catch(Exception e){
          e.printStackTrace();
      }
      return price;
   }
     
     public static String getProductName(int proId){
        String name="";
      try{
          String query="select * from product where id="+proId+"";
          Statement st=con.createStatement();
          ResultSet result=st.executeQuery(query);
          while(result.next()){
              name=result.getString("name");
          }
      }catch(Exception e){
          e.printStackTrace();
      }
      return name;
   }
   
   
   public static boolean addProduct(String name, double cost,double price, double quantity, String unit){
       boolean status=false;
       try{
           String query="insert into product(name,cost,price,quantity,unit,active)values('"+name+"',"+cost+","+price+","+quantity+",'"+unit+"',"+1+")";
           Statement st=con.createStatement();
           int row=st.executeUpdate(query);
           if(row==1){
                JOptionPane.showMessageDialog(null, "Record Added Succefully.!");
                status=true;
            }
           else{
                JOptionPane.showMessageDialog(null, "Record is not Added Succefully.!");
           }
       }catch(Exception e){
           e.printStackTrace();
       }
       return status;
   }
   
   public static boolean updateProduct(String name, double cost, double price,double quantity,String unit, int id){
       boolean status=false;
       try{
           String query="update product set name='"+name+"',cost="+cost+",price="+price+",quantity="+quantity+", unit='"+unit+"' where id="+id+"";
           Statement st=con.createStatement();
           int row=st.executeUpdate(query);
           if(row==1){
                JOptionPane.showMessageDialog(null, "Record Updated Succefully.!");
                status=true;
            }
           else{
                JOptionPane.showMessageDialog(null, "Record is not Updated Succefully.!");
           }
       }catch(Exception e){
           e.printStackTrace();
       }
       return status;
   }
   
   public static void deleteProduct(String name){
       try{
           String query="update product set active=0 where name='"+name+"'";
           Statement st=con.createStatement();
           int row=st.executeUpdate(query);
           if(row==1){
               JOptionPane.showMessageDialog(null, "Record Deleted Successfully.!");
           }
           else{
               JOptionPane.showMessageDialog(null, "Record is not Deleted Successfully.!");
           }
               
       }catch(Exception e){
           e.printStackTrace();
       }
   }
   
   //Order
   
   public static ResultSet getSearchedProductForOrder(String name){
       ResultSet result=null;
       try{
           String query="select id,name,price,quantity from product where name like '%"+name+"%' and active=1";
           Statement st=con.createStatement();
           result=st.executeQuery(query);
       }catch(Exception e){
           e.printStackTrace();
       }
       return result;
   }
   public static double quantityAvailable(String name){
       double quantity=0;
       try{
           String query="select * from product where name='"+name+"' and active=1";
           Statement st=con.createStatement();
           ResultSet result=st.executeQuery(query);
           while(result.next()){
               quantity=result.getInt("quantity");
           }
       }catch(Exception e){
           e.printStackTrace();
       }
       return quantity;
   }
 
   public static void addOrder(String date,String time, int cid,int ordernum, String comment, int deliveryCharges){
       try{
           String query="insert into Orderc(cust_id,time,date,order_no,comment,delivery_charges)values("+cid+",'"+time+"','"+date+"',"+ordernum+",'"+comment+"','"+deliveryCharges+"')";
           System.out.println(query);
           Statement st=con.createStatement();
           int row=st.executeUpdate(query);
      
       }catch(Exception e){
           e.printStackTrace();
       }
       
   }
   
   public static boolean updateOrder(int orderId, String date, int cid, int ordernum, String comment, int deliveryCharges){
       boolean status=false;
       try{
           String query="update Orderc set date='"+date+"',cust_id="+cid+",order_no="+ordernum+",comment='"+comment+"', delivery_charges='"+deliveryCharges+"' where order_id="+orderId+"";
           Statement st=con.createStatement();
           int row=st.executeUpdate(query);
           if(row==1){
                status=true;
            }
           else{
               return false;
           }
       }catch(Exception e){
           e.printStackTrace();
       }
       return status;
   }
   
   
   
   public static int getOrderId(int orderNum){
       int id=0;
       try{
           String query="select order_id from Orderc where order_no="+orderNum+"";
           Statement st=con.createStatement();
           ResultSet result=st.executeQuery(query);
           while(result.next()){
               id=result.getInt("order_id");
           }
       }catch(Exception e){
           e.printStackTrace();
       }
       return id;
   }
   
   public static String getOrderComment(int orderId){
       String comment="";
        try{
           String query="select comment from Orderc where order_id="+orderId+"";
           Statement st=con.createStatement();
           ResultSet result=st.executeQuery(query);
           while(result.next()){
               comment=result.getString("comment");
           }
       }catch(Exception e){
           e.printStackTrace();
       }
        System.out.println(comment);
       return comment;
   }
   
     public static int getOrderDelivery(int orderId){
       int charges=0;
        try{
           String query="select delivery_charges from Orderc where order_id="+orderId+"";
           Statement st=con.createStatement();
           ResultSet result=st.executeQuery(query);
           while(result.next()){
               charges=result.getInt("delivery_charges");
           }
       }catch(Exception e){
           e.printStackTrace();
       }
       return charges;
   }
   
    public static int getLastOrderDetailsId(){
       int id=0;
       try{
           String query="select order_id from Orderc order by order_id desc limit 1";
           Statement st=con.createStatement();
           ResultSet result=st.executeQuery(query);
           while(result.next()){
               id=result.getInt("order_id");
           }
       }catch(Exception e){
           e.printStackTrace();
       }
       return id;
   }
   
   public static void addOrderDetails(int orderId,int productId,double quantity, double cost, double price){
       try{
          String query="insert into order_details(order_id,product_id,quantity,cost,price)values("+orderId+","+productId+","+quantity+","+cost+","+price+")";
          Statement st=con.createStatement();
          int row=st.executeUpdate(query);
       }catch(Exception e){
           e.printStackTrace();
       }
   }
   
   public static void deleteOrderDetails(int orderId){
       try{
           String query="delete from order_details where order_id="+orderId;
           Statement st=con.createStatement();
           int row=st.executeUpdate(query);
           if(row==1){
               //JOptionPane.showMessageDialog(null, "Record Deleted Successfully.!");
           }
           else{
               //JOptionPane.showMessageDialog(null, "Record is not Deleted Successfully.!");
           }
               
       }catch(Exception e){
           e.printStackTrace();
       }
   }
     
   
   //Expenses
   
   public static ResultSet fillOrderTable(String date){
       ResultSet result=null;
       try{
           String query="select order_id,cust_id,order_no,time,date from orderc where date='"+date+"'";
           Statement st=con.createStatement();
           result=st.executeQuery(query);
           
       }catch(Exception e){
           e.printStackTrace();
       }
       return result;
   }
   public static ResultSet getAllOrderDetails(int orderId){
       ResultSet result=null;
       try{
           String query="select * from order_details where order_id="+orderId+"";
           Statement st=con.createStatement();
           result=st.executeQuery(query);
       }catch(Exception e){
           e.printStackTrace();
       }
       return result;
   }
   
   public static void restoreQuantity(int orderId) {
       ResultSet result=null;
       ResultSet result2=null;
       try {
           String query="select * from order_details where order_id="+orderId+"";
           Statement st=con.createStatement();
           result=st.executeQuery(query);
           int proId=0;
           int proQuantity=0;
           int oldQuantity=0;
           while(result.next()){
               proId=result.getInt("product_id");
               proQuantity=result.getInt("quantity");
               String getProductQuery = "select * from product where id="+proId;
               Statement stp=con.createStatement();
               result2 = stp.executeQuery(getProductQuery);
               
               while(result2.next()) {
                   oldQuantity = result2.getInt("quantity");
               }
               String updateQuery="update product set quantity="+(proQuantity+oldQuantity)+" where id="+proId+"";
               Statement st2=con.createStatement();
               int row=st2.executeUpdate(updateQuery);     
           }
       } catch(Exception e) {
           
       }
   }
   
   public static void DeleteOrderDetails(int orderId){
       try{
           String qurey="delete from order_details where order_id="+orderId+"";
           Statement st=con.createStatement();
           int row=st.executeUpdate(qurey);
       }catch(Exception e){
           e.printStackTrace();
       }
   }
   public static void DeleteOrder(int orderId){
       try{
           String qurey="delete from Orderc where order_id="+orderId+"";
           Statement st=con.createStatement();
           int row=st.executeUpdate(qurey);
       }catch(Exception e){
           e.printStackTrace();
       }
   }
   
   //Expenses
   
   public static boolean addExpenses(String name,int price,String discription,String date){
       boolean status=false;
       try{
           String query="insert into expenses (name,amount,description,date)values('"+name+"',"+price+",'"+discription+"','"+date+"')";
           Statement st=con.createStatement();
           int row=st.executeUpdate(query);
           if(row==1){
               status=true; 
           }
           else{
               JOptionPane.showMessageDialog(null, "Not Added Successfully..!");
           }
       }catch(Exception e){
           e.printStackTrace();
       }
       return status;
   }
   
   public static ResultSet SearchExpensesByDate(String date){
       ResultSet result=null;
       try{
           String query="select expenses_id As Sno,name As Name,amount As Amount,description As Description from expenses where date='"+date+"'";
           Statement st=con.createStatement();
           result=st.executeQuery(query);
           
       }catch(Exception e){
           e.printStackTrace();
       }
       return result;
   }
   
   public static ResultSet getSearchedExpensesRecord(String name){
       ResultSet result=null;
       try{
           String query="select expenses_id,name,amount,description from expenses where name like '%"+name+"%'";
           Statement st=con.createStatement();
           result=st.executeQuery(query);
       }catch(Exception e){
           e.printStackTrace();
       }
       return result;
   }
   public static int getExpensesIdByName(String name){
       int id=0;
       try{
           String query="select * from expenses where name='"+name+"'";
           Statement st=con.createStatement();
           ResultSet result=st.executeQuery(query);
           while(result.next()){
               id=result.getInt("expenses_id");
           }
       }catch(Exception e){
           e.printStackTrace();
       }
       return id;
   }
   public static boolean updateExpenses(String name,int price,String discription,String date,int id){
       boolean b=false;
       try{
           String query="update expenses set name='"+name+"',amount='"+price+"',description='"+discription+"',date='"+date+"' where expenses_id="+id;
           Statement st=con.createStatement();
           int row=st.executeUpdate(query);
           if(row==1){
               b=true;
           }
       }catch(Exception e){
           e.printStackTrace();
       }
       return b;
   }
   public static void deleteExpenses(int id){
       try{
           String query="delete from expenses where expenses_id"+id;
           Statement st=con.createStatement();
           int row=st.executeUpdate(query);
           if(row==1){
               JOptionPane.showMessageDialog(null, "Record Deleted..!");
           }
           else{
               JOptionPane.showMessageDialog(null, "Record Is Not Deleted..!");
           }
       }catch(Exception e){
           e.printStackTrace();
       }
   }
   
   public static void updateQuantityOfProduct(String name,double quantity,int id){
       try{
           String query="select quantity from product where name='"+name+"'";
           
           Statement st=con.createStatement();
           ResultSet result=st.executeQuery(query);
           double proQunatity=0;
           while(result.next()){
               proQunatity=result.getInt("quantity");
           }
           double updateResult=proQunatity-quantity;
           String query1="update product set quantity="+updateResult+" where id="+id+"";
           int row=st.executeUpdate(query1);
           
       }catch(Exception e){
           e.printStackTrace();
       }
   }
  
}

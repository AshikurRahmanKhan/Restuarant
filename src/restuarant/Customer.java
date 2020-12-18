package restuarant;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
//import java.math.BigDecimal;

public class Customer {
    private Connection connect = null;
   private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet result = null;
    Scanner sc = null;
    
    
     
    void readCustomerData() {
        try {
            connect=ApiCustomer.getInstance();
             sc = new Scanner(System.in);
          //  statement=connect.createStatement();
            
          
           preparedStatement = connect.prepareStatement("SELECT name, food_item, price, contact FROM customer WHERE id= ?;");
          

            preparedStatement.setString(1, sc.nextLine());
            result = preparedStatement.executeQuery();

            while (result.next()) {
               // System.out.println("id: " + result.getString("id"));
                System.out.println("name: " + result.getString("name"));
                 System.out.println("food_item: " + result.getString("food_item"));
                System.out.println("price " + result.getString("price"));
                System.out.println("contact: " + result.getString("contact"));
            }
            
        }
        catch (Exception e) {
           
}
}
    
    
     void showCustomerData() {
        try {
            connect=ApiCustomer.getInstance();
             sc = new Scanner(System.in);
          //  statement=connect.createStatement();
            
          
           preparedStatement = connect.prepareStatement("SELECT id,name, food_item, price, contact FROM customer");
          
          
            result = preparedStatement.executeQuery();

            while (result.next()) {
                System.out.println("id: " + result.getString("id"));
                System.out.println("name: " + result.getString("name"));
                 System.out.println("food_item: " + result.getString("food_item"));
                System.out.println("price " + result.getString("price"));
                System.out.println("contact: " + result.getString("contact"));
            }
            
        }
        catch (Exception e) {
           
}
}
      
      
       void insertCustomerData() {
        try {
            connect=ApiCustomer.getInstance();
             sc = new Scanner(System.in);
             
          //  statement=connect.createStatement();
            
          
            preparedStatement = connect.prepareStatement("INSERT INTO customer (id, name, food_item, price, contact) Values(?,?,?,?,?)");
//id, name, food_item, price, contact
            
            System.out.println("Enter Customer id");
            preparedStatement.setString(1, sc.nextLine());
            System.out.println("Enter Food Customer Name");
            preparedStatement.setString(2, sc.nextLine());
            System.out.println("Enter Food Item Name");
            preparedStatement.setString(3, sc.nextLine());
            System.out.println("Enter Price");
            preparedStatement.setString(4, sc.nextLine());
            System.out.println("Enter Contact Information");
            preparedStatement.setString(5, sc.nextLine());
            
            preparedStatement.execute();
            
           
            
        }
        catch (Exception ex) {
           System.out.println(""+ex);
        }
      }
       
       void updateCustomerData() {
        try {
            connect=ApiCustomer.getInstance();
             sc = new Scanner(System.in);
          //  statement=connect.createStatement();
            
          
            preparedStatement = connect.prepareStatement("Update customer SET name=?, food_item=?,price=?,contact=? WHERE id=?");

//           name, food_item, price, contact

            System.out.println("EnterCustomer Name");
            preparedStatement.setString(1, sc.nextLine());
            System.out.println("Enter Food item Name");
            preparedStatement.setString(2, sc.nextLine());
            System.out.println("Enter Price");
            preparedStatement.setString(3, sc.nextLine());
            System.out.println("Enter Customer Contact Information");
            preparedStatement.setString(4, sc.nextLine());
            System.out.println("Enter Customer id");
            preparedStatement.setString(5, sc.nextLine());
            preparedStatement.execute();
         
            
        }
        catch (Exception ex) {
           System.out.println(""+ex);
        }
      }
       
              void deleteCustomerData() {
        try {
            connect=ApiCustomer.getInstance();
             sc = new Scanner(System.in);
          //  statement=connect.createStatement();
            
          
            preparedStatement = connect.prepareStatement(" DELETE FROM customer WHERE `id`=?");

           

            System.out.println("Enter Customer id to Delete");
          
            preparedStatement.setString(1, sc.nextLine());
           
            preparedStatement.execute();
            
            
        }
        catch (Exception ex) {
           System.out.println(""+ex);
        }
      }
       
}             
       
      
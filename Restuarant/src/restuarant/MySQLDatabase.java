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

public class MySQLDatabase {
    private Connection connect = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet result = null;
    Scanner sc = null;
    
         
    
    
      void readData() {
        try {
            connect=ApiCustomer.getInstance();
             sc = new Scanner(System.in);
          //  statement=connect.createStatement();
            
          
           preparedStatement = connect.prepareStatement("SELECT food_item,quantity,price,special_discount FROM restuarant WHERE id= ?;");
          

            preparedStatement.setString(1, sc.nextLine());
            result = preparedStatement.executeQuery();

            while (result.next()) {
               // System.out.println("id: " + result.getString("id"));
                System.out.println("food_item: " + result.getString("food_item"));
                 System.out.println("quantity: " + result.getString("quantity"));
                System.out.println("price " + result.getString("price"));
                System.out.println("special_discount: " + result.getString("special_discount"));
            }
            
        }
        catch (Exception e) {
           
        }
      }
      
      
      
          void showAll() {
        try {
            connect=ApiCustomer.getInstance();
             sc = new Scanner(System.in);
          //  statement=connect.createStatement();
            
          
           preparedStatement = connect.prepareStatement("SELECT id,food_item,Quantity,Price,special_discount FROM restuarant ");
          

         //   preparedStatement.setString(1, sc.nextLine());
            result = preparedStatement.executeQuery();

               while (result.next()) {
                System.out.println("id: " + result.getString("id"));
                System.out.println("food_item: " + result.getString("food_item"));
               System.out.println("quantity: " + result.getString("quantity"));
                System.out.println("price " + result.getString("price"));
                System.out.println("special_discount: " + result.getString("special_discount"));
            }
           
        }
        catch (Exception e) {
            
           
        }
      }
      
      
      
      
      
      
     /* void deleteData(){
           try {
            connect=ApiCustomer.getInstance();
             sc = new Scanner(System.in);
             
             String deleteSQL = "DELETE FROM restuarant WHERE id= ?;";
             preparedStatement.setString(1, sc.nextLine());
             int rowCount = preparedStatement.executeUpdate();
 // id | food_item                   | quantity  | price | special_discount
	    System.out.println("Record Deleted successfully from database. Row Count returned is :: "
							+ rowCount);
 
      }
           catch (Exception e) {
           
        }
      }/*
      
     /*  void rowUpdate() {
           try {
             connect=ApiCustomer.getInstance();
             sc = new Scanner(System.in);
             
             String SQL_UPDATE = ("UPDATE  restuarant WHERE id= ?;");
             preparedStatement =  connect.prepareStatement(SQL_UPDATE) {
// id | food_item                   | quantity  | price | special_discount
            preparedStatement.setBigDecimal(1, sc.nextLine());
            preparedStatement.setString(2, "mkyong");

            int row = preparedStatement.executeUpdate();

            // rows affected
            System.out.println(row);

 
        }
               catch (Exception e) {
           
        }
             
             
}*/
      
      
       void insertData() {
        try {
            connect=ApiCustomer.getInstance();
             sc = new Scanner(System.in);
             
          //  statement=connect.createStatement();
            
          
            preparedStatement = connect.prepareStatement("INSERT INTO restuarant (id,food_item,Quantity,Price,special_discount) Values(?,?,?,?,?)");

            
            System.out.println("Enter Food id");
            preparedStatement.setString(1, sc.nextLine());
            System.out.println("Enter Food Item Name");
            preparedStatement.setString(2, sc.nextLine());
            System.out.println("Enter Quantity of Food");
            preparedStatement.setString(3, sc.nextLine());
            System.out.println("Enter Price");
            preparedStatement.setString(4, sc.nextLine());
            System.out.println("Enter Special Discount price");
            preparedStatement.setString(5, sc.nextLine());
            
            preparedStatement.execute();
            
                    
        }
        catch (Exception ex) {
           System.out.println(""+ex);
        }
      }
       
       void updateData() {
        try {
            connect=ApiCustomer.getInstance();
             sc = new Scanner(System.in);
          //  statement=connect.createStatement();
            
          
            preparedStatement = connect.prepareStatement("Update restuarant SET food_item=?,quantity=?, price=?,special_discount=? WHERE id=?");

           

            System.out.println("Enter Food Item Name");
            preparedStatement.setString(1, sc.nextLine());
            System.out.println("Enter Quantity of Food");
            preparedStatement.setString(2, sc.nextLine());
            System.out.println("Enter Price");
            preparedStatement.setString(3, sc.nextLine());
            System.out.println("Enter Special Discount price");
            preparedStatement.setString(4, sc.nextLine());
            System.out.println("Enter Food id");
            preparedStatement.setString(5, sc.nextLine());
            preparedStatement.execute();
            
            
        }
        catch (Exception ex) {
           System.out.println(""+ex);
        }
      }
       
              void deleteData() {
        try {
            connect=ApiCustomer.getInstance();
             sc = new Scanner(System.in);
          //  statement=connect.createStatement();
            
          
            preparedStatement = connect.prepareStatement(" DELETE FROM restuarant WHERE `id`=?");

           

            System.out.println("Enter Food id to Delete");
          //  System.out.println("Enter Food Item Name");
            preparedStatement.setString(1, sc.nextLine());
          
            preparedStatement.execute();
                       
        }
        catch (Exception ex) {
           System.out.println(""+ex);
        }
      }
       
}






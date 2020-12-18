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

public class Account {
    private Connection connect = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet result = null;
    Scanner sc = null;
    
    
     
    void readAccountData() {
        try {
            connect=ApiCustomer.getInstance();
             sc = new Scanner(System.in);
          //  statement=connect.createStatement();
            
          
           preparedStatement = connect.prepareStatement("SELECT username,password FROM account WHERE id= ?;");
//    username, password      

            preparedStatement.setString(1, sc.nextLine());
            result = preparedStatement.executeQuery();

            while (result.next()) {
               // System.out.println("id: " + result.getString("id"));
                System.out.println("username: " + result.getString("username"));
                 System.out.println("password: " + result.getString("password"));
                
            }
            
        }
        catch (Exception e) {
           
}
}
    
       void showAccountData() {
        try {
            connect=ApiCustomer.getInstance();
             sc = new Scanner(System.in);
          //  statement=connect.createStatement();
            
          
           preparedStatement = connect.prepareStatement("SELECT id,username,password FROM account");
//    username, password      

        //    preparedStatement.setString(1, sc.nextLine());
            result = preparedStatement.executeQuery();

            while (result.next()) {
                System.out.println("id: " + result.getString("id"));
                System.out.println("username: " + result.getString("username"));
                 System.out.println("password: " + result.getString("password"));
                
            }
            
        }
        catch (Exception e) {
           
}
}
    
      
      
       void insertAccountData() {
        try {
            connect=ApiCustomer.getInstance();
             sc = new Scanner(System.in);
             
          //  statement=connect.createStatement();
            
          
            preparedStatement = connect.prepareStatement("INSERT INTO account (username,password) Values(?,?)");
//username, password
            
//            System.out.println("Enter Account id");
//            preparedStatement.setString(1, sc.nextLine());
            System.out.println("Enter Account Username");
            preparedStatement.setString(1, sc.nextLine());
            System.out.println("Enter Account Password");
            preparedStatement.setString(2, sc.nextLine());
            
            preparedStatement.execute();

            
        }
        catch (Exception ex) {
           System.out.println(""+ex);
        }
      }
       
       void updateAccountData() {
        try {
            connect=ApiCustomer.getInstance();
             sc = new Scanner(System.in);
          //  statement=connect.createStatement();
            
          
            preparedStatement = connect.prepareStatement("Update account SET username=?, password=? WHERE id=?");



            
            System.out.println("Enter Account Username");
            preparedStatement.setString(1, sc.nextLine());
            System.out.println("Enter Account Password");
            preparedStatement.setString(2, sc.nextLine());
            System.out.println("Enter Account id");
            preparedStatement.setString(3, sc.nextLine());
            preparedStatement.execute();
                
        }
        catch (Exception ex) {
           System.out.println(""+ex);
        }
      }
       
              void deleteAccountData() {
        try {
            connect=ApiCustomer.getInstance();
             sc = new Scanner(System.in);
          //  statement=connect.createStatement();
            
          
            preparedStatement = connect.prepareStatement(" DELETE FROM account WHERE `id`=?");

           

            System.out.println("Enter Customer id to Delete");
         
            preparedStatement.setString(1, sc.nextLine());
         
            preparedStatement.execute();
                      
        }
        catch (Exception ex) {
           System.out.println(""+ex);
        }
      }
       
}             
       
      
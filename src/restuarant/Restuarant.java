//Main Menu


package restuarant;
import java.util.Scanner;
//Home Page
import restuarant.MySQLDatabase;


public class Restuarant {
    
     public static void main(String[] args) { 
         MySQLDatabase db = new MySQLDatabase();
         Customer Cus = new Customer();
         Account Ac= new Account();
         
          int select;
        
        Scanner scr=new Scanner(System.in);
        do{
            Menumain();
            select=scr.nextInt();
            switch (select){
                
                case 1:
                    int select1;
                 do{
                     MenuRestuarant();
                     select1=scr.nextInt();
                     switch(select1){
                case 1:
                 System.out.println("Enter Food id");
                 db.readData();               
                 break;
                  case 2:
                 
                 db.showAll();               
                 break;
            case 3:
                 db.insertData();
                 break;
            case 4:
                db.updateData();
                 break;
                
             case 5:
                 db.deleteData();
                  break;
                  
                 
            default:
                    break;
            }
        }while (select1 !=0);
                break;
                case 2:
                    int select2;
                   do{
                     CustomerService();
                     select2=scr.nextInt();
                     switch(select2){
                         case 1:
                 System.out.println("Enter Customer id");
                 Cus.readCustomerData();               
                 break;
                         case 2:
                 
                 Cus.showCustomerData();
                 break;
            case 3:
                 Cus.insertCustomerData();
                 break;
            case 4:
                Cus.updateCustomerData();
                 break;
                
             case 5:
                 Cus.deleteCustomerData();
                  break;
                                   
            default:
                    break;
            }
        }
       while (select2 !=0);
                break;
                case 3:
                    int select3;
                   do{
                     AccountService();
                     select3=scr.nextInt();
                     switch(select3){
                         case 1:
                 System.out.println("Enter Account id");
                 Ac.readAccountData();               
                 break;
                        case 2:
              
                 Ac.showAccountData();               
                 break;
                 
                
            case 3:
                 Ac.insertAccountData();
                 break;
            case 4:
               Ac.updateAccountData();
                 break;
                
             case 5:
                 Ac.deleteAccountData();
                  break;
                  
         default:
                    break;
                
            }
    }while (select3 !=0);
       break;
                default:
                    break;
            }
    }while(select !=4);
    
            }
          
     public static void MenuRestuarant(){
        System.out.println("---Menu Restuarant---");
        System.out.println("0.Back to menu main");
        System.out.println("1. Read Food Data");
        System.out.println("2. Show All Food");
        System.out.println("3. Insert New Food");
        System.out.println("4. Update Food Information ");
        System.out.println("5. Delete food");
        
            
        System.out.println("--------");
        System.out.println("Select");
     }
    
    static void Menumain(){
        System.out.println("---Menu Main---");
        
        System.out.println("1. Restuarant");
        System.out.println("2. Customer");
        System.out.println("3. Account");
        
        System.out.println("4. Exit");
    }

    static void CustomerService() {
        System.out.println("---Customer Service---");
        System.out.println("0.Back");
        System.out.println("1. Read Single Customer Information");
        System.out.println("2. Show All Customer Information");
        
        System.out.println("3. Insert Customer Information");
        
        System.out.println("4. Update Customer Information");
        System.out.println("5. Delete Customer Information");
        
           
    }
    
      static void AccountService() {
        System.out.println("---Account Information---");
        System.out.println("0.Back");
        System.out.println("1. Read Account Information");
        System.out.println("2. Show All Account Information");
        System.out.println("3. Insert Account Information");       
        System.out.println("4. Update Account Information");
        System.out.println("5. Delete Account Information");
        
           
    }
    
    
}

/*package restuarant;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Restuarant {
    public static void main(String[] args) {
        try {
            Connection connect=ApiCustomer.getInstance();
            System.out.println(""+connect.getMetaData().getDatabaseProductName());
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Restuarant.class.getName()).log(Level.SEVERE, null, ex);
        }
}
}*/








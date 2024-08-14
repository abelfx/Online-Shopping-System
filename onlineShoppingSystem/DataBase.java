package onlineShoppingSystem;

import java.sql.*;
import java.util.Arrays;

public class DataBase {

    static String[] items;
    static int[] price;
    static String[] email;
    static String[] password;
    static String[][] products;
    static String[] securityQ;
    static String[] Answer;
    static int rowLength = 0;
    static int totalSales = 0;
    Connection con;

    public DataBase() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineshoppingsystem", 
                    "root", "Ab12el34te56sf78@");

            Statement state = con.createStatement();
            ResultSet set = state.executeQuery("SELECT Name, Price FROM items");

            Statement state_1 = con.createStatement();
            ResultSet set_1 = state_1.executeQuery("SELECT Email, Password FROM user");    

            Statement state_2 = con.createStatement();
            ResultSet set_2 = state_2.executeQuery("SELECT * FROM PRODUCTS");    

            Statement state_3 = con.createStatement();
            ResultSet countResult = state_3.executeQuery("SELECT COUNT(*) FROM PRODUCTS");
            
            Statement state_4 = con.createStatement();
            ResultSet set_4 = state_4.executeQuery("SELECT SecurityQ, S_Answer FROM user");  

            if (countResult.next()) {
                rowLength = countResult.getInt(1);
            }
            
            // Initialize arrays based on rowLength
            items = new String[10];  // Ensure this is sufficient or dynamically allocate based on data
            price = new int[10];
            email = new String[10];
            password = new String[10];
            securityQ = new String[10];
            Answer = new String[10];
            products = new String[rowLength][5];

            // Populate the items and price arrays
            int index = 0;
            while (set.next() && index < items.length) {
                items[index] = set.getString("Name");
                price[index] = set.getInt("Price");
                index++;
            }

            // Populate the email and password arrays
            int index_1 = 0;
            while (set_1.next() && index_1 < email.length) {
                email[index_1] = set_1.getString("Email");
                password[index_1] = set_1.getString("Password");
                index_1++;
            }  
            
            int index_2 = 0;
            while (set_4.next() && index_2 < securityQ.length) {
                securityQ[index_2] = set_4.getString("SecurityQ");
                Answer[index_2] = set_4.getString("S_Answer");
                index_2++;
            }
            
            
            
            // Populate the products array
            int i = 0;
            while (set_2.next() && i < rowLength) {
                products[i][0] = set_2.getString("P_ID");
                products[i][1] = set_2.getString("P_Name");
                products[i][2] = set_2.getString("Catagory");
                products[i][3] = set_2.getString("Quantity");
                products[i][4] = set_2.getString("Price");
                totalSales += set_2.getInt("Price");
                i++;
            }

        } catch (ClassNotFoundException e) {
            System.out.println("Driver not found: " + e);
        } catch (SQLException e) {
            System.out.println("SQL Exception: " + e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        new DataBase();
    }
}

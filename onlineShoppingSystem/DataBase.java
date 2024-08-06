package onlineShoppingSystem;

import java.sql.*;
import java.util.Arrays;

public class DataBase {
	
	static String[] items;
	static int[] price;
	static String[] email;
	static String[] password;
	Connection con;
	
	public DataBase() {
		try {
			
			SignUp up = new SignUp();
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineshoppingsystem", 
					"root", "Ab12el34te56sf78@");
			System.out.println("connection successfull\n");
			
			Statement state = con.createStatement();
			ResultSet set = state.executeQuery("select Name, Price from items");
			
			Statement state_1 = con.createStatement();
			ResultSet set_1 = state_1.executeQuery("select Email, Password from users");	
			
			// array to store the data
			
			items = new String[10];
			price = new int[10];
			
			email = new String[10];
			password = new String[10];
			
			
			int index = 0;
			int index_1 = 0;
			while(set.next()) {
				items[index] = set.getString("Name");
				price[index] = set.getInt("Price");
				index++;
			}
			
			while(set_1.next()) {
				email[index_1] = set_1.getString("Email");
				password[index_1] = set_1.getString("Password");
				index_1++;
			}		
			
		} catch (ClassNotFoundException e) {
			System.out.println("connection failed!" + e);
		} catch (SQLException e) {
		    System.out.println("SQL Exception: " + e.getMessage());
		}
	}
	
	
	public static void main(String[] args) {
		new DataBase();
	}
	
}

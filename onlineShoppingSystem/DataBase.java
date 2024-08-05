package onlineShoppingSystem;

import java.sql.*;
import java.util.Arrays;

public class DataBase {
	
	static String[] items;
	static int[] price;
	
	public DataBase() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineshoppingsystem", 
					"root", "Ab12el34te56sf78@");
			System.out.println("connection successfull\n");
			
			Statement state = con.createStatement();
			ResultSet set = state.executeQuery("select Name, Price from items");
			
			// array to store the data
			
			items = new String[10];
			price = new int[10];
			
			
			int index = 0;
			while(set.next()) {
				items[index] = set.getString("Name");
				price[index] = set.getInt("Price");
				index++;
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

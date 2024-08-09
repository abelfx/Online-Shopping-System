package onlineShoppingSystem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.border.CompoundBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ManageProducts extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	private ImageIcon icon;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManageProducts frame = new ManageProducts();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ManageProducts() {
		
		setTitle("Online Shopping System");
		icon = new ImageIcon("logoxo.jpg");
		this.setIconImage(icon.getImage());
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1000, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 128, 255));
		panel.setBounds(10, 10, 976, 102);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Search");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setBounds(666, 56, 87, 24);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(742, 56, 213, 24);
		panel.add(textField);
		textField.setColumns(10);
	
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 128, 255));
		panel_1.setBounds(10, 119, 368, 571);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Product ID");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(29, 25, 116, 24);
		panel_1.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(29, 57, 307, 34);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Product Name");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(29, 101, 116, 22);
		panel_1.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(29, 127, 307, 34);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Catagory");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(29, 171, 116, 26);
		panel_1.add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		textField_3.setBounds(29, 201, 307, 34);
		panel_1.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Quantity");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(29, 252, 116, 29);
		panel_1.add(lblNewLabel_4);
		
		textField_4 = new JTextField();
		textField_4.setBounds(29, 353, 307, 34);
		panel_1.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Price");
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_5.setBounds(29, 327, 116, 26);
		panel_1.add(lblNewLabel_5);
		
		textField_5 = new JTextField();
		textField_5.setBounds(29, 278, 307, 39);
		panel_1.add(textField_5);
		textField_5.setColumns(10);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// textField entries
				int p_ID = Integer.parseInt(textField_1.getText());
				String p_Name = textField_2.getText();
				String Catagory = textField_3.getText();
				int Quantity = Integer.parseInt(textField_4.getText());
				int Price = Integer.parseInt(textField_5.getText());
				
				DataBase db = new DataBase();
				
				try {
					
					db.con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineshoppingsystem", 
							"root", "Ab12el34te56sf78@");
					String sql = "INSERT INTO products (P_ID, P_Name, Catagory, Quantity, Price) VALUES (?, ?, ?, ?, ?)";
					
					 // Determine the number of rows in the PRODUCTS table
		            Statement state_3 = db.con.createStatement();
		            ResultSet countResult = state_3.executeQuery("SELECT COUNT(*) FROM PRODUCTS");
		            if (countResult.next()) {
		                db.rowLength = countResult.getInt(1);
		            }
		            
					PreparedStatement pstmt = db.con.prepareStatement(sql);
					 
					String userID = String.valueOf(p_ID);
					String quantity = String.valueOf(Quantity);
					String price = String.valueOf(Price);
					
					 pstmt.setString(1, userID );
			         pstmt.setString(2, p_Name);
			         pstmt.setString(3, Catagory);
			         pstmt.setString(4, quantity);
			         pstmt.setString(5, price);

			         
			         int rowsAffected = pstmt.executeUpdate();
			         System.out.println("rowsAffected: " + rowsAffected);	
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				;
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton.setForeground(new Color(0, 128, 255));
		btnNewButton.setBounds(29, 417, 131, 33);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Update");
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_1.setForeground(new Color(0, 128, 255));
		btnNewButton_1.setBounds(196, 417, 140, 33);
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Delete");
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_2.setForeground(new Color(0, 128, 255));
		btnNewButton_2.setBounds(29, 470, 131, 34);
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Clear");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				textField_5.setText("");
				
			}
		});
		btnNewButton_3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_3.setForeground(new Color(0, 128, 255));
		btnNewButton_3.setBounds(196, 470, 140, 34);
		panel_1.add(btnNewButton_3);
		
		JLabel lblNewLabel_6 = new JLabel("<- Back to DashBoard");
		lblNewLabel_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Dashboard board = new Dashboard();
				board.setVisible(true);
				setVisible(false);
			}
		});
		lblNewLabel_6.setForeground(new Color(255, 255, 255));
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_6.setBounds(196, 514, 153, 22);
		panel_1.add(lblNewLabel_6);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 128, 255));
		panel_2.setBounds(388, 117, 598, 546);
		contentPane.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));


        // Create table 
		DataBase db = new DataBase();
		String[][] data = new String[db.rowLength][5];
		String[] column = {
        		"P_ID", "P_Name", "Category", "Quantity", "Price"
        	};
		
		
		DefaultTableModel T_model = new DefaultTableModel(data, column);
        JTable table_2 = new JTable(T_model
        ) {
        	Class[] columnTypes = new Class[] {
        		Object.class, Object.class, Object.class, String.class, Object.class
        	};
        	public Class getColumnClass(int columnIndex) {
        		return columnTypes[columnIndex];
        	}
        };
        table_2.setColumnSelectionAllowed(true);
        table_2.setCellSelectionEnabled(true);
        table_2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        table_2.setBackground(new Color(228, 228, 228));
        JScrollPane scrollPane = new JScrollPane(table_2);
        panel_2.add(scrollPane, BorderLayout.CENTER);
        
		
		JButton btnNewButton_4 = new JButton("List Inventory");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DataBase db = new DataBase();
				int i = 0;
				while(i < db.rowLength) {
					T_model.setValueAt(db.products[i][0], i, 0);
					T_model.setValueAt(db.products[i][1], i, 1);
					T_model.setValueAt(db.products[i][2], i, 2);
					T_model.setValueAt(db.products[i][3], i, 3);
					T_model.setValueAt(db.products[i][4], i, 4);
					i++;
				}
				T_model.fireTableDataChanged();
				
			}
		});
		
		
		btnNewButton_4.setForeground(new Color(0, 128, 255));
		btnNewButton_4.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_4.setBounds(28, 56, 175, 25);
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_4_1 = new JButton("Refresh");
		btnNewButton_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				ManageProducts updated = new ManageProducts();
				updated.setVisible(true);
			}
		});
		btnNewButton_4_1.setForeground(new Color(0, 128, 255));
		btnNewButton_4_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_4_1.setBounds(213, 56, 131, 25);
		panel.add(btnNewButton_4_1);
		
		
        
		
		
        

	}
}



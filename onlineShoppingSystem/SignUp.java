package onlineShoppingSystem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;

public class SignUp extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_6;
	private ImageIcon icon;

	/**
	 * Launch the application.
	 */
	
	int id;
	String email;
	String password;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUp frame = new SignUp();
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
	public SignUp() {
		icon = new ImageIcon("logoxo.jpg");
		this.setIconImage(icon.getImage());
		setTitle("Online Shopping System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,700);
		setResizable(false);
		this.setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(255, 255, 255));
		panel.setBackground(new Color(0, 128, 255));
		panel.setBounds(0, 0, 386, 663);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Sign Up");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel.setBounds(141, 25, 102, 31);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("User Name");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_2.setBounds(6, 81, 108, 31);
		panel.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(6, 111, 335, 31);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Email");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_3.setBounds(6, 153, 108, 31);
		panel.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(6, 183, 335, 31);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Password");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_4.setBounds(6, 224, 108, 31);
		panel.add(lblNewLabel_4);
		
		textField_3 = new JTextField();
		textField_3.setBounds(6, 252, 335, 31);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Phone");
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_5.setBounds(6, 290, 132, 31);
		panel.add(lblNewLabel_5);
		
		textField_4 = new JTextField();
		textField_4.setBounds(6, 320, 335, 31);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Security Question");
		lblNewLabel_6.setForeground(new Color(255, 255, 255));
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_6.setBounds(6, 361, 132, 31);
		panel.add(lblNewLabel_6);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {
				"what is your favourite food?", 
				"what year were you born?", 
				"what is your pets name?", 
				"what school did you attend?"}));
		comboBox.setMaximumRowCount(4);
		comboBox.setBounds(6, 392, 332, 31);
		panel.add(comboBox);
		
		JLabel lblNewLabel_6_1 = new JLabel("Answer");
		lblNewLabel_6_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_6_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_6_1.setBounds(6, 433, 132, 31);
		panel.add(lblNewLabel_6_1);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(6, 461, 335, 31);
		panel.add(textField_6);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("customer");
		rdbtnNewRadioButton.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		rdbtnNewRadioButton.setBackground(new Color(0, 128, 255));
		rdbtnNewRadioButton.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton.setBounds(6, 537, 103, 21);
		panel.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnSupplier = new JRadioButton("Supplier");
		rdbtnSupplier.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		rdbtnSupplier.setBackground(new Color(0, 128, 255));
		rdbtnSupplier.setForeground(new Color(255, 255, 255));
		rdbtnSupplier.setBounds(238, 537, 103, 21);
		panel.add(rdbtnSupplier);
		
		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnSupplier);
		group.add(rdbtnNewRadioButton);
		
		JButton btnNewButton = new JButton("Register");
		
		
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// textField entries
//				id = Integer.parseInt(textField.getText());
				String username = textField_1.getText();
				email = textField_2.getText();
				password = textField_3.getText();
//				int phone = Integer.parseInt(textField_4.getText());
				String SecurityQ = (String) comboBox.getSelectedItem();
				System.out.println(SecurityQ);
				String Answer = textField_6.getText();
				
				DataBase db = new DataBase();
				
				try {
					
					db.con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineshoppingsystem", 
							"root", "Ab12el34te56sf78@");
					
					if(rdbtnNewRadioButton.isSelected()) {
						String sql = "INSERT INTO customer (Email, Password, products, `rank`, SecurityQ, S_Answer) VALUES (?, ?, ?, ?, ?, ?)";
						
						PreparedStatement pstmt = db.con.prepareStatement(sql);
						
						 pstmt.setString(1,email );
				         pstmt.setString(2, password);
				         pstmt.setString(3, "none");
				         pstmt.setString(4,  "D");
				         pstmt.setString(5,  SecurityQ);
				         pstmt.setString(6, Answer);
				         
				         
				         int rowsAffected = pstmt.executeUpdate();
				         System.out.println("rowsAffected: " + rowsAffected);	
				         JOptionPane.showMessageDialog(null, "Registration Complete");
				         UserLogin login = new UserLogin();
							login.setVisible(true);
							setVisible(false);
						
					}
					
					if(rdbtnSupplier.isSelected()) {
						String sql = "INSERT INTO supplier (Email, Password, items_sold, total_sales, SecurityQ, S_Answer) VALUES (?, ?, ?, ?, ?, ?)";
						
						PreparedStatement pstmt = db.con.prepareStatement(sql);
						 
						String userID = String.valueOf(id);
						
						 pstmt.setString(1,email );
				         pstmt.setString(2, password);
				         pstmt.setString(3, "none");
				         pstmt.setString(4,  "0");
				         pstmt.setString(5,  SecurityQ);
				         pstmt.setString(6, Answer);
				         
				         int rowsAffected = pstmt.executeUpdate();
				         System.out.println("rowsAffected: " + rowsAffected);
				         JOptionPane.showMessageDialog(null, "Registration Complete");
				         UserLogin login = new UserLogin();
							login.setVisible(true);
							setVisible(false);
						
					}else {
						JOptionPane.showMessageDialog(null, "Choice your venture!");
						
					}
						
				} catch (SQLException e1) {
					JOptionPane.showMessageDialog(null, "Registration is not successful!");
					// TODO Auto-generated catch block
					e1.printStackTrace();
				};
			}
		});
		btnNewButton.setForeground(new Color(0, 128, 255));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton.setBounds(33, 591, 124, 30);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserLogin login = new UserLogin();
				login.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_1.setForeground(new Color(0, 128, 255));
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_1.setBounds(202, 591, 124, 30);
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel_6_2 = new JLabel("which one are you?");
		lblNewLabel_6_2.setForeground(Color.WHITE);
		lblNewLabel_6_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_6_2.setBounds(95, 513, 132, 31);
		panel.add(lblNewLabel_6_2);
		
	}
}

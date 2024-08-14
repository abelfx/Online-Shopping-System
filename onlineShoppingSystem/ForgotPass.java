package onlineShoppingSystem;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class ForgotPass extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ForgotPass frame = new ForgotPass();
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
	public ForgotPass() {
		setTitle("Online Shopping System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setSize(380, 480);
		this.setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		ImageIcon icon = new ImageIcon("logoxo.jpg");
		setIconImage(icon.getImage());

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 128, 255));
		panel.setBounds(0, 10, 366, 433);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Forgot Password");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(35, 10, 280, 54);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Email Address");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(28, 74, 110, 22);
		panel.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(24, 97, 280, 32);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Security Question");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(28, 139, 149, 22);
		panel.add(lblNewLabel_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"what is your favourite food? ", "what year were you born?", "what is your pets name?", "what school did you attend?"}));
		comboBox.setMaximumRowCount(4);
		comboBox.setBounds(28, 166, 276, 32);
		panel.add(comboBox);
		
		JLabel lblNewLabel_3 = new JLabel("Answer");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(28, 208, 124, 22);
		panel.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(28, 236, 280, 33);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("New Password");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setBounds(38, 279, 114, 32);
		panel.add(lblNewLabel_4);
		
		textField_3 = new JTextField();
		textField_3.setBounds(28, 321, 280, 32);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DataBase db = new DataBase();
				int length = db.email.length;
				String email = "";
				
				int i = 0;
				int emaillocation = 0;
				boolean found = false;
				while( i < length) {
					if(textField.getText().equals(db.email[i])) {
						email = db.email[i];
						emaillocation = i;
						found = true;
						break;
					}
					i++;
				}
				boolean layer2 = false;
				
				if(found) {
					String SQ = (String) comboBox.getSelectedItem();
					String Answer = textField_2.getText();
					
					
						if(SQ.equals(db.securityQ[emaillocation]) && Answer.equals(db.Answer[emaillocation])) {
							layer2 = true;
						}
				}
				
				if(layer2) {
					String newPassword = textField_3.getText();
					try {
						db.con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineshoppingsystem", 
								"root", "Ab12el34te56sf78@");
						
						String sql = "Update user Set Password = ? where Email = ?";
						
						PreparedStatement pstmt = db.con.prepareStatement(sql);
						
						 pstmt.setString(1, newPassword); 
				         pstmt.setString(2, email); 
				         
				         int rowUpdated = pstmt.executeUpdate();
				         
				         if(rowUpdated > 0) {
				        	  JOptionPane.showMessageDialog(null,  "Pasword Changed"); 
				         }else {
				        	 JOptionPane.showMessageDialog(null,  "Error Updating password!, try again!");
				         }
				       
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}	
					
				}
				else {
		        	 JOptionPane.showMessageDialog(null,  "Something went wrong, try again!");  
			}
				
				
				
				
			}
		});
		btnNewButton.setForeground(new Color(0, 128, 255));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton.setBounds(35, 384, 117, 39);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.setForeground(new Color(0, 128, 255));
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_1.setBounds(169, 384, 124, 39);
		panel.add(btnNewButton_1);
		
		
		
		btnNewButton_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				UserLogin login = new UserLogin();
				login.setVisible(true);
				setVisible(false);
				
			}
		});
	}

}

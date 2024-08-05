package onlineShoppingSystem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class UserLogin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserLogin frame = new UserLogin();
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
	public UserLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(470,450);
		setResizable(false);
		setTitle("Online Shopping System");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setLocationRelativeTo(null);
		ImageIcon icon = new ImageIcon("logoxo.jpg");
		
		this.setIconImage(icon.getImage());

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(119, 187, 255));
		panel.setBounds(0, 0, 206, 413);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("WELCOME");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(22, 76, 174, 56);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("TO");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(86, 129, 45, 56);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("ONLINE");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(53, 195, 119, 29);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("SHOPPING");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(35, 242, 161, 56);
		panel.add(lblNewLabel_3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 128, 255));
		panel_1.setBounds(204, 0, 263, 413);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textField.setBounds(28, 99, 190, 28);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Email:");
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_5.setBounds(28, 76, 45, 13);
		panel_1.add(lblNewLabel_5);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textField_1.setBounds(28, 160, 190, 28);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Password:");
		lblNewLabel_6.setForeground(new Color(255, 255, 255));
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_6.setBounds(28, 137, 103, 13);
		panel_1.add(lblNewLabel_6);
		
		JLabel lblNewLabel_4 = new JLabel("Login");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_4.setBounds(115, 24, 60, 28);
		panel_1.add(lblNewLabel_4);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("User");
		rdbtnNewRadioButton.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		rdbtnNewRadioButton.setBackground(new Color(0, 128, 255));
		rdbtnNewRadioButton.setBounds(6, 199, 49, 21);
		panel_1.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Supplier");
		rdbtnNewRadioButton_1.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		rdbtnNewRadioButton_1.setBackground(new Color(0, 128, 255));
		rdbtnNewRadioButton_1.setBounds(67, 199, 74, 21);
		panel_1.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Admin");
		rdbtnNewRadioButton_2.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton_2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		rdbtnNewRadioButton_2.setBackground(new Color(0, 128, 255));
		rdbtnNewRadioButton_2.setBounds(143, 199, 57, 21);
		panel_1.add(rdbtnNewRadioButton_2);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(textField.getText().equals("abeltesfa198@gmail.com") && textField_1.getText().equals("Ab12el34te56sf78@")) {
					if(rdbtnNewRadioButton_2.isEnabled()) {
						Dashboard board = new Dashboard();
						board.setVisible(true);
						setVisible(false);
					}else {
						JOptionPane.showMessageDialog(null, "Currenly only Admin works");
					}
					
				}else {
					JOptionPane.showMessageDialog(null, "Either Email or Password incorrect\nTry Again");
					textField.setText("");
					textField_1.setText("");
				}
				
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton.setForeground(new Color(0, 128, 255));
		btnNewButton.setBounds(90, 271, 85, 21);
		panel_1.add(btnNewButton);
		
		JLabel lblNewLabel_7 = new JLabel("Don't have an account?");
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_7.setForeground(new Color(255, 255, 255));
		lblNewLabel_7.setBounds(83, 314, 135, 28);
		panel_1.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Forgot your password?");
		lblNewLabel_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ForgotPass pass = new ForgotPass();
				pass.setVisible(true);
				setVisible(false);
			}
		});
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_8.setForeground(new Color(255, 255, 255));
		lblNewLabel_8.setBounds(83, 365, 128, 25);
		panel_1.add(lblNewLabel_8);
		
		
		JLabel lblNewLabel_9 = new JLabel("Sign Up");
		lblNewLabel_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				SignUp signup = new SignUp();
				signup.setVisible(true);
				setVisible(false);
				
			}
		});
		lblNewLabel_9.setForeground(new Color(189, 189, 189));
		lblNewLabel_9.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_9.setBounds(115, 337, 60, 18);
		panel_1.add(lblNewLabel_9);
	}
}

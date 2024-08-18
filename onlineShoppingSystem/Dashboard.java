package onlineShoppingSystem;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;

import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class Dashboard extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dashboard frame = new Dashboard();
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
	public Dashboard() {
		setTitle("Online Shopping System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		ImageIcon icon = new ImageIcon("logoxo.jpg");
		setIconImage(icon.getImage());
		setSize(1000, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		/** JOptionPane array*/
		String[] array = { "YES", "NO", "CANCEL"};
		
		JPanel panel = new JPanel();
		
		this.setLocationRelativeTo(null);
		panel.setBackground(new Color(15, 230, 80));
		panel.setBounds(-10, 0, 996, 99);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ONLINE SHOPPING");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(64, 10, 310, 81);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("DashBoard");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(581, 41, 224, 27);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_17 = new JLabel("Log Out");
		lblNewLabel_17.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				UserLogin login = new UserLogin();
				int choice = JOptionPane.showOptionDialog( 
			            null, 
			            "Do you want to Log Out?", 
			            "Log Out?", 
			            JOptionPane.YES_NO_CANCEL_OPTION,
			            JOptionPane.QUESTION_MESSAGE, 
			            null,
			            array,
			            array[2]);
				if(choice == JOptionPane.YES_OPTION) {
					JOptionPane.showMessageDialog(null, "Logged Out");
					login.setVisible(true);
					setVisible(false);	
				}
			}
		});
		lblNewLabel_17.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_17.setForeground(new Color(255, 255, 255));
		lblNewLabel_17.setBounds(865, 41, 92, 22);
		panel.add(lblNewLabel_17);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(52, 52, 126));
		panel_1.setBounds(0, 98, 257, 665);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("DASHBOARD");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel_3.setBackground(new Color(87, 171, 255));
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(10, 31, 237, 56);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_10 = new JLabel("Manage Catagories");
		lblNewLabel_10.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_10.setForeground(new Color(180, 180, 180));
		lblNewLabel_10.setBounds(35, 97, 186, 41);
		panel_1.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Manage Products");
		lblNewLabel_11.setBackground(new Color(180, 180, 180));
		lblNewLabel_11.addMouseListener(new MouseAdapter() {
			
			private Color initialColor = lblNewLabel_11.getBackground();
			private Color hoverColor = Color.WHITE;
			
			@Override
			public void mouseClicked(MouseEvent e) {
				ManageProducts manage = new ManageProducts();
				manage.setVisible(true);
				setVisible(false);
			}
			
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_11.setForeground(hoverColor);
			}
			
			public void mouseExited(MouseEvent e) {
				lblNewLabel_11.setForeground(initialColor);
			}
		});
		lblNewLabel_11.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_11.setForeground(new Color(180, 180, 180));
		lblNewLabel_11.setBounds(35, 148, 186, 39);
		panel_1.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel(" Manage Users");
		lblNewLabel_12.setBackground(new Color(180, 180, 180));
		lblNewLabel_12.addMouseListener(new MouseAdapter() {
			
			private Color initialColor = lblNewLabel_12.getBackground();
			private Color hoverColor = Color.WHITE;
			
			@Override
			public void mouseClicked(MouseEvent e) {
				manageUser user = new manageUser();
				user.setVisible(true);
				setVisible(false);
				
				
			}
			
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_12.setForeground(hoverColor);
			}
			
			public void mouseExited(MouseEvent e) {
				lblNewLabel_12.setForeground(initialColor);
			}
			
		});
		lblNewLabel_12.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_12.setForeground(new Color(180, 180, 180));
		lblNewLabel_12.setBounds(35, 197, 186, 34);
		panel_1.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Select Supplier");
		lblNewLabel_13.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_13.setForeground(new Color(180, 180, 180));
		lblNewLabel_13.setBounds(35, 348, 186, 41);
		panel_1.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("Transaction");
		lblNewLabel_14.setBackground(new Color(180, 180, 180));
		lblNewLabel_14.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_14.setForeground(new Color(180, 180, 180));
		lblNewLabel_14.setBounds(35, 399, 186, 47);
		panel_1.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("Add Suppliers");
		lblNewLabel_15.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_15.setForeground(new Color(180, 180, 180));
		lblNewLabel_15.setBounds(35, 292, 186, 46);
		panel_1.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("Manage Suppliers");
		lblNewLabel_16.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_16.setForeground(new Color(180, 180, 180));
		lblNewLabel_16.setBounds(35, 241, 186, 41);
		panel_1.add(lblNewLabel_16);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(224, 224, 224));
		panel_2.setBounds(256, 98, 730, 665);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(68, 10, 604, 263);
		panel_2.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Statistics");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_4.setBounds(214, 10, 184, 41);
		panel_3.add(lblNewLabel_4);
		
		JLabel lblNewLabel_2 = new JLabel("Total Catagories: ");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_2.setBounds(10, 77, 159, 41);
		panel_3.add(lblNewLabel_2);
		
		JLabel lblNewLabel_5 = new JLabel("Toral Products:");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_5.setBounds(10, 128, 149, 38);
		panel_3.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Total Suppliers:");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_6.setBounds(214, 77, 159, 41);
		panel_3.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Total Users:");
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_7.setBounds(214, 128, 134, 38);
		panel_3.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Todays Sales:");
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_8.setBounds(421, 77, 134, 41);
		panel_3.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Total Sales:");
		lblNewLabel_9.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_9.setBounds(387, 128, 104, 38);
		panel_3.add(lblNewLabel_9);
		
		
		// this is a test //
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(68, 292, 604, 205);
		panel_2.add(panel_4);
		panel_4.setLayout(null);

		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		textArea.setVisible(false);
		textArea.setEditable(false);

		JScrollPane scrollPane = new JScrollPane(textArea);
		scrollPane.setBounds(10, 45, 584, 150); // Correct bounds to match the panel's size
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane.setVisible(false);

		panel_4.add(scrollPane);
		
		DataBase db = new DataBase();
		String P_total = String.valueOf(db.rowLength);
		JLabel lblNewLabel_19 = new JLabel(P_total);
		lblNewLabel_19.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_19.setBounds(155, 135, 43, 21);
		panel_3.add(lblNewLabel_19);
		
		// total sales does not work properly.............it has to be fixed
		final int totalSales = db.totalSales;
		
		String totalsales = String.valueOf(totalSales);
		JLabel lblNewLabel_19_1 = new JLabel(totalsales);
		lblNewLabel_19_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_19_1.setBounds(501, 135, 93, 21);
		panel_3.add(lblNewLabel_19_1);
		
		String usersNum = String.valueOf(db.userNum);
		JLabel lblNewLabel_19_1_1 = new JLabel(usersNum);
		lblNewLabel_19_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_19_1_1.setBounds(330, 135, 52, 21);
		panel_3.add(lblNewLabel_19_1_1);
		
	}
}

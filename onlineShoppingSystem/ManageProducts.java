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
		
		
		// lists inventory but still is not functional.................
		
		JButton btnNewButton_4 = new JButton("List Inventory");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		//.............................................................
		
		
		btnNewButton_4.setForeground(new Color(0, 128, 255));
		btnNewButton_4.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_4.setBounds(28, 56, 175, 25);
		panel.add(btnNewButton_4);
		
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
		

        // Create panel with BorderLayout

        // Create table model with column names and data
        DefaultTableModel tableModel = new DefaultTableModel(
            new Object[][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
            },
            new String[] {
                "P_ID", "P_Name", "Category", "Quantity", "Price"
            }
        ) {
            Class[] columnTypes = new Class[] {
                Object.class, Object.class, Object.class, String.class, Object.class
            };
            public Class getColumnClass(int columnIndex) {
                return columnTypes[columnIndex];
            }
        };

        // Create table and add to JScrollPane
        JTable table_2 = new JTable(new DefaultTableModel(
        	new Object[][] {
        		{"sdsdsds", null, null, null, null},
        		{"", null, null, null, null},
        		{null, null, null, null, null},
        		{null, null, null, null, null},
        		{null, null, null, null, null},
        	},
        	new String[] {
        		"P_ID", "P_Name", "Category", "Quantity", "Price"
        	}
        ) {
        	Class[] columnTypes = new Class[] {
        		Object.class, Object.class, Object.class, String.class, Object.class
        	};
        	public Class getColumnClass(int columnIndex) {
        		return columnTypes[columnIndex];
        	}
        });
        table_2.setColumnSelectionAllowed(true);
        table_2.setCellSelectionEnabled(true);
        table_2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        table_2.setBackground(new Color(228, 228, 228));
        JScrollPane scrollPane = new JScrollPane(table_2);
        panel_2.add(scrollPane, BorderLayout.CENTER);
        

	}
	

	
}



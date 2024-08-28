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

public class addSupplier extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTable table;
	private JTable table_1;
	private ImageIcon icon;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addSupplier suppliers = new addSupplier();
					suppliers.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
    public addSupplier() {
        setTitle("Online Shopping System");
        icon = new ImageIcon("logoxo.jpg");
        this.setIconImage(icon.getImage());

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 700);
        setLocationRelativeTo(null);
        getContentPane().setLayout(null);
        
        JPanel panel = new JPanel();
        panel.setBackground(new Color(0, 128, 255));
        panel.setBounds(0, 10, 496, 643);
        getContentPane().add(panel);
        panel.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("Add Supplier");
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 35));
        lblNewLabel.setForeground(new Color(255, 255, 255));
        lblNewLabel.setBackground(new Color(0, 128, 255));
        lblNewLabel.setBounds(123, 23, 201, 88);
        panel.add(lblNewLabel);
        
        JLabel lblName = new JLabel("Name:");
        lblName.setForeground(Color.WHITE);
        lblName.setFont(new Font("Times New Roman", Font.BOLD, 25));
        lblName.setBackground(new Color(0, 128, 255));
        lblName.setBounds(10, 121, 201, 88);
        panel.add(lblName);
        
        JLabel lblEmail = new JLabel("Email:");
        lblEmail.setForeground(Color.WHITE);
        lblEmail.setFont(new Font("Times New Roman", Font.BOLD, 25));
        lblEmail.setBackground(new Color(0, 128, 255));
        lblEmail.setBounds(10, 250, 201, 88);
        panel.add(lblEmail);
        
        JLabel lblNewLabel_2_1 = new JLabel("Password:");
        lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.LEFT);
        lblNewLabel_2_1.setForeground(Color.WHITE);
        lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.BOLD, 25));
        lblNewLabel_2_1.setBackground(new Color(0, 128, 255));
        lblNewLabel_2_1.setBounds(10, 364, 201, 88);
        panel.add(lblNewLabel_2_1);
        
        textField = new JTextField();
        textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
        textField.setBounds(10, 186, 456, 46);
        panel.add(textField);
        textField.setColumns(10);
        
        textField_1 = new JTextField();
        textField_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        textField_1.setColumns(10);
        textField_1.setBounds(10, 321, 456, 46);
        panel.add(textField_1);
        
        textField_2 = new JTextField();
        textField_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
        textField_2.setColumns(10);
        textField_2.setBounds(10, 433, 456, 46);
        panel.add(textField_2);
        
        
        JButton btnNewButton = new JButton("Add");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnNewButton.setForeground(new Color(0, 128, 255));
        btnNewButton.setBackground(new Color(255, 255, 255));
        btnNewButton.setBounds(46, 531, 126, 46);
        panel.add(btnNewButton);
        
        JButton btnClear = new JButton("Clear");
        btnClear.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		textField.setText("");
        		textField_1.setText("");
        		textField_2.setText("");
        	}
        });
        btnClear.setForeground(new Color(0, 128, 255));
        btnClear.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnClear.setBackground(Color.WHITE);
        btnClear.setBounds(272, 531, 126, 46);
        panel.add(btnClear);
        
       
        JLabel lblOnlyAdminsHave = new JLabel("only admins have the priviledge to add suppliers");
        lblOnlyAdminsHave.setForeground(Color.WHITE);
        lblOnlyAdminsHave.setFont(new Font("Times New Roman", Font.BOLD, 15));
        lblOnlyAdminsHave.setBackground(new Color(0, 128, 255));
        lblOnlyAdminsHave.setBounds(151, 89, 325, 38);
        panel.add(lblOnlyAdminsHave);
        
        JLabel lblBack = new JLabel("<-back");
        lblBack.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		ManageSuppliers supplier = new ManageSuppliers();
        		supplier.setVisible(true);
        		setVisible(false);
        	}
        });
        lblBack.setHorizontalAlignment(SwingConstants.TRAILING);
        lblBack.setForeground(Color.WHITE);
        lblBack.setFont(new Font("Times New Roman", Font.BOLD, 20));
        lblBack.setBackground(new Color(0, 128, 255));
        lblBack.setBounds(332, 595, 126, 38);
        panel.add(lblBack);
        
        
        

	}
}



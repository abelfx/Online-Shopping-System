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

public class ManageSuppliers extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
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
					ManageSuppliers suppliers = new ManageSuppliers();
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
    public ManageSuppliers() {
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

        JLabel lblNewLabel_1 = new JLabel("Manage Suppliers");
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1.setForeground(new Color(255, 255, 255));
        lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 30));
        lblNewLabel_1.setBounds(57, 46, 303, 37);
        panel.add(lblNewLabel_1);

        JPanel panel_1 = new JPanel();
        panel_1.setBackground(new Color(0, 128, 255));
        panel_1.setBounds(10, 108, 368, 571);
        contentPane.add(panel_1);
        panel_1.setLayout(null);

        JPanel panel_2 = new JPanel();
        panel_2.setBackground(new Color(219, 219, 219));
        panel_2.setBounds(377, 108, 609, 555);
        contentPane.add(panel_2);
        panel_2.setLayout(new BorderLayout(0, 0));

        // Initialize the table and scroll pane
        table_2 = new JTable();
        JScrollPane scrollPane = new JScrollPane(table_2);
        panel_2.add(scrollPane, BorderLayout.CENTER);

        JButton btnNewButton = new JButton("List Suppliers");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                DataBase db = new DataBase();
                
                String[][] data = new String[db.supplierNum][5];
                String[] column = { "UserID", "Email", "Password", "items_sold", "total_sales" };
                DefaultTableModel T_model = new DefaultTableModel(data, column);
                table_2.setModel(T_model);

                for (int i = 0; i < db.supplierNum; i++) {
                    T_model.setValueAt(db.suppliers[i][0], i, 0);
                    T_model.setValueAt(db.suppliers[i][1], i, 1);
                    T_model.setValueAt(db.suppliers[i][2], i, 2);
                    T_model.setValueAt(db.suppliers[i][3], i, 3);
                    T_model.setValueAt(db.suppliers[i][4], i, 4);
                }

                T_model.fireTableDataChanged();
                panel_2.revalidate();
                panel_2.repaint();
            }
        });
        btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
        btnNewButton.setForeground(new Color(0, 128, 255));
        btnNewButton.setBounds(68, 120, 208, 33);
        panel_1.add(btnNewButton);
        
        JButton btnAddUsers = new JButton("Add Suppliers");
        btnAddUsers.setForeground(new Color(0, 128, 255));
        btnAddUsers.setFont(new Font("Times New Roman", Font.BOLD, 20));
        btnAddUsers.setBounds(68, 184, 208, 33);
        panel_1.add(btnAddUsers);
        
        JButton btnNewButton_1_1 = new JButton("Remove Suppliers");
        btnNewButton_1_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        btnNewButton_1_1.setForeground(new Color(0, 128, 255));
        btnNewButton_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
        btnNewButton_1_1.setBounds(68, 252, 208, 33);
        panel_1.add(btnNewButton_1_1);
        
        JButton btnNewButton_1_2 = new JButton("Refresh");
        btnNewButton_1_2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        btnNewButton_1_2.setForeground(new Color(0, 128, 255));
        btnNewButton_1_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
        btnNewButton_1_2.setBounds(91, 321, 163, 33);
        panel_1.add(btnNewButton_1_2);
        
        JLabel lblNewLabel_2 = new JLabel("<- Back to DashBoard");
        lblNewLabel_2.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		Dashboard board = new Dashboard();
        		board.setVisible(true);
        		setVisible(false);
        	}
        });
        lblNewLabel_2.setForeground(new Color(255, 255, 255));
        lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2.setBounds(164, 521, 178, 24);
        panel_1.add(lblNewLabel_2);
        
        
        

	}
}



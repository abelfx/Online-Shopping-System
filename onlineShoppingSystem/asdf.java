package onlineShoppingSystem;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class asdf extends JFrame {
    public asdf() {
        // Set frame properties
        setTitle("JTable Example");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create panel with BorderLayout
        JPanel panel_2 = new JPanel(new BorderLayout());
        add(panel_2);

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
        JTable table_2 = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table_2);
        panel_2.add(scrollPane, BorderLayout.CENTER);

        // Pack and make frame visible
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new asdf());
    }
}


package software;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ImageIcon;

public class ownerpage extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private final JLabel lblNewLabel_1 = new JLabel("");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ownerpage frame = new ownerpage();
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
	public ownerpage() {
		setTitle("Owner");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 943, 567);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Complaints");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel.setBounds(366, 10, 303, 67);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Show complaints");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(336, 136, 163, 21);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                
            	  
                try {
                    Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/example",
                        "root", "Aditya03!");
                    DefaultTableModel model = new DefaultTableModel(new String[]{"complaints"}, 0);
                    PreparedStatement st = (PreparedStatement) connection
                        .prepareStatement("Select*from maincomplaints ");

                   
                    
                    ResultSet rs = st.executeQuery();
                 
                    if(rs.next() == false) {
                    	JOptionPane.showMessageDialog(btnNewButton, "No Data found");	
                    	 model.addRow(new Object[]{0});
                         table.setModel(model);
                    }
                    do
                    {
                    	
                        String n = rs.getString("complaints");
                        
                                                
                        model.addRow(new Object[]{n});
                        table.setModel(model);
                      
                    }while(rs.next()== true);
                    
                } catch (SQLException sqlException) {
                    sqlException.printStackTrace();
                    
                }
            }
        });	
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(169, 201, 580, 247);
		contentPane.add(scrollPane_1);
		
		table = new JTable();
		scrollPane_1.setViewportView(table);
		
		JButton btnNewButton_1 = new JButton("Home");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		dispose(); 
        		TotalLogin p2=new TotalLogin();
            	p2.setVisible(true);
            	p2.getContentPane().setLayout(null);
            	
            	
            	
        	}
        });
		btnNewButton_1.setBounds(760, 56, 65, 39);
		contentPane.add(btnNewButton_1);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Dell\\eclipse-workspace\\Javasqlconnector\\src\\hackthon\\download (2) (3).jpg"));
		lblNewLabel_1.setBounds(10, 10, 919, 520);
		contentPane.add(lblNewLabel_1);
	}
}

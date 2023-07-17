package software;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextPane;
import java.awt.ScrollPane;
import javax.swing.ImageIcon;
import javax.swing.JPasswordField;
import java.awt.SystemColor;

public class Userpage extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JTextField textField;
	private JTextField textField_2;
	private JTable table_1;
	private JTextField textField_3;
	private JTextField textField_4;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Userpage frame = new Userpage();
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
	public Userpage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 846, 501);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Get My details ");
		btnNewButton.setBounds(362, 89, 120, 21);
		contentPane.add(btnNewButton);
		JButton btnNewButton_1 = new JButton("\u21AA");
		btnNewButton_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		dispose(); 
        		TotalLogin p2=new TotalLogin();
            	p2.setVisible(true);
            	p2.getContentPane().setLayout(null);
            	
            	
            	
        	}
        });
		btnNewButton_1.setBounds(721, 13, 45, 32);
		contentPane.add(btnNewButton_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 117, 784, 48);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel_4 = new JLabel("");
		scrollPane.setRowHeaderView(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setBounds(344, 20, 166, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Enter User Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(186, 23, 120, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Password");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(186, 62, 120, 13);
		contentPane.add(lblNewLabel_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(344, 196, 166, 19);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Enter Place");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(199, 199, 86, 13);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton_2 = new JButton("Get details");
		btnNewButton_2.setBounds(550, 195, 85, 21);
		contentPane.add(btnNewButton_2);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(95, 238, 580, 48);
		contentPane.add(scrollPane_1);
		
		table_1 = new JTable();
		scrollPane_1.setViewportView(table_1);
		
		textField_3 = new JTextField();
		textField_3.setBounds(228, 327, 407, 19);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		;
		JLabel lblNewLabel_3 = new JLabel("To:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(175, 328, 101, 13);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setIcon(new ImageIcon("C:\\Users\\Dell\\eclipse-workspace\\Javasqlconnector\\src\\hackthon\\download (1).png"));
		btnNewButton_3.setBounds(701, 422, 45, 32);
		contentPane.add(btnNewButton_3);
		
		textField_4 = new JTextField();
		textField_4.setBounds(95, 356, 580, 87);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 10));
		passwordField.setBounds(344, 49, 166, 21);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel_5 = new JLabel("Compose Your Complaint");
		lblNewLabel_5.setForeground(SystemColor.desktop);
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_5.setBounds(301, 304, 390, 21);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_4_1 = new JLabel("");
		lblNewLabel_4_1.setIcon(new ImageIcon("C:\\Users\\Dell\\eclipse-workspace\\Javasqlconnector\\src\\hackthon\\download (2) (3).jpg"));
		lblNewLabel_4_1.setBounds(0, 0, 854, 474);
		contentPane.add(lblNewLabel_4_1);
		btnNewButton_3.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                
            	 String id = textField_3.getText(); 
            	 String complaint = textField_4.getText();
                try {
                    Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/example",
                        "root", "Aditya03!");
                    
                    PreparedStatement st = (PreparedStatement) connection
                        .prepareStatement("insert into usercomplaints values(?,?) ");

                    st.setString(1,id );
                    st.setString(2, complaint);
                    
                    st.executeUpdate();
                    JOptionPane.showMessageDialog(btnNewButton, "Sent sucessfully ");
                    
                    }
                   
                    
                 catch (SQLException sqlException) {
                    sqlException.printStackTrace();
                    
                }
            }
        });	
		
		btnNewButton_2.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                
            	 String stationname = textField_2.getText(); 
                try {
                    Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/example",
                        "root", "Aditya03!");
                    DefaultTableModel model = new DefaultTableModel(new String[]{"Station Name","id","name"}, 0);
                    PreparedStatement st = (PreparedStatement) connection
                        .prepareStatement("Select*from police where stationname =?  ");

                    st.setString(1, stationname);
                    
                    ResultSet rs = st.executeQuery();
                 
                    if(rs.next() == false) {
                    	JOptionPane.showMessageDialog(btnNewButton, "No Data found");	
                    	 model.addRow(new Object[]{0,0,0});
                         table.setModel(model);
                    }
                    do
                    {
                    	
                        String n = rs.getString("stationname");
                        String a = rs.getString("id");
                        String m = rs.getString("name");
                                                
                        model.addRow(new Object[]{n,a,m});
                        table_1.setModel(model);
                      
                    }while(rs.next()== true);
                    
                } catch (SQLException sqlException) {
                    sqlException.printStackTrace();
                    
                }
            }
        });	
			
		
		
		btnNewButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                
            	 String userName = textField.getText();
            	 @SuppressWarnings("deprecation")
         		String password = passwordField.getText();
            	 
                try {
                    Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/example",
                        "root", "Aditya03!");
                    DefaultTableModel model = new DefaultTableModel(new String[]{"Name", "Vechicle No","Vehicle Name", " Adhaar No","Company","ammount","policy Id"}, 0);
                    PreparedStatement st = (PreparedStatement) connection
                        .prepareStatement("Select*from Users where user =? && password =?  ");

                    st.setString(1, userName);
                    st.setString(2, password);
                    
                    ResultSet rs = st.executeQuery();
                 
                    if(rs.next() == false) {
                    	JOptionPane.showMessageDialog(btnNewButton, "No Data found");	
                    	 model.addRow(new Object[]{0,0,0,0,0,0,0});
                         table.setModel(model);
                    }
                    do
                    {
                    	
                        String n = rs.getString("user");
                        String a = rs.getString("vechno");
                        String d = rs.getString("vechname");
                        String dd = rs.getString("Adhaar");
                        String ic = rs.getString("Insurancecompany");
                        String am = rs.getString("Insuranceammount");
                        String pid = rs.getString("policyid");
                        
                        model.addRow(new Object[]{n,a,d,dd,ic,am,pid});
                        table.setModel(model);
                      
                    }while(rs.next()== true);
                    
                } catch (SQLException sqlException) {
                    sqlException.printStackTrace();
                    
                }
            }
        });
	}
}

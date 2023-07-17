package software;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;

public class UserSign extends JFrame {

    private static final long serialVersionUID = 1 ;
    public static JTextField textField;
    private JPasswordField passwordField;
    private JButton btnNewButton;
    private JPanel contentPane;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;
    private JTextField textField_5;
    private JTextField textField_6;
    private JTextField textField_7;
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UserSign frame = new UserSign();
                    
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
    public UserSign() {
    	
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(450, 190, 731, 786);
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setBackground(SystemColor.activeCaption);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        textField = new JTextField();
        textField.setFont(new Font("Tahoma", Font.PLAIN, 32));
        textField.setBounds(255, 154, 281, 39);
        contentPane.add(textField);
        textField.setColumns(10);

        passwordField = new JPasswordField();
        passwordField.setFont(new Font("Tahoma", Font.PLAIN, 32));
        passwordField.setBounds(255, 351, 281, 39);
        contentPane.add(passwordField);

        JLabel lblUsername = new JLabel("Username");
        lblUsername.setBackground(Color.BLACK);
        lblUsername.setForeground(Color.BLACK);
        lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 17));
        lblUsername.setBounds(95, 154, 150, 25);
        contentPane.add(lblUsername);

        JLabel lblPassword = new JLabel("Vechicle Registration No");
        lblPassword.setForeground(Color.BLACK);
        lblPassword.setBackground(Color.BLACK);
        lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 19));
        lblPassword.setBounds(23, 191, 222, 52);
        contentPane.add(lblPassword);
       
        
        JLabel lblNewLabel = new JLabel("Sign Up");
        lblNewLabel.setFont(new Font("Sitka Text", Font.ITALIC, 23));
        lblNewLabel.setBounds(297, 40, 120, 39);
        contentPane.add(lblNewLabel);
        
        JButton btnNewButton_1 = new JButton("↩");
        btnNewButton_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		dispose(); 
        		TotalLogin p2=new TotalLogin();
            	p2.setVisible(true);
            	p2.getContentPane().setLayout(null);
            	
            	
            	
        	}
        });
        btnNewButton_1.setBounds(609, 50, 50, 39);
        contentPane.add(btnNewButton_1);
        
        textField_1 = new JTextField();
        textField_1.setBounds(255, 253, 281, 39);
        contentPane.add(textField_1);
        textField_1.setColumns(10);
        
        JLabel lblNewLabel_2 = new JLabel("Vechicle Name");
        lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 19));
        lblNewLabel_2.setBounds(78, 253, 235, 39);
        contentPane.add(lblNewLabel_2);
        
        textField_2 = new JTextField();
        textField_2.setBounds(255, 302, 281, 39);
        contentPane.add(textField_2);
        textField_2.setColumns(10);
        
        JLabel lblNewLabel_3 = new JLabel("Adhaar No");
        lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
        lblNewLabel_3.setBounds(106, 302, 114, 33);
        contentPane.add(lblNewLabel_3);
        
        textField_3 = new JTextField();
        textField_3.setBounds(255, 203, 281, 40);
        contentPane.add(textField_3);
        textField_3.setColumns(10);
        
        JLabel lblNewLabel_4 = new JLabel("Password");
        lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 17));
        lblNewLabel_4.setBounds(113, 364, 120, 25);
        contentPane.add(lblNewLabel_4);
        
        JLabel lblNewLabel_5 = new JLabel("Insurance Company");
        lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblNewLabel_5.setBounds(59, 476, 173, 13);
        contentPane.add(lblNewLabel_5);
        
        JLabel lblNewLabel_6 = new JLabel("Ammount");
        lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblNewLabel_6.setBounds(95, 529, 125, 26);
        contentPane.add(lblNewLabel_6);
        
        textField_4 = new JTextField();
        textField_4.setColumns(10);
        textField_4.setBounds(255, 465, 281, 39);
        contentPane.add(textField_4);
        
        textField_5 = new JTextField();
        textField_5.setColumns(10);
        textField_5.setBounds(255, 525, 281, 39);
        contentPane.add(textField_5);
        
        textField_6 = new JTextField();
        textField_6.setColumns(10);
        textField_6.setBounds(255, 400, 281, 39);
        contentPane.add(textField_6);
        
        JLabel lblNewLabel_7 = new JLabel("Policy Id");
        lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 17));
        lblNewLabel_7.setBounds(110, 416, 86, 26);
        contentPane.add(lblNewLabel_7);
        
        JLabel lblNewLabel_8 = new JLabel("");
        lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 17));
        lblNewLabel_8.setBounds(326, 574, 109, 40);
        contentPane.add(lblNewLabel_8);
        Random r = new Random();
        lblNewLabel_8.setText(String.valueOf(r.nextInt()));
        
        JLabel lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Dell\\eclipse-workspace\\Javasqlconnector\\src\\hackthon\\imgonline-com-ua-resize-V8YfQmWvgl0.jpg"));
        lblNewLabel_1.setBounds(-26, 60, 775, 591);
        contentPane.add(lblNewLabel_1);
        
        JLabel lblNewLabel_9 = new JLabel("Enter Number");
        lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblNewLabel_9.setBounds(95, 620, 101, 31);
        contentPane.add(lblNewLabel_9);
        
        textField_7 = new JTextField();
        textField_7.setBounds(255, 624, 269, 27);
        contentPane.add(textField_7);
        textField_7.setColumns(10);
        
        String num =textField_7.getText();
        
        btnNewButton = new JButton("SignUP");
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 26));
        btnNewButton.setBounds(287, 661, 150, 50);
        btnNewButton.addActionListener(new ActionListener() {
            
        	public void actionPerformed(ActionEvent e) {
            	if(lblNewLabel_8.getText().toString().equals(textField_7.getText().toString())) {
            	String userName = textField.getText();
                    @SuppressWarnings("deprecation")
                String Vechno =textField_3.getText();
                String Vechna = textField_1.getText();
                String Ano = textField_2.getText();
                String comname = textField_4.getText();
                String ammount = textField_5.getText();
    		    String password = passwordField.getText();
    		    String policyid = textField_6.getText();
    				
    		    try {
                     Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/example",
                            "root", "Aditya03!");
                     PreparedStatement sql = (PreparedStatement) connection
                                .prepareStatement("INSERT  INTO Users VALUES(?,?,?,?,?,?,?,?) ");
                        
                   	 
                   	 sql.setString(1,userName);
                   	 sql.setString(2, Vechno);
                   	 sql.setString(3,Vechna);
                   	 sql.setString(4, Ano);
                   	 sql.setString(5,password);
                   	 sql.setString(6, comname);
                   	 sql.setString(7, ammount);
                   	 sql.setString(8, policyid);
                   
                   
                     sql.executeUpdate();
                     JOptionPane.showMessageDialog(btnNewButton, "You have successfully Signed in  now you can login ");
                  
                   
                        
                    } catch (SQLException sqlException) {
                    	
                    	JOptionPane.showMessageDialog(btnNewButton, "user name/vehicle number/policy id  already exists");
                    }
            	    }
            	
            	    else {JOptionPane.showMessageDialog(btnNewButton, "Invalid Captha");}	
                
            }
        });
        contentPane.add(btnNewButton);
        
    }
}

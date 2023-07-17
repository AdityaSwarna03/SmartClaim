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
import java.awt.Dialog.ModalExclusionType;
import java.awt.Toolkit;

public class Policelogin extends JFrame {

    private static final long serialVersionUID = 1 ;
    public static JTextField textField;
    private JPasswordField passwordField;
    private JButton btnNewButton;
    private JPanel contentPane;
    private JTextField textField_1;
    private JTextField textField_3;
    private JTextField textField_2;
    private JLabel lblNewLabel_3;
    private JLabel lblNewLabel_5;
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Policelogin frame = new Policelogin();
                    
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
    public Policelogin() {
    	setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Desktop\\police.updated (1).png"));
    	setTitle("Police SignUp\r\n");
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(450, 190, 731, 786);
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setBackground(SystemColor.activeCaption);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        textField = new JTextField();
        textField.setFont(new Font("Tahoma", Font.PLAIN, 19));
        textField.setBounds(255, 102, 281, 39);
        contentPane.add(textField);
        textField.setColumns(10);

        passwordField = new JPasswordField();
        passwordField.setFont(new Font("Tahoma", Font.PLAIN, 10));
        passwordField.setBounds(255, 297, 281, 39);
        contentPane.add(passwordField);

        JLabel lblUsername = new JLabel("Username");
        lblUsername.setBackground(Color.BLACK);
        lblUsername.setForeground(Color.BLACK);
        lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 19));
        lblUsername.setBounds(95, 110, 150, 25);
        contentPane.add(lblUsername);

        JLabel lblPassword = new JLabel("id");
        lblPassword.setForeground(Color.BLACK);
        lblPassword.setBackground(Color.CYAN);
        lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 19));
        lblPassword.setBounds(134, 160, 222, 52);
        contentPane.add(lblPassword);
        
        
    
  
      
        
        JLabel lblNewLabel = new JLabel("Sign Up");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 19));
        lblNewLabel.setBounds(322, 23, 120, 39);
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
        btnNewButton_1.setBounds(595, 492, 50, 39);
        contentPane.add(btnNewButton_1);
        
        textField_1 = new JTextField();
        textField_1.setBounds(255, 231, 281, 39);
        contentPane.add(textField_1);
        textField_1.setColumns(10);
        
        JLabel lblNewLabel_2 = new JLabel("Place");
        lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 19));
        lblNewLabel_2.setBounds(121, 231, 235, 39);
        contentPane.add(lblNewLabel_2);
        
        textField_3 = new JTextField();
        textField_3.setBounds(255, 160, 281, 40);
        contentPane.add(textField_3);
        textField_3.setColumns(10);
        
        JLabel lblNewLabel_4 = new JLabel("Password");
        lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 17));
        lblNewLabel_4.setBounds(125, 310, 120, 25);
        contentPane.add(lblNewLabel_4);
        
        JLabel lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblNewLabel_1.setBounds(311, 369, 131, 25);
        contentPane.add(lblNewLabel_1);
        Random r = new Random();
        lblNewLabel_1.setText(String.valueOf(r.nextInt()));

        btnNewButton = new JButton("SignUP");
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 26));
        btnNewButton.setBounds(292, 492, 150, 50);
        btnNewButton.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
            	if(lblNewLabel_1.getText().toString().equals(textField_2.getText().toString())) {
                String PuserName = textField.getText();
                @SuppressWarnings("deprecation")
                String id =textField_3.getText();
                String place = textField_1.getText();
                
				String password = passwordField.getText();
                try {
                    Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/example",
                        "root", "Aditya03!");
                    PreparedStatement sql = (PreparedStatement) connection
                            .prepareStatement("INSERT  INTO police VALUES(?,?,?,?) ");
                    
               	 
               	 sql.setString(1,PuserName);
               	 sql.setString(2, id);
               	 sql.setString(3,password);
               	 sql.setString(4, place);
               	
             
                 sql.executeUpdate();
                 JOptionPane.showMessageDialog(btnNewButton, "You have successfully Signed in  now you can login ");
                
               
                    
                } catch (SQLException sqlException) {
                	
                	JOptionPane.showMessageDialog(btnNewButton, sqlException.getMessage());
                }
            	}
            	else {JOptionPane.showMessageDialog(btnNewButton, "Invalid Capthca");}
            }
        });

        contentPane.add(btnNewButton);
        
        textField_2 = new JTextField();
        textField_2.setBounds(260, 417, 211, 19);
        contentPane.add(textField_2);
        textField_2.setColumns(10);
        
        lblNewLabel_3 = new JLabel("");
        lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Dell\\eclipse-workspace\\Javasqlconnector\\src\\hackthon\\imgonline-com-ua-resize-V8YfQmWvgl0.jpg"));
        lblNewLabel_3.setBounds(10, 10, 697, 545);
        contentPane.add(lblNewLabel_3);
        
        lblNewLabel_5 = new JLabel("");
        lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\Dell\\eclipse-workspace\\Javasqlconnector\\src\\hackthon\\3348689-200.png"));
        lblNewLabel_5.setBounds(251, 96, 293, 52);
        contentPane.add(lblNewLabel_5);
        
    }
}

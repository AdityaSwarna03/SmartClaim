package software;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JToolBar;
import javax.swing.JSpinner;
import javax.swing.JScrollBar;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import java.awt.Toolkit;

public class TotalLogin extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TotalLogin frame = new TotalLogin();
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
	public TotalLogin() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Dell\\eclipse-workspace\\Javasqlconnector\\src\\hackthon\\home.png"));
		setTitle("Home\r\n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 712, 492);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaptionBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("User Login");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton.setBounds(40, 298, 174, 39);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		dispose(); 
        		Userpage p2=new Userpage();
            	p2.setVisible(true);
            	p2.getContentPane().setLayout(null);
            	
            	
            	
        	}
        });
		
		JButton btnNewButton_1 = new JButton("Police Login");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					dispose();
					policepage p2=new policepage();
	            	p2.setVisible(true);
	            	p2.getContentPane().setLayout(null);
			}
		});
		btnNewButton_1.setBounds(224, 298, 174, 39);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("i");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					dispose();
					info p2=new info();
	            	p2.setVisible(true);
	            	p2.getContentPane().setLayout(null);
			}
		});
		btnNewButton_2.setBounds(646, 44, 42, 39);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_4 = new JButton("User SignUp");
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				UserSign p2=new UserSign();
            	p2.setVisible(true);
            	p2.getContentPane().setLayout(null);
			}
		});
		btnNewButton_4.setBounds(581, 110, 107, 31);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Police SignUp");
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Policelogin p2=new Policelogin();
            	p2.setVisible(true);
            	p2.getContentPane().setLayout(null);
			}
		});
		btnNewButton_5.setBounds(581, 161, 107, 31);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Owner Page");
		btnNewButton_6.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				ownerpage p2=new ownerpage();
            	p2.setVisible(true);
            	p2.getContentPane().setLayout(null);
			}
		});
		btnNewButton_6.setBounds(408, 298, 174, 39);
		contentPane.add(btnNewButton_6);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Dell\\eclipse-workspace\\Javasqlconnector\\src\\hackthon\\police.updated (1).png"));
		lblNewLabel.setBounds(224, 85, 174, 203);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Dell\\eclipse-workspace\\Javasqlconnector\\src\\hackthon\\user(2) (1).png"));
		lblNewLabel_1.setBounds(40, 96, 174, 203);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Dell\\eclipse-workspace\\Javasqlconnector\\src\\hackthon\\owner_logo2-removebg-preview-removebg-preview.png"));
		lblNewLabel_2.setBounds(408, 96, 174, 203);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Dell\\eclipse-workspace\\Javasqlconnector\\src\\hackthon\\download (2) (3).jpg"));
		lblNewLabel_3.setBounds(0, 0, 733, 485);
		contentPane.add(lblNewLabel_3);
	}
}

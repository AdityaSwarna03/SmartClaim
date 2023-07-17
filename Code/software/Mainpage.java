package software;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.SystemColor;

public class Mainpage extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected static Object dispose;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mainpage frame = new Mainpage();
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
	public Mainpage() {
		setTitle("Smart Claim\r\n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 655, 534);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.info);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Smart \r\nClaim");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		dispose();
        		TotalLogin p2=new TotalLogin();
            	p2.setVisible(true);
            	p2.getContentPane().setLayout(null);
        	}
        });
		btnNewButton.setBounds(269, 181, 107, 65);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Dell\\eclipse-workspace\\Javasqlconnector\\src\\hackthon\\Screenshot 2022-05-06 191054.jpg"));
		lblNewLabel.setBounds(77, 44, 480, 377);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("our life dont have assurance  ");
		lblNewLabel_1.setFont(new Font("Stencil", Font.ITALIC, 17));
		lblNewLabel_1.setBounds(113, 431, 383, 35);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("So get Insurance......");
		lblNewLabel_2.setFont(new Font("Stencil", Font.ITALIC, 17));
		lblNewLabel_2.setBounds(369, 459, 311, 28);
		contentPane.add(lblNewLabel_2);
	}
}

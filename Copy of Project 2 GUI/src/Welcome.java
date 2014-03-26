import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
/**
 * 
 * @author Gil and Jahannie
 *
 */

public class Welcome {
	private static JFrame mainFrame;
	private static JFrame enterFrame ;
	private static JFrame signUpFrame;
	public static LobbyPanel openLobby;
	
	
	public static void main(String[] args) {
		mainFrame = new JFrame();
		mainFrame.setLayout(null);
		JLabel background = new JLabel();
		ImageIcon welcomeImage = new ImageIcon("C:\\Users\\Gil\\workspaceP2\\Project 2 GUI\\src\\welcome.jpg");
		background.setIcon(welcomeImage);
		background.setBounds(0,0,1130,600);
		
		
		
		JButton login = new JButton("Login");
		login.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent arg0) {
					mainFrame.setVisible(false);
					enterFrame = new JFrame("Login");
					enterFrame.setLayout(null);
					JTextField userName = new JTextField("Username");
					userName.setBounds(415,200,300,25);
					
					JTextField password = new JTextField("Password");
					password.setBounds(415,230,300,25);
					
					JButton enter = new JButton("Enter");
					JButton back = new JButton("Go back");
					back.setBounds(25, 510, 300, 25);
					back.addActionListener(new ActionListener(){

						@Override
						public void actionPerformed(ActionEvent arg0) {
							mainFrame.setVisible(true);
							enterFrame.setVisible(false);
						}
						
					});
					
					
					enter.setBounds(415,260,300,25);
					enter.addActionListener(new ActionListener(){

						@Override
						public void actionPerformed(ActionEvent arg0) {
							openLobby = new LobbyPanel();
							mainFrame.setVisible(false);
							enterFrame.setVisible(false);
						}
						
					});
					
					JLabel background = new JLabel();
					ImageIcon welcomeImage = new ImageIcon("C:\\Users\\Gil\\workspaceP2\\Project 2 GUI\\src\\welcome.jpg");
					background.setIcon(welcomeImage);
					background.setBounds(0,0,1130,600);
					
					background.add(userName);
					background.add(password);
					background.add(enter);
					enterFrame.add(back);
					enterFrame.setSize(1130,600);
					enterFrame.add(background);
					enterFrame.setVisible(true);
					enterFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				}
				
			});
		JButton signUp = new JButton("Sign Up");
		signUp.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				mainFrame.setVisible(false);
				signUpFrame = new JFrame("Sign Up");
				signUpFrame.setLayout(null);
				JTextField userName = new JTextField("Username");
				userName.setBounds(415,200,300,25);
				
				JTextField password = new JTextField("Password");
				password.setBounds(415,230,300,25);
				
				JButton enter = new JButton("Register");
				enter.setBounds(415,260,300,25);
				JButton back = new JButton("Go back");
				back.setBounds(25, 510, 300, 25);
				back.addActionListener(new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent arg0) {
						mainFrame.setVisible(true);
						signUpFrame.setVisible(false);
					}
					
				});
				
				enter.addActionListener(new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent arg0) {
						openLobby = new LobbyPanel();
						mainFrame.setVisible(false);
						signUpFrame.setVisible(false);	
						
					}
					
				});
				
				JLabel background = new JLabel();
				ImageIcon welcomeImage = new ImageIcon("C:\\Users\\Gil\\workspaceP2\\Project 2 GUI\\src\\welcome.jpg");
				background.setIcon(welcomeImage);
				background.setBounds(0,0,1130,600);
				
				background.add(userName);
				background.add(password);
				background.add(enter);
				background.add(back);
				signUpFrame.setSize(1130,600);
				signUpFrame.add(background);
				signUpFrame.setVisible(true);
				signUpFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			}
			
		});
		JButton guest = new JButton("Enter as Guest");
		guest.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				
						
						
				
			}
			
		});
		
		login.setBounds(415,200,300,25);
		signUp.setBounds(415,230,300,25);
		guest.setBounds(415,260,300,25);
		
		background.add(login);
		background.add(signUp);
		background.add(guest);
		mainFrame.setSize(1130,600);
		mainFrame.add(background);
		mainFrame.setVisible(true);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

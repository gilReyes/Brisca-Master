import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LobbyPanel {
	public static JPanel rightPanel;
	public static  JFrame frameLobby;
	public static JLabel backgroundLabel;
	public static JPanel backgroundPanel;
	public static JPanel cardPanel;
	public static JButton createGameButton;
	public static 	GamePanel gamePanel;
	public static JButton goBackToGame;
	public LobbyPanel() {
		drawGUI();
	}

	public void drawGUI() {

		frameLobby = new JFrame();
		frameLobby.setResizable(false);
		frameLobby.setSize(1105, 725);
		frameLobby.setLayout(null);
		frameLobby.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Background (Icon Label)
		ImageIcon backgroundWood = new ImageIcon("C:\\Users\\Gil\\workspaceP2\\Project 2 GUI\\src\\blackWood.jpg");
		backgroundLabel = new JLabel();
		backgroundLabel.setLayout(null);
		backgroundLabel.setBounds(0, 0, 1100, 700);
		backgroundLabel.setIcon(backgroundWood);

		// Background Panel (Left Right)
		backgroundPanel = new JPanel();
		backgroundPanel.setLayout(null);
		backgroundPanel.setBounds(0, 0, 1100, 700);
		backgroundPanel.add(backgroundLabel);

		// Left Panel (Profile Chat)
		JPanel leftPanel = new JPanel();
		leftPanel.setBounds(25, 25, 250, 650);
		leftPanel.setLayout(null);
		leftPanel.setOpaque(false);
		backgroundLabel.add(leftPanel);

		JPanel profile = new JPanel();
		profile.setBackground(Color.BLACK);
		profile.setBounds(0, 0, 250, 200);
		leftPanel.add(profile);

		JPanel chat = new JPanel();
		chat.setBackground(Color.BLACK);
		chat.setBounds(0, 210, 250, 440);
		leftPanel.add(chat);

		// Right Panel (Players Tables)

		rightPanel = new JPanel();
		rightPanel.setBounds(300, 25, 775, 650);
		rightPanel.setOpaque(false);
		rightPanel.setLayout(new CardLayout());



		cardPanel= new JPanel();
		cardPanel.setBounds(300, 25, 775, 650);
		cardPanel.setOpaque(false);
		cardPanel.setLayout(null);
		
		JPanel players = new JPanel();
		players.setBackground(Color.BLACK);
		players.setBounds(0, 0, 380, 650);
		cardPanel.add(players);

		JPanel tables = new JPanel();
		tables.setBackground(Color.BLACK);
		tables.setBounds(390, 0, 385, 650);
		cardPanel.add(tables);
		
		rightPanel.add(cardPanel);
		backgroundLabel.add(rightPanel);
		// Create Game button

		createGameButton = new JButton("Create Game");
		createGameButton.setBounds(100, 180, 150, 25);
		createGameButton.setBackground(Color.RED);
		
		goBackToGame = new JButton("Go back to game");
		goBackToGame.setBounds(300,600,150,25);
		goBackToGame.setBackground(Color.RED);
		tables.add(goBackToGame);
		
		
		goBackToGame.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				LobbyPanel.showGame(Welcome.openLobby);
				
			}
		});
		

		createGameButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				GameList game = new GameList();
				createGameButton.setVisible(false);
				
			}

		});

		backgroundLabel.add(createGameButton);

		frameLobby.add(backgroundPanel);
		frameLobby.setVisible(true);

	}
	
	public static void showGame(LobbyPanel openLobby) {
		
	gamePanel = new GamePanel();
		gamePanel.setBounds(300, 25, 775, 650);
		rightPanel.add(gamePanel);
		rightPanel.add(cardPanel);
		backgroundLabel.add(rightPanel);
		frameLobby.add(backgroundPanel);
		frameLobby.setVisible(true);
		rightPanel.repaint();
		
	}
public static void showLobby(LobbyPanel openLobby) {
		
		
		rightPanel.add(cardPanel);
		rightPanel.add(gamePanel);
		backgroundLabel.add(rightPanel);
		frameLobby.add(backgroundPanel);
		rightPanel.repaint();
		
	}
}
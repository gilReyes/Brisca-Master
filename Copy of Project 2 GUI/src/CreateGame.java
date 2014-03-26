import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class CreateGame  {
	private static JFrame frame;
	
public CreateGame(){
		drawGUI();
}
		
	public  void drawGUI() {
		 frame = new JFrame();
		 frame.setResizable(false);
		 frame.setSize(350, 400);   
		
		
		 
		 JPanel backgroundPanel = new JPanel();
		 backgroundPanel.setBounds(0, 0, 350, 400);
		 backgroundPanel.setLayout(null);
		 
		
		 ImageIcon backgroundWood = new ImageIcon("C:\\Users\\Gil\\workspaceP2\\Project 2 GUI\\src\\blackWood.jpg");
		 JLabel backgroundLabel = new JLabel();
		 backgroundLabel.setLayout(null);
		 backgroundLabel.setBounds(0, 0, 350, 400);
		 backgroundLabel.setIcon(backgroundWood);
		 
		
		 
		 //1Buttons Game Mode
		 JTextField gameModeText = new JTextField("Game Mode:");
		 gameModeText.setBounds(25,50,85,25);
		 gameModeText.setBackground(Color.WHITE);
		 gameModeText.setEditable(false);
		 gameModeText.setBorder(null);
		 
		 JRadioButton single = new JRadioButton("Single");
		 single.setBounds(110,50,100,25);
		 single.setBackground(Color.WHITE);
		 
		 
		 JRadioButton tournament = new JRadioButton("Tournament"); 
		 tournament.setBounds(210,50,100,25);
		 tournament.setBackground(Color.WHITE);
		 
		 backgroundLabel.add(single);
		 backgroundLabel.add(tournament);
		 backgroundLabel.add(gameModeText);
		 
		 ButtonGroup gameMode = new ButtonGroup();
			gameMode.add(single);
			gameMode.add(tournament);
					 
		//2Buttons Black Hand
			 JTextField blackHandText = new JTextField("Black hand:");
			 blackHandText.setBounds(25,80,85,25);
			 blackHandText.setBackground(Color.WHITE);
			 blackHandText.setEditable(false);
			 blackHandText.setBorder(null);
			 
			 JRadioButton enableBH = new JRadioButton("Enable");
			 enableBH.setBounds(110,80,100,25);
			 enableBH.setBackground(Color.WHITE);
			 
			 
			 JRadioButton disableBH = new JRadioButton("Disable"); 
			 disableBH.setBounds(210,80,100,25);
			 disableBH.setBackground(Color.WHITE);
			 
			 backgroundLabel.add(enableBH);
			 backgroundLabel.add(disableBH);
			 backgroundLabel.add(blackHandText);
			 
			 ButtonGroup blackHandGroup = new ButtonGroup();
			 blackHandGroup.add(enableBH);
			 blackHandGroup.add(disableBH);
		 
			 //3Buttons Change card
			 JTextField changeText = new JTextField("Change cards:");
			 changeText.setBounds(25,110,85,25);
			 changeText.setBackground(Color.WHITE);
			 changeText.setEditable(false);
			 changeText.setBorder(null);
			 
			 JRadioButton enableChange = new JRadioButton("Enable");
			 enableChange.setBounds(110,110,100,25);
			 enableChange.setBackground(Color.WHITE);
			 
			 
			 JRadioButton disableChange = new JRadioButton("Disable"); 
			 disableChange.setBounds(210,110,100,25);
			 disableChange.setBackground(Color.WHITE);
			 
			 backgroundLabel.add(enableChange);
			 backgroundLabel.add(disableChange);
			 backgroundLabel.add(changeText);
			 
			 ButtonGroup changeGroup = new ButtonGroup();
			 changeGroup.add(enableChange);
			 changeGroup.add(disableChange);
		
			//4Buttons Change hand
			 JTextField changeHandText = new JTextField("Change hand:");
			 changeHandText.setBounds(25,140,85,25);
			 changeHandText.setBackground(Color.WHITE);
			 changeHandText.setEditable(false);
			 changeHandText.setBorder(null);
			 
			 JRadioButton enableHandChange = new JRadioButton("Enable");
			 enableHandChange.setBounds(110,140,100,25);
			 enableHandChange.setBackground(Color.WHITE);
			 
			 
			 JRadioButton disableHandChange = new JRadioButton("Disable"); 
			 disableHandChange.setBounds(210,140,100,25);
			 disableHandChange.setBackground(Color.WHITE);
			 
			 backgroundLabel.add(enableHandChange);
			 backgroundLabel.add(disableHandChange);
			 backgroundLabel.add(changeHandText);
			 
			 ButtonGroup changeHandGroup = new ButtonGroup();
			 changeHandGroup.add(enableHandChange);
			 changeHandGroup.add(disableHandChange);
			 
			//5Buttons time limit
			 JTextField timeLimit = new JTextField("Time limit:");
			 timeLimit.setBounds(25,170,85,25);
			 timeLimit.setBackground(Color.WHITE);
			 timeLimit.setEditable(false);
			 timeLimit.setBorder(null);
			 
			 JRadioButton timeEnable = new JRadioButton("Enable");
			 timeEnable.setBounds(110,170,100,25);
			 timeEnable.setBackground(Color.WHITE);
			 
			 
			 JRadioButton timeDisable = new JRadioButton("Disable"); 
			 timeDisable.setBounds(210,170,100,25);
			 timeDisable.setBackground(Color.WHITE);
			 
			 backgroundLabel.add(timeEnable);
			 backgroundLabel.add(timeDisable);
			 backgroundLabel.add(timeLimit);
			 
			 ButtonGroup timeGroup = new ButtonGroup();
			 timeGroup.add(timeEnable);
			 timeGroup.add(timeDisable);
			 
			//6Buttons Chat
			 JTextField chat = new JTextField("Chat:");
			 chat.setBounds(25,200,85,25);
			 chat.setBackground(Color.WHITE);
			 chat.setEditable(false);
			 chat.setBorder(null);
			 
			 JRadioButton chatEnable = new JRadioButton("Enable");
			 chatEnable.setBounds(110,200,100,25);
			 chatEnable.setBackground(Color.WHITE);
			 
			 
			 JRadioButton chatDisable = new JRadioButton("Disable"); 
			 chatDisable.setBounds(210,200,100,25);
			 chatDisable.setBackground(Color.WHITE);
			 
			 backgroundLabel.add(chatEnable);
			 backgroundLabel.add(chatDisable);
			 backgroundLabel.add(chat);
			 
			 ButtonGroup chatGroup = new ButtonGroup();
			 chatGroup.add(chatEnable);
			 chatGroup.add(chatDisable);
			 
			//7Buttons Score
			 JTextField score = new JTextField("Score:");
			 score.setBounds(25,230,85,25);
			 score.setBackground(Color.WHITE);
			 score.setEditable(false);
			 score.setBorder(null);
			 
			 JRadioButton scoreEnable = new JRadioButton("Enable");
			 scoreEnable.setBounds(110,230,100,25);
			 scoreEnable.setBackground(Color.WHITE);
			 
			 
			 JRadioButton scoreDisable = new JRadioButton("Disable"); 
			 scoreDisable.setBounds(210,230,100,25);
			 scoreDisable.setBackground(Color.WHITE);
			 
			 backgroundLabel.add(scoreEnable);
			 backgroundLabel.add(scoreDisable);
			 backgroundLabel.add(score);
			 
			 ButtonGroup scoreGroup = new ButtonGroup();
			 scoreGroup.add(scoreEnable);
			 scoreGroup.add(scoreDisable);
			 
			 // Table Name
			 JTextField name = new JTextField("Table name:");
			 name.setBounds(25,260,85,25);
			 name.setBackground(Color.WHITE);
			 name.setEditable(false);
			 name.setBorder(null);
			 
			 JTextField nameSpace = new JTextField();
			 nameSpace.setBounds(115,260,195,25);
			 nameSpace.setBackground(Color.WHITE);
			 nameSpace.setEditable(true);
			 nameSpace.setBorder(null);
					 
			 backgroundLabel.add(name);
			 backgroundLabel.add(nameSpace);
			 
			//Create Game button/Option Text
			 
			 final JButton doneGameButton = new JButton("Create Game");
			 doneGameButton.setBounds(105,320,120,25);
			 doneGameButton.setBackground(Color.RED);
			 doneGameButton.addActionListener(new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent arg0) {
						frame.setVisible(false);
						LobbyPanel.showGame(Welcome.openLobby);
						
						
						
						
					}
					
				});
			 
			 
			 JTextField options = new JTextField("Options");
			 options.setBounds(105,0,120,35);
			 options.setBackground(Color.RED);
			 options.setFont(new Font("Trebuchet MS", Font.BOLD, 32));
			 options.setEditable(false);
			 options.setBorder(null);
			 
			 backgroundLabel.add(options);
			 backgroundLabel.add(doneGameButton);
			
			 
		 backgroundPanel.add(backgroundLabel);
		 frame.add(backgroundPanel);
		 frame.setVisible(true);
		
}
}
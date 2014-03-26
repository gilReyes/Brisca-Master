import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedInputStream;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.Timer;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GamePanel extends JPanel{
	public GamePanel(){
		
		
	}
	private Rectangle card1;
	private Rectangle card2;
	private Rectangle card3;
	private Rectangle opponentcard;
	private Rectangle opponentcard1;
	private Rectangle opponentcard2;
	Timer cardMover;
	Point pick ;
	int y=525;
	int x=160;
	int x2=265;
	int c1=0;
	int y2=525;
	int x3=370;
	int y3=525;
	@Override
	public  void paintComponent(Graphics g){
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;
		cardMover = new Timer(1,new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent evt) {
				if(c1==1){
					y=y-10;
					x=x+5;
					if(x==265){
						((Timer)evt.getSource()).stop();
					}
					else if(y==395){
						((Timer)evt.getSource()).stop();
					}
				}
				else if (c1==0){
					y2=y2-10;
					if(y2==395){
						((Timer)evt.getSource()).stop();
					}
				}
				else if(c1==2){
					y3=y3-10;
					x3=x3-5;
					
					if(x3==265){
						((Timer)evt.getSource()).stop();
					}
					else if(y3==395){
						((Timer)evt.getSource()).stop();
					}
				}
				
				repaint();
			}
			
		});
		JPanel background = new JPanel();
		ImageIcon backGroundImage = new ImageIcon("C:\\Users\\Gil\\workspaceP2\\Project 2 GUI\\src\\gameBoard.jpg");
		JLabel backgroundLabel = new JLabel(){
			public  void paintComponent(Graphics g){
				super.paintComponent(g);
				Graphics2D g2 = (Graphics2D)g;
				card1 = new Rectangle(x,y,90,120);
				card2 = new Rectangle(x2,y2,90,120);
				card3 = new Rectangle(x3,y3,90,120);
				
				ImageIcon card = new ImageIcon("C:\\Users\\Gil\\workspaceP2\\Project 2 GUI\\src\\Cartas\\oros_6.jpg");
				Image img = card.getImage();
				g.drawImage(img, card1.x, card1.y, card1.width, card1.height, null);
				g.drawImage(img, card2.x, card2.y, card2.width, card2.height, null);
				g.drawImage(img, card3.x, card3.y, card3.width, card3.height, null);
				
				
				
				
				g2.draw(card1);
				g2.draw(card2);
				g2.draw(card3);
				
				
				ImageIcon cardFaceDown = new ImageIcon("C:\\Users\\Gil\\workspaceP2\\Project 2 GUI\\src\\faceDown1.jpg");
				Image imgFaceDown = cardFaceDown.getImage();
				g.drawImage(imgFaceDown,480,200,120,80, null);
				g.drawImage(imgFaceDown, 480,300,120,80, null);
				g.drawImage(imgFaceDown, 480,400,120,80, null);
				
				
				
				ImageIcon cardFaceDown1 = new ImageIcon("C:\\Users\\Gil\\workspaceP2\\Project 2 GUI\\src\\faceDown.jpg");
				Image imgFaceDown1 = cardFaceDown1.getImage();
				
				g.drawImage(imgFaceDown,20,200,120,80, null);
				g.drawImage(imgFaceDown, 20,300,120,80, null);
				g.drawImage(imgFaceDown, 20,400,120,80, null);
				
				
			
				g.drawImage(imgFaceDown1,165,5,80,120, null);
				g.drawImage(imgFaceDown1, 265,5,80,120, null);
				g.drawImage(imgFaceDown1, 370,5,80,120, null);
				
				g.drawImage(img, 180,180,90,130,null);
				g.drawImage(imgFaceDown,180,160,120,80,null);
				
				
				
			}
		};
		
		pick= new Point();
		JPanel sideBar = new JPanel();
		JPanel information = new JPanel();
		JPanel options = new JPanel();
		JButton goBack = new JButton("Go to lobby");
		goBack.setBackground(Color.RED);
		goBack.setBounds(20, 20, 100, 25);
		goBack.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				LobbyPanel.showLobby(Welcome.openLobby);	
			}
			
		});
		options.add(goBack);
		
		this.setLayout(null);
		background.setLayout(null);
		backgroundLabel.setLayout(null);
		background.setBounds(0,0,600,650);
		backgroundLabel.setBounds(0,0,600,650);
		sideBar.setBounds(600,0,175,650);
		information.setBounds(0,0,175,487);
		options.setBounds(0,487,175,163);
		
		sideBar.setLayout(null);
		information.setBackground(Color.BLACK);
		options.setBackground(Color.BLACK);
		sideBar.add(information);
		sideBar.add(options);
		
		backgroundLabel.setIcon(backGroundImage);
		background.add(backgroundLabel);
		
		
		this.addMouseListener(new MouseListener(){
			@Override
			public void mouseClicked(MouseEvent e) {
				pick.setLocation(e.getX(),e.getY());
				int a = 0;
				if(card1.contains(pick)){
					a=1;
				}
				else if(card2.contains(pick)){
					a=2;
				}

				else if(card3.contains(pick)){
					a=3;
				}
				
				switch(a){
				case 1:	c1=1;
					cardMover.start();
					try {
						gameSounds();
					} catch (LineUnavailableException e1) {
						e1.printStackTrace();
					} catch (IOException e1) {
						e1.printStackTrace();
					} catch (UnsupportedAudioFileException e1) {
						e1.printStackTrace();
					}
					break;
				case 2:	c1=0;
					cardMover.start();
					try {
						gameSounds();
					} catch (LineUnavailableException e1) {
						e1.printStackTrace();
					} catch (IOException e1) {
						e1.printStackTrace();
					} catch (UnsupportedAudioFileException e1) {
						e1.printStackTrace();
					}
					break;
				case 3:	c1=2;
					cardMover.start();
					try {
						gameSounds();
					} catch (LineUnavailableException e1) {
						e1.printStackTrace();
					} catch (IOException e1) {
						e1.printStackTrace();
					} catch (UnsupportedAudioFileException e1) {
						e1.printStackTrace();
					}
					break;
				
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				
			}
			@Override
			public void mousePressed(MouseEvent e) {
				
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				
			}
		});
		this.add(background);
		this.add(sideBar);
	}
	public void gameSounds() throws LineUnavailableException,IOException,UnsupportedAudioFileException{
    	BufferedInputStream son = new BufferedInputStream(getClass().getResourceAsStream("sonidos/slide-1.wav"));
    	AudioInputStream ais = AudioSystem.getAudioInputStream(son);
    	Clip sonido=AudioSystem.getClip();
    	sonido.open(ais);
    	sonido.start();
    }

}

import javax.swing.JFrame;  
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import java.awt.event.MouseListener;
import java.awt.Graphics;


public class GameBoard extends JPanel implements MouseListener{
	protected JPanel upperPanel; // nested with a Jbutton and JLabels
	protected JPanel lowerPanel; // nested with JLabels
	protected JLabel drawLabel; // stats JPanel
	protected JLabel player1Label;
	protected JLabel player2Label;
	protected JLabel playerTurn; // stats JPanel
	protected JButton button; // new game button
	protected int currentPlayer = 0;
	//protected String nextPlayer = "";
	boolean activePlayer = true;
	static boolean checkBox1 = true;
	static boolean checkBox2 = true;
	static boolean checkBox3 = true;
	static boolean checkBox4 = true;
	static boolean checkBox5 = true;
	static boolean checkBox6 = true;
	static boolean checkBox7 = true;
	static boolean checkBox8 = true;
	static boolean checkBox9 = true;
	static int[] array = {2,3,4,5,6,7,8,9,10};
	int player1Score = 0;
	int player2Score = 0;
	static int win = 0;
	static int draw = 0;
		
	public GameBoard() {
		
		this.addMouseListener(this);	  
		JPanel p1 = new JPanel(); 
		button = new JButton("New Game"); 
		button.addActionListener(new NewGameButton());
		p1.add(button);
		  
		playerTurn = new JLabel("Turn:P1");
		p1.add(playerTurn);
		  
		  
		player1Label = new JLabel("P1 Wins: " + player1Score); 
		p1.add(player1Label);
		  
		player2Label = new JLabel("P2 Wins: " + player2Score); 
		p1.add(player2Label);
		  
		drawLabel = new JLabel("Draws: " + draw); 
		p1.add(drawLabel);
		  
		  
		System.out.println(p1.getAlignmentX());
		  
		  
		add(p1);
		 
	 
	
	}
	
	@Override
	public void paintComponent(Graphics g) {
    	g.setColor(Color.black);
    	g.drawLine(0, 130, 480, 130);// Top panel
    	// bottom panel
    	g.drawLine(90, 320, 390, 320);// up horizontal
        g.drawLine(90, 420, 390, 420);// bottom horizontal
        g.drawLine(190, 220, 190, 520);// left vertical
        g.drawLine(290, 220, 290, 520);//right vertical
    }  
	

	protected class NewGameButton implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			System.out.println("I was clicked");
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		Graphics g = this.getGraphics();
		
		if((e.getX() >= 90 && e.getX() <= 190) && (e.getY() >= 220 && e.getY() <= 320) && checkBox1 == true) {
			if(activePlayer == true) {
				playerTurn.setText("Turn:P2");
				g.drawLine(140, 270, 160, 290);
		        g.drawLine(140, 290, 160, 270);
				array[0] = 0;
				if(isWin()) {
					turnOff();
					player1Score += 1;
					player1Label.setText("P1 Wins: " + player1Score);
				}
				activePlayer = false;
				
			}
			else {
				playerTurn.setText("Turn:P1");
				g.drawOval(140 , 270 , 20, 20);
				array[0] = 1;
				if(isWin()) {
					turnOff(); 
					player2Score += 1;
					player2Label.setText("P2: " + player2Score);
				}
				activePlayer = true;
			}
			checkBox1 = false;
		}
		
		
		else if((e.getX() >= 190 && e.getX() <= 290) && (e.getY() >= 220 && e.getY() <= 320) && checkBox2 == true) {
			if(activePlayer == true) {
				playerTurn.setText("Turn:P2");
				g.drawLine(240, 270, 260, 290);
		        g.drawLine(240, 290, 260, 270);
				array[1] = 0;
				if(isWin()) { 
					turnOff(); 
					player1Score += 1;
					player1Label.setText("P1 Wins: " + player1Score);
				}
				activePlayer = false;
				
			}
			else {
				playerTurn.setText("Turn:P1");
				g.drawOval(240 , 270 , 20, 20);
				array[1] = 1;
				if(isWin()) {
					turnOff(); 
					player2Score += 1;
					player2Label.setText("P2 Wins: " + player2Score);
				}
				activePlayer = true;
			}
			checkBox2 = false;		
		}
		
		
		else if((e.getX() >= 290 && e.getX() <= 390) && (e.getY() >= 220 && e.getY() <= 320) && checkBox3 == true) {
			if(activePlayer == true) {
				playerTurn.setText("Turn:P2");
				g.drawLine(340, 270, 360, 290);
		        g.drawLine(340, 290, 360, 270);
		        array[2] = 0;
				if(isWin()) {
					turnOff();
					player2Score += 1;
					player1Label.setText("P1 Wins: " + player1Score);
				}
				activePlayer = false;
				
			}
			else {
				playerTurn.setText("Turn:P1");
				g.drawOval(340 , 270 , 20, 20);
				array[2] = 1;
				if(isWin()) { 
					turnOff();
					player2Score += 1;
					player2Label.setText("P2 Wins: " + player2Score);
				}
				activePlayer = true;
			}
			checkBox3 = false;

		}
		
		else if((e.getX() >= 90 && e.getX() <= 190) && (e.getY() >= 320 && e.getY() <= 420) && checkBox4 == true) {
			if(activePlayer == true) {
				playerTurn.setText("Turn:P2");
				g.drawLine(140, 370, 160, 390);
		        g.drawLine(140, 390, 160, 370);
		        array[3] = 0;
				if(isWin()) { 
					turnOff();
					player1Score += 1;
					player1Label.setText("P1 Wins: " + player1Score);
				}
				activePlayer = false;
				
			}
			else {
				playerTurn.setText("Turn:P1");
				//nextPlayer = "P2";
				g.drawOval(140 , 370 , 20, 20);
				array[3] = 1;
				if(isWin()) { 
					turnOff();
					player2Score += 1;
					player2Label.setText("P2 Wins: " + player2Score);
				}
				activePlayer = true;
				
			}
			checkBox4 = false;
		}
		
		else if((e.getX() >= 190 && e.getX() <= 290) && (e.getY() >= 320 && e.getY() <= 420) && checkBox5 == true) {
			if(activePlayer == true) {
				//nextPlayer = "P1";
				playerTurn.setText("Turn:P2");
				g.drawLine(240, 370, 260, 390);
		        g.drawLine(240, 390, 260, 370);
		        array[4] = 0;
				if(isWin()) { 
					turnOff();
					player1Score += 1;
					player1Label.setText("P1 Wins: " + player1Score);
				}
				activePlayer = false;
			}
			else {
				playerTurn.setText("Turn:P1");
				//nextPlayer = "P2";
				g.drawOval(240 , 370 , 20, 20);
				array[4] = 1;
				if(isWin()) {
					turnOff();
					player2Score += 1;
					player2Label.setText("P2 Wins: " + player2Score);
				}
				activePlayer = true;
			}
			checkBox5 = false;
		}
		
		else if((e.getX() >= 290 && e.getX() <= 390) && (e.getY() >= 320 && e.getY() <= 420) && checkBox6 == true) {
			if(activePlayer == true) {
				playerTurn.setText("Turn:P2");
				//nextPlayer = "P1";
				g.drawLine(340, 370, 360, 390);
		        g.drawLine(340, 390, 360, 370);
		        array[5] = 0;
				if(isWin()) { 
					turnOff();
					player1Score += 1;
					player1Label.setText("P1 Wins: " + player1Score);
				}
				activePlayer = false;
			}
			else {
				playerTurn.setText("Turn:P1");
				//nextPlayer = "P2";
				g.drawOval(340 , 370 , 20, 20);
				array[5] = 1;
				if(isWin()) {
					turnOff();
					player2Score += 1;
					player2Label.setText("P2 Wins: " + player2Score);
				}
				activePlayer = true;
			}			
			checkBox6 = false;
		}
		
		else if((e.getX() >= 90 && e.getX() <= 190) && (e.getY() >= 420 && e.getY() <= 520) && checkBox7 == true) {
			if(activePlayer == true) {
				playerTurn.setText("Turn:P2");
				//nextPlayer = "P2";
				g.drawLine(140, 470, 160, 490);
		        g.drawLine(140, 490, 160, 470);
		        array[6] = 0;
				if(isWin()) { 
					turnOff();
					player1Score += 1;
					player1Label.setText("P1 Wins: " + player1Score);
				}
				activePlayer = false;
			}
			else {
				playerTurn.setText("Turn:P1");
				//nextPlayer = "P1";
				g.drawOval(140 , 470 , 20, 20);
				array[6] = 1;
				if(isWin()) { 
					turnOff();
					player2Score += 1;
					player2Label.setText("P2 Wins: " + player2Score);
				}
				activePlayer = true;
			}
			checkBox7 = false;
		}
		
		else if((e.getX() >= 190 && e.getX() <= 290) && (e.getY() >= 420 && e.getY() <= 520) && checkBox8 == true) {
			if(activePlayer == true) {
				playerTurn.setText("Turn:P2");
				//nextPlayer = "P1";
				g.drawLine(240, 470, 260, 490);
		        g.drawLine(240, 490, 260, 470);
		        array[7] = 0;
				if(isWin()) {
					turnOff();
					player1Score += 1;
					player1Label.setText("P1 Wins: " + player1Score);
				}
				activePlayer = false;
			}
			else {
				playerTurn.setText("Turn:P1");
				//nextPlayer = "P2";
				g.drawOval(240 , 470 , 20, 20);
				array[7] = 1;
				if(isWin()) {
					turnOff();
					player2Score += 1;
					player2Label.setText("P2 Wins: " + player2Score);
				}
				activePlayer = true;
			}
			checkBox8 = false;
		}
		
		else if((e.getX() >= 290 && e.getX() <= 390) && (e.getY() >= 420 && e.getY() <= 520) && checkBox9 == true) {
			if(activePlayer == true) {
				playerTurn.setText("Turn:P2");
				//nextPlayer = "P1";
				g.drawLine(340, 470, 360, 490);
		        g.drawLine(340, 490, 360, 470);
				array[8] = 0;
				if(isWin()) {
					turnOff();
					player1Score += 1;
					player1Label.setText("P1 Wins: " + player1Score);
				}
				activePlayer = false;
			}
			else {
				playerTurn.setText("Turn:P1");
				//nextPlayer = "P2";
				g.drawOval(340 , 470 , 20, 20);
				array[8] = 1;
				if(isWin()) { 
					turnOff();
					player2Score += 1;
					player2Label.setText("P2 Wins: " + player2Score);
				}
				activePlayer = true;
			}
			checkBox9 = false;
		}
		else
			System.out.println("You clicked outside the board area");
		
		if(isDraw()) {
			draw += 1;
			drawLabel.setText("Draws: " + draw);
		}
	}
	public static boolean isWin() {
		if(array[0] == array[1] && array[1] == array[2]) {
			return true;
		}
		else if(array[3] == array[4] && array[4] == array [5]) {
			return true;
		}
		else if(array[6] == array[7]  && array[7] == array [8]) {
			return true;
		}
		else if(array[0] == array[3] && array[3] == array[6]) {
			return true;
		}
		else if(array[1] == array[4] && array[4] == array[7]) {
			return true;
		}
		else if(array[2] == array[5] && array[5] == array[8]) {
			return true;
		}
		else if(array[0] == array[4] && array[4] == array[8]) {
			return true;
		}
		else if(array[2] == array[4] && array[4] == array[6]) {
			return true;
		}
		return false;
		
	}
	public static boolean isDraw() {
		if(!isWin()) {
			if(checkBox1 == false && checkBox2 == false && checkBox3 == false && checkBox4 == false && checkBox5 == false 
					&& checkBox6 == false && checkBox7 == false && checkBox8 == false && checkBox9 == false) 
				return true;
		}
		return false;
	}
	
	
	public void turnOff() {
		checkBox1 = false;
		checkBox2 = false;
		checkBox3 = false;
		checkBox4 = false;
		checkBox5 = false;
		checkBox6 = false;
		checkBox7 = false;
		checkBox8 = false;
		checkBox9 = false;	
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
	}
	@Override
	public void mouseReleased(MouseEvent e) {
	}
	@Override
	public void mouseEntered(MouseEvent e) {
	}
	@Override
	public void mouseExited(MouseEvent e) {
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		GameBoard gamePlay = new GameBoard();
		frame.add(gamePlay);
		frame.setTitle("TicTacToe");
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setSize(480,610);
		frame.setVisible(true);
	}
}

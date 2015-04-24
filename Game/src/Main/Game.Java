package Main;

import javax.swing.JFrame;
public class Game {

	public static void main(String[] args) {
		
		JFrame window = new JFrame("Dream Jumper");
		window.setContentPane(new GamePanel());
		
	}
}

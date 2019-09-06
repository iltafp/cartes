package ihm;

import javax.swing.JButton;
import javax.swing.JFrame;

public class PokerWindow extends JFrame {
	private JButton buttonDraw;
	
	public PokerWindow() {
		// init components
		buttonDraw = new JButton("Draw");
		this.add(buttonDraw);
		// events
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		// finalisation
		this.pack();
	}
	
	public static void main(String[] args) {
		 javax.swing.SwingUtilities.invokeLater(() -> {
	                PokerWindow ihm = new PokerWindow();
	                ihm.setVisible(true);
	            });
	}
}

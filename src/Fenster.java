import java.awt.*;
import javax.swing.*;
//import javax.swing.JPanel;

public class Fenster extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel label;
	JPanel panel, panel2, panel3;
	String[] zahlen = { "7", "8", "9", "4", "5", "6", "1", "2", "3", "0" };

	Fenster(String titel) {
		super(titel);
		setSize(240, 240);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		panel = new JPanel();
		panel2 = new JPanel();
		add(panel, BorderLayout.SOUTH);
		
		panel.setLayout(new BorderLayout());
		panel2.setLayout(new GridLayout(4, 3, 3, 3));
		panel.add(panel2, BorderLayout.WEST);
		JButton[] button = new JButton[zahlen.length];
		for (int i = 0; i < zahlen.length; i++) {
			button[i] = new JButton(zahlen[i]);
			panel2.add(button[i]);

		}

	}

	public static void main(String[] args) {

		Fenster fenster = new Fenster("Taschenrechner");
		fenster.setVisible(true);

	}

}

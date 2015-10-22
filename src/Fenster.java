import java.awt.FlowLayout;

import java.awt.*;
import javax.swing.*;
//import javax.swing.JPanel;

public class Fenster extends JFrame {
	
	JLabel label;
	JPanel panel;
	
	Fenster(String titel){
		super(titel);
		setSize(480, 480);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		label = new JLabel("Hallo Welt");
		add(label);
		
		
	}
	
	public static void main(String[] args){
		
		Fenster fenster =new Fenster("Test");
		Operationen op = new Operationen();
		System.out.println(op.add(2, 3));
		fenster.setVisible(true);
		
	}

}

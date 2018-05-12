package pl.edu.pw.fizyka.pojava.grajak;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class RightPanelClass extends JPanel{
	
		JButton animation;
		JButton doCalculations;
		
	public RightPanelClass() {	
		this.setLayout(new GridLayout(2, 1));
		animation = new JButton("Animacja");
		doCalculations = new JButton("Wykonaj obliczenia");
		
		this.add(animation);
		this.add(doCalculations);
	
		
	}

}

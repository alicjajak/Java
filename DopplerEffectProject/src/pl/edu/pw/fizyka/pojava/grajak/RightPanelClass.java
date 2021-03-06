package pl.edu.pw.fizyka.pojava.grajak;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JPanel;
import javax.swing.JSlider;

public class RightPanelClass extends JPanel{
	
		ButtonsPanelClass b;
		CalculationsPanel c;
	
		JButton animation;
		JButton doCalculationsButton;
		
	public RightPanelClass(ButtonsPanelClass butt, CalculationsPanel cal) {
		b=butt;
		c=cal;
		
		this.setLayout(new GridLayout(2, 1));
		animation = new JButton("Animacja");
		doCalculationsButton = new JButton("Wykonaj obliczenia");
		
		this.add(animation);
		this.add(doCalculationsButton);
	
		doCalculationsButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//b.sliderVrecipient.getValue();
				//b.sliderVsource.getValue();
				//c.labelCalFrequency.setText(String.valueOf(b.frequencySound.getSelectedItem()));
				c.labelCalFrequency.setText(String.valueOf(((340+b.sliderVrecipient.getValue())/(340+b.sliderVsource.getValue()))));
				c.labelCalWavelength.setText(String.valueOf(((340+b.sliderVrecipient.getValue())/(340+b.sliderVsource.getValue()))/340));
			}
		});
	}
	

}

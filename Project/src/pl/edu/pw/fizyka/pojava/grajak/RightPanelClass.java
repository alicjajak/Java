package pl.edu.pw.fizyka.pojava.grajak;

import java.awt.BorderLayout;
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
		CalculationsPanelClass c;
	
		JButton animation;
		JButton doCalculationsButton;
		
		int f;
		
	public RightPanelClass(ButtonsPanelClass butt, CalculationsPanelClass cal) {
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
				 if (b.frequencySound.getSelectedItem().equals("260 Hz")) {
		        	   f=260;
		         }
				 else if(b.frequencySound.getSelectedItem().equals("800 Hz")) {
					  f=800;
				 }else if(b.frequencySound.getSelectedItem().equals("1200 Hz")) {
					  f=1200;
				 }
				// TODO Auto-generated method stub
				//b.sliderVrecipient.getValue();
				//b.sliderVsource.getValue();
				//c.labelCalFrequency.setText(String.valueOf(f));
				c.labelCalFrequency.setText(String.valueOf((f*(340+b.sliderVrecipient.getValue())/(340+b.sliderVsource.getValue()))));
				c.labelCalWavelength.setText(String.valueOf(((340+b.sliderVrecipient.getValue())/(340+b.sliderVsource.getValue()))/340));
			}
		});
	}
	

}

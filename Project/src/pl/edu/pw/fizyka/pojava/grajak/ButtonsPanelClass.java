package pl.edu.pw.fizyka.pojava.grajak;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ButtonsPanelClass extends JPanel {
	JPanel pV;
	JPanel pF;
	
	JSlider sliderVrecipient;
	JSlider sliderVsource;
	
	JLabel labelVrecipientInfo;
	JLabel labelVsourceInfo;
	JLabel labelVrecipientValue;
	JLabel labelVsourceValue;
	JLabel labelFrequencySoundValue;
	JLabel labelTypeOfFrequency;

	JComboBox frequencySound;
	String[] frequencyValue = { "260 Hz", "800 Hz", "1200 Hz" };
	int f=0;

	JComboBox typeOfSound;
	String[] typeSounds = { "odgłos karetki", "odgłos samolotu", "odgłos klaksonu" };
	
	public ButtonsPanelClass() {
		pV = new JPanel();
		pF = new JPanel();
	
		this.add(pV);
		this.add(pF);
		this.setLayout(new GridLayout(1, 2));
		labelVrecipientInfo = new JLabel("Prędkość odbiorcy");
		labelVsourceInfo = new JLabel("Prędkość źródła");
		sliderVrecipient = new JSlider(JSlider.HORIZONTAL, -10, 10, 0);
		sliderVsource = new JSlider(JSlider.HORIZONTAL, -50, 50, 0);
		labelVsourceValue = new JLabel(String.format(sliderVsource.getValue() + " m/s"));
		labelVrecipientValue = new JLabel(String.format(sliderVrecipient.getValue() + " m/s"));
		sliderVrecipient.addChangeListener(new ChangeSliderRecipient());
		sliderVsource.addChangeListener(new ChangeSliderSource());
		typeOfSound = new JComboBox(typeSounds);
		frequencySound = new JComboBox(frequencyValue);
		labelFrequencySoundValue = new JLabel("Częstotliwość dzwięku źródła");
		labelTypeOfFrequency = new JLabel("Rodzaj dzwieku");
		
		pV.add(labelVsourceInfo);
		pV.add(sliderVsource);
		pV.add(labelVsourceValue);
		pV.add(labelVrecipientInfo);
		pV.add(sliderVrecipient);
		pV.add(labelVrecipientValue);
		pV.setLayout(new GridLayout(2, 3));
		pF.add(labelFrequencySoundValue);
		pF.add(frequencySound);
		pF.add(labelTypeOfFrequency);
		pF.add(typeOfSound);
		pF.setLayout(new GridLayout(4, 1));	
		
	}
	// SLIDER LISTENERS
		public class ChangeSliderSource implements ChangeListener {
			@Override
			public void stateChanged(ChangeEvent arg0) {
				String valueSource = String.format(sliderVsource.getValue() + " m/s");
				labelVsourceValue.setText(valueSource);
			}
		}

		public class ChangeSliderRecipient implements ChangeListener {
			@Override
			public void stateChanged(ChangeEvent arg0) {
				String valueRecipient = String.format(sliderVrecipient.getValue() + " m/s");
				labelVrecipientValue.setText(valueRecipient);
			}
		}
}

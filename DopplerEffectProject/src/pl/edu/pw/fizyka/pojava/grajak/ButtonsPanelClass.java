package pl.edu.pw.fizyka.pojava.grajak;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ButtonsPanelClass extends JPanel {
	JPanel pV;
	JPanel pD;
	JPanel pF;
	
	JSlider sliderVrecipient;
	JSlider sliderVsource;
	
	JLabel labelVrecipientInfo;
	JLabel labelVsourceInfo;
	JLabel labelVrecipientValue;
	JLabel labelVsourceValue;
	JLabel labelSourceDirection;
	JLabel labelRecipientDirection;
	JLabel labelFrequencySoundValue;
	JLabel labelTypeOfFrequency;
	
	JButton leftArrow;
	JButton rightArrow;
	JButton leftArrowR;
	JButton rightArrowR;

	JComboBox frequencySound;
	String[] frequencyValue = { "260 Hz", "800 Hz", "1200 Hz" };

	JComboBox typeOfSound;
	String[] typeSounds = { "odgĹ‚os karetki", "odgĹ‚os samolotu", "odgĹ‚os klaksonu" };
	
	public ButtonsPanelClass() {
		pV = new JPanel();
		pD = new JPanel();
		pF = new JPanel();
	
		this.add(pV);
		this.add(pD);
		this.add(pF);
		this.setLayout(new GridLayout(1, 3));
		labelVrecipientInfo = new JLabel("PrÄ™dkoĹ›Ä‡ odbiorcy");
		labelVsourceInfo = new JLabel("PrÄ™dkoĹ›Ä‡ ĹşrĂłdĹ‚a");
		sliderVrecipient = new JSlider(JSlider.HORIZONTAL, 0, 10, 0);
		sliderVsource = new JSlider(JSlider.HORIZONTAL, 0, 50, 0);
		labelVsourceValue = new JLabel(String.format(sliderVsource.getValue() + " m/s"));
		labelVrecipientValue = new JLabel(String.format(sliderVrecipient.getValue() + " m/s"));
		sliderVrecipient.addChangeListener(new ChangeSliderRecipient());
		sliderVsource.addChangeListener(new ChangeSliderSource());
		labelSourceDirection = new JLabel("Kierunek ĹşrĂłdĹ‚a");
		labelRecipientDirection = new JLabel("Kierunek odbiorcy");
		leftArrow = new JButton("â†�");
		rightArrow = new JButton("â†’");
		leftArrowR = new JButton("â†�");
		rightArrowR = new JButton("â†’");
		typeOfSound = new JComboBox(typeSounds);
		frequencySound = new JComboBox(frequencyValue);
		labelFrequencySoundValue = new JLabel("CzÄ™stotliwoĹ›Ä‡ dzwiÄ™ku ĹşrĂłdĹ‚a");
		labelTypeOfFrequency = new JLabel("Rodzaj dzwieku");
		
		pV.add(labelVsourceInfo);
		pV.add(sliderVsource);
		pV.add(labelVsourceValue);
		pV.add(labelVrecipientInfo);
		pV.add(sliderVrecipient);
		pV.add(labelVrecipientValue);
		pV.setLayout(new GridLayout(2, 3));
		pD.add(labelSourceDirection);
		pD.add(leftArrow);
		pD.add(rightArrow);
		pD.add(labelRecipientDirection);
		pD.add(leftArrowR);
		pD.add(rightArrowR);
		pD.setLayout(new GridLayout(2, 3));
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

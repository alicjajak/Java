package pl.edu.pw.fizyka.pojava.grajak;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class MainGUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6048309859106768092L;
	public MainGUI() throws HeadlessException {
		
		this.setSize(1040,480);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();
		p4 = new JPanel();
		add(BorderLayout.EAST, p1);
		add(BorderLayout.CENTER, p2);
		add(BorderLayout.NORTH, p3);
		add(BorderLayout.SOUTH, p4);
		JPanel pV= new JPanel();
		JPanel pD= new JPanel();
		JPanel pf= new JPanel();
		JPanel pC=new JPanel(new GridLayout(3,3));
		JPanel pS = new JPanel(new FlowLayout(FlowLayout.CENTER));
		p3.add(pV);
		p3.add(pD);
		p3.add(pf);
		p3.setLayout(new GridLayout(1,3));
		p4.setLayout(new BoxLayout(p4, BoxLayout.Y_AXIS));
		p4.add(pC);
		p4.add(pS);

		
		
		animation = new JButton("Animacja");
		doCalculations = new JButton("Wykonaj obliczenia");
		p1.add(animation);
		p1.add(doCalculations);
		p1.setLayout(new GridLayout(2,1));
		labelVrecipientInfo = new JLabel("Prędkość odbiorcy");
	    labelVsourceInfo= new JLabel("Prędkość źródła");
	    sliderVrecipient = new JSlider(JSlider.HORIZONTAL, 0, 10, 0);
		sliderVsource = new JSlider(JSlider.HORIZONTAL, 0, 50, 0);
		labelVsourceValue = new JLabel(String.format( sliderVsource.getValue()+" m/s"));
		labelVrecipientValue = new JLabel(String.format( sliderVrecipient.getValue()+" m/s"));
		sliderVrecipient.addChangeListener(new ChangeSliderRecipient());
		sliderVsource.addChangeListener(new ChangeSliderSource());
		labelSourceDirection = new JLabel("Kierunek źródła");
		labelRecipientDirection= new JLabel("Kierunek odbiorcy");
		leftArrow= new JButton("←");
		rightArrow= new JButton("→");
		leftArrowR= new JButton("←");
		rightArrowR= new JButton("→");
		labelFrequencySoundValue= new JLabel("Częstotliwość dzwięku źródła");
		frequencySound = new JComboBox(frequencyValue);
	    labelTypeOfFrequency= new JLabel("Rodzaj dzwieku");
	    typeOfSound = new JComboBox(typeSounds);
	    labelDoCalculations = new JLabel("Wyniki obliczeń");
	    labelDoCalculations.setFont(new Font("default", Font.BOLD, 16));
	    labelFrequency = new JLabel ("Częstotliwość dzwięku słyszanego przez odbiorcę");
	    labelWavelength = new JLabel ("Fala");
	    labelEmpty = new JLabel ("");
	    labelEmpty2 = new JLabel("");
	    labelSpeed = new JLabel ("Obliczenia zostały wykonane dla prędkości dzwięku w powietrzu V=340m/s");
	    fieldFrequency = new JTextField("    ");
	    fieldWavelength = new JTextField("     ");
	    labelChart = new JLabel("Obraz fali dzwiekowej docierajacej do obserwatora");
	    labelInfo = new JLabel ("	Tutaj będzie rysowany wykres");
		
		pV.add(labelVsourceInfo);
		pV.add(sliderVsource);
		pV.add(labelVsourceValue);
		pV.add(labelVrecipientInfo);
		pV.add(sliderVrecipient);
		pV.add(labelVrecipientValue);
		pV.setLayout(new GridLayout(2,3));
		pD.add(labelSourceDirection);
		pD.add(leftArrow);
		pD.add(rightArrow);
		pD.add(labelRecipientDirection);
		pD.add(leftArrowR);
		pD.add(rightArrowR);
		pD.setLayout(new GridLayout(2,3));
		pf.add(labelFrequencySoundValue);
		pf.add(frequencySound);
		pf.add(labelTypeOfFrequency);
		pf.add(typeOfSound);
		pf.setLayout(new GridLayout(4,1));
		
		pC.add(labelDoCalculations);
		pC.add(labelEmpty2);
		pC.add(labelChart);	
		pC.add(labelFrequency);
		pC.add(fieldFrequency);
		pC.add(labelEmpty);
		pC.add(labelWavelength);
		pC.add(fieldWavelength);
		pC.add(labelInfo);
		pS.add(labelSpeed);
		
		p2.setBackground(Color.white);
	}

	public MainGUI(GraphicsConfiguration arg0) {
		super(arg0);
		this.setSize(1040,480);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public MainGUI(String arg0) throws HeadlessException {
		super(arg0);
		this.setSize(1040,480);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public MainGUI(String arg0, GraphicsConfiguration arg1) {
		super(arg0, arg1);
		this.setSize(1040,480);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	//klasy wewnetrzne suwaki
			public class ChangeSliderSource implements ChangeListener{
			
			@Override
			public void stateChanged(ChangeEvent arg0) {
				String valueSource = String.format( sliderVsource.getValue()+" m/s");
				labelVsourceValue.setText(valueSource);
				
			}
			
		}
			public class ChangeSliderRecipient implements ChangeListener{
				
				@Override
				public void stateChanged(ChangeEvent arg0) {
					String valueRecipient = String.format(sliderVrecipient.getValue()+" m/s");
					labelVrecipientValue.setText(valueRecipient);
				}
			}
			

	public static void main(String[] args) {
		MainGUI frame= new MainGUI();
		frame.setVisible(true);
	}
	JPanel p1;
	JPanel p2;
	JPanel p3;
	JPanel p4;
	JButton animation;
	JButton doCalculations;
	JSlider sliderVrecipient;
	JSlider sliderVsource;
    JLabel labelVrecipientInfo;
    JLabel labelVsourceInfo;
    JLabel labelVrecipientValue;
    JLabel labelVsourceValue;
    JLabel labelSourceDirection;
    JLabel labelRecipientDirection;
    JLabel labelDoCalculations;
    JLabel labelFrequency;
    JLabel labelWavelength;
    JLabel labelEmpty;
    JLabel labelSpeed;
    JLabel labelEmpty2;
    JLabel labelChart;
    JLabel labelInfo;
    JLabel labelFrequencySoundValue;
    JLabel labelTypeOfFrequency;
    
    JButton leftArrow;
    JButton rightArrow;
    JButton leftArrowR;
    JButton rightArrowR;
    
    JComboBox  frequencySound;
    String[] frequencyValue = { "260 Hz", "800 Hz", "1200 Hz"};
    
    JComboBox  typeOfSound;
    String[] typeSounds = { "odgłos karetki", "odgłos samolotu", "odgłos klaksonu"};
    
    JTextField fieldFrequency;
    JTextField fieldWavelength;
    
    
}
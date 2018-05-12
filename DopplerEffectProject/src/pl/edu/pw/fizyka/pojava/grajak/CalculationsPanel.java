package pl.edu.pw.fizyka.pojava.grajak;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.*;

public class CalculationsPanel extends JPanel{
	JPanel pC;
	JPanel pS;
	
	JLabel labelDoCalculations;
	JLabel labelFrequency;
	JLabel labelWavelength;
	JLabel labelEmpty;
	JLabel labelSpeed;
	JLabel labelEmpty2;
	JLabel labelChart;
	JLabel labelInfo;
	
	JTextField fieldFrequency;
	JTextField fieldWavelength;
	
	public CalculationsPanel() {
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		pC = new JPanel(new GridLayout(3, 3));
		pS = new JPanel(new FlowLayout(FlowLayout.CENTER));
		this.add(pC);
		this.add(pS);
		
		labelDoCalculations = new JLabel("Wyniki obliczeń");
		labelDoCalculations.setFont(new Font("default", Font.BOLD, 16));
		labelFrequency = new JLabel("Częstotliwość dzwięku słyszanego przez odbiorcę");
		labelWavelength = new JLabel("Fala");
		labelEmpty = new JLabel("");
		labelEmpty2 = new JLabel("");
		labelSpeed = new JLabel("Obliczenia zostały wykonane dla prędkości dzwięku w powietrzu V=340m/s");
		fieldFrequency = new JTextField("    ");
		fieldWavelength = new JTextField("     ");
		labelChart = new JLabel("Obraz fali dzwiekowej docierajacej do obserwatora");
		labelInfo = new JLabel("	Tutaj będzie rysowany wykres");
		
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

	}

}

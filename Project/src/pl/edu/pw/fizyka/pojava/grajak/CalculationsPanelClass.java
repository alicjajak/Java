package pl.edu.pw.fizyka.pojava.grajak;

import java.awt.*;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.JOptionPane;
import javax.swing.text.DefaultCaret;

//import org.jfree.data.xy.XYSeries;
//import org.jfree.data.xy.XYSeriesCollection;

public class CalculationsPanelClass extends JPanel{
	JPanel pC; //calculationsPanel (informacje o danych z obliczeñ)
	JPanel pS; //speedPanel(informacja o prêdkoœci)
	JPanel pB; //buttonPanel
	
	JLabel labelDoCalculations;
	JLabel labelFrequency;
	JLabel labelWavelength;
	JLabel labelEmpty;
	JLabel labelSpeed;
	JLabel labelEmpty2;
	JLabel labelChart;
	
	JLabel labelCalFrequency;//calculated frequency
	JLabel labelCalWavelength;//calculated wave length
	
	JButton buttonChart;
	
	public CalculationsPanelClass() {
		this.setLayout(new BorderLayout());
		pC = new JPanel(new GridLayout(3,2));
		pB = new JPanel (new FlowLayout());
		pS = new JPanel(new FlowLayout());
		this.add(pC, BorderLayout.CENTER);
		this.add(pB, BorderLayout.EAST);
		this.add(pS, BorderLayout.SOUTH);
		
		labelDoCalculations = new JLabel("Wyniki obliczeÅ„");
		labelDoCalculations.setFont(new Font("default", Font.BOLD, 16));
		labelFrequency = new JLabel("CzÄ™stotliwoÅ›Ä‡ dzwiÄ™ku sÅ‚yszanego przez odbiorcÄ™");
		labelWavelength = new JLabel("D³ugoœæ fali");
		labelEmpty = new JLabel("");
		labelEmpty2 = new JLabel("");
		labelSpeed = new JLabel("Obliczenia zostaÅ‚y wykonane dla prÄ™dkoÅ›ci dzwiÄ™ku w powietrzu V=340m/s");
		labelCalFrequency = new JLabel("         ");
		labelCalWavelength = new JLabel("        ");
		labelChart = new JLabel("Obraz fali dzwiekowej docierajacej do obserwatora");
		buttonChart = new JButton("Poka¿ wykres");
		//fieldFrequency.setSize(20,20);

		
		pC.add(labelDoCalculations);
		pC.add(labelEmpty2);
		//pC.add(labelChart);
		pC.add(labelFrequency);
		pC.add(labelCalFrequency);
		//.add(labelEmpty);
		pC.add(labelWavelength);
		pC.add(labelCalWavelength);;
		pS.add(labelSpeed);
		pB.add(labelChart);
		pB.add(buttonChart);
		
		buttonChart.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				createFrame();	
			}
		});
		
	}
	public static void createFrame()
    {
        EventQueue.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                JFrame frame = new JFrame("Wykres");
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.setSize(620,360);
                frame.setVisible(true);
           
               // final XYSeries chart = new XYSeries();
               //final XYSeriesCollection dataFunctions = new XYSeriesCollection();

            }
        });
    }

}


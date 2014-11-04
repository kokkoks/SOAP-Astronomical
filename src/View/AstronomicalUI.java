package View;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import Controller.AstronomicalManagement;
import Model.Astronomicals;

/**
 * User Interface of Astronomical convert
 * @author Suttanan Charoenpanich 5510547031
 *
 */
public class AstronomicalUI extends JFrame{
	private AstronomicalManagement converter;
	private JTextField value;
	private JTextField answer;
	private JComboBox fromAstronomicalUnit;
	private JComboBox toAstronomicalUnit;
	private JLabel textValue;
	private Astronomicals[] type1 = Astronomicals.values();
	private Astronomicals[] type2 = Astronomicals.values();
	private JButton convertButton;
	private JLabel text;
	private JLabel feedBackText;
	
	public AstronomicalUI(){
		super();
		converter = new AstronomicalManagement();
		run();
	}
	
	private void run(){
		textValue = new JLabel("input value");
		value = new JTextField(20);
		fromAstronomicalUnit = new JComboBox(type1);
		toAstronomicalUnit = new JComboBox(type2);
		convertButton = new JButton("Enter");
		answer = new JTextField();
		text = new JLabel("input value");
		feedBackText = new JLabel("in progress");
		
		answer.setPreferredSize(new Dimension(100,20));
		answer.setEditable(false);
		
		convertButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try{
					feedBackText.setVisible(true);
					converter.convert(value.getText(), 
					fromAstronomicalUnit.getSelectedItem(), 
						toAstronomicalUnit.getSelectedItem(),
							feedBackText,
								answer);
				} catch(NumberFormatException e) {
					JOptionPane.showMessageDialog(null,"Please input numeric");
				} catch(Exception e) {
					JOptionPane.showConfirmDialog(null, "Invalid number");
				}
			}
		});
		
		setLayout(new FlowLayout());
		add(text);
		add(value);
		add(fromAstronomicalUnit);
		add(toAstronomicalUnit);
		add(convertButton);
		add(feedBackText);
		add(answer);
		
		feedBackText.setVisible(false);
		
		setVisible(true);
		setSize(750,100);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}

package ku.astro.view;

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
import javax.swing.Timer;
import javax.xml.ws.WebServiceException;

import ku.astro.controller.AstronomicalManagement;
import ku.astro.model.Astronomicals;




/**
 * User Interface of Astronomical convert
 * 
 * @author Suttanan Charoenpanich 5510547031
 * 
 */
public class AstronomicalUI extends JFrame {
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
	private Object[] options = { "Retry", "Close" };
	private Timer timeOut;

	public AstronomicalUI() {
		super();
		while (converter == null) {
			try {
				timeOut = new Timer(10000, new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						// TODO Auto-generated method stub
						timeOut.stop();
						JOptionPane.showMessageDialog(null, "Time out");
						System.exit(0);
					}
				});
				timeOut.start();
				
				converter = new AstronomicalManagement();

				if (converter != null) {
					timeOut.stop();
				}

			} catch (WebServiceException e) {
				int n = JOptionPane
						.showOptionDialog(null, "No internet connection", null,
								JOptionPane.YES_NO_OPTION,
								JOptionPane.QUESTION_MESSAGE, null, options,
								options[0]);
				if (n == 0) {
					continue;
				} else
					System.exit(0);
			}
		}
		run();
	}

	private void run() {
		textValue = new JLabel("input value");
		value = new JTextField(20);
		fromAstronomicalUnit = new JComboBox(type1);
		toAstronomicalUnit = new JComboBox(type2);
		convertButton = new JButton("Enter");
		answer = new JTextField();
		text = new JLabel("input value");
		feedBackText = new JLabel("in progress");

		answer.setPreferredSize(new Dimension(100, 20));
		answer.setEditable(false);

		convertButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					feedBackText.setVisible(true);
					converter.convert(value.getText(),
							fromAstronomicalUnit.getSelectedItem(),
							toAstronomicalUnit.getSelectedItem(), feedBackText,
							answer);
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Please input numeric");
				} catch (WebServiceException e) {
					JOptionPane.showMessageDialog(null,
							"No internet connection");

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
		setSize(750, 100);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}

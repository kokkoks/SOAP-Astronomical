package ku.astro.controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.ExecutionException;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingWorker;
import javax.swing.Timer;

import ku.astro.model.AstronomicalUnit;
import ku.astro.model.AstronomicalUnitSoap;
import ku.astro.model.Astronomicals;




/**
 * Run multithread
 * @author Suttanan Charoenpanich 5510547031
 *
 */
public class AstronomicalWoker extends SwingWorker<Double, Void>{
	private double value;
	private Astronomicals type1;
	private Astronomicals type2;
	private JTextField answer;
	private AstronomicalUnitSoap astroSoap;
	private JLabel feedBackText;
	private Timer timerInternetCheck;
	
	public AstronomicalWoker(double value, Astronomicals type1, Astronomicals type2, JLabel feedBackText, JTextField answer, AstronomicalUnitSoap astroSoap){
		this.value = value;
		this.type1 = type1;
		this.type2 = type2;
		this.feedBackText = feedBackText;
		this.answer = answer;
		this.astroSoap = astroSoap;
	}
	
	@Override
	protected Double doInBackground() throws Exception {
		// TODO Auto-generated method stub
		timerInternetCheck = new Timer(10000, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				timerInternetCheck.stop();
				cancel(true);
				JOptionPane.showMessageDialog(null, "Time out!!");
			}
		});
		timerInternetCheck.start();
		return astroSoap.changeAstronomicalUnit(value, type1, type2);
	}

	@Override
	protected void done() {
		super.done();
		try {
			timerInternetCheck.stop();
			feedBackText.setVisible(false);
			answer.setText(get()+"");
		}
		catch (Exception e) {
			JOptionPane.showMessageDialog(null, "No internet");
			answer.setText("");
			e.printStackTrace();
		}
	}
}

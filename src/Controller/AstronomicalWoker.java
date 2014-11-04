package Controller;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingWorker;

import Model.AstronomicalUnit;
import Model.AstronomicalUnitSoap;

import Model.Astronomicals;

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
		return astroSoap.changeAstronomicalUnit(value, type1, type2);
	}

	@Override
	protected void done() {
		super.done();
		try {
			feedBackText.setVisible(false);
			answer.setText(get()+"");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

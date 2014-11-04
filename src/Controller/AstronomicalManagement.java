package Controller;
import javax.swing.JLabel;
import javax.swing.JTextField;

import Model.AstronomicalUnit;
import Model.AstronomicalUnitSoap;

import Model.Astronomicals;

/**
 * Connect with UI and swingworker. 
 * @author Suttanan Charoenpanich 5510547031
 *
 */
public class AstronomicalManagement {
	private AstronomicalWoker astroWorker;
	private AstronomicalUnitSoap astroSoap;
	private AstronomicalUnit astro;
	
    public AstronomicalManagement(){
		astro = new AstronomicalUnit();
		astroSoap =astro.getAstronomicalUnitSoap();
	}
	 
    /*
     * run multithread
     */
	public void convert(String value, Object type1, Object type2, JLabel feedBackText, JTextField answer){
		astroWorker = new AstronomicalWoker(Double.parseDouble(value),
						(Astronomicals) type1,
							(Astronomicals) type2,
								feedBackText,
									answer,
										astroSoap);
		astroWorker.execute();
	}
}

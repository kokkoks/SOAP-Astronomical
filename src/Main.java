import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import ku.astro.model.AstronomicalUnit;
import ku.astro.model.AstronomicalUnitSoap;
import ku.astro.model.Astronomicals;
import ku.astro.view.AstronomicalUI;






public class Main {
	public static void main(String arg[]){
		AstronomicalUI astronomicalUI = new AstronomicalUI();  

//		AstronomicalUnit astro = new AstronomicalUnit();
//		AstronomicalUnitSoap astroSoap = astro.getAstronomicalUnitSoap();
//		
//		System.out.println(astroSoap.changeAstronomicalUnit(20, Astronomicals.MILES, Astronomicals.LIGHTYEAR));
	}
}

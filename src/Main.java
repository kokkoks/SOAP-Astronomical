import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import Model.AstronomicalUnit;
import Model.AstronomicalUnitSoap;

import Model.Astronomicals;
import View.AstronomicalUI;


public class Main {
	public static void main(String arg[]){
		AstronomicalUI astronomicalUI = new AstronomicalUI();  

//		AstronomicalUnit astro = new AstronomicalUnit();
//		AstronomicalUnitSoap astroSoap = astro.getAstronomicalUnitSoap();
//		
//		System.out.println(astroSoap.changeAstronomicalUnit(20, Astronomicals.MILES, Astronomicals.LIGHTYEAR));
	}
}

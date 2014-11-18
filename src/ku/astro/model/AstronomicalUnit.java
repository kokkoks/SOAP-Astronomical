
package ku.astro.model;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "AstronomicalUnit", targetNamespace = "http://www.webserviceX.NET/", wsdlLocation = "http://www.webservicex.net/Astronomical.asmx?WSDL")
public class AstronomicalUnit
    extends Service
{

    private final static URL ASTRONOMICALUNIT_WSDL_LOCATION;
    private final static WebServiceException ASTRONOMICALUNIT_EXCEPTION;
    private final static QName ASTRONOMICALUNIT_QNAME = new QName("http://www.webserviceX.NET/", "AstronomicalUnit");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://www.webservicex.net/Astronomical.asmx?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ASTRONOMICALUNIT_WSDL_LOCATION = url;
        ASTRONOMICALUNIT_EXCEPTION = e;
    }

    public AstronomicalUnit() {
        super(__getWsdlLocation(), ASTRONOMICALUNIT_QNAME);
    }

    public AstronomicalUnit(WebServiceFeature... features) {
        super(__getWsdlLocation(), ASTRONOMICALUNIT_QNAME, features);
    }

    public AstronomicalUnit(URL wsdlLocation) {
        super(wsdlLocation, ASTRONOMICALUNIT_QNAME);
    }

    public AstronomicalUnit(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ASTRONOMICALUNIT_QNAME, features);
    }

    public AstronomicalUnit(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AstronomicalUnit(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns AstronomicalUnitSoap
     */
    @WebEndpoint(name = "AstronomicalUnitSoap")
    public AstronomicalUnitSoap getAstronomicalUnitSoap() {
        return super.getPort(new QName("http://www.webserviceX.NET/", "AstronomicalUnitSoap"), AstronomicalUnitSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AstronomicalUnitSoap
     */
    @WebEndpoint(name = "AstronomicalUnitSoap")
    public AstronomicalUnitSoap getAstronomicalUnitSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.webserviceX.NET/", "AstronomicalUnitSoap"), AstronomicalUnitSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ASTRONOMICALUNIT_EXCEPTION!= null) {
            throw ASTRONOMICALUNIT_EXCEPTION;
        }
        return ASTRONOMICALUNIT_WSDL_LOCATION;
    }

}
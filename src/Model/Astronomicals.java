
package Model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Astronomicals.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Astronomicals">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="meters"/>
 *     &lt;enumeration value="kilometers"/>
 *     &lt;enumeration value="miles"/>
 *     &lt;enumeration value="AstronmicalunitAU"/>
 *     &lt;enumeration value="lightyear"/>
 *     &lt;enumeration value="parsec"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Astronomicals")
@XmlEnum
public enum Astronomicals {

    @XmlEnumValue("meters")
    METERS("meters"),
    @XmlEnumValue("kilometers")
    KILOMETERS("kilometers"),
    @XmlEnumValue("miles")
    MILES("miles"),
    @XmlEnumValue("AstronmicalunitAU")
    ASTRONMICALUNIT_AU("AstronmicalunitAU"),
    @XmlEnumValue("lightyear")
    LIGHTYEAR("lightyear"),
    @XmlEnumValue("parsec")
    PARSEC("parsec");
    private final String value;

    Astronomicals(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Astronomicals fromValue(String v) {
        for (Astronomicals c: Astronomicals.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

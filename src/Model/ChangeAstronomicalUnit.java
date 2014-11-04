
package Model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AstronomicalValue" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="fromAstronomicalUnit" type="{http://www.webserviceX.NET/}Astronomicals"/>
 *         &lt;element name="toAstronomicalUnit" type="{http://www.webserviceX.NET/}Astronomicals"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "astronomicalValue",
    "fromAstronomicalUnit",
    "toAstronomicalUnit"
})
@XmlRootElement(name = "ChangeAstronomicalUnit")
public class ChangeAstronomicalUnit {

    @XmlElement(name = "AstronomicalValue")
    protected double astronomicalValue;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected Astronomicals fromAstronomicalUnit;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected Astronomicals toAstronomicalUnit;

    /**
     * Gets the value of the astronomicalValue property.
     * 
     */
    public double getAstronomicalValue() {
        return astronomicalValue;
    }

    /**
     * Sets the value of the astronomicalValue property.
     * 
     */
    public void setAstronomicalValue(double value) {
        this.astronomicalValue = value;
    }

    /**
     * Gets the value of the fromAstronomicalUnit property.
     * 
     * @return
     *     possible object is
     *     {@link Astronomicals }
     *     
     */
    public Astronomicals getFromAstronomicalUnit() {
        return fromAstronomicalUnit;
    }

    /**
     * Sets the value of the fromAstronomicalUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Astronomicals }
     *     
     */
    public void setFromAstronomicalUnit(Astronomicals value) {
        this.fromAstronomicalUnit = value;
    }

    /**
     * Gets the value of the toAstronomicalUnit property.
     * 
     * @return
     *     possible object is
     *     {@link Astronomicals }
     *     
     */
    public Astronomicals getToAstronomicalUnit() {
        return toAstronomicalUnit;
    }

    /**
     * Sets the value of the toAstronomicalUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Astronomicals }
     *     
     */
    public void setToAstronomicalUnit(Astronomicals value) {
        this.toAstronomicalUnit = value;
    }

}

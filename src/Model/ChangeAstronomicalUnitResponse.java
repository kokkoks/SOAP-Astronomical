
package Model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element name="ChangeAstronomicalUnitResult" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
    "changeAstronomicalUnitResult"
})
@XmlRootElement(name = "ChangeAstronomicalUnitResponse")
public class ChangeAstronomicalUnitResponse {

    @XmlElement(name = "ChangeAstronomicalUnitResult")
    protected double changeAstronomicalUnitResult;

    /**
     * Gets the value of the changeAstronomicalUnitResult property.
     * 
     */
    public double getChangeAstronomicalUnitResult() {
        return changeAstronomicalUnitResult;
    }

    /**
     * Sets the value of the changeAstronomicalUnitResult property.
     * 
     */
    public void setChangeAstronomicalUnitResult(double value) {
        this.changeAstronomicalUnitResult = value;
    }

}


package py.gov.senatics.ws.prueba;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for findPersonaByCedula complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="findPersonaByCedula">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nroCedula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findPersonaByCedula", propOrder = {
    "nroCedula"
})
public class FindPersonaByCedula {

    protected String nroCedula;

    /**
     * Gets the value of the nroCedula property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroCedula() {
        return nroCedula;
    }

    /**
     * Sets the value of the nroCedula property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroCedula(String value) {
        this.nroCedula = value;
    }

}

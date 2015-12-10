
package py.gov.senatics.ws.prueba;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for persona complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="persona">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="apellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cedula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="error" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estadoCivil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechImpresion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fechNacim" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="icActa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="icFeccar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="icFolio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="icOfnac" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="icTomo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nacionalidadBean" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombres" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="profesionBean" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sexo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "persona", propOrder = {
    "apellido",
    "cedula",
    "error",
    "estadoCivil",
    "fechImpresion",
    "fechNacim",
    "icActa",
    "icFeccar",
    "icFolio",
    "icOfnac",
    "icTomo",
    "nacionalidadBean",
    "nombres",
    "profesionBean",
    "sexo"
})
public class Persona {

    protected String apellido;
    protected String cedula;
    protected String error;
    protected String estadoCivil;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechImpresion;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechNacim;
    protected String icActa;
    protected String icFeccar;
    protected String icFolio;
    protected String icOfnac;
    protected String icTomo;
    protected String nacionalidadBean;
    protected String nombres;
    protected String profesionBean;
    protected String sexo;

    /**
     * Gets the value of the apellido property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Sets the value of the apellido property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApellido(String value) {
        this.apellido = value;
    }

    /**
     * Gets the value of the cedula property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * Sets the value of the cedula property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCedula(String value) {
        this.cedula = value;
    }

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setError(String value) {
        this.error = value;
    }

    /**
     * Gets the value of the estadoCivil property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoCivil() {
        return estadoCivil;
    }

    /**
     * Sets the value of the estadoCivil property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoCivil(String value) {
        this.estadoCivil = value;
    }

    /**
     * Gets the value of the fechImpresion property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechImpresion() {
        return fechImpresion;
    }

    /**
     * Sets the value of the fechImpresion property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechImpresion(XMLGregorianCalendar value) {
        this.fechImpresion = value;
    }

    /**
     * Gets the value of the fechNacim property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechNacim() {
        return fechNacim;
    }

    /**
     * Sets the value of the fechNacim property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechNacim(XMLGregorianCalendar value) {
        this.fechNacim = value;
    }

    /**
     * Gets the value of the icActa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIcActa() {
        return icActa;
    }

    /**
     * Sets the value of the icActa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIcActa(String value) {
        this.icActa = value;
    }

    /**
     * Gets the value of the icFeccar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIcFeccar() {
        return icFeccar;
    }

    /**
     * Sets the value of the icFeccar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIcFeccar(String value) {
        this.icFeccar = value;
    }

    /**
     * Gets the value of the icFolio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIcFolio() {
        return icFolio;
    }

    /**
     * Sets the value of the icFolio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIcFolio(String value) {
        this.icFolio = value;
    }

    /**
     * Gets the value of the icOfnac property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIcOfnac() {
        return icOfnac;
    }

    /**
     * Sets the value of the icOfnac property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIcOfnac(String value) {
        this.icOfnac = value;
    }

    /**
     * Gets the value of the icTomo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIcTomo() {
        return icTomo;
    }

    /**
     * Sets the value of the icTomo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIcTomo(String value) {
        this.icTomo = value;
    }

    /**
     * Gets the value of the nacionalidadBean property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNacionalidadBean() {
        return nacionalidadBean;
    }

    /**
     * Sets the value of the nacionalidadBean property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNacionalidadBean(String value) {
        this.nacionalidadBean = value;
    }

    /**
     * Gets the value of the nombres property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * Sets the value of the nombres property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombres(String value) {
        this.nombres = value;
    }

    /**
     * Gets the value of the profesionBean property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfesionBean() {
        return profesionBean;
    }

    /**
     * Sets the value of the profesionBean property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfesionBean(String value) {
        this.profesionBean = value;
    }

    /**
     * Gets the value of the sexo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * Sets the value of the sexo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSexo(String value) {
        this.sexo = value;
    }

}

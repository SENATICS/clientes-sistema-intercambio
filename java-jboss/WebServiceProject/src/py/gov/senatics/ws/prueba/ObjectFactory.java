
package py.gov.senatics.ws.prueba;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the py.gov.senatics.ws.prueba package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _FindPersonaByCedula_QNAME = new QName("http://identificaciones.ws.sii.senatics.gov.py/", "findPersonaByCedula");
    private final static QName _ServiceException_QNAME = new QName("http://identificaciones.ws.sii.senatics.gov.py/", "ServiceException");
    private final static QName _FindPersonaByCedulaResponse_QNAME = new QName("http://identificaciones.ws.sii.senatics.gov.py/", "findPersonaByCedulaResponse");
    private final static QName _RegistroIdentificacionesException_QNAME = new QName("http://identificaciones.ws.sii.senatics.gov.py/", "RegistroIdentificacionesException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: py.gov.senatics.ws.prueba
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RegistroIdentificacionesException }
     * 
     */
    public RegistroIdentificacionesException createRegistroIdentificacionesException() {
        return new RegistroIdentificacionesException();
    }

    /**
     * Create an instance of {@link FindPersonaByCedulaResponse }
     * 
     */
    public FindPersonaByCedulaResponse createFindPersonaByCedulaResponse() {
        return new FindPersonaByCedulaResponse();
    }

    /**
     * Create an instance of {@link FindPersonaByCedula }
     * 
     */
    public FindPersonaByCedula createFindPersonaByCedula() {
        return new FindPersonaByCedula();
    }

    /**
     * Create an instance of {@link ServiceException }
     * 
     */
    public ServiceException createServiceException() {
        return new ServiceException();
    }

    /**
     * Create an instance of {@link Persona }
     * 
     */
    public Persona createPersona() {
        return new Persona();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindPersonaByCedula }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://identificaciones.ws.sii.senatics.gov.py/", name = "findPersonaByCedula")
    public JAXBElement<FindPersonaByCedula> createFindPersonaByCedula(FindPersonaByCedula value) {
        return new JAXBElement<FindPersonaByCedula>(_FindPersonaByCedula_QNAME, FindPersonaByCedula.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://identificaciones.ws.sii.senatics.gov.py/", name = "ServiceException")
    public JAXBElement<ServiceException> createServiceException(ServiceException value) {
        return new JAXBElement<ServiceException>(_ServiceException_QNAME, ServiceException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindPersonaByCedulaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://identificaciones.ws.sii.senatics.gov.py/", name = "findPersonaByCedulaResponse")
    public JAXBElement<FindPersonaByCedulaResponse> createFindPersonaByCedulaResponse(FindPersonaByCedulaResponse value) {
        return new JAXBElement<FindPersonaByCedulaResponse>(_FindPersonaByCedulaResponse_QNAME, FindPersonaByCedulaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistroIdentificacionesException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://identificaciones.ws.sii.senatics.gov.py/", name = "RegistroIdentificacionesException")
    public JAXBElement<RegistroIdentificacionesException> createRegistroIdentificacionesException(RegistroIdentificacionesException value) {
        return new JAXBElement<RegistroIdentificacionesException>(_RegistroIdentificacionesException_QNAME, RegistroIdentificacionesException.class, null, value);
    }

}

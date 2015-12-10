package py.gov.senatics.ws.prueba;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.4.6
 * 2015-11-30T09:32:15.382-03:00
 * Generated source version: 2.4.6
 * 
 */
@WebServiceClient(name = "PersonaWSService", 
                  wsdlLocation = "http://sii.senatics.gov.py:8080/mbohape/PersonaWS?wsdl",
                  targetNamespace = "http://identificaciones.ws.sii.senatics.gov.py/") 
public class PersonaWSService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://identificaciones.ws.sii.senatics.gov.py/", "PersonaWSService");
    public final static QName PersonaWSPort = new QName("http://identificaciones.ws.sii.senatics.gov.py/", "PersonaWSPort");
    static {
        URL url = null;
        try {
            url = new URL("http://sii.senatics.gov.py:8080/mbohape/PersonaWS?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(PersonaWSService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://sii.senatics.gov.py:8080/mbohape/PersonaWS?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public PersonaWSService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public PersonaWSService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PersonaWSService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public PersonaWSService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public PersonaWSService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public PersonaWSService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns PersonaWS
     */
    @WebEndpoint(name = "PersonaWSPort")
    public PersonaWS getPersonaWSPort() {
        return super.getPort(PersonaWSPort, PersonaWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PersonaWS
     */
    @WebEndpoint(name = "PersonaWSPort")
    public PersonaWS getPersonaWSPort(WebServiceFeature... features) {
        return super.getPort(PersonaWSPort, PersonaWS.class, features);
    }

}

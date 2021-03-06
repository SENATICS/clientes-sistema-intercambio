
package py.gov.senatics.ws.prueba;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.4.6
 * 2015-11-30T09:32:15.333-03:00
 * Generated source version: 2.4.6
 */

@WebFault(name = "ServiceException", targetNamespace = "http://identificaciones.ws.sii.senatics.gov.py/")
public class ServiceException_Exception extends Exception {
    
    private py.gov.senatics.ws.prueba.ServiceException serviceException;

    public ServiceException_Exception() {
        super();
    }
    
    public ServiceException_Exception(String message) {
        super(message);
    }
    
    public ServiceException_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public ServiceException_Exception(String message, py.gov.senatics.ws.prueba.ServiceException serviceException) {
        super(message);
        this.serviceException = serviceException;
    }

    public ServiceException_Exception(String message, py.gov.senatics.ws.prueba.ServiceException serviceException, Throwable cause) {
        super(message, cause);
        this.serviceException = serviceException;
    }

    public py.gov.senatics.ws.prueba.ServiceException getFaultInfo() {
        return this.serviceException;
    }
}

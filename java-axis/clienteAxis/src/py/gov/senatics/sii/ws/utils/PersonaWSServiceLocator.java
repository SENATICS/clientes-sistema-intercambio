/**
 * PersonaWSServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package py.gov.senatics.sii.ws.utils;

public class PersonaWSServiceLocator extends org.apache.axis.client.Service implements py.gov.senatics.sii.ws.utils.PersonaWSService {

    public PersonaWSServiceLocator() {
    }


    public PersonaWSServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public PersonaWSServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for PersonaWSPort
    private java.lang.String PersonaWSPort_address = "http://sii.senatics.gov.py:8080/mbohape/PersonaWS";

    public java.lang.String getPersonaWSPortAddress() {
        return PersonaWSPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String PersonaWSPortWSDDServiceName = "PersonaWSPort";

    public java.lang.String getPersonaWSPortWSDDServiceName() {
        return PersonaWSPortWSDDServiceName;
    }

    public void setPersonaWSPortWSDDServiceName(java.lang.String name) {
        PersonaWSPortWSDDServiceName = name;
    }

    public py.gov.senatics.sii.ws.utils.PersonaWS getPersonaWSPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(PersonaWSPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPersonaWSPort(endpoint);
    }

    public py.gov.senatics.sii.ws.utils.PersonaWS getPersonaWSPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            py.gov.senatics.sii.ws.utils.PersonaWSServiceSoapBindingStub _stub = new py.gov.senatics.sii.ws.utils.PersonaWSServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getPersonaWSPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPersonaWSPortEndpointAddress(java.lang.String address) {
        PersonaWSPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (py.gov.senatics.sii.ws.utils.PersonaWS.class.isAssignableFrom(serviceEndpointInterface)) {
                py.gov.senatics.sii.ws.utils.PersonaWSServiceSoapBindingStub _stub = new py.gov.senatics.sii.ws.utils.PersonaWSServiceSoapBindingStub(new java.net.URL(PersonaWSPort_address), this);
                _stub.setPortName(getPersonaWSPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("PersonaWSPort".equals(inputPortName)) {
            return getPersonaWSPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://identificaciones.ws.sii.senatics.gov.py/", "PersonaWSService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://identificaciones.ws.sii.senatics.gov.py/", "PersonaWSPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("PersonaWSPort".equals(portName)) {
            setPersonaWSPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}

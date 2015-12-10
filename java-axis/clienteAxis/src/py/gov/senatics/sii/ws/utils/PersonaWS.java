/**
 * PersonaWS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package py.gov.senatics.sii.ws.utils;

public interface PersonaWS extends java.rmi.Remote {
    public py.gov.senatics.sii.ws.utils.Persona findPersonaByCedula(java.lang.String nroCedula) throws java.rmi.RemoteException, py.gov.senatics.sii.ws.utils.ServiceException, py.gov.senatics.sii.ws.utils.RegistroIdentificacionesException;
}

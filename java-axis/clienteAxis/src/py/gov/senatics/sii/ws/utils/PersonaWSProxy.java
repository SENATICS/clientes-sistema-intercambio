package py.gov.senatics.sii.ws.utils;

public class PersonaWSProxy implements py.gov.senatics.sii.ws.utils.PersonaWS {
  private String _endpoint = null;
  private py.gov.senatics.sii.ws.utils.PersonaWS personaWS = null;
  
  public PersonaWSProxy() {
    _initPersonaWSProxy();
  }
  
  public PersonaWSProxy(String endpoint) {
    _endpoint = endpoint;
    _initPersonaWSProxy();
  }
  
  private void _initPersonaWSProxy() {
    try {
      personaWS = (new py.gov.senatics.sii.ws.utils.PersonaWSServiceLocator()).getPersonaWSPort();
      if (personaWS != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)personaWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)personaWS)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (personaWS != null)
      ((javax.xml.rpc.Stub)personaWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public py.gov.senatics.sii.ws.utils.PersonaWS getPersonaWS() {
    if (personaWS == null)
      _initPersonaWSProxy();
    return personaWS;
  }
  
  public py.gov.senatics.sii.ws.utils.Persona findPersonaByCedula(java.lang.String nroCedula) throws java.rmi.RemoteException, py.gov.senatics.sii.ws.utils.ServiceException, py.gov.senatics.sii.ws.utils.RegistroIdentificacionesException{
    if (personaWS == null)
      _initPersonaWSProxy();
    return personaWS.findPersonaByCedula(nroCedula);
  }
  
  
}
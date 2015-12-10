package py.gov.senatics.ws.prueba.clientsample;

import javax.xml.ws.BindingProvider;

import py.gov.senatics.ws.prueba.*;

public class ClientSample {

	public static void main(String[] args) throws ServiceException_Exception, RegistroIdentificacionesException_Exception {
		
			BaseProperties base = new BaseProperties();			
			
	        System.out.println("***********************");
	        System.out.println("Create Web Service Client...");
	        PersonaWSService service1 = new PersonaWSService();
	        System.out.println("Create Web Service...");
	        PersonaWS port1 = service1.getPersonaWSPort();
	        BindingProvider bp = (BindingProvider) port1;
	        bp.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, base.user);
	        bp.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, base.pass);
	        System.out.println("Call Web Service Operation...");
	        System.out.println("Server said: " + port1.findPersonaByCedula("111111"));
	
	        System.out.println("***********************");
	        System.out.println("Call Over!");
	}
}

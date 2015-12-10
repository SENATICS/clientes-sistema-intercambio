package py.gov.senatics.sii.ws.prueba;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import org.apache.axis.client.Call;
import org.apache.axis.client.Stub;

import py.gov.senatics.sii.ws.utils.BaseProperties;
import py.gov.senatics.sii.ws.utils.PersonaWS;
import py.gov.senatics.sii.ws.utils.PersonaWSServiceLocator;
import py.gov.senatics.sii.ws.utils.RegistroIdentificacionesException;

public class ClientExample {

	public static void main(String[] args) throws ServiceException, py.gov.senatics.sii.ws.utils.ServiceException, RegistroIdentificacionesException, RemoteException {
		BaseProperties base = new BaseProperties();

		// TODO Auto-generated method stub
		System.out.println("Create Web SErvice Client...");
		PersonaWSServiceLocator locator = new PersonaWSServiceLocator();
		
		PersonaWS port1 = locator.getPersonaWSPort();
		((Stub) port1)._setProperty(Call.USERNAME_PROPERTY, base.user);
		((Stub) port1)._setProperty(Call.PASSWORD_PROPERTY, base.pass);
		
		System.out.println("Call Web SErvice Operation...");
		System.out.println("Server said: " + port1.findPersonaByCedula("111111"));
		
		System.out.println("******************************");
		System.out.println("Call Over!");
		

	}

}

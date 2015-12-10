
package py.gov.senatics.sii.ws.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BaseProperties {
	public String user;
	public String pass;
	
	public  BaseProperties() {
		try {

			Properties propiedades = new Properties();
			propiedades.load(new FileInputStream("../lib/config.properties"));
	
			user 	= propiedades.getProperty("user");
			pass 	= propiedades.getProperty("pass");
			
		} catch (FileNotFoundException e) {
			e.getLocalizedMessage();
		} catch (IOException e) {
			e.getMessage();
		}
	}
}

package pl.jaxws;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class ServiceClient {

	public static void main(String[] args) throws Exception {
		URL url = new URL("http://localhost:9876/ts?wsdl");
		//Qualified name (service URI, service name from WSDL document
		QName qName = new QName("http://jaxws.pl/", "ExampleServerImplService");
		//Creating the service
		Service service = Service.create(url, qName);
		//Extracting service endpoint
		ExampleServer port = service.getPort(ExampleServer.class);
		
		System.out.println(port.getStringA());
		System.out.println(port.getStringB());
	}

}

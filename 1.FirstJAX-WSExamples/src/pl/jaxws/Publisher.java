package pl.jaxws;

import javax.xml.ws.Endpoint;

/**
 * Class used for publish example jax-ws service
 *
 * "http://127.0.0.1:9876/ts?wsdl"
 *
 * Use this link to check if service is running and the WSDL document (service
 * contract)
 */
public class Publisher {

	public static void main(String[] args) {
		Endpoint.publish("http://127.0.0.1:9876/ts", new ExampleServerImpl());
	}

}

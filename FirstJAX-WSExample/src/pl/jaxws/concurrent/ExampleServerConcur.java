package pl.jaxws.concurrent;

import javax.xml.ws.Endpoint;

import pl.jaxws.ExampleServerImpl;


public class ExampleServerConcur {

	private Endpoint endpoint;

	public static void main(String[] args) {
		ExampleServerConcur esc = new ExampleServerConcur();
		esc.createEndpoint();
		esc.configureEndpoint();
		esc.publishService();
	}

	private void createEndpoint() {
		endpoint = Endpoint.create(new ExampleServerImpl());
	}

	private void configureEndpoint() {
		endpoint.setExecutor(new MyExecutor());
	}

	private void publishService() {
		String url = "http://localhost:8888/es";
		endpoint.publish(url);
	}

}

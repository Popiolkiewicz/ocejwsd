package pl.jaxws;

import javax.jws.WebService;

/**
 * This is SIB - Service Implementation Bean
 * 'endpointInterface' links our SIB with SEI
 */
@WebService(endpointInterface = "pl.jaxws.ExampleServer")
public class ExampleServerImpl implements ExampleServer {

	@Override
	public String getStringA() {
		return "StringA";
	}

	@Override
	public String getStringB() {
		return "StringB";
	}

}

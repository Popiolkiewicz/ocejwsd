package pl.jaxws;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

/**
 * 
 * @author Hubert
 */
@WebService // informs that this is SEI - service endpoint interface
@SOAPBinding(style = Style.RPC) // impacts service contract
public interface ExampleServer {

	@WebMethod // informs, that method is service operation
	String getStringA();

	@WebMethod
	String getStringB();

}

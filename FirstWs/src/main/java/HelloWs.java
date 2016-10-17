
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class HelloWs {
@WebMethod
	public String sayHello(){
		return "Hello World";
	}
}
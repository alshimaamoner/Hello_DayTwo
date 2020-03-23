package service;
 
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public class HelloImpl {

    public String message = "Hello ya ";
	
    public String sayHello(String name) {
        return "Hello, " + name + " !";
    }
}
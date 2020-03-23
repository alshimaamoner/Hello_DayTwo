package client;
import servicesource.*;
public class SampleClient {

    public static void main(String[] args) {
        HelloImplService helloServiceRef = new HelloImplService();
        HelloImpl helloService = helloServiceRef.getHelloImplPort();
        System.out.println("Server Said: " + helloService.sayHello("JETS"));
    }

}
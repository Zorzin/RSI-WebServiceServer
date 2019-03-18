package HelloWorldPackage;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@WebService(endpointInterface = "HelloWorldPackage.IHelloWorld")
public class HelloWorld implements IHelloWorld {
  public static void main(String[] argv) {
    Object implementor = new HelloWorld ();
    String address = "http://localhost:9000/HelloWorldPackage.HelloWorld";
    Endpoint.publish(address, implementor);
    System.out.println("Serwer oczekuje...");
  }

  @WebMethod()
  @Override
  public String getHelloWorldAsString(String name) {
    return "Odpowiedz serwera: " + name;
  }
}

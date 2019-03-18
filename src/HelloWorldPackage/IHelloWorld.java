package HelloWorldPackage;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use = SOAPBinding.Use.LITERAL) //optional

public interface IHelloWorld {
    @WebMethod
    String getHelloWorldAsString(String name);
}
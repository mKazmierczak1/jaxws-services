package org.example.topdown;

import jakarta.xml.ws.*;

import javax.xml.namespace.QName;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * This class was generated by the XML-WS Tools. XML-WS Tools 4.0.1 Generated source version: 3.0
 */
@WebServiceClient(
    name = "CarServiceTopDownImplService",
    targetNamespace = "http://service.example.org/",
    wsdlLocation =
        "file:/D:/mkazm/Documents/eclipse-workspace/jaxws/src/main/resources/carservice.wsdl")
public class CarServiceTopDownImplService extends Service {

  private static final URL CARSERVICEIMPLSERVICE_WSDL_LOCATION;
  private static final WebServiceException CARSERVICEIMPLSERVICE_EXCEPTION;
  private static final QName CARSERVICEIMPLSERVICE_QNAME =
      new QName("http://service.example.org/", "CarServiceTopDownImplService");

  static {
    URL url = null;
    WebServiceException e = null;
    try {
      url =
          new URL(
              "file:/D:/mkazm/Documents/eclipse-workspace/jaxws/src/main/resources/carservice.wsdl");
    } catch (MalformedURLException ex) {
      e = new WebServiceException(ex);
    }
    CARSERVICEIMPLSERVICE_WSDL_LOCATION = url;
    CARSERVICEIMPLSERVICE_EXCEPTION = e;
  }

  public CarServiceTopDownImplService() {
    super(__getWsdlLocation(), CARSERVICEIMPLSERVICE_QNAME);
  }

  public CarServiceTopDownImplService(WebServiceFeature... features) {
    super(__getWsdlLocation(), CARSERVICEIMPLSERVICE_QNAME, features);
  }

  public CarServiceTopDownImplService(URL wsdlLocation) {
    super(wsdlLocation, CARSERVICEIMPLSERVICE_QNAME);
  }

  public CarServiceTopDownImplService(URL wsdlLocation, WebServiceFeature... features) {
    super(wsdlLocation, CARSERVICEIMPLSERVICE_QNAME, features);
  }

  public CarServiceTopDownImplService(URL wsdlLocation, QName serviceName) {
    super(wsdlLocation, serviceName);
  }

  public CarServiceTopDownImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
    super(wsdlLocation, serviceName, features);
  }

  /**
   * @return returns CarService
   */
  @WebEndpoint(name = "CarServicePort")
  public CarService getCarServicePort() {
    return super.getPort(
        new QName("http://service.example.org/", "CarServicePort"), CarService.class);
  }

  /**
   * @param features A list of {@link WebServiceFeature} to configure on the proxy.
   *     Supported features not in the <code>features</code> parameter will have their default
   *     values.
   * @return returns CarService
   */
  @WebEndpoint(name = "CarServicePort")
  public CarService getCarServicePort(WebServiceFeature... features) {
    return super.getPort(
        new QName("http://service.example.org/", "CarServicePort"), CarService.class, features);
  }

  private static URL __getWsdlLocation() {
    if (CARSERVICEIMPLSERVICE_EXCEPTION != null) {
      throw CARSERVICEIMPLSERVICE_EXCEPTION;
    }
    return CARSERVICEIMPLSERVICE_WSDL_LOCATION;
  }
}

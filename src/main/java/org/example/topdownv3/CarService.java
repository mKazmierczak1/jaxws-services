package org.example.topdownv3;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;
import java.util.List;

/**
 * This class was generated by the XML-WS Tools. XML-WS Tools 4.0.1 Generated source version: 3.0
 */
@WebService(name = "CarService", targetNamespace = "http://service.example.org/")
@XmlSeeAlso({ObjectFactory.class})
public interface CarService {

  /**
   * @param arg0
   * @throws CarExistsEx_Exception
   * @throws FullListEx_Exception
   */
  @WebMethod
  @RequestWrapper(
      localName = "addCar",
      targetNamespace = "http://service.example.org/",
      className = "org.example.topdownv3.AddCar")
  @ResponseWrapper(
      localName = "addCarResponse",
      targetNamespace = "http://service.example.org/",
      className = "org.example.topdownv3.AddCarResponse")
  public void addCar(@WebParam(name = "arg0", targetNamespace = "") Car arg0)
      throws CarExistsEx_Exception, FullListEx_Exception;

  /**
   * @param arg0
   * @throws CarNotFoundEx_Exception
   */
  @WebMethod
  @RequestWrapper(
      localName = "removeCar",
      targetNamespace = "http://service.example.org/",
      className = "org.example.topdownv3.RemoveCar")
  @ResponseWrapper(
      localName = "removeCarResponse",
      targetNamespace = "http://service.example.org/",
      className = "org.example.topdownv3.RemoveCarResponse")
  public void removeCar(@WebParam(name = "arg0", targetNamespace = "") int arg0)
      throws CarNotFoundEx_Exception;

  /**
   * @param arg0
   * @return returns org.example.topdownv3.Car
   * @throws CarNotFoundEx_Exception
   */
  @WebMethod
  @WebResult(targetNamespace = "")
  @RequestWrapper(
      localName = "getCar",
      targetNamespace = "http://service.example.org/",
      className = "org.example.topdownv3.GetCar")
  @ResponseWrapper(
      localName = "getCarResponse",
      targetNamespace = "http://service.example.org/",
      className = "org.example.topdownv3.GetCarResponse")
  public Car getCar(@WebParam(name = "arg0", targetNamespace = "") int arg0)
      throws CarNotFoundEx_Exception;

  /**
   * @param arg0
   * @throws CarNotFoundEx_Exception
   */
  @WebMethod
  @RequestWrapper(
      localName = "updateCar",
      targetNamespace = "http://service.example.org/",
      className = "org.example.topdownv3.UpdateCar")
  @ResponseWrapper(
      localName = "updateCarResponse",
      targetNamespace = "http://service.example.org/",
      className = "org.example.topdownv3.UpdateCarResponse")
  public void updateCar(@WebParam(name = "arg0", targetNamespace = "") Car arg0)
      throws CarNotFoundEx_Exception;

  /**
   * @return returns java.util.List<org.example.topdownv3.Car>
   */
  @WebMethod
  @WebResult(targetNamespace = "")
  @RequestWrapper(
      localName = "getAllCars",
      targetNamespace = "http://service.example.org/",
      className = "org.example.topdownv3.GetAllCars")
  @ResponseWrapper(
      localName = "getAllCarsResponse",
      targetNamespace = "http://service.example.org/",
      className = "org.example.topdownv3.GetAllCarsResponse")
  public List<Car> getAllCars();

  /** */
  @WebMethod
  @RequestWrapper(
      localName = "eraseCars",
      targetNamespace = "http://service.example.org/",
      className = "org.example.topdownv3.EraseCars")
  @ResponseWrapper(
      localName = "eraseCarsResponse",
      targetNamespace = "http://service.example.org/",
      className = "org.example.topdownv3.EraseCarsResponse")
  public void eraseCars();
}

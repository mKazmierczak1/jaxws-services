package org.example.topdown;

import jakarta.xml.ws.WebFault;

/**
 * This class was generated by the XML-WS Tools. XML-WS Tools 4.0.1 Generated source version: 3.0
 */
@WebFault(name = "CarNotFoundEx", targetNamespace = "http://service.example.org/")
public class CarNotFoundEx_Exception extends Exception {

  /** Java type that goes as soapenv:Fault detail element. */
  private CarNotFoundEx faultInfo;

  /**
   * @param faultInfo
   * @param message
   */
  public CarNotFoundEx_Exception(String message, CarNotFoundEx faultInfo) {
    super(message);
    this.faultInfo = faultInfo;
  }

  /**
   * @param cause
   * @param faultInfo
   * @param message
   */
  public CarNotFoundEx_Exception(String message, CarNotFoundEx faultInfo, Throwable cause) {
    super(message, cause);
    this.faultInfo = faultInfo;
  }

  public CarNotFoundEx_Exception() {
    super("No car found for given id!");
  }

  /**
   * @return returns fault bean: org.example.topdown.CarNotFoundEx
   */
  public CarNotFoundEx getFaultInfo() {
    return faultInfo;
  }
}

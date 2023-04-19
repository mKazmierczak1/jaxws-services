package org.example.topdownv3;

import jakarta.xml.ws.WebFault;

/**
 * This class was generated by the XML-WS Tools. XML-WS Tools 4.0.1 Generated source version: 3.0
 */
@WebFault(name = "FullListEx", targetNamespace = "http://service.example.org/")
public class FullListEx_Exception extends Exception {

  /** Java type that goes as soapenv:Fault detail element. */
  private FullListEx faultInfo;

  /**
   * @param faultInfo
   * @param message
   */
  public FullListEx_Exception(String message, FullListEx faultInfo) {
    super(message);
    this.faultInfo = faultInfo;
  }

  public FullListEx_Exception() {
    super("List is full!");
  }

  /**
   * @param cause
   * @param faultInfo
   * @param message
   */
  public FullListEx_Exception(String message, FullListEx faultInfo, Throwable cause) {
    super(message, cause);
    this.faultInfo = faultInfo;
  }

  /**
   * @return returns fault bean: org.example.topdownv3.FullListEx
   */
  public FullListEx getFaultInfo() {
    return faultInfo;
  }
}

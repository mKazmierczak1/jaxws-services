package org.example.topdownv2;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Java class for CarExistsEx complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="CarExistsEx">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "CarExistsEx",
    propOrder = {"message"})
public class CarExistsEx {

  protected String message;

  /**
   * Gets the value of the message property.
   *
   * @return possible object is {@link String }
   */
  public String getMessage() {
    return message;
  }

  /**
   * Sets the value of the message property.
   *
   * @param value allowed object is {@link String }
   */
  public void setMessage(String value) {
    this.message = value;
  }
}

package org.example.topdownv3;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Java class for updateCar complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="updateCar">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="arg0" type="{http://service.example.org/}car" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "updateCar",
    propOrder = {"arg0"})
public class UpdateCar {

  protected Car arg0;

  /**
   * Gets the value of the arg0 property.
   *
   * @return possible object is {@link Car }
   */
  public Car getArg0() {
    return arg0;
  }

  /**
   * Sets the value of the arg0 property.
   *
   * @param value allowed object is {@link Car }
   */
  public void setArg0(Car value) {
    this.arg0 = value;
  }
}

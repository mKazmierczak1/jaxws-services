package org.example.topdownv3;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Java class for removeCar complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="removeCar">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="arg0" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "removeCar",
    propOrder = {"arg0"})
public class RemoveCar {

  protected int arg0;

  /** Gets the value of the arg0 property. */
  public int getArg0() {
    return arg0;
  }

  /** Sets the value of the arg0 property. */
  public void setArg0(int value) {
    this.arg0 = value;
  }
}

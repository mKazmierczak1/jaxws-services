package org.example.topdown;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

/**
 * Java class for getAllCarsResponse complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="getAllCarsResponse">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="return" type="{http://service.example.org/}car" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "getAllCarsResponse",
    propOrder = {"_return"})
public class GetAllCarsResponse {

  @XmlElement(name = "return")
  protected List<Car> _return;

  /**
   * Gets the value of the return property.
   *
   * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the Jakarta XML Binding
   * object. This is why there is not a {@code set} method for the return property.
   *
   * <p>For example, to add a new item, do as follows:
   *
   * <pre>
   *    getReturn().add(newItem);
   * </pre>
   *
   * <p>Objects of the following type(s) are allowed in the list {@link Car }
   *
   * @return The value of the return property.
   */
  public List<Car> getReturn() {
    if (_return == null) {
      _return = new ArrayList<>();
    }
    return this._return;
  }
}

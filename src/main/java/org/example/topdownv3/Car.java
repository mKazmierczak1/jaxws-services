package org.example.topdownv3;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;
import lombok.AllArgsConstructor;
import lombok.ToString;

/**
 * Java class for car complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="car">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="brand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="engineSize" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         <element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="manufactureYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="model" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "car",
    propOrder = {"brand", "engineSize", "id", "manufactureYear", "model"})
@ToString
@AllArgsConstructor
public class Car {

  protected long id;
  protected String brand;
  protected String model;
  protected int manufactureYear;
  protected float engineSize;

  public Car() {}

  /**
   * Gets the value of the brand property.
   *
   * @return possible object is {@link String }
   */
  public String getBrand() {
    return brand;
  }

  /**
   * Sets the value of the brand property.
   *
   * @param value allowed object is {@link String }
   */
  public void setBrand(String value) {
    this.brand = value;
  }

  /** Gets the value of the engineSize property. */
  public float getEngineSize() {
    return engineSize;
  }

  /** Sets the value of the engineSize property. */
  public void setEngineSize(float value) {
    this.engineSize = value;
  }

  /** Gets the value of the id property. */
  public long getId() {
    return id;
  }

  /** Sets the value of the id property. */
  public void setId(long value) {
    this.id = value;
  }

  /** Gets the value of the manufactureYear property. */
  public int getManufactureYear() {
    return manufactureYear;
  }

  /** Sets the value of the manufactureYear property. */
  public void setManufactureYear(int value) {
    this.manufactureYear = value;
  }

  /**
   * Gets the value of the model property.
   *
   * @return possible object is {@link String }
   */
  public String getModel() {
    return model;
  }

  /**
   * Sets the value of the model property.
   *
   * @param value allowed object is {@link String }
   */
  public void setModel(String value) {
    this.model = value;
  }
}

package org.example.topdownv3;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java element interface
 * generated in the org.example.topdownv3 package.
 *
 * <p>An ObjectFactory allows you to programatically construct new instances of the Java
 * representation for XML content. The Java representation of XML content can consist of schema
 * derived interfaces and classes representing the binding of schema type definitions, element
 * declarations and model groups. Factory methods for each of these are provided in this class.
 */
@XmlRegistry
public class ObjectFactory {

  private static final QName _CarExistsEx_QNAME =
      new QName("http://service.example.org/", "CarExistsEx");
  private static final QName _CarNotFoundEx_QNAME =
      new QName("http://service.example.org/", "CarNotFoundEx");
  private static final QName _FullListEx_QNAME =
      new QName("http://service.example.org/", "FullListEx");
  private static final QName _AddCar_QNAME = new QName("http://service.example.org/", "addCar");
  private static final QName _AddCarResponse_QNAME =
      new QName("http://service.example.org/", "addCarResponse");
  private static final QName _GetAllCars_QNAME =
      new QName("http://service.example.org/", "getAllCars");
  private static final QName _GetAllCarsResponse_QNAME =
      new QName("http://service.example.org/", "getAllCarsResponse");
  private static final QName _GetCar_QNAME = new QName("http://service.example.org/", "getCar");
  private static final QName _GetCarResponse_QNAME =
      new QName("http://service.example.org/", "getCarResponse");
  private static final QName _RemoveCar_QNAME =
      new QName("http://service.example.org/", "removeCar");
  private static final QName _RemoveCarResponse_QNAME =
      new QName("http://service.example.org/", "removeCarResponse");
  private static final QName _UpdateCar_QNAME =
      new QName("http://service.example.org/", "updateCar");
  private static final QName _UpdateCarResponse_QNAME =
      new QName("http://service.example.org/", "updateCarResponse");
  private static final QName _EraseCars_QNAME =
      new QName("http://service.example.org/", "eraseCars");
  private static final QName _EraseCarsResponse_QNAME =
      new QName("http://service.example.org/", "eraseCarsResponse");

  /**
   * Create a new ObjectFactory that can be used to create new instances of schema derived classes
   * for package: org.example.topdownv3
   */
  public ObjectFactory() {}

  /**
   * Create an instance of {@link CarExistsEx }
   *
   * @return the new instance of {@link CarExistsEx }
   */
  public CarExistsEx createCarExistsEx() {
    return new CarExistsEx();
  }

  /**
   * Create an instance of {@link CarNotFoundEx }
   *
   * @return the new instance of {@link CarNotFoundEx }
   */
  public CarNotFoundEx createCarNotFoundEx() {
    return new CarNotFoundEx();
  }

  /**
   * Create an instance of {@link FullListEx }
   *
   * @return the new instance of {@link FullListEx }
   */
  public FullListEx createFullListEx() {
    return new FullListEx();
  }

  /**
   * Create an instance of {@link AddCar }
   *
   * @return the new instance of {@link AddCar }
   */
  public AddCar createAddCar() {
    return new AddCar();
  }

  /**
   * Create an instance of {@link AddCarResponse }
   *
   * @return the new instance of {@link AddCarResponse }
   */
  public AddCarResponse createAddCarResponse() {
    return new AddCarResponse();
  }

  /**
   * Create an instance of {@link GetAllCars }
   *
   * @return the new instance of {@link GetAllCars }
   */
  public GetAllCars createGetAllCars() {
    return new GetAllCars();
  }

  /**
   * Create an instance of {@link GetAllCarsResponse }
   *
   * @return the new instance of {@link GetAllCarsResponse }
   */
  public GetAllCarsResponse createGetAllCarsResponse() {
    return new GetAllCarsResponse();
  }

  /**
   * Create an instance of {@link GetCar }
   *
   * @return the new instance of {@link GetCar }
   */
  public GetCar createGetCar() {
    return new GetCar();
  }

  /**
   * Create an instance of {@link GetCarResponse }
   *
   * @return the new instance of {@link GetCarResponse }
   */
  public GetCarResponse createGetCarResponse() {
    return new GetCarResponse();
  }

  /**
   * Create an instance of {@link RemoveCar }
   *
   * @return the new instance of {@link RemoveCar }
   */
  public RemoveCar createRemoveCar() {
    return new RemoveCar();
  }

  /**
   * Create an instance of {@link RemoveCarResponse }
   *
   * @return the new instance of {@link RemoveCarResponse }
   */
  public RemoveCarResponse createRemoveCarResponse() {
    return new RemoveCarResponse();
  }

  /**
   * Create an instance of {@link UpdateCar }
   *
   * @return the new instance of {@link UpdateCar }
   */
  public UpdateCar createUpdateCar() {
    return new UpdateCar();
  }

  /**
   * Create an instance of {@link UpdateCarResponse }
   *
   * @return the new instance of {@link UpdateCarResponse }
   */
  public UpdateCarResponse createUpdateCarResponse() {
    return new UpdateCarResponse();
  }

  /**
   * Create an instance of {@link EraseCars }
   *
   * @return the new instance of {@link EraseCars }
   */
  public EraseCars createEraseCars() {
    return new EraseCars();
  }

  /**
   * Create an instance of {@link EraseCarsResponse }
   *
   * @return the new instance of {@link EraseCarsResponse }
   */
  public EraseCarsResponse createEraseCarsResponse() {
    return new EraseCarsResponse();
  }

  /**
   * Create an instance of {@link Car }
   *
   * @return the new instance of {@link Car }
   */
  public Car createCar() {
    return new Car();
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link CarExistsEx }{@code >}
   *
   * @param value Java instance representing xml element's value.
   * @return the new instance of {@link JAXBElement }{@code <}{@link CarExistsEx }{@code >}
   */
  @XmlElementDecl(namespace = "http://service.example.org/", name = "CarExistsEx")
  public JAXBElement<CarExistsEx> createCarExistsEx(CarExistsEx value) {
    return new JAXBElement<>(_CarExistsEx_QNAME, CarExistsEx.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link CarNotFoundEx }{@code >}
   *
   * @param value Java instance representing xml element's value.
   * @return the new instance of {@link JAXBElement }{@code <}{@link CarNotFoundEx }{@code >}
   */
  @XmlElementDecl(namespace = "http://service.example.org/", name = "CarNotFoundEx")
  public JAXBElement<CarNotFoundEx> createCarNotFoundEx(CarNotFoundEx value) {
    return new JAXBElement<>(_CarNotFoundEx_QNAME, CarNotFoundEx.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link FullListEx }{@code >}
   *
   * @param value Java instance representing xml element's value.
   * @return the new instance of {@link JAXBElement }{@code <}{@link FullListEx }{@code >}
   */
  @XmlElementDecl(namespace = "http://service.example.org/", name = "FullListEx")
  public JAXBElement<FullListEx> createFullListEx(FullListEx value) {
    return new JAXBElement<>(_FullListEx_QNAME, FullListEx.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link AddCar }{@code >}
   *
   * @param value Java instance representing xml element's value.
   * @return the new instance of {@link JAXBElement }{@code <}{@link AddCar }{@code >}
   */
  @XmlElementDecl(namespace = "http://service.example.org/", name = "addCar")
  public JAXBElement<AddCar> createAddCar(AddCar value) {
    return new JAXBElement<>(_AddCar_QNAME, AddCar.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link AddCarResponse }{@code >}
   *
   * @param value Java instance representing xml element's value.
   * @return the new instance of {@link JAXBElement }{@code <}{@link AddCarResponse }{@code >}
   */
  @XmlElementDecl(namespace = "http://service.example.org/", name = "addCarResponse")
  public JAXBElement<AddCarResponse> createAddCarResponse(AddCarResponse value) {
    return new JAXBElement<>(_AddCarResponse_QNAME, AddCarResponse.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link GetAllCars }{@code >}
   *
   * @param value Java instance representing xml element's value.
   * @return the new instance of {@link JAXBElement }{@code <}{@link GetAllCars }{@code >}
   */
  @XmlElementDecl(namespace = "http://service.example.org/", name = "getAllCars")
  public JAXBElement<GetAllCars> createGetAllCars(GetAllCars value) {
    return new JAXBElement<>(_GetAllCars_QNAME, GetAllCars.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link GetAllCarsResponse }{@code >}
   *
   * @param value Java instance representing xml element's value.
   * @return the new instance of {@link JAXBElement }{@code <}{@link GetAllCarsResponse }{@code >}
   */
  @XmlElementDecl(namespace = "http://service.example.org/", name = "getAllCarsResponse")
  public JAXBElement<GetAllCarsResponse> createGetAllCarsResponse(GetAllCarsResponse value) {
    return new JAXBElement<>(_GetAllCarsResponse_QNAME, GetAllCarsResponse.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link GetCar }{@code >}
   *
   * @param value Java instance representing xml element's value.
   * @return the new instance of {@link JAXBElement }{@code <}{@link GetCar }{@code >}
   */
  @XmlElementDecl(namespace = "http://service.example.org/", name = "getCar")
  public JAXBElement<GetCar> createGetCar(GetCar value) {
    return new JAXBElement<>(_GetCar_QNAME, GetCar.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link GetCarResponse }{@code >}
   *
   * @param value Java instance representing xml element's value.
   * @return the new instance of {@link JAXBElement }{@code <}{@link GetCarResponse }{@code >}
   */
  @XmlElementDecl(namespace = "http://service.example.org/", name = "getCarResponse")
  public JAXBElement<GetCarResponse> createGetCarResponse(GetCarResponse value) {
    return new JAXBElement<>(_GetCarResponse_QNAME, GetCarResponse.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link RemoveCar }{@code >}
   *
   * @param value Java instance representing xml element's value.
   * @return the new instance of {@link JAXBElement }{@code <}{@link RemoveCar }{@code >}
   */
  @XmlElementDecl(namespace = "http://service.example.org/", name = "removeCar")
  public JAXBElement<RemoveCar> createRemoveCar(RemoveCar value) {
    return new JAXBElement<>(_RemoveCar_QNAME, RemoveCar.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link RemoveCarResponse }{@code >}
   *
   * @param value Java instance representing xml element's value.
   * @return the new instance of {@link JAXBElement }{@code <}{@link RemoveCarResponse }{@code >}
   */
  @XmlElementDecl(namespace = "http://service.example.org/", name = "removeCarResponse")
  public JAXBElement<RemoveCarResponse> createRemoveCarResponse(RemoveCarResponse value) {
    return new JAXBElement<>(_RemoveCarResponse_QNAME, RemoveCarResponse.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCar }{@code >}
   *
   * @param value Java instance representing xml element's value.
   * @return the new instance of {@link JAXBElement }{@code <}{@link UpdateCar }{@code >}
   */
  @XmlElementDecl(namespace = "http://service.example.org/", name = "updateCar")
  public JAXBElement<UpdateCar> createUpdateCar(UpdateCar value) {
    return new JAXBElement<>(_UpdateCar_QNAME, UpdateCar.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCarResponse }{@code >}
   *
   * @param value Java instance representing xml element's value.
   * @return the new instance of {@link JAXBElement }{@code <}{@link UpdateCarResponse }{@code >}
   */
  @XmlElementDecl(namespace = "http://service.example.org/", name = "updateCarResponse")
  public JAXBElement<UpdateCarResponse> createUpdateCarResponse(UpdateCarResponse value) {
    return new JAXBElement<>(_UpdateCarResponse_QNAME, UpdateCarResponse.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link EraseCars }{@code >}
   *
   * @param value Java instance representing xml element's value.
   * @return the new instance of {@link JAXBElement }{@code <}{@link EraseCars }{@code >}
   */
  @XmlElementDecl(namespace = "http://service.example.org/", name = "eraseCars")
  public JAXBElement<EraseCars> createEraseCars(EraseCars value) {
    return new JAXBElement<>(_EraseCars_QNAME, EraseCars.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link EraseCarsResponse }{@code >}
   *
   * @param value Java instance representing xml element's value.
   * @return the new instance of {@link JAXBElement }{@code <}{@link EraseCarsResponse }{@code >}
   */
  @XmlElementDecl(namespace = "http://service.example.org/", name = "eraseCarsResponse")
  public JAXBElement<EraseCarsResponse> createEraseCarsResponse(EraseCarsResponse value) {
    return new JAXBElement<>(_EraseCarsResponse_QNAME, EraseCarsResponse.class, null, value);
  }
}

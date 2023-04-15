package org.example.client;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.example.topdown.*;

public class Client {

  public static void main(String[] args) throws URISyntaxException, MalformedURLException, CarExistsEx_Exception, CarNotFoundEx_Exception {
    var urlBottomUp = new URI("http://localhost:8081/carservice").toURL();
    var carServiceBottomUp = new CarServiceImplService(urlBottomUp).getCarServicePort();
    var urlTopDown = new URI("http://localhost:8082/carservice").toURL();
    var carServiceTopDown = new CarServiceTopDownImplService(urlTopDown).getCarServicePort();

    System.out.println("Calling Bottom-up service...");
    callEndpointsForService(carServiceBottomUp);

    System.out.println("Calling Top-down service...");
    callEndpointsForService(carServiceTopDown);
  }

  private static void callEndpointsForService(CarService carServiceProxy) throws CarNotFoundEx_Exception,
          CarExistsEx_Exception {
    System.out.println("Calling getAllCars...");
    System.out.println(carServiceProxy.getAllCars());

    System.out.println("Calling getCar...");
    System.out.println(carServiceProxy.getCar(1));

    System.out.println("Calling addCar...");
    carServiceProxy.addCar(new Car(5, "Mazda", "3", 2011, 1.8f));
    System.out.println(carServiceProxy.getAllCars());

    System.out.println("Calling getAllCars...");
    carServiceProxy.removeCar(1);
    System.out.println(carServiceProxy.getAllCars());
  }
}

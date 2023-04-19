package org.example.client;

import org.example.topdownv3.*;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

public class ClientV3 {

  public static void main(String[] args)
      throws URISyntaxException, MalformedURLException, CarExistsEx_Exception,
          CarNotFoundEx_Exception, FullListEx_Exception {
    //var urlBottomUp = new URI("http://localhost:8081/carservice").toURL();
    //var carServiceBottomUp = new CarServiceImplService(urlBottomUp).getCarServicePort();
    var urlTopDown = new URI("http://localhost:8082/carservice").toURL();
    var carServiceTopDown = new CarServiceImplService(urlTopDown).getCarServicePort();

//    System.out.println("Calling Bottom-up service...");
//    callEndpointsForService(carServiceBottomUp);

     System.out.println("Calling Top-down service...");
     callEndpointsForService(carServiceTopDown);
  }

  private static void callEndpointsForService(CarService carServiceProxy)
      throws CarNotFoundEx_Exception, CarExistsEx_Exception, FullListEx_Exception {
    System.out.println("Calling getAllCars...");
    System.out.println(carServiceProxy.getAllCars());

    System.out.println("Calling getCar...");
    System.out.println(carServiceProxy.getCar(1));

    System.out.println("Calling addCar...");
    carServiceProxy.addCar(new Car(5, "Mazda", "3", 2011, 1.8f));
    System.out.println(carServiceProxy.getAllCars());

    try {
      System.out.println("Calling addCar...");
      carServiceProxy.addCar(new Car(6, "Mazda", "3", 2011, 1.8f));
      carServiceProxy.addCar(new Car(7, "Mazda", "3", 2011, 1.8f));
      System.out.println(carServiceProxy.getAllCars());
    } catch (Exception e) {
      e.printStackTrace();
    }

    System.out.println("Calling updateCar...");
    carServiceProxy.updateCar(new Car(5, "Toyota", "Corolla", 2017, 2.3f));
    System.out.println(carServiceProxy.getAllCars());

    System.out.println("Calling removeCars...");
    carServiceProxy.removeCar(1);
    System.out.println(carServiceProxy.getAllCars());

    try {
      System.out.println("Calling removeCars...");
      carServiceProxy.removeCar(1);
      System.out.println(carServiceProxy.getAllCars());
    } catch (Exception e) {
      e.printStackTrace();
    }

    System.out.println("Calling eraseCars...");
    carServiceProxy.eraseCars();
    System.out.println(carServiceProxy.getAllCars());
  }
}

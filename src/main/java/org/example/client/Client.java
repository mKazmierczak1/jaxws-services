package org.example.client;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import org.example.topdown.Car;
import org.example.topdown.CarExistsEx_Exception;
import org.example.topdown.CarNotFoundEx_Exception;
import org.example.topdown.CarServiceImplService;

public class Client {

  public static void main(String[] args)
      throws URISyntaxException, MalformedURLException, CarNotFoundEx_Exception,
          CarExistsEx_Exception {
    var url = new URI("http://localhost:8081/carservice").toURL();
    var carServiceProxy = new CarServiceImplService(url).getCarServicePort();

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

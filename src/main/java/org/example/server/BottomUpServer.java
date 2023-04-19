package org.example.server;

import static java.lang.System.exit;

import jakarta.xml.ws.Endpoint;
import org.example.service.CarServiceImpl;
import org.example.service.repository.CarRepositoryImpl;

public class BottomUpServer {

  public static void main(String[] args) {
    System.out.println("Starting CarService Web Service...");

    var carService = new CarServiceImpl(new CarRepositoryImpl(CarServiceImpl.MAX_SIZE));
    Endpoint.publish("http://localhost:8081/carservice", carService);

    try {
      System.in.read();
    } catch (Exception e) {
      e.printStackTrace();
    }

    exit(0);
  }
}

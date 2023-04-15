package org.example.server;

import static java.lang.System.exit;

import jakarta.xml.ws.Endpoint;
import org.example.service.CarServiceTopDownImpl;
import org.example.service.repository.CarRepositoryTopDownImpl;

public class TopDownServer {

  public static void main(String[] args) {
    System.out.println("Starting CarService Web Service...");

    var carService = new CarServiceTopDownImpl(new CarRepositoryTopDownImpl());
    Endpoint.publish("http://localhost:8082/carservice", carService);

    try {
      System.in.read();
    } catch (Exception e) {
      e.printStackTrace();
    }

    exit(0);
  }
}

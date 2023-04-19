package org.example.server;

import jakarta.xml.ws.Endpoint;
import org.example.service.repository.CarRepositoryTopDownV3Impl;
import org.example.service.CarServiceTopDownV3Impl;

import static java.lang.System.exit;

public class TopDownServerV3 {

  public static void main(String[] args) {
    System.out.println("Starting CarService Web Service...");

    var carService = new CarServiceTopDownV3Impl(new CarRepositoryTopDownV3Impl(6));
    Endpoint.publish("http://localhost:8082/carservice", carService);

    try {
      System.in.read();
    } catch (Exception e) {
      e.printStackTrace();
    }

    exit(0);
  }
}

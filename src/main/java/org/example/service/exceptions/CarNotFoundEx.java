package org.example.service.exceptions;

import jakarta.xml.ws.WebFault;

@WebFault
public class CarNotFoundEx extends Exception {

  public CarNotFoundEx() {
    super("No car found for given id!");
  }
}

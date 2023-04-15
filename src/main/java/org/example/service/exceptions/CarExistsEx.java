package org.example.service.exceptions;

import jakarta.xml.ws.WebFault;

@WebFault
public class CarExistsEx extends Exception {

  public CarExistsEx() {
    super("This car already exists!");
  }
}

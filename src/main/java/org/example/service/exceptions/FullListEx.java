package org.example.service.exceptions;

import jakarta.xml.ws.WebFault;

@WebFault
public class FullListEx extends Exception {

  public FullListEx() {
    super("Car list is full!");
  }
}

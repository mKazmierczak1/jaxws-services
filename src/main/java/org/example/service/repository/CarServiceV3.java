package org.example.service.repository;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import org.example.model.Car;
import org.example.service.exceptions.CarExistsEx;
import org.example.service.exceptions.CarNotFoundEx;
import org.example.service.exceptions.FullListEx;

import java.util.List;

@WebService
public interface CarServiceV3 {

  @WebMethod
  List<Car> getAllCars();

  @WebMethod
  Car getCar(int id) throws CarNotFoundEx;

  @WebMethod
  void addCar(Car car) throws CarExistsEx, FullListEx;

  @WebMethod
  void updateCar(Car car) throws CarNotFoundEx;

  @WebMethod
  void eraseCars();

  @WebMethod
  void removeCar(int id) throws CarNotFoundEx;
}

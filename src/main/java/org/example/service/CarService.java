package org.example.service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import java.util.List;
import org.example.model.Car;
import org.example.service.exceptions.CarExistsEx;
import org.example.service.exceptions.CarNotFoundEx;
import org.example.service.exceptions.FullListEx;

@WebService
public interface CarService {

  @WebMethod
  List<Car> getAllCars();

  @WebMethod
  Car getCar(int id) throws CarNotFoundEx;

  @WebMethod
  void addCar(Car car) throws CarExistsEx, FullListEx;

  @WebMethod
  void updateCar(Car car) throws CarNotFoundEx;

  @WebMethod
  void removeCar(int id) throws CarNotFoundEx;
}

package org.example.service.repository;

import java.util.List;
import org.example.model.Car;
import org.example.service.exceptions.CarExistsEx;
import org.example.service.exceptions.CarNotFoundEx;

public interface CarRepository {

  List<Car> getAllCars();

  Car getCar(int id) throws CarNotFoundEx;

  void addCar(Car car) throws CarExistsEx;

  void removeCar(int id) throws CarNotFoundEx;
}

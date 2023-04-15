package org.example.service.repository;

import java.util.List;
import org.example.topdown.Car;
import org.example.topdown.CarExistsEx_Exception;
import org.example.topdown.CarNotFoundEx_Exception;

public interface CarRepositoryTopDown {

  List<Car> getAllCars();

  Car getCar(int id) throws CarNotFoundEx_Exception;

  void addCar(Car car) throws CarExistsEx_Exception;

  void removeCar(int id) throws CarNotFoundEx_Exception;
}

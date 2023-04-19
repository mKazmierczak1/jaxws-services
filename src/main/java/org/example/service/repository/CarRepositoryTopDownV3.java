package org.example.service.repository;

import org.example.topdownv3.CarExistsEx_Exception;
import org.example.topdownv3.CarNotFoundEx_Exception;
import org.example.topdownv3.Car;
import org.example.topdownv3.FullListEx_Exception;

import java.util.List;

public interface CarRepositoryTopDownV3 {

  List<Car> getAllCars();

  Car getCar(int id) throws CarNotFoundEx_Exception;

  void addCar(Car car) throws CarExistsEx_Exception, FullListEx_Exception;

  void updateCar(Car car) throws CarNotFoundEx_Exception;

  void eraseCars();

  void removeCar(int id) throws CarNotFoundEx_Exception;
}

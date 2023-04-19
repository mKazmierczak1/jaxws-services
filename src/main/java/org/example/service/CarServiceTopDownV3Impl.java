package org.example.service;

import jakarta.jws.WebService;
import lombok.RequiredArgsConstructor;
import org.example.service.repository.CarRepositoryTopDownV3;
import org.example.topdownv3.*;
import org.example.topdownv3.CarService;

import java.util.List;

@WebService(name = "CarService", endpointInterface = "org.example.topdownv3.CarService")
@RequiredArgsConstructor
public class CarServiceTopDownV3Impl implements CarService {

  private final CarRepositoryTopDownV3 carRepository;

  @Override
  public List<Car> getAllCars() {
    System.out.println("called getAllCars");
    return carRepository.getAllCars();
  }

  @Override
  public void eraseCars() {
    System.out.println("called getAllCars");
    carRepository.eraseCars();
  }

  @Override
  public Car getCar(int id) throws CarNotFoundEx_Exception {
    System.out.println("called getCar");
    return carRepository.getCar(id);
  }

  @Override
  public void updateCar(Car car) throws CarNotFoundEx_Exception {
    System.out.println("called updateCar");
    carRepository.updateCar(car);
  }

  @Override
  public void addCar(Car car) throws CarExistsEx_Exception, FullListEx_Exception {
    System.out.println("called addCar");
    carRepository.addCar(car);
  }

  @Override
  public void removeCar(int id) throws CarNotFoundEx_Exception {
    System.out.println("called removeCar");
    carRepository.removeCar(id);
  }
}

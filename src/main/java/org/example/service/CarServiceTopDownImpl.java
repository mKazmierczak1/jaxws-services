package org.example.service;

import jakarta.jws.WebService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.example.service.repository.CarRepositoryTopDown;
import org.example.topdown.Car;
import org.example.topdown.CarExistsEx_Exception;
import org.example.topdown.CarNotFoundEx_Exception;
import org.example.topdown.CarService;

@WebService(name = "CarService", endpointInterface = "org.example.topdown.CarService")
@RequiredArgsConstructor
public class CarServiceTopDownImpl implements CarService {

  private final CarRepositoryTopDown carRepository;

  @Override
  public List<Car> getAllCars() {
    System.out.println("called getAllCars");
    return carRepository.getAllCars();
  }

  @Override
  public Car getCar(int id) throws CarNotFoundEx_Exception {
    System.out.println("called getCar");
    return carRepository.getCar(id);
  }

  @Override
  public void addCar(Car car) throws CarExistsEx_Exception {
    System.out.println("called addCar");
    carRepository.addCar(car);
  }

  @Override
  public void removeCar(int id) throws CarNotFoundEx_Exception {
    System.out.println("called removeCar");
    carRepository.removeCar(id);
  }
}

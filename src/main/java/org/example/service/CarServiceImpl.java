package org.example.service;

import jakarta.jws.WebService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.example.model.Car;
import org.example.service.exceptions.CarExistsEx;
import org.example.service.exceptions.CarNotFoundEx;
import org.example.service.exceptions.FullListEx;
import org.example.service.repository.CarRepository;

@WebService(name = "CarService", endpointInterface = "org.example.service.CarService")
@RequiredArgsConstructor
public class CarServiceImpl implements CarService {

  public static final int MAX_SIZE = 6;

  private final CarRepository carRepository;

  @Override
  public List<Car> getAllCars() {
    System.out.println("called getAllCars");
    return carRepository.getAllCars();
  }

  @Override
  public Car getCar(int id) throws CarNotFoundEx {
    System.out.println("called getCar");
    return carRepository.getCar(id);
  }

  @Override
  public void addCar(Car car) throws CarExistsEx, FullListEx {
    System.out.println("called addCar");
    carRepository.addCar(car);
  }

  @Override
  public void updateCar(Car car) throws CarNotFoundEx {
    System.out.println("called updateCar");
    carRepository.updateCar(car);
  }

  @Override
  public void removeCar(int id) throws CarNotFoundEx {
    System.out.println("called removeCar");
    carRepository.removeCar(id);
  }
}

package org.example.service.repository;

import org.example.service.exceptions.CarExistsEx;
import org.example.service.exceptions.FullListEx;
import org.example.topdownv3.Car;
import org.example.topdownv3.CarExistsEx_Exception;
import org.example.topdownv3.CarNotFoundEx_Exception;
import org.example.topdownv3.FullListEx_Exception;

import java.util.ArrayList;
import java.util.List;

public class CarRepositoryTopDownV3Impl implements CarRepositoryTopDownV3 {

  private final List<Car> cars;
  private final int maxSize;

  public CarRepositoryTopDownV3Impl(int maxSize) {
    this.maxSize = maxSize;

    cars = new ArrayList<>();
    cars.add(new Car(1, "Volkswagen", "Golf", 1998, 2.0f));
    cars.add(new Car(2, "Alfa Romeo", "Giulia", 2018, 2.2f));
    cars.add(new Car(3, "Honda", "Civic", 2005, 1.7f));
    cars.add(new Car(4, "Audi", "A5", 2020, 2.5f));
  }

  @Override
  public List<Car> getAllCars() {
    return cars;
  }

  @Override
  public Car getCar(int id) throws CarNotFoundEx_Exception {
    return cars.stream()
        .filter(car -> car.getId() == id)
        .findFirst()
        .orElseThrow(CarNotFoundEx_Exception::new);
  }

  @Override
  public void addCar(Car car) throws CarExistsEx_Exception, FullListEx_Exception {
    if (cars.size() >= maxSize) {
      throw new FullListEx_Exception();
    }

    if (cars.contains(car)) {
      throw new CarExistsEx_Exception();
    }

    cars.add(car);
  }

  @Override
  public void updateCar(Car car) throws CarNotFoundEx_Exception {
    long carId =
            cars.stream()
                    .filter(c -> c.getId() == car.getId())
                    .findFirst()
                    .map(Car::getId)
                    .orElseThrow(CarNotFoundEx_Exception::new);

    cars.replaceAll(car1 -> car1.getId() == carId ? car : car1);
  }

  @Override
  public void eraseCars() {
    cars.clear();
  }

  @Override
  public void removeCar(int id) throws CarNotFoundEx_Exception {
    var car =
        cars.stream()
            .filter(c -> c.getId() == id)
            .findFirst()
            .orElseThrow(CarNotFoundEx_Exception::new);
    cars.remove(car);
  }
}

package org.example.service.repository;

import java.util.ArrayList;
import java.util.List;
import org.example.model.Car;
import org.example.service.exceptions.CarExistsEx;
import org.example.service.exceptions.CarNotFoundEx;
import org.example.service.exceptions.FullListEx;

public class CarRepositoryImpl implements CarRepository {

  private final List<Car> cars;
  private final int maxSize;

  public CarRepositoryImpl(int maxSize) {
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
  public Car getCar(int id) throws CarNotFoundEx {
    return cars.stream()
        .filter(car -> car.getId() == id)
        .findFirst()
        .orElseThrow(CarNotFoundEx::new);
  }

  @Override
  public void addCar(Car car) throws CarExistsEx, FullListEx {
    if (cars.size() >= maxSize) {
      throw new FullListEx();
    }

    if (cars.contains(car)) {
      throw new CarExistsEx();
    }

    cars.add(car);
  }

  @Override
  public void updateCar(Car car) throws CarNotFoundEx {
    long carId =
        cars.stream()
            .filter(c -> c.getId() == car.getId())
            .findFirst()
            .map(Car::getId)
            .orElseThrow(CarNotFoundEx::new);

    cars.replaceAll(car1 -> car1.getId() == carId ? car : car1);
  }

  @Override
  public void removeCar(int id) throws CarNotFoundEx {
    var car =
        cars.stream().filter(c -> c.getId() == id).findFirst().orElseThrow(CarNotFoundEx::new);
    cars.remove(car);
  }
}

package org.example.service.repository;

import java.util.ArrayList;
import java.util.List;
import org.example.topdown.Car;
import org.example.topdown.CarExistsEx_Exception;
import org.example.topdown.CarNotFoundEx_Exception;

public class CarRepositoryTopDownImpl implements CarRepositoryTopDown {

  private final List<Car> cars;

  public CarRepositoryTopDownImpl() {
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
  public void addCar(Car car) throws CarExistsEx_Exception {
    if (cars.contains(car)) {
      throw new CarExistsEx_Exception();
    }

    cars.add(car);
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

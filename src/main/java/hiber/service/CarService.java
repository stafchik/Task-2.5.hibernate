package hiber.service;

import hiber.model.Car;
import hiber.model.User;

import java.util.List;

public interface CarService {
    void add(Car car);

    List<Car> listCar();
    User getUserbyCar(String model, int series);
}

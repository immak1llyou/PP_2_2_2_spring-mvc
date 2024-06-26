package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {
    List<Car> getCars();

    List<Car> getSomeNumberCars(int value);

    List<Car> getCarsToDisplay(Integer count);
}

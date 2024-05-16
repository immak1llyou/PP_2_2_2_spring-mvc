package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDAOImp implements CarDAO {
    private List<Car> cars;
    private List<Car> someCars;

    {
        cars = new ArrayList<Car>();
        cars.add(new Car("model1", "black", 1));
        cars.add(new Car("model2", "white", 2));
        cars.add(new Car("model3", "yellow", 3));
        cars.add(new Car("model4", "red", 4));
        cars.add(new Car("model5", "purple", 5));
    }

    @Override
    public List<Car> getCars() {
        return cars;
    }

    @Override
    public List<Car> getSomeNumberCars(int value) {
        someCars = new ArrayList<>();
        for (int i = 0; i < value; i++) {
            someCars.add(cars.get(i));
        }
        return someCars;
    }
}

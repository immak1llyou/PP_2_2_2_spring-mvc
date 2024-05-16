package web.service;

import org.springframework.stereotype.Service;
import web.dao.CarDAO;
import web.dao.CarDAOImp;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImp implements CarService {
    CarDAO carDAO = new CarDAOImp();

    @Override
    public List<Car> getCars() {
        return carDAO.getCars();
    }

    @Override
    public List<Car> getSomeNumberCars(int value) {
        return carDAO.getSomeNumberCars(value);
    }
}

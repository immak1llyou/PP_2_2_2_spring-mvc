package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.Collections;
import java.util.List;

@Service
public class CarServiceImp implements CarService {
    @Autowired
    private CarDao carDAO;

    @Override
    public List<Car> getCars() {
        return carDAO.getCars();
    }

    @Override
    public List<Car> getSomeNumberCars(int value) {
        return carDAO.getSomeNumberCars(value);
    }

    @Override
    public List<Car> getCarsToDisplay(Integer count) {
        if (count != null && count <= carDAO.getCars().size()) {
            return getSomeNumberCars(count);
        } else if (count == null || carDAO.getCars().isEmpty() || carDAO.getCars().size() < count) {
            return getCars();
        }
        return Collections.emptyList();
    }
}

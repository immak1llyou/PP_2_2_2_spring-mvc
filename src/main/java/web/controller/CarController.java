package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
@RequestMapping("/car")
public class CarController {

    private CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping()
    public String anyCountCar(@RequestParam(value = "count", required = false) Integer count, Model model) {
        if (count != null && count <= carService.getCars().size()) {
            model.addAttribute("cars", carService.getSomeNumberCars(count));
        } else if (count == null || carService.getCars().size() == 0 || carService.getCars().size() < count) {
            model.addAttribute("cars", carService.getCars());
        }
        return "cars/car";
    }
}

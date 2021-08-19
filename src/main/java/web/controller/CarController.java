package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    
    @Autowired
    private CarService carService;

    @GetMapping(value = "/cars")
    public String printCars(
            ModelMap model,
            @RequestParam(value = "count", required = false) Integer count
    ) {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Nissan", "Qashqai", 1_500_000));
        carList.add(new Car("Toyota", "RAV4", 2_000_000));
        carList.add(new Car("Subaru", "Forester", 2_400_000));
        carList.add(new Car("Mazda", "CX5", 2_200_000));
        carList.add(new Car("Huyndai", "SantaFe", 2_500_000));
        
        List<String> list = new ArrayList<>();
        carService.getCars(carList, count).forEach(car -> list.add(car.toString()));
        
        model.addAttribute("cars", list);
        return "cars";
    }
}

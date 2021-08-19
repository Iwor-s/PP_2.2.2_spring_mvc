package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestParam;
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
        List<String> list = new ArrayList<>();
        carService.getCarsByCount(count).forEach(car -> list.add(car.toString()));
        
        model.addAttribute("cars", list);
        return "cars";
    }
}

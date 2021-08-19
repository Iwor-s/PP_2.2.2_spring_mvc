package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String printCars(ModelMap model) {
        List<String> messages = new ArrayList<>();
        messages.add((new Car("Nissan", "Qashqai", 1_500_000)).toString());
        messages.add((new Car("Toyota", "RAV4", 2_000_000)).toString());
        messages.add((new Car("Subaru", "Forester", 2_300_000)).toString());
        messages.add((new Car("Mazda", "CX5", 2_200_000)).toString());
        messages.add((new Car("Huyndai", "SantaFe", 2_500_000)).toString());
        
        model.addAttribute("messages", messages);
        return "index";
    }
}

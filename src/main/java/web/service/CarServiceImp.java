package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.List;

@Component
public class CarServiceImp implements CarService {
    
    @Override
    public List<Car> getCars(List<Car> list, Integer num) {
        if (num == null || num < 0) num = 0;
        if (num > list.size()) num = list.size();
        return list.subList(0, num);
    }
}

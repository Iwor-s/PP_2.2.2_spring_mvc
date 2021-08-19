package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;

@Component
public class CarServiceImp implements CarService {
    
    @Autowired
    private CarDao carDao;
    
    @Override
    public List<Car> getCarsByCount(Integer num) {
        List<Car> list = getAllCars();
        if (num == null || num < 0) num = 0;
        if (num > list.size()) num = list.size();
        return list.subList(0, num);
    }
    
    @Override
    public List<Car> getAllCars() {
        return carDao.getAllCars();
    }
}

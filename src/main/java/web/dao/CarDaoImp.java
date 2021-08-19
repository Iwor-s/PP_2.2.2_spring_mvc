package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDaoImp implements CarDao {
    
    @Override
    public List<Car> getAllCars() {
        
        List<Car> carList = new ArrayList<>();
        
        carList.add(new Car("Nissan", "Qashqai", 1_500_000));
        carList.add(new Car("Toyota", "RAV4", 2_000_000));
        carList.add(new Car("Subaru", "Forester", 2_400_000));
        carList.add(new Car("Mazda", "CX5", 2_200_000));
        carList.add(new Car("Huyndai", "SantaFe", 2_500_000));
        
        return carList;
    }
}

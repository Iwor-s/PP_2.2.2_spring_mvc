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
    
        carList.add(new Car("Subaru", "Forester", 3_300_000));
        carList.add(new Car("Toyota", "RAV4", 3_000_000));
        carList.add(new Car("Jeep", "Renegade", 2_700_000));
        carList.add(new Car("Nissan", "X-Trail", 2_300_000));
        carList.add(new Car("Renault", "Duster", 1_500_000));
        
        return carList;
    }
}

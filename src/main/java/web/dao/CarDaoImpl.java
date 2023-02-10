package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {
    private List<Car> carList = new ArrayList<>();

    {
        carList.add(new Car("BMW", "Black", 950000));
        carList.add(new Car("Mercedes-Benz", "White", 900000));
        carList.add(new Car("Audi", "Blue", 800000));
        carList.add(new Car("Ford", "Red", 750000));
        carList.add(new Car("Lada", "Gray", 180000));
    }

    @Override
    public List<Car> allCars() {
        return carList;
    }
    @Override
    public List<Car> getCars(Integer count) {
        return carList.subList(0, count);
    }
}

package rg.sqsf.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rg.sqsf.project.mapper.CarMapper;
import rg.sqsf.project.model.Car;
import rg.sqsf.project.service.impl.CarServiceImpl;

import java.util.List;
@Service
public class CarService implements CarServiceImpl {
    @Autowired
    private CarMapper carMapper;
    @Override
    public List<Car> findCars() {
        return carMapper.findCars();
    }
}

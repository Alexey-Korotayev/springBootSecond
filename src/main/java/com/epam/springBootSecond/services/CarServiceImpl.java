package com.epam.springBootSecond.services;

import com.epam.springBootSecond.data.models.CarJPA;
import com.epam.springBootSecond.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarRepository carRepository;

    @Override
    public List<CarJPA> getCars() {
        List<CarJPA> carsJPA = carRepository.getCars();
        return carsJPA;
    }

    @Override
    public CarJPA getOneCar(int id) {
        CarJPA car = carRepository.findById(id);
        return car;
    }
}


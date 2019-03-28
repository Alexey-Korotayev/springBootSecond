package com.epam.springBootSecond.controllers;

import com.epam.springBootSecond.data.models.CarJPA;
import com.epam.springBootSecond.exception.NotFoundExceptionMy;
import com.epam.springBootSecond.services.CarService;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("cars")
public class CarsController {

   // @Value("${app:application:message}")
    private String str = "ffffffffffffffff";

    @Autowired
    private CarService carService;

    @GetMapping
    public List<CarJPA>  list() {
        List<CarJPA> cars  = carService.getCars();
        return cars;
    }

    @GetMapping("{id}")
    public CarJPA  getOneCarlist(@PathVariable Integer id) {
        CarJPA car;
        try {
            car = carService.getOneCar(id);
        } catch (RuntimeException e) {
            throw new NotFoundExceptionMy();
        }
        return car;
    }
}

package com.epam.springBootSecond.services;

import com.epam.springBootSecond.data.models.CarJPA;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarService  {

    List<CarJPA> getCars();

    CarJPA getOneCar(int id);
}

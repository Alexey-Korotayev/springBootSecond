package com.epam.springBootSecond.repository;

import com.epam.springBootSecond.data.models.CarJPA;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public interface CarRepository extends JpaRepository<CarJPA, String> {

    @Query("SELECT cars FROM CarJPA cars ")
    List<CarJPA> getCars();

    @Query(value = "SELECT cars from CarJPA cars "
            + "WHERE cars.id = :id ")
    CarJPA findById(@Param("id") Integer id);

}




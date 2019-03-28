package com.epam.springBootSecond.data.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "cars2")
public class CarJPA implements Serializable {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "brand")
    private String  brand;

    @Column(name = "descr")
    private String  descr;

    @Column(name = "cost")
    private Integer cost;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "CarJPA{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", descr='" + descr + '\'' +
                ", cost=" + cost +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarJPA carJPA = (CarJPA) o;
        return Objects.equals(id, carJPA.id) &&
                Objects.equals(brand, carJPA.brand) &&
                Objects.equals(descr, carJPA.descr) &&
                Objects.equals(cost, carJPA.cost);
    }

}

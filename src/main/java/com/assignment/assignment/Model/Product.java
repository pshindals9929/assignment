package com.assignment.assignment.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {

    public Product(Integer id, String name, Double price,Boolean isVisible) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.isVisible = isVisible;
    }

    @Id
    private Integer id;

    @Column
    private String name;
    @Column
    private Double price;

    @Column
    private Boolean isVisible;

    public Boolean getVisible() {
        return isVisible;
    }

    public void setVisible(Boolean visible) {
        isVisible = visible;
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}

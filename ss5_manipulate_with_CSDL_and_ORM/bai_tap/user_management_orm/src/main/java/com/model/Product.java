package com.model;

import javax.persistence.*;

@Entity
@Table(name = "abc")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Double price;
    private String describe;        //mô tả sản phẩm
    private String manufacture;     //nhà sản xuất

    public Product() {
    }

    public Product(Integer id, String name, Double price, String describe, String manufacture) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.describe = describe;
        this.manufacture = manufacture;
    }
    public Product(String name, Double price, String describe, String manufacture) {

        this.name = name;
        this.price = price;
        this.describe = describe;
        this.manufacture = manufacture;
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

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }
}

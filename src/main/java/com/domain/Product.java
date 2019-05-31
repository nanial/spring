package com.domain;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Float price;
    private String description;

   /* private String nameOfMedical;*/

    public Product(Integer id, Float price, String description/*, String nameOfMedical*/) {
        this.id = id;
        this.price = price;
        this.description = description;

        /*this.nameOfMedical = nameOfMedical;*/
    }
    public Product() {
    }
/*
    public String getNameOfMedical() {
        return nameOfMedical;
    }

    public void setNameOfMedical(String nameOfMedical) {
        this.nameOfMedical = nameOfMedical;
    }*/

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

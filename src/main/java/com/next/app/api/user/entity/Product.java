package com.next.app.api.user.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import jakarta.persistence.Column;
import java.math.BigDecimal;

@Entity
@Table(name = "anheebin_product")
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private BigDecimal price;
    private String description;
    // Constructors
    public Product() {}
    public Product(String name, BigDecimal price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }
    // Getters and Setters
    @Column(name = "id")
    public Long getId() {
        return id;
    }
    @Column(name = "name")
    public String getName() {
        return name;
    }
    @Column(name = "price")
    public void setName(String name) {
        this.name = name;
    }
    @Column(name = "price")
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }
    @Column(name = "description")
    public void setDescription(String description) {
        this.description = description;
    }
}
package com.cadastro.api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Entity
@AllArgsConstructor
@NoArgsConstructor
public class ProductModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProduct;
    private String nameProduct;
    private String description;
    private String category;
    private String subcategory;
    private String barcode;
    private String sku;

    private Integer stock;
    private Integer minimumStock;
    private Integer maximumStock;

    private BigDecimal costPrice;
    private BigDecimal salePrice;
    private double discount;
    private BigDecimal profitMargin;

    private String manufacturer;
    private String brand;
    private String countryOfOrigin;

    private double weight;
    private double width;
    private double height;
    private double depth;

    private boolean active;
    private LocalDateTime creationDate;
    private LocalDateTime lastUpdated;
}

package com.codegym.shopping_cart.dto;

import java.util.Objects;

public class ProductDto {
    private Long idProduct;
    private String nameProduct;
    private Double price;
    private String description;

    public ProductDto() {
    }

    public ProductDto(String nameProduct, Double price, String description) {
        this.nameProduct = nameProduct;
        this.price = price;
        this.description = description;
    }

    public Long getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Long idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductDto that = (ProductDto) o;
        return idProduct == that.idProduct;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idProduct);
    }
}

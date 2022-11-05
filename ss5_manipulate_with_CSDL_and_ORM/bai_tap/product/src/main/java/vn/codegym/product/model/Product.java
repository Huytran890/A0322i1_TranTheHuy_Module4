package vn.codegym.product.model;

import javax.persistence.*;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idProduct;
    private String nameProduct;
    @Column(columnDefinition = "double")
    private String price;
    private String description;
    private String manufacture;

    @ManyToOne
    @JoinColumn(name = "category", referencedColumnName = "id")
    private Category category;

    public Product() {
    }

    public Product(Integer idProduct, String nameProduct, String price, String description, String manufacture,
                   Category category) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.price = price;
        this.description = description;
        this.manufacture = manufacture;
        this.category = category;
    }

    public Integer getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Integer idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}

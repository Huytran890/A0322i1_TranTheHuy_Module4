package vn.codegym.product.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
public class Category {
    @Id
    private Integer id;
    private String name;
    @OneToMany(mappedBy = "category")
    private List<Product> categoryList;

    public Category() {
    }

    public Category(Integer id, String name, List<Product> categoryList) {
        this.id = id;
        this.name = name;
        this.categoryList = categoryList;
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

    public List<Product> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(List<Product> categoryList) {
        this.categoryList = categoryList;
    }
}

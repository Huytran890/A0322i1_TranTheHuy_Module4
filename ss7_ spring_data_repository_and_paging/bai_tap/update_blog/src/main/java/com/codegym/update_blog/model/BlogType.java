package com.codegym.update_blog.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
//@Table(name = "blog_type")
public class BlogType {
    @Id
    private Integer id;
    private String name;

    @OneToMany(mappedBy = "blogType")
    private List<AppBlog> blogList;

    public BlogType() {
    }

    public BlogType(Integer id, String name) {
        this.id = id;
        this.name = name;
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

    public List<AppBlog> getBlogList() {
        return blogList;
    }

    public void setBlogList(List<AppBlog> blogList) {
        this.blogList = blogList;
    }
}


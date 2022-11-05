package com.codegym.update_blog.model;

import javax.persistence.*;

@Entity
//@Table(name = "blog")
public class AppBlog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idBlog;
    private String nameBlog;
    private String title;
    private String content;

    @ManyToOne
    @JoinColumn(name = "blog_type_id", referencedColumnName = "id")
    private BlogType blogType;

    public AppBlog() {
    }

    public AppBlog(Integer idBlog, String nameBlog, String title, String content, BlogType blogType) {
        this.idBlog = idBlog;
        this.nameBlog = nameBlog;
        this.title = title;
        this.content = content;
        this.blogType = blogType;
    }

    public Integer getIdBlog() {
        return idBlog;
    }

    public void setIdBlog(Integer idBlog) {
        this.idBlog = idBlog;
    }

    public String getNameBlog() {
        return nameBlog;
    }

    public void setNameBlog(String nameBlog) {
        this.nameBlog = nameBlog;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public BlogType getBlogType() {
        return blogType;
    }

    public void setBlogType(BlogType blogType) {
        this.blogType = blogType;
    }
}

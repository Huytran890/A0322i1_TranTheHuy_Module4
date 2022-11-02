package com.repository;

public interface IAppBlogRepository extends JpaRepository<AppBlog,Integer> {

    @Query(value = "select * from blog where name_blog like :name", nativeQuery = true)
    List<AppBlog> listSearch(@Param("name") String name);

}

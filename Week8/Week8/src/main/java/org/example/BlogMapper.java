package org.example;

import javafx.geometry.Pos;

import java.util.List;

public interface BlogMapper {
    Blog selectBlogById(int id);
    List<Blog> findAllBlog();
    List<Post> findAllPost();
    Blog selectStateById(int id);
}

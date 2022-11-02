package org.example;

import lombok.Data;

import java.util.List;

@Data
public class Blog {

    private int id;
    private String title;
    private Author author_id;
    private List<Post> posts;
    private List<Comment> comments;
    private List<Tag> tags;
    private State state;
}


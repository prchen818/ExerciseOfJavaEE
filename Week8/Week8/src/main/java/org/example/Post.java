package org.example;

import lombok.Data;

@Data
public class Post {
    private int id;
    private int blog_id;
    private int author_id;
    private String created_on;
    private String section;
    private String subject;
    private  String draft;
    private String body;
}

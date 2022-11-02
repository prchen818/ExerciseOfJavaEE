package org.example;

import lombok.Data;

@Data
public class Comment {
    private  int id;
    private int post_id;
    private String name;
    private String comment;
}

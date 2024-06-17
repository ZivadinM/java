package com.example.test.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
@Table(name="post")
public class Post {

    @Id
    private int id;
    private String title;
    private String description;
    private int owner;

    public Post(int id, String description,String title,int owner) {
        super();
        this.id = id;
        this.title=title;
        this.description = description;
        this.owner = owner;
    }

    public Post() {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getOwner() {
        return owner;
    }

    public void setOwner(int owner) {
        this.owner = owner;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean compare(String title) {
        return Objects.equals(title, this.getTitle());
    }
}

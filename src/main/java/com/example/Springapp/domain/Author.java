package com.example.Springapp.domain;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Set;
@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String Title;
    private int isbn;
    private Set<Books> book ;

    public Author() {
    }

    public Author(String title, int isbn, Set<Books> book) {
        Title = title;
        this.isbn = isbn;
        this.book = book;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public Set<Books> getBook() {
        return book;
    }

    public void setBook(Set<Books> book) {
        this.book = book;
    }
}

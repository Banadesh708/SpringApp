package com.example.Springapp.domain;
import java.util.Set;
public class Author {
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

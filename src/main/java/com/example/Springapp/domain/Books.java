package com.example.Springapp.domain;
import java.util.Set;
public class Books {
    private String FirstName ;
    private String LastName;
    private Set<Author> authors;

    public Books() {
    }

    public Books(String firstName, String lastName, Set<Author> authors) {
        FirstName = firstName;
        LastName = lastName;
        this.authors = authors;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public Set<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<Author> authors) {
        this.authors = authors;
    }
}

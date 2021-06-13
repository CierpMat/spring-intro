package pl_sda;

import lombok.Data;

@Data
public class Book {

    private String name;
    private Author author;

    public Book() {

    }

    public Book(String name) {
        this.name = name;
    }
}

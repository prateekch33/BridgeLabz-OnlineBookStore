package org.example;

public class BookStore {
    private String title,author,ISBN;
    private int price;

    public int getPrice() {
        return this.price;
    }
    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getISBN() {
        return this.ISBN;
    }

    public void setTitle(String title) {
        this.title=title;
    }

    public void setAuthor(String author) {
        this.author=author;
    }

    public void setISBN(String ISBN) {
        this.ISBN=ISBN;
    }

    public void setPrice(int price) {
        this.price=price;
    }
}

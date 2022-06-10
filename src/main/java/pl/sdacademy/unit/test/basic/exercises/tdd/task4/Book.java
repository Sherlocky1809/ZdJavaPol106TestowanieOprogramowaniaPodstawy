package pl.sdacademy.unit.test.basic.exercises.tdd.task4;

public class Book {

    private Author author;
    private String title;
    private float price;

    public Book(String title, Author author, float price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public float getPrice() {
        return price;
    }
}
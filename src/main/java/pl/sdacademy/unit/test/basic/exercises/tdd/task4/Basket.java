package pl.sdacademy.unit.test.basic.exercises.tdd.task4;

public class Basket {

    private int maxNumberOfBooksInBasket;
    private Book[] books;
    private int currentNoOfBooksInBasket = 0;

    public Basket(int maxNumberOfBooksInBasket) {
        this.maxNumberOfBooksInBasket = maxNumberOfBooksInBasket;
        books = new Book[maxNumberOfBooksInBasket];
    }

    public Book[] getAllBooks() {
        return books;
    }

    public void addBook(Book book) {
        if (maxNumberOfBooksInBasket > currentNoOfBooksInBasket) {
            books[currentNoOfBooksInBasket++] = book;
        }
    }

    public void cleanBasket() {
       for (int i = 0; i < maxNumberOfBooksInBasket; i++) {
           books[i] = null;
       }
    }

    public float getTotalAmount() {
        int sum = 0;
        for (Book book: books) {
            sum += book.getPrice();
        }
        return sum;
    }
}
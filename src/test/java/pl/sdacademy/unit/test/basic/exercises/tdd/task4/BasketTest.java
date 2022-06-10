package pl.sdacademy.unit.test.basic.exercises.tdd.task4;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class BasketTest {

    /*
    test cases:
    * Dodajemy np. 3 książki do koszyka, pobieramy wszystkie i sprawdzamy czy metoda rzeczywiście zwróci 3 książki.
    * Dodajemy np. 3 książki do koszyka a potem czyścimy koszyk i sprawdzamy czy koszyk jest pusty.
    * Dodajemy np. 3 książki do koszyka a potem weryfikujemy czy total amount jest poprawny.
    * Tworzymy koszyk 2 elementowy a potem próbujemy dodać 3 element i sprawdzamy czy na pewno są tylko dwa elementy.
     */

    private static Book book1;
    private static Book book2;
    private static Book book3;

    @BeforeAll
    static void init() {
        book1 = new Book("Baran-Buc", new Author("Tomasz", "Spiewak"), 20 );
        book2 = new Book("Bu z Noskiem", new Author("Jacek", "Wuzek"), 50 );
        book3 = new Book("Slodziak-slodziak", new Author("Anna", "Noske"), 30 );
    }

    @Test
    void shouldReturnAllAddedBooksFromBasket() {
        // given
        Book[] expectedResult = {book1, book2, book3};
        Basket basket = new Basket(3);
        basket.addBook(book1);
        basket.addBook(book2);
        basket.addBook(book3);
        // when
        Book[] result = basket.getAllBooks();
        // then
        assertArrayEquals(expectedResult, result);
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void shouldBasketBeEmptyIfRemoveAllBooks() {
        // given
        Book[] expectedResult = {null, null, null};
        Basket basket = new Basket(3);
        basket.addBook(book1);
        basket.addBook(book2);
        basket.addBook(book3);
        // when
        basket.cleanBasket();
        Book[] result = basket.getAllBooks();
        // then
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void shouldTotalAmountIsCorrect() {
        // given
        float expectedResult = 20 + 30 + 50;
        Basket basket = new Basket(3);
        basket.addBook(book1);
        basket.addBook(book2);
        basket.addBook(book3);
        // when
        float result = basket.getTotalAmount();
        // then
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void shouldNotAddThirdBookIfBasketsCapacityIsTwo() {
        // given
        Book[] expectedResult = {book1,book2};
        Basket basket = new Basket(2);
        basket.addBook(book1);
        basket.addBook(book2);
        // when
        basket.addBook(book3);
        Book[] result = basket.getAllBooks();
        // then
        assertThat(result).isEqualTo(expectedResult);
    }
}
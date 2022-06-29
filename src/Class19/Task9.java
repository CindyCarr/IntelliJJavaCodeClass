package Class19;
class Book {
    String author;
    int pageCount;

    Book(String author) {
        this.author = author;
    }

    Book(String author, int pageCount) {
        this.author = author;
        this.pageCount = pageCount;
    }
}

public class Task9 {
    public Task9() {
    }

    public static void main(String[] args) {
        new Book("Hemingay");
        new Book("No known", 5000);
    }
}

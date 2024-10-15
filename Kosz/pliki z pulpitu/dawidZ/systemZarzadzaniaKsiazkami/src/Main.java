import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book();
        book1.setTitle("The Catcher in the Rye");
        book1.setAuthor("J.D. Salinger");
        book1.setIsbn("1234567890");
        library.addBook(book1);

        Book book2 = new Book();
        book2.setTitle("To Kill a Mockingbird");
        book2.setAuthor("Harper Lee");
        book2.setIsbn("9876543210");
        library.addBook(book2);

        Book book3 = new Book();
        book3.setTitle("1984");
        book3.setAuthor("George Orwell");
        book3.setIsbn("5678901234");
        library.addBook(book3);

        System.out.println("Wszystkie książki:");
        library.printBooks();

        library.removeBook("9876543210");

        System.out.println("\nKsiążki Georgea Orwella:");
        library.findBookByAuthor("George Orwell");

        System.out.println("\nKsiążki o nazwie '1984':");
        library.findBookByTitle("1984");

        System.out.println("\nKsiążki pozostałe po usunięciu:");
        library.printBooks();
    }
}

class Book {
    private String title;
    private String author;
    private String isbn;

    protected void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return "Book{" + "title='" + title + '\'' + ", author='" + author + '\'' + ", isbn='" + isbn + '\'' + '}';
    }
}

class Library {
    ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }
    public void removeBook(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                books.remove(book);
                System.out.println("\nusunięcie książki: " + book.getTitle() + " isbn: " + book.getIsbn());
            }
        }
    }
    public void findBookByAuthor(String author) {
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                System.out.println(book);
                break;
            }
        }
    }
    public void findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                System.out.println(book);
                break;
            }
        }
    }
    public void printBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
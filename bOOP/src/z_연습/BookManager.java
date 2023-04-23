package z_연습;
import java.util.Scanner;

public class BookManager {
    private Book[] books;
    private int numBooks;

    public BookManager(int size) {
        books = new Book[size];
        numBooks = 0;
    }

    public void addBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("책 번호: ");
        String bookNumber = scanner.nextLine();
        System.out.print("책 제목: ");
        String bookTitle = scanner.nextLine();
        System.out.print("저자: ");
        String author = scanner.nextLine();
        books[numBooks] = new Book(bookNumber, bookTitle, author);
        numBooks++;
        System.out.println("책이 추가되었습니다.");
    }

    public void addBook(String bookNumber) {
        books[numBooks] = new Book(bookNumber);
        numBooks++;
        System.out.println("책이 추가되었습니다.");
    }

   
}
package z_연습;
public class Book {
    private String bookNumber;
    private String bookTitle;
    private String author;
    private boolean isBorrowed;

    public Book(String bookNumber, String bookTitle, String author) {
        this.bookNumber = bookNumber;
        this.bookTitle = bookTitle;
        this.author = author;
        this.isBorrowed = false;
    }

    public Book(String bookNumber) {
        this(bookNumber, "무제", "작가미상");
    }

    public String getBookNumber() {
        return bookNumber;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void borrowBook() {
        isBorrowed = true;
    }

    public void returnBook() {
        isBorrowed = false;
    }

    public void printBookInfo() {
        System.out.println("책 번호: " + bookNumber);
        System.out.println("책 제목: " + bookTitle);
        System.out.println("저자: " + author);
        System.out.println("대출 여부: " + (isBorrowed ? "대출 중" : "대출 가능"));
    }
}
/*63. TASK 4 - BOOK LOAN
----------------------
Required filename: BookLoan.java
Create a Book class and a public BookLoan driver.
Book state:
- title, author, bookCode, and loaned status
Behavior:
- validate non-blank text in the constructor
- boolean borrowBook()
- boolean returnBook()
- boolean isAvailable()
- getters for descriptive fields
- no unrestricted setter for loaned status
- readable toString()
Test repeated borrowing, returning an available book, and independent books.
*/
public class BookLoan {
    class Book {
        private String title;
        private String author;
        private String bookCode;
        private boolean loaned;
        public Book(String title, String author, String bookCode) {
            if (title == null || title.isBlank()) {
                System.out.println("Title cannot be blank");
            }
            if (author == null || author.isBlank()) {
                System.out.println("Author cannot be blank");
            }
            if (bookCode == null || bookCode.isBlank()) {
                System.out.println("Book code cannot be blank");
            }
            this.title = title;
            this.author = author;
            this.bookCode = bookCode;
            this.loaned = false;
        }
        public boolean borrowBook() {
            if (loaned) {
                return false;
            }
            loaned = true;
            return true;
        }
        public boolean returnBook() {
            if (!loaned) {
                return false;
            }
            loaned = false;
            return true;
        }
        public boolean isAvailable() {
            return !loaned;
        }
        public String getTitle() {
            return title;
        }
        public String getAuthor() {
            return author;
        }
        public String getBookCode() {
            return bookCode;
        }
        public void printBook() {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("Book Code: " + bookCode);
            System.out.println("Loaned: " + loaned);
            System.out.println("Available: " + isAvailable());
        }
    }
    public static void main(String[] args) {
        BookLoan library = new BookLoan();
        Book b1 = library.new Book(
                "Harry Potter",
                "J.K. Rowling",
                "B101"
        );
        Book b2 = library.new Book(
                "The Alchemist",
                "Paulo Coelho",
                "B102"
        );
        b1.printBook();
        System.out.println();
        b2.printBook();
        System.out.println();
        System.out.println("Borrow b1: " + b1.borrowBook());
        System.out.println("Borrow b1 again: " + b1.borrowBook());
        b1.printBook();
        System.out.println();
        System.out.println("Return b1: " + b1.returnBook());
        System.out.println("Return b1 again: " + b1.returnBook());
        b1.printBook();
        System.out.println();
        System.out.println("Borrow b2: " + b2.borrowBook());
        System.out.println();
        System.out.println("Book 1:");
        b1.printBook();
        System.out.println();
        System.out.println("Book 2:");
        b2.printBook();
    }
}
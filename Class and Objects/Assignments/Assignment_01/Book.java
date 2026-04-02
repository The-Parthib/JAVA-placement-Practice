package Assignments.Assignment_01;

public class Book {
    // static variable
    static int totalBooks;
    
    // instance variable
    String title;
    String author;
    String isbn;
    boolean isBorrowed;

    static{
        totalBooks=0;
    }

    // constructors
    Book(String title, String author, String isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isBorrowed = false;
        totalBooks++;
    }

    Book(String isbn){
        this.isbn = isbn;
        this.title = "Unknown";
        this.author = "Unknown";
        this.isBorrowed = false;
        totalBooks++;
    }

    // instance methods
    public void borrowBook(){
        if (isBorrowed) {
            System.out.println("Book is already borrowed");
        }
        else{
            this.isBorrowed = true;
            System.out.println(this.title + " borrowed");
        }
    }

    public void returnBook(){
        if (isBorrowed) {
            this.isBorrowed = false;
            System.out.println(this.title + " returned");
        }
        else{
            System.out.println("Book is available in the Library");
        }
    }

    static void getTotalBooks(){
        System.out.println("Total Books: " + totalBooks);
    }


    public static void main(String[] args) {
        Book b1 = new Book("Java", "John", "123");
        Book b2 = new Book("Python", "Doe", "456");
        Book b3 = new Book("789");

        Book.getTotalBooks();

        b1.borrowBook();
        b2.borrowBook();
        b1.borrowBook();
        b3.returnBook();

    }


}

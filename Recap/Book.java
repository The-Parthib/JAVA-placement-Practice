public class Book {
    static int totalBooks;

    String title;
    String author;
    String isbn;
    boolean isBorrowed;

    static{
        totalBooks = 0;
    }
    {
        totalBooks++;
    }

    Book(String title, String author, String isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    Book(String isbn){
        this("unknown","unknown",isbn);
    }

    // methods

    static int getTotalBooks(){
        return totalBooks;
    }

    void borrowBook(){
        if (isBorrowed) {
            System.out.println("This book is already borrowed");
        }
        else{
            this.isBorrowed = false;
            System.out.println("Enjoy "+this.title);
        }
    }

    void returnBook(){
        if (isBorrowed) {
            this.isBorrowed = false;
            System.out.println("Thanks leave a review");
        }
        else{
            System.out.println("Already in the library");
        }
    }

    public static void main(String[] args) {
        Book Dsa = new Book("Dsa/1");
        Book Java = new Book("Complete Java", "D.Samanta", "Java/2");

        System.out.println(Book.getTotalBooks());
        Dsa.borrowBook();
        Java.borrowBook();
        Dsa.borrowBook();
        Java.returnBook();
        Dsa.borrowBook();
        Java.returnBook();

        // for only switch cases
        newSwitch(3);
    }

    // modern switch cases
    public static void newSwitch(int day){
        String dayStr = switch(day){
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid";
        };
        System.out.println(dayStr);
    }
}

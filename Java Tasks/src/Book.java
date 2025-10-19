public class Book {
    // Attributes (variables)
    String title;
    String author;
    int year;

    // Method to display book info
    void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
      
    }

    // Main method
    public static void main(String[] args) {

        Book book1 = new Book();
        book1.title = "My First Story";
        book1.author = "Ali Khan";
        book1.year = 2015;

        Book book2 = new Book();
        book2.title = "Learning Java";
        book2.author = "Sara Ahmed";
        book2.year = 2020;

        Book book3 = new Book();
        book3.title = "Happy Days";
        book3.author = "Amna Noor";
        book3.year = 2018;

        System.out.println("BOOK DETAILS ");
        book1.displayInfo();
        book2.displayInfo();
        book3.displayInfo();
    }
}

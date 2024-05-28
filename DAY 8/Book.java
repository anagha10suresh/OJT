public class Book {
    private String isbn, title, author;
    private boolean available = true;

    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    public void borrow() {
        System.out.println(available ? "Book borrowed successfully." : "Book is not available for borrowing.");
        available = !available;
    }

    public void returnBook() {
        System.out.println(available ? "Book is already available." : "Book returned successfully.");
        available = !available;
    }

    public void displayDetails() {
        System.out.println("ISBN: " + isbn + ", Title: " + title + ", Author: " + author + ", Availability: " + (available ? "Available" : "Not Available"));
    }

    public static void main(String[] args) {
        Book book1 = new Book("978-3-16-148410-0", "The Glory", " Psudeo Science");
        book1.displayDetails();
        book1.borrow();
        book1.displayDetails();
        book1.borrow();
        book1.returnBook();
        book1.displayDetails();
    }
}

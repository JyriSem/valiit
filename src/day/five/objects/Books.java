package day.five.objects;

public class Books {
    String title;
    String author;
    int yearPublished;

    public Books() {
        title = "unknown";
        author = "unknown";
        yearPublished = 1900;
    }

    public Books(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year Published: " + yearPublished);
    }
}
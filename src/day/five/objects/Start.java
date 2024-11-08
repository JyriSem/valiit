package day.five.objects;

public class Start {
    public static void main(String[] args) {
        Books book1 = new Books("Raamat", "Lenin", 3030);
//        System.out.println(book.title + book.author + book.yearPublished);
        Books book2 = new Books("d", "d", 2000);
        book1.display();
        book2.display();
    }
}
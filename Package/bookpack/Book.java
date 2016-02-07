package bookpack; // this file is part of the bookpack package

// must declare Book class public
public class Book {
    private String author;
    private String bookTitle;

    // must declare constructor public
    public Book(String a, String b){
        author = a;
        bookTitle = b;
    }

    // must declare show method public
    public void show(){
        System.out.println(author);
        System.out.println(bookTitle);
    }
}
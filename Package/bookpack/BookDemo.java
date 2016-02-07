package bookpack; // this file is part of the bookpack package

class Book {
    private String author;
    private String bookTitle;

    Book(String a, String b){
        author = a;
        bookTitle = b;
    }

    void show(){
        System.out.println(author);
        System.out.println(bookTitle);
    }
}

class BookDemo {
    public static void main (String[] args){

    }
}
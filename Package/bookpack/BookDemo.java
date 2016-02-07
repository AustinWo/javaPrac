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
        Book[] myBooks = new Book[3];
        myBooks[0] = new Book("Michael", "The art of Java");
        myBooks[1] = new Book("Kevin", "The art of JavaScript");
        myBooks[2] = new Book("Liam", "The art of Python");
        for(Book currentBook: myBooks){
            currentBook.show();
        }
    }
}
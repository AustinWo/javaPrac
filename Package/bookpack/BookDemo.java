// compile by running executing
// javac bookpack/BookDemo.java

// Execute the class in parent directory by
// java bookpack.BookDemo

// BookDemo and Book are not part of the package bookpack and connot be executed by itself

package bookpack; // this file is part of the bookpack package

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
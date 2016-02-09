// Demonstrate protected
package bookpackext;

class ExtBook extends bookpack.Book {
    private String publisher;

    public ExtBook(String a, String b, String p){
        super(a, b);
        publisher = p;
    }

    public void show(){
        super.show();
        System.out.println(publisher);
        System.out.println();
    }

    public String getPublisher() {return publisher;}
    public void setPublisher(String p) {publisher = p;}

    // these are ok because subclass can access protected members
    // Book's author and bookTitle are protected
    public String getAuthor() {return author;}
    public String getBookTitle() {return bookTitle;}
}


class ProtectDemo {
    public static void main (String[] args){
        ExtBook[] books = new ExtBook[2];
        books[0] = new ExtBook("Kim", "Visit Korea", "Korean Publisher ltd.");
        books[1] = new ExtBook("Suzuki", "Visit Japan", "Tokyo Publisher ltd.");
        for (ExtBook book: books){
            book.show();
        }
    }
}
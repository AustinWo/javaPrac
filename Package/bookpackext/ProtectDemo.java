// Demonstrate protected
package bookpackext;

class ExtBook extends bookpack.Book {
    private String publisher;

    public ExtBook(String a, String b, String p){
        super(a, b);
        publisher = p;
    }
}


class ProtectDemo {
    public static void main (String[] args){
    }
}
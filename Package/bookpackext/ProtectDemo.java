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

}


class ProtectDemo {
    public static void main (String[] args){
    }
}
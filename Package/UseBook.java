class UseBook {
    public static void main(String[] args){
        bookpack.Book books[] = new bookpack.Book[2]; // qualify Book with the package name: bookpack
        books[0] = new bookpack.Book("James", "Drawing ABC");
        books[1] = new bookpack.Book("Susan", "Drawing ABC version II");
        for (int i = 0; i < books.length; i++){
            books[i].show();
        }
    }
}
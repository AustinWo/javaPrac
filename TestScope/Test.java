class A {
    private int count;
}

class B {
    public static void main(String[] args){
        A obj = new A();
        A.count = 5; // error: count is private variable in A
    }
}

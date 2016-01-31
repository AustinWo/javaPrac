class A {
    // private instance variable
    private int count;
    // public instance variable
    int publicNum = 15;
}

class Test {
    public static void main(String[] args){
        A obj = new A();
        System.out.println(obj.publicNum);
        // error: count is private variable in A
        // A.count = 5; 
    }
}

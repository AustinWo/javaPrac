class A {
    void say(){
        System.out.println("class a");
    }
}

class B extends A {
    // invalid override
    // int say(){
    //     System.out.println("class b");
    //     return 1;
    // }
}

class Override {
    public static void main(String[] args){
        A a = new A();
        B b = new B();
        b.say();
    }
}
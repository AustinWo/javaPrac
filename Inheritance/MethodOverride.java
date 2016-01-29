class A {
    int val = 10;
    void getVal(){
        System.out.println(val);
    }
}

class B extends A {
    int val = 20;
    void getVal(){
        System.out.println(val);
    }
    void getOriginalVal(){
        // ???
    }
}

class MethodOverride {
    public static void main(String[] args){
        A objA = new A();
        B objB = new B();
        objA.getVal(); //
        objB.getVal();
        objB.getOriginalVal();
    }
}
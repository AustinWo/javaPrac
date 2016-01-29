class A {
    int firstProp = 10;
}

class B extends A {
    int secondProp = 20;
}

class Superclass{
    public static void main(String[] args){
        A objA = new B();
        B objB = new B();
        System.out.println(objA.secondProp); // ??
        System.out.println(objB.secondProp); // ??
    }
}


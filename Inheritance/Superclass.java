class A {
    int firstProp = 10;
    void makeNoise(){
        System.out.println("from class A");
    }
}

class B extends A {
    int secondProp = 20;
    void makeNoise(){
        System.out.println("from class B");
    }
    void makeOldNoise(){
        super.makeNoise();
    }
}

class Superclass{
    public static void main(String[] args){
        A objA = new B();
        B objB = new B();

        A objAA = new A();
        B objBB = new B();
        // System.out.println(objA.secondProp); // error
        System.out.println(objB.secondProp); // ??

        objAA.makeNoise();
        objBB.makeNoise();
        objBB.makeOldNoise();
    }
}


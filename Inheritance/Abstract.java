// if a class contains an abstract method, the class must be marked abstract
abstract class Animal {
    abstract void sayType();
}

class Bird extends Animal {
    void sayType(){
        System.out.println("I am a bird");
    }
}

abstract class Fish extends Animal {
    // if the subclass doesnt implement (override the method), the method must be mark abstract
    abstract void sayType();
}

class Salmon extends Animal {
    void sayType(){
        System.out.println("I am a salmon");
    }
}

class Abstract {
    public static void main(String[] args){
        Bird twitter = new Bird();
        Salmon nemo = new Salmon();
        twitter.sayType();
        nemo.sayType();
    }
}
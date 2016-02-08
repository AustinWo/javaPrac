interface Greetings {
    public void sayHello();
    // default interface method only valid with JDK8
    default void sayBye(){
        System.out.println("default bye bye");
    }
}

class Person implements Greetings {
}

class InterfaceDemo {
    public static void main (String[] args){
}
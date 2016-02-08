interface Greetings {
    public void sayHello();
    // default interface method only valid with JDK8
    default void sayBye(){
        System.out.println("default bye bye");
    }
    default void sayByeToBeOverridden(){
        System.out.println("default bye bye to be overridden");
    }
    static void sayByeBye(){
        System.out.println("bye bye bye bye");
    }
}

class Person implements Greetings {
}

class InterfaceDemo {
    public static void main (String[] args){
}
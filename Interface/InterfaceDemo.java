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

interface Eat {
    public void eat();
}

class Person implements Greetings, Eat {
    // implemented method must be public
    public void sayHello(){
        System.out.println("hello");
    }
    // default interface method can be overridden
    public void sayByeToBeOverridden(){
        System.out.println("new bye bye");
    }
    public void eat(){
        System.out.println("I am eating");
    }
}

class InterfaceDemo {
    public static void main (String[] args){
        Person Austin = new Person();
        Austin.sayHello();
        // default interface method doesn't have to be overriden by the class implementing the interface
        Austin.sayBye();
        Austin.sayByeToBeOverridden();
        // static interface method is called with the interface name
        Greetings.sayByeBye();
    }
}
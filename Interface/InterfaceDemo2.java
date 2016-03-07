class InterfaceDemo2 {
    public static void main(String args[]){
        Student austin = new Student(5);
        austin.run();
    }
}

class Student implements Athlete {
    int speed;
    Student(int initialSpeed) {
        speed = initialSpeed;
    }
    public void run(){
        System.out.println("I am running at " + speed + " miles per hour.");
    }
}

interface Athlete {
    void run();
}
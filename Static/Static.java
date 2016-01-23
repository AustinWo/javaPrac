class Car {
    // There is one copy of static variable for all Car objects to share
    static int currentSerialNumber = 1000;
    static int numCarsOnTheMarket;
    int serialNumber;
    // Code in static block is executed before the first stance is instantiated (only once)
    // 
    static {
        System.out.println("Initializing an stance of a Car");
        numCarsOnTheMarket = 0;
    }
    Car(){
        serialNumber = currentSerialNumber++;
        numCarsOnTheMarket++;
    }
    // Static methods can be called without an instance of the class
    static void makeHonkNoise(){
        System.out.println("Honk Honk");
    }
    static int getNumCarsOnTheMarket(){
        return numCarsOnTheMarket;
    }
}
class Static{
    public static void main(String[] args){
        Car car1 = new Car();
        Car car2 = new Car();
        System.out.println(car1.serialNumber);
        System.out.println(car2.serialNumber);
        Car.makeHonkNoise();
        System.out.println("There are " + Car.getNumCarsOnTheMarket() + " cars on the market.");
    }
}
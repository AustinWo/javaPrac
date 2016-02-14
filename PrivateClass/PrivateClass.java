class Car {
    private int year; // private
    static String manufacturer;
    public int distance; // public
    String madeInCountry; // Default access: public
    Car(){
        manufacturer = "generic";
        year = 2016;
        distance = 0;
        madeInCountry = "USA";
    }
    void addDistance(int milesTravelled){
        System.out.println("Driving " + milesTravelled + " miles");
        distance += milesTravelled;
    }
    int getYear(){
        return year;
    }
    int getDistance(){
        return distance;
    }
}

class PrivateClass {
    public static void main(String[] args){
        Car myFirstCar = new Car();
        // System.out.println(myFirstCar.year); Error: cannot access private variable
        // Use method to get private variable
        System.out.println(myFirstCar.getYear());
        myFirstCar.madeInCountry = "Canada";
        System.out.println(myFirstCar.madeInCountry);
        System.out.println("========");
        System.out.println("Miles driven: " + myFirstCar.getDistance());
        myFirstCar.addDistance(500);
        System.out.println("Miles driven: " + myFirstCar.getDistance());
        System.out.println(Car.manufacturer);
    }
}

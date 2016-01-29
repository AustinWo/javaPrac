class Animal {
    int numEyes;
    int numLegs;
    String hairColor;
    Animal(){
        numEyes = 2;
    }
    Animal(Animal ob){
        numLegs = ob.numLegs;
        hairColor = ob.hairColor;
        numEyes = 2;
    }
}

class Horse extends Animal {
    Horse(){
        numLegs = 4;
        hairColor = "red";
    }
    Horse(Horse ob){
        super(ob); // causes error?
    }
}

class ShapeDemo {
    public static void main (String[] args){
        Horse pony = new Horse();
        Horse ponyCopy = new Horse(pony);
        System.out.println(pony.hairColor);
        System.out.println(ponyCopy.hairColor);
    }
}
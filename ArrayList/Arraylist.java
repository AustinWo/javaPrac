// import all of util 
// import java.util.*;

// import only ArrayList and Arrays
import java.util.ArrayList;
import java.util.Arrays;

class Arraylist {
    public static void main(String[] args){
        ArrayList<String> names = new ArrayList<String>();
        names.add("Austin");
        names.add("Steven");
        names.add("Mark");
        System.out.println(names); // [Austin, Steven, Mark]
        // get the index number of an element
        System.out.println(names.indexOf("Steven")); // 1
        // check if the ArrayList is empty
        System.out.println(names.isEmpty()); // false
        // get the size of the ArrayList
        // ** not .length like Array or .length() like String
        System.out.println(names.size()); // 3
        // .contains(element)
        System.out.println(names.contains("Ivan")); // false
        // .get(indexNumber)
        System.out.println(names.get(2)); // Mark

        System.out.println("======");
        // for loop
        for (int i = 0; i < names.size(); i++){
            System.out.println(names.get(i));
        }

        System.out.println("======");
        // enhanced for loop
        for(String name: names){
            System.out.println(name);
        }
        // convert ArrayList into an Array
        String[] namesArray = names.toArray(new String[names.size()]);
        namesArray[2] = "Blah";
        System.out.println(Arrays.toString(namesArray));
        // int index = 3;
        // String newName = "newName";
        // names.set(index, newName);
    }
}
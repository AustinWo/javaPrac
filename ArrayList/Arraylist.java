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
}
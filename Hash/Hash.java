// import hash table class
import java.util.Hashtable;

class Hash {
    public static void main(String[] args){
        // instantiate a hashtable
        Hashtable<String, Integer> numbers = new Hashtable<String, Integer>();
        numbers.put("one", 1);
        System.out.println(numbers.size()); // 1
        numbers.put("two", 2);
        System.out.println(numbers.get("one")); // 1
        System.out.println(numbers.size()); // 2
    }
}
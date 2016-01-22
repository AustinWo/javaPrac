// String methods
class Str{
    public static void main(String[] args){
        // String objects constructed using String class
        String str1 = new String("a");
        String str2 = new String("a");
        // The variables are pointing to 2 different values in memory
        System.out.println(str1 == str2); // false
        // .equals() method to compare character sequence of the strings
        System.out.println(str1.equals(str2)); // true
        // .equals() can be used to compare string literal and string object
        System.out.println("a".equals("a")); // true
        // .equals() can be used to compare 2 string literals
        System.out.println(str1.equals("a")); // true
        // Literals are compared by value
        System.out.println("a" == "a"); // true
    }
}

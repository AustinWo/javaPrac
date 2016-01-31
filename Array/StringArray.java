class StringArray {
    public static void main(String[] args){
        // an array literal of type String with 3 values
        String[] array = {"Austin", "Steven", "Jeff"};
        // an array of type String with length of 5
        String[] array2 = new String[5];
        for (int i = 0; i < array2.length; i++){
            // Cast an integer to a string using Integer.toString()
            array2[i] = "Position " + Integer.toString(i+1);
            // Cast  an integer to a string using String.valueOf()
            // array2[i] = "Position " + String.valueOf(i+1);
        }
        // loop to pring the content of the String array
        for (String content: array2){
            System.out.println(content);
        }
    }
}
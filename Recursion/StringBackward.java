class StringBackward {
    static void printBackward(String inputString){
        printBackward(inputString, inputString.length()-1);
    }
    static void printBackward(String inputString, int currentIndex){
        if (currentIndex > -1){
            String currentLetter = inputString.substring(currentIndex, currentIndex+1);
            System.out.println(currentLetter);
            printBackward(inputString, currentIndex-1);
        }
    }
    public static void main(String[] args){
        StringBackward.printBackward("Austin");
    }
}
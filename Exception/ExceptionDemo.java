class ExceptionDemo {
    public static void main (String[] args){
        System.out.println("before try");
        try {
            int[] nums = new int[5];
            nums[6] = 7; // as soon as an error is thrown in the try block, control flow is transfer to catch block
            System.out.println("this line won't be executed");
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Oops something went wrong");
        }
        System.out.println("resume flow");
    }
}
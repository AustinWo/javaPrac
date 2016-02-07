class ExceptionDemo {
    public static void main (String[] args){
        System.out.println("before try");
        try {
            int[] nums = new int[5];
            nums[6] = 7;
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Oops something went wrong");
        }
        System.out.println("resume flow");
    }
}
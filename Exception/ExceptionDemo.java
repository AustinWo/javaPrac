class ExceptionDemo {
    public static void main (String[] args){
        System.out.println("before try");
        int[] numerator = {50, 40, 30, 20, 10};
        int[] denominator = {0, 2, 0 , 4, 0};
        for (int i = 0; i < numerator.length+1; i++){
            try {
                System.out.println(Integer.toString(numerator[i]/denominator[i]));
            // can use one try block with multiple catch blocks
            } catch (ArrayIndexOutOfBoundsException exception) {
                System.out.println("Oops that element doesn't exist");
            } catch (ArithmeticException exception) {
                System.out.println("cannot divide by 0");
            // superclass must be caught last, otherwise nonreachable code error
            } catch (Throwable exeption) {
                System.out.println("error: unreachable code");
            }
        }
        System.out.println("resume flow");
    }
}
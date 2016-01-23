// fibonacci: 0, 1, 1, 2, 3, 5, 8 ......
class Fibonacci {
    // static method can be called without an stance of its class
    static int nthFib (int n) {
        if (n <= 1) {
            return 0;
        }
        if (n < 4) {
            return 1;
        }
        return nthFib(n-1) + nthFib(n-2);
    }
    public static void main(String[] args){
        System.out.println(nthFib(5));
    }
}

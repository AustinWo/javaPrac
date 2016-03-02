class SumArgs {
    static int sum(int ...numbers){
        int sum = 0;
        for (int i = 0; i < numbers.length; i++){
            sum+= numbers[i];
        }
        return sum;
    }
    public static void main(String[] args){
        System.out.println(SumArgs.sum(1,2,3,4,5));
        System.out.println(SumArgs.sum(-1,-2,-3,-4,-5,15));
    }
}
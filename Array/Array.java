class Array{
    public static void main(String[] args){
        String names[] = {"Austin", "Steven", "Jeff"};
        // for loop
        for (int i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }
        // enhanced for loop (foreach for loop)
        for (String name: names){
            System.out.println(name);
        }
        int myNums[] = {1,2,3,4,5};
        for (int i = 0; i < myNums.length; i++){
            myNums[i] *= 10;
        }
        for (int num: myNums){
            System.out.println(num);
        }
    }
}

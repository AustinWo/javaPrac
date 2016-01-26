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
        // log the array elements
        for (int num: myNums){
            System.out.println(num);
        }
        System.out.println("Example using enhanced for loop");
        int myNewNums[] = {1,2,3,4,5};
        // iterator in enhanced for loop: read-only
        for (int newNum: myNewNums){
            newNum *= 10;
        }
        // log the array elements
        for (int newNum: myNewNums){
            System.out.println(newNum);
        }
    }
}

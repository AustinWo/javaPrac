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
    }
}

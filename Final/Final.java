class Final {

    String name;
    // marking local variable final to prevent it from being assigned a value more than once
    final int myNum;

    Final(int constantNumToSet){
        name = "Austin";
        myNum = constantNumToSet;
    }

    public static void main(String[] args){
        Final a = new Final(5);
    }
}
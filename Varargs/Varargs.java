class Varargs {
    static void logArgs(String ...myArgs){
        for (int i = 0; i < myArgs.length; i++){
            System.out.println(myArgs[i]);
        }
    }
    public static void main(String[] args){
        Varargs.logArgs("a", "b", "c");
    }
}

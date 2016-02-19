import java.lang.StringBuffer;

class StringBufferDemo {
    public static void main(String[] args){
        StringBuffer myBuffer = new StringBuffer();
        // .append()
        myBuffer.append("My name is Austin");
        System.out.println(myBuffer);
        // .reverse()
        myBuffer.reverse();
        System.out.println(myBuffer);
    }
}
/*

Make a 2-D array which looks like:

{{1,2,3},
 {4,5,6}
}

*/

class MultidimensionalArray {
    public static void main(String[] args){

        // Loops to populate 2-D Array
        int[][] TwoDArray = new int[2][3];
        int num = 1;
        for (int col = 0; col < 2; col++){
            for (int row = 0; row < 3; row++){
                TwoDArray[col][row] = num++;
            }
        }

        // Loops to print 2-D Array content
        int[][] anotherTwoDArray = {{1,2,3,4,5}, {6,7,8,9,10}, {11,12,13,14,15}};
        for (int col = 0; col < anotherTwoDArray.length; col++){
            for (int row = 0; row < anotherTwoDArray[0].length; row++){
                System.out.println(anotherTwoDArray[col][row]);
            }
        }
        
    }
}

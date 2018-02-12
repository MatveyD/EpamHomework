package SpiralOutput;

public class SpiralPrinter {

    /**
     * Check that every row has the same size
     * @param arr array of ints
     * @return true if all rows have the same size and false otherwise
     */
    private static boolean isRectangular (int [][] arr){
        if (arr.length < 1)
            return false;
        final int COL = arr[0].length;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].length != COL)
                return false;
        }
        return true;
    }

    /**
     * Print all elements of array
     * @param arr array of ints
     */
    public static void defaultPrint(int[][] arr) {
        System.out.println("Default print: ");
        for (int i=0; i< arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }


    /**
     * Print all elements of array moving by spiral
     * @param arr array of ints
     */
    public static void print (int [][] arr) {

        if (!isRectangular(arr)) {
            System.out.println("Array is not valid.");
            return;
        }

        int rows = arr.length-1;
        int cols = arr[0].length-1;

        int curRow =0;
        int curCol =0;

        System.out.println("Spiral print: ");

        while (rows >= 0 && cols >=0 ){

            for (int i = curCol; i <= cols; i++ )
                System.out.print(arr[curRow][i]+ " ");
            curRow++;
            //rows--;

            for (int i= curRow; i <= rows; i++)
                System.out.print(arr[i][cols]+ " ");
            cols--;

            for (int i= cols; i >= curCol; i--)
                System.out.print(arr[rows][i]+ " ");
            rows--;

            for (int i= rows; i >= curRow; i--)
                System.out.print(arr[i][curCol]+ " ");
            curCol++;

        }



    }
}

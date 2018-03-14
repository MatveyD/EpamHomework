package SpiralOutput;


import static SpiralOutput.ArrayGenerator.*;
import static SpiralOutput.SpiralPrinter.print;
import static SpiralOutput.SpiralPrinter.defaultPrint;

public class Main {

    public static void main(String args[]) {
        //int [][] arr = fillArray(5);
        // int [][]arr = genMatrix();
        int[][] arr = genArray();   // generate a new array
        defaultPrint(arr); // it's just for check
        print(arr);  // it's what we wanted
    }


}

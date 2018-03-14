package SpiralOutput;

import java.util.Random;

public class ArrayGenerator {


    static Random rand = new Random();

    /**
     * Creates a new random number from min to max
     *
     * @param min the minimal int value
     * @param max the maximal int value
     */
    private static int randInt(int min, int max) {
        return min + rand.nextInt(max + 1);
    }

    /**
     * Creates and fills new 2D matrix of ints
     *
     * @param n is mumber of rows and cols
     */
    public static int[][] fillArray(int n) {
        int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = i * n + j;
            }
        }
        return arr;
    }

    /**
     * Creates and fills new matrix of ints
     * with random numbers of rows from 2 to 5
     *
     * @return 2D array
     */
    public static int[][] genMatrix() {
        return genMatrix(randInt(2, 5));
    }

    /**
     * Creates and fills new 2D array of ints
     *
     * @param n the number of rows
     * @return matrix of ints
     */
    public static int[][] genMatrix(int n) {
        return genArray(n, n, 0, 10);
    }

    /**
     * Creates and fills new matrix of ints able to set number of rows
     * and min and max random values
     *
     * @return 2D array
     */
    public static int[][] genMatrix(int n, int minValue, int maxValue) {
        return genArray(n, n, minValue, maxValue);
    }

    /**
     * Creates and fills new 2D array of ints
     * with numbers of rows and cols from 2 to 5
     *
     * @return 2D array
     */
    public static int[][] genArray() {
        return genArray(randInt(2, 5), randInt(2, 5), 0, 10);
    }

    /**
     * Creates and fills new 2D array of ints
     * but with ability to set number of rows, cols
     *
     * @return 2D array
     */
    public static int[][] genArray(int rows, int cols) {
        return genArray(rows, cols, 0, 10);
    }

    /**
     * Creates and fills new 2D array of ints able to set number of rows, cols
     * and min and max random values
     *
     * @return 2D array
     */
    public static int[][] genArray(int rows, int cols, int minValue, int maxValue) {
        int[][] arr = new int[rows][cols];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = randInt(minValue, maxValue);
            }
        }
        return arr;
    }

}

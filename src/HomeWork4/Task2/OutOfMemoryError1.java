package HomeWork4.Task2;

import java.util.ArrayList;
import java.util.List;

/**
 * [Task 1] java.lang.OutOfMemoryError: Java heap space.
 * You can use different data structures.
 * Don't tune heap size.
 */

public class OutOfMemoryError1 {
    public static void main(String[] args) {

        try {
            bigArray();
        } catch (Error e){
            System.out.println("Big array:");
            System.out.println("Error: " + e.getClass().getName() + "\nCause: " +e.getMessage() +"\n");
        }

        try {
            bigList();
        } catch (Error e){
            System.out.println("Big list:");
            System.out.println("Error: " + e.getClass().getName() + "\nCause: " +e.getMessage() + "\n");
        }


    }

    private static void bigArray (){
        while (true) {
            int array[];
            for (int i=0; i< 10_000; i++) {
                array = new int[1_000_000_000];
            }
        }
    }

    private static void bigList (){
        List<long[]> list = new ArrayList<>();
        long array [];
        while (true) {
            array = new long[10_000];
            list.add(array);
        }

    }
}

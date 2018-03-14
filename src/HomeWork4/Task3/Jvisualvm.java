package HomeWork4.Task3;

import java.util.ArrayList;
import java.util.List;


/**
 * Home task 3.
 *
 * jvisualvm
 */
public class Jvisualvm {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();

        int objectCounter = 0; // counter of objects eligible tp GC

        while (true) {
            list.add(new Object());
            objectCounter++;
            if (objectCounter % 1_000_000 == 0) {
                System.gc();
            }

        }

    }
}

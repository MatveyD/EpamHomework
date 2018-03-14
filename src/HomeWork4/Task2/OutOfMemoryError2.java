package HomeWork4.Task2;


import java.math.BigInteger;
import java.util.Random;

/**
 * [Task 2] java.lang.OutOfMemoryError: Java heap space.
 * Create big objects continuously and make them stay in memory.
 * Do not use arrays or collections.
 */

public class OutOfMemoryError2 {
    public static void main(String[] args) {


        /**
         *  First way to catch error
         */
        try {
            bigLinkedList();
        } catch (Error e) {
            System.out.println("Big Linked List:\n" +
                    "Error: " + e.getClass().getName() + "\nCause: " + e.getMessage() + "\n");
        }

        /**
         *  Second way to catch error
         */
        try {
            modifiedFinaluze();
        } catch (Error e) {
            System.out.println("Memory leak:\n" +
                    "Error: " + e.getClass().getName() + "\nCause: " + e.getMessage() + "\n");
        }
    }

    private static class Element {
        BigInteger bigInteger = new BigInteger(100_000_000, new Random());
        private Element next;

    }

    private final static Element start = new Element();

    private static void bigLinkedList() {
        Element current = start;

        long i = 1L;

        while (true) {
            i++;
            current.next = new Element();
            current = current.next;

            if (i / 1_000_000_000 == 0)
                System.out.println(i);
        }
    }

    private static void modifiedFinaluze() {
        while (true) {
            new leakMemory();
        }
    }

    private static class Safe {
        public static Object vault;
    }

    private static class leakMemory {
        BigInteger bigInteger = new BigInteger(10_000_000, new Random()) {
            @Override
            protected void finalize() {
                System.out.println(this.toString() + "\n saved");
                Safe.vault = this;
            }
        };

    }
}

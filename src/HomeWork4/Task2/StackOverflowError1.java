package HomeWork4.Task2;

/**
 * [Task 4]
 * Java.Lang.StackOverflowError:
 * Recursion methods.
 */

public class StackOverflowError1 {
    public static void main(String[] args) {
        try {
            recursion();
        } catch (Error | Exception e) {
            if (e instanceof StackOverflowError) {
                StackOverflowError sof = (StackOverflowError) e;
                System.out.println("Error: " + sof.getClass().getName() +
                        "\nCause: " + sof.getStackTrace()[0] + "\n");
            } else {
                e.getClass().getSimpleName();
                e.printStackTrace();
            }
        }
    }

    public static void recursion() {
        recursion();
    }
}

package HomeWork4.Task2;

/**
 * [Task 5]
 * Java.Lang.StackOverflowError:
 * Do not use recursion methods.
 */

public class StackOverflowError2 {
    public static void main(String[] args) {

        try {
            throwStackOverflowException();
        } catch (Exception | Error e) {
            System.out.println("Catch: " + e.getClass().getSimpleName()
                    + "\nCause: " + e.getStackTrace()[0]);
        } finally {
            System.out.println();
        }
        // Two methods try to use each others
        try {
            a();
        } catch (Error | Exception e) {
            if (e instanceof StackOverflowError) {
                StackOverflowError sof = (StackOverflowError) e;
                System.out.println("Catch: " + sof.getClass().getSimpleName() +
                        "\nCause: " + sof.getStackTrace()[0] + "\n");
            }
        }

    }

    private static void a() {
        b();
    }

    private static void b() {
        a();
    }

    private static void throwStackOverflowException() {
        throw new StackOverflowError();
    }
}

package Rectangle;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

import static Rectangle.Rectangle.area;

public class Main {

    private static double parseDouble(String in) {
        NumberFormat nf = NumberFormat.getInstance(Locale.getDefault());
        double value;
        try {
            value = nf.parse(in).doubleValue();
        } catch (Exception e) {
            value = 0;
        }
        return value;
    }

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("A( ? , ? ): ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.println("B( ? , ? ): ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();


        System.out.println("A( " + x1 + " : " + y1 + " ) \nB( " + x2 + " : " + y2 + " )    \nFigure area: " + area(x1, y1, x2, y2));
    }

}

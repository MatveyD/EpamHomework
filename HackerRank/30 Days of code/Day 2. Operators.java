
https://www.hackerrank.com/challenges/30-operators/problem

import java.util.*;
import java.math.*;

public class Arithmetic {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();
        double tip = mealCost *(double)tipPercent /100.0;
        double tax = mealCost *(double)taxPercent /100.0;
        //double total = tax + tip + mealCost;
        // Write your calculation code here.
        //double tiptax = 12/100*tipPercent + 12/100*taxPercent;
        // cast the result of the rounding operation to an int and save it as totalCost
        int totalCost = (int) Math.round(mealCost + tip+tax);

        System.out.println("The total meal cost is " + totalCost + " dollars.");
        // Print your result
    }
}
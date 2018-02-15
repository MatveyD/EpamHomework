

https://www.hackerrank.com/challenges/30-nested-logic/problem

import java.io.*;
import java.util.*;

public class Solution {

    private static int fine (int actualDay, int actualMonth, int actualYear, int expectedDay, int expectedMonth, int expectedYear){
        int fine = 0;
        if (actualYear > expectedYear) {
            fine = 10000;
        } else if (actualYear == expectedYear) {
            if (actualMonth > expectedMonth) {
                fine = 500 * (actualMonth - expectedMonth);
            } else if (actualMonth == expectedMonth && actualDay > expectedDay) {
                fine = 15 * (actualDay - expectedDay);
            }
        }
        return fine;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int actualDay = sc.nextInt();
        int actualMonth = sc.nextInt();
        int actualYear = sc.nextInt();
        int expectedDay = sc.nextInt();
        int expectedMonth = sc.nextInt();
        int expectedYear = sc.nextInt();

        System.out.println(fine(actualDay, actualMonth, actualYear, expectedDay, expectedMonth, expectedYear));
    }
}
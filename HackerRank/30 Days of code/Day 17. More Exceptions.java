

https://www.hackerrank.com/challenges/30-more-exceptions/problem


import java.util.*;
import java.io.*;

class Calculator {

    public static int power (int n,int p) throws IllegalArgumentException {
        if (n < 0 || p < 0 ) throw new IllegalArgumentException("n and p should be non-negative");

        if (p==0) return 1;
        if (n <= 1) return n;
        int pow = n;
        for (int i = p-1; i > 0; i--)
            pow = pow * n;
        return pow;
    }

}

class Solution{

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {

            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}
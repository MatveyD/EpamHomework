
https://www.hackerrank.com/challenges/30-running-time-and-complexity/problem


import java.io.*;
import java.util.*;


public class Solution {

    public static boolean printPrime(int n){
        if (n <= 1)
            return false;

        for(int i=2; i<= Math.sqrt(n); i++)
            if(n % i == 0)
                return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int i = 0; i < number; i++) {
            int n = scanner.nextInt();
            if (printPrime(n))
                System.out.println("Prime");
            else
                System.out.println("Not prime");
        }
    }
}

https://www.hackerrank.com/challenges/30-bitwise-and/problem


import java.io.*;
import java.util.*;

public class Solution {

    public static int maxAandB (int n, int k){
        int max =0;

        for (int i = 1; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                int bAnd = i & j;
                if (bAnd < k && max < bAnd)
                    max = bAnd;
            }
        }

        return max;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int c = scan.nextInt();

        for (int i = 0; i < c; i++) {
            int n = scan.nextInt();
            int k = scan.nextInt();

            System.out.println(maxAandB(n, k));
        }
    }
}
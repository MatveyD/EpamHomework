
https://www.hackerrank.com/challenges/30-binary-numbers/problem

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int curr =0, max = 0;
        for ( int i = 0; n>0; n/=2,  i++){

            if (n % 2 == 1){
                curr++;
            }
            else {
                max = Math.max(max,curr);
                curr =0;
            }

        }
        max = Math.max(max,curr);
        System.out.println(max);
    }
}
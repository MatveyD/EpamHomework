

https://www.hackerrank.com/challenges/30-review-loop/problem

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        // System.out.println(n);
        in.nextLine();
        while (in.hasNextLine()){
            String s1 ="";
            String s2 ="";
            String s = in.next();
            for (int i=0; i< s.length(); i++){
                if (i%2 ==0)
                    s1 += s.charAt(i);
                else
                    s2 += s.charAt(i);
            }
            System.out.println( s1 + " " + s2 );

        }

    }
}
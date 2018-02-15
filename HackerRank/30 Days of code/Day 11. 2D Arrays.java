

https://www.hackerrank.com/challenges/30-2d-arrays/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    private static Integer hourglass (int arr[][],  int n, int m){
        int sum = 0;
        for (int i=n; i <= n+2; i=i+2)
            for (int j=m; j <= m+2; j++)
                sum += arr[i][j];
        return sum + arr[n+1][m+1];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }

        int max = hourglass(arr,0,0);
        for (int i=0; i <= 3; i++)
            for (int j=0; j <= 3; j++){
                max = Math.max(max,hourglass(arr,i,j));
                //System.out.println(hourglass(arr,i,j));

            }
        System.out.println(max);
    }
}
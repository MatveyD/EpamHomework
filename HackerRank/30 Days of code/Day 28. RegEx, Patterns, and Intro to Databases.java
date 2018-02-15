

https://www.hackerrank.com/challenges/30-regex-patterns/problem


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        String emailRegEx = ".+@gmail\\.com$";
        Pattern pattern = Pattern.compile(emailRegEx);

        ArrayList <String> datalist = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String name = scan.next();
            String email = scan.next();
            Matcher matcher = pattern.matcher(email);

            if (matcher.find()) datalist.add(name);
        }

        Collections.sort(datalist);

        datalist.forEach(System.out::println);
    }
}
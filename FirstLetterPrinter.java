import java.io.*;

import java.lang.*;

import java.util.Scanner;

class FirstLetterPrinter {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String input = in.nextLine();

        System.out.println(firstLetterPrinter(input));

    }

    static String firstLetterPrinter(String str) {

        // write your code here

        String res = str.charAt(0) + "";

        for (int i = 1; i < str.length(); i++) {

            if (str.charAt(i - 1) == ' ')

                res = res + str.charAt(i);

        }

        return res;

    }

}
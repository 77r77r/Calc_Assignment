package com.iwon;

import java.util.Arrays;

public class Calc {
    public static int run(String args) {
        if (args.length() == 0) return 0;

        String[] arr = args.split(" ");
        System.out.println(Arrays.toString(arr) + ":" + arr.length);

        String num1 = arr[0];
        String symbol = arr[1];
        String num2 = arr[2];
        String result = operation(num1, symbol, num2);

        if (arr.length == 5) {
            num1 = result;
            symbol = arr[3];
            num2 = arr[4];
            result = operation(num1, symbol, num2);

            return Integer.parseInt(result);
        }
        else if (arr.length == 7) {
            num1 = result;
            symbol = arr[3];
            num2 = arr[4];
            result = operation(num1, symbol, num2);

            num1 = result;
            symbol = arr[5];
            num2 = arr[6];
            result = operation(num1, symbol, num2);

            return Integer.parseInt(result);
        }

        return Integer.parseInt(result);
    }

    private static String operation(String num1, String symbol, String num2) {
        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);

        switch(symbol) {
            case "+" :
                return String.valueOf(n1 + n2);
            case "-" :
                return String.valueOf(n1 - n2);
        }

        return "0";
    }

    private static int add(String num1, String num2) {
        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);

        return n1 + n2;
    }

    private static int minus(String num1, String num2) {
        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);

        return n1 - n2;
    }
}

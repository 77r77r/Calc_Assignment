package com.iwon;

import java.util.Arrays;

public class Calc {
    public static int run(String args) {
        String[] arr = args.split(" ");
        System.out.println(Arrays.toString(arr));
        String num1 = arr[0];
        String symbol = arr[1];
        String num2 = arr[2];

        if (arr.length > 3) {
            String pre = String.join(" ", num1, symbol, num2);
            num1 = Integer.toString(run(pre));
            symbol = arr[3];
            num2 = arr[4];
            String n = String.join(" ", num1, symbol, num2);
            return run(n);
        }

        switch(arr[1]) {
            case "+" :
                return Integer.parseInt(num1) + Integer.parseInt(num2);
            case "-" :
                return Integer.parseInt(num1) - Integer.parseInt(num2);
        }

        return 0;
    }
}

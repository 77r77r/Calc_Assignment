package com.iwon;

public class Calc {
    public static int run(String args) {
        String[] arr = args.split(" ");

        switch(arr[1]) {
            case "+" :
                return Integer.parseInt(arr[0]) + java.lang.Integer.parseInt(arr[2]);
            case "-" :
                return Integer.parseInt(arr[0]) - java.lang.Integer.parseInt(arr[2]);
        }

        return 0;
    }
}

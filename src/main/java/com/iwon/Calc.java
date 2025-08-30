package com.iwon;

import java.util.Arrays;

public class Calc {
    public static int run(String args) {
        String[] arr = args.replace(" ", "")
                .split("\\+");
        return Integer.parseInt(arr[0]) + java.lang.Integer.parseInt(arr[1]);
    }
}

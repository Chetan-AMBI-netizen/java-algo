package com.chetan;

import java.util.Arrays;

public class project {
    public static void main(String[] args) {
        int [] arr = {11,12,13,14,15};
        change(arr);
        System.out.println(Arrays.toString(arr));



    }
    static void change (int[] num){
        num[0] = 34;
        num[1] = 24;
        num[2] = 14;
        num[3] = 4;




    }
}
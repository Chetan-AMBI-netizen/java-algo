package com.chetan;

import java.util.Scanner;

public class CtoFconvert {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the temp in C:");

        int tempc = in.nextInt();
        int tempF = (tempc * 9/5) + 32 ;

        System.out.println(tempF);



    }
}

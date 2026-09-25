package com.chetan;

import java.util.Scanner;

public class largenumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a,b,c:-");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int max = 0;
        if(b>max){
            max = b;

        }
         if(c>max) {
             max =c;

         }
         System.out.println( "the largest number is:-" + max);

    }
}


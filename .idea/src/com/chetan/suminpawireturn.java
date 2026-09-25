package com.chetan;

import java.util.Scanner;

public class suminpawireturn {
     public static void main() {
          int x,y;

         Scanner in = new Scanner (System.in);
         System.out.println("enter a A value:");
          x =  in.nextInt();
         System.out.println("enter a B value:");
         y = in.nextInt();
         int result = sum(x,y);
         System.out.println("the sum of a and b is:" + result);





    }
    static int sum( int a, int b){
         int sum = a + b;
         return sum ;


    }

}

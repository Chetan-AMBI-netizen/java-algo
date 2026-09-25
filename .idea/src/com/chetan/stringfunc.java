package com.chetan;

import java.util.Scanner;

public class stringfunc {
     public static void main() {
         Scanner in =new Scanner(System.in);
         System.out.println("enter the name :");

         String naam = in.nextLine();

         mygreet(naam);

         System.out.println(naam);


    }

    static String mygreet( String name) {
        String msg = " hi "  + name;

        return msg ;
    }

}

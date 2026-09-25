package com.chetan;

public class scope {
    public static void main(String[] args) {
        //System.out.println(x); //we can't execute x over in this because we have decalered the x value in function so we cannot//
        {
            int a = 100;
            System.out.println(a); //we can accese the 'a' value in here only we cant acces in outside this block//

        }
        //System.out.println(a); // we cant execute the 'a' value in this block or outside the block because we decalred  'a' in block we have to exeecute onlt in that block//




    }
    static void funscope(){
        int x = 10;
        System.out.println(x); // function scope//


    }
}
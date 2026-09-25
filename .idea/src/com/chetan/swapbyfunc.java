package com.chetan;

public class swapbyfunc {
    public  static void main( String[] args) {
         int x = 10;
        int y =20;
        swap(x,y);
        System.out.println(x  + " " + y);

        String name = "CHETAN AMBI";
        changename(name);
        System.out.println(name);




    }

    static String changename(String name ) {
        name = "Chetan ambiger";
        return name;


    }

    static  void swap(int a, int b){
        int temp = a;
        a=b;
        b = temp;


    }
}

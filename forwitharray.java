import java.util.Scanner;

public class forwitharray {
    public static void main(String[] args) {

        //
        Scanner in = new Scanner(System.in);

        int [] arr = new int [8];
        arr[0] = 111111;
        arr[1] = 11111;
        arr[2] = 1111;
        arr[3] = 111;
        arr[4] = 11;
        arr[5] = 1;

        //with input array  anf for-each block
        for(int i=0; i<arr.length; i++){
            arr[i] = in.nextInt();

        }


        for(int j: arr){
            System.out.print(j + " ");


        }








    }
}
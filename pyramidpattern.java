import java.util.Scanner;

public class pyramidpattern {
    public  static void main( String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("enter the n value:");
        int n = in.nextInt();
        for(int rows = 1;  rows<=n; rows++){
            for(int j = 1; j<=n-rows; j++){
                System.out.print(" ");

            }
            for(int k=1; k<=2*rows-1; k++){
                System.out.print("*");

            }
            System.out.println();
        }

    }
}
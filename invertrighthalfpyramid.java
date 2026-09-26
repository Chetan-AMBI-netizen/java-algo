import java.util.Scanner;

public class invertrighthalfpyramid {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        System.out.println(" enter the a value:");
        int n = in.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i-1; j++){

                System.out.print(" ");
            }
            for(int k =1; k<=n-i +1; k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
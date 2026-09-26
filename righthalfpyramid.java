import java.util.Scanner;

public class righthalfpyramid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the n value:");
        int n = in.nextInt();

        for(int i=1; i<=n; i++){ //rows//

            for(int j =1; j<=i-n; j++){
                System.out.print(" "); //space print//
            }
            for(int k =1; k<=i; k++){
                System.out.print("*"); //star printed//
            }
            System.out.println();
        }

    }
}
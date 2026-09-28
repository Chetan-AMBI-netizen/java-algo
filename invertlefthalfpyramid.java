import java.util.Scanner;

public class invertlefthalfpyramid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the  number values:");
        int n = in.nextInt();
        for (int i = 1; i <=n; i++) {
            for(int j=1; j<=i-n; j++){
                System.out.print("");

            }
            for(int k=1; k<=2* (n-i)+1; k++){
                System.out.print("*");

            }
            System.out.println();
        }
    }

    public static class invertedpyramid {
        public static void main(String[] args) {
            Scanner in  = new Scanner(System.in);
            System.out.println("enter the n value:");
            int n = in.nextInt();
            for(int rows = 1 ; rows<=n; rows++){
                for(int j = 1; j<= rows-1; j++){
                    System.out.print(" ");

                }
                for(int k = 1; k<=2*(n-rows)+1; k++){
                    System.out.print("*");

                }
                System.out.println();
            }

        }
    }
}

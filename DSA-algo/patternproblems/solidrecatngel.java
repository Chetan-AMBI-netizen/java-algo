package patternproblems;

import java.util.Scanner;

public class solidrecatngel {
    public static void main(String[] args) {
            Scanner in = new Scanner (System.in);
            System.out.println("enter the n value:");
           

            int n = in.nextInt();
             System.out.println("enter the  N value:");
            int N = in.nextInt();
            for(int i= 0; i<n; i++){
                for(int j=0; j<N;j++){
                    System.out.print(".");

                }
                System.out.println();

            }

    }
    
}

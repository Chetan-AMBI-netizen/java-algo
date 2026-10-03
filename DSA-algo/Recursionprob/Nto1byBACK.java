import java.util.Scanner;
public class Nto1byBACK {
    static void  fun (int i, int n){
        if(i<1){
            return ;
        }
        System.out.println(i);
         fun(i-1, n);
         

    }
    public static void main(String[] args){
        int n;
        Scanner in = new Scanner (System.in);
        n = in.nextInt();
        fun(n, n);



    }

    
}

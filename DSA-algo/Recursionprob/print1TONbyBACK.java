import java.util.Scanner;
public class print1TONbyBACK {
    static void  fun (int i, int n){
        if(i<1){
            return ;
        }
         fun(i-1, n);
        
              
           
        
        
         System.out.println(i);
        
        


    }
    public static void main(String[] args){
        int n;
        Scanner in = new Scanner (System.in);
        n = in.nextInt();
        fun(n, n);



    }

    
}

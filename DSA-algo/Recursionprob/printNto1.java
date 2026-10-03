import java.util.Scanner;
class printnto1{
    public static int fun (int i, int n){
        if(i<1){
            return 1;

        }
        else{
            System.out.println(i);
        }
        return fun(i-1, n);

    }
    public static void main(String[] args){
        int n;
        Scanner in = new Scanner (System.in);
        n = in.nextInt();
        fun(n,n);



    }
}
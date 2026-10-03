import java.util.Scanner;
class priname{
    public  static  int fun( int i, int n){
        if(i>n){

        return 1;
    
        }

        else{
           System.out.println("chetan");
        }
        
        
        
        return  fun(i+1,n);  
    
        
        
    };

    public static void main(String[] args){
        int n;
        
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        
        fun(1,n);

    }
    

    
}

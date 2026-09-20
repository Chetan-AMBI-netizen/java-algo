public class Loops {
public static void main(String[] args) {
    int i=0;
    while(i<10){

        System.out.println("hi " + i);
        int j=0;
        while(j<4){
            System.out.println("good" + j);
            j++;
        }

        i++;
    
        System.out.println("bye" + j);
    }
    System.out.println("good bye" + i);
}
    
    
}

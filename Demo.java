public class Demo {
    public static void main(String[] args){
        /*conditional statements//
        int a = 100;
        if(a>99)
            System.out.println("correct");
        else if(a==100)
            System.out.println("might be");
        else
            System.out.println("wrong");
        
        //relation and logic operators//
        int x = 8;
        int y = 12;
        float c = 9.8f;
        String name = "Chetan";
    

        System.out.println("full name is:-" +name   + "Ambiger" );
       // System.out.println(result);
        //ternary operator//

        int result =0;
        result = y>=x ? 10 : 20;
        System.out.println(result);
        
      int ornum = 1;
      switch(ornum)
      {
        case 1 : yield :
            System.out.println("Idli is orderd");  
            break;
        case 2 : yield :
             System.out.println(" single dosa is orderd");
             break;
        case 3 : yield : 
             System.out.println(" single puri  is orderd");
             break;
        case 4 : yield :
             System.out.println(" masala dosa   is orderd");
             break;
        case 5 : yield :
              System.out.println(" rave dosa is orderd");
              break;
         case 6,7 : yield :
             System.out.println(" cofee  is orderd");
             break;



        default  :
         System.out.println("single tea");
      }
         */
        String Day = "friday"; //alaram setting program//
        String result = " ";

         switch(Day){
                case "saturday", "sunday" -> result =  "10am" ;
                    
                case "monday", "friday" ->  result = "at 6am";   
        
                default ->  result = "at 7am";

    
};
System.out.println(result);
}
}

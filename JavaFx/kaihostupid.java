 import java.util.Random;
   
   public class kaihostupid {
     public static void main ( String[] args ) {
       Random random = new Random();
       

       String[] subjects = { "playing tannis","checking mail","eating burger"};
       String[] places = {"playing dart","eating sushi","looking bird"  };
       String[] done = {"playing football","eating sea food","buying iphone12"  };
       

       String story = "";
       int num = random.nextInt(3);
       story = story + subjects[ num ];	
       
       num = random.nextInt(3);
       story = story + places[ num ];		
       
       num = random.nextInt(3);
       story = story + done[ num ];	
       
       System.out.println( story );
     }
   }
   

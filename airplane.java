import java.util.Scanner;
import assignment2.Airplane;

public class Assignment2
{
  public static void main(String[] args)
  {
    
    Airplane first = new Airplane();
    Airplane second = new Airplane("AAA02", 15.8, 128, 30000);
    Scanner scan = new Scanner(System.in);
     
     //      Gets details
      System.out.println("Enter the details of the third airplane (call-sign, distance, bearing and altitude):");
      String call = scan.nextLine();
      double dist = scan.nextDouble();
      int bear = scan.nextInt();
      int alt = scan.nextInt();
      
      System.out.println("\n" + "Initial Positions:");
      
      Airplane third = new Airplane(call.toUpperCase(), dist, bear, alt);
      
      System.out.println("\"Airplane 1\": "+first);
      System.out.println("\"Airplane 2\": "+second);
      System.out.println("\"Airplane 3\": "+third);
      
      //distance
      double dist1 = first.distTo(second);
      double dist2 = first.distTo(third);
      double dist3 = second.distTo(third);
      System.out.println("\nInitial Distances:");
      System.out.println("The distance between Airplane 1 and Airplane 2 is " + dist1 + " miles.");
      System.out.println("The distance between Airplane 1 and Airplane 3 is " + dist2 + " miles.");
      System.out.println("The distance between Airplane 2 and Airplane 3 is " + dist3 + " miles.");
      
      // height diff
      System.out.println("\nInitial Height Differences:");
      
      int alt1 = first.getAlt();
      int alt2 = second.getAlt();
      int alt3 = third.getAlt();
      
      int alt12 = Math.abs(alt1-alt2);
      int alt13 = Math.abs(alt1-alt3);
      int alt23 = Math.abs(alt2-alt3);
      System.out.println("The difference in height between Airplane 1 and Airplane 2 is " + alt12 + " feet.");
      System.out.println("The difference in height between Airplane 1 and Airplane 3 is " + alt13 + " feet.");
      System.out.println("The difference in height between Airplane 2 and Airplane 3 is " + alt23 + " feet.");
      
      System.out.println("\nNew Positions:");
      
     // System.out.println("\"Airplane 1\": " + );
     
     //  first airplane
      first.gainAlt();
      first.gainAlt();
      first.gainAlt();
      
      // second airplane
      second.loseAlt();
      second.loseAlt();
      
      //third airplane
      third.loseAlt();
      third.loseAlt();
      third.loseAlt();
      third.loseAlt();
      
      
     first.move(dist3,65);
     second.move(8.0,135);
     third.move(5.0,55);
     
     System.out.println("\"Airplane 1\": "+first);
     System.out.println("\"Airplane 2\": "+second);
     System.out.println("\"Airplane 3\": "+third);
     
     
     //new dist
     System.out.println("\nNew Distances:");
     
     System.out.println("The distance between Airplane 1 and Airplane 2 is " + first.distTo(second) + " miles.");
     System.out.println("The distance between Airplane 1 and Airplane 3 is " + first.distTo(third) + " miles.");
     System.out.println("The distance between Airplane 2 and Airplane 3 is " + second.distTo(third) + " miles.");
     
     
     //new height
     System.out.println("\nNew Height Differences:");
     alt1 = first.getAlt();
     alt2 = second.getAlt();
     alt3 = third.getAlt();
     System.out.println("The difference in height between Airplane 1 and Airplane 2 is " + Math.abs(alt1-alt2) + " feet.");
     System.out.println("The difference in height between Airplane 1 and Airplane 3 is " + Math.abs(alt1-alt3) + " feet.");
     System.out.println("The difference in height between Airplane 2 and Airplane 3 is " + Math.abs(alt2-alt3) + " feet.");
      
      
  }
}


//     AP CSA Project :sob:
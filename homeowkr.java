import java.util.Scanner;

class Assignment1 
{
  public static void main(String[] args) 
  {
    
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the course name.");
    String course = scan.nextLine();

    System.out.println("Please enter the average time spent in a week for this course in minutes.");
    int time = scan.nextInt();
    int hours = time / 60;  //Divides minutes by 60 seconds
    int minutes = time % 60;   //Finds the remainder of the minutes


    System.out.println("Please enter the homework grades for this course.");
    int hw1 = scan.nextInt();
    int hw2 = scan.nextInt();
    int hw3 = scan.nextInt();
    int hw4 = scan.nextInt();
    double homework = (double) (hw1 + hw2 + hw3 + hw4) / 4;

    System.out.println("Please enter the quiz grades for this course");
    double quiz1 = scan.nextDouble();
    double quiz2 = scan.nextDouble();
    double quiz = (quiz1 + quiz2) / 2;

    System.out.println("Please enter the final exam grade for this course.");
    double exam = scan.nextDouble();

    System.out.println("Course name: " + course);

    System.out.println("Weekly time spent: " + hours + "h" + minutes);

    System.out.println("Average homework grade: " + homework);

    System.out.println("Average quiz grade: " + quiz);

    System.out.println("Final exam grade: " + exam);

    int hwrounded = (int) homework;
    int quizrounded = (int) quiz;
    int examrounded = (int) exam;
    
    System.out.println("Overall grade: " + (hwrounded + quizrounded + examrounded) / 3);


    
  }
}

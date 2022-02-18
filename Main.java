import java.util.Scanner;
 
public class Main {
 public static void main(String[] args){
   Scanner scan = new Scanner(System.in);
   System.out.print("Enter student name: ");
   String studentName = scan.nextLine();
   System.out.print("Enter first test grade: ");
   int firstGrade = scan.nextInt();
   System.out.print("Enter second test grade: ");
   int secondGrade = scan.nextInt();
   System.out.print("Enter third test grade: ");
   int thirdGrade = scan.nextInt();
   System.out.println(studentName + " average grade is " + (firstGrade + secondGrade + thirdGrade / 3));
  
  
 }
}

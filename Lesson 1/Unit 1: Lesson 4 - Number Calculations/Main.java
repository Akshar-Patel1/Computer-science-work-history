/* Assignment 1 - Movie Ratings */
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("What is x? ");
    int x = scan.nextInt();
    scan.close();
    System.out.println("Answer is: x = " + ((x * x) - (4 * x) + 10));
  }
}
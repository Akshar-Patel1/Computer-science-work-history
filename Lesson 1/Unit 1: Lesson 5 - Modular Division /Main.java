import java.util.Scanner;

public class Main { 

    public static void main(String[] args) { 
        Scanner scan = new Scanner(System.in);
        int h = 0;
        int m;
        System.out.print("How many minutes did it take you to do your chores? ");
        m = scan.nextInt();
        h = m / 60;
        m = m % 60;
        System.out.println("It took you " + h + " hours and " + m + " minutes.");

      /*
      Exit ticket:

        System.out.print("Enter the Feet: ");
        int m = scan.nextInt();
        System.out.print("Enter the Inches: ");
        int n = scan.nextInt();
        System.out.print("Enter the Feet: ");
        int x = scan.nextInt();
        System.out.print("Enter the Inches: ");
        int y = scan.nextInt();
        scan.close();
        System.out.println("Feet: " + (m + x) + " Inches: " + (n+y));
      */
      
    }
}
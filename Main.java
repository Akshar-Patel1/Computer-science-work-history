import java.util.Scanner;

public class Main { 

    public static void main(String[] args) { 
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Name: ");
        String name = scan.nextLine();
        System.out.println("Enter first grade in decimal:");
        Double gd1 = scan.nextDouble();
        System.out.println("Enter 2nd grade in decimal: ");
        Double gd2 = scan.nextDouble();
        System.out.println("Enter 3rd grade in decimal: ");
        Double gd3 = scan.nextDouble();
        System.out.println("Enter 3rd grade in decimal: ");
        Double gd4 = scan.nextDouble();
        System.out.println("Enter 3rd grade in decimal: ");
        Double gd5 = scan.nextDouble();
        scan.close();
        double avg = (gd1 + gd2 + gd3 + gd4 + gd5) / 5 + 0.5;

      
        System.out.println(name + " 's average grade is: " + (int) avg);
      
    }
}
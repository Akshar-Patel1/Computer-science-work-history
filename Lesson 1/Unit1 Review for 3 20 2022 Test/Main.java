import java.util.Scanner;

public class Main { 

    public static void main(String[] args) { 
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Feet: ");
        int feet1 = scan.nextInt();
        System.out.print("Enter the Inches: ");
        int inches1 = scan.nextInt();
        System.out.print("Enter the Feet: ");
        int feet2 = scan.nextInt();
        System.out.print("Enter the Inches: ");
        int inches2 = scan.nextInt();
        scan.close();
        int ft = (int) (feet1 + feet2) + ((inches1 + inches2) / 12);
        int inch = (int) (inches1 + inches2) % 12;
        System.out.println("Feet: " + ft + " Inches: " + inch);
    }
}
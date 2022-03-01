import java.util.Scanner;

public class Main { 

    public static void main(String[] args) { 
        Scanner scan = new Scanner(System.in);
        System.out.println("What is Celsius: ");
        Double celsius = scan.nextDouble();
        scan.close();
        double fahrenheit = (celsius * 1.8) + 32;

        System.out.println(fahrenheit);
    }
}

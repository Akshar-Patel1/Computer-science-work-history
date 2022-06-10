 // Rock paper Sicssors
import java.util.Scanner;

public class Main {
  

  public static void main (String args[]) {
    Scanner scan = new Scanner(System.in);
    System.out.println("What is your guess?\n1 - Rock\n2 - Paper\n3 - Scissors");
    int personguess = scan.nextInt();
    int computerguess = (int) (Math.random() * 3 + 1);

    //lose
    if ((personguess == 1 && computerguess == 2) || (personguess == 2 && computerguess == 3) || (personguess == 3 && computerguess == 1)) {
      System.out.println("Computer Won!");
    }

    //win
    if ((personguess == 1 && computerguess == 3) || (personguess == 2 && computerguess == 1) || (personguess == 3 && computerguess == 2)) {
      System.out.println("You Won!");
    }

    //tie
    if (personguess == computerguess) {
      System.out.println("Tie!");
    }
    }
  }
    

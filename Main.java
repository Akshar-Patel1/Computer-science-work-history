// Rock paper Sicssors
import java.util.Scanner;

public class Main {
  
  public static String playgame(String userinput, String computerinput) {
      String whowon = "hello";
      if (userinput.equals(computerinput)) {
        whowon = "Tie!";
      } else if (userinput.equals("rock") && computerinput.equals("paper") || userinput.equals("paper") && computerinput.equals("scissors") || userinput.equals("scissors") && computerinput.equals("rock")) {
        whowon = "Computer Won!";
      } else if (computerinput.equals("rock") && userinput.equals("paper") || computerinput.equals("paper") && userinput.equals("scissors") || computerinput.equals("scissors") && userinput.equals("rock")) {
          whowon = "User Won!";
      } else {
        whowon = "error";
      };
      return(whowon);
    }
  public static void main (String args[]) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Please choose either: \n\"rock\"\n\"paper\"\n\"scissors\"");
    String p = scan.nextLine().toLowerCase();
    /*while (p != "rock"|| p != "paper" || p != "scissors"){
      System.out.println("Please choose either: \n\"rock\"\n\"paper\"\n\"scissors\"");
      p = scan.nextLine().toLowerCase();
    }
    */
    double ran = Math.random();
    int answer = (int) (ran * 3) + 1;
    String computerguess;
    if (answer == 1) {
      computerguess = "rock";
    } else if (answer == 2) {
      computerguess = "paper";
    } else {
      computerguess = "scissors";
    }
    scan.close();
    
    System.out.println("User Guess: " + p + "\nComputer Guess: " + computerguess + "\n" + playgame(p, computerguess));

  }
    

}

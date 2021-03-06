
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tatad6701
 */
public class A4Q8 {

    /**
     * @aram args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int location = 1;
        boolean done = false;

        while (true) {
            System.out.println("Enter sum of dice.");
            int dice = input.nextInt();
            location = location + dice;

            // Exceeding/equal/invalid numbers
            if (location > 100) {
                System.out.println("Sorry, you exceeded 100 squares. You are now at the 80th square.");
                if (location >= 100) {
                    location = 80;
                }
            }
            if (location == 100) {
                System.out.println("Congratulations! You have won!");
                break;
            }
            if (dice < 2) {
                System.out.println("You Quit!");
                break;
            }
            if (dice >= 13) {
                System.out.println("Your input is incorrect. Please try again next turn.");
                location = location - dice;
            } else if (dice == 0) {
                System.out.println("You Quit!");
                break;
            }

            if (location == 100) {
                done = true;
            } else {
                System.out.println("You are now on square " + location + ".");

                // Encounters with snakes and ladder
                if (location == 54) {
                    location = 19;
                    System.out.println("You've been eaten by a snake! Yikes! You've descended to square 19.");
                } else if (location == 90) {
                    location = 48;
                    System.out.println("You've been eaten by a snake! Yikes! You've descended to square 48.");
                } else if (location == 99) {
                    location = 77;
                    System.out.println("You've been eaten by a snake! Yikes! You've descended to square 77.");
                }
                if (location == 9) {
                    location = 34;
                    System.out.println("You've climbed a ladder! You have landed on square 34.");
                } else if (location == 40) {
                    location = 64;
                    System.out.println("You've climbed a ladder! You have landed on square 64.");
                } else if (location == 67) {
                    location = 86;
                    System.out.println("You've climbed a ladder! You have landed on square 86.");
                }
            }
        }
    }
}

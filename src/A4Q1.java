
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tatad6701
 */
public class A4Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String name;

        // Ask the user their name
        System.out.println("Please enter your name.");
        name = input.nextLine();

        // Ouput saying Hello
        System.out.println("Hello " + name + ". How are you today?");
    }
}

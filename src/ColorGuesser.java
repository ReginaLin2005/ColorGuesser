import java.util.Scanner;

public class ColorGuesser {
    public static void main(String[] args) throws Exception {
        java.util.Scanner ColorGuesser = new Scanner(System.in);
        
        System.out.println("Guess a color.");
        String guess = ColorGuesser.nextLine();
       
        if (guess.equals("blue")) {
            System.out.println("That's right!");
        }else {
            while (!(guess.equals("blue"))) {
            System.out.println("Try again!");
            guess = ColorGuesser.nextLine();
            }
            System.out.println("You got it!");
        }

    }
}

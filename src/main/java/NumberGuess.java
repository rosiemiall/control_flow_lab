import java.util.Scanner;
public class NumberGuess {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess a number...");
        int secretNumber = 5;
        int guess = sc.nextInt();

        if (guess < secretNumber){
            System.out.println("Guess too low");
        } else if (guess > secretNumber){
            System.out.println("Guess too high");
        } else if (guess == secretNumber){
            System.out.println("Correct");
        } else {
            System.out.println("Number not recognised");
        }

    }

}

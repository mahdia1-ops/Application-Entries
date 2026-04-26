import java.util.Scanner;

public class RandomNumberGuessingGameJava {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            Boolean play = true;
            while (play == true) {
                System.out.println("What would you like to guess out of?");
                int outOf = scanner.nextInt();
                int number = (int) (Math.random() * outOf);
                System.out.println("How many guesses would you like?");
                int numberofGuesses = scanner.nextInt();
                while (numberofGuesses > 0) {
                    System.out.println("Take a guess");
                    int myguess = scanner.nextInt();
                    if (myguess == number) {
                        System.out.println("You guessed correctly!");
                        break;
                    } else if (myguess < number) {
                        System.out.println("Too low! Try again.");
                        numberofGuesses -= 1;
                    } else if (myguess > number) {
                        System.out.println("Too high! Try again.");
                        numberofGuesses -= 1;
                    } else {
                        System.out.println("No more guesses left! The correct number was " + number);
                    }
                }
            }
        }
    }

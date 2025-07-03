package saiket_Projects;


	import java.util.Random;
	import java.util.Scanner;

	public class NumberGuess {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Random random = new Random();
	        boolean playAgain = true;

	        System.out.println("🎮 Welcome to the Number Guessing Game!");

	        while (playAgain) {
	            System.out.println("\nChoose Difficulty Level:");
	            System.out.println("1. Easy (1-50, 10 attempts)");
	            System.out.println("2. Medium (1-100, 7 attempts)");
	            System.out.println("3. Hard (1-200, 5 attempts)");
	            System.out.print("Enter your choice (1-3): ");
	            int level = scanner.nextInt();

	            int maxNumber = 100;
	            int maxAttempts = 7;

	            switch (level) {
	                case 1:
	                    maxNumber = 50;
	                    maxAttempts = 10;
	                    break;
	                case 2:
	                    maxNumber = 100;
	                    maxAttempts = 7;
	                    break;
	                case 3:
	                    maxNumber = 200;
	                    maxAttempts = 5;
	                    break;
	                default:
	                    System.out.println("Invalid choice. Defaulting to Medium.");
	            }

	            int numberToGuess = random.nextInt(maxNumber) + 1;
	            int attempts = 0;
	            boolean guessed = false;

	            System.out.println("\nI have selected a number between 1 and " + maxNumber + ".");
	            System.out.println("You have " + maxAttempts + " attempts to guess it!");

	            while (attempts < maxAttempts) {
	                System.out.print("Enter your guess: ");
	                int guess = scanner.nextInt();
	                attempts++;

	                if (guess == numberToGuess) {
	                    System.out.println("🎉 Congratulations! You guessed the number in " + attempts + " attempts.");
	                    guessed = true;
	                    break;
	                } else if (guess < numberToGuess) {
	                    System.out.println("Too low!");
	                } else {
	                    System.out.println("Too high!");
	                }

	                System.out.println("Attempts left: " + (maxAttempts - attempts));
	            }

	            if (!guessed) {
	                System.out.println("😞 You've run out of attempts. The number was: " + numberToGuess);
	            }

	            System.out.print("Do you want to play again? (yes/no): ");
	            String response = scanner.next().toLowerCase();
	            playAgain = response.equals("yes");
	        }

	        System.out.println("Thanks for playing! 🎮");
	        scanner.close();
	    }
	}


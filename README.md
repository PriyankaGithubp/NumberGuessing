# NumberGuessing
#  Java Number Guessing Game (With Levels & Replay)

##  Description
This is an enhanced **console-based number guessing game** written in **Java**. The user selects a difficulty level and tries to guess a randomly generated number within a limited number of attempts. Feedback is given after each guess, and the game supports replaying without restarting the program.

---

##  Features
-  Three difficulty levels:
  - **Easy:** Number between 1–50, 10 attempts
  - **Medium:** Number between 1–100, 7 attempts
  - **Hard:** Number between 1–200, 5 attempts
-  Replay option after each game
-  Feedback on each guess: Too high / Too low
-  Tracks number of attempts left
-  Uses Random, Loops, and Conditional Statements

---

## 🛠️ Technologies Used
- Java (Core)
- `Scanner` for user input
- `Random` class for number generation
- Loops and conditional logic

---

##  How to Run

1. Save the file as `NumberGuessingGameWithLevels.java`
2. Open terminal or command prompt in the file location
3. Compile the program:
   ```bash
   javac NumberGuessingGameWithLevels.java
##Sanple output
 Welcome to the Number Guessing Game!

Choose Difficulty Level:
1. Easy (1-50, 10 attempts)
2. Medium (1-100, 7 attempts)
3. Hard (1-200, 5 attempts)
Enter your choice (1-3): 2

I have selected a number between 1 and 100.
You have 7 attempts to guess it!

Enter your guess: 50
Too high!
Attempts left: 6

Enter your guess: 25
Too low!
Attempts left: 5

Enter your guess: 38
 Congratulations! You guessed the number in 3 attempts.

Do you want to play again? (yes/no): no
Thanks for playing! 

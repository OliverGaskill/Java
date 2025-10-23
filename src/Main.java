import java.util.Random;
import java.util.Scanner;

 class Main {
     static void main(String[] args) {

         Random random = new Random();
         Scanner scanner = new Scanner(System.in);

         int guess;
         int attempts = 0;
         int min = 1;
         int max = 100;
         int randomNumber = random.nextInt(min, max + 1);

         System.out.println("Number guessing game");
         System.out.printf("Guess a number between %d-%d\n", min, max);

         do{
             System.out.print("Enter a guess: ");
             guess = scanner.nextInt();
             attempts++;
             
             if (guess < randomNumber){
                 System.out.println("TOO LOW!");
                 
             } else if (guess > randomNumber) {
                 System.out.println("TOO HIGH!");
                 
             }
             else {
                 System.out.println("CORRECT! The correct number was: " + randomNumber);
                 System.out.println("# of attempts: " + attempts);
             }
         }while (guess != randomNumber);


         scanner.close();
    }
}


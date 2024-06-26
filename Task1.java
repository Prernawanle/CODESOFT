import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        int randomNumber = rand.nextInt(50) + 1;
        int attempts = 0;
        int guess;
        
       System.out.println("WELCOME TO NUMBER GUESSING GAME...!!!");
        System.out.print("GUESS A NUMBER BETWEEN 1 AND 50: ");
    
do {
    System.out.println("ENTER YOUR GUESS");
guess = scanner.nextInt();
attempts++;

if(guess < randomNumber){
    System.out.println("SORRY!!!, BUT THE NUMBER YOU HAVE GUESSED IS TOO SMALL");
    System.out.print("GUESS AGAIN: ");
}
else if(guess > randomNumber){
    System.out.println("SORRY!!!, BUT THE NUMBER YOU HAVE GUESSED IS TOO HIGH");
    System.out.print("GUESS AGAIN: ");
}
else{
    System.out.println(" GOOD JOB!!!, YOU WON ,YOU HAVE GUESSED CORRECT NUMBER " + randomNumber);
    System.out.println("NUMBER OF ATTEMPTS: "+ attempts);
}
}
while(guess != randomNumber);
}
}


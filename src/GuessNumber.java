import static java.lang.System.out;
import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int randomNumber = new Random().nextInt(10) + 1;

        while(true) {
            out.print("Enter an Integer between 1 and 10  ");
            int inputNumber = keyboard.nextInt();


            if (inputNumber == randomNumber) {
                System.out.println("Win");
                break;
            }
            else {
                if (inputNumber < randomNumber)
                    System.out.println("Too low");
                else
                    System.out.println("Too high");
            }
        }

        System.out.println("Thank you for playing");
    }
}


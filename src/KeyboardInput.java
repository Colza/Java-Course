import java.util.Scanner;

public class KeyboardInput {
    public static void main(String[] args) {
        System.out.println("Please enter your name...");
        Scanner keyboard = new Scanner(System.in);
        String name = keyboard.next();
        System.out.println("Hello " + name);

    }
}


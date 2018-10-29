import java.util.*;

public class DiceThrow {
    public static void main(String[] args) {
        Random dice = new Random();
        int firstVal = dice.nextInt(6) +1;
        int secondVal = dice.nextInt(6) +1;
        int total = firstVal + secondVal;
        System.out.println(" You threw a " +firstVal + " and a " + secondVal + " for a total of " + total);

    }
}

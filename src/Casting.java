public class Casting {

    public static void main(String[] args) {
        int a = 0;
        double b = 1.3456455;
        String myPet = "Lola the white cat";
        a = b; //won't work - you can't put a double value in an int variable
        a = (int) b; //Works - will turn b into an int
                     //(but loses the decimal places)

        // This is called Casting - it turns one object into another
        // - if they are sufficiently compatible

        a = (int) myPet;   //won't work

        // A cast too far - what integer could accurately represent
        // my little furball?


    }
}


public class WhileLoop {
    public static void main(String[] args) {
        int counter = 1;

        while (counter < 10) {
            System.out.println ("We are at number " + counter);
            counter++; //shortcut for counter = counter +1
        }
    }
}

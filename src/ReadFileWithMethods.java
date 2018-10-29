import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.out;

    public class ReadFileWithMethods {

        static ArrayList<String> people = new ArrayList<String>();

        // main() method - program starts here
        public static void main(String[] args) throws IOException {
            loadPeople(); //call the loadpeople() method
            showPeople(); //call the showPeople() method
            writeFile(); //call the writeFile() method
            //main() method and program ends here
        }

        // method loadPeople - Reads the file - creates the ArrayList
        public static void loadPeople() throws IOException{
            Scanner diskScanner = new Scanner(new File("people.txt"));
            while (diskScanner.hasNext())
                people.add(diskScanner.nextLine());
        } //  ***end of method loadpeople()***

        // method showPeople - loops through the ArrayList
        static void showPeople() {
            for (String name : people)
                out.println(name);
        } // end of method loadpeople()

        // method writeFile - writes the ArrayList to another file
        static void writeFile() throws IOException {
            PrintStream writeFile = new PrintStream("anotherfile.txt");
            for(String name : people)
                writeFile.print(name + "\n");
            out.println("\nFile Saved");
        } // end of method writeFile

    }



import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

//Reads text file 'people.txt' so create this first

    public class ReadFile {
        public static void main(String[] args) throws IOException {
            ArrayList<String> people = new ArrayList<String>();

            Scanner diskScanner = new Scanner(new File("people.txt"));

            //load ArrayList
            while (diskScanner.hasNext()) {
                people.add(diskScanner.nextLine());
            }

            //show ArrayList
            for(String name: people)
                System.out.println(name);
        }
    }


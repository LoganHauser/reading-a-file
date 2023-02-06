import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        //Create a File object for student.txt
        File file = new File("student.txt");
        //Create a Scanner object that reads from the file
        Scanner fileScanner = new Scanner(file);
        //Loop 3 times and print a line from the file to the console
        for (int i = 0; i < 3; i++) {
            System.out.println(fileScanner.nextLine());
        }
        //Close the scanner
        fileScanner.close();
    }
}

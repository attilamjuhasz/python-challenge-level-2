// Attila Juhasz | 9/3/2026 | A program that uses regex to find letters in a given text file

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Main{


    // Precondition: Needs a string as an input which is the name of the txt file and the string needs to be defined
    // Postcondition: Prints all the letters in the txt
    public void regexFinder(String fle){
        
        File myObj = new File(fle);

        try(Scanner myReader = new Scanner(myObj)){
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                Pattern pat = Pattern.compile("[a-z]|[A-Z]");
                Matcher mat = pat.matcher(data);
                while(mat.find()) {
                    System.out.println(mat.group());
                }
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }

    public static void main(String[] args){

        Main m = new Main();
        m.regexFinder("file.txt");

    }
}
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Main{


    public void regexFinder(String fle){
        
        File myObj = new File(fle);

        try(Scanner myReader = new Scanner(myObj)){
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                Pattern pat = Pattern.compile("[a-z]");
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
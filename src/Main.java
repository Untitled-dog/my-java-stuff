import java.io.IOException; // frick the IDE required because it said so
import java.util.Scanner;  // Import the Scanner class
import java.io.File;  // Import the File class
import java.io.FileWriter;   // Import the FileWriter class
import java.io.FileNotFoundException;  // Import this class to handle errors and pees in ur as

import static java.lang.System.*;   // So I don't have to type 'system' a lot

public class Main {
    public static void loops(){
        out.println("looping");
        int x = 10;
        while(x != 0){
            out.println( String.valueOf(x) );//how string to int?
            /* https://www.educative.io/answers/how-to-convert-an-integer-to-a-string-in-java
            * use the fricking [String.valueOf()] function
            * */
            x -= 1;//this actually works?
        }
        out.println("done");
    }//pees in ur ass
    public static void inputs(){//does the user know where piss goes?
        Scanner scan = new Scanner(in);
        out.println("where does pee go");
        var peegoes = scan.nextLine();
        if( peegoes.equals("ass") ){//yippee ka yay
            out.println("indeed");
        }else{ out.println("nah, in the [ass]"); }//tell the user to correct their behavior
    }
    public static void remove_gay() {//using a function to remove the gay
        File myObj = new File("gay.txt");
        if (myObj.delete()) {
            out.println("removed the gay");
        } else {
            out.println("Failed to remove the gay.");
        }
    }
    public static void files(){
        Scanner scan = new Scanner(in);//using scanner as a sort of 'pause' function
        try {// try case
            File myObj = new File("gay.txt");
            if (myObj.createNewFile()) {
                out.println("File created: " + myObj.getName());
            } else {
                out.println("File already exists.");
            }
        } catch (IOException e) {
            out.println("An error occurred.");
            e.printStackTrace();
        }
        out.println("[gay.txt] creation process done");
        try {
            FileWriter myWriter = new FileWriter("gay.txt");
            out.println("type something in to write to the gay");
            String userinput = scan.nextLine();
            myWriter.write(userinput);
            myWriter.close();
            out.println("check gay.txt");
        } catch (IOException e) {
            out.println("An error occurred.");
            e.printStackTrace();
        }
        out.println("press enter to read the gay");
        scan.nextLine();
        /* RATIO; was lazy so didn't implement the read thing
        * instead just return user input
        * System.out.println(userinput); // nevermind java doesn't allow vars from things in try & catch
        * actually have to do it */
        try {//actually read from the gay because java doesn't let me be a lazy ass
            File myObj = new File("gay.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        out.println("press enter to remove the gay");
        scan.nextLine();
        remove_gay();//use a method to remove the gay
        System.out.println("files done");

    }
    public static void main(String[] args) {
        out.println("Foo time");
        loops();
        inputs();
        files();
        out.println("Foo time done");
    }
}
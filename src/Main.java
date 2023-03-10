import java.io.IOException; // frick the IDE required because it said so
import java.util.Scanner;  // Import the Scanner class to get user input
import java.io.File;  // Import the File class for filez
import java.io.FileWriter;   // Import the FileWriter class to write to things to said filez
import java.io.FileNotFoundException;  // Import this class to handle errors

import static java.lang.System.*;   // So I don't have to type 'system' a lot and becuse the IDE recomended i did so

public class Main {
    public static void loops(){
        out.println("looping");
        int foos = 10;//just like in python `foos = 10` but more attributes
        while(foos != 0){//just like python's while
            out.println( String.valueOf(foos) );//how string to int?
            /* https://www.educative.io/answers/how-to-convert-an-integer-to-a-string-in-java
            * use the fricking [String.valueOf()] function
            * */
            foos -= 1;//this actually works?
        }
        out.println("done");
    }
    public static void inputs(){//foo
        Scanner scan = new Scanner(in);
        out.println("foo");
        var foos = scan.nextLine();
        if( foos.equals("foo") ){//yippee ka yay
            out.println("foo");
        }else{ out.println("not foo"); }//tell the user to correct their behavior
    }
    public static void remove_file() {//using a function to remove the foo
        File myObj = new File("foo.txt");
        if (myObj.delete()) {
            out.println("removed the foo");
        } else {
            out.println("Failed to remove the foo.");
        }
    }
    public static void files(){
        Scanner scan = new Scanner(in);//using scanner as a sort of 'pause' function
        try {// try case
            File myObj = new File("foo.txt");
            if (myObj.createNewFile()) {
                out.println("File created: " + myObj.getName());
            } else {
                out.println("File already exists.");
            }
        } catch (IOException e) {
            out.println("An error occurred.");
            e.printStackTrace();
        }
        out.println("[foo.txt] creation process done");
        try {
            FileWriter myWriter = new FileWriter("foo.txt");
            out.println("type something in to write to the foo.txt");
            String userinput = scan.nextLine();
            myWriter.write(userinput);
            myWriter.close();
            out.println("check foo.txt");
        } catch (IOException e) {
            out.println("An error occurred.");
            e.printStackTrace();
        }
        out.println("press enter to read the foo");
        scan.nextLine();// like MSDos's pause function
        /* RATIO; was lazy so didn't implement the read thing
        * instead just return user input
        * System.out.println(userinput); // nevermind java doesn't allow vars from things in try & catch
        * actually have to do it
        * edit: looking back i could have use global */
        try {//actually read from the foo because java doesn't let me be a lazy ass
            File myObj = new File("foo.txt");
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
        out.println("press enter to remove the foo");
        scan.nextLine();
        remove_foo();//use a method to remove the foo
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

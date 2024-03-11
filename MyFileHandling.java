package com.company;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.util.Scanner;
import java.io.IOException;

public class MyFileHandling {
    public static void main(String[] args) {
//        Here we will create the file using file module

        try {
            File file = new File("myFirstFile.txt");
            if (file.createNewFile()){
                System.out.println("The file with the name "+ file.getName()+" has been created in the same folder");
            }else{
                System.out.println("There was some problem while creating the new file");
            }
        } catch (IOException e) {
            System.out.print("Error....");
            e.printStackTrace();
        }

//        here we have added text into the file
        try{
            FileWriter file = new FileWriter("myFirstFile.txt", true);
            file.write("Hey I have create the file and hence this is all which will be written into the newly created file here");
            file.close();
            System.out.println("Written into the file");
        }catch (Exception exception){
            System.out.print("Error.....");
            exception.printStackTrace();
        }

        try{
            File file = new File("myFirstFile.txt");
            Scanner s = new Scanner(file);
            while (s.hasNextLine()){
                String str = s.nextLine();
                System.out.println(str);
            }
            s.close();
        }catch (Exception exception){
            System.out.println("Error......" + exception.toString());
        }

    }
}

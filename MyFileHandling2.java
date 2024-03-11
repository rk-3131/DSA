package com.company;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MyFileHandling2 {
    public static void main(String[] args) {

        try{
            File file = new File("Another.txt");
            if (file.createNewFile()){
                System.out.println("File has been created successfully");
            }else{
                System.out.println("There was some error while creating the new file");
            }
        }catch (IOException exception){
//            System.out.println(exception.printStackTrace());
            exception.printStackTrace();
        }

//        Writing into the file
        try {
            FileWriter file = new FileWriter("Another.txt", true);
//            Here second parameter true  is used to tell the compiler that we have to append the new text to the file
            file.write("This will be written into another file");
            file.close();
        }catch (IOException exception){
            exception.printStackTrace();
        }

//        reading from the file
        try{
            File file = new File("Another.txt");
            Scanner s = new Scanner(file);

            while (s.hasNextLine()){
                String str = s.nextLine();
                System.out.println(str);
            }
            s.close();
        }catch (Exception exception){
            exception.printStackTrace();
        }
    }
}

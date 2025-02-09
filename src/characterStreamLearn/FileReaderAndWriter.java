package characterStreamLearn;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderAndWriter {
    public static void main(String[] args) {

        // writing to file
        try (FileWriter writer = new FileWriter("source.txt")) {
            writer.write("This is source  file");
            System.out.println("Data written successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }


        //reading file
        int i=0;
        int j=0;
//        reading using BufferedReader with buffer of 5 i.e 5 characters at a time , reduce i/o operations
        try (BufferedReader reader = new BufferedReader(new FileReader("source.txt"))) {
            int data;
            char[] ch =new char[5];
            while ( ( data= reader.read(ch)) != -1) {
                i++;
            }

            //normal file reading using FileReader, reads one char at a time
            FileReader fr = new FileReader("source.txt");
            while ( ( data= fr.read()) != -1) {
                j++;
                reader.read();
            }
            System.out.println(i);
            System.out.println(j);

            System.out.println("Data read successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

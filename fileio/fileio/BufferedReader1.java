package fileio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReader1 {

    public static void main(String[] args) {

        try {
            BufferedReader reader=new BufferedReader(new FileReader("C:\\Users\\Intec\\Documents\\test.txt"));
            System.out.println(reader.readLine());
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

package fileio;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriter2 {

    public static void main(String[] args) {

        String[] names={"John","Leen","Emy"};
        try {
            BufferedWriter writer=new BufferedWriter(new FileWriter("C:\\Users\\Intec\\Documents\\test2.txt"));
            writer.write("Writing to a file.");
            writer.write("\nHere is our file.");

            for(String name:names){
                writer.write("\n"+name);
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

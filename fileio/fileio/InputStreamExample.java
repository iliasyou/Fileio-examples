package fileio;

import java.io.*;

public class InputStreamExample {

    public static void main(String[] args) {
        String sourceFile = "C:\\Users\\Intec\\Documents\\test.txt";
        String destinationFile = "C:\\Users\\Intec\\Documents\\newtest.txt";

        try (InputStream inputStream = new FileInputStream(sourceFile);
             OutputStream outputStream = new FileOutputStream(destinationFile)) {

            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }

            System.out.println("File copied successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

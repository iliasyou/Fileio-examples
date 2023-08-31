package fileio;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileWriterExample {

    public static void main(String[] args) {

        FileWriter fileWriter = null;
        try {
            //Path is een klasse die wordt gebruikt om bestands- en maplocaties te representeren en ermee te werken.
            // De methode Path.of() wordt gebruikt om een tekenreeks (in dit geval de bestandslocatie) om te zetten naar een Path object.
            Path path = Path.of("C:\\Users\\Intec\\Documents\\test.txt");

            // De Files.createDirectories()-methode wordt gebruikt om een pad te nemen en
            // ervoor te zorgen dat alle mappen in dat pad bestaan.
            Files.createDirectories(path.getParent());

            //Deze code maakt een FileWriter-object aan met de opgegeven bestandslocatie.
            //path.toString() wordt gebruikt om de bestandslocatie als een tekenreeks te verkrijgen.
            fileWriter = new FileWriter(path.toString());
            fileWriter.write("Hi\n");
            fileWriter.write("Hallo\n");
            fileWriter.write("Bonjour\n");

        } catch (IOException ioException) {
            ioException.printStackTrace();

        } finally {
            if (fileWriter != null) {

                try {
                    fileWriter.close();

                } catch (IOException ioException) {
                    ioException.printStackTrace();

                }

            }

        }

    }

}

package File_Handling;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertyFile {

    public static void main(String[] args) {

        try (InputStream  input = new FileInputStream("./src/File_Handling/application.properties")) {

            Properties prop = new Properties();
            prop.load(input);

            System.out.println(prop.getProperty("exchange.rate.url"));

        } catch (IOException io) {
            io.printStackTrace();
        }

    }
}
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Streams01 {
    public static void main(String[] args) throws IOException {
        try (FileReader reader = new FileReader("Streams01.java");
             FileWriter writer = new FileWriter("file.out");
        ) {
            int c;
            while ((c = reader.read()) != -1) {
                writer.write(c);        
            }
        }
    }
}
